package com.sc.service.impl;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.StoreWhinfo;
import com.sc.entity.XiaoshouSellinfo;
import com.sc.mapper.XiaoshouSellinfoMapper;
import com.sc.service.XiaoshouSellinfoService;

@Service
public class XiaoshouSellinfoServiceImpl implements XiaoshouSellinfoService {
	@Autowired
	XiaoshouSellinfoMapper xiaoshouSellinfoMapper;
	
	@Override
	public PageInfo<XiaoshouSellinfo> selectPage(Integer pageNum,Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		PageInfo<XiaoshouSellinfo> page=new PageInfo<XiaoshouSellinfo>(this.xiaoshouSellinfoMapper.selectByExample(null));
		System.err.println("Service:"+page);
		return page;
	}

	@Override
	public void update(XiaoshouSellinfo xiaoshouSellinfo) {
		// TODO Auto-generated method stub

	}

	@Override
	public XiaoshouSellinfo in(XiaoshouSellinfo xiaoshouSellinfo) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public XiaoshouSellinfo selectObj(BigDecimal ssid) {
		if(ssid==null) {
			System.err.println("发生查询错误！");
			System.err.println(ssid);
		}
		XiaoshouSellinfo info=this.xiaoshouSellinfoMapper.selectByPrimaryKey(ssid);
		System.err.println("Service已查询到："+info);
		return info;
	}

}
