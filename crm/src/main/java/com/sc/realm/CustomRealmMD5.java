package com.sc.realm;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.springframework.beans.factory.annotation.Autowired;

import com.sc.entity.SysPowerinfo;
import com.sc.entity.SysUsers;
import com.sc.service.SysPowerinfoService;
import com.sc.service.SysUsersService;

public class CustomRealmMD5 extends AuthorizingRealm{
	
	@Autowired
	SysUsersService sysUsersService;
	@Autowired
	SysPowerinfoService sysPowerinfoService;

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection arg0) {
		SysUsers user=(SysUsers) arg0.getPrimaryPrincipal();
		System.out.println("将被授权用户对象："+user);
		
		SysUsers one = sysUsersService.selectUsersAndRoleAndUsersInfoOne(user.getUserId());
		System.out.println("用户对应的角色："+one.getSysRole().getRname());
		ArrayList<SysPowerinfo> list = sysPowerinfoService.selectPowerInfo(one.getSysRole().getRid());
		List<String> allperms=new ArrayList<String>();
		if (list != null && list.size() > 0) {
			for (SysPowerinfo s : list) {
				String ppower = s.getPpower();
				if (ppower != null && !ppower.equals("")) {
					allperms.add(ppower);
					System.out.println("该角色查到的权限："+ppower);
				}
			}
		}
		
		//权限信息对象info,用来存放查出的用户的所有的角色（role）及权限（permission）  
		SimpleAuthorizationInfo info=new SimpleAuthorizationInfo();
		//模拟角色
		info.addRole(one.getSysRole().getRname());//这里应该插入数据库查出来的角色
		info.addStringPermissions(allperms);//这里应该插入数据库查出来的权限（单个用户有很多权限，所以是个集合）
		
		return info;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken arg0) throws AuthenticationException {
		String username= (String) arg0.getPrincipal();
		
		String gsIdStr=username.split("=")[1];
		username=username.split("=")[0];
		
		BigDecimal  gsId= new BigDecimal(gsIdStr);
		
		System.out.println("需要认证的公司编号："+gsId);
		System.out.println("需要认证的用户名："+username);
		
		SysUsers sysUser = sysUsersService.login(username, gsId);
		System.out.println("---------------------"+sysUser);
//		HttpServletRequest req = null;
		if(sysUser==null){
			System.out.println("没有此用户...");
//			req.getSession().setAttribute(FormAuthenticationFilter.DEFAULT_ERROR_KEY_ATTRIBUTE_NAME, "GsAndUserError");
			return null;
		}
		
		if (sysUser.getUstate().equals("off")) {
			System.out.println("账户为冻结状态...");
//			req.getSession().setAttribute(FormAuthenticationFilter.DEFAULT_ERROR_KEY_ATTRIBUTE_NAME, "uStateError");
			return null;
		}
		
		String password=sysUser.getUpassword();
		String salt="qwerty";
		
		SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(sysUser, password, ByteSource.Util.bytes(salt), this.getName());
		
		System.out.println("认证比对结果：" + info);
		
		return info;
	}

}
