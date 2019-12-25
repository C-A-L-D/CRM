package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.XiaoshouKehfankui;
import com.sc.entity.XiaoshouKehfankuiExample;
import com.sc.entity.XiaoshouKehfankuiExample.Criteria;
import com.sc.mapper.XiaoshouKehfankuiMapper;
import com.sc.service.KehufankuiService;

@Service
public class KehufankuiServiceImpl implements KehufankuiService {
	
	@Autowired
	XiaoshouKehfankuiMapper xiaoshouKehfankuiMapper;
	
	@Override
	public PageInfo<XiaoshouKehfankui> selectKehufankui(Integer pageNum, Integer pageSize, Long kid) {
		PageHelper.startPage(pageNum, pageSize);
		XiaoshouKehfankuiExample example = new XiaoshouKehfankuiExample();
		example.setOrderByClause(" fid desc ");
		Criteria criteria = example.createCriteria();
		criteria.andKidEqualTo(kid);
		List<XiaoshouKehfankui> list=this.xiaoshouKehfankuiMapper.selectByExample(example);
		PageInfo<XiaoshouKehfankui> page=new PageInfo<XiaoshouKehfankui>(list);
		return page;
	}

	@Override
	public XiaoshouKehfankui getKehufankui(Long fid) {
		if(fid!=null){
			return this.xiaoshouKehfankuiMapper.selectByPrimaryKey(fid);
		}
		return null;
	}

	@Override
	public void updateKehufankui(XiaoshouKehfankui fkjl) {
		if(fkjl!=null){
			this.xiaoshouKehfankuiMapper.updateByPrimaryKey(fkjl);
		}
	}

	@Override
	public void addKehufankui(XiaoshouKehfankui fkjl) {
		if(fkjl!=null){
			this.xiaoshouKehfankuiMapper.insert(fkjl);
		}
	}

	@Override
	public PageInfo<XiaoshouKehfankui> mohuKehufankui(Integer pageNum, Integer pageSize, Long kid,
			String jiluyouxianji) {
		PageHelper.startPage(pageNum, pageSize);
		XiaoshouKehfankuiExample example = new XiaoshouKehfankuiExample();
		example.setOrderByClause(" fid desc ");
		Criteria criteria = example.createCriteria();
		criteria.andKidEqualTo(kid);
		criteria.andJiluyouxianjiLike("%"+jiluyouxianji+"%");
		List<XiaoshouKehfankui> list=this.xiaoshouKehfankuiMapper.selectByExample(example);
		PageInfo<XiaoshouKehfankui> page=new PageInfo<XiaoshouKehfankui>(list);
		return page;
	}

	@Override
	public void deleteKehufankui(XiaoshouKehfankui fkjl) {
		if(fkjl!=null){
			this.xiaoshouKehfankuiMapper.deleteByPrimaryKey(fkjl.getFid());
		}
	}

}
