package com.sc.interceptor;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.sc.entity.SysLoggong;
import com.sc.entity.SysPowerinfo;
import com.sc.entity.SysPowerinfoExample;
import com.sc.entity.SysPowerinfoExample.Criteria;
import com.sc.entity.SysUsers;
import com.sc.mapper.SysLoggongMapper;
import com.sc.mapper.SysPowerinfoMapper;

@Component
public class LoggingInfoInterceptor implements HandlerInterceptor {

	@Autowired
	SysPowerinfoMapper sysPowerinfoMapper;
	@Autowired
	SysLoggongMapper sysLoggongMapper;
	
	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		System.out.println("响应后");
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		System.out.println("方法请求后");
	}

	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {		
		SysUsers user = (SysUsers) arg0.getSession().getAttribute("nowuser");
		System.out.println("session："+user);
//		System.out.println(getRealIP(arg0));
		String uri = arg0.getRequestURI();//请求路径
		String u = uri.substring(4);
		System.out.println(u);//访问路径对应的所需权限
		SysPowerinfoExample example = new SysPowerinfoExample();
		Criteria criteria = example.createCriteria();
		criteria.andPdescribeEqualTo(u);
		List<SysPowerinfo> list = sysPowerinfoMapper.selectByExample(example);
		if (list.size() != 0) {
			System.out.println("得到的权限信息对象："+list.get(0));
		}
		//存日志表
		SysLoggong loggong = new SysLoggong();
		if (user != null) {
			loggong.setUid(user.getUserId());
			loggong.setGongsiid(user.getGongsiid());
		}
		loggong.setIp(getRealIP(arg0));
		if (list.size() != 0) {
			loggong.setPower(list.get(0).getPpower());
		}
		loggong.setTime(new Date());
		sysLoggongMapper.insertSelective(loggong);
		
		return true;
	}
	
	/**
	 * 获取访问者IP
	 * @param request
	 * @return
	 */
	public static String getRealIP(HttpServletRequest request) {
		String ip = request.getHeader("x-forwarded-for");
		if (ip != null && ip.length() != 0 && !"unknown".equalsIgnoreCase(ip)) {
			// 多次反向代理后会有多个ip值，第一个ip才是真实ip
			if (ip.indexOf(",") != -1) {
				ip = ip.split(",")[0];
			}
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
			System.out.println("Proxy-Client-IP ip: " + ip);
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
			System.out.println("WL-Proxy-Client-IP ip: " + ip);
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("HTTP_CLIENT_IP");
			System.out.println("HTTP_CLIENT_IP ip: " + ip);
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("HTTP_X_FORWARDED_FOR");
			System.out.println("HTTP_X_FORWARDED_FOR ip: " + ip);
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("X-Real-IP");
			System.out.println("X-Real-IP ip: " + ip);
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr();
			System.out.println("getRemoteAddr ip: " + ip);
		}
		return ip;
	}

}
