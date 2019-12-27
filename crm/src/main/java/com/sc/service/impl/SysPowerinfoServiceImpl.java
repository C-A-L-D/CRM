package com.sc.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.SysPowerRole;
import com.sc.entity.SysPowercolumn;
import com.sc.entity.SysPowerinfo;
import com.sc.entity.SysPowerinfoExample;
import com.sc.entity.SysPowerinfoExample.Criteria;
import com.sc.entity.SysUsersInfoExample;
import com.sc.mapper.SysPowerRoleMapper;
import com.sc.mapper.SysPowercolumnMapper;
import com.sc.mapper.SysPowerinfoMapper;
import com.sc.service.SysPowerinfoService;

@Service
public class SysPowerinfoServiceImpl implements SysPowerinfoService {

	@Autowired
	private SysPowerinfoMapper sysPowerinfoMapper;
	@Autowired
	private SysPowerRoleMapper sysPowerRoleMapper;
	@Autowired
	private SysPowercolumnMapper sysPowercolumnMapper;
	
	@Override
	public PageInfo<SysPowerinfo> selectAllPowerAndCol(int pageNum, int pageSize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, pageSize);
		List<SysPowerinfo> list = sysPowerinfoMapper.selectAllPowerAndCol();
		return new PageInfo<SysPowerinfo>(list);
	}

	@Override
	public SysPowerinfo goUpdatePower(BigDecimal pid) {
		// TODO Auto-generated method stub
		return sysPowerinfoMapper.selectByPrimaryKey(pid);
	}

	@Override
	public void updatePow(SysPowerinfo sysPowerinfo) {
		// TODO Auto-generated method stub
		sysPowerinfoMapper.updateByPrimaryKeySelective(sysPowerinfo);
	}

	@Override
	public void delPow(SysPowerinfo sysPowerinfo) {
		// TODO Auto-generated method stub
		sysPowerinfoMapper.deleteByPrimaryKey(sysPowerinfo.getPid());
	}

	@Override
	public void delPow(BigDecimal pid) {
		// TODO Auto-generated method stub
		sysPowerRoleMapper.delPow(pid);
	}

	@Override
	public void delAllPow(BigDecimal pid) {
		// TODO Auto-generated method stub
		sysPowerinfoMapper.deleteByPrimaryKey(pid);
	}

	@Override
	public void addPowCol(SysPowercolumn sysPowercolumn) {
		// TODO Auto-generated method stub
		sysPowercolumnMapper.insertSelective(sysPowercolumn);
	}

	@Override
	public void addNewPower(SysPowerinfo sysPowerinfo) {
		// TODO Auto-generated method stub
		sysPowerinfoMapper.insertSelective(sysPowerinfo);
	}

	@Override
	public List<SysPowerinfo> selectAllPower() {
		// TODO Auto-generated method stub
		return sysPowerinfoMapper.selectByExample(null);
	}

	@Override
	public ArrayList<SysPowerinfo> selectPowerInfo(BigDecimal rid) {
		// TODO Auto-generated method stub
		return (ArrayList<SysPowerinfo>) sysPowerinfoMapper.selectPowerChecked(rid);
	}

	@Override
	public void delPowerAndPR(BigDecimal pcolumnId) {
		// TODO Auto-generated method stub
		SysPowerinfoExample example = new SysPowerinfoExample();
		Criteria criteria = example.createCriteria();
		criteria.andPcolumnIdEqualTo(pcolumnId);
		sysPowerinfoMapper.deleteByExample(example);
	}

	@Override
	public ArrayList<SysPowerinfo> selectPowerBycolumnId(BigDecimal pcolumnId) {
		// TODO Auto-generated method stub
		SysPowerinfoExample example = new SysPowerinfoExample(); 
		Criteria criteria = example.createCriteria();
		criteria.andPcolumnIdEqualTo(pcolumnId);
		return (ArrayList<SysPowerinfo>) sysPowerinfoMapper.selectByExample(example);
	}

}
