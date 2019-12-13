package com.sc.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.sc.entity.StoreGinfo;
import com.sc.service.StoreGinfoService;

@Controller
@RequestMapping("/storefinfo")
public class StoreGinfoController {
	@Autowired
	StoreGinfoService storeGinfoService;
	
//	//@RequestMapping("/storegoodlist.do")
//	@RequestMapping("/storegoodlist2.do")
//	public ModelAndView postinfo(ModelAndView mav) {
//		ArrayList<StoreGinfo> sgilist = this.storeGinfoService.selectAll();
//		mav.addObject("sgilistPage",sgilist);
//		System.err.println(sgilist);
//		//mav.setViewName("storegoodinfo/storeglist");
//		mav.setViewName("storegoodinfo/storeglist2");
//		return mav;
//	}
	
	@RequestMapping("/storegoodlist2.do")
	public ModelAndView listpage(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum,
			@RequestParam(defaultValue="10")Integer pageSize){
		System.err.println("ctrl is running!");
		mav.addObject("sgilistPage",storeGinfoService.selectPage(pageNum, pageSize));
		mav.setViewName("storegoodinfo/storeglist2");
		return mav;
	}
}
