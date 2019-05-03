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
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author 2019-4-13
 */
@Slf4j
@Service
public class LoginService {
    private Logger logger = LoggerFactory.getLogger(LoginService.class);

    @Autowired
    UserDAO userDAO;

    @Autowired
    HttpServletRequest request;

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

    public List<String> getAllUserMail(List<Integer> userIds){
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUidIn(userIds);
        List<User> users = userDAO.selectByExample(userExample);
        return users.parallelStream().map(User::getEmail).collect(Collectors.toList());
    }

    //
    public void addUserThread(){
        User user = this.getUser((int)request.getSession().getAttribute("userId"));
        user.setThreads(user.getThreads() +1);
        user.setGolds(user.getGolds() +1);
        userDAO.updateByPrimaryKey(user);
    }

    public void addUserPost(){
        User user = this.getUser((int)request.getSession().getAttribute("userId"));
        user.setPosts(user.getPosts() +1);
        user.setGolds(user.getGolds() +1);
        userDAO.updateByPrimaryKey(user);
    }

    /**
     * 减少金币
     */
    @Transactional
    public Boolean deGold(){
        User user = this.getUser((int)request.getSession().getAttribute("userId"));
        if(user.getGolds() >= 1){
            user.setGolds(user.getGolds() - 1);
            userDAO.updateByPrimaryKey(user);
            return true;
        }else {
            return false;
        }
    }

}
