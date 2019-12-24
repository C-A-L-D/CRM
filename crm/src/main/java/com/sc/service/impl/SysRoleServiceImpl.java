package com.sc.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.SysPowercolumn;
import com.sc.entity.SysPowerinfo;
import com.sc.entity.SysPowerinfoExample;
import com.sc.entity.SysPowerinfoExample.Criteria;
import com.sc.entity.SysRole;
import com.sc.mapper.SysPowercolumnMapper;
import com.sc.mapper.SysPowerinfoMapper;
import com.sc.mapper.SysRoleMapper;
import com.sc.service.SysRoleService;

@Service
public class SysRoleServiceImpl implements SysRoleService {

	@Autowired
	SysRoleMapper sysRoleMapper;
	@Autowired
	SysPowercolumnMapper sysPowercolumnMapper;
	@Autowired
	SysPowerinfoMapper sysPowerinfoMapper;
	
	@Override
	public PageInfo<SysRole> selectAllRoleAndPower(int pageNum, int pageSize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, pageSize);
		ArrayList<SysRole> list = this.sysRoleMapper.selectAllRoleAndPower();
		for (SysRole r : list) {
			SysRole headName = this.sysRoleMapper.selectByPrimaryKey(r.getHeadrid());
			r.setHeadname(headName.getRname());
		}
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

	@Override
	public ArrayList<SysPowercolumn> selectAllColumn() {
		// TODO Auto-generated method stub
		return (ArrayList<SysPowercolumn>) sysPowercolumnMapper.selectByExample(null);
	}

	@Override
	public ArrayList<SysPowerinfo> selectAllPower(BigDecimal pcolumnId) {
		// TODO Auto-generated method stub
		SysPowerinfoExample example = new SysPowerinfoExample();
		Criteria criteria = example.createCriteria();
		criteria.andPcolumnIdEqualTo(pcolumnId);
		return (ArrayList<SysPowerinfo>) sysPowerinfoMapper.selectByExample(example);
	}

	@Override
	public ArrayList<SysPowerinfo> selectPowerChecked(BigDecimal rid) {
		// TODO Auto-generated method stub
		return (ArrayList<SysPowerinfo>) sysPowerinfoMapper.selectPowerChecked(rid);
	}

}
