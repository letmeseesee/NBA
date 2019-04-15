package com.nba.model;

import java.io.Serializable;
import java.util.Date;

/**
 * games
 * @author 
 */
public class Games implements Serializable {
    private Integer gameId;

    private Integer season;

    private Integer seasontype;

    private String status;

    private Date day;

    private Date dateTime;

    private String awayTeam;

    private String homeTeam;

    private Integer awayTeamId;

    private Integer homeTeamId;

    private Integer stadiumId;

    private String channel;

    private String attendance;

    private Integer awayTeamScore;

    private Integer homeTeamScore;

    private Date updated;

    private String quarter;

    private Integer timeRemainingMinutes;

    private Integer timeRemainingSeconds;

    private Double pointSpread;

    private Double overUnder;

    private Double awayTeamMoneyLine;

    private Double homeTeamMoneyLine;

    private Integer globalGameId;

    private Integer globalAwayTeamId;

    private Integer globalHomeTeamId;

    private Integer pointSpreadAwayTeamMoneyLine;

    private Integer pointSpreadHomeTeamNoneyLine;

    private String lastPlay;

    private String isClosed;

    private Date gameEndDateTime;

    private String quarters;

    private static final long serialVersionUID = 1L;

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public Integer getSeason() {
        return season;
    }

    public void setSeason(Integer season) {
        this.season = season;
    }

    public Integer getSeasontype() {
        return seasontype;
    }

