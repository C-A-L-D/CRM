package com.sc.controller;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sc.entity.JhCgd;
import com.sc.entity.JhCgdxq;
import com.sc.entity.JhGysxx;
import com.sc.entity.JhXbh;
import com.sc.entity.Result;
import com.sc.entity.StoreGinfo;
import com.sc.service.JhCgdService;
import com.sc.service.JhCgdxqService;
import com.sc.service.JhGysxxService;
import com.sc.service.JhXbhService;
import com.sc.service.StoreGinfoService;
@RequestMapping("/cgdctrl")
@Controller
public class JhCgdController {

	@Autowired
	JhCgdService jhCgdService;
	@Autowired
	JhCgdxqService jhCgdxqService;
	@Autowired
	JhGysxxService jhGysxxService;
	@Autowired
	JhXbhService jhXbhService;
	@Autowired
	StoreGinfoService storeGinfoService;
	@RequestMapping("/cgdlistpage.do")
	public ModelAndView listpage(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum,
			@RequestParam(defaultValue="10")Integer pageSize,JhCgd jc){
		System.out.println("查询用户列表-分页！");
		
		
			
		//查询list集合-分页     ${page.list}
		mav.addObject("p", jhCgdService.selectpage(pageNum, pageSize,jc));
		mav.addObject("a", jc);
		mav.setViewName("jh/cgdlistpage");// 路径是：/WEB-INF/jh/gysxxlistpage.jsp
		return mav;
	}
	
	    //添加采购单
		@RequestMapping("/cgdgoadd.do")
		public ModelAndView cgdgoadd(ModelAndView mav,Long id){
			System.out.println("采购单去添加！");				
			mav.addObject("gs",jhGysxxService.select()); 
			JhXbh jhXbh = jhXbhService.get(id);
			mav.addObject("bh", jhXbh);		
			mav.setViewName("jh/cgdadd");
			return mav;
		}
		
		//添加采购单后
		@RequestMapping("/cgdadd.do")
		@ResponseBody
		public Result cgdxqadd(ModelAndView mav,				
				JhCgd jc,Long id)throws IllegalStateException, IOException {
			
			//设置添加时间
			System.out.println(id);
			JhXbh jhXbh = jhXbhService.get(id);	
			System.out.println(jhXbh);
			jc.setLtime(new Date());
			jc.setJhtime(jhXbh.getJhTime());
			jc.setCgTime(new Date());
			jhCgdService.add(jc);			
			StoreGinfo storeGinfo = storeGinfoService.getsgi(new BigDecimal(jhXbh.getCpId()));
			System.out.println(storeGinfo);
			System.out.println("开始添加采购单"+jc);			
			List<JhCgdxq> list = jhCgdxqService.getall(jc.getCgdId());			
			System.out.println(list);
			if(list!=null){
				if(list.size()==0){
					JhCgdxq jhCgdxq=new JhCgdxq();
					jhCgdxq.setCpId(jhXbh.getCpId());
					System.out.println(jhXbh.getCpId());
					System.out.println(jhCgdxq.getCpId());
					jhCgdxq.setCgdId(jc.getCgdId());
					jhCgdxq.setGsId(jhXbh.getGsId());
					jhCgdxq.setOperator(jhXbh.getOperator());
					jhCgdxq.setRemark(jhXbh.getRemark());
					jhCgdxq.setLtime(new Date());
					jhCgdxq.setIsrk("未入库");
					jhCgdxq.setCpPrice(storeGinfo.getPricesold().longValue());
					jhCgdxqService.add(jhCgdxq);
				}
				   				
			}						
			return new Result(200,"生成采购单成功！");
			
		}
	
	//付款
	@RequestMapping("/fk.do")
	public ModelAndView cgdxqfk(ModelAndView mav,Long cgdId){
		System.out.println("采购单付款！"+cgdId);
		JhCgd u2 = this.jhCgdService.get(cgdId);
		if(u2.getFkqk()!=null&&!u2.getFkqk().equals("")){
			if(u2.getFkqk().equals("未付款")){
				u2.setFkqk("已付款");
			}
		}
		u2.setLtime(new Date());
		this.jhCgdService.update(u2);
		mav.setViewName("redirect:cgdlistpage.do");//重定向到list方法
		return mav;
   
	}
	
	
	//通过产品id获取产品对象
	@RequestMapping("/getGysxx.do")
	@ResponseBody
	public JhGysxx getGysxx(BigDecimal gysId){
		return jhGysxxService.get(gysId);
	}

	
}
