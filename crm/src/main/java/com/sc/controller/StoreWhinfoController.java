package com.sc.controller;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.sc.entity.Result;
import com.sc.entity.StoreWhinfo;
import com.sc.service.StoreWhinfoService;

@Controller
@RequestMapping("/storeWhinfo")
public class StoreWhinfoController {
	@Autowired
	StoreWhinfoService storeWhinfoService;
	
	@RequestMapping("/listpageSwi.do")
	public ModelAndView listpageSwi(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pages,
			@RequestParam(defaultValue="10")Integer limit){
		PageInfo<StoreWhinfo> sgilistPage = storeWhinfoService.selectPage(pages, limit);
		mav.addObject("listpage",sgilistPage);
		mav.addObject("total",sgilistPage.getTotal());
		mav.setViewName("store/listSwi");
		return mav;
	}	

	
	@RequestMapping("/selectSwi.do")
	public ModelAndView selectSwi(ModelAndView mav,Integer whid) {
		System.err.println("要修改的对象(int)id："+whid);
		BigDecimal id=BigDecimal.valueOf(whid);
		System.err.println("要修改的对象(bigDecimal)id："+whid);
		StoreWhinfo info=storeWhinfoService.selectObj(id);
		if(info==null) {
			System.err.println("未查询到该对象！");
		}
		else {
		mav.addObject("selected",info);
		}
		mav.setViewName("store/updateSwi");
		System.err.println(mav.getViewName());
		return mav;
	}
	
	@RequestMapping("/updateSwi.do")
	public ModelAndView updateSwi(ModelAndView mav,StoreWhinfo storeWhinfo) {
		if(storeWhinfo.getWhid()==null||storeWhinfo==null) {
			System.err.println("该对象为空！");
		}
		
		
		System.err.println("接收到的新对象："+storeWhinfo);
		StoreWhinfo oldStoreWhinfo=storeWhinfoService.selectObj(storeWhinfo.getWhid());
		

		if(storeWhinfo.getWhname()==null||storeWhinfo.getWhname().equals("")) {
			storeWhinfo.setWhname(oldStoreWhinfo.getWhname());
		}
		if(storeWhinfo.getCid()==null) {
			storeWhinfo.setCid(oldStoreWhinfo.getCid());
		}
		if(storeWhinfo.getRemark()==null||storeWhinfo.getRemark().equals("")) {
			storeWhinfo.setRemark(oldStoreWhinfo.getRemark());
		}
		storeWhinfo.setLastdate(new Date());
		
		System.err.println("修改"+oldStoreWhinfo+"为");
		System.err.println(storeWhinfo);
		storeWhinfoService.update(storeWhinfo);
		
		mav.setViewName("redirect:/storeWhinfo/listpageSwi.do");
		return mav;
	}	
	
//	@RequestMapping("/addSwi.do")
//	@ResponseBody
//	public ModelAndView addSwi(ModelAndView mav,StoreWhinfo storeWhinfo) {
//		//storeWhinfoService.add(storeWhinfo);
//		storeWhinfo.setLastdate(new Date());
//		System.err.println(storeWhinfo);
//		mav.setViewName("redirect:/storeWhinfo/listpageSwi.do");
//		System.err.println(mav.getViewName());
//		return mav;
//	}
	
	
	
	
	@RequestMapping("/addSwi.do")
	@ResponseBody
	public Result addSwi(ModelAndView mav,StoreWhinfo storeWhinfo) {
		storeWhinfo.setLastdate(new Date());
		System.err.println(storeWhinfo);
		storeWhinfoService.add(storeWhinfo);
		return new Result(200,"status");
	}	
	
	
	
	
	
	
	@RequestMapping("/delSwi.do")
	@ResponseBody
	public Result delSwi(ModelAndView mav,Integer whid) {
		BigDecimal id=BigDecimal.valueOf(whid);
		storeWhinfoService.del(id);
		System.err.println(whid);
		return new Result(200,"status");
	}
}
