package com.sc.form;

import java.math.BigDecimal;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.apache.shiro.web.util.WebUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.sc.entity.SysUsers;
import com.sc.service.SysUsersService;

public class CustomFormAuthenticationFilter extends FormAuthenticationFilter {


	
	
	@Override
	protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		HttpServletRequest req=(HttpServletRequest)request;
		HttpSession session=req.getSession();
		String validateCode=(String)session.getAttribute("validateCode");
		/*
		String gsID = req.getParameter("test");
		BigDecimal GSID = null;
		
		if (gsID != null) {
			GSID = new BigDecimal(gsID);
		}
		
		System.out.println("GSID:"+GSID);
		String uname = req.getParameter("uname");
		System.out.println("UNAME:"+uname);
		SysUsers users = null;
		if (uname != null && GSID != null) {
			System.out.println("-----"+sysUsersService);
			users = sysUsersService.login(uname, GSID);
		}*/
		String randomcode=req.getParameter("randomcode");
		if(validateCode != null && randomcode != null && !randomcode.equals(validateCode)){
			req.setAttribute(FormAuthenticationFilter.DEFAULT_ERROR_KEY_ATTRIBUTE_NAME, "randomCodeError");
			/*if (GSID != null && users != null) {
				req.setAttribute(FormAuthenticationFilter.DEFAULT_ERROR_KEY_ATTRIBUTE_NAME, "GSError");
			}*/
			return true;
		}
		return super.onAccessDenied(request, response);
	}
	
	@Override
	protected boolean onLoginSuccess(AuthenticationToken token, Subject subject, ServletRequest request,
			ServletResponse response) throws Exception {
		WebUtils.getAndClearSavedRequest(request);
		return super.onLoginSuccess(token, subject, request, response);
	}
}
