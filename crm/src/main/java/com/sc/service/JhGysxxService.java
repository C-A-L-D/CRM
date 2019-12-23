package com.sc.service;

import java.math.BigDecimal;
import java.util.List;

import com.github.pagehelper.PageInfo;
import com.sc.entity.JhGysxx;


public interface JhGysxxService {
	
	
	  public PageInfo<JhGysxx> selectpage(Integer pageNum,Integer pageSize,JhGysxx u);

	  public JhGysxx get(BigDecimal gysId);
	 
	  public void update(JhGysxx u);
	
	  public void delete(JhGysxx u);
	  
	  public void add(JhGysxx u);
	  
	  public List<JhGysxx> select();
	  
	
	  
}
