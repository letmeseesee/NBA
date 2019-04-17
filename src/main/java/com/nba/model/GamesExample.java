package com.nba.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GamesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    private Boolean forUpdate;

    public GamesExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
    }

    public void setForUpdate(Boolean forUpdate) {
        this.forUpdate = forUpdate;
    }

    public Boolean getForUpdate() {
        return forUpdate;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andGameIdIsNull() {
            addCriterion("game_id is null");
            return (Criteria) this;
        }

        public Criteria andGameIdIsNotNull() {
            addCriterion("game_id is not null");
            return (Criteria) this;
        }

        public Criteria andGameIdEqualTo(Integer value) {
            addCriterion("game_id =", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdNotEqualTo(Integer value) {
            addCriterion("game_id <>", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdGreaterThan(Integer value) {
            addCriterion("game_id >", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("game_id >=", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdLessThan(Integer value) {
            addCriterion("game_id <", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdLessThanOrEqualTo(Integer value) {
            addCriterion("game_id <=", value, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdIn(List<Integer> values) {
            addCriterion("game_id in", values, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdNotIn(List<Integer> values) {
            addCriterion("game_id not in", values, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdBetween(Integer value1, Integer value2) {
            addCriterion("game_id between", value1, value2, "gameId");
            return (Criteria) this;
        }

        public Criteria andGameIdNotBetween(Integer value1, Integer value2) {
            addCriterion("game_id not between", value1, value2, "gameId");
            return (Criteria) this;
        }

        public Criteria andSeasonIsNull() {
            addCriterion("season is null");
            return (Criteria) this;
        }

        public Criteria andSeasonIsNotNull() {
            addCriterion("season is not null");
            return (Criteria) this;
        }

        public Criteria andSeasonEqualTo(Integer value) {
            addCriterion("season =", value, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonNotEqualTo(Integer value) {
            addCriterion("season <>", value, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonGreaterThan(Integer value) {
            addCriterion("season >", value, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonGreaterThanOrEqualTo(Integer value) {
            addCriterion("season >=", value, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonLessThan(Integer value) {
            addCriterion("season <", value, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonLessThanOrEqualTo(Integer value) {
            addCriterion("season <=", value, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonIn(List<Integer> values) {
            addCriterion("season in", values, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonNotIn(List<Integer> values) {
            addCriterion("season not in", values, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonBetween(Integer value1, Integer value2) {
            addCriterion("season between", value1, value2, "season");
            return (Criteria) this;
        }

        public Criteria andSeasonNotBetween(Integer value1, Integer value2) {
            addCriterion("season not between", value1, value2, "season");
            return (Criteria) this;
        }

        public Criteria andSeasontypeIsNull() {
            addCriterion("seasonType is null");
            return (Criteria) this;
        }

        public Criteria andSeasontypeIsNotNull() {
            addCriterion("seasonType is not null");
            return (Criteria) this;
        }

        public Criteria andSeasontypeEqualTo(Integer value) {
            addCriterion("seasonType =", value, "seasontype");
            return (Criteria) this;
        }

        public Criteria andSeasontypeNotEqualTo(Integer value) {
            addCriterion("seasonType <>", value, "seasontype");
            return (Criteria) this;
        }

        public Criteria andSeasontypeGreaterThan(Integer value) {
            addCriterion("seasonType >", value, "seasontype");
            return (Criteria) this;
        }

        public Criteria andSeasontypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("seasonType >=", value, "seasontype");
            return (Criteria) this;
        }

        public Criteria andSeasontypeLessThan(Integer value) {
            addCriterion("seasonType <", value, "seasontype");
            return (Criteria) this;
        }

        public Criteria andSeasontypeLessThanOrEqualTo(Integer value) {
            addCriterion("seasonType <=", value, "seasontype");
            return (Criteria) this;
        }

        public Criteria andSeasontypeIn(List<Integer> values) {
            addCriterion("seasonType in", values, "seasontype");
            return (Criteria) this;
        }

        public Criteria andSeasontypeNotIn(List<Integer> values) {
            addCriterion("seasonType not in", values, "seasontype");
            return (Criteria) this;
        }

        public Criteria andSeasontypeBetween(Integer value1, Integer value2) {
            addCriterion("seasonType between", value1, value2, "seasontype");
            return (Criteria) this;
        }

        public Criteria andSeasontypeNotBetween(Integer value1, Integer value2) {
            addCriterion("seasonType not between", value1, value2, "seasontype");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("`status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("`status` like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("`status` not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("`status` not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andDayIsNull() {
            addCriterion("`day` is null");
            return (Criteria) this;
        }

        public Criteria andDayIsNotNull() {
            addCriterion("`day` is not null");
            return (Criteria) this;
        }

        public Criteria andDayEqualTo(Date value) {
            addCriterion("`day` =", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayNotEqualTo(Date value) {
            addCriterion("`day` <>", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayGreaterThan(Date value) {
            addCriterion("`day` >", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayGreaterThanOrEqualTo(Date value) {
            addCriterion("`day` >=", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayLessThan(Date value) {
            addCriterion("`day` <", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayLessThanOrEqualTo(Date value) {
            addCriterion("`day` <=", value, "day");
            return (Criteria) this;
        }

        public Criteria andDayIn(List<Date> values) {
            addCriterion("`day` in", values, "day");
            return (Criteria) this;
        }

        public Criteria andDayNotIn(List<Date> values) {
            addCriterion("`day` not in", values, "day");
            return (Criteria) this;
        }

        public Criteria andDayBetween(Date value1, Date value2) {
            addCriterion("`day` between", value1, value2, "day");
            return (Criteria) this;
        }

        public Criteria andDayNotBetween(Date value1, Date value2) {
            addCriterion("`day` not between", value1, value2, "day");
            return (Criteria) this;
        }

        public Criteria andDateTimeIsNull() {
            addCriterion("date_time is null");
            return (Criteria) this;
        }

        public Criteria andDateTimeIsNotNull() {
            addCriterion("date_time is not null");
            return (Criteria) this;
        }

        public Criteria andDateTimeEqualTo(Date value) {
            addCriterion("date_time =", value, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeNotEqualTo(Date value) {
            addCriterion("date_time <>", value, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeGreaterThan(Date value) {
            addCriterion("date_time >", value, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("date_time >=", value, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeLessThan(Date value) {
            addCriterion("date_time <", value, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeLessThanOrEqualTo(Date value) {
            addCriterion("date_time <=", value, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeIn(List<Date> values) {
            addCriterion("date_time in", values, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeNotIn(List<Date> values) {
            addCriterion("date_time not in", values, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeBetween(Date value1, Date value2) {
            addCriterion("date_time between", value1, value2, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeNotBetween(Date value1, Date value2) {
            addCriterion("date_time not between", value1, value2, "dateTime");
            return (Criteria) this;
        }

        public Criteria andAwayTeamIsNull() {
            addCriterion("away_team is null");
            return (Criteria) this;
        }

        public Criteria andAwayTeamIsNotNull() {
            addCriterion("away_team is not null");
            return (Criteria) this;
        }

        public Criteria andAwayTeamEqualTo(String value) {
            addCriterion("away_team =", value, "awayTeam");
            return (Criteria) this;
        }

        public Criteria andAwayTeamNotEqualTo(String value) {
            addCriterion("away_team <>", value, "awayTeam");
            return (Criteria) this;
        }

        public Criteria andAwayTeamGreaterThan(String value) {
            addCriterion("away_team >", value, "awayTeam");
            return (Criteria) this;
        }

        public Criteria andAwayTeamGreaterThanOrEqualTo(String value) {
            addCriterion("away_team >=", value, "awayTeam");
            return (Criteria) this;
        }

        public Criteria andAwayTeamLessThan(String value) {
            addCriterion("away_team <", value, "awayTeam");
            return (Criteria) this;
        }

        public Criteria andAwayTeamLessThanOrEqualTo(String value) {
            addCriterion("away_team <=", value, "awayTeam");
            return (Criteria) this;
        }

        public Criteria andAwayTeamLike(String value) {
            addCriterion("away_team like", value, "awayTeam");
            return (Criteria) this;
        }

        public Criteria andAwayTeamNotLike(String value) {
            addCriterion("away_team not like", value, "awayTeam");
            return (Criteria) this;
        }

        public Criteria andAwayTeamIn(List<String> values) {
            addCriterion("away_team in", values, "awayTeam");
            return (Criteria) this;
        }

        public Criteria andAwayTeamNotIn(List<String> values) {
            addCriterion("away_team not in", values, "awayTeam");
            return (Criteria) this;
        }

        public Criteria andAwayTeamBetween(String value1, String value2) {
            addCriterion("away_team between", value1, value2, "awayTeam");
            return (Criteria) this;
        }

        public Criteria andAwayTeamNotBetween(String value1, String value2) {
            addCriterion("away_team not between", value1, value2, "awayTeam");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIsNull() {
            addCriterion("home_team is null");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIsNotNull() {
            addCriterion("home_team is not null");
            return (Criteria) this;
        }

        public Criteria andHomeTeamEqualTo(String value) {
            addCriterion("home_team =", value, "homeTeam");
            return (Criteria) this;
        }

        public Criteria andHomeTeamNotEqualTo(String value) {
            addCriterion("home_team <>", value, "homeTeam");
            return (Criteria) this;
        }

        public Criteria andHomeTeamGreaterThan(String value) {
            addCriterion("home_team >", value, "homeTeam");
            return (Criteria) this;
        }

        public Criteria andHomeTeamGreaterThanOrEqualTo(String value) {
            addCriterion("home_team >=", value, "homeTeam");
            return (Criteria) this;
        }

        public Criteria andHomeTeamLessThan(String value) {
            addCriterion("home_team <", value, "homeTeam");
            return (Criteria) this;
        }

        public Criteria andHomeTeamLessThanOrEqualTo(String value) {
            addCriterion("home_team <=", value, "homeTeam");
            return (Criteria) this;
        }

        public Criteria andHomeTeamLike(String value) {
            addCriterion("home_team like", value, "homeTeam");
            return (Criteria) this;
        }

        public Criteria andHomeTeamNotLike(String value) {
            addCriterion("home_team not like", value, "homeTeam");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIn(List<String> values) {
            addCriterion("home_team in", values, "homeTeam");
            return (Criteria) this;
        }

        public Criteria andHomeTeamNotIn(List<String> values) {
            addCriterion("home_team not in", values, "homeTeam");
            return (Criteria) this;
        }

        public Criteria andHomeTeamBetween(String value1, String value2) {
            addCriterion("home_team between", value1, value2, "homeTeam");
            return (Criteria) this;
        }

        public Criteria andHomeTeamNotBetween(String value1, String value2) {
            addCriterion("home_team not between", value1, value2, "homeTeam");
            return (Criteria) this;
        }

        public Criteria andAwayTeamIdIsNull() {
            addCriterion("away_team_id is null");
            return (Criteria) this;
        }

        public Criteria andAwayTeamIdIsNotNull() {
            addCriterion("away_team_id is not null");
            return (Criteria) this;
        }

        public Criteria andAwayTeamIdEqualTo(Integer value) {
            addCriterion("away_team_id =", value, "awayTeamId");
            return (Criteria) this;
        }

        public Criteria andAwayTeamIdNotEqualTo(Integer value) {
            addCriterion("away_team_id <>", value, "awayTeamId");
            return (Criteria) this;
        }

        public Criteria andAwayTeamIdGreaterThan(Integer value) {
            addCriterion("away_team_id >", value, "awayTeamId");
            return (Criteria) this;
        }

        public Criteria andAwayTeamIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("away_team_id >=", value, "awayTeamId");
            return (Criteria) this;
        }

        public Criteria andAwayTeamIdLessThan(Integer value) {
            addCriterion("away_team_id <", value, "awayTeamId");
            return (Criteria) this;
        }

        public Criteria andAwayTeamIdLessThanOrEqualTo(Integer value) {
            addCriterion("away_team_id <=", value, "awayTeamId");
            return (Criteria) this;
        }

        public Criteria andAwayTeamIdIn(List<Integer> values) {
            addCriterion("away_team_id in", values, "awayTeamId");
            return (Criteria) this;
        }

        public Criteria andAwayTeamIdNotIn(List<Integer> values) {
            addCriterion("away_team_id not in", values, "awayTeamId");
            return (Criteria) this;
        }

        public Criteria andAwayTeamIdBetween(Integer value1, Integer value2) {
            addCriterion("away_team_id between", value1, value2, "awayTeamId");
            return (Criteria) this;
        }

        public Criteria andAwayTeamIdNotBetween(Integer value1, Integer value2) {
            addCriterion("away_team_id not between", value1, value2, "awayTeamId");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIdIsNull() {
            addCriterion("home_team_id is null");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIdIsNotNull() {
            addCriterion("home_team_id is not null");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIdEqualTo(Integer value) {
            addCriterion("home_team_id =", value, "homeTeamId");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIdNotEqualTo(Integer value) {
            addCriterion("home_team_id <>", value, "homeTeamId");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIdGreaterThan(Integer value) {
            addCriterion("home_team_id >", value, "homeTeamId");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("home_team_id >=", value, "homeTeamId");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIdLessThan(Integer value) {
            addCriterion("home_team_id <", value, "homeTeamId");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIdLessThanOrEqualTo(Integer value) {
            addCriterion("home_team_id <=", value, "homeTeamId");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIdIn(List<Integer> values) {
            addCriterion("home_team_id in", values, "homeTeamId");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIdNotIn(List<Integer> values) {
            addCriterion("home_team_id not in", values, "homeTeamId");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIdBetween(Integer value1, Integer value2) {
            addCriterion("home_team_id between", value1, value2, "homeTeamId");
            return (Criteria) this;
        }

        public Criteria andHomeTeamIdNotBetween(Integer value1, Integer value2) {
            addCriterion("home_team_id not between", value1, value2, "homeTeamId");
            return (Criteria) this;
        }

        public Criteria andStadiumIdIsNull() {
            addCriterion("stadium_id is null");
            return (Criteria) this;
        }

        public Criteria andStadiumIdIsNotNull() {
            addCriterion("stadium_id is not null");
            return (Criteria) this;
        }

        public Criteria andStadiumIdEqualTo(Integer value) {
            addCriterion("stadium_id =", value, "stadiumId");
            return (Criteria) this;
        }

        public Criteria andStadiumIdNotEqualTo(Integer value) {
            addCriterion("stadium_id <>", value, "stadiumId");
            return (Criteria) this;
        }

        public Criteria andStadiumIdGreaterThan(Integer value) {
            addCriterion("stadium_id >", value, "stadiumId");
            return (Criteria) this;
        }

        public Criteria andStadiumIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("stadium_id >=", value, "stadiumId");
            return (Criteria) this;
        }

        public Criteria andStadiumIdLessThan(Integer value) {
            addCriterion("stadium_id <", value, "stadiumId");
            return (Criteria) this;
        }

        public Criteria andStadiumIdLessThanOrEqualTo(Integer value) {
            addCriterion("stadium_id <=", value, "stadiumId");
            return (Criteria) this;
        }

        public Criteria andStadiumIdIn(List<Integer> values) {
            addCriterion("stadium_id in", values, "stadiumId");
            return (Criteria) this;
        }

        public Criteria andStadiumIdNotIn(List<Integer> values) {
            addCriterion("stadium_id not in", values, "stadiumId");
            return (Criteria) this;
        }

        public Criteria andStadiumIdBetween(Integer value1, Integer value2) {
            addCriterion("stadium_id between", value1, value2, "stadiumId");
            return (Criteria) this;
        }

        public Criteria andStadiumIdNotBetween(Integer value1, Integer value2) {
            addCriterion("stadium_id not between", value1, value2, "stadiumId");
            return (Criteria) this;
        }

        public Criteria andChannelIsNull() {
            addCriterion("channel is null");
            return (Criteria) this;
        }

        public Criteria andChannelIsNotNull() {
            addCriterion("channel is not null");
            return (Criteria) this;
        }

        public Criteria andChannelEqualTo(String value) {
            addCriterion("channel =", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotEqualTo(String value) {
            addCriterion("channel <>", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThan(String value) {
            addCriterion("channel >", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThanOrEqualTo(String value) {
            addCriterion("channel >=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThan(String value) {
            addCriterion("channel <", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThanOrEqualTo(String value) {
            addCriterion("channel <=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLike(String value) {
            addCriterion("channel like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotLike(String value) {
            addCriterion("channel not like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelIn(List<String> values) {
            addCriterion("channel in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotIn(List<String> values) {
            addCriterion("channel not in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelBetween(String value1, String value2) {
            addCriterion("channel between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotBetween(String value1, String value2) {
            addCriterion("channel not between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andAttendanceIsNull() {
            addCriterion("attendance is null");
            return (Criteria) this;
        }

        public Criteria andAttendanceIsNotNull() {
            addCriterion("attendance is not null");
            return (Criteria) this;
        }

        public Criteria andAttendanceEqualTo(String value) {
            addCriterion("attendance =", value, "attendance");
            return (Criteria) this;
        }

        public Criteria andAttendanceNotEqualTo(String value) {
            addCriterion("attendance <>", value, "attendance");
            return (Criteria) this;
        }

        public Criteria andAttendanceGreaterThan(String value) {
            addCriterion("attendance >", value, "attendance");
            return (Criteria) this;
        }

        public Criteria andAttendanceGreaterThanOrEqualTo(String value) {
            addCriterion("attendance >=", value, "attendance");
            return (Criteria) this;
        }

        public Criteria andAttendanceLessThan(String value) {
            addCriterion("attendance <", value, "attendance");
            return (Criteria) this;
        }

        public Criteria andAttendanceLessThanOrEqualTo(String value) {
            addCriterion("attendance <=", value, "attendance");
            return (Criteria) this;
        }

        public Criteria andAttendanceLike(String value) {
            addCriterion("attendance like", value, "attendance");
            return (Criteria) this;
        }

        public Criteria andAttendanceNotLike(String value) {
            addCriterion("attendance not like", value, "attendance");
            return (Criteria) this;
        }

        public Criteria andAttendanceIn(List<String> values) {
            addCriterion("attendance in", values, "attendance");
            return (Criteria) this;
        }

        public Criteria andAttendanceNotIn(List<String> values) {
            addCriterion("attendance not in", values, "attendance");
            return (Criteria) this;
        }

        public Criteria andAttendanceBetween(String value1, String value2) {
            addCriterion("attendance between", value1, value2, "attendance");
            return (Criteria) this;
        }

        public Criteria andAttendanceNotBetween(String value1, String value2) {
            addCriterion("attendance not between", value1, value2, "attendance");
            return (Criteria) this;
        }

        public Criteria andAwayTeamScoreIsNull() {
            addCriterion("away_team_score is null");
            return (Criteria) this;
        }

        public Criteria andAwayTeamScoreIsNotNull() {
            addCriterion("away_team_score is not null");
            return (Criteria) this;
        }

        public Criteria andAwayTeamScoreEqualTo(Integer value) {
            addCriterion("away_team_score =", value, "awayTeamScore");
            return (Criteria) this;
        }

        public Criteria andAwayTeamScoreNotEqualTo(Integer value) {
            addCriterion("away_team_score <>", value, "awayTeamScore");
            return (Criteria) this;
        }

        public Criteria andAwayTeamScoreGreaterThan(Integer value) {
            addCriterion("away_team_score >", value, "awayTeamScore");
            return (Criteria) this;
        }

        public Criteria andAwayTeamScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("away_team_score >=", value, "awayTeamScore");
            return (Criteria) this;
        }

        public Criteria andAwayTeamScoreLessThan(Integer value) {
            addCriterion("away_team_score <", value, "awayTeamScore");
            return (Criteria) this;
        }

        public Criteria andAwayTeamScoreLessThanOrEqualTo(Integer value) {
            addCriterion("away_team_score <=", value, "awayTeamScore");
            return (Criteria) this;
        }

        public Criteria andAwayTeamScoreIn(List<Integer> values) {
            addCriterion("away_team_score in", values, "awayTeamScore");
            return (Criteria) this;
        }

        public Criteria andAwayTeamScoreNotIn(List<Integer> values) {
            addCriterion("away_team_score not in", values, "awayTeamScore");
            return (Criteria) this;
        }

        public Criteria andAwayTeamScoreBetween(Integer value1, Integer value2) {
            addCriterion("away_team_score between", value1, value2, "awayTeamScore");
            return (Criteria) this;
        }

        public Criteria andAwayTeamScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("away_team_score not between", value1, value2, "awayTeamScore");
            return (Criteria) this;
        }

        public Criteria andHomeTeamScoreIsNull() {
            addCriterion("home_team_score is null");
            return (Criteria) this;
        }

        public Criteria andHomeTeamScoreIsNotNull() {
            addCriterion("home_team_score is not null");
            return (Criteria) this;
        }

        public Criteria andHomeTeamScoreEqualTo(Integer value) {
            addCriterion("home_team_score =", value, "homeTeamScore");
            return (Criteria) this;
        }

        public Criteria andHomeTeamScoreNotEqualTo(Integer value) {
            addCriterion("home_team_score <>", value, "homeTeamScore");
            return (Criteria) this;
        }

        public Criteria andHomeTeamScoreGreaterThan(Integer value) {
            addCriterion("home_team_score >", value, "homeTeamScore");
            return (Criteria) this;
        }

        public Criteria andHomeTeamScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("home_team_score >=", value, "homeTeamScore");
            return (Criteria) this;
        }

        public Criteria andHomeTeamScoreLessThan(Integer value) {
            addCriterion("home_team_score <", value, "homeTeamScore");
            return (Criteria) this;
        }

        public Criteria andHomeTeamScoreLessThanOrEqualTo(Integer value) {
            addCriterion("home_team_score <=", value, "homeTeamScore");
            return (Criteria) this;
        }

        public Criteria andHomeTeamScoreIn(List<Integer> values) {
            addCriterion("home_team_score in", values, "homeTeamScore");
            return (Criteria) this;
        }

        public Criteria andHomeTeamScoreNotIn(List<Integer> values) {
            addCriterion("home_team_score not in", values, "homeTeamScore");
            return (Criteria) this;
        }

        public Criteria andHomeTeamScoreBetween(Integer value1, Integer value2) {
            addCriterion("home_team_score between", value1, value2, "homeTeamScore");
            return (Criteria) this;
        }

        public Criteria andHomeTeamScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("home_team_score not between", value1, value2, "homeTeamScore");
            return (Criteria) this;
        }

        public Criteria andUpdatedIsNull() {
            addCriterion("updated is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedIsNotNull() {
            addCriterion("updated is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedEqualTo(Date value) {
            addCriterion("updated =", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotEqualTo(Date value) {
            addCriterion("updated <>", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedGreaterThan(Date value) {
            addCriterion("updated >", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedGreaterThanOrEqualTo(Date value) {
            addCriterion("updated >=", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedLessThan(Date value) {
            addCriterion("updated <", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedLessThanOrEqualTo(Date value) {
            addCriterion("updated <=", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedIn(List<Date> values) {
            addCriterion("updated in", values, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotIn(List<Date> values) {
            addCriterion("updated not in", values, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedBetween(Date value1, Date value2) {
            addCriterion("updated between", value1, value2, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotBetween(Date value1, Date value2) {
            addCriterion("updated not between", value1, value2, "updated");
            return (Criteria) this;
        }

        public Criteria andQuarterIsNull() {
            addCriterion("quarter is null");
            return (Criteria) this;
        }

        public Criteria andQuarterIsNotNull() {
            addCriterion("quarter is not null");
            return (Criteria) this;
        }

        public Criteria andQuarterEqualTo(String value) {
            addCriterion("quarter =", value, "quarter");
            return (Criteria) this;
        }

        public Criteria andQuarterNotEqualTo(String value) {
            addCriterion("quarter <>", value, "quarter");
            return (Criteria) this;
        }

        public Criteria andQuarterGreaterThan(String value) {
            addCriterion("quarter >", value, "quarter");
            return (Criteria) this;
        }

        public Criteria andQuarterGreaterThanOrEqualTo(String value) {
            addCriterion("quarter >=", value, "quarter");
            return (Criteria) this;
        }

        public Criteria andQuarterLessThan(String value) {
            addCriterion("quarter <", value, "quarter");
            return (Criteria) this;
        }

        public Criteria andQuarterLessThanOrEqualTo(String value) {
            addCriterion("quarter <=", value, "quarter");
            return (Criteria) this;
        }

        public Criteria andQuarterLike(String value) {
            addCriterion("quarter like", value, "quarter");
            return (Criteria) this;
        }

        public Criteria andQuarterNotLike(String value) {
            addCriterion("quarter not like", value, "quarter");
            return (Criteria) this;
        }

        public Criteria andQuarterIn(List<String> values) {
            addCriterion("quarter in", values, "quarter");
            return (Criteria) this;
        }

        public Criteria andQuarterNotIn(List<String> values) {
            addCriterion("quarter not in", values, "quarter");
            return (Criteria) this;
        }

        public Criteria andQuarterBetween(String value1, String value2) {
            addCriterion("quarter between", value1, value2, "quarter");
            return (Criteria) this;
        }

        public Criteria andQuarterNotBetween(String value1, String value2) {
            addCriterion("quarter not between", value1, value2, "quarter");
            return (Criteria) this;
        }

        public Criteria andTimeRemainingMinutesIsNull() {
            addCriterion("time_remaining_minutes is null");
            return (Criteria) this;
        }

        public Criteria andTimeRemainingMinutesIsNotNull() {
            addCriterion("time_remaining_minutes is not null");
            return (Criteria) this;
        }

        public Criteria andTimeRemainingMinutesEqualTo(Integer value) {
            addCriterion("time_remaining_minutes =", value, "timeRemainingMinutes");
            return (Criteria) this;
        }

        public Criteria andTimeRemainingMinutesNotEqualTo(Integer value) {
            addCriterion("time_remaining_minutes <>", value, "timeRemainingMinutes");
            return (Criteria) this;
        }

        public Criteria andTimeRemainingMinutesGreaterThan(Integer value) {
            addCriterion("time_remaining_minutes >", value, "timeRemainingMinutes");
            return (Criteria) this;
        }

        public Criteria andTimeRemainingMinutesGreaterThanOrEqualTo(Integer value) {
            addCriterion("time_remaining_minutes >=", value, "timeRemainingMinutes");
            return (Criteria) this;
        }

        public Criteria andTimeRemainingMinutesLessThan(Integer value) {
            addCriterion("time_remaining_minutes <", value, "timeRemainingMinutes");
            return (Criteria) this;
        }

        public Criteria andTimeRemainingMinutesLessThanOrEqualTo(Integer value) {
            addCriterion("time_remaining_minutes <=", value, "timeRemainingMinutes");
            return (Criteria) this;
        }

        public Criteria andTimeRemainingMinutesIn(List<Integer> values) {
            addCriterion("time_remaining_minutes in", values, "timeRemainingMinutes");
            return (Criteria) this;
        }

        public Criteria andTimeRemainingMinutesNotIn(List<Integer> values) {
            addCriterion("time_remaining_minutes not in", values, "timeRemainingMinutes");
            return (Criteria) this;
        }

        public Criteria andTimeRemainingMinutesBetween(Integer value1, Integer value2) {
            addCriterion("time_remaining_minutes between", value1, value2, "timeRemainingMinutes");
            return (Criteria) this;
        }

        public Criteria andTimeRemainingMinutesNotBetween(Integer value1, Integer value2) {
            addCriterion("time_remaining_minutes not between", value1, value2, "timeRemainingMinutes");
            return (Criteria) this;
        }

        public Criteria andTimeRemainingSecondsIsNull() {
            addCriterion("time_remaining_seconds is null");
            return (Criteria) this;
        }

        public Criteria andTimeRemainingSecondsIsNotNull() {
            addCriterion("time_remaining_seconds is not null");
            return (Criteria) this;
        }

        public Criteria andTimeRemainingSecondsEqualTo(Integer value) {
            addCriterion("time_remaining_seconds =", value, "timeRemainingSeconds");
            return (Criteria) this;
        }

        public Criteria andTimeRemainingSecondsNotEqualTo(Integer value) {
            addCriterion("time_remaining_seconds <>", value, "timeRemainingSeconds");
            return (Criteria) this;
        }

        public Criteria andTimeRemainingSecondsGreaterThan(Integer value) {
            addCriterion("time_remaining_seconds >", value, "timeRemainingSeconds");
            return (Criteria) this;
        }

        public Criteria andTimeRemainingSecondsGreaterThanOrEqualTo(Integer value) {
            addCriterion("time_remaining_seconds >=", value, "timeRemainingSeconds");
            return (Criteria) this;
        }

        public Criteria andTimeRemainingSecondsLessThan(Integer value) {
            addCriterion("time_remaining_seconds <", value, "timeRemainingSeconds");
            return (Criteria) this;
        }

        public Criteria andTimeRemainingSecondsLessThanOrEqualTo(Integer value) {
            addCriterion("time_remaining_seconds <=", value, "timeRemainingSeconds");
            return (Criteria) this;
        }

        public Criteria andTimeRemainingSecondsIn(List<Integer> values) {
            addCriterion("time_remaining_seconds in", values, "timeRemainingSeconds");
            return (Criteria) this;
        }

        public Criteria andTimeRemainingSecondsNotIn(List<Integer> values) {
            addCriterion("time_remaining_seconds not in", values, "timeRemainingSeconds");
            return (Criteria) this;
        }

        public Criteria andTimeRemainingSecondsBetween(Integer value1, Integer value2) {
            addCriterion("time_remaining_seconds between", value1, value2, "timeRemainingSeconds");
            return (Criteria) this;
        }

        public Criteria andTimeRemainingSecondsNotBetween(Integer value1, Integer value2) {
            addCriterion("time_remaining_seconds not between", value1, value2, "timeRemainingSeconds");
            return (Criteria) this;
        }

        public Criteria andPointSpreadIsNull() {
            addCriterion("point_spread is null");
            return (Criteria) this;
        }

        public Criteria andPointSpreadIsNotNull() {
            addCriterion("point_spread is not null");
            return (Criteria) this;
        }

        public Criteria andPointSpreadEqualTo(Double value) {
            addCriterion("point_spread =", value, "pointSpread");
            return (Criteria) this;
        }

        public Criteria andPointSpreadNotEqualTo(Double value) {
            addCriterion("point_spread <>", value, "pointSpread");
            return (Criteria) this;
        }

        public Criteria andPointSpreadGreaterThan(Double value) {
            addCriterion("point_spread >", value, "pointSpread");
            return (Criteria) this;
        }

        public Criteria andPointSpreadGreaterThanOrEqualTo(Double value) {
            addCriterion("point_spread >=", value, "pointSpread");
            return (Criteria) this;
        }

        public Criteria andPointSpreadLessThan(Double value) {
            addCriterion("point_spread <", value, "pointSpread");
            return (Criteria) this;
        }

        public Criteria andPointSpreadLessThanOrEqualTo(Double value) {
            addCriterion("point_spread <=", value, "pointSpread");
            return (Criteria) this;
        }

        public Criteria andPointSpreadIn(List<Double> values) {
            addCriterion("point_spread in", values, "pointSpread");
            return (Criteria) this;
        }

        public Criteria andPointSpreadNotIn(List<Double> values) {
            addCriterion("point_spread not in", values, "pointSpread");
            return (Criteria) this;
        }

        public Criteria andPointSpreadBetween(Double value1, Double value2) {
            addCriterion("point_spread between", value1, value2, "pointSpread");
            return (Criteria) this;
        }

        public Criteria andPointSpreadNotBetween(Double value1, Double value2) {
            addCriterion("point_spread not between", value1, value2, "pointSpread");
            return (Criteria) this;
        }

        public Criteria andOverUnderIsNull() {
            addCriterion("over_under is null");
            return (Criteria) this;
        }

        public Criteria andOverUnderIsNotNull() {
            addCriterion("over_under is not null");
            return (Criteria) this;
        }

        public Criteria andOverUnderEqualTo(Double value) {
            addCriterion("over_under =", value, "overUnder");
            return (Criteria) this;
        }

        public Criteria andOverUnderNotEqualTo(Double value) {
            addCriterion("over_under <>", value, "overUnder");
            return (Criteria) this;
        }

        public Criteria andOverUnderGreaterThan(Double value) {
            addCriterion("over_under >", value, "overUnder");
            return (Criteria) this;
        }

        public Criteria andOverUnderGreaterThanOrEqualTo(Double value) {
            addCriterion("over_under >=", value, "overUnder");
            return (Criteria) this;
        }

        public Criteria andOverUnderLessThan(Double value) {
            addCriterion("over_under <", value, "overUnder");
            return (Criteria) this;
        }

        public Criteria andOverUnderLessThanOrEqualTo(Double value) {
            addCriterion("over_under <=", value, "overUnder");
            return (Criteria) this;
        }

        public Criteria andOverUnderIn(List<Double> values) {
            addCriterion("over_under in", values, "overUnder");
            return (Criteria) this;
        }

        public Criteria andOverUnderNotIn(List<Double> values) {
            addCriterion("over_under not in", values, "overUnder");
            return (Criteria) this;
        }

        public Criteria andOverUnderBetween(Double value1, Double value2) {
            addCriterion("over_under between", value1, value2, "overUnder");
            return (Criteria) this;
        }

        public Criteria andOverUnderNotBetween(Double value1, Double value2) {
            addCriterion("over_under not between", value1, value2, "overUnder");
            return (Criteria) this;
        }

        public Criteria andAwayTeamMoneyLineIsNull() {
            addCriterion("away_team_money_line is null");
            return (Criteria) this;
        }

        public Criteria andAwayTeamMoneyLineIsNotNull() {
            addCriterion("away_team_money_line is not null");
            return (Criteria) this;
        }

        public Criteria andAwayTeamMoneyLineEqualTo(Double value) {
            addCriterion("away_team_money_line =", value, "awayTeamMoneyLine");
            return (Criteria) this;
        }

        public Criteria andAwayTeamMoneyLineNotEqualTo(Double value) {
            addCriterion("away_team_money_line <>", value, "awayTeamMoneyLine");
            return (Criteria) this;
        }

        public Criteria andAwayTeamMoneyLineGreaterThan(Double value) {
            addCriterion("away_team_money_line >", value, "awayTeamMoneyLine");
            return (Criteria) this;
        }

        public Criteria andAwayTeamMoneyLineGreaterThanOrEqualTo(Double value) {
            addCriterion("away_team_money_line >=", value, "awayTeamMoneyLine");
            return (Criteria) this;
        }

        public Criteria andAwayTeamMoneyLineLessThan(Double value) {
            addCriterion("away_team_money_line <", value, "awayTeamMoneyLine");
            return (Criteria) this;
        }

        public Criteria andAwayTeamMoneyLineLessThanOrEqualTo(Double value) {
            addCriterion("away_team_money_line <=", value, "awayTeamMoneyLine");
            return (Criteria) this;
        }

        public Criteria andAwayTeamMoneyLineIn(List<Double> values) {
            addCriterion("away_team_money_line in", values, "awayTeamMoneyLine");
            return (Criteria) this;
        }

        public Criteria andAwayTeamMoneyLineNotIn(List<Double> values) {
            addCriterion("away_team_money_line not in", values, "awayTeamMoneyLine");
            return (Criteria) this;
        }

        public Criteria andAwayTeamMoneyLineBetween(Double value1, Double value2) {
            addCriterion("away_team_money_line between", value1, value2, "awayTeamMoneyLine");
            return (Criteria) this;
        }

        public Criteria andAwayTeamMoneyLineNotBetween(Double value1, Double value2) {
            addCriterion("away_team_money_line not between", value1, value2, "awayTeamMoneyLine");
            return (Criteria) this;
        }

        public Criteria andHomeTeamMoneyLineIsNull() {
            addCriterion("home_team_money_line is null");
            return (Criteria) this;
        }

        public Criteria andHomeTeamMoneyLineIsNotNull() {
            addCriterion("home_team_money_line is not null");
            return (Criteria) this;
        }

        public Criteria andHomeTeamMoneyLineEqualTo(Double value) {
            addCriterion("home_team_money_line =", value, "homeTeamMoneyLine");
            return (Criteria) this;
        }

        public Criteria andHomeTeamMoneyLineNotEqualTo(Double value) {
            addCriterion("home_team_money_line <>", value, "homeTeamMoneyLine");
            return (Criteria) this;
        }

        public Criteria andHomeTeamMoneyLineGreaterThan(Double value) {
            addCriterion("home_team_money_line >", value, "homeTeamMoneyLine");
            return (Criteria) this;
        }

        public Criteria andHomeTeamMoneyLineGreaterThanOrEqualTo(Double value) {
            addCriterion("home_team_money_line >=", value, "homeTeamMoneyLine");
            return (Criteria) this;
        }

        public Criteria andHomeTeamMoneyLineLessThan(Double value) {
            addCriterion("home_team_money_line <", value, "homeTeamMoneyLine");
            return (Criteria) this;
        }

        public Criteria andHomeTeamMoneyLineLessThanOrEqualTo(Double value) {
            addCriterion("home_team_money_line <=", value, "homeTeamMoneyLine");
            return (Criteria) this;
        }

        public Criteria andHomeTeamMoneyLineIn(List<Double> values) {
            addCriterion("home_team_money_line in", values, "homeTeamMoneyLine");
            return (Criteria) this;
        }

        public Criteria andHomeTeamMoneyLineNotIn(List<Double> values) {
            addCriterion("home_team_money_line not in", values, "homeTeamMoneyLine");
            return (Criteria) this;
        }

        public Criteria andHomeTeamMoneyLineBetween(Double value1, Double value2) {
            addCriterion("home_team_money_line between", value1, value2, "homeTeamMoneyLine");
            return (Criteria) this;
        }

        public Criteria andHomeTeamMoneyLineNotBetween(Double value1, Double value2) {
            addCriterion("home_team_money_line not between", value1, value2, "homeTeamMoneyLine");
            return (Criteria) this;
        }

        public Criteria andGlobalGameIdIsNull() {
            addCriterion("global_game_id is null");
            return (Criteria) this;
        }

        public Criteria andGlobalGameIdIsNotNull() {
            addCriterion("global_game_id is not null");
            return (Criteria) this;
        }

        public Criteria andGlobalGameIdEqualTo(Integer value) {
            addCriterion("global_game_id =", value, "globalGameId");
            return (Criteria) this;
        }

        public Criteria andGlobalGameIdNotEqualTo(Integer value) {
            addCriterion("global_game_id <>", value, "globalGameId");
            return (Criteria) this;
        }

        public Criteria andGlobalGameIdGreaterThan(Integer value) {
            addCriterion("global_game_id >", value, "globalGameId");
            return (Criteria) this;
        }

        public Criteria andGlobalGameIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("global_game_id >=", value, "globalGameId");
            return (Criteria) this;
        }

        public Criteria andGlobalGameIdLessThan(Integer value) {
            addCriterion("global_game_id <", value, "globalGameId");
            return (Criteria) this;
        }

        public Criteria andGlobalGameIdLessThanOrEqualTo(Integer value) {
            addCriterion("global_game_id <=", value, "globalGameId");
            return (Criteria) this;
        }

        public Criteria andGlobalGameIdIn(List<Integer> values) {
            addCriterion("global_game_id in", values, "globalGameId");
            return (Criteria) this;
        }

        public Criteria andGlobalGameIdNotIn(List<Integer> values) {
            addCriterion("global_game_id not in", values, "globalGameId");
            return (Criteria) this;
        }

        public Criteria andGlobalGameIdBetween(Integer value1, Integer value2) {
            addCriterion("global_game_id between", value1, value2, "globalGameId");
            return (Criteria) this;
        }

        public Criteria andGlobalGameIdNotBetween(Integer value1, Integer value2) {
            addCriterion("global_game_id not between", value1, value2, "globalGameId");
            return (Criteria) this;
        }

        public Criteria andGlobalAwayTeamIdIsNull() {
            addCriterion("global_away_team_id is null");
            return (Criteria) this;
        }

        public Criteria andGlobalAwayTeamIdIsNotNull() {
            addCriterion("global_away_team_id is not null");
            return (Criteria) this;
        }

        public Criteria andGlobalAwayTeamIdEqualTo(Integer value) {
            addCriterion("global_away_team_id =", value, "globalAwayTeamId");
            return (Criteria) this;
        }

        public Criteria andGlobalAwayTeamIdNotEqualTo(Integer value) {
            addCriterion("global_away_team_id <>", value, "globalAwayTeamId");
            return (Criteria) this;
        }

        public Criteria andGlobalAwayTeamIdGreaterThan(Integer value) {
            addCriterion("global_away_team_id >", value, "globalAwayTeamId");
            return (Criteria) this;
        }

        public Criteria andGlobalAwayTeamIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("global_away_team_id >=", value, "globalAwayTeamId");
            return (Criteria) this;
        }

        public Criteria andGlobalAwayTeamIdLessThan(Integer value) {
            addCriterion("global_away_team_id <", value, "globalAwayTeamId");
            return (Criteria) this;
        }

        public Criteria andGlobalAwayTeamIdLessThanOrEqualTo(Integer value) {
            addCriterion("global_away_team_id <=", value, "globalAwayTeamId");
            return (Criteria) this;
        }

        public Criteria andGlobalAwayTeamIdIn(List<Integer> values) {
            addCriterion("global_away_team_id in", values, "globalAwayTeamId");
            return (Criteria) this;
        }

        public Criteria andGlobalAwayTeamIdNotIn(List<Integer> values) {
            addCriterion("global_away_team_id not in", values, "globalAwayTeamId");
            return (Criteria) this;
        }

        public Criteria andGlobalAwayTeamIdBetween(Integer value1, Integer value2) {
            addCriterion("global_away_team_id between", value1, value2, "globalAwayTeamId");
            return (Criteria) this;
        }

        public Criteria andGlobalAwayTeamIdNotBetween(Integer value1, Integer value2) {
            addCriterion("global_away_team_id not between", value1, value2, "globalAwayTeamId");
            return (Criteria) this;
        }

        public Criteria andGlobalHomeTeamIdIsNull() {
            addCriterion("global_home_team_id is null");
            return (Criteria) this;
        }

        public Criteria andGlobalHomeTeamIdIsNotNull() {
            addCriterion("global_home_team_id is not null");
            return (Criteria) this;
        }

        public Criteria andGlobalHomeTeamIdEqualTo(Integer value) {
            addCriterion("global_home_team_id =", value, "globalHomeTeamId");
            return (Criteria) this;
        }

        public Criteria andGlobalHomeTeamIdNotEqualTo(Integer value) {
            addCriterion("global_home_team_id <>", value, "globalHomeTeamId");
            return (Criteria) this;
        }

        public Criteria andGlobalHomeTeamIdGreaterThan(Integer value) {
            addCriterion("global_home_team_id >", value, "globalHomeTeamId");
            return (Criteria) this;
        }

        public Criteria andGlobalHomeTeamIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("global_home_team_id >=", value, "globalHomeTeamId");
            return (Criteria) this;
        }

        public Criteria andGlobalHomeTeamIdLessThan(Integer value) {
            addCriterion("global_home_team_id <", value, "globalHomeTeamId");
            return (Criteria) this;
        }

        public Criteria andGlobalHomeTeamIdLessThanOrEqualTo(Integer value) {
            addCriterion("global_home_team_id <=", value, "globalHomeTeamId");
            return (Criteria) this;
        }

        public Criteria andGlobalHomeTeamIdIn(List<Integer> values) {
            addCriterion("global_home_team_id in", values, "globalHomeTeamId");
            return (Criteria) this;
        }

        public Criteria andGlobalHomeTeamIdNotIn(List<Integer> values) {
            addCriterion("global_home_team_id not in", values, "globalHomeTeamId");
            return (Criteria) this;
        }

        public Criteria andGlobalHomeTeamIdBetween(Integer value1, Integer value2) {
            addCriterion("global_home_team_id between", value1, value2, "globalHomeTeamId");
            return (Criteria) this;
        }

        public Criteria andGlobalHomeTeamIdNotBetween(Integer value1, Integer value2) {
            addCriterion("global_home_team_id not between", value1, value2, "globalHomeTeamId");
            return (Criteria) this;
        }

        public Criteria andPointSpreadAwayTeamMoneyLineIsNull() {
            addCriterion("point_spread_away_team_money_line is null");
            return (Criteria) this;
        }

        public Criteria andPointSpreadAwayTeamMoneyLineIsNotNull() {
            addCriterion("point_spread_away_team_money_line is not null");
            return (Criteria) this;
        }

        public Criteria andPointSpreadAwayTeamMoneyLineEqualTo(Integer value) {
            addCriterion("point_spread_away_team_money_line =", value, "pointSpreadAwayTeamMoneyLine");
            return (Criteria) this;
        }

        public Criteria andPointSpreadAwayTeamMoneyLineNotEqualTo(Integer value) {
            addCriterion("point_spread_away_team_money_line <>", value, "pointSpreadAwayTeamMoneyLine");
            return (Criteria) this;
        }

        public Criteria andPointSpreadAwayTeamMoneyLineGreaterThan(Integer value) {
            addCriterion("point_spread_away_team_money_line >", value, "pointSpreadAwayTeamMoneyLine");
            return (Criteria) this;
        }

        public Criteria andPointSpreadAwayTeamMoneyLineGreaterThanOrEqualTo(Integer value) {
            addCriterion("point_spread_away_team_money_line >=", value, "pointSpreadAwayTeamMoneyLine");
            return (Criteria) this;
        }

        public Criteria andPointSpreadAwayTeamMoneyLineLessThan(Integer value) {
            addCriterion("point_spread_away_team_money_line <", value, "pointSpreadAwayTeamMoneyLine");
            return (Criteria) this;
        }

        public Criteria andPointSpreadAwayTeamMoneyLineLessThanOrEqualTo(Integer value) {
            addCriterion("point_spread_away_team_money_line <=", value, "pointSpreadAwayTeamMoneyLine");
            return (Criteria) this;
        }

        public Criteria andPointSpreadAwayTeamMoneyLineIn(List<Integer> values) {
            addCriterion("point_spread_away_team_money_line in", values, "pointSpreadAwayTeamMoneyLine");
            return (Criteria) this;
        }

        public Criteria andPointSpreadAwayTeamMoneyLineNotIn(List<Integer> values) {
            addCriterion("point_spread_away_team_money_line not in", values, "pointSpreadAwayTeamMoneyLine");
            return (Criteria) this;
        }

        public Criteria andPointSpreadAwayTeamMoneyLineBetween(Integer value1, Integer value2) {
            addCriterion("point_spread_away_team_money_line between", value1, value2, "pointSpreadAwayTeamMoneyLine");
            return (Criteria) this;
        }

        public Criteria andPointSpreadAwayTeamMoneyLineNotBetween(Integer value1, Integer value2) {
            addCriterion("point_spread_away_team_money_line not between", value1, value2, "pointSpreadAwayTeamMoneyLine");
            return (Criteria) this;
        }

        public Criteria andPointSpreadHomeTeamNoneyLineIsNull() {
            addCriterion("point_spread_home_team_noney_line is null");
            return (Criteria) this;
        }

        public Criteria andPointSpreadHomeTeamNoneyLineIsNotNull() {
            addCriterion("point_spread_home_team_noney_line is not null");
            return (Criteria) this;
        }

        public Criteria andPointSpreadHomeTeamNoneyLineEqualTo(Integer value) {
            addCriterion("point_spread_home_team_noney_line =", value, "pointSpreadHomeTeamNoneyLine");
            return (Criteria) this;
        }

        public Criteria andPointSpreadHomeTeamNoneyLineNotEqualTo(Integer value) {
            addCriterion("point_spread_home_team_noney_line <>", value, "pointSpreadHomeTeamNoneyLine");
            return (Criteria) this;
        }

        public Criteria andPointSpreadHomeTeamNoneyLineGreaterThan(Integer value) {
            addCriterion("point_spread_home_team_noney_line >", value, "pointSpreadHomeTeamNoneyLine");
            return (Criteria) this;
        }

        public Criteria andPointSpreadHomeTeamNoneyLineGreaterThanOrEqualTo(Integer value) {
            addCriterion("point_spread_home_team_noney_line >=", value, "pointSpreadHomeTeamNoneyLine");
            return (Criteria) this;
        }

        public Criteria andPointSpreadHomeTeamNoneyLineLessThan(Integer value) {
            addCriterion("point_spread_home_team_noney_line <", value, "pointSpreadHomeTeamNoneyLine");
            return (Criteria) this;
        }

        public Criteria andPointSpreadHomeTeamNoneyLineLessThanOrEqualTo(Integer value) {
            addCriterion("point_spread_home_team_noney_line <=", value, "pointSpreadHomeTeamNoneyLine");
            return (Criteria) this;
        }

        public Criteria andPointSpreadHomeTeamNoneyLineIn(List<Integer> values) {
            addCriterion("point_spread_home_team_noney_line in", values, "pointSpreadHomeTeamNoneyLine");
            return (Criteria) this;
        }

        public Criteria andPointSpreadHomeTeamNoneyLineNotIn(List<Integer> values) {
            addCriterion("point_spread_home_team_noney_line not in", values, "pointSpreadHomeTeamNoneyLine");
            return (Criteria) this;
        }

        public Criteria andPointSpreadHomeTeamNoneyLineBetween(Integer value1, Integer value2) {
            addCriterion("point_spread_home_team_noney_line between", value1, value2, "pointSpreadHomeTeamNoneyLine");
            return (Criteria) this;
        }

        public Criteria andPointSpreadHomeTeamNoneyLineNotBetween(Integer value1, Integer value2) {
            addCriterion("point_spread_home_team_noney_line not between", value1, value2, "pointSpreadHomeTeamNoneyLine");
            return (Criteria) this;
        }

        public Criteria andLastPlayIsNull() {
            addCriterion("last_play is null");
            return (Criteria) this;
        }

        public Criteria andLastPlayIsNotNull() {
            addCriterion("last_play is not null");
            return (Criteria) this;
        }

        public Criteria andLastPlayEqualTo(String value) {
            addCriterion("last_play =", value, "lastPlay");
            return (Criteria) this;
        }

        public Criteria andLastPlayNotEqualTo(String value) {
            addCriterion("last_play <>", value, "lastPlay");
            return (Criteria) this;
        }

        public Criteria andLastPlayGreaterThan(String value) {
            addCriterion("last_play >", value, "lastPlay");
            return (Criteria) this;
        }

        public Criteria andLastPlayGreaterThanOrEqualTo(String value) {
            addCriterion("last_play >=", value, "lastPlay");
            return (Criteria) this;
        }

        public Criteria andLastPlayLessThan(String value) {
            addCriterion("last_play <", value, "lastPlay");
            return (Criteria) this;
        }

        public Criteria andLastPlayLessThanOrEqualTo(String value) {
            addCriterion("last_play <=", value, "lastPlay");
            return (Criteria) this;
        }

        public Criteria andLastPlayLike(String value) {
            addCriterion("last_play like", value, "lastPlay");
            return (Criteria) this;
        }

        public Criteria andLastPlayNotLike(String value) {
            addCriterion("last_play not like", value, "lastPlay");
            return (Criteria) this;
        }

        public Criteria andLastPlayIn(List<String> values) {
            addCriterion("last_play in", values, "lastPlay");
            return (Criteria) this;
        }

        public Criteria andLastPlayNotIn(List<String> values) {
            addCriterion("last_play not in", values, "lastPlay");
            return (Criteria) this;
        }

        public Criteria andLastPlayBetween(String value1, String value2) {
            addCriterion("last_play between", value1, value2, "lastPlay");
            return (Criteria) this;
        }

        public Criteria andLastPlayNotBetween(String value1, String value2) {
            addCriterion("last_play not between", value1, value2, "lastPlay");
            return (Criteria) this;
        }

        public Criteria andIsClosedIsNull() {
            addCriterion("is_closed is null");
            return (Criteria) this;
        }

        public Criteria andIsClosedIsNotNull() {
            addCriterion("is_closed is not null");
            return (Criteria) this;
        }

        public Criteria andIsClosedEqualTo(String value) {
            addCriterion("is_closed =", value, "isClosed");
            return (Criteria) this;
        }

        public Criteria andIsClosedNotEqualTo(String value) {
            addCriterion("is_closed <>", value, "isClosed");
            return (Criteria) this;
        }

        public Criteria andIsClosedGreaterThan(String value) {
            addCriterion("is_closed >", value, "isClosed");
            return (Criteria) this;
        }

        public Criteria andIsClosedGreaterThanOrEqualTo(String value) {
            addCriterion("is_closed >=", value, "isClosed");
            return (Criteria) this;
        }

        public Criteria andIsClosedLessThan(String value) {
            addCriterion("is_closed <", value, "isClosed");
            return (Criteria) this;
        }

        public Criteria andIsClosedLessThanOrEqualTo(String value) {
            addCriterion("is_closed <=", value, "isClosed");
            return (Criteria) this;
        }

        public Criteria andIsClosedLike(String value) {
            addCriterion("is_closed like", value, "isClosed");
            return (Criteria) this;
        }

        public Criteria andIsClosedNotLike(String value) {
            addCriterion("is_closed not like", value, "isClosed");
            return (Criteria) this;
        }

        public Criteria andIsClosedIn(List<String> values) {
            addCriterion("is_closed in", values, "isClosed");
            return (Criteria) this;
        }

        public Criteria andIsClosedNotIn(List<String> values) {
            addCriterion("is_closed not in", values, "isClosed");
            return (Criteria) this;
        }

        public Criteria andIsClosedBetween(String value1, String value2) {
            addCriterion("is_closed between", value1, value2, "isClosed");
            return (Criteria) this;
        }

        public Criteria andIsClosedNotBetween(String value1, String value2) {
            addCriterion("is_closed not between", value1, value2, "isClosed");
            return (Criteria) this;
        }

        public Criteria andGameEndDateTimeIsNull() {
            addCriterion("game_end_date_time is null");
            return (Criteria) this;
        }

        public Criteria andGameEndDateTimeIsNotNull() {
            addCriterion("game_end_date_time is not null");
            return (Criteria) this;
        }

        public Criteria andGameEndDateTimeEqualTo(Date value) {
            addCriterion("game_end_date_time =", value, "gameEndDateTime");
            return (Criteria) this;
        }

        public Criteria andGameEndDateTimeNotEqualTo(Date value) {
            addCriterion("game_end_date_time <>", value, "gameEndDateTime");
            return (Criteria) this;
        }

        public Criteria andGameEndDateTimeGreaterThan(Date value) {
            addCriterion("game_end_date_time >", value, "gameEndDateTime");
            return (Criteria) this;
        }

        public Criteria andGameEndDateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("game_end_date_time >=", value, "gameEndDateTime");
            return (Criteria) this;
        }

        public Criteria andGameEndDateTimeLessThan(Date value) {
            addCriterion("game_end_date_time <", value, "gameEndDateTime");
            return (Criteria) this;
        }

        public Criteria andGameEndDateTimeLessThanOrEqualTo(Date value) {
            addCriterion("game_end_date_time <=", value, "gameEndDateTime");
            return (Criteria) this;
        }

        public Criteria andGameEndDateTimeIn(List<Date> values) {
            addCriterion("game_end_date_time in", values, "gameEndDateTime");
            return (Criteria) this;
        }

        public Criteria andGameEndDateTimeNotIn(List<Date> values) {
            addCriterion("game_end_date_time not in", values, "gameEndDateTime");
            return (Criteria) this;
        }

        public Criteria andGameEndDateTimeBetween(Date value1, Date value2) {
            addCriterion("game_end_date_time between", value1, value2, "gameEndDateTime");
            return (Criteria) this;
        }

        public Criteria andGameEndDateTimeNotBetween(Date value1, Date value2) {
            addCriterion("game_end_date_time not between", value1, value2, "gameEndDateTime");
            return (Criteria) this;
        }

        public Criteria andQuartersIsNull() {
            addCriterion("quarters is null");
            return (Criteria) this;
        }

        public Criteria andQuartersIsNotNull() {
            addCriterion("quarters is not null");
            return (Criteria) this;
        }

        public Criteria andQuartersEqualTo(String value) {
            addCriterion("quarters =", value, "quarters");
            return (Criteria) this;
        }

        public Criteria andQuartersNotEqualTo(String value) {
            addCriterion("quarters <>", value, "quarters");
            return (Criteria) this;
        }

        public Criteria andQuartersGreaterThan(String value) {
            addCriterion("quarters >", value, "quarters");
            return (Criteria) this;
        }

        public Criteria andQuartersGreaterThanOrEqualTo(String value) {
            addCriterion("quarters >=", value, "quarters");
            return (Criteria) this;
        }

        public Criteria andQuartersLessThan(String value) {
            addCriterion("quarters <", value, "quarters");
            return (Criteria) this;
        }

        public Criteria andQuartersLessThanOrEqualTo(String value) {
            addCriterion("quarters <=", value, "quarters");
            return (Criteria) this;
        }

        public Criteria andQuartersLike(String value) {
            addCriterion("quarters like", value, "quarters");
            return (Criteria) this;
        }

        public Criteria andQuartersNotLike(String value) {
            addCriterion("quarters not like", value, "quarters");
            return (Criteria) this;
        }

        public Criteria andQuartersIn(List<String> values) {
            addCriterion("quarters in", values, "quarters");
            return (Criteria) this;
        }

        public Criteria andQuartersNotIn(List<String> values) {
            addCriterion("quarters not in", values, "quarters");
            return (Criteria) this;
        }

        public Criteria andQuartersBetween(String value1, String value2) {
            addCriterion("quarters between", value1, value2, "quarters");
            return (Criteria) this;
        }

        public Criteria andQuartersNotBetween(String value1, String value2) {
            addCriterion("quarters not between", value1, value2, "quarters");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}