package com.nba.server;

import com.nba.mapper.QuartersDAO;
import com.nba.model.Quarters;
import com.nba.model.QuartersExample;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

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


}
