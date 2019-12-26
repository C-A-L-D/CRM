package com.sc.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.sc.entity.JhCgd;
import com.sc.entity.JhCgdxq;
import com.sc.entity.Result;
import com.sc.entity.StoreGinfo;
import com.sc.entity.XiaoshouSellinfo;
import com.sc.service.JhCgdService;
import com.sc.service.JhCgdxqService;
import com.sc.service.StoreGinfoService;
import com.sc.service.XiaoshouSellinfoService;

@Controller
@RequestMapping("/storeSinfo")
public class XiaoshouSellinfoController {
	@Autowired
	XiaoshouSellinfoService xiaoshouSellinfoService;
	
	@Autowired
	StoreGinfoService storeGinfoService;
	
	@Autowired
	JhCgdxqService jhCgdxqService;
	
	@Autowired
	JhCgdService jhCgdService;
	
	@Autowired
	HttpServletRequest request;
	
	@RequestMapping("/inSinfo.do")
	@ResponseBody
	public Result inSinfo(ModelAndView mav,Integer cgXqId,Integer cgdId,Integer cpId,Integer cpNumber,Integer cpPrice) {
		System.err.println(cgXqId);
		try{
		JhCgdxq jhCgdxq = jhCgdxqService.get(Long.valueOf(cgXqId));
		jhCgdxq.setCgdId(Long.valueOf(cgdId));
		jhCgdxq.setIsrk("已入库");
		System.err.println(jhCgdxq);
		jhCgdxqService.update(jhCgdxq);
		
		if(storeGinfoService.selectObj(BigDecimal.valueOf(cpId))==null) {
			StoreGinfo addGinfo = new StoreGinfo();
			addGinfo.setGid(BigDecimal.valueOf(cpId));
			addGinfo.setStorenum(BigDecimal.valueOf(cpNumber));
			addGinfo.setPricebuy(BigDecimal.valueOf(cpPrice));
			storeGinfoService.add(addGinfo);
			return new Result(300,"status");
		}else {
			StoreGinfo sinfo =storeGinfoService.selectObj(BigDecimal.valueOf(cpId));
			sinfo.setStorenum(sinfo.getStorenum().add(BigDecimal.valueOf(cpNumber)));
			System.err.println(sinfo);
			storeGinfoService.update(sinfo);
		}
		
		}catch (NullPointerException e1) {
			System.err.println("空指针！");
			JhCgdxq jhCgdxq = jhCgdxqService.get(Long.valueOf(cgXqId));
			jhCgdxq.setCgdId(Long.valueOf(cgdId));
			jhCgdxq.setIsrk("已入库");
			System.err.println(jhCgdxq);
			jhCgdxqService.update(jhCgdxq);
		}catch (Exception e) {
			System.err.println("入库失败！");
			return new Result(400,"status");
		}
		return new Result(200,"status");
	}
	
	@RequestMapping("/cgdxq.do")
	public ModelAndView cgdxqlistpage(ModelAndView mav, @RequestParam(defaultValue = "1") Integer pageNum,
			@RequestParam(defaultValue = "10") Integer pageSize, JhCgd jc,Long cgdId) {
		System.out.println("查询用户列表-分页！");	
		System.out.println(jc);
		// 查询list集合-分页 ${page.list}
		List<JhCgdxq> list = jhCgdxqService.getall(cgdId);
		if (list != null) {
			Long money = 0L;			
			for (JhCgdxq jhCgdxq : list) {//遍历采购单详情表
				Long cpnumber = jhCgdxq.getCpNumber();//获取产品数量
				Long cpprice = jhCgdxq.getCpPrice();//获取产品价格			
				System.out.println(cpnumber + "--------" + cpprice);
				if (cpnumber != null && cpprice != null) {
					money += cpnumber * cpprice;
				}
				jc = jhCgdService.get(cgdId);
				jc.setHkMoney(new BigDecimal(money));
				jhCgdService.update(jc);						
			}

		}
		
		if(list!=null){
			int a=0;//已入库为0,待采购为1
			for (JhCgdxq jhCgdxq : list) {
				String isrk=jhCgdxq.getIsrk();
				System.out.println(isrk+"aaaaaaaaaaaaa");
				if(isrk!=null&&!isrk.equals("")){
					if(isrk!="已入库"){
						a=1;
						break;
					}
				}
				if(a==0){
					jc = jhCgdService.get(cgdId);
					jc.setCgJz("已入库");
					jhCgdService.update(jc);
				}
			}
		}
		jc=jhCgdService.get(cgdId);
		mav.addObject("jc", jc);
		
		mav.addObject("p", jhCgdxqService.selectpage(pageNum, pageSize, jc));
		mav.setViewName("store/viewcopycgdxq");// 路径是：/WEB-INF/jh/gysxxlistpage.jsp
		return mav;
	}
	
	@RequestMapping("/cgdlistpage.do")
	public ModelAndView listpage(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum,
			@RequestParam(defaultValue="10")Integer pageSize,JhCgd jc){
		System.out.println("查询用户列表-分页！");
		
		
			
		//查询list集合-分页     ${page.list}
		mav.addObject("p", jhCgdService.selectpage(pageNum, pageSize,jc));
		
		mav.setViewName("store/listcopycgd");// 路径是：/WEB-INF/jh/gysxxlistpage.jsp
		return mav;
	}
	
