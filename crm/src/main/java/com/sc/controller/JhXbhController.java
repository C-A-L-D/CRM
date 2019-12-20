package com.sc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sc.entity.JhXbh;
import com.sc.service.JhXbhService;

@RequestMapping("/xbhctrl")
@Controller
public class JhXbhController {

	@Autowired
	JhXbhService jhXbhService;
	

	@RequestMapping("/xbhlistpage.do")
	public ModelAndView listpage(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum,
			@RequestParam(defaultValue="10")Integer pageSize,JhXbh jx){
		System.out.println("查询用户列表-分页！");
		
		//查询list集合-分页     ${page.list}
		mav.addObject("p", jhXbhService.selectpage(pageNum, pageSize,jx));
		
		mav.setViewName("jh/xbhlistpage");// 路径是：/WEB-INF/jh/xbhlistpage.jsp
		return mav;
	}
	
}
