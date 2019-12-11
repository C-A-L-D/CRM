package com.sc.service.impl;

import java.util.ArrayList;

import com.sc.entity.StoreGinfo;

public interface StoreGinfoService {
	public void add(StoreGinfo sinfo);
	public void del(StoreGinfo sinfo);
	public ArrayList<StoreGinfo> selectAll();
	public void update(StoreGinfo sinfo);
}
