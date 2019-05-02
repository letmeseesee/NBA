package com.nba.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GameDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    private Boolean forUpdate;

    public GameDetailExample() {
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

        public Criteria andPlayIdIsNull() {
            addCriterion("play_id is null");
            return (Criteria) this;
        }

        public Criteria andPlayIdIsNotNull() {
            addCriterion("play_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlayIdEqualTo(Integer value) {
            addCriterion("play_id =", value, "playId");
            return (Criteria) this;
        }

        public Criteria andPlayIdNotEqualTo(Integer value) {
            addCriterion("play_id <>", value, "playId");
            return (Criteria) this;
        }

        public Criteria andPlayIdGreaterThan(Integer value) {
            addCriterion("play_id >", value, "playId");
            return (Criteria) this;
        }

        public Criteria andPlayIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("play_id >=", value, "playId");
            return (Criteria) this;
        }

        public Criteria andPlayIdLessThan(Integer value) {
            addCriterion("play_id <", value, "playId");
            return (Criteria) this;
        }

        public Criteria andPlayIdLessThanOrEqualTo(Integer value) {
            addCriterion("play_id <=", value, "playId");
            return (Criteria) this;
        }

        public Criteria andPlayIdIn(List<Integer> values) {
            addCriterion("play_id in", values, "playId");
            return (Criteria) this;
        }

        public Criteria andPlayIdNotIn(List<Integer> values) {
            addCriterion("play_id not in", values, "playId");
            return (Criteria) this;
        }

        public Criteria andPlayIdBetween(Integer value1, Integer value2) {
            addCriterion("play_id between", value1, value2, "playId");
            return (Criteria) this;
        }

        public Criteria andPlayIdNotBetween(Integer value1, Integer value2) {
            addCriterion("play_id not between", value1, value2, "playId");
            return (Criteria) this;
        }

        public Criteria andQuarterIdIsNull() {
            addCriterion("quarter_id is null");
            return (Criteria) this;
        }

        public Criteria andQuarterIdIsNotNull() {
            addCriterion("quarter_id is not null");
            return (Criteria) this;
        }

        public Criteria andQuarterIdEqualTo(Integer value) {
            addCriterion("quarter_id =", value, "quarterId");
            return (Criteria) this;
        }

        public Criteria andQuarterIdNotEqualTo(Integer value) {
            addCriterion("quarter_id <>", value, "quarterId");
            return (Criteria) this;
        }

        public Criteria andQuarterIdGreaterThan(Integer value) {
            addCriterion("quarter_id >", value, "quarterId");
            return (Criteria) this;
        }

        public Criteria andQuarterIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("quarter_id >=", value, "quarterId");
            return (Criteria) this;
        }

        public Criteria andQuarterIdLessThan(Integer value) {
            addCriterion("quarter_id <", value, "quarterId");
            return (Criteria) this;
        }

        public Criteria andQuarterIdLessThanOrEqualTo(Integer value) {
            addCriterion("quarter_id <=", value, "quarterId");
            return (Criteria) this;
        }

        public Criteria andQuarterIdIn(List<Integer> values) {
            addCriterion("quarter_id in", values, "quarterId");
            return (Criteria) this;
        }

        public Criteria andQuarterIdNotIn(List<Integer> values) {
            addCriterion("quarter_id not in", values, "quarterId");
            return (Criteria) this;
        }

        public Criteria andQuarterIdBetween(Integer value1, Integer value2) {
            addCriterion("quarter_id between", value1, value2, "quarterId");
            return (Criteria) this;
        }

        public Criteria andQuarterIdNotBetween(Integer value1, Integer value2) {
            addCriterion("quarter_id not between", value1, value2, "quarterId");
            return (Criteria) this;
        }

        public Criteria andQuarterNameIsNull() {
            addCriterion("quarter_name is null");
            return (Criteria) this;
        }

        public Criteria andQuarterNameIsNotNull() {
            addCriterion("quarter_name is not null");
            return (Criteria) this;
        }

        public Criteria andQuarterNameEqualTo(String value) {
            addCriterion("quarter_name =", value, "quarterName");
            return (Criteria) this;
        }

        public Criteria andQuarterNameNotEqualTo(String value) {
            addCriterion("quarter_name <>", value, "quarterName");
            return (Criteria) this;
        }

        public Criteria andQuarterNameGreaterThan(String value) {
            addCriterion("quarter_name >", value, "quarterName");
            return (Criteria) this;
        }

        public Criteria andQuarterNameGreaterThanOrEqualTo(String value) {
            addCriterion("quarter_name >=", value, "quarterName");
            return (Criteria) this;
        }

        public Criteria andQuarterNameLessThan(String value) {
            addCriterion("quarter_name <", value, "quarterName");
            return (Criteria) this;
        }

        public Criteria andQuarterNameLessThanOrEqualTo(String value) {
            addCriterion("quarter_name <=", value, "quarterName");
            return (Criteria) this;
        }

        public Criteria andQuarterNameLike(String value) {
            addCriterion("quarter_name like", value, "quarterName");
            return (Criteria) this;
        }

        public Criteria andQuarterNameNotLike(String value) {
            addCriterion("quarter_name not like", value, "quarterName");
            return (Criteria) this;
        }

        public Criteria andQuarterNameIn(List<String> values) {
            addCriterion("quarter_name in", values, "quarterName");
            return (Criteria) this;
        }

        public Criteria andQuarterNameNotIn(List<String> values) {
            addCriterion("quarter_name not in", values, "quarterName");
            return (Criteria) this;
        }

        public Criteria andQuarterNameBetween(String value1, String value2) {
            addCriterion("quarter_name between", value1, value2, "quarterName");
            return (Criteria) this;
        }

        public Criteria andQuarterNameNotBetween(String value1, String value2) {
            addCriterion("quarter_name not between", value1, value2, "quarterName");
            return (Criteria) this;
        }

        public Criteria andSequenceIsNull() {
            addCriterion("`sequence` is null");
            return (Criteria) this;
        }

        public Criteria andSequenceIsNotNull() {
            addCriterion("`sequence` is not null");
            return (Criteria) this;
        }

        public Criteria andSequenceEqualTo(Integer value) {
            addCriterion("`sequence` =", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceNotEqualTo(Integer value) {
            addCriterion("`sequence` <>", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceGreaterThan(Integer value) {
            addCriterion("`sequence` >", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceGreaterThanOrEqualTo(Integer value) {
            addCriterion("`sequence` >=", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceLessThan(Integer value) {
            addCriterion("`sequence` <", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceLessThanOrEqualTo(Integer value) {
            addCriterion("`sequence` <=", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceIn(List<Integer> values) {
            addCriterion("`sequence` in", values, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceNotIn(List<Integer> values) {
            addCriterion("`sequence` not in", values, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceBetween(Integer value1, Integer value2) {
            addCriterion("`sequence` between", value1, value2, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceNotBetween(Integer value1, Integer value2) {
            addCriterion("`sequence` not between", value1, value2, "sequence");
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

        public Criteria andPotentialPointsIsNull() {
            addCriterion("potential_points is null");
            return (Criteria) this;
        }

        public Criteria andPotentialPointsIsNotNull() {
            addCriterion("potential_points is not null");
            return (Criteria) this;
        }

        public Criteria andPotentialPointsEqualTo(Integer value) {
            addCriterion("potential_points =", value, "potentialPoints");
            return (Criteria) this;
        }

        public Criteria andPotentialPointsNotEqualTo(Integer value) {
            addCriterion("potential_points <>", value, "potentialPoints");
            return (Criteria) this;
        }

        public Criteria andPotentialPointsGreaterThan(Integer value) {
            addCriterion("potential_points >", value, "potentialPoints");
            return (Criteria) this;
        }

        public Criteria andPotentialPointsGreaterThanOrEqualTo(Integer value) {
            addCriterion("potential_points >=", value, "potentialPoints");
            return (Criteria) this;
        }

        public Criteria andPotentialPointsLessThan(Integer value) {
            addCriterion("potential_points <", value, "potentialPoints");
            return (Criteria) this;
        }

        public Criteria andPotentialPointsLessThanOrEqualTo(Integer value) {
            addCriterion("potential_points <=", value, "potentialPoints");
            return (Criteria) this;
        }

        public Criteria andPotentialPointsIn(List<Integer> values) {
            addCriterion("potential_points in", values, "potentialPoints");
            return (Criteria) this;
        }

        public Criteria andPotentialPointsNotIn(List<Integer> values) {
            addCriterion("potential_points not in", values, "potentialPoints");
            return (Criteria) this;
        }

        public Criteria andPotentialPointsBetween(Integer value1, Integer value2) {
            addCriterion("potential_points between", value1, value2, "potentialPoints");
            return (Criteria) this;
        }

        public Criteria andPotentialPointsNotBetween(Integer value1, Integer value2) {
            addCriterion("potential_points not between", value1, value2, "potentialPoints");
            return (Criteria) this;
        }

        public Criteria andPointsIsNull() {
            addCriterion("points is null");
            return (Criteria) this;
        }

        public Criteria andPointsIsNotNull() {
            addCriterion("points is not null");
            return (Criteria) this;
        }

        public Criteria andPointsEqualTo(Integer value) {
            addCriterion("points =", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsNotEqualTo(Integer value) {
            addCriterion("points <>", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsGreaterThan(Integer value) {
            addCriterion("points >", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsGreaterThanOrEqualTo(Integer value) {
            addCriterion("points >=", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsLessThan(Integer value) {
            addCriterion("points <", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsLessThanOrEqualTo(Integer value) {
            addCriterion("points <=", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsIn(List<Integer> values) {
            addCriterion("points in", values, "points");
            return (Criteria) this;
        }

        public Criteria andPointsNotIn(List<Integer> values) {
            addCriterion("points not in", values, "points");
            return (Criteria) this;
        }

        public Criteria andPointsBetween(Integer value1, Integer value2) {
            addCriterion("points between", value1, value2, "points");
            return (Criteria) this;
        }

        public Criteria andPointsNotBetween(Integer value1, Integer value2) {
            addCriterion("points not between", value1, value2, "points");
            return (Criteria) this;
        }

        public Criteria andShotMadeIsNull() {
            addCriterion("shot_made is null");
            return (Criteria) this;
        }

        public Criteria andShotMadeIsNotNull() {
            addCriterion("shot_made is not null");
            return (Criteria) this;
        }

        public Criteria andShotMadeEqualTo(Boolean value) {
            addCriterion("shot_made =", value, "shotMade");
            return (Criteria) this;
        }

        public Criteria andShotMadeNotEqualTo(Boolean value) {
            addCriterion("shot_made <>", value, "shotMade");
            return (Criteria) this;
        }

        public Criteria andShotMadeGreaterThan(Boolean value) {
            addCriterion("shot_made >", value, "shotMade");
            return (Criteria) this;
        }

        public Criteria andShotMadeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("shot_made >=", value, "shotMade");
            return (Criteria) this;
        }

        public Criteria andShotMadeLessThan(Boolean value) {
            addCriterion("shot_made <", value, "shotMade");
            return (Criteria) this;
        }

        public Criteria andShotMadeLessThanOrEqualTo(Boolean value) {
            addCriterion("shot_made <=", value, "shotMade");
            return (Criteria) this;
        }

        public Criteria andShotMadeIn(List<Boolean> values) {
            addCriterion("shot_made in", values, "shotMade");
            return (Criteria) this;
        }

        public Criteria andShotMadeNotIn(List<Boolean> values) {
            addCriterion("shot_made not in", values, "shotMade");
            return (Criteria) this;
        }

        public Criteria andShotMadeBetween(Boolean value1, Boolean value2) {
            addCriterion("shot_made between", value1, value2, "shotMade");
            return (Criteria) this;
        }

        public Criteria andShotMadeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("shot_made not between", value1, value2, "shotMade");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNull() {
            addCriterion("category is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("category is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(String value) {
            addCriterion("category =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(String value) {
            addCriterion("category <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(String value) {
            addCriterion("category >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("category >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(String value) {
            addCriterion("category <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(String value) {
            addCriterion("category <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLike(String value) {
            addCriterion("category like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotLike(String value) {
            addCriterion("category not like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<String> values) {
            addCriterion("category in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<String> values) {
            addCriterion("category not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(String value1, String value2) {
            addCriterion("category between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(String value1, String value2) {
            addCriterion("category not between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("`type` is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("`type` is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("`type` =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("`type` <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("`type` >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("`type` >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("`type` <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("`type` <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("`type` like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("`type` not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("`type` in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("`type` not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("`type` between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("`type` not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTeamIdIsNull() {
            addCriterion("team_id is null");
            return (Criteria) this;
        }

        public Criteria andTeamIdIsNotNull() {
            addCriterion("team_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeamIdEqualTo(Integer value) {
            addCriterion("team_id =", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdNotEqualTo(Integer value) {
            addCriterion("team_id <>", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdGreaterThan(Integer value) {
            addCriterion("team_id >", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("team_id >=", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdLessThan(Integer value) {
            addCriterion("team_id <", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdLessThanOrEqualTo(Integer value) {
            addCriterion("team_id <=", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdIn(List<Integer> values) {
            addCriterion("team_id in", values, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdNotIn(List<Integer> values) {
            addCriterion("team_id not in", values, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdBetween(Integer value1, Integer value2) {
            addCriterion("team_id between", value1, value2, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdNotBetween(Integer value1, Integer value2) {
            addCriterion("team_id not between", value1, value2, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIsNull() {
            addCriterion("team is null");
            return (Criteria) this;
        }

        public Criteria andTeamIsNotNull() {
            addCriterion("team is not null");
            return (Criteria) this;
        }

        public Criteria andTeamEqualTo(String value) {
            addCriterion("team =", value, "team");
            return (Criteria) this;
        }

        public Criteria andTeamNotEqualTo(String value) {
            addCriterion("team <>", value, "team");
            return (Criteria) this;
        }

        public Criteria andTeamGreaterThan(String value) {
            addCriterion("team >", value, "team");
            return (Criteria) this;
        }

        public Criteria andTeamGreaterThanOrEqualTo(String value) {
            addCriterion("team >=", value, "team");
            return (Criteria) this;
        }

        public Criteria andTeamLessThan(String value) {
            addCriterion("team <", value, "team");
            return (Criteria) this;
        }

        public Criteria andTeamLessThanOrEqualTo(String value) {
            addCriterion("team <=", value, "team");
            return (Criteria) this;
        }

        public Criteria andTeamLike(String value) {
            addCriterion("team like", value, "team");
            return (Criteria) this;
        }

        public Criteria andTeamNotLike(String value) {
            addCriterion("team not like", value, "team");
            return (Criteria) this;
        }

        public Criteria andTeamIn(List<String> values) {
            addCriterion("team in", values, "team");
            return (Criteria) this;
        }

        public Criteria andTeamNotIn(List<String> values) {
            addCriterion("team not in", values, "team");
            return (Criteria) this;
        }

        public Criteria andTeamBetween(String value1, String value2) {
            addCriterion("team between", value1, value2, "team");
            return (Criteria) this;
        }

        public Criteria andTeamNotBetween(String value1, String value2) {
            addCriterion("team not between", value1, value2, "team");
            return (Criteria) this;
        }

        public Criteria andOpponentIdIsNull() {
            addCriterion("opponent_id is null");
            return (Criteria) this;
        }

        public Criteria andOpponentIdIsNotNull() {
            addCriterion("opponent_id is not null");
            return (Criteria) this;
        }

        public Criteria andOpponentIdEqualTo(Integer value) {
            addCriterion("opponent_id =", value, "opponentId");
            return (Criteria) this;
        }

        public Criteria andOpponentIdNotEqualTo(Integer value) {
            addCriterion("opponent_id <>", value, "opponentId");
            return (Criteria) this;
        }

        public Criteria andOpponentIdGreaterThan(Integer value) {
            addCriterion("opponent_id >", value, "opponentId");
            return (Criteria) this;
        }

        public Criteria andOpponentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("opponent_id >=", value, "opponentId");
            return (Criteria) this;
        }

        public Criteria andOpponentIdLessThan(Integer value) {
            addCriterion("opponent_id <", value, "opponentId");
            return (Criteria) this;
        }

        public Criteria andOpponentIdLessThanOrEqualTo(Integer value) {
            addCriterion("opponent_id <=", value, "opponentId");
            return (Criteria) this;
        }

        public Criteria andOpponentIdIn(List<Integer> values) {
            addCriterion("opponent_id in", values, "opponentId");
            return (Criteria) this;
        }

        public Criteria andOpponentIdNotIn(List<Integer> values) {
            addCriterion("opponent_id not in", values, "opponentId");
            return (Criteria) this;
        }

        public Criteria andOpponentIdBetween(Integer value1, Integer value2) {
            addCriterion("opponent_id between", value1, value2, "opponentId");
            return (Criteria) this;
        }

        public Criteria andOpponentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("opponent_id not between", value1, value2, "opponentId");
            return (Criteria) this;
        }

        public Criteria andOpponentIsNull() {
            addCriterion("opponent is null");
            return (Criteria) this;
        }

        public Criteria andOpponentIsNotNull() {
            addCriterion("opponent is not null");
            return (Criteria) this;
        }

        public Criteria andOpponentEqualTo(String value) {
            addCriterion("opponent =", value, "opponent");
            return (Criteria) this;
        }

        public Criteria andOpponentNotEqualTo(String value) {
            addCriterion("opponent <>", value, "opponent");
            return (Criteria) this;
        }

        public Criteria andOpponentGreaterThan(String value) {
            addCriterion("opponent >", value, "opponent");
            return (Criteria) this;
        }

        public Criteria andOpponentGreaterThanOrEqualTo(String value) {
            addCriterion("opponent >=", value, "opponent");
            return (Criteria) this;
        }

        public Criteria andOpponentLessThan(String value) {
            addCriterion("opponent <", value, "opponent");
            return (Criteria) this;
        }

        public Criteria andOpponentLessThanOrEqualTo(String value) {
            addCriterion("opponent <=", value, "opponent");
            return (Criteria) this;
        }

        public Criteria andOpponentLike(String value) {
            addCriterion("opponent like", value, "opponent");
            return (Criteria) this;
        }

        public Criteria andOpponentNotLike(String value) {
            addCriterion("opponent not like", value, "opponent");
            return (Criteria) this;
        }

        public Criteria andOpponentIn(List<String> values) {
            addCriterion("opponent in", values, "opponent");
            return (Criteria) this;
        }

        public Criteria andOpponentNotIn(List<String> values) {
            addCriterion("opponent not in", values, "opponent");
            return (Criteria) this;
        }

        public Criteria andOpponentBetween(String value1, String value2) {
            addCriterion("opponent between", value1, value2, "opponent");
            return (Criteria) this;
        }

        public Criteria andOpponentNotBetween(String value1, String value2) {
            addCriterion("opponent not between", value1, value2, "opponent");
            return (Criteria) this;
        }

        public Criteria andReceivingTeamIdIsNull() {
            addCriterion("receiving_team_id is null");
            return (Criteria) this;
        }

        public Criteria andReceivingTeamIdIsNotNull() {
            addCriterion("receiving_team_id is not null");
            return (Criteria) this;
        }

        public Criteria andReceivingTeamIdEqualTo(Integer value) {
            addCriterion("receiving_team_id =", value, "receivingTeamId");
            return (Criteria) this;
        }

        public Criteria andReceivingTeamIdNotEqualTo(Integer value) {
            addCriterion("receiving_team_id <>", value, "receivingTeamId");
            return (Criteria) this;
        }

        public Criteria andReceivingTeamIdGreaterThan(Integer value) {
            addCriterion("receiving_team_id >", value, "receivingTeamId");
            return (Criteria) this;
        }

        public Criteria andReceivingTeamIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("receiving_team_id >=", value, "receivingTeamId");
            return (Criteria) this;
        }

        public Criteria andReceivingTeamIdLessThan(Integer value) {
            addCriterion("receiving_team_id <", value, "receivingTeamId");
            return (Criteria) this;
        }

        public Criteria andReceivingTeamIdLessThanOrEqualTo(Integer value) {
            addCriterion("receiving_team_id <=", value, "receivingTeamId");
            return (Criteria) this;
        }

        public Criteria andReceivingTeamIdIn(List<Integer> values) {
            addCriterion("receiving_team_id in", values, "receivingTeamId");
            return (Criteria) this;
        }

        public Criteria andReceivingTeamIdNotIn(List<Integer> values) {
            addCriterion("receiving_team_id not in", values, "receivingTeamId");
            return (Criteria) this;
        }

        public Criteria andReceivingTeamIdBetween(Integer value1, Integer value2) {
            addCriterion("receiving_team_id between", value1, value2, "receivingTeamId");
            return (Criteria) this;
        }

        public Criteria andReceivingTeamIdNotBetween(Integer value1, Integer value2) {
            addCriterion("receiving_team_id not between", value1, value2, "receivingTeamId");
            return (Criteria) this;
        }

        public Criteria andReceivingTeamIsNull() {
            addCriterion("receiving_team is null");
            return (Criteria) this;
        }

        public Criteria andReceivingTeamIsNotNull() {
            addCriterion("receiving_team is not null");
            return (Criteria) this;
        }

        public Criteria andReceivingTeamEqualTo(String value) {
            addCriterion("receiving_team =", value, "receivingTeam");
            return (Criteria) this;
        }

        public Criteria andReceivingTeamNotEqualTo(String value) {
            addCriterion("receiving_team <>", value, "receivingTeam");
            return (Criteria) this;
        }

        public Criteria andReceivingTeamGreaterThan(String value) {
            addCriterion("receiving_team >", value, "receivingTeam");
            return (Criteria) this;
        }

        public Criteria andReceivingTeamGreaterThanOrEqualTo(String value) {
            addCriterion("receiving_team >=", value, "receivingTeam");
            return (Criteria) this;
        }

        public Criteria andReceivingTeamLessThan(String value) {
            addCriterion("receiving_team <", value, "receivingTeam");
            return (Criteria) this;
        }

        public Criteria andReceivingTeamLessThanOrEqualTo(String value) {
            addCriterion("receiving_team <=", value, "receivingTeam");
            return (Criteria) this;
        }

        public Criteria andReceivingTeamLike(String value) {
            addCriterion("receiving_team like", value, "receivingTeam");
            return (Criteria) this;
        }

        public Criteria andReceivingTeamNotLike(String value) {
            addCriterion("receiving_team not like", value, "receivingTeam");
            return (Criteria) this;
        }

        public Criteria andReceivingTeamIn(List<String> values) {
            addCriterion("receiving_team in", values, "receivingTeam");
            return (Criteria) this;
        }

        public Criteria andReceivingTeamNotIn(List<String> values) {
            addCriterion("receiving_team not in", values, "receivingTeam");
            return (Criteria) this;
        }

        public Criteria andReceivingTeamBetween(String value1, String value2) {
            addCriterion("receiving_team between", value1, value2, "receivingTeam");
            return (Criteria) this;
        }

        public Criteria andReceivingTeamNotBetween(String value1, String value2) {
            addCriterion("receiving_team not between", value1, value2, "receivingTeam");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andPlayerIdIsNull() {
            addCriterion("player_id is null");
            return (Criteria) this;
        }

        public Criteria andPlayerIdIsNotNull() {
            addCriterion("player_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlayerIdEqualTo(Integer value) {
            addCriterion("player_id =", value, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdNotEqualTo(Integer value) {
            addCriterion("player_id <>", value, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdGreaterThan(Integer value) {
            addCriterion("player_id >", value, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("player_id >=", value, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdLessThan(Integer value) {
            addCriterion("player_id <", value, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdLessThanOrEqualTo(Integer value) {
            addCriterion("player_id <=", value, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdIn(List<Integer> values) {
            addCriterion("player_id in", values, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdNotIn(List<Integer> values) {
            addCriterion("player_id not in", values, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdBetween(Integer value1, Integer value2) {
            addCriterion("player_id between", value1, value2, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("player_id not between", value1, value2, "playerId");
            return (Criteria) this;
        }

        public Criteria andAssistedByPlayerIdIsNull() {
            addCriterion("assisted_by_player_id is null");
            return (Criteria) this;
        }

        public Criteria andAssistedByPlayerIdIsNotNull() {
            addCriterion("assisted_by_player_id is not null");
            return (Criteria) this;
        }

        public Criteria andAssistedByPlayerIdEqualTo(Integer value) {
            addCriterion("assisted_by_player_id =", value, "assistedByPlayerId");
            return (Criteria) this;
        }

        public Criteria andAssistedByPlayerIdNotEqualTo(Integer value) {
            addCriterion("assisted_by_player_id <>", value, "assistedByPlayerId");
            return (Criteria) this;
        }

        public Criteria andAssistedByPlayerIdGreaterThan(Integer value) {
            addCriterion("assisted_by_player_id >", value, "assistedByPlayerId");
            return (Criteria) this;
        }

        public Criteria andAssistedByPlayerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("assisted_by_player_id >=", value, "assistedByPlayerId");
            return (Criteria) this;
        }

        public Criteria andAssistedByPlayerIdLessThan(Integer value) {
            addCriterion("assisted_by_player_id <", value, "assistedByPlayerId");
            return (Criteria) this;
        }

        public Criteria andAssistedByPlayerIdLessThanOrEqualTo(Integer value) {
            addCriterion("assisted_by_player_id <=", value, "assistedByPlayerId");
            return (Criteria) this;
        }

        public Criteria andAssistedByPlayerIdIn(List<Integer> values) {
            addCriterion("assisted_by_player_id in", values, "assistedByPlayerId");
            return (Criteria) this;
        }

        public Criteria andAssistedByPlayerIdNotIn(List<Integer> values) {
            addCriterion("assisted_by_player_id not in", values, "assistedByPlayerId");
            return (Criteria) this;
        }

        public Criteria andAssistedByPlayerIdBetween(Integer value1, Integer value2) {
            addCriterion("assisted_by_player_id between", value1, value2, "assistedByPlayerId");
            return (Criteria) this;
        }

        public Criteria andAssistedByPlayerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("assisted_by_player_id not between", value1, value2, "assistedByPlayerId");
            return (Criteria) this;
        }

        public Criteria andBlockedByPlayerIdIsNull() {
            addCriterion("blocked_by_player_id is null");
            return (Criteria) this;
        }

        public Criteria andBlockedByPlayerIdIsNotNull() {
            addCriterion("blocked_by_player_id is not null");
            return (Criteria) this;
        }

        public Criteria andBlockedByPlayerIdEqualTo(Integer value) {
            addCriterion("blocked_by_player_id =", value, "blockedByPlayerId");
            return (Criteria) this;
        }

        public Criteria andBlockedByPlayerIdNotEqualTo(Integer value) {
            addCriterion("blocked_by_player_id <>", value, "blockedByPlayerId");
            return (Criteria) this;
        }

        public Criteria andBlockedByPlayerIdGreaterThan(Integer value) {
            addCriterion("blocked_by_player_id >", value, "blockedByPlayerId");
            return (Criteria) this;
        }

        public Criteria andBlockedByPlayerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("blocked_by_player_id >=", value, "blockedByPlayerId");
            return (Criteria) this;
        }

        public Criteria andBlockedByPlayerIdLessThan(Integer value) {
            addCriterion("blocked_by_player_id <", value, "blockedByPlayerId");
            return (Criteria) this;
        }

        public Criteria andBlockedByPlayerIdLessThanOrEqualTo(Integer value) {
            addCriterion("blocked_by_player_id <=", value, "blockedByPlayerId");
            return (Criteria) this;
        }

        public Criteria andBlockedByPlayerIdIn(List<Integer> values) {
            addCriterion("blocked_by_player_id in", values, "blockedByPlayerId");
            return (Criteria) this;
        }

        public Criteria andBlockedByPlayerIdNotIn(List<Integer> values) {
            addCriterion("blocked_by_player_id not in", values, "blockedByPlayerId");
            return (Criteria) this;
        }

        public Criteria andBlockedByPlayerIdBetween(Integer value1, Integer value2) {
            addCriterion("blocked_by_player_id between", value1, value2, "blockedByPlayerId");
            return (Criteria) this;
        }

        public Criteria andBlockedByPlayerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("blocked_by_player_id not between", value1, value2, "blockedByPlayerId");
            return (Criteria) this;
        }

        public Criteria andFastBreakIsNull() {
            addCriterion("fast_break is null");
            return (Criteria) this;
        }

        public Criteria andFastBreakIsNotNull() {
            addCriterion("fast_break is not null");
            return (Criteria) this;
        }

        public Criteria andFastBreakEqualTo(Boolean value) {
            addCriterion("fast_break =", value, "fastBreak");
            return (Criteria) this;
        }

        public Criteria andFastBreakNotEqualTo(Boolean value) {
            addCriterion("fast_break <>", value, "fastBreak");
            return (Criteria) this;
        }

        public Criteria andFastBreakGreaterThan(Boolean value) {
            addCriterion("fast_break >", value, "fastBreak");
            return (Criteria) this;
        }

        public Criteria andFastBreakGreaterThanOrEqualTo(Boolean value) {
            addCriterion("fast_break >=", value, "fastBreak");
            return (Criteria) this;
        }

        public Criteria andFastBreakLessThan(Boolean value) {
            addCriterion("fast_break <", value, "fastBreak");
            return (Criteria) this;
        }

        public Criteria andFastBreakLessThanOrEqualTo(Boolean value) {
            addCriterion("fast_break <=", value, "fastBreak");
            return (Criteria) this;
        }

        public Criteria andFastBreakIn(List<Boolean> values) {
            addCriterion("fast_break in", values, "fastBreak");
            return (Criteria) this;
        }

        public Criteria andFastBreakNotIn(List<Boolean> values) {
            addCriterion("fast_break not in", values, "fastBreak");
            return (Criteria) this;
        }

        public Criteria andFastBreakBetween(Boolean value1, Boolean value2) {
            addCriterion("fast_break between", value1, value2, "fastBreak");
            return (Criteria) this;
        }

        public Criteria andFastBreakNotBetween(Boolean value1, Boolean value2) {
            addCriterion("fast_break not between", value1, value2, "fastBreak");
            return (Criteria) this;
        }

        public Criteria andSideOfBasketIsNull() {
            addCriterion("side_of_basket is null");
            return (Criteria) this;
        }

        public Criteria andSideOfBasketIsNotNull() {
            addCriterion("side_of_basket is not null");
            return (Criteria) this;
        }

        public Criteria andSideOfBasketEqualTo(String value) {
            addCriterion("side_of_basket =", value, "sideOfBasket");
            return (Criteria) this;
        }

        public Criteria andSideOfBasketNotEqualTo(String value) {
            addCriterion("side_of_basket <>", value, "sideOfBasket");
            return (Criteria) this;
        }

        public Criteria andSideOfBasketGreaterThan(String value) {
            addCriterion("side_of_basket >", value, "sideOfBasket");
            return (Criteria) this;
        }

        public Criteria andSideOfBasketGreaterThanOrEqualTo(String value) {
            addCriterion("side_of_basket >=", value, "sideOfBasket");
            return (Criteria) this;
        }

        public Criteria andSideOfBasketLessThan(String value) {
            addCriterion("side_of_basket <", value, "sideOfBasket");
            return (Criteria) this;
        }

        public Criteria andSideOfBasketLessThanOrEqualTo(String value) {
            addCriterion("side_of_basket <=", value, "sideOfBasket");
            return (Criteria) this;
        }

        public Criteria andSideOfBasketLike(String value) {
            addCriterion("side_of_basket like", value, "sideOfBasket");
            return (Criteria) this;
        }

        public Criteria andSideOfBasketNotLike(String value) {
            addCriterion("side_of_basket not like", value, "sideOfBasket");
            return (Criteria) this;
        }

        public Criteria andSideOfBasketIn(List<String> values) {
            addCriterion("side_of_basket in", values, "sideOfBasket");
            return (Criteria) this;
        }

        public Criteria andSideOfBasketNotIn(List<String> values) {
            addCriterion("side_of_basket not in", values, "sideOfBasket");
            return (Criteria) this;
        }

        public Criteria andSideOfBasketBetween(String value1, String value2) {
            addCriterion("side_of_basket between", value1, value2, "sideOfBasket");
            return (Criteria) this;
        }

        public Criteria andSideOfBasketNotBetween(String value1, String value2) {
            addCriterion("side_of_basket not between", value1, value2, "sideOfBasket");
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

        public Criteria andCreatedIsNull() {
            addCriterion("created is null");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNotNull() {
            addCriterion("created is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedEqualTo(String value) {
            addCriterion("created =", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotEqualTo(String value) {
            addCriterion("created <>", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThan(String value) {
            addCriterion("created >", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThanOrEqualTo(String value) {
            addCriterion("created >=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThan(String value) {
            addCriterion("created <", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThanOrEqualTo(String value) {
            addCriterion("created <=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLike(String value) {
            addCriterion("created like", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotLike(String value) {
            addCriterion("created not like", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedIn(List<String> values) {
            addCriterion("created in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotIn(List<String> values) {
            addCriterion("created not in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedBetween(String value1, String value2) {
            addCriterion("created between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotBetween(String value1, String value2) {
            addCriterion("created not between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andSubstituteinPlayerIdIsNull() {
            addCriterion("substituteIn_player_id is null");
            return (Criteria) this;
        }

        public Criteria andSubstituteinPlayerIdIsNotNull() {
            addCriterion("substituteIn_player_id is not null");
            return (Criteria) this;
        }

        public Criteria andSubstituteinPlayerIdEqualTo(Integer value) {
            addCriterion("substituteIn_player_id =", value, "substituteinPlayerId");
            return (Criteria) this;
        }

        public Criteria andSubstituteinPlayerIdNotEqualTo(Integer value) {
            addCriterion("substituteIn_player_id <>", value, "substituteinPlayerId");
            return (Criteria) this;
        }

        public Criteria andSubstituteinPlayerIdGreaterThan(Integer value) {
            addCriterion("substituteIn_player_id >", value, "substituteinPlayerId");
            return (Criteria) this;
        }

        public Criteria andSubstituteinPlayerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("substituteIn_player_id >=", value, "substituteinPlayerId");
            return (Criteria) this;
        }

        public Criteria andSubstituteinPlayerIdLessThan(Integer value) {
            addCriterion("substituteIn_player_id <", value, "substituteinPlayerId");
            return (Criteria) this;
        }

        public Criteria andSubstituteinPlayerIdLessThanOrEqualTo(Integer value) {
            addCriterion("substituteIn_player_id <=", value, "substituteinPlayerId");
            return (Criteria) this;
        }

        public Criteria andSubstituteinPlayerIdIn(List<Integer> values) {
            addCriterion("substituteIn_player_id in", values, "substituteinPlayerId");
            return (Criteria) this;
        }

        public Criteria andSubstituteinPlayerIdNotIn(List<Integer> values) {
            addCriterion("substituteIn_player_id not in", values, "substituteinPlayerId");
            return (Criteria) this;
        }

        public Criteria andSubstituteinPlayerIdBetween(Integer value1, Integer value2) {
            addCriterion("substituteIn_player_id between", value1, value2, "substituteinPlayerId");
            return (Criteria) this;
        }

        public Criteria andSubstituteinPlayerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("substituteIn_player_id not between", value1, value2, "substituteinPlayerId");
            return (Criteria) this;
        }

        public Criteria andSubstituteOutPlayerIdIsNull() {
            addCriterion("substitute_out_player_id is null");
            return (Criteria) this;
        }

        public Criteria andSubstituteOutPlayerIdIsNotNull() {
            addCriterion("substitute_out_player_id is not null");
            return (Criteria) this;
        }

        public Criteria andSubstituteOutPlayerIdEqualTo(Integer value) {
            addCriterion("substitute_out_player_id =", value, "substituteOutPlayerId");
            return (Criteria) this;
        }

        public Criteria andSubstituteOutPlayerIdNotEqualTo(Integer value) {
            addCriterion("substitute_out_player_id <>", value, "substituteOutPlayerId");
            return (Criteria) this;
        }

        public Criteria andSubstituteOutPlayerIdGreaterThan(Integer value) {
            addCriterion("substitute_out_player_id >", value, "substituteOutPlayerId");
            return (Criteria) this;
        }

        public Criteria andSubstituteOutPlayerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("substitute_out_player_id >=", value, "substituteOutPlayerId");
            return (Criteria) this;
        }

        public Criteria andSubstituteOutPlayerIdLessThan(Integer value) {
            addCriterion("substitute_out_player_id <", value, "substituteOutPlayerId");
            return (Criteria) this;
        }

        public Criteria andSubstituteOutPlayerIdLessThanOrEqualTo(Integer value) {
            addCriterion("substitute_out_player_id <=", value, "substituteOutPlayerId");
            return (Criteria) this;
        }

        public Criteria andSubstituteOutPlayerIdIn(List<Integer> values) {
            addCriterion("substitute_out_player_id in", values, "substituteOutPlayerId");
            return (Criteria) this;
        }

        public Criteria andSubstituteOutPlayerIdNotIn(List<Integer> values) {
            addCriterion("substitute_out_player_id not in", values, "substituteOutPlayerId");
            return (Criteria) this;
        }

        public Criteria andSubstituteOutPlayerIdBetween(Integer value1, Integer value2) {
            addCriterion("substitute_out_player_id between", value1, value2, "substituteOutPlayerId");
            return (Criteria) this;
        }

        public Criteria andSubstituteOutPlayerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("substitute_out_player_id not between", value1, value2, "substituteOutPlayerId");
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