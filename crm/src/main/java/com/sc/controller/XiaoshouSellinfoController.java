package com.sc.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.sc.entity.XiaoshouSellinfo;
import com.sc.service.StoreGinfoService;
import com.sc.service.XiaoshouSellinfoService;

@Controller
@RequestMapping("/storeSinfo")
public class XiaoshouSellinfoController {
	@Autowired
	XiaoshouSellinfoService xiaoshouSellinfoService;
	
	@Autowired
	StoreGinfoService storeGinfoService;
	
	@RequestMapping("/listpageSinfo.do")
	public ModelAndView listpageSwi(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum,
			@RequestParam(defaultValue="10")Integer pageSize){
		ArrayList<BigDecimal> list=storeGinfoService.selectGid();
		PageInfo<XiaoshouSellinfo> sgilistPage = xiaoshouSellinfoService.selectPage(pageNum, pageSize);
		mav.addObject("idlist",list);
		mav.addObject("listpage",sgilistPage);
		mav.addObject("total",sgilistPage.getTotal());
		mav.setViewName("store/listSinfo");
		return mav;
	}


	@RequestMapping("/selectSinfo.do")
	public ModelAndView selectSwi(ModelAndView mav,Integer ssid) {
		System.err.println("要修改的对象(int)id："+ssid);
		BigDecimal id=BigDecimal.valueOf(ssid);
		System.err.println("要修改的对象(bigDecimal)id："+id);
		XiaoshouSellinfo info=xiaoshouSellinfoService.selectObj(id);
		if(info==null) {
			System.err.println("未查询到该对象！");
		}
		else {
		mav.addObject("selected",info);
		}
		mav.setViewName("store/updateSinfo");
		System.err.println(mav.getViewName());
		return mav;
	}
	
	@RequestMapping("/updateSinfo.do")
	public ModelAndView updateSinfo(ModelAndView mav,XiaoshouSellinfo xiaoshouSellinfo) {
		if(xiaoshouSellinfo.getSsid()==null||xiaoshouSellinfo==null) {
			System.err.println("该对象为空！");
		}
		
		System.err.println("接收到的新对象："+xiaoshouSellinfo);
		XiaoshouSellinfo oldXiaoshouSellinfo=xiaoshouSellinfoService.selectObj(xiaoshouSellinfo.getSsid());
		
		if(xiaoshouSellinfo.getGid()==null) {
			xiaoshouSellinfo.setGid(oldXiaoshouSellinfo.getGid());
		}
		if(xiaoshouSellinfo.getSid()==null) {
			xiaoshouSellinfo.setSid(oldXiaoshouSellinfo.getSid());
		}
		if(xiaoshouSellinfo.getCid()==null) {
			xiaoshouSellinfo.setCid(oldXiaoshouSellinfo.getCid());
		}
		if(xiaoshouSellinfo.getRemark()==null||xiaoshouSellinfo.getRemark().equals("")) {
			xiaoshouSellinfo.setRemark(oldXiaoshouSellinfo.getRemark());
		}
		if(xiaoshouSellinfo.getGprice()==null) {
			xiaoshouSellinfo.setGprice(oldXiaoshouSellinfo.getGprice());
		}
		if(xiaoshouSellinfo.getGnum()==null) {
			xiaoshouSellinfo.setGnum(oldXiaoshouSellinfo.getGnum());
		}
		
		xiaoshouSellinfo.setLasttime(new Date());
		
		System.err.println("修改"+oldXiaoshouSellinfo+"为");
		System.err.println(xiaoshouSellinfo);
		xiaoshouSellinfoService.update(xiaoshouSellinfo);
		
		mav.setViewName("redirect:/storeSinfo/listpageSinfo.do");
		return mav;
	}	

}
