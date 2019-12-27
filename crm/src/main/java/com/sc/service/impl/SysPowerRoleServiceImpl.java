package com.sc.service.impl;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sc.entity.SysPowerRoleExample;
import com.sc.mapper.SysPowerRoleMapper;
import com.sc.service.SysPowerRoleService;

@Service
public class SysPowerRoleServiceImpl implements SysPowerRoleService {

	@Autowired
	SysPowerRoleMapper sysPowerRoleMapper;
	
	@Override
	public void delPR(BigDecimal pid) {
		// TODO Auto-generated method stub
		SysPowerRoleExample example = new SysPowerRoleExample();
		com.sc.entity.SysPowerRoleExample.Criteria criteria = example.createCriteria();
		criteria.andPidEqualTo(pid);
		sysPowerRoleMapper.deleteByExample(example);
	}

}
