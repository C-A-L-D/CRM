package com.sc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sc.entity.OffAssesstarget;
import com.sc.mapper.OffAssesstargetMapper;
import com.sc.service.OffAssessTargetService;
@Service
public class OffAssessTargetServiceImpl implements OffAssessTargetService {
	
	@Autowired
    OffAssesstargetMapper offAssesstargetMapper;
	
   //查询指标
	@Override
	public List<OffAssesstarget> select(Long cid) {
		return this.offAssesstargetMapper.select(cid);
	}
	
	//分页查询指标
	@Override
	public PageInfo<OffAssesstarget> selectpage(Integer pageNum, Integer pageSize,Long cid) {
		//设置分页数据，开始分页
		PageHelper.startPage(pageNum, pageSize);
	    //查询当前页的集合数据	
		List<OffAssesstarget> list = this.offAssesstargetMapper.select(cid);
	   System.out.println("11"+list);
		//封装成pageinfo对象
	   PageInfo<OffAssesstarget> page=new PageInfo<OffAssesstarget>(list);
						
		return page;
	}
	
	//删除指标
	@Override
	public void deleteTarget(OffAssesstarget target) {
		if(target!=null){
			this.offAssesstargetMapper.deleteByPrimaryKey(target.getTargetid());
		}	
		
	}
	
	//获取指标信息-ID
	@Override
	public OffAssesstarget get(Long targetid) {
		return this.offAssesstargetMapper.selectByPrimaryKey(targetid);
	}
	
	//修改指标
	@Override
	public void update(OffAssesstarget target) {
		 this.offAssesstargetMapper.updateByPrimaryKey(target);
	}
	
	//添加指标
	@Override
	public void  insert(OffAssesstarget target) {
		 this.offAssesstargetMapper.insert(target);
		
	}
	
	//模糊查询
	@Override
	public List<OffAssesstarget> selectbyassesstarget(String assesstarget) {
		return this.offAssesstargetMapper.selectbyassesstarget(assesstarget);
	}
	
	//分页-模糊查询
	@Override
	public PageInfo<OffAssesstarget> selectpageassesstarget(Integer pageNum, Integer pageSize,String assesstarget) {
		//设置分页数据，开始分页
		PageHelper.startPage(pageNum, pageSize);
		//查询当前页的集合数据	
		List<OffAssesstarget> list = this.offAssesstargetMapper.selectbyassesstarget(assesstarget);
		//封装成pageinfo对象
		PageInfo<OffAssesstarget> page=new PageInfo<OffAssesstarget>(list);
		System.out.println("11"+page);
		return page;
	}
}
