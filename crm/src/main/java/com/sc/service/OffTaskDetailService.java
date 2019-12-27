package com.sc.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.sc.entity.OffTaskdetail;

public interface OffTaskDetailService {
	//查询任务详情列表-ID
	 List<OffTaskdetail> taskdetail(Long taskid);
	 
	 //添加任务详情
     public void insert(OffTaskdetail detail);
     
     //分页查询已接收任务
     public PageInfo<OffTaskdetail> selectpageaccept(Integer pageNum,Integer pageSize,Long uid); 
     
     //修改任务详情对象
    public void update(OffTaskdetail record);
    
    //查询任务详情对象
    public OffTaskdetail select(Long id);
    
    
    //分页查询-标题
    public PageInfo<OffTaskdetail> selectpagetitle(Integer pageNum,Integer pageSize,String tasktitle,Long cid); 
    
    //分页查询-内容
    public PageInfo<OffTaskdetail> selectpagecontent(Integer pageNum,Integer pageSize,String taskdetail,Long cid); 
   
    //分页查询-任务发布人
    public PageInfo<OffTaskdetail> selectpageu(Integer pageNum,Integer pageSize,String taskpublisher,Long cid); 
    
    //分页查询-考核指标
    public PageInfo<OffTaskdetail> selectpagetarget(Integer pageNum,Integer pageSize,String assesstarget,Long cid); 


}
