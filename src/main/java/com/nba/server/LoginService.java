package com.nba.server;


import com.nba.facade.vo.request.RegisterReq;
import com.nba.mapper.BbsPostDAO;
import com.nba.mapper.UserDAO;
import com.nba.model.User;
import com.nba.model.UserExample;
import io.swagger.models.auth.In;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author 2019-4-13
 */
@Slf4j
@Service
public class LoginService {
    private Logger logger = LoggerFactory.getLogger(LoginService.class);

    @Autowired
    UserDAO userDAO;

    public User doLogin(String username, String password){
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUsernameEqualTo(username);
        criteria.andPasswordEqualTo(password);
        List<User> users = userDAO.selectByExample(userExample);
        if(users.size() == 1){
            return users.get(0);
        }else {
            return null;
        }
    }


    public User getUser(Integer uid){
        return userDAO.selectByPrimaryKey(uid);
    }

    public User getAdminUser(){
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andIsadminEqualTo(1);
        List<User> users =  userDAO.selectByExample(userExample);
        if(users.size() > 0){
            return  users.get(0);
        }else {
            return null;
        }
    }

    public Long checkExistUser(RegisterReq registerReq){
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUsernameEqualTo(registerReq.getUsername());
        return userDAO.countByExample(userExample);
    }

    public Integer register(RegisterReq registerReq){
        User user = new User();
        user.setGolds(10);
        user.setCredits(0);
        user.setIsadmin(0);
        user.setEmail(registerReq.getEmail());
        user.setPosts(0);
        user.setCreateDate((int)System.currentTimeMillis()/1000);
        user.setPassword(registerReq.getPassword());
        user.setUsername(registerReq.getUsername());
        user.setLoginDate((int)System.currentTimeMillis()/1000);
        user.setThreads(0);
        return userDAO.insert(user);
    }

}
