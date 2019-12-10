package com.sc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sc.entity.OffMess;
import com.sc.service.OffMessService;

@Controller
@RequestMapping("/offctrl")
public class OffController {
	@Autowired
OffMessService offMessService;
	@RequestMapping("/list.do")
	public ModelAndView test(ModelAndView mav){
		System.out.println("查看短消息列表！");
		
		//查询list集合
		List<OffMess>list=this.offMessService.select();
		mav.addObject("list", list);
		mav.setViewName("userslist");//路径是：/WEB-INF/userslist.jsp
		return mav;
     }
}
