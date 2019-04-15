package com.nba.mapper;

import com.nba.model.Games;
import com.nba.model.GamesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface GamesDAO {
    long countByExample(GamesExample example);

    int deleteByExample(GamesExample example);

    int deleteByPrimaryKey(Integer gameId);

    int insert(Games record);

    int insertSelective(Games record);

    List<Games> selectByExample(GamesExample example);

    Games selectByPrimaryKey(Integer gameId);

    int updateByExampleSelective(@Param("record") Games record, @Param("example") GamesExample example);

    int updateByExample(@Param("record") Games record, @Param("example") GamesExample example);

    int updateByPrimaryKeySelective(Games record);

    int updateByPrimaryKey(Games record);
}