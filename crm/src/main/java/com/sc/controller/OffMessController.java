package com.sc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sc.entity.OffMess;
import com.sc.service.OffMessService;

@Controller
@RequestMapping("/offmessctrl")
public class OffMessController {
	@Autowired
	OffMessService offMessService;
	@RequestMapping("/offmesslist.do")
	public ModelAndView test(ModelAndView mav){
		System.out.println("查看短消息列表！");
		
		//查询list集合
		List<OffMess>list=this.offMessService.select();
		mav.addObject("list", list);
		mav.setViewName("off/offmesslist");//路径是：/WEB-INF/off/offmesslist.jsp
		return mav;
     }
}
