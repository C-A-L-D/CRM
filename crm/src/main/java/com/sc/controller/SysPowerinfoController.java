package com.sc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/power")
public class SysPowerinfoController {

	@RequestMapping("/selectAllPower.do")
	public ModelAndView selectAllPower(ModelAndView mav) {
		
		mav.setViewName("sys/PowerList");
		return mav;
	}
}
