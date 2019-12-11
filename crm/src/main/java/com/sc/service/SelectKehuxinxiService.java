package com.sc.service;

import com.github.pagehelper.PageInfo;
import com.sc.entity.XiaoshouKehuxinxi;

public interface SelectKehuxinxiService {
	public PageInfo<XiaoshouKehuxinxi> selectpage(Integer pageNum,Integer pageSize);
}
