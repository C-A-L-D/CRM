package com.sc.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.sc.entity.JhGysxx;


public interface JhGysxxService {
	
	
	public PageInfo<JhGysxx> selectpage(Integer pageNum,Integer pageSize);
}
