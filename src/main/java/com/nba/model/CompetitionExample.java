package com.nba.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CompetitionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    private Boolean forUpdate;

    public CompetitionExample() {
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

        public Criteria andCompetitionIdIsNull() {
            addCriterion("competition_id is null");
            return (Criteria) this;
        }

        public Criteria andCompetitionIdIsNotNull() {
            addCriterion("competition_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompetitionIdEqualTo(Integer value) {
            addCriterion("competition_id =", value, "competitionId");
            return (Criteria) this;
        }

        public Criteria andCompetitionIdNotEqualTo(Integer value) {
            addCriterion("competition_id <>", value, "competitionId");
            return (Criteria) this;
        }

        public Criteria andCompetitionIdGreaterThan(Integer value) {
            addCriterion("competition_id >", value, "competitionId");
            return (Criteria) this;
        }

        public Criteria andCompetitionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("competition_id >=", value, "competitionId");
            return (Criteria) this;
        }

        public Criteria andCompetitionIdLessThan(Integer value) {
            addCriterion("competition_id <", value, "competitionId");
            return (Criteria) this;
        }

        public Criteria andCompetitionIdLessThanOrEqualTo(Integer value) {
            addCriterion("competition_id <=", value, "competitionId");
            return (Criteria) this;
        }

        public Criteria andCompetitionIdIn(List<Integer> values) {
            addCriterion("competition_id in", values, "competitionId");
            return (Criteria) this;
        }

        public Criteria andCompetitionIdNotIn(List<Integer> values) {
            addCriterion("competition_id not in", values, "competitionId");
            return (Criteria) this;
        }

        public Criteria andCompetitionIdBetween(Integer value1, Integer value2) {
            addCriterion("competition_id between", value1, value2, "competitionId");
            return (Criteria) this;
        }

        public Criteria andCompetitionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("competition_id not between", value1, value2, "competitionId");
            return (Criteria) this;
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

        public Criteria andStatusIsNull() {
            addCriterion("`status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("`status` not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Date value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Date value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Date value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Date value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Date> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Date> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Date value1, Date value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
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

        public Criteria andHomeTeamOfficalSupportIsNull() {
            addCriterion("home_team_offical_support is null");
            return (Criteria) this;
        }

        public Criteria andHomeTeamOfficalSupportIsNotNull() {
            addCriterion("home_team_offical_support is not null");
            return (Criteria) this;
        }

        public Criteria andHomeTeamOfficalSupportEqualTo(Double value) {
            addCriterion("home_team_offical_support =", value, "homeTeamOfficalSupport");
            return (Criteria) this;
        }

        public Criteria andHomeTeamOfficalSupportNotEqualTo(Double value) {
            addCriterion("home_team_offical_support <>", value, "homeTeamOfficalSupport");
            return (Criteria) this;
        }

        public Criteria andHomeTeamOfficalSupportGreaterThan(Double value) {
            addCriterion("home_team_offical_support >", value, "homeTeamOfficalSupport");
            return (Criteria) this;
        }

        public Criteria andHomeTeamOfficalSupportGreaterThanOrEqualTo(Double value) {
            addCriterion("home_team_offical_support >=", value, "homeTeamOfficalSupport");
            return (Criteria) this;
        }

        public Criteria andHomeTeamOfficalSupportLessThan(Double value) {
            addCriterion("home_team_offical_support <", value, "homeTeamOfficalSupport");
            return (Criteria) this;
        }

        public Criteria andHomeTeamOfficalSupportLessThanOrEqualTo(Double value) {
            addCriterion("home_team_offical_support <=", value, "homeTeamOfficalSupport");
            return (Criteria) this;
        }

        public Criteria andHomeTeamOfficalSupportIn(List<Double> values) {
            addCriterion("home_team_offical_support in", values, "homeTeamOfficalSupport");
            return (Criteria) this;
        }

        public Criteria andHomeTeamOfficalSupportNotIn(List<Double> values) {
            addCriterion("home_team_offical_support not in", values, "homeTeamOfficalSupport");
            return (Criteria) this;
        }

        public Criteria andHomeTeamOfficalSupportBetween(Double value1, Double value2) {
            addCriterion("home_team_offical_support between", value1, value2, "homeTeamOfficalSupport");
            return (Criteria) this;
        }

        public Criteria andHomeTeamOfficalSupportNotBetween(Double value1, Double value2) {
            addCriterion("home_team_offical_support not between", value1, value2, "homeTeamOfficalSupport");
            return (Criteria) this;
        }

        public Criteria andAwayTeamOfficalSupportIsNull() {
            addCriterion("away_team_offical_support is null");
            return (Criteria) this;
        }

        public Criteria andAwayTeamOfficalSupportIsNotNull() {
            addCriterion("away_team_offical_support is not null");
            return (Criteria) this;
        }

        public Criteria andAwayTeamOfficalSupportEqualTo(Double value) {
            addCriterion("away_team_offical_support =", value, "awayTeamOfficalSupport");
            return (Criteria) this;
        }

        public Criteria andAwayTeamOfficalSupportNotEqualTo(Double value) {
            addCriterion("away_team_offical_support <>", value, "awayTeamOfficalSupport");
            return (Criteria) this;
        }

        public Criteria andAwayTeamOfficalSupportGreaterThan(Double value) {
            addCriterion("away_team_offical_support >", value, "awayTeamOfficalSupport");
            return (Criteria) this;
        }

        public Criteria andAwayTeamOfficalSupportGreaterThanOrEqualTo(Double value) {
            addCriterion("away_team_offical_support >=", value, "awayTeamOfficalSupport");
            return (Criteria) this;
        }

        public Criteria andAwayTeamOfficalSupportLessThan(Double value) {
            addCriterion("away_team_offical_support <", value, "awayTeamOfficalSupport");
            return (Criteria) this;
        }

        public Criteria andAwayTeamOfficalSupportLessThanOrEqualTo(Double value) {
            addCriterion("away_team_offical_support <=", value, "awayTeamOfficalSupport");
            return (Criteria) this;
        }

        public Criteria andAwayTeamOfficalSupportIn(List<Double> values) {
            addCriterion("away_team_offical_support in", values, "awayTeamOfficalSupport");
            return (Criteria) this;
        }

        public Criteria andAwayTeamOfficalSupportNotIn(List<Double> values) {
            addCriterion("away_team_offical_support not in", values, "awayTeamOfficalSupport");
            return (Criteria) this;
        }

        public Criteria andAwayTeamOfficalSupportBetween(Double value1, Double value2) {
            addCriterion("away_team_offical_support between", value1, value2, "awayTeamOfficalSupport");
            return (Criteria) this;
        }

        public Criteria andAwayTeamOfficalSupportNotBetween(Double value1, Double value2) {
            addCriterion("away_team_offical_support not between", value1, value2, "awayTeamOfficalSupport");
            return (Criteria) this;
        }

        public Criteria andHomeTeamSupportIsNull() {
            addCriterion("home_team_support is null");
            return (Criteria) this;
        }

        public Criteria andHomeTeamSupportIsNotNull() {
            addCriterion("home_team_support is not null");
            return (Criteria) this;
        }

        public Criteria andHomeTeamSupportEqualTo(Integer value) {
            addCriterion("home_team_support =", value, "homeTeamSupport");
            return (Criteria) this;
        }

        public Criteria andHomeTeamSupportNotEqualTo(Integer value) {
            addCriterion("home_team_support <>", value, "homeTeamSupport");
            return (Criteria) this;
        }

        public Criteria andHomeTeamSupportGreaterThan(Integer value) {
            addCriterion("home_team_support >", value, "homeTeamSupport");
            return (Criteria) this;
        }

        public Criteria andHomeTeamSupportGreaterThanOrEqualTo(Integer value) {
            addCriterion("home_team_support >=", value, "homeTeamSupport");
            return (Criteria) this;
        }

        public Criteria andHomeTeamSupportLessThan(Integer value) {
            addCriterion("home_team_support <", value, "homeTeamSupport");
            return (Criteria) this;
        }

        public Criteria andHomeTeamSupportLessThanOrEqualTo(Integer value) {
            addCriterion("home_team_support <=", value, "homeTeamSupport");
            return (Criteria) this;
        }

        public Criteria andHomeTeamSupportIn(List<Integer> values) {
            addCriterion("home_team_support in", values, "homeTeamSupport");
            return (Criteria) this;
        }

        public Criteria andHomeTeamSupportNotIn(List<Integer> values) {
            addCriterion("home_team_support not in", values, "homeTeamSupport");
            return (Criteria) this;
        }

        public Criteria andHomeTeamSupportBetween(Integer value1, Integer value2) {
            addCriterion("home_team_support between", value1, value2, "homeTeamSupport");
            return (Criteria) this;
        }

        public Criteria andHomeTeamSupportNotBetween(Integer value1, Integer value2) {
            addCriterion("home_team_support not between", value1, value2, "homeTeamSupport");
            return (Criteria) this;
        }

        public Criteria andAwayTeamSupportIsNull() {
            addCriterion("away_team_support is null");
            return (Criteria) this;
        }

        public Criteria andAwayTeamSupportIsNotNull() {
            addCriterion("away_team_support is not null");
            return (Criteria) this;
        }

        public Criteria andAwayTeamSupportEqualTo(Integer value) {
            addCriterion("away_team_support =", value, "awayTeamSupport");
            return (Criteria) this;
        }

        public Criteria andAwayTeamSupportNotEqualTo(Integer value) {
            addCriterion("away_team_support <>", value, "awayTeamSupport");
            return (Criteria) this;
        }

        public Criteria andAwayTeamSupportGreaterThan(Integer value) {
            addCriterion("away_team_support >", value, "awayTeamSupport");
            return (Criteria) this;
        }

        public Criteria andAwayTeamSupportGreaterThanOrEqualTo(Integer value) {
            addCriterion("away_team_support >=", value, "awayTeamSupport");
            return (Criteria) this;
        }

        public Criteria andAwayTeamSupportLessThan(Integer value) {
            addCriterion("away_team_support <", value, "awayTeamSupport");
            return (Criteria) this;
        }

        public Criteria andAwayTeamSupportLessThanOrEqualTo(Integer value) {
            addCriterion("away_team_support <=", value, "awayTeamSupport");
            return (Criteria) this;
        }

        public Criteria andAwayTeamSupportIn(List<Integer> values) {
            addCriterion("away_team_support in", values, "awayTeamSupport");
            return (Criteria) this;
        }

        public Criteria andAwayTeamSupportNotIn(List<Integer> values) {
            addCriterion("away_team_support not in", values, "awayTeamSupport");
            return (Criteria) this;
        }

        public Criteria andAwayTeamSupportBetween(Integer value1, Integer value2) {
            addCriterion("away_team_support between", value1, value2, "awayTeamSupport");
            return (Criteria) this;
        }

        public Criteria andAwayTeamSupportNotBetween(Integer value1, Integer value2) {
            addCriterion("away_team_support not between", value1, value2, "awayTeamSupport");
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