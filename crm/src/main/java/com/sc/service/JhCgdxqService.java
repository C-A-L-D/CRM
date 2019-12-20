package com.sc.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.sc.entity.JhCgd;
import com.sc.entity.JhCgdxq;

public interface JhCgdxqService {

	public PageInfo<JhCgdxq> selectpage(Integer pageNum,Integer pageSize,JhCgd jc);
	
	  public JhCgdxq get(Long cgXqId);
		 
	  public void update(JhCgdxq u);
	
	  public void delete(JhCgdxq u);
	  
	  public void add(JhCgdxq u);
	  
	  public List<JhCgdxq> getall(Long cgdId);
	  
	 
}



