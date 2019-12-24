package com.sc.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.PageInfo;
import com.sc.entity.SysPowercolumn;
import com.sc.entity.SysPowerinfo;
import com.sc.entity.SysRole;
import com.sc.mapper.SysPowerinfoMapper;
import com.sc.mapper.SysRoleMapper;

public interface SysRoleService {

	public PageInfo<SysRole> selectAllRoleAndPower(int pageNum, int pageSize);
	
	public List<SysRole> selectAllRole();
	
	public SysRole selectOne(BigDecimal rid);
	
	public void updateRole(SysRole s);

	public void addRole(SysRole s);
	
	public void delRole(BigDecimal rid);
	
	//查询全部分栏
	public ArrayList<SysPowercolumn> selectAllColumn();
	
	//根据分栏ID查询所有的对应权限
	public ArrayList<SysPowerinfo> selectAllPower(BigDecimal pcolumnId);
	
	public ArrayList<SysPowerinfo> selectPowerChecked(BigDecimal rid);
}
