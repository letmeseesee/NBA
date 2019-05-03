package com.nba.server;

import com.nba.mapper.QuartersDAO;
import com.nba.model.Quarters;
import com.nba.model.QuartersExample;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class QuarterService {
    @Autowired
    QuartersDAO quartersDAO;

    Quarters getQutersById(Integer id) {
        QuartersExample quartersExample = new QuartersExample();
        QuartersExample.Criteria criteria = quartersExample.createCriteria();
        criteria.andQuarterIdEqualTo(id);
        return quartersDAO.selectByPrimaryKey(id);
    }

    void updateByQuter(Quarters quarters) {
        QuartersExample quartersExample = new QuartersExample();
        QuartersExample.Criteria criteria = quartersExample.createCriteria();
        criteria.andQuarterIdEqualTo(quarters.getQuarterId());
        quartersDAO.updateByExample(quarters, quartersExample);
    }

    void insertByQuter(Quarters quarters) {
        quartersDAO.insert(quarters);
    }

     List<Integer> getAllQuters(Integer game_id){
        QuartersExample quartersExample = new QuartersExample();
        QuartersExample.Criteria criteria = quartersExample.createCriteria();
        criteria.andGameIdEqualTo(game_id);
        List<Quarters> quarters = quartersDAO.selectByExample(quartersExample);
        return quarters.stream().map(Quarters::getQuarterId).collect(Collectors.toList());
    }
}
