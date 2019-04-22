package com.nba.mapper;

import com.nba.model.CompetitionList;
import com.nba.model.CompetitionListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CompetitionListDAO {
    long countByExample(CompetitionListExample example);

    int deleteByExample(CompetitionListExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CompetitionList record);

    int insertSelective(CompetitionList record);

    List<CompetitionList> selectByExample(CompetitionListExample example);

    CompetitionList selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CompetitionList record, @Param("example") CompetitionListExample example);

    int updateByExample(@Param("record") CompetitionList record, @Param("example") CompetitionListExample example);

    int updateByPrimaryKeySelective(CompetitionList record);

    int updateByPrimaryKey(CompetitionList record);
}