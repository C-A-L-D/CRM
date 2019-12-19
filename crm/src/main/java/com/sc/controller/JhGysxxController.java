package com.sc.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sc.entity.JhGysxx;
import com.sc.entity.JhGysxxExample;
import com.sc.entity.Result;
import com.sc.service.JhGysxxService;

@RequestMapping("/gysxxctrl")
@Controller
public class JhGysxxController {

	@Autowired
	JhGysxxService jhGysxxService;
	
	
	@RequestMapping("/gyslistpage.do")
	public ModelAndView listpage(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum,
			@RequestParam(defaultValue="10")Integer pageSize,JhGysxx u){
		System.out.println("查询用户列表-分页！");
		
		//查询list集合-分页     ${page.list}
		mav.addObject("p", jhGysxxService.selectpage(pageNum, pageSize,u));
		
		mav.setViewName("jh/gysxxlistpage");// 路径是：/WEB-INF/jh/gysxxlistpage.jsp
		return mav;
	}
	
	@RequestMapping("/gysgoupdate.do")
	public ModelAndView goupdate(ModelAndView mav,JhGysxx u){
		System.out.println("跳转到修改页面！"+u);
		JhGysxx users = this.jhGysxxService.get(u.getGysId());
		mav.addObject("u", users);
		mav.setViewName("jh/gysxxupdate");// 路径是：/WEB-INF/jh/gysxxupdate.jsp
		return mav;
	}
	
	
	@RequestMapping("/gysupdate.do")
	@ResponseBody
	public Result update(ModelAndView mav,		
			JhGysxx u) throws IllegalStateException, IOException{
		System.out.println("开始上传文件"+u);
	    //设置修改时间
		u.setLtime(new Date());
		this.jhGysxxService.update(u);
		return new Result(200,"修改成功！");
	}
	
	@RequestMapping("/gysxq.do")
	public ModelAndView goxq(ModelAndView mav,JhGysxx u){
		System.out.println("跳转到修改页面！"+u);
		JhGysxx users = this.jhGysxxService.get(u.getGysId());
		mav.addObject("u", users);
		mav.setViewName("jh/gysxq");// 路径是：/WEB-INF/jh/gysxq.jsp
		return mav;
	}
	
	//添加供应商
	@RequestMapping("/gysgoadd.do")
	public ModelAndView gsgotj(ModelAndView mav){
		System.out.println("供应商去添加！");
		mav.setViewName("jh/gysadd");
		return mav;
	}
	
	//添加供应商后
	@RequestMapping("/gysadd.do")
	@ResponseBody
	public Result gsadd(ModelAndView mav,
			HttpServletRequest req,
			JhGysxx u)throws IllegalStateException, IOException {
		System.out.println("开始添加供应商"+u);
		//设置添加时间
		u.setLtime(new Date());
		jhGysxxService.add(u);
		return new Result(200,"添加成功！");
	}
	
	//删除供应商
	@RequestMapping("/gysdelete.do")
	public ModelAndView gysdelete(ModelAndView mav,JhGysxx u){
		System.out.println("供应商删除！"+u);
		JhGysxx u1 = this.jhGysxxService.get(u.getGysId());
		this.jhGysxxService.delete(u1);
		mav.setViewName("redirect:gyslistpage.do");
		return mav;
	}
	

	
}
