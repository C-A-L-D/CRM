package com.sc.mapper;

import com.sc.entity.OffMessdetail;
import com.sc.entity.OffMessdetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OffMessdetailMapper {
	//查询短消息-已接收   1
	public List<OffMessdetail> select(OffMessdetail detail);
	
	//更改短消息状态   1
	int updatestate(Long detailid);
	
	//删除短信  1
    int deleteByPrimaryKey(Long detailid);
	
    //查看短消息详情   1
    public OffMessdetail showdetail(Long detailid);
    
    //回复短消息  1
    int  huifuone(OffMessdetail detail);
    
    //模糊查询-标题   1
    public List<OffMessdetail> selectbytitle(@Param("title")String title,@Param("uid")Long uid);
    
    //模糊查询-内容  1
    public List<OffMessdetail> selectbycontent(@Param("content")String content,@Param("uid")Long uid);
    
    int countByExample(OffMessdetailExample example);

    int deleteByExample(OffMessdetailExample example);


    int insert(OffMessdetail record);

    int insertSelective(OffMessdetail record);
    
    //
    List<OffMessdetail> selectByExample(OffMessdetailExample example);

    OffMessdetail selectByPrimaryKey(Long detailid);

    int updateByExampleSelective(@Param("record") OffMessdetail record, @Param("example") OffMessdetailExample example);

    int updateByExample(@Param("record") OffMessdetail record, @Param("example") OffMessdetailExample example);

    int updateByPrimaryKeySelective(OffMessdetail record);
    
    //1
    int updateByPrimaryKey(OffMessdetail record);
}