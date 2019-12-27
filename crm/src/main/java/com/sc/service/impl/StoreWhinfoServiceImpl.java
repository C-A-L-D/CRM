package com.sc.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.StoreGinfo;
import com.sc.entity.StoreWhinfo;
import com.sc.mapper.StoreGinfoMapper;
import com.sc.mapper.StoreWhinfoMapper;
import com.sc.service.StoreWhinfoService;

@Service
public class StoreWhinfoServiceImpl implements StoreWhinfoService{
	@Autowired
	StoreWhinfoMapper storeWhinfoMapper;
	
	@Autowired
	StoreGinfoMapper storeGinfoMapper;
	
	@Override
	public PageInfo<StoreWhinfo> selectPage(Integer pageNum,Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		PageInfo<StoreWhinfo> page=new PageInfo<StoreWhinfo>(this.storeWhinfoMapper.selectByExample(null));
		System.err.println(page);
		return page;
	}

	@Override
	public void add(StoreWhinfo storeWhinfo) {
		if(storeWhinfo!=null) {
			this.storeWhinfoMapper.insert(storeWhinfo);
			return;
		}
		else {
			System.err.println("发生插入错误！");
			System.err.println(storeWhinfo);
		}
	}
	
	@Override
	public void update(StoreWhinfo storeWhinfo) {
		if(storeWhinfo!=null) {
			this.storeWhinfoMapper.updateByPrimaryKey(storeWhinfo);
			return;
		}
		else {
			System.err.println("发生更新错误！");
			System.err.println(storeWhinfo);
		}
		
	}

	@Override
	public StoreWhinfo selectObj(BigDecimal whid) {
		if(whid==null) {
			System.err.println("发生查询错误！");
			System.err.println(whid);
		}
		StoreWhinfo info=this.storeWhinfoMapper.selectByPrimaryKey(whid);
		System.err.println("Service已查询到："+info);
		return info;
	}

	@Override
	public void del(BigDecimal whid) {
		if(whid==null) {
			System.err.println("发生删除错误！");
			System.err.println(whid);
			return;
		}
		this.storeWhinfoMapper.deleteByPrimaryKey(whid);
	}

	@Override
	public PageInfo<StoreGinfo> selectSgi(BigDecimal whid,Integer pageNum,Integer pageSize) {
		if(whid==null) {
			System.err.println("发生查询错误！");
			System.err.println(whid);
			return null;
		}
		PageHelper.startPage(pageNum,pageSize);
		PageInfo<StoreGinfo> page=new PageInfo<StoreGinfo>(this.storeGinfoMapper.selectByWhid(whid));
		System.err.println("impl"+this.storeGinfoMapper);
		return page;
	}

	@Override
	public ArrayList<BigDecimal> selectWhid() {
		ArrayList<StoreWhinfo> list = (ArrayList<StoreWhinfo>) storeWhinfoMapper.selectByExample(null);
		ArrayList<BigDecimal> blist=new ArrayList<BigDecimal>();
		for(StoreWhinfo swi:list) {
			blist.add(swi.getWhid());
		}
		System.err.println(blist);
		return blist;
	}

	
}
