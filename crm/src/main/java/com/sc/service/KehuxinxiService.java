package com.sc.service;

import com.github.pagehelper.PageInfo;
import com.sc.entity.XiaoshouKehuxinxi;

public interface KehuxinxiService {
	public PageInfo<XiaoshouKehuxinxi> selectKehuxinxiPage(Integer pageNum,Integer pageSize);
}
