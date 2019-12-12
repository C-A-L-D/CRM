package com.sc.controller;

import javax.servlet.http.HttpServletRequest;

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
	public ModelAndView Login(SysUsers u,ModelAndView mav,HttpServletRequest req){
		SysUsers user = this.sysUsersServiceImpl.login(u);
		if (user != null) {
			System.out.println("登录成功...");
			req.getSession().setAttribute("user", user);
			mav.setViewName("redirect:../index.jsp");
		}
		else {
			System.out.println("登录失败...");
			mav.setViewName("redirect:../login.jsp");
		}
		return mav;
	}
	
	@RequestMapping("/person.do")
	public ModelAndView person(SysUsers u,ModelAndView mav){
		mav.setViewName("sys/person");
		return mav;
	}
	
}
