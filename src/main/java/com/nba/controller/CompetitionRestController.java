package com.nba.controller;

import com.nba.facade.api.CompetitionApi;
import com.nba.facade.vo.request.BetReq;
import com.nba.facade.vo.request.FollowReq;
import com.nba.facade.vo.response.ajaxRsp;
import com.nba.server.CompetitionService;
import com.nba.server.FollowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class CompetitionRestController implements CompetitionApi {
    @Autowired
    CompetitionService competitionService;

    @Autowired
    FollowService followService;

    @Autowired
    HttpServletRequest request;

    @Override
    public ajaxRsp bet(@RequestBody BetReq betReq) {
        //判断是否已经下注过
        ajaxRsp ajaxRsp = new ajaxRsp();
        if(competitionService.countCompetition(betReq.getGameId()) > 0){
            ajaxRsp.setCode(1);
            ajaxRsp.setMsg("已经竞猜过");
        } else {
            Integer code = competitionService.betCompetition(betReq.getGameId(),betReq.getTeamId());
            if(code>0){
                ajaxRsp.setCode(0);
            }else {
                ajaxRsp.setCode(1);
                if(code == -1){
                    ajaxRsp.setMsg("金币不足");
                }else if(code == -2){
                    ajaxRsp.setMsg("没有对应的竞猜");
                }else {
                    ajaxRsp.setMsg("参与竞猜失败");
                }
            }
        }
        return ajaxRsp;
    }

    @Override
    public ajaxRsp follow(@RequestBody FollowReq followReq) {
        //判断是否已经关注注过
        ajaxRsp ajaxRsp = new ajaxRsp();
        if(followService.checkIsFollowed(followReq.getGameId()) > 0){
            ajaxRsp.setCode(1);
            ajaxRsp.setMsg("已关注");
        } else {
            if(followService.addFollow(followReq.getGameId())>0){
                ajaxRsp.setCode(0);
            }else {
                ajaxRsp.setCode(1);
                ajaxRsp.setMsg("关注失败");
            }
        }
        return ajaxRsp;
    }
}
