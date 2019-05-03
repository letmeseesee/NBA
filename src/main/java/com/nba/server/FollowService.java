package com.nba.server;

import com.nba.mapper.FollowDAO;
import com.nba.model.Follow;
import com.nba.model.FollowExample;
import com.nba.status.FollowEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class FollowService {
    @Autowired
    FollowDAO followDAO;


    @Autowired
    HttpServletRequest request;

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


}
