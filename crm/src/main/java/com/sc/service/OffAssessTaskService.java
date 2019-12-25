package com.sc.service;

import java.math.BigDecimal;
import java.util.List;

import com.github.pagehelper.PageInfo;
import com.sc.entity.OffAssesstask;
import com.sc.entity.SysUsersInfo;

public interface OffAssessTaskService {
	    //修改任务状态
		public void updatestate();
		
	    //查询任务
		public List<OffAssesstask> select();
		
	    //分页查询
        public PageInfo<OffAssesstask> selectpage(Integer pageNum,Integer pageSize); 
        
        //删除任务
        public void delete(Long taskid);
        
        //查询任务-ID
        public OffAssesstask selectbyid(Long taskid);
        
        //查询接受任务用户信息
        public SysUsersInfo selectbyidu(BigDecimal sid);
        
        //添加任务
        public void insert(OffAssesstask task);
        
        //分页查询-标题
        public PageInfo<OffAssesstask> selectpagetitle(Integer pageNum,Integer pageSize,String tasktitle); 
        
        //分页查询-内容
        public PageInfo<OffAssesstask> selectpagecontent(Integer pageNum,Integer pageSize,String taskdetail); 
       
        //分页查询-任务发布人
        public PageInfo<OffAssesstask> selectpageu(Integer pageNum,Integer pageSize,String taskpublisher); 
        
        //分页查询-考核指标
        public PageInfo<OffAssesstask> selectpagetarget(Integer pageNum,Integer pageSize,String assesstarget); 


}
