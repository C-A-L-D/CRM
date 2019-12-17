package com.sc.service;

import java.math.BigDecimal;

import com.github.pagehelper.PageInfo;
import com.sc.entity.XiaoshouSellinfo;

public interface XiaoshouSellinfoService {
	public PageInfo<XiaoshouSellinfo> selectPage(Integer pageNum,Integer pageSize);
	public void update(XiaoshouSellinfo xiaoshouSellinfo);
	public XiaoshouSellinfo in(XiaoshouSellinfo xiaoshouSellinfo);
	public XiaoshouSellinfo selectObj(BigDecimal ssid);
}
