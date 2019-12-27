package com.sc.mapper;

import com.sc.entity.OffMess;
import com.sc.entity.OffMessExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OffMessMapper {
	 //回复短消息   1
    int huifu(OffMess mess);

     //查看已发送短信
    List<OffMess> selectByExample(OffMessExample example);
    
  //模糊查询
    public List<OffMess> selectby(OffMess offmess);

    int countByExample(OffMessExample example);

    int deleteByExample(OffMessExample example);

    int deleteByPrimaryKey(Long messid);

    int insert(OffMess record);

    int insertSelective(OffMess record);

    OffMess selectByPrimaryKey(Long messid);

    int updateByExampleSelective(@Param("record") OffMess record, @Param("example") OffMessExample example);

    int updateByExample(@Param("record") OffMess record, @Param("example") OffMessExample example);

    int updateByPrimaryKeySelective(OffMess record);

    int updateByPrimaryKey(OffMess record);
}