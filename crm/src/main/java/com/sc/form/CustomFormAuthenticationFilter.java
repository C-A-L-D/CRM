package com.sc.form;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;

public class CustomFormAuthenticationFilter extends FormAuthenticationFilter {

	@Override
	protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		HttpServletRequest req=(HttpServletRequest)request;
		HttpSession session=req.getSession();
		String validateCode=(String)session.getAttribute("validateCode");
		String randomcode=req.getParameter("randomcode");
		if(validateCode!=null&&randomcode!=null&&!randomcode.equals(validateCode)){
			req.setAttribute(FormAuthenticationFilter.DEFAULT_ERROR_KEY_ATTRIBUTE_NAME, "randomCodeError");
			return true;
		}
		return super.onAccessDenied(request, response);
	}
}
