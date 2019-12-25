package com.sc.mapper;

import com.sc.entity.OffAssesstarget;
import com.sc.entity.OffAssesstargetExample;
import com.sc.entity.OffMessdetail;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OffAssesstargetMapper {
	//查询指标
	public List<OffAssesstarget> select();

	//删除指标
	 int deleteByPrimaryKey(Long targetid);
	 
    //获取指标信息-ID
	 OffAssesstarget selectByPrimaryKey(Long targetid);
	 
	 //修改指标
	 int updateByPrimaryKey(OffAssesstarget record);
	 
	 //添加指标
	 int insert(OffAssesstarget record);
	 
	//模糊查询-名称
	 public List<OffAssesstarget> selectbyassesstarget(String assesstarget);
	   
    int countByExample(OffAssesstargetExample example);

    int deleteByExample(OffAssesstargetExample example);

    int insertSelective(OffAssesstarget record);

    List<OffAssesstarget> selectByExample(OffAssesstargetExample example);

    int updateByExampleSelective(@Param("record") OffAssesstarget record, @Param("example") OffAssesstargetExample example);

    int updateByExample(@Param("record") OffAssesstarget record, @Param("example") OffAssesstargetExample example);

    int updateByPrimaryKeySelective(OffAssesstarget record);

    
}