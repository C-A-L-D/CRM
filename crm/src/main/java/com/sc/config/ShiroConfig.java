package com.sc.config;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.Filter;

import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.filter.authc.LogoutFilter;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.DelegatingFilterProxy;

import com.sc.entity.SysPowerinfo;
import com.sc.form.CustomFormAuthenticationFilter;
import com.sc.realm.CustomRealmMD5;
import com.sc.service.SysPowerinfoService;

@Configuration
public class ShiroConfig {
    
	@Autowired
	SysPowerinfoService sysPowerinfoService;
	
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
		shiroFilter.setSuccessUrl("/loginController/index.do");//登陆成功成功跳转页面
		shiroFilter.setUnauthorizedUrl("/noPer.jsp");//没有权限默认跳转的页面
		
		Map<String, Filter> filters=new HashMap<String, Filter>();
		filters.put("authc", form);//
		
		//退出登录
		LogoutFilter logout=new LogoutFilter();
		logout.setRedirectUrl("/login.jsp");
		filters.put("logout", logout);
		shiroFilter.setFilters(filters);
		
		
		LinkedHashMap<String, String> filterMap = new LinkedHashMap<String, String>();
		//退出登录写到前面
		filterMap.put("/logout.do", "logout");
		//匿名用户可以访问资源页面
		filterMap.put("/css/**", "anon");
		filterMap.put("/fonts/**", "anon");
		filterMap.put("/html/**", "anon");
		filterMap.put("/images/**", "anon");
		filterMap.put("/js/**", "anon");
		filterMap.put("/lib/**", "anon");
		filterMap.put("/upload/**", "anon");
		filterMap.put("/favicon.ico", "anon");
		//匿名用户可以访问登录注册页面
		filterMap.put("/validatecode.jsp", "anon");
		filterMap.put("/login.jsp", "anon");
		
		
/*		//放开的权限
		filterMap.put("/index.jsp", "anon");
		filterMap.put("/gs/**", "anon");
		filterMap.put("/jh/**", "anon");
		filterMap.put("/off/**", "anon");
		filterMap.put("/storegoodinfo/**", "anon");
		filterMap.put("/sys/**", "anon");*/
		
		List<SysPowerinfo> allPower = sysPowerinfoService.selectAllPower();
		if (allPower != null && allPower.size() > 0) {
			for (SysPowerinfo s : allPower) {
				String pdescribe = s.getPdescribe();
				String ppower = s.getPpower();
				if (pdescribe != null && !pdescribe.equals("") && ppower != null && !ppower.equals("")) {
					filterMap.put(pdescribe, "perms["+ppower+"]");
				}
			}
		}
		
		filterMap.put("/**", "authc");
		//将匿名用户可访问页面的map集合放入过滤器链
		shiroFilter.setFilterChainDefinitionMap(filterMap);
		
		return shiroFilter;
	}
}
