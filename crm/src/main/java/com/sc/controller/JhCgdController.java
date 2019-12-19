package com.sc.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sc.entity.JhCgd;
import com.sc.entity.Result;
import com.sc.service.JhCgdService;
@RequestMapping("/cgdctrl")
@Controller
public class JhCgdController {

	@Autowired
	JhCgdService jhCgdService;
	
	
	
	@RequestMapping("/cgdlistpage.do")
	public ModelAndView listpage(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum,
			@RequestParam(defaultValue="10")Integer pageSize,JhCgd jc){
		System.out.println("查询用户列表-分页！");
		
		//查询list集合-分页     ${page.list}
		mav.addObject("p", jhCgdService.selectpage(pageNum, pageSize,jc));
		
		mav.setViewName("jh/cgdlistpage");// 路径是：/WEB-INF/jh/gysxxlistpage.jsp
		return mav;
	}
	
	@RequestMapping("/rk.do")
	public ModelAndView cgdfk(ModelAndView mav,Long id){
		System.out.println("采购单付款！"+id);
		JhCgd u1 = this.jhCgdService.get(id);
		if(u1.getCgJz()!=null&&!u1.getCgJz().equals("")){
			if(u1.getCgJz().equals("待采购")){
				u1.setCgJz("已入库");
			}
		}
		u1.setLtime(new Date());
		this.jhCgdService.update(u1);
		mav.setViewName("redirect:cgdlistpage.do");//重定向到list方法
		return mav;
   
	}
	
	
	
	
}
