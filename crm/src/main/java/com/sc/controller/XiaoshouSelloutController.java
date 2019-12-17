package com.sc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.sc.entity.XiaoshouSellout;
import com.sc.service.XiaoshouSelloutService;

@Controller
@RequestMapping("/storeSout")
public class XiaoshouSelloutController {
	@Autowired
	XiaoshouSelloutService xiaoshouSelloutService;
	
	@RequestMapping("/listpageSout.do")
	public ModelAndView listpageSwi(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum,
			@RequestParam(defaultValue="10")Integer pageSize){
		PageInfo<XiaoshouSellout> sgilistPage = xiaoshouSelloutService.selectPage(pageNum, pageSize);
		mav.addObject("listpage",sgilistPage);
		mav.addObject("total",sgilistPage.getTotal());
		mav.setViewName("store/listSout");
		return mav;
	}
}
