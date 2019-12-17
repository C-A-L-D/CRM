package com.sc.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.SysDepartment;
import com.sc.entity.SysGongsiinfo;
import com.sc.entity.SysJobinfo;
import com.sc.entity.SysUsersInfo;
import com.sc.entity.SysUsersInfoExample;
import com.sc.entity.SysUsersInfoExample.Criteria;
import com.sc.mapper.SysGongsiinfoMapper;
import com.sc.mapper.SysJobinfoMapper;
import com.sc.mapper.SysUsersInfoMapper;

import com.sc.service.SysUsersInfoService;

@Service
public class SysUsersInfoServiceImpl implements SysUsersInfoService {
@Autowired
SysUsersInfoMapper sysUsersInfoMapper;
@Autowired
SysGongsiinfoMapper sysGongsiinfoMapper;
@Autowired
SysJobinfoMapper sysJobinfoMapper;
	
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
			return	this.sysUsersInfoMapper.selectByPrimaryKey(sid);
		}
		return null;
	}

	@Override
	public List<SysUsersInfo> select() {
		
	return	this.sysUsersInfoMapper.selectByExample(null);
	}
	
	@Override
	public List<SysGongsiinfo> select1() {
		// TODO Auto-generated method stub
	
		return	this.sysGongsiinfoMapper.selectByExample(null);
	}
	
	@Override
	public List<SysJobinfo> select3() {
		// TODO Auto-generated method stub
	
		return	this.sysJobinfoMapper.selectByExample(null);
	}

	@Override
	public SysUsersInfo login(SysUsersInfo u) {
		
		return null;
	}

	
	@Override
	public PageInfo<SysUsersInfo> selectpage(Integer pageNum, Integer pageSize,SysUsersInfo info1) {
		//设置分页数据，开始分页
		PageHelper.startPage(pageNum, pageSize);
		SysUsersInfoExample example=new SysUsersInfoExample();
		  example.setOrderByClause(" sid desc ");//通过id编号降序排列，注意名称一定是列名
		 if(info1!=null){
			  Criteria c = example.createCriteria();
			  if(info1.getSname()!=null&&!info1.getSname().equals("")){
			     c.andSnameLike("%"+info1.getSname() +"%");
			  }
		 }
		//查询当前页的集合数据
			List<SysUsersInfo> list = this.sysUsersInfoMapper.selectByExample(example);
		//封装成pageinfo对象
		PageInfo<SysUsersInfo> page=new PageInfo<SysUsersInfo>(list);
		
		return page;
	}




}
