package com.sc.mapper;

import com.sc.entity.OffAssesstask;
import com.sc.entity.OffAssesstaskExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OffAssesstaskMapper {
	//查询任务
	public List<OffAssesstask> select();
	
	//修改任务状态
	public void updatestate();
		
    int countByExample(OffAssesstaskExample example);
    
   //删除任务
    int deleteByExample(OffAssesstaskExample example);

    int deleteByPrimaryKey(Long taskid);

    //添加任务
    int insert(OffAssesstask record);

    int insertSelective(OffAssesstask record);
    
    List<OffAssesstask> selectByExample(OffAssesstaskExample example);
    
    //查询任务-ID
    OffAssesstask selectByPrimaryKey(Long taskid);

    int updateByExampleSelective(@Param("record") OffAssesstask record, @Param("example") OffAssesstaskExample example);

    int updateByExample(@Param("record") OffAssesstask record, @Param("example") OffAssesstaskExample example);

    int updateByPrimaryKeySelective(OffAssesstask record);

    int updateByPrimaryKey(OffAssesstask record);
}