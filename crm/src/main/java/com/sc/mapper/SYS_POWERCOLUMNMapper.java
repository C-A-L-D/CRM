package com.sc.mapper;

import com.sc.entity.SYS_POWERCOLUMN;
import com.sc.entity.SYS_POWERCOLUMNExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SYS_POWERCOLUMNMapper {
    int countByExample(SYS_POWERCOLUMNExample example);

    int deleteByExample(SYS_POWERCOLUMNExample example);

    int deleteByPrimaryKey(BigDecimal cid);

    int insert(SYS_POWERCOLUMN record);

    int insertSelective(SYS_POWERCOLUMN record);

    List<SYS_POWERCOLUMN> selectByExample(SYS_POWERCOLUMNExample example);

    SYS_POWERCOLUMN selectByPrimaryKey(BigDecimal cid);

    int updateByExampleSelective(@Param("record") SYS_POWERCOLUMN record, @Param("example") SYS_POWERCOLUMNExample example);

    int updateByExample(@Param("record") SYS_POWERCOLUMN record, @Param("example") SYS_POWERCOLUMNExample example);

    int updateByPrimaryKeySelective(SYS_POWERCOLUMN record);

    int updateByPrimaryKey(SYS_POWERCOLUMN record);
}