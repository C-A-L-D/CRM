package com.sc.config;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.Filter;

import org.apache.commons.collections.map.LinkedMap;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.filter.authc.LogoutFilter;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sc.form.CustomFormAuthenticationFilter;
import com.sc.realm.CustomRealmMD5;

@Configuration
public class ShiroConfig {
    
	@Bean
	public CustomRealmMD5 customRealmMD5(){
		CustomRealmMD5 realm=new CustomRealmMD5();
		HashedCredentialsMatcher matcher=new HashedCredentialsMatcher();
		matcher.setHashAlgorithmName("md5");
		matcher.setHashIterations(3);
		realm.setCredentialsMatcher(matcher);
		return realm;
	}
	
	@Bean
	public org.apache.shiro.mgt.SecurityManager securityManager(){
		DefaultWebSecurityManager manager=new DefaultWebSecurityManager();
		manager.setRealm(this.customRealmMD5());
		return manager;
	}
	
	@Bean("shiroFilter")
	public ShiroFilterFactoryBean shiroFilter(){
		CustomFormAuthenticationFilter form=new CustomFormAuthenticationFilter();
		form.setLoginUrl("/loginController/login.do");
		form.setUsernameParam("uname");
		form.setPasswordParam("upassword");
		
		ShiroFilterFactoryBean shiroFilter=new ShiroFilterFactoryBean();
		shiroFilter.setSecurityManager(this.securityManager());
		shiroFilter.setLoginUrl("/login.jsp");
		shiroFilter.setSuccessUrl("/loginController/index.do");//认证成功跳转页面
		
		Map<String, Filter> filters=new HashMap<String, Filter>();
		filters.put("authc", form);//
		
		//退出登录
		LogoutFilter logout=new LogoutFilter();
		logout.setRedirectUrl("/login.jsp");
		filters.put("logout", logout);
		shiroFilter.setFilters(filters);
		
		
		LinkedHashMap<String, String> filterMap = new LinkedHashMap<String, String>();
		//匿名用户可以访问资源页面
		filterMap.put("/logout.do", "logout");
		filterMap.put("/images/**", "anon");
		filterMap.put("/css/**", "anon");
		filterMap.put("/js/**", "anon");
		filterMap.put("/upload/**", "anon");
		filterMap.put("/login.jsp", "anon");
		filterMap.put("/index.jsp", "anon");
		filterMap.put("/validatecode.jsp", "anon");
		//匿名用户可以访问登录注册页面
		filterMap.put("/login.jsp", "anon");
		filterMap.put("/loginController/checkuname.do", "anon");
		
		//easyUI表格的页面和请求方法，可匿名访问
		filterMap.put("/datagrid.jsp", "anon");
		filterMap.put("/usersctrl/listjson.do", "anon");
		
		filterMap.put("/**", "authc");
		//将匿名用户可访问页面的map集合放入过滤器链
		shiroFilter.setFilterChainDefinitionMap(filterMap);
		
		return shiroFilter;
	}
}
