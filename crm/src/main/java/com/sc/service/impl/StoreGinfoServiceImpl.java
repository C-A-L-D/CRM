package com.sc.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.StoreGinfo;
import com.sc.entity.StoreGinfoExample;
import com.sc.entity.StoreWhinfo;
import com.sc.mapper.StoreGinfoMapper;
import com.sc.service.StoreGinfoService;

@Service
public class StoreGinfoServiceImpl implements StoreGinfoService{
	@Autowired
	StoreGinfoMapper storeGinfoMapper;
	
	@Override
	public ArrayList<StoreGinfo> selectAll() {
		StoreGinfoExample example=new StoreGinfoExample();
		example.setOrderByClause("GID DESC");
		ArrayList<StoreGinfo> list=(ArrayList<StoreGinfo>) this.storeGinfoMapper.selectByExample(example);
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
	public void del(int gid) {
		BigDecimal tmp=BigDecimal.valueOf((Integer)gid);
		if(gid!=0&&gid!=-1) {
			this.storeGinfoMapper.deleteByPrimaryKey(tmp);
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

	@Override
	public PageInfo<StoreGinfo> selectPage(Integer pageNum,Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		PageInfo<StoreGinfo> page=new PageInfo<StoreGinfo>(this.selectAll());
		System.err.println(page);
		return page;
	}

	@Override
	public StoreGinfo getsgi(BigDecimal gid) {
		if(gid!=null) {
			StoreGinfo sgi = this.storeGinfoMapper.selectByPrimaryKey(gid);
			return sgi;
		}
		else {
			System.err.println("对象为空！");
		}
		return null;
	}

	@Override
	public StoreGinfo selectObj(BigDecimal id) {
		if(id==null) {
			System.err.println("发生查询错误！");
			System.err.println(id);
		}
		StoreGinfo info=this.storeGinfoMapper.selectByPrimaryKey(id);
		System.err.println("Service已查询到："+info);
		return info;
	}

	@Override
	public ArrayList<BigDecimal> selectGid() {
		ArrayList<StoreGinfo> list = this.selectAll();
		ArrayList<BigDecimal> idlist=new ArrayList<BigDecimal>();
		for(StoreGinfo sgi:list) {
			idlist.add(sgi.getGid());
		}
		return idlist;
	}

	@Override
	public boolean hasSgi(BigDecimal whid) {
		ArrayList<StoreGinfo> list = this.selectAll();
		for(StoreGinfo sgi:list) {
			if(sgi.getWhid().equals(whid)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public ArrayList<StoreGinfo> selectByWhid(BigDecimal whid) {
		if(whid==null) {
			System.err.println("发生查询错误！");
			System.err.println(whid);
		}
		ArrayList<StoreGinfo> list = (ArrayList<StoreGinfo>) storeGinfoMapper.selectByWhid(whid);
		return list;
	}
	
	
}
