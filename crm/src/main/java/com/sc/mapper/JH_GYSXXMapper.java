package com.sc.mapper;

import com.sc.entity.JH_GYSXX;
import com.sc.entity.JH_GYSXXExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JH_GYSXXMapper {
    int countByExample(JH_GYSXXExample example);

    int deleteByExample(JH_GYSXXExample example);

    int deleteByPrimaryKey(BigDecimal gysId);

    int insert(JH_GYSXX record);

    int insertSelective(JH_GYSXX record);

    List<JH_GYSXX> selectByExample(JH_GYSXXExample example);

    JH_GYSXX selectByPrimaryKey(BigDecimal gysId);

    int updateByExampleSelective(@Param("record") JH_GYSXX record, @Param("example") JH_GYSXXExample example);

    int updateByExample(@Param("record") JH_GYSXX record, @Param("example") JH_GYSXXExample example);

    int updateByPrimaryKeySelective(JH_GYSXX record);

    int updateByPrimaryKey(JH_GYSXX record);
}