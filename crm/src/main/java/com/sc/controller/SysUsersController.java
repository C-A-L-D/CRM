package com.sc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.sc.entity.Result;
import com.sc.entity.SysUsers;
import com.sc.service.impl.SysUsersServiceImpl;

@Controller
@RequestMapping("/loginController")
public class SysUsersController {

	@Autowired
	SysUsersServiceImpl sysUsersServiceImpl;
	
	/**
	 * 登录失败
	 * @param mav	模板视图
	 * @param req	servlet请求对象
	 * @return
	 */
	@RequestMapping("/login.do")
	public ModelAndView Login(ModelAndView mav,HttpServletRequest req){
		System.out.println("您认证失败，将跳转到登录页面，完成认证...");
		
		String msg=(String)req.getAttribute(FormAuthenticationFilter.DEFAULT_ERROR_KEY_ATTRIBUTE_NAME);
		System.out.println("认证失败异常信息："+msg);
		
		String fail="";
		if(msg!=null){
			if(msg.equals(UnknownAccountException.class.getName())) {
				fail="unknown";//用户名不存在
			}else if(msg.equals(IncorrectCredentialsException.class.getName())){
				fail="error";//密码不正确
			}else if(msg.equals("randomCodeError")){
				fail="code";//验证码错误
			}else{
				fail="other";//未知错误
			}
		}
		
		mav.setViewName("redirect:../login.jsp?isfail="+fail);
		System.out.println("跳了....");
		return mav;
	}
	
	/**
	 * 登录成功
	 * @param mav	模板视图
	 * @param session	session对象
	 * @return
	 */
	@RequestMapping("/index.do")
	public ModelAndView index(ModelAndView mav, HttpSession session) {
		System.out.println("登录认证成功，将跳到主页...");
		
		Subject subject = SecurityUtils.getSubject();
		
		SysUsers sysUser=(SysUsers)subject.getPrincipal();
		session.setAttribute("nowuser", sysUser);
		
		mav.setViewName("redirect:../index.jsp");
		return mav;
	}
	
	

	
	/**
	 * 个人信息
	 * @param u	用户信息
	 * @param mav	模板视图
	 * @return
	 */
	@RequestMapping("/person.do")
	public ModelAndView person(SysUsers u,ModelAndView mav){
		mav.setViewName("sys/person");
		return mav;
	}
	
	@RequestMapping("/allUsersInfo.do")
	public ModelAndView allUsersInfo(ModelAndView mav, @RequestParam(defaultValue="1")int pageNum, @RequestParam(defaultValue="2")int pageSize) {
		System.out.println("所有用户信息...");
		mav.addObject("allUsers", sysUsersServiceImpl.selectAllUsers(pageNum, pageSize));
		mav.setViewName("sys/admin-list");
		return mav;
	}
}
