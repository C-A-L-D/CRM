package com.sc.mapper;

import com.sc.entity.OffMessdetail;
import com.sc.entity.OffMessdetailExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OffMessdetailMapper {
	//查询短消息-已接收
	public List<OffMessdetail> select();
	
	//删除短信
    int deleteByPrimaryKey(Long detailid);
	
    //查看短消息详情
    public List<OffMessdetail> showdetail(Long detailid);
    
    
    int countByExample(OffMessdetailExample example);

    int deleteByExample(OffMessdetailExample example);


    int insert(OffMessdetail record);

    int insertSelective(OffMessdetail record);

    List<OffMessdetail> selectByExample(OffMessdetailExample example);

    OffMessdetail selectByPrimaryKey(Long detailid);

    int updateByExampleSelective(@Param("record") OffMessdetail record, @Param("example") OffMessdetailExample example);

    int updateByExample(@Param("record") OffMessdetail record, @Param("example") OffMessdetailExample example);

    int updateByPrimaryKeySelective(OffMessdetail record);

    int updateByPrimaryKey(OffMessdetail record);
}