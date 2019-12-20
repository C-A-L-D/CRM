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
import com.sc.entity.JhGysxx;
import com.sc.service.JhCgdService;
import com.sc.service.JhCgdxqService;
import com.sc.service.JhGysxxService;
@RequestMapping("/cgdctrl")
@Controller
public class JhCgdController {

	@Autowired
	JhCgdService jhCgdService;
	@Autowired
	JhCgdxqService jhCgdxqService;
	@Autowired
	JhGysxxService jhGysxxService;
	
	@RequestMapping("/cgdlistpage.do")
	public ModelAndView listpage(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum,
			@RequestParam(defaultValue="10")Integer pageSize,JhCgd jc){
		System.out.println("查询用户列表-分页！");
		
		
		//查询list集合-分页     ${page.list}
		mav.addObject("p", jhCgdService.selectpage(pageNum, pageSize,jc));
		
		mav.setViewName("jh/cgdlistpage");// 路径是：/WEB-INF/jh/gysxxlistpage.jsp
		return mav;
	}
	
	    //添加采购单
		@RequestMapping("/cgdgoadd.do")
		public ModelAndView cgdgoadd(ModelAndView mav){
			System.out.println("采购单去添加！");	
			mav.addObject("gs",jhGysxxService.select()); 
			mav.setViewName("jh/cgdadd");
			return mav;
		}
		
		//添加采购单详情后
		@RequestMapping("/cgdadd.do")
		@ResponseBody
		public ModelAndView cgdxqadd(ModelAndView mav,
				HttpServletRequest req,
				JhCgd jc)throws IllegalStateException, IOException {
			System.out.println("开始添加采购单"+jc);
			//设置添加时间
			jc.setLtime(new Date());
			jhCgdService.add(jc);
			mav.setViewName("/cgdlistpage.do");
			return mav;
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
