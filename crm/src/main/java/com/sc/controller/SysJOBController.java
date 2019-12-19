package com.sc.controller;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sc.entity.Result;

import com.sc.entity.SysJobinfo;

import com.sc.service.SysJobinfoService;

@Service
@RequestMapping("/sysjobctrl")
public class SysJOBController {
@Autowired
SysJobinfoService sysJobinfoService;
	
	
	//公司分页list
	@RequestMapping("/jobpage.do")
	public ModelAndView gspage(ModelAndView mav,
			SysJobinfo info1,
			@RequestParam(defaultValue="1")Integer pageNum,
			@RequestParam(defaultValue="5")Integer pageSize) throws IOException{
		System.out.println("公司列表-分页！");
		//查询list集合-分页     ${p.list}
		mav.addObject("p", sysJobinfoService.selectpage(pageNum, pageSize,info1));
		mav.addObject("info1", info1);
		mav.setViewName("gs/joblistpage");// 路径是：/WEB-INF/gs/gslistpage.jsp
		return mav;
	}
	

	
	

	//添加公司
	@RequestMapping("/jobgotj.do")
	public ModelAndView gsgotj(ModelAndView mav){
		System.out.println("公司去添加！");
		mav.addObject("p1", sysJobinfoService.select1());
		mav.addObject("p2", sysJobinfoService.select2());
		mav.setViewName("gs/jobtj");
		return mav;
	}
	
	//添加公司后
	@RequestMapping("/jobtj.do")
	@ResponseBody
	public Result gsadd(ModelAndView mav,
			HttpServletRequest req,
			SysJobinfo info)throws IllegalStateException, IOException {
		System.out.println("开始添加公司"+info);
		//设置添加时间
		info.setLasttime(new Date());
		sysJobinfoService.add(info);
		return new Result(200,"添加成功！");
	}
	
	//公司修改信息
	@RequestMapping("/jobgoupdate.do")
	public ModelAndView goupdate(ModelAndView mav,SysJobinfo info1){
		System.out.println("跳转到修改页面！"+info1);
		SysJobinfo info = this.sysJobinfoService.get(info1.getJid());
		mav.addObject("u", info);
		mav.addObject("p1", sysJobinfoService.select1());
		mav.addObject("p2", sysJobinfoService.select2());
		mav.setViewName("gs/jobupdate");
		return mav;
	}
	
	//公司修改
	@RequestMapping("/jobupdate.do")
	@ResponseBody
	public Result update(ModelAndView mav,
			SysJobinfo info) throws IllegalStateException, IOException{
		System.out.println("修改"+info);
		//设置修改时间
		info.setLasttime(new Date());
		sysJobinfoService.update(info);
		return new Result(200,"修改成功！");
	}
	
	//删除公司
	@RequestMapping("/jobdelete.do")
	@ResponseBody
	public void gsdelete(ModelAndView mav,SysJobinfo info1){
		System.out.println("公司删除！"+info1);
		SysJobinfo info = this.sysJobinfoService.get(info1.getJid());
		
		this.sysJobinfoService.delete(info);
	}
	
	//删除所有公司
	@RequestMapping("/jobdeletesy.do")
	@ResponseBody
	public void gsdelete(ModelAndView mav,String aa){
		System.out.println("公司删除！"+aa);
		
		String[] ss = aa.split(",");
		//删除字符串的 “,”  比如aa={a,b,c}  之后 ["a","b","c"]
		//如果是split("")  比如aa={abc de}  之后["a","b","c" ,"d","e"]
		for (String xx : ss) {
			SysJobinfo info = this.sysJobinfoService.get(new BigDecimal(xx));
			this.sysJobinfoService.delete(info);
		}
		
		
	}
	
}
