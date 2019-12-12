package com.sc.service;

import java.math.BigDecimal;

import com.github.pagehelper.PageInfo;
import com.sc.entity.JhGysxx;


public interface JhGysxxService {
	
	
	public PageInfo<JhGysxx> selectpage(Integer pageNum,Integer pageSize);

	public JhGysxx get(BigDecimal gysId);
	
}
