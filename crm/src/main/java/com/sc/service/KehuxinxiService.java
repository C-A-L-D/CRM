package com.sc.service;

import java.math.BigDecimal;

import com.github.pagehelper.PageInfo;
import com.sc.entity.XiaoshouKehuxinxi;

public interface KehuxinxiService {
	//客户信息列表——分页
	public PageInfo<XiaoshouKehuxinxi> selectKehuxinxiPage(Integer pageNum,Integer pageSize);
	//获取对象
	public XiaoshouKehuxinxi getKehuxiangxi(Long kid);
	//客户信息编辑——弹层
	public void updateKehuxinxi(XiaoshouKehuxinxi xk);
}
