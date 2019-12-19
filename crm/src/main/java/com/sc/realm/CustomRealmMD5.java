package com.sc.realm;

import java.util.ArrayList;
import java.util.List;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import com.sc.entity.SysUsers;
import com.sc.service.SysUsersService;

public class CustomRealmMD5 extends AuthorizingRealm{
	
	@Autowired
	SysUsersService sysUsersService;

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection arg0) {
		/*String username=(String)arg0.getPrimaryPrincipal();
		System.out.println("��Ҫ��Ȩ���û����ǣ�"+username);
		
		//模拟权限
		List<String> allperms=new ArrayList<String>();
		allperms.add("users:add");
		allperms.add("users:delete");
		
		//权限信息对象info,用来存放查出的用户的所有的角色（role）及权限（permission）  
		SimpleAuthorizationInfo info=new SimpleAuthorizationInfo();
		//模拟角色
		info.addRole("admin");//这里应该插入数据库查出来的角色
		info.addStringPermissions(allperms);//这里应该插入数据库查出来的权限（单个用户有很多权限，所以是个集合）
		
		return info;*/
		return null;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken arg0) throws AuthenticationException {
		String username=(String)arg0.getPrincipal();
		System.out.println("需要认证的用户名："+username);
		
		SysUsers sysUser = sysUsersService.login(username);
		
		if(sysUser==null){
			System.out.println("没有此用户...");
			return null;
		}
				
		String password=sysUser.getUpassword();
		String salt="qwerty";
		
		SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(sysUser, password, ByteSource.Util.bytes(salt), this.getName());
		
		System.out.println("认证比对结果：" + info);
		
		return info;
	}

}
