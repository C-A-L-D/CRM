package com.sc.service;

import java.math.BigDecimal;

import com.github.pagehelper.PageInfo;
import com.sc.entity.SysLoggong;

public interface SysLoggongService {
	
	public PageInfo<SysLoggong> SelectAllLog(Integer pageNum, Integer pageSize);
	
	public void delLog(BigDecimal lid);
}
