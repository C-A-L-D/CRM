package com.sc.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.sc.entity.Result;
import com.sc.entity.StoreGinfo;
import com.sc.entity.SysGongsiinfo;
import com.sc.service.StoreGinfoService;

@Controller
@RequestMapping("/storeGinfo")
public class StoreGinfoController {
	@Autowired
	StoreGinfoService storeGinfoService;
	
	
	
	@RequestMapping("/listpage.do")
	public ModelAndView listpage(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum,
			@RequestParam(defaultValue="10")Integer pageSize){
		PageInfo<StoreGinfo> sgilistPage = storeGinfoService.selectPage(pageNum, pageSize);
		mav.addObject("listpage",sgilistPage);
		mav.addObject("total",sgilistPage.getTotal());
		mav.setViewName("store/listSgi");
		return mav;
	}
	
	
	@RequestMapping("/delStore.do")
	public void delStore(ModelAndView mav,
			@RequestParam(defaultValue="-1")Integer gid) {
		if(gid==-1) {
			System.err.println("发生未知错误！");
		}
	//	storeGinfoService.del(gid);
	}
	
	
	@RequestMapping("/addStore.do")
	public ModelAndView addStore(ModelAndView mav) {
		mav.setViewName("storegoodinfo/add");
		return mav;
		//storeGinfoService.add(storeGinfo);
	}
	
	@RequestMapping("add.do")
	@ResponseBody
	public Result gsadd(ModelAndView mav,
			HttpServletRequest req,
			StoreGinfo storeGinfo)throws IllegalStateException, IOException {
		System.out.println("开始添加公司"+storeGinfo);
		//设置添加时间

		return new Result(200,"添加成功！");
	}
	
	@RequestMapping("/updatestore.do")
	public ModelAndView updatestore(ModelAndView mav,StoreGinfo storeGinfo){
		System.out.println("跳转到修改页面！"+storeGinfo);
		//storeGinfoService.get()
		StoreGinfo info = this.storeGinfoService.getsgi(storeGinfo.getGid());
		mav.addObject("sgi", info);
		mav.setViewName("storegoodinfo/updatesginfo");
		return mav;
	}
}
