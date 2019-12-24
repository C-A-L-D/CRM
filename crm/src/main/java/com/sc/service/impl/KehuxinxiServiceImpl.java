package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.XiaoshouKehuxinxi;
import com.sc.entity.XiaoshouKehuxinxiExample;
import com.sc.entity.XiaoshouKehuxinxiExample.Criteria;
import com.sc.mapper.XiaoshouKehuxinxiMapper;
import com.sc.service.KehuxinxiService;

import oracle.net.aso.e;

@Service
public class KehuxinxiServiceImpl implements KehuxinxiService {
	
	@Autowired
	XiaoshouKehuxinxiMapper xiaoshouKehuxinxiMapper;
	
	@Override
	public PageInfo<XiaoshouKehuxinxi> selectKehuxinxiPage(Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		XiaoshouKehuxinxiExample example=new XiaoshouKehuxinxiExample();
		example.setOrderByClause(" kid desc ");
		List<XiaoshouKehuxinxi> list=this.xiaoshouKehuxinxiMapper.selectByExample(example);
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

	@Override
	public void addKehuxinxi(XiaoshouKehuxinxi xk) {
		if(xk!=null){
			this.xiaoshouKehuxinxiMapper.insert(xk);
		}
	}

	@Override
	public PageInfo<XiaoshouKehuxinxi> mohuchaxunKehuxinxi(Integer pageNum, Integer pageSize, String kname) {
		PageHelper.startPage(pageNum, pageSize);
		XiaoshouKehuxinxiExample example=new XiaoshouKehuxinxiExample();
		example.setOrderByClause(" kid desc ");
		Criteria criteria=example.createCriteria();
		criteria.andKnameLike("%"+kname+"%");
		List<XiaoshouKehuxinxi> selectByExample = this.xiaoshouKehuxinxiMapper.selectByExample(example);
		return new PageInfo<XiaoshouKehuxinxi>(selectByExample);
	}
	
	//流失客户处理
	@Override
	public PageInfo<XiaoshouKehuxinxi> selectKehuliushiPage(Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		XiaoshouKehuxinxiExample example=new XiaoshouKehuxinxiExample();
		example.setOrderByClause(" kid desc ");
		Criteria criteria=example.createCriteria();
		criteria.andKehuzhuangtaiEqualTo("暂缓流失");
		List<XiaoshouKehuxinxi> list=this.xiaoshouKehuxinxiMapper.selectByExample(example);
		PageInfo<XiaoshouKehuxinxi> page=new PageInfo<XiaoshouKehuxinxi>(list);
		return page;
	}

	//流失客户恢复
	@Override
	public void kehuxinxiHuifu(XiaoshouKehuxinxi xk) {
		if(xk!=null){
			this.xiaoshouKehuxinxiMapper.updateByPrimaryKey(xk);
		}
	}
	
	//流失客户删除
	@Override
	public void deleteKehuxinxi(XiaoshouKehuxinxi xk){
		if(xk!=null){
			this.xiaoshouKehuxinxiMapper.deleteByPrimaryKey(xk.getKid());
		}
	}
	
}
