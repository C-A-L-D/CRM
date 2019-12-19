package com.sc.service;

import com.github.pagehelper.PageInfo;
import com.sc.entity.JhCgd;
import com.sc.entity.JhXbh;

public interface JhXbhService {

	
	 public PageInfo<JhXbh> selectpage(Integer pageNum,Integer pageSize,JhXbh jx);
	 
	 public void add(JhCgd jc);
}
