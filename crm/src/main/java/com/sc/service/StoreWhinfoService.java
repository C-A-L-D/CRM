package com.sc.service;

import java.math.BigDecimal;
import java.util.ArrayList;

import com.github.pagehelper.PageInfo;
import com.sc.entity.StoreGinfo;
import com.sc.entity.StoreWhinfo;

public interface StoreWhinfoService {
	public PageInfo<StoreWhinfo> selectPage(Integer pageNum,Integer pageSize);
	public void add(StoreWhinfo storeWhinfo);
	public void update(StoreWhinfo storeWhinfo);
	public StoreWhinfo selectObj(BigDecimal whid);
	public void del(BigDecimal whid);
	public PageInfo<StoreGinfo> selectSgi(BigDecimal whid,Integer pageNum,Integer pageSize);
	public ArrayList<BigDecimal> selectWhid();
}