    public void setSeasontype(Integer seasontype) {
        this.seasontype = seasontype;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public Integer getAwayTeamId() {
        return awayTeamId;
    }

    public void setAwayTeamId(Integer awayTeamId) {
        this.awayTeamId = awayTeamId;
    }

    public Integer getHomeTeamId() {
        return homeTeamId;
    }

    public void setHomeTeamId(Integer homeTeamId) {
        this.homeTeamId = homeTeamId;
    }

    public Integer getStadiumId() {
        return stadiumId;
    }

    public void setStadiumId(Integer stadiumId) {
        this.stadiumId = stadiumId;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getAttendance() {
        return attendance;
    }

    public void setAttendance(String attendance) {
        this.attendance = attendance;
    }

    public Integer getAwayTeamScore() {
        return awayTeamScore;
    }

    public void setAwayTeamScore(Integer awayTeamScore) {
        this.awayTeamScore = awayTeamScore;
    }

    public Integer getHomeTeamScore() {
        return homeTeamScore;
    }

    public void setHomeTeamScore(Integer homeTeamScore) {
        this.homeTeamScore = homeTeamScore;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public String getQuarter() {
        return quarter;
    }

    public void setQuarter(String quarter) {
        this.quarter = quarter;
    }

    public Integer getTimeRemainingMinutes() {
        return timeRemainingMinutes;
    }

    public void setTimeRemainingMinutes(Integer timeRemainingMinutes) {
        this.timeRemainingMinutes = timeRemainingMinutes;
    }

    public Integer getTimeRemainingSeconds() {
        return timeRemainingSeconds;
    }

    public void setTimeRemainingSeconds(Integer timeRemainingSeconds) {
        this.timeRemainingSeconds = timeRemainingSeconds;
    }

    public Double getPointSpread() {
        return pointSpread;
    }

    public void setPointSpread(Double pointSpread) {
        this.pointSpread = pointSpread;
    }

    public Double getOverUnder() {
        return overUnder;
    }

    public void setOverUnder(Double overUnder) {
        this.overUnder = overUnder;
    }

    public Double getAwayTeamMoneyLine() {
        return awayTeamMoneyLine;
    }

    public void setAwayTeamMoneyLine(Double awayTeamMoneyLine) {
        this.awayTeamMoneyLine = awayTeamMoneyLine;
    }

    public Double getHomeTeamMoneyLine() {
        return homeTeamMoneyLine;
    }

    public void setHomeTeamMoneyLine(Double homeTeamMoneyLine) {
        this.homeTeamMoneyLine = homeTeamMoneyLine;
    }

    public Integer getGlobalGameId() {
        return globalGameId;
    }

    public void setGlobalGameId(Integer globalGameId) {
        this.globalGameId = globalGameId;
    }

    public Integer getGlobalAwayTeamId() {
        return globalAwayTeamId;
    }

    public void setGlobalAwayTeamId(Integer globalAwayTeamId) {
        this.globalAwayTeamId = globalAwayTeamId;
    }

    public Integer getGlobalHomeTeamId() {
        return globalHomeTeamId;
    }

    public void setGlobalHomeTeamId(Integer globalHomeTeamId) {
        this.globalHomeTeamId = globalHomeTeamId;
    }

    public Integer getPointSpreadAwayTeamMoneyLine() {
        return pointSpreadAwayTeamMoneyLine;
    }

    public void setPointSpreadAwayTeamMoneyLine(Integer pointSpreadAwayTeamMoneyLine) {
        this.pointSpreadAwayTeamMoneyLine = pointSpreadAwayTeamMoneyLine;
    }

    public Integer getPointSpreadHomeTeamNoneyLine() {
        return pointSpreadHomeTeamNoneyLine;
    }

    public void setPointSpreadHomeTeamNoneyLine(Integer pointSpreadHomeTeamNoneyLine) {
        this.pointSpreadHomeTeamNoneyLine = pointSpreadHomeTeamNoneyLine;
    }

    public String getLastPlay() {
        return lastPlay;
    }

    public void setLastPlay(String lastPlay) {
        this.lastPlay = lastPlay;
    }

    public String getIsClosed() {
        return isClosed;
    }

    public void setIsClosed(String isClosed) {
        this.isClosed = isClosed;
    }

    public Date getGameEndDateTime() {
        return gameEndDateTime;
    }

    public void setGameEndDateTime(Date gameEndDateTime) {
        this.gameEndDateTime = gameEndDateTime;
    }

    public String getQuarters() {
        return quarters;
    }

    public void setQuarters(String quarters) {
        this.quarters = quarters;
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
        Games other = (Games) that;
        return (this.getGameId() == null ? other.getGameId() == null : this.getGameId().equals(other.getGameId()))
            && (this.getSeason() == null ? other.getSeason() == null : this.getSeason().equals(other.getSeason()))
            && (this.getSeasontype() == null ? other.getSeasontype() == null : this.getSeasontype().equals(other.getSeasontype()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getDay() == null ? other.getDay() == null : this.getDay().equals(other.getDay()))
            && (this.getDateTime() == null ? other.getDateTime() == null : this.getDateTime().equals(other.getDateTime()))
            && (this.getAwayTeam() == null ? other.getAwayTeam() == null : this.getAwayTeam().equals(other.getAwayTeam()))
            && (this.getHomeTeam() == null ? other.getHomeTeam() == null : this.getHomeTeam().equals(other.getHomeTeam()))
            && (this.getAwayTeamId() == null ? other.getAwayTeamId() == null : this.getAwayTeamId().equals(other.getAwayTeamId()))
            && (this.getHomeTeamId() == null ? other.getHomeTeamId() == null : this.getHomeTeamId().equals(other.getHomeTeamId()))
            && (this.getStadiumId() == null ? other.getStadiumId() == null : this.getStadiumId().equals(other.getStadiumId()))
            && (this.getChannel() == null ? other.getChannel() == null : this.getChannel().equals(other.getChannel()))
            && (this.getAttendance() == null ? other.getAttendance() == null : this.getAttendance().equals(other.getAttendance()))
            && (this.getAwayTeamScore() == null ? other.getAwayTeamScore() == null : this.getAwayTeamScore().equals(other.getAwayTeamScore()))
            && (this.getHomeTeamScore() == null ? other.getHomeTeamScore() == null : this.getHomeTeamScore().equals(other.getHomeTeamScore()))
            && (this.getUpdated() == null ? other.getUpdated() == null : this.getUpdated().equals(other.getUpdated()))
            && (this.getQuarter() == null ? other.getQuarter() == null : this.getQuarter().equals(other.getQuarter()))
            && (this.getTimeRemainingMinutes() == null ? other.getTimeRemainingMinutes() == null : this.getTimeRemainingMinutes().equals(other.getTimeRemainingMinutes()))
            && (this.getTimeRemainingSeconds() == null ? other.getTimeRemainingSeconds() == null : this.getTimeRemainingSeconds().equals(other.getTimeRemainingSeconds()))
            && (this.getPointSpread() == null ? other.getPointSpread() == null : this.getPointSpread().equals(other.getPointSpread()))
            && (this.getOverUnder() == null ? other.getOverUnder() == null : this.getOverUnder().equals(other.getOverUnder()))
            && (this.getAwayTeamMoneyLine() == null ? other.getAwayTeamMoneyLine() == null : this.getAwayTeamMoneyLine().equals(other.getAwayTeamMoneyLine()))
            && (this.getHomeTeamMoneyLine() == null ? other.getHomeTeamMoneyLine() == null : this.getHomeTeamMoneyLine().equals(other.getHomeTeamMoneyLine()))
            && (this.getGlobalGameId() == null ? other.getGlobalGameId() == null : this.getGlobalGameId().equals(other.getGlobalGameId()))
            && (this.getGlobalAwayTeamId() == null ? other.getGlobalAwayTeamId() == null : this.getGlobalAwayTeamId().equals(other.getGlobalAwayTeamId()))
            && (this.getGlobalHomeTeamId() == null ? other.getGlobalHomeTeamId() == null : this.getGlobalHomeTeamId().equals(other.getGlobalHomeTeamId()))
            && (this.getPointSpreadAwayTeamMoneyLine() == null ? other.getPointSpreadAwayTeamMoneyLine() == null : this.getPointSpreadAwayTeamMoneyLine().equals(other.getPointSpreadAwayTeamMoneyLine()))
            && (this.getPointSpreadHomeTeamNoneyLine() == null ? other.getPointSpreadHomeTeamNoneyLine() == null : this.getPointSpreadHomeTeamNoneyLine().equals(other.getPointSpreadHomeTeamNoneyLine()))
            && (this.getLastPlay() == null ? other.getLastPlay() == null : this.getLastPlay().equals(other.getLastPlay()))
            && (this.getIsClosed() == null ? other.getIsClosed() == null : this.getIsClosed().equals(other.getIsClosed()))
            && (this.getGameEndDateTime() == null ? other.getGameEndDateTime() == null : this.getGameEndDateTime().equals(other.getGameEndDateTime()))
            && (this.getQuarters() == null ? other.getQuarters() == null : this.getQuarters().equals(other.getQuarters()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getGameId() == null) ? 0 : getGameId().hashCode());
        result = prime * result + ((getSeason() == null) ? 0 : getSeason().hashCode());
        result = prime * result + ((getSeasontype() == null) ? 0 : getSeasontype().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getDay() == null) ? 0 : getDay().hashCode());
        result = prime * result + ((getDateTime() == null) ? 0 : getDateTime().hashCode());
        result = prime * result + ((getAwayTeam() == null) ? 0 : getAwayTeam().hashCode());
        result = prime * result + ((getHomeTeam() == null) ? 0 : getHomeTeam().hashCode());
        result = prime * result + ((getAwayTeamId() == null) ? 0 : getAwayTeamId().hashCode());
        result = prime * result + ((getHomeTeamId() == null) ? 0 : getHomeTeamId().hashCode());
        result = prime * result + ((getStadiumId() == null) ? 0 : getStadiumId().hashCode());
        result = prime * result + ((getChannel() == null) ? 0 : getChannel().hashCode());
        result = prime * result + ((getAttendance() == null) ? 0 : getAttendance().hashCode());
        result = prime * result + ((getAwayTeamScore() == null) ? 0 : getAwayTeamScore().hashCode());
        result = prime * result + ((getHomeTeamScore() == null) ? 0 : getHomeTeamScore().hashCode());
        result = prime * result + ((getUpdated() == null) ? 0 : getUpdated().hashCode());
        result = prime * result + ((getQuarter() == null) ? 0 : getQuarter().hashCode());
        result = prime * result + ((getTimeRemainingMinutes() == null) ? 0 : getTimeRemainingMinutes().hashCode());
        result = prime * result + ((getTimeRemainingSeconds() == null) ? 0 : getTimeRemainingSeconds().hashCode());
        result = prime * result + ((getPointSpread() == null) ? 0 : getPointSpread().hashCode());
        result = prime * result + ((getOverUnder() == null) ? 0 : getOverUnder().hashCode());
        result = prime * result + ((getAwayTeamMoneyLine() == null) ? 0 : getAwayTeamMoneyLine().hashCode());
        result = prime * result + ((getHomeTeamMoneyLine() == null) ? 0 : getHomeTeamMoneyLine().hashCode());
        result = prime * result + ((getGlobalGameId() == null) ? 0 : getGlobalGameId().hashCode());
        result = prime * result + ((getGlobalAwayTeamId() == null) ? 0 : getGlobalAwayTeamId().hashCode());
        result = prime * result + ((getGlobalHomeTeamId() == null) ? 0 : getGlobalHomeTeamId().hashCode());
        result = prime * result + ((getPointSpreadAwayTeamMoneyLine() == null) ? 0 : getPointSpreadAwayTeamMoneyLine().hashCode());
        result = prime * result + ((getPointSpreadHomeTeamNoneyLine() == null) ? 0 : getPointSpreadHomeTeamNoneyLine().hashCode());
        result = prime * result + ((getLastPlay() == null) ? 0 : getLastPlay().hashCode());
        result = prime * result + ((getIsClosed() == null) ? 0 : getIsClosed().hashCode());
        result = prime * result + ((getGameEndDateTime() == null) ? 0 : getGameEndDateTime().hashCode());
        result = prime * result + ((getQuarters() == null) ? 0 : getQuarters().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", gameId=").append(gameId);
        sb.append(", season=").append(season);
        sb.append(", seasontype=").append(seasontype);
        sb.append(", status=").append(status);
        sb.append(", day=").append(day);
        sb.append(", dateTime=").append(dateTime);
        sb.append(", awayTeam=").append(awayTeam);
        sb.append(", homeTeam=").append(homeTeam);
        sb.append(", awayTeamId=").append(awayTeamId);
        sb.append(", homeTeamId=").append(homeTeamId);
        sb.append(", stadiumId=").append(stadiumId);
        sb.append(", channel=").append(channel);
        sb.append(", attendance=").append(attendance);
        sb.append(", awayTeamScore=").append(awayTeamScore);
        sb.append(", homeTeamScore=").append(homeTeamScore);
        sb.append(", updated=").append(updated);
        sb.append(", quarter=").append(quarter);
        sb.append(", timeRemainingMinutes=").append(timeRemainingMinutes);
        sb.append(", timeRemainingSeconds=").append(timeRemainingSeconds);
        sb.append(", pointSpread=").append(pointSpread);
        sb.append(", overUnder=").append(overUnder);
        sb.append(", awayTeamMoneyLine=").append(awayTeamMoneyLine);
        sb.append(", homeTeamMoneyLine=").append(homeTeamMoneyLine);
        sb.append(", globalGameId=").append(globalGameId);
        sb.append(", globalAwayTeamId=").append(globalAwayTeamId);
        sb.append(", globalHomeTeamId=").append(globalHomeTeamId);
        sb.append(", pointSpreadAwayTeamMoneyLine=").append(pointSpreadAwayTeamMoneyLine);
        sb.append(", pointSpreadHomeTeamNoneyLine=").append(pointSpreadHomeTeamNoneyLine);
        sb.append(", lastPlay=").append(lastPlay);
        sb.append(", isClosed=").append(isClosed);
        sb.append(", gameEndDateTime=").append(gameEndDateTime);
        sb.append(", quarters=").append(quarters);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}