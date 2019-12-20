package com.sc.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.JhCgd;
import com.sc.entity.JhXbh;
import com.sc.entity.StoreGinfoExample;
import com.sc.entity.StoreGinfoExample.Criteria;
import com.sc.mapper.JhCgdMapper;
import com.sc.mapper.JhXbhMapper;
import com.sc.mapper.StoreGinfoMapper;
import com.sc.service.JhXbhService;
@Service
public class JhXbhServiceImpl implements JhXbhService {

	@Autowired
	JhXbhMapper jhXbhMapper;
	@Autowired
	JhCgdMapper jhCgdMapper;
	@Autowired
	StoreGinfoMapper storeGinfoMapper;
	@Override
	public PageInfo<JhXbh> selectpage(Integer pageNum, Integer pageSize, JhXbh jx) {
		//设置分页数据，开始分页
		PageHelper.startPage(pageNum, pageSize);
		StoreGinfoExample ex=new StoreGinfoExample();
		Criteria criteria = ex.createCriteria();
		criteria.andStorenumBetween(new BigDecimal(0),new BigDecimal(300));			
		//查询当前页的集合数据
		List<JhXbh> list = this.jhXbhMapper.selectByExample(null);
		//封装成pageinfo对象
		PageInfo<JhXbh> page=new PageInfo<JhXbh>(list);
		
		return page;
	}

	@Override
	public void add(JhCgd jc) {
		if(jc!=null){
			  this.jhCgdMapper.insert(jc);
			}

	}

}
