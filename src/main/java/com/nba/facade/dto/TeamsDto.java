package com.nba.facade.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * teams
 * @author 
 */
public class TeamsDto implements Serializable {
    private Integer teamId;

    private String key;

    private Boolean active;

    private String city;

    private String name;

    private Integer leagueId;

    private Integer stadiumId;

    private String conference;

    private String division;

    private String primaryColor;

    private String secondaryColor;

    private String tertiaryColor;

    private String quaternaryColor;

    private String wikipediaLogoUrl;

    private String wikipediaWordMarkUrl;

    private Integer globalTeamId;

    private static final long serialVersionUID = 1L;

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(Integer leagueId) {
        this.leagueId = leagueId;
    }

    public Integer getStadiumId() {
        return stadiumId;
    }

    public void setStadiumId(Integer stadiumId) {
        this.stadiumId = stadiumId;
    }

    public String getConference() {
        return conference;
    }

    public void setConference(String conference) {
        this.conference = conference;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getPrimaryColor() {
        return primaryColor;
    }

    public void setPrimaryColor(String primaryColor) {
        this.primaryColor = primaryColor;
    }

    public String getSecondaryColor() {
        return secondaryColor;
    }

    public void setSecondaryColor(String secondaryColor) {
        this.secondaryColor = secondaryColor;
    }

    public String getTertiaryColor() {
        return tertiaryColor;
    }

    public void setTertiaryColor(String tertiaryColor) {
        this.tertiaryColor = tertiaryColor;
    }

    public String getQuaternaryColor() {
        return quaternaryColor;
    }

    public void setQuaternaryColor(String quaternaryColor) {
        this.quaternaryColor = quaternaryColor;
    }

    public String getWikipediaLogoUrl() {
        return wikipediaLogoUrl;
    }

    public void setWikipediaLogoUrl(String wikipediaLogoUrl) {
        this.wikipediaLogoUrl = wikipediaLogoUrl;
    }

    public String getWikipediaWordMarkUrl() {
        return wikipediaWordMarkUrl;
    }

    public void setWikipediaWordMarkUrl(String wikipediaWordMarkUrl) {
        this.wikipediaWordMarkUrl = wikipediaWordMarkUrl;
    }

    public Integer getGlobalTeamId() {
        return globalTeamId;
    }

    public void setGlobalTeamId(Integer globalTeamId) {
        this.globalTeamId = globalTeamId;
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
        TeamsDto other = (TeamsDto) that;
        return (this.getTeamId() == null ? other.getTeamId() == null : this.getTeamId().equals(other.getTeamId()))
            && (this.getKey() == null ? other.getKey() == null : this.getKey().equals(other.getKey()))
            && (this.getActive() == null ? other.getActive() == null : this.getActive().equals(other.getActive()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getLeagueId() == null ? other.getLeagueId() == null : this.getLeagueId().equals(other.getLeagueId()))
            && (this.getStadiumId() == null ? other.getStadiumId() == null : this.getStadiumId().equals(other.getStadiumId()))
            && (this.getConference() == null ? other.getConference() == null : this.getConference().equals(other.getConference()))
            && (this.getDivision() == null ? other.getDivision() == null : this.getDivision().equals(other.getDivision()))
            && (this.getPrimaryColor() == null ? other.getPrimaryColor() == null : this.getPrimaryColor().equals(other.getPrimaryColor()))
            && (this.getSecondaryColor() == null ? other.getSecondaryColor() == null : this.getSecondaryColor().equals(other.getSecondaryColor()))
            && (this.getTertiaryColor() == null ? other.getTertiaryColor() == null : this.getTertiaryColor().equals(other.getTertiaryColor()))
            && (this.getQuaternaryColor() == null ? other.getQuaternaryColor() == null : this.getQuaternaryColor().equals(other.getQuaternaryColor()))
            && (this.getWikipediaLogoUrl() == null ? other.getWikipediaLogoUrl() == null : this.getWikipediaLogoUrl().equals(other.getWikipediaLogoUrl()))
            && (this.getWikipediaWordMarkUrl() == null ? other.getWikipediaWordMarkUrl() == null : this.getWikipediaWordMarkUrl().equals(other.getWikipediaWordMarkUrl()))
            && (this.getGlobalTeamId() == null ? other.getGlobalTeamId() == null : this.getGlobalTeamId().equals(other.getGlobalTeamId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTeamId() == null) ? 0 : getTeamId().hashCode());
        result = prime * result + ((getKey() == null) ? 0 : getKey().hashCode());
        result = prime * result + ((getActive() == null) ? 0 : getActive().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getLeagueId() == null) ? 0 : getLeagueId().hashCode());
        result = prime * result + ((getStadiumId() == null) ? 0 : getStadiumId().hashCode());
        result = prime * result + ((getConference() == null) ? 0 : getConference().hashCode());
        result = prime * result + ((getDivision() == null) ? 0 : getDivision().hashCode());
        result = prime * result + ((getPrimaryColor() == null) ? 0 : getPrimaryColor().hashCode());
        result = prime * result + ((getSecondaryColor() == null) ? 0 : getSecondaryColor().hashCode());
        result = prime * result + ((getTertiaryColor() == null) ? 0 : getTertiaryColor().hashCode());
        result = prime * result + ((getQuaternaryColor() == null) ? 0 : getQuaternaryColor().hashCode());
        result = prime * result + ((getWikipediaLogoUrl() == null) ? 0 : getWikipediaLogoUrl().hashCode());
        result = prime * result + ((getWikipediaWordMarkUrl() == null) ? 0 : getWikipediaWordMarkUrl().hashCode());
        result = prime * result + ((getGlobalTeamId() == null) ? 0 : getGlobalTeamId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", teamId=").append(teamId);
        sb.append(", key=").append(key);
        sb.append(", active=").append(active);
        sb.append(", city=").append(city);
        sb.append(", name=").append(name);
        sb.append(", leagueId=").append(leagueId);
        sb.append(", stadiumId=").append(stadiumId);
        sb.append(", conference=").append(conference);
        sb.append(", division=").append(division);
        sb.append(", primaryColor=").append(primaryColor);
        sb.append(", secondaryColor=").append(secondaryColor);
        sb.append(", tertiaryColor=").append(tertiaryColor);
        sb.append(", quaternaryColor=").append(quaternaryColor);
        sb.append(", wikipediaLogoUrl=").append(wikipediaLogoUrl);
        sb.append(", wikipediaWordMarkUrl=").append(wikipediaWordMarkUrl);
        sb.append(", globalTeamId=").append(globalTeamId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}