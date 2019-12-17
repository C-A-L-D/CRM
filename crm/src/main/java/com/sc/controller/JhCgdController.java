package com.sc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sc.entity.JhCgd;
import com.sc.service.JhCgdService;
@RequestMapping("/cgdctrl")
@Controller
public class JhCgdController {

	@Autowired
	JhCgdService jhCgdService;
	
	
	
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
	
	
	
	
	
}
