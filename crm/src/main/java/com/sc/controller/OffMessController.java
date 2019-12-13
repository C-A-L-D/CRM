package com.sc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sc.entity.OffMess;
import com.sc.entity.OffMessdetail;
import com.sc.service.OffMessService;

@Controller
@RequestMapping("/offmessctrl")
public class OffMessController {
	@Autowired
	OffMessService offMessService;
	
	//分页显示短信息
	@RequestMapping("/offmesslist.do")
	public ModelAndView listpage(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum,
			@RequestParam(defaultValue="5")Integer pageSize){
		System.out.println("查看短信列表-分页！");
		
		//查询list集合-分页    ${page.list}
		mav.addObject("p", offMessService.selectpage(pageNum,pageSize));
		mav.setViewName("off/offmesslist");//路径是：/WEB-INF/off/offmesslist.jsp
		return mav;
     }
	
	//删除短信息
	@RequestMapping("/delete.do")
	public ModelAndView delete(ModelAndView mav,OffMessdetail mess){
		System.out.println("删除短信息"+mess);
		this.offMessService.deleteMess(mess);
		mav.setViewName("redirect:offmesslist.do");//重定向到offmesslist方法
		return mav;
     }
	
	//显示短消息详情
	@RequestMapping("/showdetail.do")
	public ModelAndView showdetail(ModelAndView mav,OffMessdetail mess){
		System.out.println("查看短消息详情！");
		
		//查询短消息详情
		List<OffMessdetail>list=this.offMessService.showdetail(mess);
		mav.addObject("shoedetail",list);
		mav.setViewName("off/showdetail");//路径是：/WEB-INF/off/showdetail.jsp
		return mav;
     }
	
	//回复短消息
	  @RequestMapping("/huifu.do")
		public ModelAndView huifumess(ModelAndView mav,OffMess mess){
		System.out.println("回复短消息！+mess");
		this.offMessService.huifu(mess);
		mav.setViewName("redirect:offmesslist.do");//重定向到offmesslist方法
	
		return mav;
     }
}
