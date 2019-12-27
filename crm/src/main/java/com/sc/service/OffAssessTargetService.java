package com.sc.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.sc.entity.OffAssesstarget;

public interface OffAssessTargetService {
	//查询指标
		public List<OffAssesstarget> select(Long cid);
   
	//分页查询指标
        public PageInfo<OffAssesstarget> selectpage(Integer pageNum,Integer pageSize,Long cid); 
   
    //删除指标
 	    public void deleteTarget(OffAssesstarget target);
 		
    //获取指标信息-id
 	    public OffAssesstarget get(Long targetid);
 	    
 	//修改指标
 	    public void update(OffAssesstarget target);
 	    
 	//添加指标
 	   public void insert(OffAssesstarget target);
 	   
 	//模糊查询
 	  public List<OffAssesstarget> selectbyassesstarget(String assesstarget);
 	  
 	 //分页查询-模糊查询
 	   	public PageInfo<OffAssesstarget> selectpageassesstarget(Integer pageNum,Integer pageSize,String assesstarget);
}
