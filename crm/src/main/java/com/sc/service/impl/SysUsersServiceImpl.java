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
	public SysUsers login(SysUsers u) {
		// TODO Auto-generated method stub
		SysUsersExample example = new SysUsersExample();
		Criteria criteria = example.createCriteria();
		criteria.andUnameEqualTo(u.getUname());
		criteria.andUpasswordEqualTo(u.getUpassword());
		List<SysUsers> list = this.sysUsersMapper.selectByExample(example);
		if(list != null && list.size() > 0){
			System.out.println(list.toString());
			return list.get(0);
		}
		return null;
	}
	
	
}
