package com.sc.controller;

import java.math.BigDecimal;
import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sc.entity.SysGongsiinfo;

import com.sc.service.SysDepartmentService;
import com.sc.service.SysGongsiinfoService;
import com.sc.service.SysJobinfoService;
import com.sc.service.SysUsersInfoService;

@Controller
@RequestMapping("/sysgsctrl")
public class SysGSController {
	@Autowired
	SysGongsiinfoService sysGongsiinfoService;
	@Autowired
	SysDepartmentService sysDepartmentService;
	@Autowired
	SysJobinfoService sysJobinfoService;
	@Autowired
	SysUsersInfoService  sysUsersInfoService;
	//公司分页list
	@RequestMapping("/gspage.do")
	public ModelAndView gspage(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum,
			@RequestParam(defaultValue="5")Integer pageSize){
		System.out.println("公司列表-分页！");
		
		//查询list集合-分页     ${page.list}
		mav.addObject("p", sysGongsiinfoService.selectpage(pageNum, pageSize));
		
		mav.setViewName("gs/gslistpage");// 路径是：/WEB-INF/userslistpage.jsp
		return mav;
	}
	//公司详情
	@RequestMapping("/gsxxlist.do")
	public ModelAndView gsxx(ModelAndView mav,HttpServletRequest req){
		System.out.println("查询用户列表！");
		
		BigDecimal id = new BigDecimal(req.getParameter("id"));
		//SysGongsiinfo gsinfo=sysGongsiinfoService.get(id);
		//查询list集合
		SysGongsiinfo info =sysGongsiinfoService.get(id);
		mav.addObject("u", info);//list集合存入模型
		mav.setViewName("gs/gsxxlist");// 路径是：/WEB-INF/userslist.jsp
		return mav;
	}
	
	//部门分页list
	@RequestMapping("/bmpage.do")
	public ModelAndView bmpage(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum,
			@RequestParam(defaultValue="5")Integer pageSize){
		System.out.println("公司列表-分页！");
		
		//查询list集合-分页     ${page.list}
		mav.addObject("p", sysDepartmentService.selectpage(pageNum, pageSize));
		
		mav.setViewName("bmlistpage");// 路径是：/WEB-INF/userslistpage.jsp
		return mav;
	}
	//职务分页list
	@RequestMapping("/zwpage.do")
	public ModelAndView zwpage(ModelAndView mav,
			@RequestParam(defaultValue="1")Integer pageNum,
			@RequestParam(defaultValue="5")Integer pageSize){
		System.out.println("公司列表-分页！");
		
		//查询list集合-分页     ${page.list}
		mav.addObject("p", sysJobinfoService.selectpage(pageNum, pageSize));
		
		mav.setViewName("zwlistpage");// 路径是：/WEB-INF/userslistpage.jsp
		return mav;
	}
	
	//用户分页list
		@RequestMapping("/userpage.do")
		public ModelAndView userpage(ModelAndView mav,
				@RequestParam(defaultValue="1")Integer pageNum,
				@RequestParam(defaultValue="5")Integer pageSize){
			System.out.println("公司列表-分页！");
			
			//查询list集合-分页     ${page.list}
			mav.addObject("p", sysUsersInfoService.selectpage(pageNum, pageSize));
			
			mav.setViewName("userlistpage");// 路径是：/WEB-INF/userslistpage.jsp
			return mav;
		}
		
		
	
}
