package com.sc.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.SysLoggong;
import com.sc.entity.SysLoggongExample;
import com.sc.mapper.SysLoggongMapper;
import com.sc.service.SysLoggongService;

@Service
public class SysLoggongServiceImpl implements SysLoggongService {

	@Autowired
	SysLoggongMapper sysLoggongMapper;

	@Override
	public PageInfo<SysLoggong> SelectAllLog(Integer pageNum, Integer pageSize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, pageSize);
		SysLoggongExample example = new SysLoggongExample();
		example.setOrderByClause(" lid desc ");
		List<SysLoggong> list = sysLoggongMapper.selectByExample(example);
		return new PageInfo<SysLoggong>(list);
	}

	@Override
	public void delLog(BigDecimal lid) {
		// TODO Auto-generated method stub
		sysLoggongMapper.deleteByPrimaryKey(lid);
	}
}
