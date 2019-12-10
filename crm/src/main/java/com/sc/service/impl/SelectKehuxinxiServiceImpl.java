package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.XiaoshouKehuxinxi;
import com.sc.mapper.XiaoshouKehuxinxiMapper;
import com.sc.service.SelectKehuxinxiService;

@Service
public class SelectKehuxinxiServiceImpl implements SelectKehuxinxiService {
	
	@Autowired
	XiaoshouKehuxinxiMapper xiaoshouKehuxinxiMapper;
	
	@Override
	public PageInfo<XiaoshouKehuxinxi> selectpage(Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<XiaoshouKehuxinxi> list=this.xiaoshouKehuxinxiMapper.selectByExample(null);
		PageInfo<XiaoshouKehuxinxi> page=new PageInfo<XiaoshouKehuxinxi>(list);
		return page;
	}

}
