package com.sc.service.impl;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sc.mapper.SysPowercolumnMapper;
import com.sc.service.SysPowercolumnService;

@Service
public class SysPowercolumnServiceImpl implements SysPowercolumnService {

	@Autowired
	SysPowercolumnMapper sysPowercolumnMapper;
	
	@Override
	public void delColumn(BigDecimal cid) {
		// TODO Auto-generated method stub
		sysPowercolumnMapper.deleteByPrimaryKey(cid);
	}

}
