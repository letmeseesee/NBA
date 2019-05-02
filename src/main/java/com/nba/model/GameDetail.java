package com.nba.model;

import java.io.Serializable;
import java.util.Date;

/**
 * game_detail
 * @author 
 */
public class GameDetail implements Serializable {
    private Integer playId;

    private Integer quarterId;

    private String quarterName;

    private Integer sequence;

    private Integer timeRemainingMinutes;

    private Integer timeRemainingSeconds;

    private Integer awayTeamScore;

    private Integer homeTeamScore;

    private Integer potentialPoints;

    private Integer points;

    private Boolean shotMade;

    private String category;

    private String type;

    private Integer teamId;

    private String team;

    private Integer opponentId;

    private String opponent;

    private Integer receivingTeamId;

    private String receivingTeam;

    private String description;

    private Integer playerId;

    private Integer assistedByPlayerId;

    private Integer blockedByPlayerId;

    private Boolean fastBreak;

    private String sideOfBasket;

    private Date updated;

    private String created;

    private Integer substituteinPlayerId;

    private Integer substituteOutPlayerId;

    private static final long serialVersionUID = 1L;

    public Integer getPlayId() {
        return playId;
    }

    public void setPlayId(Integer playId) {
        this.playId = playId;
    }

    public Integer getQuarterId() {
        return quarterId;
    }

    public void setQuarterId(Integer quarterId) {
        this.quarterId = quarterId;
    }

    public String getQuarterName() {
        return quarterName;
    }

