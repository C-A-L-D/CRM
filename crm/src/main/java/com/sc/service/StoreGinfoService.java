package com.sc.service;

import java.math.BigDecimal;
import java.util.ArrayList;

import com.github.pagehelper.PageInfo;
import com.sc.entity.StoreGinfo;

public interface StoreGinfoService {
	public void add(StoreGinfo sinfo);
	public void del(int gid);
	public ArrayList<StoreGinfo> selectAll();
	public void update(StoreGinfo sinfo);
	public PageInfo<StoreGinfo> selectPage(Integer pageNum,Integer pageSize);
	public StoreGinfo getsgi(BigDecimal gid);
	public StoreGinfo selectObj(BigDecimal id);
	public ArrayList<BigDecimal> selectGid();
}
