package com.sc.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.SysDepartment;
import com.sc.entity.SysGongsiinfo;
import com.sc.entity.SysJobinfo;
import com.sc.entity.SysJobinfoExample;
import com.sc.entity.SysJobinfoExample.Criteria;
import com.sc.mapper.SysDepartmentMapper;
import com.sc.mapper.SysGongsiinfoMapper;
import com.sc.mapper.SysJobinfoMapper;
import com.sc.service.SysJobinfoService;
@Service
public class SysJobinfoServiceImpl implements SysJobinfoService {

	@Autowired
	SysJobinfoMapper sysJobinfoMapper;
	@Autowired
	SysGongsiinfoMapper sysGongsiinfoMapper;
	@Autowired
	SysDepartmentMapper sysDepartmentMapper;
		
		@Override
		public void add(SysJobinfo j) {
			if(j!=null){
				this.sysJobinfoMapper.insert(j);
			}

		}

		@Override
		public void update(SysJobinfo j) {
			if(j!=null){
				this.sysJobinfoMapper.updateByPrimaryKey(j);
			}

		}

		@Override
		public void delete(SysJobinfo j) {
			if(j!=null){
				this.sysJobinfoMapper.deleteByPrimaryKey(j.getJid());
			}

		}

		@Override
		public SysJobinfo get(BigDecimal jid) {
			if(jid!=null){
				return	this.sysJobinfoMapper.selectByPrimaryKey(jid);
			}
			return null;
		}

		@Override
		public List<SysJobinfo> select() {
			// TODO Auto-generated method stub
			return	this.sysJobinfoMapper.selectByExample(null);
		}
		
		@Override
		public List<SysGongsiinfo> select1() {
			// TODO Auto-generated method stub
		
			return	this.sysGongsiinfoMapper.selectByExample(null);
		}
		
		@Override
		public List<SysDepartment> select2() {
			// TODO Auto-generated method stub
		
			return	this.sysDepartmentMapper.selectByExample(null);
		}
		
		

		@Override
		public PageInfo<SysJobinfo> selectpage(Integer pageNum, Integer pageSize,SysJobinfo info1) {
			//设置分页数据，开始分页,模糊查询
			PageHelper.startPage(pageNum, pageSize);
			SysJobinfoExample example=new SysJobinfoExample();
			
		     example.setOrderByClause(" jid desc ");//通过id编号降序排列，注意名称一定是列名
			 if(info1!=null){
	
              Criteria c = example.createCriteria();
              if(info1.getJname()!=null&&!info1.getJname().equals("")){
              c.andJnameLike("%"+info1.getJname() +"%"); 
              System.out.println(info1.getJname());
              }
			 }
			//查询当前页的集合数据
			 List<SysJobinfo> list = this.sysJobinfoMapper.selectByExample(example);
			 
			//封装成pageinfo对象
			PageInfo<SysJobinfo> page=new PageInfo<SysJobinfo>(list);
			
			return page;
		}
		
		
		
}
