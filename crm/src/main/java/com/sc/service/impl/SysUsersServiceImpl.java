package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sc.entity.SysUsers;
import com.sc.entity.SysUsersExample;
import com.sc.entity.SysUsersExample.Criteria;
import com.sc.mapper.SysUsersMapper;
import com.sc.service.SysUsersService;

@Service
public class SysUsersServiceImpl implements SysUsersService{

	@Autowired
	SysUsersMapper sysUsersMapper;

	@Override
	public SysUsers login(String uname) {
		// TODO Auto-generated method stub
		SysUsersExample example = new SysUsersExample();
		Criteria criteria = example.createCriteria();
		criteria.andUnameEqualTo(uname);
		List<SysUsers> list = this.sysUsersMapper.selectByExample(example);
		if(list != null && list.size() > 0){
			return list.get(0);
		}
		return null;
	}

	@Override
	public void addUser(SysUsers u) {
		// TODO Auto-generated method stub
		sysUsersMapper.insert(u);
	}
	
	
}
