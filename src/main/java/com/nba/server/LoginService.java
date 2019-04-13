package com.nba.server;


import com.nba.mapper.BbsPostDAO;
import com.nba.mapper.UserDAO;
import com.nba.model.UserExample;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 2019-4-13
 */
@Slf4j
@Service
public class LoginService {
    private Logger logger = LoggerFactory.getLogger(LoginService.class);

    @Autowired
    UserDAO userDAO;

    public Boolean doLogin(String username,String password){
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUsernameEqualTo(username);
        criteria.andPasswordEqualTo(password);
        Long userCount = userDAO.countByExample(userExample);
        if(userCount == 1){
            return true;
        }else {
            return false;
        }
    }
}
