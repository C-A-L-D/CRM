package com.sc.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.github.pagehelper.PageInfo;
import com.sc.entity.SysPowercolumn;
import com.sc.entity.SysPowerinfo;

public interface SysPowerinfoService {

	public PageInfo<SysPowerinfo> selectAllPowerAndCol(int pageNum, int pageSize);
	
	public SysPowerinfo goUpdatePower(BigDecimal pid);
	
	public void updatePow(SysPowerinfo sysPowerinfo);
	
	public void delPow(SysPowerinfo sysPowerinfo);
	
	public void delPow(BigDecimal pid);
	
	public void delAllPow(BigDecimal pid);
	
	void addPowCol(SysPowercolumn sysPowercolumn);
	
	void addNewPower(SysPowerinfo sysPowerinfo);
	
	List<SysPowerinfo> selectAllPower();
	
	public ArrayList<SysPowerinfo> selectPowerInfo(BigDecimal rid);
	
	void delPowerAndPR(BigDecimal pcolumnId);
	
	ArrayList<SysPowerinfo> selectPowerBycolumnId(BigDecimal pcolumnId);
}
