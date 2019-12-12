package com.sc.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sc.entity.StoreGinfo;
import com.sc.mapper.StoreGinfoMapper;
import com.sc.service.StoreGinfoService;

@Service
public class StoreGinfoServiceImpl implements StoreGinfoService{
	@Autowired
	StoreGinfoMapper storeGinfoMapper;
	
	@Override
	public ArrayList<StoreGinfo> selectAll() {
		ArrayList<StoreGinfo> list=(ArrayList<StoreGinfo>) this.storeGinfoMapper.selectByExample(null);
		return list;
	}
	
	@Override
	public void add(StoreGinfo sinfo) {
		if(sinfo!=null) {
			this.storeGinfoMapper.insert(sinfo);
		}
		else {
			System.err.println("对象为空！");
		}
	}

	@Override
	public void del(StoreGinfo sinfo) {
		if(sinfo!=null) {
			this.storeGinfoMapper.deleteByPrimaryKey(sinfo.getGid());
		}
		else {
			System.err.println("对象为空！");
		}
	}

	@Override
	public void update(StoreGinfo sinfo) {
		if(sinfo!=null) {
			this.storeGinfoMapper.updateByPrimaryKey(sinfo);
		}
		else {
			System.err.println("对象为空！");
		}
		
	}
	
}
