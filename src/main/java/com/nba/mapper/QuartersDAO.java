package com.nba.mapper;

import com.nba.model.Quarters;
import com.nba.model.QuartersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface QuartersDAO {
    long countByExample(QuartersExample example);

    int deleteByExample(QuartersExample example);

    int deleteByPrimaryKey(Integer quarterId);

    int insert(Quarters record);

    int insertSelective(Quarters record);

    List<Quarters> selectByExample(QuartersExample example);

    Quarters selectByPrimaryKey(Integer quarterId);

    int updateByExampleSelective(@Param("record") Quarters record, @Param("example") QuartersExample example);

    int updateByExample(@Param("record") Quarters record, @Param("example") QuartersExample example);

    int updateByPrimaryKeySelective(Quarters record);

    int updateByPrimaryKey(Quarters record);
}