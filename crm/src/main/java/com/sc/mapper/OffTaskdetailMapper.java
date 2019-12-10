package com.sc.mapper;

import com.sc.entity.OffTaskdetail;
import com.sc.entity.OffTaskdetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OffTaskdetailMapper {
    int countByExample(OffTaskdetailExample example);

    int deleteByExample(OffTaskdetailExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OffTaskdetail record);

    int insertSelective(OffTaskdetail record);

    List<OffTaskdetail> selectByExample(OffTaskdetailExample example);

    OffTaskdetail selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OffTaskdetail record, @Param("example") OffTaskdetailExample example);

    int updateByExample(@Param("record") OffTaskdetail record, @Param("example") OffTaskdetailExample example);

    int updateByPrimaryKeySelective(OffTaskdetail record);

    int updateByPrimaryKey(OffTaskdetail record);
}