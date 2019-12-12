package com.sc.service;

import java.util.ArrayList;

import com.github.pagehelper.PageInfo;
import com.sc.entity.StoreGinfo;

public interface StoreGinfoService {
	public void add(StoreGinfo sinfo);
	public void del(StoreGinfo sinfo);
	public ArrayList<StoreGinfo> selectAll();
	public void update(StoreGinfo sinfo);
	public PageInfo<StoreGinfo> selectPage(Integer pageNum,Integer pageSize);
}
