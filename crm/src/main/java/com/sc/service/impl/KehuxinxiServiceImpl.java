package com.sc.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.XiaoshouKehuxinxi;
import com.sc.mapper.XiaoshouKehuxinxiMapper;
import com.sc.service.KehuxinxiService;

@Service
public class KehuxinxiServiceImpl implements KehuxinxiService {
	
	@Autowired
	XiaoshouKehuxinxiMapper xiaoshouKehuxinxiMapper;
	
	@Override
	public PageInfo<XiaoshouKehuxinxi> selectKehuxinxiPage(Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<XiaoshouKehuxinxi> list=this.xiaoshouKehuxinxiMapper.selectByExample(null);
		PageInfo<XiaoshouKehuxinxi> page=new PageInfo<XiaoshouKehuxinxi>(list);
		return page;
	}

	@Override
	public XiaoshouKehuxinxi getKehuxiangxi(Long kid) {
		if(kid!=null){
			return this.xiaoshouKehuxinxiMapper.selectByPrimaryKey(kid);
		}
		return null;
	}

	@Override
	public void updateKehuxinxi(XiaoshouKehuxinxi xk) {
		if(xk!=null){
			this.xiaoshouKehuxinxiMapper.updateByPrimaryKey(xk);
		}
	}

}
