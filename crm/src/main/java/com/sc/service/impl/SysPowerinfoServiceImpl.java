package com.sc.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.SysPowerinfo;
import com.sc.mapper.SysPowerinfoMapper;
import com.sc.service.SysPowerinfoService;

@Service
public class SysPowerinfoServiceImpl implements SysPowerinfoService {

	@Autowired
	private SysPowerinfoMapper sysPowerinfoMapper;
	
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

}
