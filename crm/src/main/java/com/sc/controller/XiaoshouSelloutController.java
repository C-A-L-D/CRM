package com.sc.controller;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.sc.entity.XiaoshouSellout;
import com.sc.service.XiaoshouSelloutService;

@Controller
@RequestMapping("/storeSout")
public class XiaoshouSelloutController {
	@Autowired
	XiaoshouSelloutService xiaoshouSelloutService;
	
	@RequestMapping("/listpageSout.do")
	public ModelAndView listpageSwi(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum,
			@RequestParam(defaultValue="10")Integer pageSize){
		PageInfo<XiaoshouSellout> sgilistPage = xiaoshouSelloutService.selectPage(pageNum, pageSize);
		mav.addObject("listpage",sgilistPage);
		mav.addObject("total",sgilistPage.getTotal());
		mav.setViewName("store/listSout");
		return mav;
	}
	
	@RequestMapping("/selectSout.do")
	public ModelAndView selectSout(ModelAndView mav,Integer sid) {
		System.err.println("要修改的对象(int)id："+sid);
		BigDecimal id=BigDecimal.valueOf(sid);
		System.err.println("要修改的对象(bigDecimal)id："+id);
		XiaoshouSellout info=xiaoshouSelloutService.selectObj(id);
		if(info==null) {
			System.err.println("未查询到该对象！");
		}
		else {
		mav.addObject("selected",info);
		}
		mav.setViewName("store/updateSout");
		System.err.println(mav.getViewName());
		return mav;
	}
	
	@RequestMapping("/selectInfo.do")
	public ModelAndView selectInfo(ModelAndView mav,Integer sid) {
		System.err.println("要修改的对象(int)id："+sid);
		BigDecimal id=BigDecimal.valueOf(sid);
		System.err.println("要修改的对象(bigDecimal)id："+id);
		XiaoshouSellout info=xiaoshouSelloutService.selectObj(id);
		if(info==null) {
			System.err.println("未查询到该对象！");
		}
		else {
		mav.addObject("selected",info);
		}
		mav.setViewName("store/viewSout");
		System.err.println(mav.getViewName());
		return mav;
	}
	
	@RequestMapping("/updateSout.do")
	public ModelAndView updateSout(ModelAndView mav,XiaoshouSellout xiaoshouSellout) {
		System.err.println("updatectrl");
		if(xiaoshouSellout.getSid()==null||xiaoshouSellout==null) {
			System.err.println("该对象为空！");
		}
		
		System.err.println("ctrl接收到的新对象："+xiaoshouSellout);
		XiaoshouSellout oldXiaoshouSellout=xiaoshouSelloutService.selectObj(xiaoshouSellout.getSid());
		if(xiaoshouSellout.getTid()==null) {
			xiaoshouSellout.setTid(oldXiaoshouSellout.getTid());
		}
		if(xiaoshouSellout.getMaketime()==null) {
			xiaoshouSellout.setMaketime(oldXiaoshouSellout.getMaketime());
		}
		if(xiaoshouSellout.getGuid()==null) {
			xiaoshouSellout.setGuid(oldXiaoshouSellout.getGuid());
		}
		if(xiaoshouSellout.getSprice()==null) {
			xiaoshouSellout.setGuid(oldXiaoshouSellout.getGuid());
		}
		if(xiaoshouSellout.getSstatus()==null) {
			xiaoshouSellout.setSstatus(oldXiaoshouSellout.getSstatus());
		}
		if(xiaoshouSellout.getIsanti()==null) {
			xiaoshouSellout.setIsanti(oldXiaoshouSellout.getIsanti());
		}
		if(xiaoshouSellout.getCid()==null) {
			xiaoshouSellout.setCid(oldXiaoshouSellout.getCid());
		}
		if(xiaoshouSellout.getRemark()==null||xiaoshouSellout.getRemark().equals("")) {
			xiaoshouSellout.setRemark(oldXiaoshouSellout.getRemark());
		}
		xiaoshouSellout.setLastdate(new Date());
		
		System.err.println("修改"+oldXiaoshouSellout+"为");
		System.err.println(xiaoshouSellout);
		xiaoshouSelloutService.update(xiaoshouSellout);
		
		mav.setViewName("redirect:/xiaoshouSellout/listpageSout.do");
		return mav;
	}	
	
	
}
