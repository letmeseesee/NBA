package com.nba.facade.dto;

import lombok.Data;

import java.util.Date;

@Data
public class LastGameDot {
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

    private String homeTeamLogo;

    private String awayTeamLogo;
}
