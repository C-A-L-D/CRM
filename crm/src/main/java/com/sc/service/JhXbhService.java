package com.sc.service;

import java.math.BigDecimal;
import java.util.List;

import com.github.pagehelper.PageInfo;
import com.sc.entity.JhXbh;

public interface JhXbhService {

	
	 public PageInfo<JhXbh> selectpage(Integer pageNum,Integer pageSize,JhXbh jx);
	 
	 public void add(JhXbh jx);
	 
	 public List<JhXbh> getall();
	 
	 
}
