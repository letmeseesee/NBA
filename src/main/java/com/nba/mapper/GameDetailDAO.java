package com.nba.mapper;

import com.nba.model.GameDetail;
import com.nba.model.GameDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface GameDetailDAO {
    long countByExample(GameDetailExample example);

    int deleteByExample(GameDetailExample example);

    int deleteByPrimaryKey(Integer playId);

    int insert(GameDetail record);

    int insertSelective(GameDetail record);

    List<GameDetail> selectByExample(GameDetailExample example);

    GameDetail selectByPrimaryKey(Integer playId);

    int updateByExampleSelective(@Param("record") GameDetail record, @Param("example") GameDetailExample example);

    int updateByExample(@Param("record") GameDetail record, @Param("example") GameDetailExample example);

    int updateByPrimaryKeySelective(GameDetail record);

    int updateByPrimaryKey(GameDetail record);
}