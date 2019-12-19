package com.sc.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.github.pagehelper.PageInfo;
import com.sc.entity.SysRole;

public interface SysRoleService {

	public PageInfo<SysRole> selectAllRoleAndPower(int pageNum, int pageSize);
	
	public List<SysRole> selectAllRole();
	
	public SysRole selectOne(BigDecimal rid);
	
	public void updateRole(SysRole s);

	public void addRole(SysRole s);
	
	public void delRole(BigDecimal rid);
}
