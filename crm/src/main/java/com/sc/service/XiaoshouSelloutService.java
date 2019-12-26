package com.sc.service;

import java.math.BigDecimal;

import com.github.pagehelper.PageInfo;
import com.sc.entity.StoreWhinfo;
import com.sc.entity.XiaoshouSellout;

public interface XiaoshouSelloutService {
	public PageInfo<XiaoshouSellout> selectPage(Integer pageNum,Integer pageSize);
	public StoreWhinfo in(XiaoshouSellout xiaoshouSellout);
	public XiaoshouSellout selectObj(BigDecimal id);
	public void update(XiaoshouSellout xiaoshouSellout);
	public void delete(BigDecimal id);
}
