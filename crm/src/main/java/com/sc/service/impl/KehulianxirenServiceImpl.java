package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.XiaoshouKehulianxiren;
import com.sc.entity.XiaoshouKehulianxirenExample;
import com.sc.entity.XiaoshouKehulianxirenExample.Criteria;
import com.sc.entity.XiaoshouKehuxinxi;
import com.sc.mapper.XiaoshouKehulianxirenMapper;
import com.sc.service.KehulianxirenService;

@Service
public class KehulianxirenServiceImpl implements KehulianxirenService {
	
	@Autowired
	XiaoshouKehulianxirenMapper xiaoshouKehulianxirenMapper;
	
	@Override
	public PageInfo<XiaoshouKehulianxiren> selectKehulianxiren(Integer pageNum, Integer pageSize, Long kid) {
		PageHelper.startPage(pageNum, pageSize);
		XiaoshouKehulianxirenExample example = new XiaoshouKehulianxirenExample();
		example.setOrderByClause(" lid desc ");
		Criteria criteria = example.createCriteria();
		criteria.andKidEqualTo(kid);
		List<XiaoshouKehulianxiren> list=this.xiaoshouKehulianxirenMapper.selectByExample(example);
		PageInfo<XiaoshouKehulianxiren> page=new PageInfo<XiaoshouKehulianxiren>(list);
		return page;
	}

	@Override
	public XiaoshouKehulianxiren getKehulianxiren(Long lid) {
		if(lid!=null){
			return this.xiaoshouKehulianxirenMapper.selectByPrimaryKey(lid);
		}
		return null;
	}

	@Override
	public void updateKehulianxiren(XiaoshouKehulianxiren lxr) {
		if(lxr!=null){
			this.xiaoshouKehulianxirenMapper.updateByPrimaryKey(lxr);
		}
	}

	@Override
	public void addKehulianxiren(XiaoshouKehulianxiren lxr) {
		if(lxr!=null){
			this.xiaoshouKehulianxirenMapper.insert(lxr);
		}
	}

	@Override
	public PageInfo<XiaoshouKehulianxiren> selectKehulianxiren(Integer pageNum, Integer pageSize, Long kid,
			String lianxirenxingming) {
		PageHelper.startPage(pageNum, pageSize);
		XiaoshouKehulianxirenExample example = new XiaoshouKehulianxirenExample();
		example.setOrderByClause(" lid desc ");
		Criteria criteria = example.createCriteria();
		criteria.andKidEqualTo(kid);
		List<XiaoshouKehulianxiren> list=this.xiaoshouKehulianxirenMapper.selectByExample(example);
		PageInfo<XiaoshouKehulianxiren> page=new PageInfo<XiaoshouKehulianxiren>(list);
		return page;
	}

	@Override
	public void deleteKehulianxiren(XiaoshouKehulianxiren lxr) {
		// TODO Auto-generated method stub
		
	}

}
