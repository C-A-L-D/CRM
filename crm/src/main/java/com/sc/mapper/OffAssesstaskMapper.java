package com.sc.mapper;

import com.sc.entity.OffAssesstask;
import com.sc.entity.OffAssesstaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OffAssesstaskMapper {
    int countByExample(OffAssesstaskExample example);

    int deleteByExample(OffAssesstaskExample example);

    int deleteByPrimaryKey(Long taskid);

    int insert(OffAssesstask record);

    int insertSelective(OffAssesstask record);

    List<OffAssesstask> selectByExample(OffAssesstaskExample example);

    OffAssesstask selectByPrimaryKey(Long taskid);

    int updateByExampleSelective(@Param("record") OffAssesstask record, @Param("example") OffAssesstaskExample example);

    int updateByExample(@Param("record") OffAssesstask record, @Param("example") OffAssesstaskExample example);

    int updateByPrimaryKeySelective(OffAssesstask record);

    int updateByPrimaryKey(OffAssesstask record);
}