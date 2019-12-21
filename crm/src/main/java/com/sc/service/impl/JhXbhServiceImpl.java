package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.JhXbh;
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
		//查询当前页的集合数据
		List<JhXbh> list = this.jhXbhMapper.selectByExample(null);
		//封装成pageinfo对象
		PageInfo<JhXbh> page=new PageInfo<JhXbh>(list);
		
		return page;
	}

	@Override
	public void add(JhXbh jx) {
		if(jx!=null){
			  this.jhXbhMapper.insert(jx);
			}

	}

	@Override
	public List<JhXbh> getall() {
					
			return this.jhXbhMapper.selectByExample(null);
				
	}

}
