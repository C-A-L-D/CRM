package com.sc.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.SysUsersInfo;

import com.sc.mapper.SysUsersInfoMapper;

import com.sc.service.SysUsersInfoService;

@Service
public class SysUsersInfoServiceImpl implements SysUsersInfoService {
@Autowired
SysUsersInfoMapper sysUsersInfoMapper;
	
	@Override
	public void add(SysUsersInfo u) {
		if(u!=null){
			this.sysUsersInfoMapper.insert(u);
		}
        
	}

	@Override
	public void update(SysUsersInfo u) {
		if(u!=null){
			this.sysUsersInfoMapper.updateByPrimaryKey(u);
		}

	}

	@Override
	public void delete(SysUsersInfo u) {
		if(u!=null){
			this.sysUsersInfoMapper.deleteByPrimaryKey(u.getSid());
		}

	}

	@Override
	public SysUsersInfo get(BigDecimal sid) {
		
		if(sid!=null){
			this.sysUsersInfoMapper.selectByPrimaryKey(sid);
		}
		return null;
	}

	@Override
	public List<SysUsersInfo> select() {
		
	return	this.sysUsersInfoMapper.selectByExample(null);
	}

	@Override
	public SysUsersInfo login(SysUsersInfo u) {
		
		return null;
	}

	
	@Override
	public PageInfo<SysUsersInfo> selectpage(Integer pageNum, Integer pageSize) {
		//设置分页数据，开始分页
		PageHelper.startPage(pageNum, pageSize);
		//查询当前页的集合数据
		List<SysUsersInfo> list = this.sysUsersInfoMapper.selectByExample(null);
		//封装成pageinfo对象
		PageInfo<SysUsersInfo> page=new PageInfo<SysUsersInfo>(list);
		
		return page;
	}


	

}
