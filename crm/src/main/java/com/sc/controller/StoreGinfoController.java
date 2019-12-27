package com.sc.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.sc.entity.StoreGinfo;
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
	
	@RequestMapping("/selectSgi.do")
	public ModelAndView selectSwi(ModelAndView mav,Integer gid) {
		System.err.println("要修改的对象(int)id："+gid);
		BigDecimal id=BigDecimal.valueOf(gid);
		System.err.println("要修改的对象(bigDecimal)id："+gid);
		StoreGinfo info=storeGinfoService.selectObj(id);
		if(info==null) {
			System.err.println("未查询到该对象！");
		}
		else {
		System.err.println("ctrl已接收到"+info);
		mav.addObject("selected",info);
		}
		mav.setViewName("store/updateSgi");
		System.err.println(mav.getViewName());
		return mav;
	}
	
	
	@RequestMapping("/selectInfo.do")
	public ModelAndView selectinfo(ModelAndView mav,Integer gid) {
		BigDecimal id=BigDecimal.valueOf(gid);
		StoreGinfo info=storeGinfoService.selectObj(id);
		if(info==null) {
			System.err.println("未查询到该对象！");
		}
		else {
		System.err.println("ctrl已接收到"+info);
		mav.addObject("selected",info);
		}
		mav.setViewName("store/viewSgi");
		System.err.println(mav.getViewName());
		return mav;
	}
	
	@RequestMapping("/selectExample.do")
	public ModelAndView selectExample(ModelAndView mav,Integer gid,String gname) {
		BigDecimal id=BigDecimal.valueOf(gid);
		
		if(gid==null&&(gname==null||gname.equals(""))) {
			System.err.println("未查询到该对象！");
			return mav;
		}
		else if(gid==null&&gname!=null&&!gname.equals("")){
			System.err.println("未查询到该对象！");
			return mav;
		}
		else {
			StoreGinfo info=storeGinfoService.selectObj(id);
		}
		System.err.println(mav.getViewName());
		return mav;
	}
	
	
	@RequestMapping("/delStore.do")
	@ResponseBody
	public void delStore(ModelAndView mav,
			@RequestParam(defaultValue="-1")Integer gid) {
		if(gid==-1) {
			System.err.println("发生未知错误！");
		}
		storeGinfoService.del(gid);
		System.err.println("删除"+gid);
	}
	
	
	@RequestMapping("/addSgi.do")
	public ModelAndView addSgi(ModelAndView mav,StoreGinfo storeGinfo) {
		mav.setViewName("redirect:/storeGinfo/listpage.do");
		if(storeGinfo==null) {
			System.err.println("对象为空！");
			return mav;
		}
		storeGinfo.setLasttime(new Date());
		storeGinfoService.add(storeGinfo);
		return mav;
		
	}
	
	@RequestMapping("/updateSgi.do")
	public ModelAndView updatestore(ModelAndView mav,StoreGinfo storeGinfo){
		if(storeGinfo.getGid()==null||storeGinfo==null) {
			System.err.println("该对象为空！");
		}
		
		
		System.err.println("接收到的新对象："+storeGinfo);
		StoreGinfo oldstoreGinfo=storeGinfoService.selectObj(storeGinfo.getGid());
		

		if(storeGinfo.getGname()==null||storeGinfo.getGname().equals("")) {
			storeGinfo.setGname(oldstoreGinfo.getGname());
		}
		if(storeGinfo.getGcategopy()==null||storeGinfo.getGcategopy().equals("")) {
			storeGinfo.setGcategopy(oldstoreGinfo.getGcategopy());
		}
		if(storeGinfo.getGdesp()==null||storeGinfo.getGdesp().equals("")) {
			storeGinfo.setGdesp(oldstoreGinfo.getGdesp());
		}
		if(storeGinfo.getGunit()==null||storeGinfo.getGunit().equals("")) {
			storeGinfo.setGunit(oldstoreGinfo.getGunit());
		}
		if (storeGinfo.getWhid()==null) {
			storeGinfo.setWhid(oldstoreGinfo.getWhid());
		}
		if (storeGinfo.getWhid()==null) {
			storeGinfo.setWhid(oldstoreGinfo.getWhid());
		}
		if (storeGinfo.getStorenum()==null) {
			storeGinfo.setStorenum(oldstoreGinfo.getStorenum());
		}
		if(storeGinfo.getPricebuy()==null) {
			storeGinfo.setPricebuy(oldstoreGinfo.getPricebuy());
		}
		if(storeGinfo.getPriceact()==null) {
			storeGinfo.setPriceact(oldstoreGinfo.getPriceact());
		}
		if(storeGinfo.getPricesold()==null) {
			storeGinfo.setPricesold(oldstoreGinfo.getPricesold());
		}
		if(storeGinfo.getCid()==null) {
			storeGinfo.setCid(oldstoreGinfo.getCid());
		}
		if(storeGinfo.getRemark()==null||storeGinfo.getRemark().equals("")) {
			storeGinfo.setRemark(oldstoreGinfo.getRemark());
		}
		storeGinfo.setLasttime(new Date());
		
		System.err.println("修改"+oldstoreGinfo);
		System.err.println("为"+storeGinfo);
		storeGinfoService.update(storeGinfo);
		
		mav.setViewName("redirect:/storeGinfo/listpage.do");
		return mav;
	}
}
