package com.sc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sc.entity.SysUsers;
import com.sc.entity.SysUsersExample;
import com.sc.entity.SysUsersExample.Criteria;
import com.sc.mapper.SysUsersMapper;
import com.sc.service.Login;

@Service
public class LoginImpl implements Login{

	@Autowired
	SysUsersMapper sysUsersMapper;

	@Override
	public boolean login(SysUsers u) {
		// TODO Auto-generated method stub
		SysUsersExample example = new SysUsersExample();
		Criteria criteria = example.createCriteria();
		criteria.andUnameEqualTo(u.getUname());
		criteria.andUpasswordEqualTo(u.getUpassword());
		if(this.sysUsersMapper.selectByExample(example) != null){
			return true;
		}
		return false;
	}
	
	
}
