package com.nba.mapper;

import com.nba.model.Teams;
import com.nba.model.TeamsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamsDAO {
    long countByExample(TeamsExample example);

    int deleteByExample(TeamsExample example);

    int deleteByPrimaryKey(Integer teamId);

    int insert(Teams record);

    int insertSelective(Teams record);

    List<Teams> selectByExample(TeamsExample example);

    Teams selectByPrimaryKey(Integer teamId);

    int updateByExampleSelective(@Param("record") Teams record, @Param("example") TeamsExample example);

    int updateByExample(@Param("record") Teams record, @Param("example") TeamsExample example);

    int updateByPrimaryKeySelective(Teams record);

    int updateByPrimaryKey(Teams record);
}