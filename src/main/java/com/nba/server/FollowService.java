package com.nba.server;

import com.nba.mapper.FollowDAO;
import com.nba.mapper.GameDetailDAO;
import com.nba.mapper.GamesDAO;
import com.nba.model.Follow;
import com.nba.model.FollowExample;
import com.nba.model.Games;
import com.nba.status.FollowEnum;
import io.swagger.models.auth.In;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class FollowService {
    private Logger logger = LoggerFactory.getLogger(FollowService.class);
    @Autowired
    FollowDAO followDAO;


    @Autowired
    HttpServletRequest request;

    @Autowired
    LoginService loginService;

    @Autowired
    GamesDAO gamesDAO;

    @Autowired
    NbaMailService nbaMailService;

    /**
     *
     * @param game_id
     * @return
     */
    public Long checkIsFollowed(Integer game_id){
        FollowExample followExample = new FollowExample();
        FollowExample.Criteria criteria = followExample.createCriteria();
        criteria.andGameIdEqualTo(game_id);
        criteria.andUidEqualTo((int) request.getSession().getAttribute("userId"));
        return followDAO.countByExample(followExample);
    }

    /**
     *
     * @param game_id
     * @return
     */
    public Integer addFollow(Integer game_id){
        Follow follow = new Follow();
        follow.setCount(0);
        follow.setStatus(FollowEnum.NOT_START.getCode().intValue());
        follow.setGameId(game_id);
        follow.setUid((int) request.getSession().getAttribute("userId"));
        return followDAO.insert(follow);
    }

    public List<Integer> getFollowedGames(List<Integer> game_ids){
        FollowExample followExample = new FollowExample();
        FollowExample.Criteria criteria = followExample.createCriteria();
        criteria.andGameIdIn(game_ids);
        criteria.andUidEqualTo((int) request.getSession().getAttribute("userId"));
        List<Follow> followList = followDAO.selectByExample(followExample);
        if(followList.isEmpty()){
            return null;
        }
        return followList.parallelStream().map(Follow::getGameId).collect(Collectors.toList());
    }

    @Transactional
    public void sendNoticeMail(Integer game_id){
        FollowExample followExample = new FollowExample();
        FollowExample.Criteria criteria = followExample.createCriteria();
        criteria.andGameIdEqualTo(game_id);
        criteria.andStatusNotEqualTo(FollowEnum.SEND.getCode().intValue());
        List<Follow> followList = followDAO.selectByExample(followExample);
        //获取对应的比赛
        Games games = gamesDAO.selectByPrimaryKey(game_id);
        //
        String emailMsg = "您关注的比赛 "+games.getHomeTeam()+" VS "+games.getAwayTeam()+" 已经开始！";
        //取得所有的用户
        List<Integer> uids = followList.parallelStream().map(Follow::getUid).collect(Collectors.toList());
        if(!uids.isEmpty()) {
            List<String> allEmails = loginService.getAllUserMail(uids);
            //
            for (String email : allEmails) {
                logger.info("向邮件{}发送比赛提醒",email);
                nbaMailService.sendSimpleMail("比赛开始提醒", emailMsg, email);
            }

            for (Follow follow : followList) {
                follow.setStatus(FollowEnum.SEND.getCode().intValue());
                follow.setCount(follow.getCount() + 1);
                followDAO.updateByPrimaryKey(follow);
            }
        }
    }




}
