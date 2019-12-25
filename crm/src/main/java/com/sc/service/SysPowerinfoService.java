package com.sc.service;

import java.math.BigDecimal;

import com.github.pagehelper.PageInfo;
import com.sc.entity.SysPowerinfo;

public interface SysPowerinfoService {

	public PageInfo<SysPowerinfo> selectAllPowerAndCol(int pageNum, int pageSize);
	
	public SysPowerinfo goUpdatePower(BigDecimal pid);
	
	public void updatePow(SysPowerinfo sysPowerinfo);
	
	public void delPow(SysPowerinfo sysPowerinfo);
	
	public void delPow(BigDecimal pid);
	
	public void delAllPow(BigDecimal pid);
}
