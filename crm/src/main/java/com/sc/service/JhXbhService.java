package com.sc.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.sc.entity.JhXbh;
import com.sc.entity.StoreGinfo;

public interface JhXbhService {

	
	 public PageInfo<JhXbh> selectpage(Integer pageNum,Integer pageSize,JhXbh jc);
	 
	 public void add(JhXbh jx);
	 
	 public List<JhXbh> getall(StoreGinfo sg);
	 
	 public JhXbh get(Long id);
	 
	 public void delete(JhXbh u);
	 
	 
}
