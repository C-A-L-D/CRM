package com.sc.service;

import com.github.pagehelper.PageInfo;
import com.sc.entity.StoreWhinfo;
import com.sc.entity.XiaoshouSellout;

public interface XiaoshouSelloutService {
	public PageInfo<XiaoshouSellout> selectPage(Integer pageNum,Integer pageSize);
	public StoreWhinfo in(XiaoshouSellout xiaoshouSellout);
}
