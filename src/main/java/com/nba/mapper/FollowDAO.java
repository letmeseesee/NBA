package com.nba.mapper;

import com.nba.model.Follow;
import com.nba.model.FollowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FollowDAO {
    long countByExample(FollowExample example);

    int deleteByExample(FollowExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Follow record);

    int insertSelective(Follow record);

    List<Follow> selectByExample(FollowExample example);

    Follow selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Follow record, @Param("example") FollowExample example);

    int updateByExample(@Param("record") Follow record, @Param("example") FollowExample example);

    int updateByPrimaryKeySelective(Follow record);

    int updateByPrimaryKey(Follow record);
}