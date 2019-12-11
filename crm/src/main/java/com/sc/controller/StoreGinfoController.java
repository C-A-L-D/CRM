package com.sc.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sc.entity.StoreGinfo;
import com.sc.service.StoreGinfoService;

@Controller
@RequestMapping("/storefinfo")
public class StoreGinfoController {
	@Autowired
	StoreGinfoService storeGinfoService;
	
	public ModelAndView postinfo(ModelAndView mav) {
		ArrayList<StoreGinfo> sgilist = this.storeGinfoService.selectAll();
		mav.addObject("sgilist",sgilist);
		mav.setViewName("storegoods/storeglist");
		return mav;
	}
}
