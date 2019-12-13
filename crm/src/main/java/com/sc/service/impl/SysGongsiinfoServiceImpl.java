package com.sc.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.SysDepartment;
import com.sc.entity.SysGongsiinfo;
import com.sc.entity.SysGongsiinfoExample;
import com.sc.entity.SysGongsiinfoExample.Criteria;
import com.sc.mapper.SysDepartmentMapper;
import com.sc.mapper.SysGongsiinfoMapper;
import com.sc.service.SysGongsiinfoService;

@Service
public class SysGongsiinfoServiceImpl implements SysGongsiinfoService {

	@Autowired
	SysGongsiinfoMapper sysGongsiinfoMapper;
		
		@Override
		public void add(SysGongsiinfo g) {
			if(g!=null){
				this.sysGongsiinfoMapper.insert(g);
			}

		}

		@Override
		public void update(SysGongsiinfo g) {
			if(g!=null){
				this.sysGongsiinfoMapper.updateByPrimaryKey(g);
			}

		}

		@Override
		public void delete(SysGongsiinfo g) {
			if(g!=null){
				this.sysGongsiinfoMapper.deleteByPrimaryKey(g.getId());
			}

		}

		@Override
		public SysGongsiinfo get(BigDecimal id) {
			if(id!=null){
				return	this.sysGongsiinfoMapper.selectByPrimaryKey(id);
			}
			return null;
		}

		@Override
		public List<SysGongsiinfo> select() {
			// TODO Auto-generated method stub
			return	this.sysGongsiinfoMapper.selectByExample(null);
		}

		@Override
		public PageInfo<SysGongsiinfo> selectpage(Integer pageNum, Integer pageSize) {
			//设置分页数据，开始分页
			PageHelper.startPage(pageNum, pageSize);
		    SysGongsiinfoExample example=new SysGongsiinfoExample();
		     example.setOrderByClause(" id desc ");//通过id编号降序排列，注意名称一定是列名
		   
			//查询当前页的集合数据
			List<SysGongsiinfo> list = this.sysGongsiinfoMapper.selectByExample(example);
			//封装成pageinfo对象
			PageInfo<SysGongsiinfo> page=new PageInfo<SysGongsiinfo>(list);
			
			return page;
		}

}
