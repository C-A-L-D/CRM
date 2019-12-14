package com.sc.service;

import java.math.BigDecimal;

import com.github.pagehelper.PageInfo;
import com.sc.entity.XiaoshouKehuxinxi;

public interface KehuxinxiService {
	//客户信息列表——分页
	public PageInfo<XiaoshouKehuxinxi> selectKehuxinxiPage(Integer pageNum,Integer pageSize);
	//客户详细信息——弹层
	public XiaoshouKehuxinxi getKehuxiangxi(Long kid);
}
