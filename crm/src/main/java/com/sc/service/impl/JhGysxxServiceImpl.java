package com.sc.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.JhGysxx;
import com.sc.mapper.JhGysxxMapper;
import com.sc.service.JhGysxxService;
@Service
public class JhGysxxServiceImpl implements JhGysxxService {

	@Autowired
	JhGysxxMapper jhGysxxMapper;
	
	

	@Override
	public PageInfo<JhGysxx> selectpage(Integer pageNum, Integer pageSize) {
		//设置分页数据，开始分页
		PageHelper.startPage(pageNum, pageSize);
		//查询当前页的集合数据
		List<JhGysxx> list = this.jhGysxxMapper.selectByExample(null);
		//封装成pageinfo对象
		PageInfo<JhGysxx>page=new PageInfo<JhGysxx>(list);
		
		return page;
	}



	@Override
	public JhGysxx get(BigDecimal gysId) {

		// TODO Auto-generated method stub

		if(gysId!=null){
			return this.jhGysxxMapper.selectByPrimaryKey(gysId);
		}
			return null;
	}



	@Override
	public void update(JhGysxx u) {
		if(u!=null&&u.getGysId()!=null){
			this.jhGysxxMapper.updateByPrimaryKey(u);
		}
	}



	@Override
	public void delete(JhGysxx u) {
		if(u!=null){
			this.jhGysxxMapper.deleteByPrimaryKey(u.getGysId());
		}
	}



	@Override
	public void add(JhGysxx u) {
		if(u!=null){
			  this.jhGysxxMapper.insert(u);
			}

	}

}
