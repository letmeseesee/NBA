package com.nba.model;

import java.io.Serializable;
import java.util.Date;

/**
 * competition
 * @author 
 */
public class Competition implements Serializable {
    private Integer competitionId;

    /**
     * 对应的比赛id
     */
    private Integer gameId;

    /**
     * 1未开始 2开始 3结束
     */
    private Integer status;

    private Date addTime;

    private Integer homeTeamId;

    private Integer awayTeamId;

    private Double homeTeamOfficalSupport;

    private Double awayTeamOfficalSupport;

    private Integer homeTeamSupport;

    private Integer awayTeamSupport;

    private static final long serialVersionUID = 1L;

    public Integer getCompetitionId() {
        return competitionId;
    }

    public void setCompetitionId(Integer competitionId) {
        this.competitionId = competitionId;
    }

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Integer getHomeTeamId() {
        return homeTeamId;
    }

    public void setHomeTeamId(Integer homeTeamId) {
        this.homeTeamId = homeTeamId;
    }

    public Integer getAwayTeamId() {
        return awayTeamId;
    }

    public void setAwayTeamId(Integer awayTeamId) {
        this.awayTeamId = awayTeamId;
    }

    public Double getHomeTeamOfficalSupport() {
        return homeTeamOfficalSupport;
    }

    public void setHomeTeamOfficalSupport(Double homeTeamOfficalSupport) {
        this.homeTeamOfficalSupport = homeTeamOfficalSupport;
    }

    public Double getAwayTeamOfficalSupport() {
        return awayTeamOfficalSupport;
    }

    public void setAwayTeamOfficalSupport(Double awayTeamOfficalSupport) {
        this.awayTeamOfficalSupport = awayTeamOfficalSupport;
    }

    public Integer getHomeTeamSupport() {
        return homeTeamSupport;
    }

    public void setHomeTeamSupport(Integer homeTeamSupport) {
        this.homeTeamSupport = homeTeamSupport;
    }

    public Integer getAwayTeamSupport() {
        return awayTeamSupport;
    }

    public void setAwayTeamSupport(Integer awayTeamSupport) {
        this.awayTeamSupport = awayTeamSupport;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Competition other = (Competition) that;
        return (this.getCompetitionId() == null ? other.getCompetitionId() == null : this.getCompetitionId().equals(other.getCompetitionId()))
            && (this.getGameId() == null ? other.getGameId() == null : this.getGameId().equals(other.getGameId()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getAddTime() == null ? other.getAddTime() == null : this.getAddTime().equals(other.getAddTime()))
            && (this.getHomeTeamId() == null ? other.getHomeTeamId() == null : this.getHomeTeamId().equals(other.getHomeTeamId()))
            && (this.getAwayTeamId() == null ? other.getAwayTeamId() == null : this.getAwayTeamId().equals(other.getAwayTeamId()))
            && (this.getHomeTeamOfficalSupport() == null ? other.getHomeTeamOfficalSupport() == null : this.getHomeTeamOfficalSupport().equals(other.getHomeTeamOfficalSupport()))
            && (this.getAwayTeamOfficalSupport() == null ? other.getAwayTeamOfficalSupport() == null : this.getAwayTeamOfficalSupport().equals(other.getAwayTeamOfficalSupport()))
            && (this.getHomeTeamSupport() == null ? other.getHomeTeamSupport() == null : this.getHomeTeamSupport().equals(other.getHomeTeamSupport()))
            && (this.getAwayTeamSupport() == null ? other.getAwayTeamSupport() == null : this.getAwayTeamSupport().equals(other.getAwayTeamSupport()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCompetitionId() == null) ? 0 : getCompetitionId().hashCode());
        result = prime * result + ((getGameId() == null) ? 0 : getGameId().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getAddTime() == null) ? 0 : getAddTime().hashCode());
        result = prime * result + ((getHomeTeamId() == null) ? 0 : getHomeTeamId().hashCode());
        result = prime * result + ((getAwayTeamId() == null) ? 0 : getAwayTeamId().hashCode());
        result = prime * result + ((getHomeTeamOfficalSupport() == null) ? 0 : getHomeTeamOfficalSupport().hashCode());
        result = prime * result + ((getAwayTeamOfficalSupport() == null) ? 0 : getAwayTeamOfficalSupport().hashCode());
        result = prime * result + ((getHomeTeamSupport() == null) ? 0 : getHomeTeamSupport().hashCode());
        result = prime * result + ((getAwayTeamSupport() == null) ? 0 : getAwayTeamSupport().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", competitionId=").append(competitionId);
        sb.append(", gameId=").append(gameId);
        sb.append(", status=").append(status);
        sb.append(", addTime=").append(addTime);
        sb.append(", homeTeamId=").append(homeTeamId);
        sb.append(", awayTeamId=").append(awayTeamId);
        sb.append(", homeTeamOfficalSupport=").append(homeTeamOfficalSupport);
        sb.append(", awayTeamOfficalSupport=").append(awayTeamOfficalSupport);
        sb.append(", homeTeamSupport=").append(homeTeamSupport);
        sb.append(", awayTeamSupport=").append(awayTeamSupport);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}