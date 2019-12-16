package com.sc.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.SysDepartment;
import com.sc.entity.SysUsersInfo;
import com.sc.mapper.SysDepartmentMapper;
import com.sc.service.SysDepartmentService;

@Service
public class SysDepartmentServiceImpl implements SysDepartmentService {
@Autowired
SysDepartmentMapper sysDepartmentMapper;
	
	@Override
	public void add(SysDepartment d) {
		if(d!=null){
			this.sysDepartmentMapper.insert(d);
		}

	}

	@Override
	public void update(SysDepartment d) {
		if(d!=null){
			this.sysDepartmentMapper.updateByPrimaryKey(d);
		}

	}

	@Override
	public void delete(SysDepartment d) {
		if(d!=null){
			this.sysDepartmentMapper.deleteByPrimaryKey(d.getDid());
		}

	}

	@Override
	public SysDepartment get(BigDecimal did) {
		if(did!=null){
			this.sysDepartmentMapper.selectByPrimaryKey(did);
		}
		return null;
	}

	@Override
	public List<SysDepartment> select() {
		// TODO Auto-generated method stub
		return	this.sysDepartmentMapper.selectByExample(null);
	}

	@Override
	public PageInfo<SysDepartment> selectpage(Integer pageNum, Integer pageSize) {
		//设置分页数据，开始分页
		PageHelper.startPage(pageNum, pageSize);
		//查询当前页的集合数据
		List<SysDepartment> list = this.sysDepartmentMapper.selectByExample(null);
		//封装成pageinfo对象
		PageInfo<SysDepartment> page=new PageInfo<SysDepartment>(list);
		
		return page;
	}

}
