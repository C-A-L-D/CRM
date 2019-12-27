package com.sc.mapper;

import java.util.List;

import com.sc.entity.OOfficePerSche;



public interface OOfficePerScheMapper {
    int insert(OOfficePerSche record);

    int insertSelective(OOfficePerSche record);
    
    
    //添加方法
   	public void addSchedule(OOfficePerSche sche);
   	
    //通过id获取实体类对象
   	public OOfficePerSche getScheduleById(String id);
   	
   	//修改方法
   	public void updateSchedule(OOfficePerSche sche);
   	
   	//删除方法
   	public void delSchedule(OOfficePerSche sche);
   	
   	//查询方法
   	public List getAllSchedule(OOfficePerSche sche);

   	//添加日程之前先查询数据库中主键最大的值
   	public String getMaxIdoOfficePerSche();

   	// 个人日程列表（分页查询）
   	public List<OOfficePerSche> getOPerAgendaList(OOfficePerSche oOfficePerSche);	
   }