	@RequestMapping("/listpageSinfo.do")
	public ModelAndView listpageSwi(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum,
			@RequestParam(defaultValue="10")Integer pageSize){
		ArrayList<BigDecimal> list=storeGinfoService.selectGid();
		PageInfo<XiaoshouSellinfo> sgilistPage = xiaoshouSellinfoService.selectPage(pageNum, pageSize);
		mav.addObject("idlist",list);
		mav.addObject("listpage",sgilistPage);
		mav.addObject("total",sgilistPage.getTotal());
		mav.setViewName("store/listSinfo");
		return mav;
	}


	@RequestMapping("/selectSinfo.do")
	public ModelAndView selectSwi(ModelAndView mav,Integer ssid) {
		System.err.println("要修改的对象(int)id："+ssid);
		BigDecimal id=BigDecimal.valueOf(ssid);
		System.err.println("要修改的对象(bigDecimal)id："+id);
		XiaoshouSellinfo info=xiaoshouSellinfoService.selectObj(id);
		if(info==null) {
			System.err.println("未查询到该对象！");
		}
		else {
		mav.addObject("selected",info);
		}
		mav.setViewName("store/updateSinfo");
		System.err.println(mav.getViewName());
		return mav;
	}
	
	
	@RequestMapping("/updateSinfo.do")
	public ModelAndView updateSinfo(ModelAndView mav,XiaoshouSellinfo xiaoshouSellinfo) {
		if(xiaoshouSellinfo.getSsid()==null||xiaoshouSellinfo==null) {
			System.err.println("该对象为空！");
		}
		
		System.err.println("接收到的新对象："+xiaoshouSellinfo);
		XiaoshouSellinfo oldXiaoshouSellinfo=xiaoshouSellinfoService.selectObj(xiaoshouSellinfo.getSsid());
		
		if(xiaoshouSellinfo.getGid()==null) {
			xiaoshouSellinfo.setGid(oldXiaoshouSellinfo.getGid());
		}
		if(xiaoshouSellinfo.getSid()==null) {
			xiaoshouSellinfo.setSid(oldXiaoshouSellinfo.getSid());
		}
		if(xiaoshouSellinfo.getCid()==null) {
			xiaoshouSellinfo.setCid(oldXiaoshouSellinfo.getCid());
		}
		if(xiaoshouSellinfo.getRemark()==null||xiaoshouSellinfo.getRemark().equals("")) {
			xiaoshouSellinfo.setRemark(oldXiaoshouSellinfo.getRemark());
		}
		if(xiaoshouSellinfo.getGprice()==null) {
			xiaoshouSellinfo.setGprice(oldXiaoshouSellinfo.getGprice());
		}
		if(xiaoshouSellinfo.getGnum()==null) {
			xiaoshouSellinfo.setGnum(oldXiaoshouSellinfo.getGnum());
		}
		
		xiaoshouSellinfo.setLasttime(new Date());
		
		System.err.println("修改"+oldXiaoshouSellinfo+"为");
		System.err.println(xiaoshouSellinfo);
		xiaoshouSellinfoService.update(xiaoshouSellinfo);
		
		mav.setViewName("redirect:/storeSinfo/listpageSinfo.do");
		return mav;
	}	
	
	//出库
	@RequestMapping("/outSinfo.do")
	@ResponseBody
	public Result outSinfo(ModelAndView mav,Integer gid,Integer sid,Integer ssid,Integer gnum) {
		HttpSession session = request.getSession();
		ArrayList<Integer> list;
		System.err.println("要出库的对象(int)id："+gid);
		
		BigDecimal id=BigDecimal.valueOf(gid);
		System.err.println("id:"+id);
		try {
			StoreGinfo storeGinfo=storeGinfoService.selectObj(id);
			if(storeGinfo.getStorenum().compareTo(BigDecimal.valueOf(gnum))==-1) {
				System.err.println("出库量"+gnum+"小于库存量"+storeGinfo.getStorenum()+"!");
				return new Result(400,"status");
			}
			storeGinfo.setStorenum(storeGinfo.getStorenum().subtract(BigDecimal.valueOf(gnum)));
			storeGinfo.setLasttime(new Date());
			storeGinfoService.update(storeGinfo);
		//	xiaoshouSellinfoService.delete(BigDecimal.valueOf(ssid));
			System.err.println("出库成功！"+storeGinfo.getStorenum());
			if(session.getAttribute("outofwh")==null||session.getAttribute("outofwh").equals("")) {
				list=new ArrayList<Integer>();
				list.add(ssid);
			}else {
				list=(ArrayList<Integer>) session.getAttribute("outofwh");
				list.add(ssid);
			}
			session.setAttribute("outofwh", list);
			return new Result(200,"status");
		}catch (NullPointerException e) {
			return new Result(500,"status");
		}
		

	}
	

}
