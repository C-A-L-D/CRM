package com.sc.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

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

	@Override
	public SysRole selectOne(BigDecimal rid) {
		// TODO Auto-generated method stub
		return this.sysRoleMapper.selectByPrimaryKey(rid);
	}

	@Override
	public List<SysRole> selectAllRole() {
		// TODO Auto-generated method stub
		return this.sysRoleMapper.selectByExample(null);
	}

	@Override
	public void updateRole(SysRole s) {
		// TODO Auto-generated method stub
		this.sysRoleMapper.updateByPrimaryKeySelective(s);
	}

	@Override
	public void addRole(SysRole s) {
		// TODO Auto-generated method stub
		this.sysRoleMapper.insert(s);
	}

	@Override
	public void delRole(BigDecimal rid) {
		// TODO Auto-generated method stub
		this.sysRoleMapper.deleteByPrimaryKey(rid);
	}

}
