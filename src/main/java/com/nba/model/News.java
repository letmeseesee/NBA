package com.nba.model;

import java.io.Serializable;
import java.util.Date;

/**
 * news
 * @author 
 */
public class News implements Serializable {
    private Integer newsId;

    private Date updated;

    private Date timeAge;

    private String title;

    private String content;

    private String url;

    private String termOfUse;

    private String author;

    private String categories;

    private Integer playerId;

    private Integer teamId;

    private String team;

    private Integer playerId2;

    private Integer teamId2;

    private String team2;

    private static final long serialVersionUID = 1L;

    public Integer getNewsId() {
        return newsId;
    }

    public void setNewsId(Integer newsId) {
        this.newsId = newsId;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public Date getTimeAge() {
        return timeAge;
    }

    public void setTimeAge(Date timeAge) {
        this.timeAge = timeAge;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTermOfUse() {
        return termOfUse;
    }

    public void setTermOfUse(String termOfUse) {
        this.termOfUse = termOfUse;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public Integer getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
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

    public Integer getPlayerId2() {
        return playerId2;
    }

    public void setPlayerId2(Integer playerId2) {
        this.playerId2 = playerId2;
    }

    public Integer getTeamId2() {
        return teamId2;
    }

    public void setTeamId2(Integer teamId2) {
        this.teamId2 = teamId2;
    }

    public String getTeam2() {
        return team2;
    }

    public void setTeam2(String team2) {
        this.team2 = team2;
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
        News other = (News) that;
        return (this.getNewsId() == null ? other.getNewsId() == null : this.getNewsId().equals(other.getNewsId()))
            && (this.getUpdated() == null ? other.getUpdated() == null : this.getUpdated().equals(other.getUpdated()))
            && (this.getTimeAge() == null ? other.getTimeAge() == null : this.getTimeAge().equals(other.getTimeAge()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
            && (this.getTermOfUse() == null ? other.getTermOfUse() == null : this.getTermOfUse().equals(other.getTermOfUse()))
            && (this.getAuthor() == null ? other.getAuthor() == null : this.getAuthor().equals(other.getAuthor()))
            && (this.getCategories() == null ? other.getCategories() == null : this.getCategories().equals(other.getCategories()))
            && (this.getPlayerId() == null ? other.getPlayerId() == null : this.getPlayerId().equals(other.getPlayerId()))
            && (this.getTeamId() == null ? other.getTeamId() == null : this.getTeamId().equals(other.getTeamId()))
            && (this.getTeam() == null ? other.getTeam() == null : this.getTeam().equals(other.getTeam()))
            && (this.getPlayerId2() == null ? other.getPlayerId2() == null : this.getPlayerId2().equals(other.getPlayerId2()))
            && (this.getTeamId2() == null ? other.getTeamId2() == null : this.getTeamId2().equals(other.getTeamId2()))
            && (this.getTeam2() == null ? other.getTeam2() == null : this.getTeam2().equals(other.getTeam2()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getNewsId() == null) ? 0 : getNewsId().hashCode());
        result = prime * result + ((getUpdated() == null) ? 0 : getUpdated().hashCode());
        result = prime * result + ((getTimeAge() == null) ? 0 : getTimeAge().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getTermOfUse() == null) ? 0 : getTermOfUse().hashCode());
        result = prime * result + ((getAuthor() == null) ? 0 : getAuthor().hashCode());
        result = prime * result + ((getCategories() == null) ? 0 : getCategories().hashCode());
        result = prime * result + ((getPlayerId() == null) ? 0 : getPlayerId().hashCode());
        result = prime * result + ((getTeamId() == null) ? 0 : getTeamId().hashCode());
        result = prime * result + ((getTeam() == null) ? 0 : getTeam().hashCode());
        result = prime * result + ((getPlayerId2() == null) ? 0 : getPlayerId2().hashCode());
        result = prime * result + ((getTeamId2() == null) ? 0 : getTeamId2().hashCode());
        result = prime * result + ((getTeam2() == null) ? 0 : getTeam2().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", newsId=").append(newsId);
        sb.append(", updated=").append(updated);
        sb.append(", timeAge=").append(timeAge);
        sb.append(", title=").append(title);
        sb.append(", content=").append(content);
        sb.append(", url=").append(url);
        sb.append(", termOfUse=").append(termOfUse);
        sb.append(", author=").append(author);
        sb.append(", categories=").append(categories);
        sb.append(", playerId=").append(playerId);
        sb.append(", teamId=").append(teamId);
        sb.append(", team=").append(team);
        sb.append(", playerId2=").append(playerId2);
        sb.append(", teamId2=").append(teamId2);
        sb.append(", team2=").append(team2);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}