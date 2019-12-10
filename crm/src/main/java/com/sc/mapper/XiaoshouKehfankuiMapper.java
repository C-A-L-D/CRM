package com.sc.mapper;

import com.sc.entity.XiaoshouKehfankui;
import com.sc.entity.XiaoshouKehfankuiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XiaoshouKehfankuiMapper {
    int countByExample(XiaoshouKehfankuiExample example);

    int deleteByExample(XiaoshouKehfankuiExample example);

    int deleteByPrimaryKey(Long fid);

    int insert(XiaoshouKehfankui record);

    int insertSelective(XiaoshouKehfankui record);

    List<XiaoshouKehfankui> selectByExample(XiaoshouKehfankuiExample example);

    XiaoshouKehfankui selectByPrimaryKey(Long fid);

    int updateByExampleSelective(@Param("record") XiaoshouKehfankui record, @Param("example") XiaoshouKehfankuiExample example);

    int updateByExample(@Param("record") XiaoshouKehfankui record, @Param("example") XiaoshouKehfankuiExample example);

    int updateByPrimaryKeySelective(XiaoshouKehfankui record);

    int updateByPrimaryKey(XiaoshouKehfankui record);
}