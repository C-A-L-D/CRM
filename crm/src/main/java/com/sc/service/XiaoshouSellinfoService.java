package com.sc.service;

import java.math.BigDecimal;

import com.github.pagehelper.PageInfo;
import com.sc.entity.XiaoshouSellinfo;

public interface XiaoshouSellinfoService {
	public PageInfo<XiaoshouSellinfo> selectPage(Integer pageNum,Integer pageSize);
	public void update(XiaoshouSellinfo xiaoshouSellinfo);
	public XiaoshouSellinfo selectObj(BigDecimal ssid);
	public PageInfo<XiaoshouSellinfo> selectSid(Integer pageNum,Integer pageSize,BigDecimal sid);
	public void outSinfo(XiaoshouSellinfo xiaoshouSellinfo);
	public void delete(BigDecimal id);
}
