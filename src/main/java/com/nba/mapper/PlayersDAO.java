package com.nba.mapper;

import com.nba.model.Players;
import com.nba.model.PlayersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayersDAO {
    long countByExample(PlayersExample example);

    int deleteByExample(PlayersExample example);

    int deleteByPrimaryKey(Integer playerId);

    int insert(Players record);

    int insertSelective(Players record);

    List<Players> selectByExample(PlayersExample example);

    Players selectByPrimaryKey(Integer playerId);

    int updateByExampleSelective(@Param("record") Players record, @Param("example") PlayersExample example);

    int updateByExample(@Param("record") Players record, @Param("example") PlayersExample example);

    int updateByPrimaryKeySelective(Players record);

    int updateByPrimaryKey(Players record);
}