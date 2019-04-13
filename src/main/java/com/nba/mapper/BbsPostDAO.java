package com.nba.mapper;

import com.nba.model.BbsPost;
import com.nba.model.BbsPostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BbsPostDAO {
    long countByExample(BbsPostExample example);

    int deleteByExample(BbsPostExample example);

    int deleteByPrimaryKey(Integer pid);

    int insert(BbsPost record);

    int insertSelective(BbsPost record);

    List<BbsPost> selectByExampleWithBLOBs(BbsPostExample example);

    List<BbsPost> selectByExample(BbsPostExample example);

    BbsPost selectByPrimaryKey(Integer pid);

    int updateByExampleSelective(@Param("record") BbsPost record, @Param("example") BbsPostExample example);

    int updateByExampleWithBLOBs(@Param("record") BbsPost record, @Param("example") BbsPostExample example);

    int updateByExample(@Param("record") BbsPost record, @Param("example") BbsPostExample example);

    int updateByPrimaryKeySelective(BbsPost record);

    int updateByPrimaryKeyWithBLOBs(BbsPost record);

    int updateByPrimaryKey(BbsPost record);
}