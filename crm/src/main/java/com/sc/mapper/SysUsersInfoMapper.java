package com.sc.mapper;

import com.sc.entity.SysUsersInfo;
import com.sc.entity.SysUsersInfoExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUsersInfoMapper {
    int countByExample(SysUsersInfoExample example);

    int deleteByExample(SysUsersInfoExample example);

    int deleteByPrimaryKey(BigDecimal sid);

    int insert(SysUsersInfo record);

    int insertSelective(SysUsersInfo record);

    List<SysUsersInfo> selectByExample(SysUsersInfoExample example);

    SysUsersInfo selectByPrimaryKey(BigDecimal sid);

    int updateByExampleSelective(@Param("record") SysUsersInfo record, @Param("example") SysUsersInfoExample example);

    int updateByExample(@Param("record") SysUsersInfo record, @Param("example") SysUsersInfoExample example);

    int updateByPrimaryKeySelective(SysUsersInfo record);

    int updateByPrimaryKey(SysUsersInfo record);
}