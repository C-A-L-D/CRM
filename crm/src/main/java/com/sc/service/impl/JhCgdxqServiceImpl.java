package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.JhCgd;
import com.sc.entity.JhCgdxq;
import com.sc.entity.JhCgdxqExample;
import com.sc.entity.JhCgdxqExample.Criteria;
import com.sc.mapper.JhCgdxqMapper;
import com.sc.service.JhCgdxqService;
@Service
public class JhCgdxqServiceImpl implements JhCgdxqService {

	@Autowired
	JhCgdxqMapper jhCgdxqMapper;

	@Override
	public PageInfo<JhCgdxq> selectpage(Integer pageNum, Integer pageSize, JhCgd jc) {
		PageHelper.startPage(pageNum, pageSize);
		JhCgdxqExample ex=new JhCgdxqExample();
		ex.setOrderByClause("CG_XQ_ID asc");
		Criteria criteria = ex.createCriteria();
		//查询当前页的集合数据	
		if(jc!=null){
        if(jc.getCgdId()!=null&&!jc.getCgdId().equals("")){
			criteria.andCgdIdEqualTo(jc.getCgdId());						
		}
		}
			List<JhCgdxq> list = this.jhCgdxqMapper.selectByExample(ex);
			PageInfo<JhCgdxq>page=new PageInfo<JhCgdxq>(list);
		    return page;

		
		

	}

	@Override
	public JhCgdxq get(Long cgXqId) {
		if(cgXqId!=null){
			return this.jhCgdxqMapper.selectByPrimaryKey(cgXqId);
		}
			return null;
	}

	@Override
	public void update(JhCgdxq u) {
		if(u!=null&&u.getCgXqId()!=null){
			this.jhCgdxqMapper.updateByPrimaryKey(u);
		}
		
	}

	@Override
	public void delete(JhCgdxq u) {
		if(u!=null){
			this.jhCgdxqMapper.deleteByPrimaryKey(u.getCgXqId());
		}
		
	}

	@Override
	public void add(JhCgdxq u) {
		if(u!=null){
			  this.jhCgdxqMapper.insert(u);
			}
		
	}

	@Override
	public List<JhCgdxq> getall(Long cgdId) {
		if(cgdId!=null){
			JhCgdxqExample ex=new JhCgdxqExample();
			Criteria criteria = ex.createCriteria();
			criteria.andCgdIdEqualTo(cgdId);
			return this.jhCgdxqMapper.selectByExample(ex);
			
		}
		return null;
	}

	


	
	
}
