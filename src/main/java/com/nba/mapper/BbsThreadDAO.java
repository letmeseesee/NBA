package com.nba.mapper;

import com.nba.facade.dto.BbsThreadDto;
import com.nba.model.BbsThread;
import com.nba.model.BbsThreadExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BbsThreadDAO {
    long countByExample(BbsThreadExample example);

    int deleteByExample(BbsThreadExample example);

    int deleteByPrimaryKey(Integer tid);

    int insert(BbsThread record);

    int insertSelective(BbsThread record);

    List<BbsThread> selectByExample(BbsThreadExample example);

    List<BbsThreadDto> selectByExampleAndCreater(BbsThreadExample example);

    BbsThread selectByPrimaryKey(Integer tid);

    int updateByExampleSelective(@Param("record") BbsThread record, @Param("example") BbsThreadExample example);

    int updateByExample(@Param("record") BbsThread record, @Param("example") BbsThreadExample example);

    int updateByPrimaryKeySelective(BbsThread record);

    int updateByPrimaryKey(BbsThread record);
}