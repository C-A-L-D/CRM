package com.sc.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.SysDepartment;
import com.sc.entity.SysJobinfo;
import com.sc.mapper.SysDepartmentMapper;
import com.sc.mapper.SysJobinfoMapper;
import com.sc.service.SysJobinfoService;
@Service
public class SysJobinfoServiceImpl implements SysJobinfoService {

	@Autowired
	SysJobinfoMapper sysJobinfoMapper;
		
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
				this.sysJobinfoMapper.selectByPrimaryKey(jid);
			}
			return null;
		}

		@Override
		public List<SysJobinfo> select() {
			// TODO Auto-generated method stub
			return	this.sysJobinfoMapper.selectByExample(null);
		}

		@Override
		public PageInfo<SysJobinfo> selectpage(Integer pageNum, Integer pageSize) {
			//设置分页数据，开始分页
			PageHelper.startPage(pageNum, pageSize);
			//查询当前页的集合数据
			List<SysJobinfo> list = this.sysJobinfoMapper.selectByExample(null);
			//封装成pageinfo对象
			PageInfo<SysJobinfo> page=new PageInfo<SysJobinfo>(list);
			
			return page;
		}

}
