package com.sc.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
	public SysUsers login(String u) {
		// TODO Auto-generated method stub
		SysUsersExample example = new SysUsersExample();
		Criteria criteria = example.createCriteria();
		criteria.andUnameEqualTo(u);
		List<SysUsers> selectByExample = this.sysUsersMapper.selectByExample(example);
		return selectByExample.get(0) ;
	}
	
	
	@Override
	public SysUsers login(String uname, BigDecimal id) {
		// TODO Auto-generated method stub
		SysUsers sysUsers = this.sysUsersMapper.login(uname, id);
		return sysUsers;
	}

	@Override
	public void addUser(SysUsers u) {
		// TODO Auto-generated method stub
		sysUsersMapper.insertSelective(u);
	}

	@Override
	public PageInfo<SysUsers> selectAllUsersAndRoleAndUsersInfo(int pageNum, int pageSize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, pageSize);
		List<SysUsers> list = sysUsersMapper.selectAllUsersAndRoleAndUsersInfo();
		return new PageInfo<SysUsers>(list);
	}
	
	@Override
	public void updateUserStatus(BigDecimal userId) {
		// TODO Auto-generated method stub
		SysUsers user = sysUsersMapper.selectByPrimaryKey(userId);
		if (user.getUstate().equals("on")) {
			user.setUstate("off");
		}
		else {
			user.setUstate("on");
		}
		sysUsersMapper.updateByPrimaryKeySelective(user);
	}
	
	@Override
	public SysUsers goUpdateUserOne(BigDecimal userId) {
		// TODO Auto-generated method stub
		return sysUsersMapper.selectByPrimaryKey(userId);
	}
	
		
}
