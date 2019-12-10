package com.sc.mapper;

import com.sc.entity.JhGysxx;
import com.sc.entity.JhGysxxExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JhGysxxMapper {
    int countByExample(JhGysxxExample example);

    int deleteByExample(JhGysxxExample example);

    int deleteByPrimaryKey(BigDecimal gysId);

    int insert(JhGysxx record);

    int insertSelective(JhGysxx record);

    List<JhGysxx> selectByExample(JhGysxxExample example);

    JhGysxx selectByPrimaryKey(BigDecimal gysId);

    int updateByExampleSelective(@Param("record") JhGysxx record, @Param("example") JhGysxxExample example);

    int updateByExample(@Param("record") JhGysxx record, @Param("example") JhGysxxExample example);

    int updateByPrimaryKeySelective(JhGysxx record);

    int updateByPrimaryKey(JhGysxx record);
}