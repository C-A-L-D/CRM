package com.sc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sc.entity.SysUsers;
import com.sc.service.impl.SysUsersServiceImpl;

@Controller
@RequestMapping("/loginController")
public class SysUsersController {

	@Autowired
	SysUsersServiceImpl sysUsersServiceImpl;
	
	@RequestMapping("/login.do")
	public ModelAndView Login(SysUsers u,ModelAndView mav){
		System.out.println(u.getUname());
		if (this.sysUsersServiceImpl.login(u) != null) {
			System.out.println("登录成功...");
			mav.setViewName("redirect:../index.jsp");
		}
		else {
			System.out.println("登录失败...");
			mav.setViewName("redirect:../login.jsp");
		}
		return mav;
	}
}
