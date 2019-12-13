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

import com.sc.entity.Result;
import com.sc.entity.SysGongsiinfo;
import com.sc.service.SysGongsiinfoService;

@Controller
@RequestMapping("/sysgsctrl")
public class SysGSController {
	@Autowired
	SysGongsiinfoService sysGongsiinfoService;
	
	//公司分页list
	@RequestMapping("/gspage.do")
	public ModelAndView gspage(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum,
			@RequestParam(defaultValue="5")Integer pageSize) throws IOException{
		System.out.println("公司列表-分页！");
		//查询list集合-分页     ${p.list}
		mav.addObject("p", sysGongsiinfoService.selectpage(pageNum, pageSize));
		mav.setViewName("gs/gslistpage");// 路径是：/WEB-INF/gs/gslistpage.jsp
		return mav;
	}
	
	//公司详情
	@RequestMapping("/gsxxlist.do")
	public ModelAndView gsxx(ModelAndView mav,SysGongsiinfo info1){
		System.out.println("查询公司详情"+info1.getId());
		//查询list集合
		SysGongsiinfo info =sysGongsiinfoService.get(info1.getId());
		System.out.println(info);
		mav.addObject("u", info);//list集合存入模型
		mav.setViewName("gs/gsxxlist");// 路径是：/WEB-INF/gs/gsxxlist.jsp
		return mav;
	}
	
	

	//添加公司
	@RequestMapping("/gsgotj.do")
	public ModelAndView gsgotj(ModelAndView mav){
		System.out.println("公司去添加！");
		mav.setViewName("gs/gstj");
		return mav;
	}
	
	//添加公司后
	@RequestMapping("/gstj.do")
	@ResponseBody
	public Result gsadd(ModelAndView mav,
			HttpServletRequest req,
			SysGongsiinfo info)throws IllegalStateException, IOException {
		System.out.println("开始添加公司"+info);
		//设置添加时间
		info.setLasttime(new Date());
		sysGongsiinfoService.add(info);
		return new Result(200,"添加成功！");
	}
	
	//公司修改信息
	@RequestMapping("/gsgoupdate.do")
	public ModelAndView goupdate(ModelAndView mav,SysGongsiinfo info1){
		System.out.println("跳转到修改页面！"+info1);
		SysGongsiinfo info = this.sysGongsiinfoService.get(info1.getId());
		mav.addObject("u", info);
		mav.setViewName("gs/gsupdate");
		return mav;
	}
	
	//公司修改
	@RequestMapping("/gsupdate.do")
	@ResponseBody
	public Result update(ModelAndView mav,
			SysGongsiinfo info) throws IllegalStateException, IOException{
		System.out.println("修改"+info);
		//设置修改时间
		info.setLasttime(new Date());
		sysGongsiinfoService.update(info);
		return new Result(200,"修改成功！");
	}
	
	//删除公司
	@RequestMapping("/gsdelete.do")
	@ResponseBody
	public void gsdelete(ModelAndView mav,SysGongsiinfo info1){
		System.out.println("公司删除！"+info1);
		SysGongsiinfo info = this.sysGongsiinfoService.get(info1.getId());
		this.sysGongsiinfoService.delete(info);
	}
	
	
}
