package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.JhXbh;
import com.sc.entity.JhXbhExample;
import com.sc.entity.JhXbhExample.Criteria;
import com.sc.entity.StoreGinfo;
import com.sc.mapper.JhXbhMapper;
import com.sc.service.JhXbhService;
@Service
public class JhXbhServiceImpl implements JhXbhService {

	@Autowired
	JhXbhMapper jhXbhMapper;
	
	
	@Override
	public PageInfo<JhXbh> selectpage(Integer pageNum, Integer pageSize,JhXbh jc) {
		//设置分页数据，开始分页
		PageHelper.startPage(pageNum, pageSize);
		JhXbhExample ex=new JhXbhExample();
		ex.setOrderByClause("ID asc");		
		//查询当前页的集合数据
		if(jc!=null){
	        if(jc.getCpId()!=null&&!jc.getCpId().equals("")){
	        	Criteria criteria = ex.createCriteria();
				criteria.andCpIdEqualTo(jc.getCpId());
					
			}
			}
				List<JhXbh> list = this.jhXbhMapper.selectByExample(ex);
				PageInfo<JhXbh>page=new PageInfo<JhXbh>(list);
		
		return page;
	}

	@Override
	public void add(JhXbh jx) {
		if(jx!=null){
		   this.jhXbhMapper.insert(jx);
		}

	}

	@Override
	public List<JhXbh> getall(StoreGinfo sg) {
			JhXbhExample ex=new JhXbhExample();
			if(sg!=null){
				Criteria criteria = ex.createCriteria();
			    criteria.andCpIdEqualTo(sg.getGid().longValue());
			}
		
			
			return this.jhXbhMapper.selectByExample(ex);
				
	}

	@Override
	public JhXbh get(Long id) {
		if(id!=null){
		return	this.jhXbhMapper.selectByPrimaryKey(id);
		}			
		return null;
	}

	@Override
	public void delete(JhXbh u) {
		if(u!=null){
			this.jhXbhMapper.deleteByPrimaryKey(u.getId());
		}
		
	}

}
