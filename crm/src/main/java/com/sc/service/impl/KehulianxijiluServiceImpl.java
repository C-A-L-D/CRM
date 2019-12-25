package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.XiaoshouEhuluiamxijilu;
import com.sc.entity.XiaoshouEhuluiamxijiluExample;
import com.sc.entity.XiaoshouEhuluiamxijiluExample.Criteria;
import com.sc.mapper.XiaoshouEhuluiamxijiluMapper;
import com.sc.service.KehulianxijiluService;

@Service
public class KehulianxijiluServiceImpl implements KehulianxijiluService {
	
	@Autowired
	XiaoshouEhuluiamxijiluMapper xiaoshouEhuluiamxijiluMapper;
	
	@Override
	public PageInfo<XiaoshouEhuluiamxijilu> selectKehulianxijilu(Integer pageNum, Integer pageSize, Long kid) {
		PageHelper.startPage(pageNum, pageSize);
		XiaoshouEhuluiamxijiluExample example = new XiaoshouEhuluiamxijiluExample();
		example.setOrderByClause(" ljid desc ");
		Criteria criteria = example.createCriteria();
		criteria.andKidEqualTo(kid);
		List<XiaoshouEhuluiamxijilu> list=this.xiaoshouEhuluiamxijiluMapper.selectByExample(example);
		PageInfo<XiaoshouEhuluiamxijilu> page=new PageInfo<XiaoshouEhuluiamxijilu>(list);
		return page;
	}

	@Override
	public XiaoshouEhuluiamxijilu getKehulianxijilu(Long ljid) {
		if(ljid!=null){
			return this.xiaoshouEhuluiamxijiluMapper.selectByPrimaryKey(ljid);
		}
		return null;
	}

	@Override
	public void updateKehulianxijilu(XiaoshouEhuluiamxijilu lxjl) {
		if(lxjl!=null){
			this.xiaoshouEhuluiamxijiluMapper.updateByPrimaryKey(lxjl);
		}
	}

	@Override
	public void addKehulianxijilu(XiaoshouEhuluiamxijilu lxjl) {
		if(lxjl!=null){
			this.xiaoshouEhuluiamxijiluMapper.insert(lxjl);
		}
	}

	@Override
	public PageInfo<XiaoshouEhuluiamxijilu> mohuKehulianxijilu(Integer pageNum, Integer pageSize, Long kid,
			String lianxibiaoti) {
		PageHelper.startPage(pageNum, pageSize);
		XiaoshouEhuluiamxijiluExample example = new XiaoshouEhuluiamxijiluExample();
		example.setOrderByClause(" ljid desc ");
		Criteria criteria = example.createCriteria();
		criteria.andKidEqualTo(kid);
		criteria.andLianxibiaotiLike("%"+lianxibiaoti+"%");
		List<XiaoshouEhuluiamxijilu> list=this.xiaoshouEhuluiamxijiluMapper.selectByExample(example);
		PageInfo<XiaoshouEhuluiamxijilu> page=new PageInfo<XiaoshouEhuluiamxijilu>(list);
		return page;
	}

	@Override
	public void deleteKehulianxijilu(XiaoshouEhuluiamxijilu lxjl) {
		if(lxjl!=null){
			this.xiaoshouEhuluiamxijiluMapper.deleteByPrimaryKey(lxjl.getLjid());
		}
	}

}
