package com.nba.model;

import java.io.Serializable;

/**
 * quarters
 * @author 
 */
public class Quarters implements Serializable {
    private Integer quarterId;

    private Integer gameId;

    private Integer number;

    private String name;

    private Integer awayScore;

    private Integer homeScore;

    private static final long serialVersionUID = 1L;

    public Integer getQuarterId() {
        return quarterId;
    }

    public void setQuarterId(Integer quarterId) {
        this.quarterId = quarterId;
    }

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAwayScore() {
        return awayScore;
    }

    public void setAwayScore(Integer awayScore) {
        this.awayScore = awayScore;
    }

    public Integer getHomeScore() {
        return homeScore;
    }

    public void setHomeScore(Integer homeScore) {
        this.homeScore = homeScore;
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
        Quarters other = (Quarters) that;
        return (this.getQuarterId() == null ? other.getQuarterId() == null : this.getQuarterId().equals(other.getQuarterId()))
            && (this.getGameId() == null ? other.getGameId() == null : this.getGameId().equals(other.getGameId()))
            && (this.getNumber() == null ? other.getNumber() == null : this.getNumber().equals(other.getNumber()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getAwayScore() == null ? other.getAwayScore() == null : this.getAwayScore().equals(other.getAwayScore()))
            && (this.getHomeScore() == null ? other.getHomeScore() == null : this.getHomeScore().equals(other.getHomeScore()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getQuarterId() == null) ? 0 : getQuarterId().hashCode());
        result = prime * result + ((getGameId() == null) ? 0 : getGameId().hashCode());
        result = prime * result + ((getNumber() == null) ? 0 : getNumber().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getAwayScore() == null) ? 0 : getAwayScore().hashCode());
        result = prime * result + ((getHomeScore() == null) ? 0 : getHomeScore().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", quarterId=").append(quarterId);
        sb.append(", gameId=").append(gameId);
        sb.append(", number=").append(number);
        sb.append(", name=").append(name);
        sb.append(", awayScore=").append(awayScore);
        sb.append(", homeScore=").append(homeScore);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}