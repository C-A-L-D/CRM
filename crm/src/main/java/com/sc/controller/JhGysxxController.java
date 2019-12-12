package com.sc.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sc.entity.JhGysxx;
import com.sc.service.JhGysxxService;

@RequestMapping("/gysxxctrl")
@Controller
public class JhGysxxController {

	@Autowired
	JhGysxxService jhGysxxService;
	
	@RequestMapping("/listpage.do")
	public ModelAndView listpage(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum,
			@RequestParam(defaultValue="10")Integer pageSize){
		System.out.println("查询用户列表-分页！");
		
		//查询list集合-分页     ${page.list}
		mav.addObject("p", jhGysxxService.selectpage(pageNum, pageSize));
		
		mav.setViewName("jh/gysxxlistpage");// 路径是：/WEB-INF/jh/gysxxlistpage.jsp
		return mav;
	}
	
	@RequestMapping("/goupdate.do")
	public ModelAndView goupdate(ModelAndView mav,JhGysxx u){
		System.out.println("跳转到修改页面！"+u);
		JhGysxx users = this.jhGysxxService.get(u.getGysId());
		mav.addObject("u", users);
		mav.setViewName("jh/gysxxupdate");// 路径是：/WEB-INF/jh/gysxxupdate.jsp
		return mav;
	}
	
	
	@RequestMapping("/update.do")
	public ModelAndView update(ModelAndView mav,
			HttpServletRequest req,
			JhGysxx u) throws IllegalStateException, IOException{
		System.out.println("开始上传文件"+u);
	
		this.jhGysxxService.update(u);
		mav.setViewName("redirect:listpage.do");//重定向到listpage方法
		return mav;
	}
	
	
}
