package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.XiaoshouKehulianxiren;
import com.sc.entity.XiaoshouKehuliusgi;
import com.sc.entity.XiaoshouKehuliusgiExample;
import com.sc.mapper.XiaoshouKehuliusgiMapper;
import com.sc.service.KehuliushiService;

@Service
public class KehuliushiServiceImpl implements KehuliushiService {
	
	@Autowired
	XiaoshouKehuliusgiMapper xiaoshouKehuliusgiMapper;
	
	@Override
	public PageInfo<XiaoshouKehuliusgi> selectKehuliushi(Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		XiaoshouKehuliusgiExample example=new XiaoshouKehuliusgiExample();
		example.setOrderByClause(" ksid desc ");
		List<XiaoshouKehuliusgi> list=this.xiaoshouKehuliusgiMapper.selectByExample(example);
		PageInfo<XiaoshouKehuliusgi> page=new PageInfo<XiaoshouKehuliusgi>(list);
		return page;
	}

	@Override
	public XiaoshouKehuliusgi getKehuliushi(Long ksid) {
		if(ksid!=null){
			return this.xiaoshouKehuliusgiMapper.selectByPrimaryKey(ksid);
		}
		return null;
	}

	@Override
	public void updateKehuliushi(XiaoshouKehuliusgi lskh) {
		if(lskh!=null){
			this.xiaoshouKehuliusgiMapper.updateByPrimaryKey(lskh);
		}
	}

	@Override
	public void deleteKehuliushi(XiaoshouKehuliusgi lskh) {
		if(lskh!=null){
			this.xiaoshouKehuliusgiMapper.deleteByPrimaryKey(lskh.getKsid());
		}
	}

	@Override
	public void addKehuliushi(XiaoshouKehuliusgi lskh) {
		if(lskh!=null){
			this.xiaoshouKehuliusgiMapper.insert(lskh);
		}
	}

}
