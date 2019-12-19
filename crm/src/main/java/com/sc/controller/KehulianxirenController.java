package com.sc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sc.service.KehulianxirenService;

@Controller
@RequestMapping("/Kehulianxirenctrl")
public class KehulianxirenController {
	
	@Autowired
	KehulianxirenService kehulianxirenService;
	
	@RequestMapping("/KehulianxirenListPage.do")
	public ModelAndView KehulianxirenList(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum,
			@RequestParam(defaultValue="10")Integer pageSize,
			Long kid,String kname){
		System.out.println("查询客户联系人列表");
		mav.addObject("lxr", kehulianxirenService.selectKehulianxiren(pageNum, pageSize, kid));
		mav.addObject("kname", kname);
		mav.addObject("kid", kid);
		mav.setViewName("KehuJsp/Kehulianxiren");
		return mav;
	}
}
