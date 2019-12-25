package com.sc.mapper;

import com.sc.entity.OffTaskdetail;
import com.sc.entity.OffTaskdetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OffTaskdetailMapper {
	//查询接收的任务
	public List<OffTaskdetail> selectaccept();
	
	//模糊查询-标题
	public List<OffTaskdetail> selectbytitle(String tasktitle);
	
	//模糊查询-内容
	public List<OffTaskdetail> selectbycontent(String taskdetail);
	
	//模糊查询-发布人
	public List<OffTaskdetail> selectbyuser(String taskdetail);
		
	//模糊查询-考核指标
	public List<OffTaskdetail> selectbytarget(String assesstarget);
	
    int countByExample(OffTaskdetailExample example);

    int deleteByExample(OffTaskdetailExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OffTaskdetail record);

    int insertSelective(OffTaskdetail record);
    
    //通过taskid查询任务详情List
    List<OffTaskdetail> selectByExample(OffTaskdetailExample example);

    OffTaskdetail selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OffTaskdetail record, @Param("example") OffTaskdetailExample example);

    int updateByExample(@Param("record") OffTaskdetail record, @Param("example") OffTaskdetailExample example);

    int updateByPrimaryKeySelective(OffTaskdetail record);

    int updateByPrimaryKey(OffTaskdetail record);
}