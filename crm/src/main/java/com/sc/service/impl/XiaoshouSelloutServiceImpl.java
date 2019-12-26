package com.sc.service.impl;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.StoreWhinfo;
import com.sc.entity.XiaoshouSellout;
import com.sc.mapper.XiaoshouSelloutMapper;
import com.sc.service.XiaoshouSelloutService;

@Service
public class XiaoshouSelloutServiceImpl implements XiaoshouSelloutService {
	@Autowired
	XiaoshouSelloutMapper xiaoshouSelloutMapper;
	
	@Override
	public PageInfo<XiaoshouSellout> selectPage(Integer pageNum,Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		PageInfo<XiaoshouSellout> page=new PageInfo<XiaoshouSellout>(this.xiaoshouSelloutMapper.selectByExample(null));
		System.err.println("Service:"+page);
		return page;
	}

	@Override
	public StoreWhinfo in(XiaoshouSellout xiaoshouSellout) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public XiaoshouSellout selectObj(BigDecimal id) {
		if(id==null) {
			System.err.println("发生查询错误！");
			System.err.println(id);
		}
		XiaoshouSellout info=this.xiaoshouSelloutMapper.selectByPrimaryKey(id);
		System.err.println("Service已查询到："+info);
		return info;
	}

	@Override
	public void update(XiaoshouSellout xiaoshouSellout) {
		if(xiaoshouSellout!=null) {
			this.xiaoshouSelloutMapper.updateByPrimaryKey(xiaoshouSellout);
			return;
		}
		else {
			System.err.println("发生更新错误！");
			System.err.println(xiaoshouSellout);
		}
		
	}

	@Override
	public void delete(BigDecimal id) {
		if(id==null) {
			return;
		}
		xiaoshouSelloutMapper.deleteByPrimaryKey(id);
	}

}
