package com.sc.mapper;

import com.sc.entity.OffMessdetail;
import com.sc.entity.OffMessdetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OffMessdetailMapper {
    int countByExample(OffMessdetailExample example);

    int deleteByExample(OffMessdetailExample example);

    int deleteByPrimaryKey(Long detailid);

    int insert(OffMessdetail record);

    int insertSelective(OffMessdetail record);

    List<OffMessdetail> selectByExample(OffMessdetailExample example);

    OffMessdetail selectByPrimaryKey(Long detailid);

    int updateByExampleSelective(@Param("record") OffMessdetail record, @Param("example") OffMessdetailExample example);

    int updateByExample(@Param("record") OffMessdetail record, @Param("example") OffMessdetailExample example);

    int updateByPrimaryKeySelective(OffMessdetail record);

    int updateByPrimaryKey(OffMessdetail record);
}