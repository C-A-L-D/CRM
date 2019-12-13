package com.sc.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
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
			@RequestParam(defaultValue="5")Integer pageSize) throws IOException{
		System.out.println("公司列表-分页！");
		
		//查询list集合-分页     ${page.list}
		mav.addObject("p", sysGongsiinfoService.selectpage(pageNum, pageSize));
		
		mav.setViewName("gs/gslistpage");// 路径是：/WEB-INF/userslistpage.jsp
		return mav;
	}
	//公司详情
	@RequestMapping("/gsxxlist.do")
	public ModelAndView gsxx(ModelAndView mav,SysGongsiinfo info1){
		System.out.println("查询用户列表！"+info1.getId());
		
		//查询list集合
		SysGongsiinfo info =sysGongsiinfoService.get(info1.getId());
		System.out.println(info);
		mav.addObject("u", info);//list集合存入模型
		mav.setViewName("gs/gsxxlist");// 路径是：/WEB-INF/userslist.jsp
		return mav;
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
	
	//公司修改之后信息
	@RequestMapping("/gsupdate.do")
	public void update(ModelAndView mav,
			MultipartFile upload,
			HttpServletRequest req,
			HttpServletResponse rep,
			SysGongsiinfo info1) throws IllegalStateException, IOException{
		System.out.println("开始上传文件"+info1);
		
		
		sysGongsiinfoService.update(info1);
		
//		mav.setViewName("redirect:gspage.do");//重定向到list方法
//		PrintWriter w = rep.getWriter();
//		w.print("<script type='text/javascript'>");
//		w.print("alert('修改成功');");
//		w.print("parent.layer.close(parent.layer.getFrameIndex(window.name))");
//		w.print("</script>");
//		w.close();
//		return mav;
		
	}

	//添加公司
	@RequestMapping("/gsgotj.do")
	public ModelAndView gstj(ModelAndView mav){
		System.out.println("公司添加！");
		mav.setViewName("gs/gstj");
		return mav;
		
	}
	
	//添加公司后
	@RequestMapping("/gstj.do")
	public ModelAndView update(ModelAndView mav,
			HttpServletRequest req,
			SysGongsiinfo info)throws IllegalStateException, IOException {
		System.out.println("开始添加公司"+info);
		
		
		sysGongsiinfoService.add(info);
		mav.setViewName("gs/gslistpage");
		return mav;
		
	}
	
	//删除公司
	@RequestMapping("/gsdelete.do")
	public ModelAndView gsdelete(ModelAndView mav,SysGongsiinfo info1){
		System.out.println("公司删除！");
		SysGongsiinfo info = this.sysGongsiinfoService.get(info1.getId());
		 this.sysGongsiinfoService.delete(info);
		 mav.setViewName("redirect:gspage.do");
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
