package com.sc.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.SysRole;
import com.sc.mapper.SysRoleMapper;
import com.sc.service.SysRoleService;

@Service
public class SysRoleServiceImpl implements SysRoleService {

	@Autowired
	SysRoleMapper sysRoleMapper;
	
	@Override
	public PageInfo<SysRole> selectAllRoleAndPower(int pageNum, int pageSize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, pageSize);
		ArrayList<SysRole> list = this.sysRoleMapper.selectAllRoleAndPower();
		return 	new PageInfo<SysRole>(list);
	}

}
