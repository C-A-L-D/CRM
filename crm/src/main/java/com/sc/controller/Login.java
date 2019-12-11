package com.sc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sc.service.impl.LoginImpl;

@Controller
@RequestMapping("/login")
public class Login {

	@Autowired
	LoginImpl loginImpl;
	
	public ModelAndView Login(){
		return null;
		
	}
}
