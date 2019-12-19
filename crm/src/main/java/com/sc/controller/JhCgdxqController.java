package com.sc.controller;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sc.entity.JhCgd;
import com.sc.entity.JhCgdxq;
import com.sc.entity.Result;
import com.sc.entity.StoreGinfo;
import com.sc.service.JhCgdxqService;
import com.sc.service.StoreGinfoService;
@RequestMapping("/cgdxqctrl")
@Controller
public class JhCgdxqController {

	@Autowired
	JhCgdxqService jhCgdxqService;
	@Autowired
	StoreGinfoService storeGinfoService;
	
	
	@RequestMapping("/cgdxq.do")
	public ModelAndView cgdxqlistpage(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum,
			@RequestParam(defaultValue="10")Integer pageSize,JhCgd jc){
		System.out.println("查询用户列表-分页！");	
		//查询list集合-分页     ${page.list}
		mav.addObject("p", jhCgdxqService.selectpage(pageNum, pageSize,jc));
		mav.setViewName("jh/cgdxq");// 路径是：/WEB-INF/jh/gysxxlistpage.jsp
		return mav;
	}
	
	@RequestMapping("/cgdxqgoupdate.do")
	public ModelAndView goupdate(ModelAndView mav,JhCgdxq u){
		System.out.println("跳转到修改页面！"+u);
		JhCgdxq users = this.jhCgdxqService.get(u.getCgXqId());
		mav.addObject("u", users);
		mav.addObject("st",storeGinfoService.selectAll()); 
		mav.setViewName("jh/cgdxqupdate");// 路径是：/WEB-INF/jh/cgdxqupdate.jsp
		return mav;
	}
	
	
	@RequestMapping("/cgdxqupdate.do")
	@ResponseBody
	public Result update(ModelAndView mav,		
			JhCgdxq u) throws IllegalStateException, IOException{
		System.out.println("开始上传文件"+u);
	    //设置修改时间
		u.setLtime(new Date());
		this.jhCgdxqService.update(u);
		return new Result(200,"修改成功！");
	}
	
	//添加采购单详情
	@RequestMapping("/cgdxqgoadd.do")
	public ModelAndView cgdxqgoadd(ModelAndView mav,Long id,String rk
			){
		System.out.println("采购单详情去添加！");
		mav.addObject("ck",storeGinfoService.selectAll()); 
		mav.addObject("x", id);
		mav.addObject("xx", rk);
		mav.setViewName("jh/cgdxqadd");
		return mav;
	}
	
	
	//添加采购单详情后
		@RequestMapping("/cgdxqadd.do")
		@ResponseBody
		public Result cgdxqadd(ModelAndView mav,
				HttpServletRequest req,
				JhCgdxq u)throws IllegalStateException, IOException {
			System.out.println("开始添加采购单详情"+u);
			//设置添加时间
			u.setLtime(new Date());
			
			jhCgdxqService.add(u);
			Long cp = u.getCpNumber() * u.getCpPrice();
			
			return new Result(200,"添加成功！");
		}
		
		//删除采购单详情
		@RequestMapping("/cgdxqdelete.do")
		@ResponseBody
		public void cgdxqdelete(JhCgdxq u){
			System.out.println("采购单详情删除！"+u);
			JhCgdxq u1 = this.jhCgdxqService.get(u.getCgXqId());
			this.jhCgdxqService.delete(u1);
			
		}
	
		//通过产品id获取产品对象
		@RequestMapping("/getStoreInfo.do")
		@ResponseBody
		public StoreGinfo getStoreInfo(BigDecimal gid){
			return storeGinfoService.getsgi(gid);
		}
	
	
}