    public void setQuarterName(String quarterName) {
        this.quarterName = quarterName;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
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

    public Integer getPotentialPoints() {
        return potentialPoints;
    }

    public void setPotentialPoints(Integer potentialPoints) {
        this.potentialPoints = potentialPoints;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Boolean getShotMade() {
        return shotMade;
    }

    public void setShotMade(Boolean shotMade) {
        this.shotMade = shotMade;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public Integer getOpponentId() {
        return opponentId;
    }

    public void setOpponentId(Integer opponentId) {
        this.opponentId = opponentId;
    }

    public String getOpponent() {
        return opponent;
    }

    public void setOpponent(String opponent) {
        this.opponent = opponent;
    }

    public Integer getReceivingTeamId() {
        return receivingTeamId;
    }

    public void setReceivingTeamId(Integer receivingTeamId) {
        this.receivingTeamId = receivingTeamId;
    }

    public String getReceivingTeam() {
        return receivingTeam;
    }

    public void setReceivingTeam(String receivingTeam) {
        this.receivingTeam = receivingTeam;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    public Integer getAssistedByPlayerId() {
        return assistedByPlayerId;
    }

    public void setAssistedByPlayerId(Integer assistedByPlayerId) {
        this.assistedByPlayerId = assistedByPlayerId;
    }

    public Integer getBlockedByPlayerId() {
        return blockedByPlayerId;
    }

    public void setBlockedByPlayerId(Integer blockedByPlayerId) {
        this.blockedByPlayerId = blockedByPlayerId;
    }

    public Boolean getFastBreak() {
        return fastBreak;
    }

    public void setFastBreak(Boolean fastBreak) {
        this.fastBreak = fastBreak;
    }

    public String getSideOfBasket() {
        return sideOfBasket;
    }

    public void setSideOfBasket(String sideOfBasket) {
        this.sideOfBasket = sideOfBasket;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public Integer getSubstituteinPlayerId() {
        return substituteinPlayerId;
    }

    public void setSubstituteinPlayerId(Integer substituteinPlayerId) {
        this.substituteinPlayerId = substituteinPlayerId;
    }

    public Integer getSubstituteOutPlayerId() {
        return substituteOutPlayerId;
    }

    public void setSubstituteOutPlayerId(Integer substituteOutPlayerId) {
        this.substituteOutPlayerId = substituteOutPlayerId;
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
        GameDetail other = (GameDetail) that;
        return (this.getPlayId() == null ? other.getPlayId() == null : this.getPlayId().equals(other.getPlayId()))
            && (this.getQuarterId() == null ? other.getQuarterId() == null : this.getQuarterId().equals(other.getQuarterId()))
            && (this.getQuarterName() == null ? other.getQuarterName() == null : this.getQuarterName().equals(other.getQuarterName()))
            && (this.getSequence() == null ? other.getSequence() == null : this.getSequence().equals(other.getSequence()))
            && (this.getTimeRemainingMinutes() == null ? other.getTimeRemainingMinutes() == null : this.getTimeRemainingMinutes().equals(other.getTimeRemainingMinutes()))
            && (this.getTimeRemainingSeconds() == null ? other.getTimeRemainingSeconds() == null : this.getTimeRemainingSeconds().equals(other.getTimeRemainingSeconds()))
            && (this.getAwayTeamScore() == null ? other.getAwayTeamScore() == null : this.getAwayTeamScore().equals(other.getAwayTeamScore()))
            && (this.getHomeTeamScore() == null ? other.getHomeTeamScore() == null : this.getHomeTeamScore().equals(other.getHomeTeamScore()))
            && (this.getPotentialPoints() == null ? other.getPotentialPoints() == null : this.getPotentialPoints().equals(other.getPotentialPoints()))
            && (this.getPoints() == null ? other.getPoints() == null : this.getPoints().equals(other.getPoints()))
            && (this.getShotMade() == null ? other.getShotMade() == null : this.getShotMade().equals(other.getShotMade()))
            && (this.getCategory() == null ? other.getCategory() == null : this.getCategory().equals(other.getCategory()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getTeamId() == null ? other.getTeamId() == null : this.getTeamId().equals(other.getTeamId()))
            && (this.getTeam() == null ? other.getTeam() == null : this.getTeam().equals(other.getTeam()))
            && (this.getOpponentId() == null ? other.getOpponentId() == null : this.getOpponentId().equals(other.getOpponentId()))
            && (this.getOpponent() == null ? other.getOpponent() == null : this.getOpponent().equals(other.getOpponent()))
            && (this.getReceivingTeamId() == null ? other.getReceivingTeamId() == null : this.getReceivingTeamId().equals(other.getReceivingTeamId()))
            && (this.getReceivingTeam() == null ? other.getReceivingTeam() == null : this.getReceivingTeam().equals(other.getReceivingTeam()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getPlayerId() == null ? other.getPlayerId() == null : this.getPlayerId().equals(other.getPlayerId()))
            && (this.getAssistedByPlayerId() == null ? other.getAssistedByPlayerId() == null : this.getAssistedByPlayerId().equals(other.getAssistedByPlayerId()))
            && (this.getBlockedByPlayerId() == null ? other.getBlockedByPlayerId() == null : this.getBlockedByPlayerId().equals(other.getBlockedByPlayerId()))
            && (this.getFastBreak() == null ? other.getFastBreak() == null : this.getFastBreak().equals(other.getFastBreak()))
            && (this.getSideOfBasket() == null ? other.getSideOfBasket() == null : this.getSideOfBasket().equals(other.getSideOfBasket()))
            && (this.getUpdated() == null ? other.getUpdated() == null : this.getUpdated().equals(other.getUpdated()))
            && (this.getCreated() == null ? other.getCreated() == null : this.getCreated().equals(other.getCreated()))
            && (this.getSubstituteinPlayerId() == null ? other.getSubstituteinPlayerId() == null : this.getSubstituteinPlayerId().equals(other.getSubstituteinPlayerId()))
            && (this.getSubstituteOutPlayerId() == null ? other.getSubstituteOutPlayerId() == null : this.getSubstituteOutPlayerId().equals(other.getSubstituteOutPlayerId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPlayId() == null) ? 0 : getPlayId().hashCode());
        result = prime * result + ((getQuarterId() == null) ? 0 : getQuarterId().hashCode());
        result = prime * result + ((getQuarterName() == null) ? 0 : getQuarterName().hashCode());
        result = prime * result + ((getSequence() == null) ? 0 : getSequence().hashCode());
        result = prime * result + ((getTimeRemainingMinutes() == null) ? 0 : getTimeRemainingMinutes().hashCode());
        result = prime * result + ((getTimeRemainingSeconds() == null) ? 0 : getTimeRemainingSeconds().hashCode());
        result = prime * result + ((getAwayTeamScore() == null) ? 0 : getAwayTeamScore().hashCode());
        result = prime * result + ((getHomeTeamScore() == null) ? 0 : getHomeTeamScore().hashCode());
        result = prime * result + ((getPotentialPoints() == null) ? 0 : getPotentialPoints().hashCode());
        result = prime * result + ((getPoints() == null) ? 0 : getPoints().hashCode());
        result = prime * result + ((getShotMade() == null) ? 0 : getShotMade().hashCode());
        result = prime * result + ((getCategory() == null) ? 0 : getCategory().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getTeamId() == null) ? 0 : getTeamId().hashCode());
        result = prime * result + ((getTeam() == null) ? 0 : getTeam().hashCode());
        result = prime * result + ((getOpponentId() == null) ? 0 : getOpponentId().hashCode());
        result = prime * result + ((getOpponent() == null) ? 0 : getOpponent().hashCode());
        result = prime * result + ((getReceivingTeamId() == null) ? 0 : getReceivingTeamId().hashCode());
        result = prime * result + ((getReceivingTeam() == null) ? 0 : getReceivingTeam().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getPlayerId() == null) ? 0 : getPlayerId().hashCode());
        result = prime * result + ((getAssistedByPlayerId() == null) ? 0 : getAssistedByPlayerId().hashCode());
        result = prime * result + ((getBlockedByPlayerId() == null) ? 0 : getBlockedByPlayerId().hashCode());
        result = prime * result + ((getFastBreak() == null) ? 0 : getFastBreak().hashCode());
        result = prime * result + ((getSideOfBasket() == null) ? 0 : getSideOfBasket().hashCode());
        result = prime * result + ((getUpdated() == null) ? 0 : getUpdated().hashCode());
        result = prime * result + ((getCreated() == null) ? 0 : getCreated().hashCode());
        result = prime * result + ((getSubstituteinPlayerId() == null) ? 0 : getSubstituteinPlayerId().hashCode());
        result = prime * result + ((getSubstituteOutPlayerId() == null) ? 0 : getSubstituteOutPlayerId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", playId=").append(playId);
        sb.append(", quarterId=").append(quarterId);
        sb.append(", quarterName=").append(quarterName);
        sb.append(", sequence=").append(sequence);
        sb.append(", timeRemainingMinutes=").append(timeRemainingMinutes);
        sb.append(", timeRemainingSeconds=").append(timeRemainingSeconds);
        sb.append(", awayTeamScore=").append(awayTeamScore);
        sb.append(", homeTeamScore=").append(homeTeamScore);
        sb.append(", potentialPoints=").append(potentialPoints);
        sb.append(", points=").append(points);
        sb.append(", shotMade=").append(shotMade);
        sb.append(", category=").append(category);
        sb.append(", type=").append(type);
        sb.append(", teamId=").append(teamId);
        sb.append(", team=").append(team);
        sb.append(", opponentId=").append(opponentId);
        sb.append(", opponent=").append(opponent);
        sb.append(", receivingTeamId=").append(receivingTeamId);
        sb.append(", receivingTeam=").append(receivingTeam);
        sb.append(", description=").append(description);
        sb.append(", playerId=").append(playerId);
        sb.append(", assistedByPlayerId=").append(assistedByPlayerId);
        sb.append(", blockedByPlayerId=").append(blockedByPlayerId);
        sb.append(", fastBreak=").append(fastBreak);
        sb.append(", sideOfBasket=").append(sideOfBasket);
        sb.append(", updated=").append(updated);
        sb.append(", created=").append(created);
        sb.append(", substituteinPlayerId=").append(substituteinPlayerId);
        sb.append(", substituteOutPlayerId=").append(substituteOutPlayerId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}