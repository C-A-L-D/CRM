package com.sc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sc.entity.SysUsers;
import com.sc.mapper.SysUsersMapper;
import com.sc.service.Login;

@Service
public class LoginImpl implements Login{

	@Autowired
	SysUsersMapper sysUsersMapper;

	@Override
	public SysUsers login(SysUsers u) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
