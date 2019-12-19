package com.sc.service;

import com.github.pagehelper.PageInfo;
import com.sc.entity.JhCgd;
import com.sc.entity.JhCgdxq;

public interface JhCgdService {

	  public PageInfo<JhCgd> selectpage(Integer pageNum,Integer pageSize,JhCgd jc);

	  public JhCgd get(Long cgdId);
	  
	  public void add(JhCgd jc);
	  
	  public void update(JhCgd jc);
	  
	  
	
}
