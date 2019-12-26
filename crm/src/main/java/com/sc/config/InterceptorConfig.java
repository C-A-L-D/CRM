package com.sc.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import com.sc.interceptor.LoggingInfoInterceptor;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

	@Autowired
	LoggingInfoInterceptor loggingInfoInterceptor;
	
	/**
	 * 这个方法用来注册拦截器，我们自己写好的拦截器需要通过这里添加注册才能生效
	 */
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// TODO Auto-generated method stub
		//注册拦截器
//        InterceptorRegistration registration = registry.addInterceptor(new LoggingInfoInterceptor());
//        registration.addPathPatterns("/**");                      //所有路径都被拦截
//        registration.excludePathPatterns(                         //添加不拦截路径
//                                         "你的登陆路径",            //登录
//                                         "/**/*.html",            //html静态资源
//                                         "/**/*.js",              //js静态资源
//                                         "/**/*.css",             //css静态资源
//                                         "/**/*.woff",
//                                         "/**/*.ttf"
//                                         ); 
		//不new对象就采用@Autowired的方式注入
		 registry.addInterceptor(loggingInfoInterceptor)
				 .addPathPatterns("/**")
				 .excludePathPatterns(
 									 "/**/*.html",  
 									 "/**/*.js", 
 									 "/**/*.css",  
 									"/**/*.woff",
 									 "/**/*.ttf",
 									"/**/*.png",
 									"/**/*.gif",
 									"/**/*.jpg"
 									);
	}
}
