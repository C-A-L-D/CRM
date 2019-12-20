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

import com.sc.entity.JhCgd;
import com.sc.entity.JhCgdxq;
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
	
	    //添加采购单
		@RequestMapping("/cgdgoadd.do")
		public ModelAndView cgdgoadd(ModelAndView mav){
			System.out.println("采购单去添加！");					
			mav.setViewName("jh/cgdadd");
			return mav;
		}
		
		//添加采购单详情后
		@RequestMapping("/cgdadd.do")
		@ResponseBody
		public Result cgdxqadd(ModelAndView mav,
				HttpServletRequest req,
				JhCgd jc)throws IllegalStateException, IOException {
			System.out.println("开始添加采购单"+jc);
			//设置添加时间
			jc.setLtime(new Date());
			jhCgdService.add(jc);
			return new Result(200,"添加成功！");
		}
	
	
	
	
	//入库
	@RequestMapping("/rk.do")
	public ModelAndView cgdrk(ModelAndView mav,Long id){
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
	
	//付款
	@RequestMapping("/fk.do")
	public ModelAndView cgdxqfk(ModelAndView mav,Long cgdId){
		System.out.println("采购单付款！"+cgdId);
		JhCgd u2 = this.jhCgdService.get(cgdId);
		if(u2.getFkqk()!=null&&!u2.getFkqk().equals("")){
			if(u2.getFkqk().equals("未付款")){
				u2.setFkqk("已付款");
			}
		}
		u2.setLtime(new Date());
		this.jhCgdService.update(u2);
		mav.setViewName("redirect:cgdlistpage.do");//重定向到list方法
		return mav;
   
	}
	
	
}
