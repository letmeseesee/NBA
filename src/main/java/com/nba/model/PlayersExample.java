package com.nba.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PlayersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Boolean forUpdate;

    public PlayersExample() {
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

        public Criteria andSportsDataIdIsNull() {
            addCriterion("sports_data_id is null");
            return (Criteria) this;
        }

        public Criteria andSportsDataIdIsNotNull() {
            addCriterion("sports_data_id is not null");
            return (Criteria) this;
        }

        public Criteria andSportsDataIdEqualTo(String value) {
            addCriterion("sports_data_id =", value, "sportsDataId");
            return (Criteria) this;
        }

        public Criteria andSportsDataIdNotEqualTo(String value) {
            addCriterion("sports_data_id <>", value, "sportsDataId");
            return (Criteria) this;
        }

        public Criteria andSportsDataIdGreaterThan(String value) {
            addCriterion("sports_data_id >", value, "sportsDataId");
            return (Criteria) this;
        }

        public Criteria andSportsDataIdGreaterThanOrEqualTo(String value) {
            addCriterion("sports_data_id >=", value, "sportsDataId");
            return (Criteria) this;
        }

        public Criteria andSportsDataIdLessThan(String value) {
            addCriterion("sports_data_id <", value, "sportsDataId");
            return (Criteria) this;
        }

        public Criteria andSportsDataIdLessThanOrEqualTo(String value) {
            addCriterion("sports_data_id <=", value, "sportsDataId");
            return (Criteria) this;
        }

        public Criteria andSportsDataIdLike(String value) {
            addCriterion("sports_data_id like", value, "sportsDataId");
            return (Criteria) this;
        }

        public Criteria andSportsDataIdNotLike(String value) {
            addCriterion("sports_data_id not like", value, "sportsDataId");
            return (Criteria) this;
        }

        public Criteria andSportsDataIdIn(List<String> values) {
            addCriterion("sports_data_id in", values, "sportsDataId");
            return (Criteria) this;
        }

        public Criteria andSportsDataIdNotIn(List<String> values) {
            addCriterion("sports_data_id not in", values, "sportsDataId");
            return (Criteria) this;
        }

        public Criteria andSportsDataIdBetween(String value1, String value2) {
            addCriterion("sports_data_id between", value1, value2, "sportsDataId");
            return (Criteria) this;
        }

        public Criteria andSportsDataIdNotBetween(String value1, String value2) {
            addCriterion("sports_data_id not between", value1, value2, "sportsDataId");
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

        public Criteria andJerseyIsNull() {
            addCriterion("jersey is null");
            return (Criteria) this;
        }

        public Criteria andJerseyIsNotNull() {
            addCriterion("jersey is not null");
            return (Criteria) this;
        }

        public Criteria andJerseyEqualTo(Integer value) {
            addCriterion("jersey =", value, "jersey");
            return (Criteria) this;
        }

        public Criteria andJerseyNotEqualTo(Integer value) {
            addCriterion("jersey <>", value, "jersey");
            return (Criteria) this;
        }

        public Criteria andJerseyGreaterThan(Integer value) {
            addCriterion("jersey >", value, "jersey");
            return (Criteria) this;
        }

        public Criteria andJerseyGreaterThanOrEqualTo(Integer value) {
            addCriterion("jersey >=", value, "jersey");
            return (Criteria) this;
        }

        public Criteria andJerseyLessThan(Integer value) {
            addCriterion("jersey <", value, "jersey");
            return (Criteria) this;
        }

        public Criteria andJerseyLessThanOrEqualTo(Integer value) {
            addCriterion("jersey <=", value, "jersey");
            return (Criteria) this;
        }

        public Criteria andJerseyIn(List<Integer> values) {
            addCriterion("jersey in", values, "jersey");
            return (Criteria) this;
        }

        public Criteria andJerseyNotIn(List<Integer> values) {
            addCriterion("jersey not in", values, "jersey");
            return (Criteria) this;
        }

        public Criteria andJerseyBetween(Integer value1, Integer value2) {
            addCriterion("jersey between", value1, value2, "jersey");
            return (Criteria) this;
        }

        public Criteria andJerseyNotBetween(Integer value1, Integer value2) {
            addCriterion("jersey not between", value1, value2, "jersey");
            return (Criteria) this;
        }

        public Criteria andPositionCategoryIsNull() {
            addCriterion("position_category is null");
            return (Criteria) this;
        }

        public Criteria andPositionCategoryIsNotNull() {
            addCriterion("position_category is not null");
            return (Criteria) this;
        }

        public Criteria andPositionCategoryEqualTo(String value) {
            addCriterion("position_category =", value, "positionCategory");
            return (Criteria) this;
        }

        public Criteria andPositionCategoryNotEqualTo(String value) {
            addCriterion("position_category <>", value, "positionCategory");
            return (Criteria) this;
        }

        public Criteria andPositionCategoryGreaterThan(String value) {
            addCriterion("position_category >", value, "positionCategory");
            return (Criteria) this;
        }

        public Criteria andPositionCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("position_category >=", value, "positionCategory");
            return (Criteria) this;
        }

        public Criteria andPositionCategoryLessThan(String value) {
            addCriterion("position_category <", value, "positionCategory");
            return (Criteria) this;
        }

        public Criteria andPositionCategoryLessThanOrEqualTo(String value) {
            addCriterion("position_category <=", value, "positionCategory");
            return (Criteria) this;
        }

        public Criteria andPositionCategoryLike(String value) {
            addCriterion("position_category like", value, "positionCategory");
            return (Criteria) this;
        }

        public Criteria andPositionCategoryNotLike(String value) {
            addCriterion("position_category not like", value, "positionCategory");
            return (Criteria) this;
        }

        public Criteria andPositionCategoryIn(List<String> values) {
            addCriterion("position_category in", values, "positionCategory");
            return (Criteria) this;
        }

        public Criteria andPositionCategoryNotIn(List<String> values) {
            addCriterion("position_category not in", values, "positionCategory");
            return (Criteria) this;
        }

        public Criteria andPositionCategoryBetween(String value1, String value2) {
            addCriterion("position_category between", value1, value2, "positionCategory");
            return (Criteria) this;
        }

        public Criteria andPositionCategoryNotBetween(String value1, String value2) {
            addCriterion("position_category not between", value1, value2, "positionCategory");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("`position` is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("`position` is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("`position` =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("`position` <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("`position` >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("`position` >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("`position` <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("`position` <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("`position` like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("`position` not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("`position` in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("`position` not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("`position` between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("`position` not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andFirstNameIsNull() {
            addCriterion("first_name is null");
            return (Criteria) this;
        }

        public Criteria andFirstNameIsNotNull() {
            addCriterion("first_name is not null");
            return (Criteria) this;
        }

        public Criteria andFirstNameEqualTo(String value) {
            addCriterion("first_name =", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameNotEqualTo(String value) {
            addCriterion("first_name <>", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameGreaterThan(String value) {
            addCriterion("first_name >", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameGreaterThanOrEqualTo(String value) {
            addCriterion("first_name >=", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameLessThan(String value) {
            addCriterion("first_name <", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameLessThanOrEqualTo(String value) {
            addCriterion("first_name <=", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameLike(String value) {
            addCriterion("first_name like", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameNotLike(String value) {
            addCriterion("first_name not like", value, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameIn(List<String> values) {
            addCriterion("first_name in", values, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameNotIn(List<String> values) {
            addCriterion("first_name not in", values, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameBetween(String value1, String value2) {
            addCriterion("first_name between", value1, value2, "firstName");
            return (Criteria) this;
        }

        public Criteria andFirstNameNotBetween(String value1, String value2) {
            addCriterion("first_name not between", value1, value2, "firstName");
            return (Criteria) this;
        }

        public Criteria andLastNameIsNull() {
            addCriterion("last_name is null");
            return (Criteria) this;
        }

        public Criteria andLastNameIsNotNull() {
            addCriterion("last_name is not null");
            return (Criteria) this;
        }

        public Criteria andLastNameEqualTo(String value) {
            addCriterion("last_name =", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameNotEqualTo(String value) {
            addCriterion("last_name <>", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameGreaterThan(String value) {
            addCriterion("last_name >", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameGreaterThanOrEqualTo(String value) {
            addCriterion("last_name >=", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameLessThan(String value) {
            addCriterion("last_name <", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameLessThanOrEqualTo(String value) {
            addCriterion("last_name <=", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameLike(String value) {
            addCriterion("last_name like", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameNotLike(String value) {
            addCriterion("last_name not like", value, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameIn(List<String> values) {
            addCriterion("last_name in", values, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameNotIn(List<String> values) {
            addCriterion("last_name not in", values, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameBetween(String value1, String value2) {
            addCriterion("last_name between", value1, value2, "lastName");
            return (Criteria) this;
        }

        public Criteria andLastNameNotBetween(String value1, String value2) {
            addCriterion("last_name not between", value1, value2, "lastName");
            return (Criteria) this;
        }

        public Criteria andHeightIsNull() {
            addCriterion("height is null");
            return (Criteria) this;
        }

        public Criteria andHeightIsNotNull() {
            addCriterion("height is not null");
            return (Criteria) this;
        }

        public Criteria andHeightEqualTo(Double value) {
            addCriterion("height =", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotEqualTo(Double value) {
            addCriterion("height <>", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThan(Double value) {
            addCriterion("height >", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThanOrEqualTo(Double value) {
            addCriterion("height >=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThan(Double value) {
            addCriterion("height <", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThanOrEqualTo(Double value) {
            addCriterion("height <=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightIn(List<Double> values) {
            addCriterion("height in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotIn(List<Double> values) {
            addCriterion("height not in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightBetween(Double value1, Double value2) {
            addCriterion("height between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotBetween(Double value1, Double value2) {
            addCriterion("height not between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(Double value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(Double value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(Double value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(Double value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(Double value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(Double value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<Double> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<Double> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(Double value1, Double value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(Double value1, Double value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andBirthDateIsNull() {
            addCriterion("birth_date is null");
            return (Criteria) this;
        }

        public Criteria andBirthDateIsNotNull() {
            addCriterion("birth_date is not null");
            return (Criteria) this;
        }

        public Criteria andBirthDateEqualTo(Date value) {
            addCriterion("birth_date =", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateNotEqualTo(Date value) {
            addCriterion("birth_date <>", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateGreaterThan(Date value) {
            addCriterion("birth_date >", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateGreaterThanOrEqualTo(Date value) {
            addCriterion("birth_date >=", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateLessThan(Date value) {
            addCriterion("birth_date <", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateLessThanOrEqualTo(Date value) {
            addCriterion("birth_date <=", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateIn(List<Date> values) {
            addCriterion("birth_date in", values, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateNotIn(List<Date> values) {
            addCriterion("birth_date not in", values, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateBetween(Date value1, Date value2) {
            addCriterion("birth_date between", value1, value2, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateNotBetween(Date value1, Date value2) {
            addCriterion("birth_date not between", value1, value2, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthCityIsNull() {
            addCriterion("birth_city is null");
            return (Criteria) this;
        }

        public Criteria andBirthCityIsNotNull() {
            addCriterion("birth_city is not null");
            return (Criteria) this;
        }

        public Criteria andBirthCityEqualTo(String value) {
            addCriterion("birth_city =", value, "birthCity");
            return (Criteria) this;
        }

        public Criteria andBirthCityNotEqualTo(String value) {
            addCriterion("birth_city <>", value, "birthCity");
            return (Criteria) this;
        }

        public Criteria andBirthCityGreaterThan(String value) {
            addCriterion("birth_city >", value, "birthCity");
            return (Criteria) this;
        }

        public Criteria andBirthCityGreaterThanOrEqualTo(String value) {
            addCriterion("birth_city >=", value, "birthCity");
            return (Criteria) this;
        }

        public Criteria andBirthCityLessThan(String value) {
            addCriterion("birth_city <", value, "birthCity");
            return (Criteria) this;
        }

        public Criteria andBirthCityLessThanOrEqualTo(String value) {
            addCriterion("birth_city <=", value, "birthCity");
            return (Criteria) this;
        }

        public Criteria andBirthCityLike(String value) {
            addCriterion("birth_city like", value, "birthCity");
            return (Criteria) this;
        }

        public Criteria andBirthCityNotLike(String value) {
            addCriterion("birth_city not like", value, "birthCity");
            return (Criteria) this;
        }

        public Criteria andBirthCityIn(List<String> values) {
            addCriterion("birth_city in", values, "birthCity");
            return (Criteria) this;
        }

        public Criteria andBirthCityNotIn(List<String> values) {
            addCriterion("birth_city not in", values, "birthCity");
            return (Criteria) this;
        }

        public Criteria andBirthCityBetween(String value1, String value2) {
            addCriterion("birth_city between", value1, value2, "birthCity");
            return (Criteria) this;
        }

        public Criteria andBirthCityNotBetween(String value1, String value2) {
            addCriterion("birth_city not between", value1, value2, "birthCity");
            return (Criteria) this;
        }

        public Criteria andBirthStateIsNull() {
            addCriterion("birth_state is null");
            return (Criteria) this;
        }

        public Criteria andBirthStateIsNotNull() {
            addCriterion("birth_state is not null");
            return (Criteria) this;
        }

        public Criteria andBirthStateEqualTo(String value) {
            addCriterion("birth_state =", value, "birthState");
            return (Criteria) this;
        }

        public Criteria andBirthStateNotEqualTo(String value) {
            addCriterion("birth_state <>", value, "birthState");
            return (Criteria) this;
        }

        public Criteria andBirthStateGreaterThan(String value) {
            addCriterion("birth_state >", value, "birthState");
            return (Criteria) this;
        }

        public Criteria andBirthStateGreaterThanOrEqualTo(String value) {
            addCriterion("birth_state >=", value, "birthState");
            return (Criteria) this;
        }

        public Criteria andBirthStateLessThan(String value) {
            addCriterion("birth_state <", value, "birthState");
            return (Criteria) this;
        }

        public Criteria andBirthStateLessThanOrEqualTo(String value) {
            addCriterion("birth_state <=", value, "birthState");
            return (Criteria) this;
        }

        public Criteria andBirthStateLike(String value) {
            addCriterion("birth_state like", value, "birthState");
            return (Criteria) this;
        }

        public Criteria andBirthStateNotLike(String value) {
            addCriterion("birth_state not like", value, "birthState");
            return (Criteria) this;
        }

        public Criteria andBirthStateIn(List<String> values) {
            addCriterion("birth_state in", values, "birthState");
            return (Criteria) this;
        }

        public Criteria andBirthStateNotIn(List<String> values) {
            addCriterion("birth_state not in", values, "birthState");
            return (Criteria) this;
        }

        public Criteria andBirthStateBetween(String value1, String value2) {
            addCriterion("birth_state between", value1, value2, "birthState");
            return (Criteria) this;
        }

        public Criteria andBirthStateNotBetween(String value1, String value2) {
            addCriterion("birth_state not between", value1, value2, "birthState");
            return (Criteria) this;
        }

        public Criteria andBirthCountryIsNull() {
            addCriterion("birth_country is null");
            return (Criteria) this;
        }

        public Criteria andBirthCountryIsNotNull() {
            addCriterion("birth_country is not null");
            return (Criteria) this;
        }

        public Criteria andBirthCountryEqualTo(String value) {
            addCriterion("birth_country =", value, "birthCountry");
            return (Criteria) this;
        }

        public Criteria andBirthCountryNotEqualTo(String value) {
            addCriterion("birth_country <>", value, "birthCountry");
            return (Criteria) this;
        }

        public Criteria andBirthCountryGreaterThan(String value) {
            addCriterion("birth_country >", value, "birthCountry");
            return (Criteria) this;
        }

        public Criteria andBirthCountryGreaterThanOrEqualTo(String value) {
            addCriterion("birth_country >=", value, "birthCountry");
            return (Criteria) this;
        }

        public Criteria andBirthCountryLessThan(String value) {
            addCriterion("birth_country <", value, "birthCountry");
            return (Criteria) this;
        }

        public Criteria andBirthCountryLessThanOrEqualTo(String value) {
            addCriterion("birth_country <=", value, "birthCountry");
            return (Criteria) this;
        }

        public Criteria andBirthCountryLike(String value) {
            addCriterion("birth_country like", value, "birthCountry");
            return (Criteria) this;
        }

        public Criteria andBirthCountryNotLike(String value) {
            addCriterion("birth_country not like", value, "birthCountry");
            return (Criteria) this;
        }

        public Criteria andBirthCountryIn(List<String> values) {
            addCriterion("birth_country in", values, "birthCountry");
            return (Criteria) this;
        }

        public Criteria andBirthCountryNotIn(List<String> values) {
            addCriterion("birth_country not in", values, "birthCountry");
            return (Criteria) this;
        }

        public Criteria andBirthCountryBetween(String value1, String value2) {
            addCriterion("birth_country between", value1, value2, "birthCountry");
            return (Criteria) this;
        }

        public Criteria andBirthCountryNotBetween(String value1, String value2) {
            addCriterion("birth_country not between", value1, value2, "birthCountry");
            return (Criteria) this;
        }

        public Criteria andHighSchoolIsNull() {
            addCriterion("high_school is null");
            return (Criteria) this;
        }

        public Criteria andHighSchoolIsNotNull() {
            addCriterion("high_school is not null");
            return (Criteria) this;
        }

        public Criteria andHighSchoolEqualTo(String value) {
            addCriterion("high_school =", value, "highSchool");
            return (Criteria) this;
        }

        public Criteria andHighSchoolNotEqualTo(String value) {
            addCriterion("high_school <>", value, "highSchool");
            return (Criteria) this;
        }

        public Criteria andHighSchoolGreaterThan(String value) {
            addCriterion("high_school >", value, "highSchool");
            return (Criteria) this;
        }

        public Criteria andHighSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("high_school >=", value, "highSchool");
            return (Criteria) this;
        }

        public Criteria andHighSchoolLessThan(String value) {
            addCriterion("high_school <", value, "highSchool");
            return (Criteria) this;
        }

        public Criteria andHighSchoolLessThanOrEqualTo(String value) {
            addCriterion("high_school <=", value, "highSchool");
            return (Criteria) this;
        }

        public Criteria andHighSchoolLike(String value) {
            addCriterion("high_school like", value, "highSchool");
            return (Criteria) this;
        }

        public Criteria andHighSchoolNotLike(String value) {
            addCriterion("high_school not like", value, "highSchool");
            return (Criteria) this;
        }

        public Criteria andHighSchoolIn(List<String> values) {
            addCriterion("high_school in", values, "highSchool");
            return (Criteria) this;
        }

        public Criteria andHighSchoolNotIn(List<String> values) {
            addCriterion("high_school not in", values, "highSchool");
            return (Criteria) this;
        }

        public Criteria andHighSchoolBetween(String value1, String value2) {
            addCriterion("high_school between", value1, value2, "highSchool");
            return (Criteria) this;
        }

        public Criteria andHighSchoolNotBetween(String value1, String value2) {
            addCriterion("high_school not between", value1, value2, "highSchool");
            return (Criteria) this;
        }

        public Criteria andCollegeIsNull() {
            addCriterion("college is null");
            return (Criteria) this;
        }

        public Criteria andCollegeIsNotNull() {
            addCriterion("college is not null");
            return (Criteria) this;
        }

        public Criteria andCollegeEqualTo(String value) {
            addCriterion("college =", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeNotEqualTo(String value) {
            addCriterion("college <>", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeGreaterThan(String value) {
            addCriterion("college >", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeGreaterThanOrEqualTo(String value) {
            addCriterion("college >=", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeLessThan(String value) {
            addCriterion("college <", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeLessThanOrEqualTo(String value) {
            addCriterion("college <=", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeLike(String value) {
            addCriterion("college like", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeNotLike(String value) {
            addCriterion("college not like", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeIn(List<String> values) {
            addCriterion("college in", values, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeNotIn(List<String> values) {
            addCriterion("college not in", values, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeBetween(String value1, String value2) {
            addCriterion("college between", value1, value2, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeNotBetween(String value1, String value2) {
            addCriterion("college not between", value1, value2, "college");
            return (Criteria) this;
        }

        public Criteria andSalaryIsNull() {
            addCriterion("salary is null");
            return (Criteria) this;
        }

        public Criteria andSalaryIsNotNull() {
            addCriterion("salary is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryEqualTo(Double value) {
            addCriterion("salary =", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotEqualTo(Double value) {
            addCriterion("salary <>", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryGreaterThan(Double value) {
            addCriterion("salary >", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryGreaterThanOrEqualTo(Double value) {
            addCriterion("salary >=", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLessThan(Double value) {
            addCriterion("salary <", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLessThanOrEqualTo(Double value) {
            addCriterion("salary <=", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryIn(List<Double> values) {
            addCriterion("salary in", values, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotIn(List<Double> values) {
            addCriterion("salary not in", values, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryBetween(Double value1, Double value2) {
            addCriterion("salary between", value1, value2, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotBetween(Double value1, Double value2) {
            addCriterion("salary not between", value1, value2, "salary");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlIsNull() {
            addCriterion("photo_url is null");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlIsNotNull() {
            addCriterion("photo_url is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlEqualTo(String value) {
            addCriterion("photo_url =", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlNotEqualTo(String value) {
            addCriterion("photo_url <>", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlGreaterThan(String value) {
            addCriterion("photo_url >", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("photo_url >=", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlLessThan(String value) {
            addCriterion("photo_url <", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlLessThanOrEqualTo(String value) {
            addCriterion("photo_url <=", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlLike(String value) {
            addCriterion("photo_url like", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlNotLike(String value) {
            addCriterion("photo_url not like", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlIn(List<String> values) {
            addCriterion("photo_url in", values, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlNotIn(List<String> values) {
            addCriterion("photo_url not in", values, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlBetween(String value1, String value2) {
            addCriterion("photo_url between", value1, value2, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlNotBetween(String value1, String value2) {
            addCriterion("photo_url not between", value1, value2, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andExperienceIsNull() {
            addCriterion("experience is null");
            return (Criteria) this;
        }

        public Criteria andExperienceIsNotNull() {
            addCriterion("experience is not null");
            return (Criteria) this;
        }

        public Criteria andExperienceEqualTo(Integer value) {
            addCriterion("experience =", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceNotEqualTo(Integer value) {
            addCriterion("experience <>", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceGreaterThan(Integer value) {
            addCriterion("experience >", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceGreaterThanOrEqualTo(Integer value) {
            addCriterion("experience >=", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceLessThan(Integer value) {
            addCriterion("experience <", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceLessThanOrEqualTo(Integer value) {
            addCriterion("experience <=", value, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceIn(List<Integer> values) {
            addCriterion("experience in", values, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceNotIn(List<Integer> values) {
            addCriterion("experience not in", values, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceBetween(Integer value1, Integer value2) {
            addCriterion("experience between", value1, value2, "experience");
            return (Criteria) this;
        }

        public Criteria andExperienceNotBetween(Integer value1, Integer value2) {
            addCriterion("experience not between", value1, value2, "experience");
            return (Criteria) this;
        }

        public Criteria andSportRadarPlayerIdIsNull() {
            addCriterion("sport_radar_player_id is null");
            return (Criteria) this;
        }

        public Criteria andSportRadarPlayerIdIsNotNull() {
            addCriterion("sport_radar_player_id is not null");
            return (Criteria) this;
        }

        public Criteria andSportRadarPlayerIdEqualTo(Integer value) {
            addCriterion("sport_radar_player_id =", value, "sportRadarPlayerId");
            return (Criteria) this;
        }

        public Criteria andSportRadarPlayerIdNotEqualTo(Integer value) {
            addCriterion("sport_radar_player_id <>", value, "sportRadarPlayerId");
            return (Criteria) this;
        }

        public Criteria andSportRadarPlayerIdGreaterThan(Integer value) {
            addCriterion("sport_radar_player_id >", value, "sportRadarPlayerId");
            return (Criteria) this;
        }

        public Criteria andSportRadarPlayerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sport_radar_player_id >=", value, "sportRadarPlayerId");
            return (Criteria) this;
        }

        public Criteria andSportRadarPlayerIdLessThan(Integer value) {
            addCriterion("sport_radar_player_id <", value, "sportRadarPlayerId");
            return (Criteria) this;
        }

        public Criteria andSportRadarPlayerIdLessThanOrEqualTo(Integer value) {
            addCriterion("sport_radar_player_id <=", value, "sportRadarPlayerId");
            return (Criteria) this;
        }

        public Criteria andSportRadarPlayerIdIn(List<Integer> values) {
            addCriterion("sport_radar_player_id in", values, "sportRadarPlayerId");
            return (Criteria) this;
        }

        public Criteria andSportRadarPlayerIdNotIn(List<Integer> values) {
            addCriterion("sport_radar_player_id not in", values, "sportRadarPlayerId");
            return (Criteria) this;
        }

        public Criteria andSportRadarPlayerIdBetween(Integer value1, Integer value2) {
            addCriterion("sport_radar_player_id between", value1, value2, "sportRadarPlayerId");
            return (Criteria) this;
        }

        public Criteria andSportRadarPlayerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sport_radar_player_id not between", value1, value2, "sportRadarPlayerId");
            return (Criteria) this;
        }

        public Criteria andRotoWorldPlayerIdIsNull() {
            addCriterion("roto_world_player_id is null");
            return (Criteria) this;
        }

        public Criteria andRotoWorldPlayerIdIsNotNull() {
            addCriterion("roto_world_player_id is not null");
            return (Criteria) this;
        }

        public Criteria andRotoWorldPlayerIdEqualTo(Integer value) {
            addCriterion("roto_world_player_id =", value, "rotoWorldPlayerId");
            return (Criteria) this;
        }

        public Criteria andRotoWorldPlayerIdNotEqualTo(Integer value) {
            addCriterion("roto_world_player_id <>", value, "rotoWorldPlayerId");
            return (Criteria) this;
        }

        public Criteria andRotoWorldPlayerIdGreaterThan(Integer value) {
            addCriterion("roto_world_player_id >", value, "rotoWorldPlayerId");
            return (Criteria) this;
        }

        public Criteria andRotoWorldPlayerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("roto_world_player_id >=", value, "rotoWorldPlayerId");
            return (Criteria) this;
        }

        public Criteria andRotoWorldPlayerIdLessThan(Integer value) {
            addCriterion("roto_world_player_id <", value, "rotoWorldPlayerId");
            return (Criteria) this;
        }

        public Criteria andRotoWorldPlayerIdLessThanOrEqualTo(Integer value) {
            addCriterion("roto_world_player_id <=", value, "rotoWorldPlayerId");
            return (Criteria) this;
        }

        public Criteria andRotoWorldPlayerIdIn(List<Integer> values) {
            addCriterion("roto_world_player_id in", values, "rotoWorldPlayerId");
            return (Criteria) this;
        }

        public Criteria andRotoWorldPlayerIdNotIn(List<Integer> values) {
            addCriterion("roto_world_player_id not in", values, "rotoWorldPlayerId");
            return (Criteria) this;
        }

        public Criteria andRotoWorldPlayerIdBetween(Integer value1, Integer value2) {
            addCriterion("roto_world_player_id between", value1, value2, "rotoWorldPlayerId");
            return (Criteria) this;
        }

        public Criteria andRotoWorldPlayerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("roto_world_player_id not between", value1, value2, "rotoWorldPlayerId");
            return (Criteria) this;
        }

        public Criteria andFantasyAlarmPlayerIdIsNull() {
            addCriterion("fantasy_alarm_player_id is null");
            return (Criteria) this;
        }

        public Criteria andFantasyAlarmPlayerIdIsNotNull() {
            addCriterion("fantasy_alarm_player_id is not null");
            return (Criteria) this;
        }

        public Criteria andFantasyAlarmPlayerIdEqualTo(Integer value) {
            addCriterion("fantasy_alarm_player_id =", value, "fantasyAlarmPlayerId");
            return (Criteria) this;
        }

        public Criteria andFantasyAlarmPlayerIdNotEqualTo(Integer value) {
            addCriterion("fantasy_alarm_player_id <>", value, "fantasyAlarmPlayerId");
            return (Criteria) this;
        }

        public Criteria andFantasyAlarmPlayerIdGreaterThan(Integer value) {
            addCriterion("fantasy_alarm_player_id >", value, "fantasyAlarmPlayerId");
            return (Criteria) this;
        }

        public Criteria andFantasyAlarmPlayerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("fantasy_alarm_player_id >=", value, "fantasyAlarmPlayerId");
            return (Criteria) this;
        }

        public Criteria andFantasyAlarmPlayerIdLessThan(Integer value) {
            addCriterion("fantasy_alarm_player_id <", value, "fantasyAlarmPlayerId");
            return (Criteria) this;
        }

        public Criteria andFantasyAlarmPlayerIdLessThanOrEqualTo(Integer value) {
            addCriterion("fantasy_alarm_player_id <=", value, "fantasyAlarmPlayerId");
            return (Criteria) this;
        }

        public Criteria andFantasyAlarmPlayerIdIn(List<Integer> values) {
            addCriterion("fantasy_alarm_player_id in", values, "fantasyAlarmPlayerId");
            return (Criteria) this;
        }

        public Criteria andFantasyAlarmPlayerIdNotIn(List<Integer> values) {
            addCriterion("fantasy_alarm_player_id not in", values, "fantasyAlarmPlayerId");
            return (Criteria) this;
        }

        public Criteria andFantasyAlarmPlayerIdBetween(Integer value1, Integer value2) {
            addCriterion("fantasy_alarm_player_id between", value1, value2, "fantasyAlarmPlayerId");
            return (Criteria) this;
        }

        public Criteria andFantasyAlarmPlayerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("fantasy_alarm_player_id not between", value1, value2, "fantasyAlarmPlayerId");
            return (Criteria) this;
        }

        public Criteria andStatsPlayerIdIsNull() {
            addCriterion("stats_player_id is null");
            return (Criteria) this;
        }

        public Criteria andStatsPlayerIdIsNotNull() {
            addCriterion("stats_player_id is not null");
            return (Criteria) this;
        }

        public Criteria andStatsPlayerIdEqualTo(Integer value) {
            addCriterion("stats_player_id =", value, "statsPlayerId");
            return (Criteria) this;
        }

        public Criteria andStatsPlayerIdNotEqualTo(Integer value) {
            addCriterion("stats_player_id <>", value, "statsPlayerId");
            return (Criteria) this;
        }

        public Criteria andStatsPlayerIdGreaterThan(Integer value) {
            addCriterion("stats_player_id >", value, "statsPlayerId");
            return (Criteria) this;
        }

        public Criteria andStatsPlayerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("stats_player_id >=", value, "statsPlayerId");
            return (Criteria) this;
        }

        public Criteria andStatsPlayerIdLessThan(Integer value) {
            addCriterion("stats_player_id <", value, "statsPlayerId");
            return (Criteria) this;
        }

        public Criteria andStatsPlayerIdLessThanOrEqualTo(Integer value) {
            addCriterion("stats_player_id <=", value, "statsPlayerId");
            return (Criteria) this;
        }

        public Criteria andStatsPlayerIdIn(List<Integer> values) {
            addCriterion("stats_player_id in", values, "statsPlayerId");
            return (Criteria) this;
        }

        public Criteria andStatsPlayerIdNotIn(List<Integer> values) {
            addCriterion("stats_player_id not in", values, "statsPlayerId");
            return (Criteria) this;
        }

        public Criteria andStatsPlayerIdBetween(Integer value1, Integer value2) {
            addCriterion("stats_player_id between", value1, value2, "statsPlayerId");
            return (Criteria) this;
        }

        public Criteria andStatsPlayerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("stats_player_id not between", value1, value2, "statsPlayerId");
            return (Criteria) this;
        }

        public Criteria andSportsDirectPlayerIdIsNull() {
            addCriterion("sports_direct_player_id is null");
            return (Criteria) this;
        }

        public Criteria andSportsDirectPlayerIdIsNotNull() {
            addCriterion("sports_direct_player_id is not null");
            return (Criteria) this;
        }

        public Criteria andSportsDirectPlayerIdEqualTo(Integer value) {
            addCriterion("sports_direct_player_id =", value, "sportsDirectPlayerId");
            return (Criteria) this;
        }

        public Criteria andSportsDirectPlayerIdNotEqualTo(Integer value) {
            addCriterion("sports_direct_player_id <>", value, "sportsDirectPlayerId");
            return (Criteria) this;
        }

        public Criteria andSportsDirectPlayerIdGreaterThan(Integer value) {
            addCriterion("sports_direct_player_id >", value, "sportsDirectPlayerId");
            return (Criteria) this;
        }

        public Criteria andSportsDirectPlayerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sports_direct_player_id >=", value, "sportsDirectPlayerId");
            return (Criteria) this;
        }

        public Criteria andSportsDirectPlayerIdLessThan(Integer value) {
            addCriterion("sports_direct_player_id <", value, "sportsDirectPlayerId");
            return (Criteria) this;
        }

        public Criteria andSportsDirectPlayerIdLessThanOrEqualTo(Integer value) {
            addCriterion("sports_direct_player_id <=", value, "sportsDirectPlayerId");
            return (Criteria) this;
        }

        public Criteria andSportsDirectPlayerIdIn(List<Integer> values) {
            addCriterion("sports_direct_player_id in", values, "sportsDirectPlayerId");
            return (Criteria) this;
        }

        public Criteria andSportsDirectPlayerIdNotIn(List<Integer> values) {
            addCriterion("sports_direct_player_id not in", values, "sportsDirectPlayerId");
            return (Criteria) this;
        }

        public Criteria andSportsDirectPlayerIdBetween(Integer value1, Integer value2) {
            addCriterion("sports_direct_player_id between", value1, value2, "sportsDirectPlayerId");
            return (Criteria) this;
        }

        public Criteria andSportsDirectPlayerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sports_direct_player_id not between", value1, value2, "sportsDirectPlayerId");
            return (Criteria) this;
        }

        public Criteria andXmlTeamPlayerIdIsNull() {
            addCriterion("xml_team_player_id is null");
            return (Criteria) this;
        }

        public Criteria andXmlTeamPlayerIdIsNotNull() {
            addCriterion("xml_team_player_id is not null");
            return (Criteria) this;
        }

        public Criteria andXmlTeamPlayerIdEqualTo(Integer value) {
            addCriterion("xml_team_player_id =", value, "xmlTeamPlayerId");
            return (Criteria) this;
        }

        public Criteria andXmlTeamPlayerIdNotEqualTo(Integer value) {
            addCriterion("xml_team_player_id <>", value, "xmlTeamPlayerId");
            return (Criteria) this;
        }

        public Criteria andXmlTeamPlayerIdGreaterThan(Integer value) {
            addCriterion("xml_team_player_id >", value, "xmlTeamPlayerId");
            return (Criteria) this;
        }

        public Criteria andXmlTeamPlayerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("xml_team_player_id >=", value, "xmlTeamPlayerId");
            return (Criteria) this;
        }

        public Criteria andXmlTeamPlayerIdLessThan(Integer value) {
            addCriterion("xml_team_player_id <", value, "xmlTeamPlayerId");
            return (Criteria) this;
        }

        public Criteria andXmlTeamPlayerIdLessThanOrEqualTo(Integer value) {
            addCriterion("xml_team_player_id <=", value, "xmlTeamPlayerId");
            return (Criteria) this;
        }

        public Criteria andXmlTeamPlayerIdIn(List<Integer> values) {
            addCriterion("xml_team_player_id in", values, "xmlTeamPlayerId");
            return (Criteria) this;
        }

        public Criteria andXmlTeamPlayerIdNotIn(List<Integer> values) {
            addCriterion("xml_team_player_id not in", values, "xmlTeamPlayerId");
            return (Criteria) this;
        }

        public Criteria andXmlTeamPlayerIdBetween(Integer value1, Integer value2) {
            addCriterion("xml_team_player_id between", value1, value2, "xmlTeamPlayerId");
            return (Criteria) this;
        }

        public Criteria andXmlTeamPlayerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("xml_team_player_id not between", value1, value2, "xmlTeamPlayerId");
            return (Criteria) this;
        }

        public Criteria andInjuryStatusIsNull() {
            addCriterion("injury_status is null");
            return (Criteria) this;
        }

        public Criteria andInjuryStatusIsNotNull() {
            addCriterion("injury_status is not null");
            return (Criteria) this;
        }

        public Criteria andInjuryStatusEqualTo(String value) {
            addCriterion("injury_status =", value, "injuryStatus");
            return (Criteria) this;
        }

        public Criteria andInjuryStatusNotEqualTo(String value) {
            addCriterion("injury_status <>", value, "injuryStatus");
            return (Criteria) this;
        }

        public Criteria andInjuryStatusGreaterThan(String value) {
            addCriterion("injury_status >", value, "injuryStatus");
            return (Criteria) this;
        }

        public Criteria andInjuryStatusGreaterThanOrEqualTo(String value) {
            addCriterion("injury_status >=", value, "injuryStatus");
            return (Criteria) this;
        }

        public Criteria andInjuryStatusLessThan(String value) {
            addCriterion("injury_status <", value, "injuryStatus");
            return (Criteria) this;
        }

        public Criteria andInjuryStatusLessThanOrEqualTo(String value) {
            addCriterion("injury_status <=", value, "injuryStatus");
            return (Criteria) this;
        }

        public Criteria andInjuryStatusLike(String value) {
            addCriterion("injury_status like", value, "injuryStatus");
            return (Criteria) this;
        }

        public Criteria andInjuryStatusNotLike(String value) {
            addCriterion("injury_status not like", value, "injuryStatus");
            return (Criteria) this;
        }

        public Criteria andInjuryStatusIn(List<String> values) {
            addCriterion("injury_status in", values, "injuryStatus");
            return (Criteria) this;
        }

        public Criteria andInjuryStatusNotIn(List<String> values) {
            addCriterion("injury_status not in", values, "injuryStatus");
            return (Criteria) this;
        }

        public Criteria andInjuryStatusBetween(String value1, String value2) {
            addCriterion("injury_status between", value1, value2, "injuryStatus");
            return (Criteria) this;
        }

        public Criteria andInjuryStatusNotBetween(String value1, String value2) {
            addCriterion("injury_status not between", value1, value2, "injuryStatus");
            return (Criteria) this;
        }

        public Criteria andInjuryBodyPartIsNull() {
            addCriterion("injury_body_part is null");
            return (Criteria) this;
        }

        public Criteria andInjuryBodyPartIsNotNull() {
            addCriterion("injury_body_part is not null");
            return (Criteria) this;
        }

        public Criteria andInjuryBodyPartEqualTo(String value) {
            addCriterion("injury_body_part =", value, "injuryBodyPart");
            return (Criteria) this;
        }

        public Criteria andInjuryBodyPartNotEqualTo(String value) {
            addCriterion("injury_body_part <>", value, "injuryBodyPart");
            return (Criteria) this;
        }

        public Criteria andInjuryBodyPartGreaterThan(String value) {
            addCriterion("injury_body_part >", value, "injuryBodyPart");
            return (Criteria) this;
        }

        public Criteria andInjuryBodyPartGreaterThanOrEqualTo(String value) {
            addCriterion("injury_body_part >=", value, "injuryBodyPart");
            return (Criteria) this;
        }

        public Criteria andInjuryBodyPartLessThan(String value) {
            addCriterion("injury_body_part <", value, "injuryBodyPart");
            return (Criteria) this;
        }

        public Criteria andInjuryBodyPartLessThanOrEqualTo(String value) {
            addCriterion("injury_body_part <=", value, "injuryBodyPart");
            return (Criteria) this;
        }

        public Criteria andInjuryBodyPartLike(String value) {
            addCriterion("injury_body_part like", value, "injuryBodyPart");
            return (Criteria) this;
        }

        public Criteria andInjuryBodyPartNotLike(String value) {
            addCriterion("injury_body_part not like", value, "injuryBodyPart");
            return (Criteria) this;
        }

        public Criteria andInjuryBodyPartIn(List<String> values) {
            addCriterion("injury_body_part in", values, "injuryBodyPart");
            return (Criteria) this;
        }

        public Criteria andInjuryBodyPartNotIn(List<String> values) {
            addCriterion("injury_body_part not in", values, "injuryBodyPart");
            return (Criteria) this;
        }

        public Criteria andInjuryBodyPartBetween(String value1, String value2) {
            addCriterion("injury_body_part between", value1, value2, "injuryBodyPart");
            return (Criteria) this;
        }

        public Criteria andInjuryBodyPartNotBetween(String value1, String value2) {
            addCriterion("injury_body_part not between", value1, value2, "injuryBodyPart");
            return (Criteria) this;
        }

        public Criteria andInjuryStartDateIsNull() {
            addCriterion("injury_start_date is null");
            return (Criteria) this;
        }

        public Criteria andInjuryStartDateIsNotNull() {
            addCriterion("injury_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andInjuryStartDateEqualTo(Date value) {
            addCriterion("injury_start_date =", value, "injuryStartDate");
            return (Criteria) this;
        }

        public Criteria andInjuryStartDateNotEqualTo(Date value) {
            addCriterion("injury_start_date <>", value, "injuryStartDate");
            return (Criteria) this;
        }

        public Criteria andInjuryStartDateGreaterThan(Date value) {
            addCriterion("injury_start_date >", value, "injuryStartDate");
            return (Criteria) this;
        }

        public Criteria andInjuryStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("injury_start_date >=", value, "injuryStartDate");
            return (Criteria) this;
        }

        public Criteria andInjuryStartDateLessThan(Date value) {
            addCriterion("injury_start_date <", value, "injuryStartDate");
            return (Criteria) this;
        }

        public Criteria andInjuryStartDateLessThanOrEqualTo(Date value) {
            addCriterion("injury_start_date <=", value, "injuryStartDate");
            return (Criteria) this;
        }

        public Criteria andInjuryStartDateIn(List<Date> values) {
            addCriterion("injury_start_date in", values, "injuryStartDate");
            return (Criteria) this;
        }

        public Criteria andInjuryStartDateNotIn(List<Date> values) {
            addCriterion("injury_start_date not in", values, "injuryStartDate");
            return (Criteria) this;
        }

        public Criteria andInjuryStartDateBetween(Date value1, Date value2) {
            addCriterion("injury_start_date between", value1, value2, "injuryStartDate");
            return (Criteria) this;
        }

        public Criteria andInjuryStartDateNotBetween(Date value1, Date value2) {
            addCriterion("injury_start_date not between", value1, value2, "injuryStartDate");
            return (Criteria) this;
        }

        public Criteria andInjuryNotesIsNull() {
            addCriterion("injury_notes is null");
            return (Criteria) this;
        }

        public Criteria andInjuryNotesIsNotNull() {
            addCriterion("injury_notes is not null");
            return (Criteria) this;
        }

        public Criteria andInjuryNotesEqualTo(String value) {
            addCriterion("injury_notes =", value, "injuryNotes");
            return (Criteria) this;
        }

        public Criteria andInjuryNotesNotEqualTo(String value) {
            addCriterion("injury_notes <>", value, "injuryNotes");
            return (Criteria) this;
        }

        public Criteria andInjuryNotesGreaterThan(String value) {
            addCriterion("injury_notes >", value, "injuryNotes");
            return (Criteria) this;
        }

        public Criteria andInjuryNotesGreaterThanOrEqualTo(String value) {
            addCriterion("injury_notes >=", value, "injuryNotes");
            return (Criteria) this;
        }

        public Criteria andInjuryNotesLessThan(String value) {
            addCriterion("injury_notes <", value, "injuryNotes");
            return (Criteria) this;
        }

        public Criteria andInjuryNotesLessThanOrEqualTo(String value) {
            addCriterion("injury_notes <=", value, "injuryNotes");
            return (Criteria) this;
        }

        public Criteria andInjuryNotesLike(String value) {
            addCriterion("injury_notes like", value, "injuryNotes");
            return (Criteria) this;
        }

        public Criteria andInjuryNotesNotLike(String value) {
            addCriterion("injury_notes not like", value, "injuryNotes");
            return (Criteria) this;
        }

        public Criteria andInjuryNotesIn(List<String> values) {
            addCriterion("injury_notes in", values, "injuryNotes");
            return (Criteria) this;
        }

        public Criteria andInjuryNotesNotIn(List<String> values) {
            addCriterion("injury_notes not in", values, "injuryNotes");
            return (Criteria) this;
        }

        public Criteria andInjuryNotesBetween(String value1, String value2) {
            addCriterion("injury_notes between", value1, value2, "injuryNotes");
            return (Criteria) this;
        }

        public Criteria andInjuryNotesNotBetween(String value1, String value2) {
            addCriterion("injury_notes not between", value1, value2, "injuryNotes");
            return (Criteria) this;
        }

        public Criteria andFanDuelPlayerIdIsNull() {
            addCriterion("fan_duel_player_id is null");
            return (Criteria) this;
        }

        public Criteria andFanDuelPlayerIdIsNotNull() {
            addCriterion("fan_duel_player_id is not null");
            return (Criteria) this;
        }

        public Criteria andFanDuelPlayerIdEqualTo(Integer value) {
            addCriterion("fan_duel_player_id =", value, "fanDuelPlayerId");
            return (Criteria) this;
        }

        public Criteria andFanDuelPlayerIdNotEqualTo(Integer value) {
            addCriterion("fan_duel_player_id <>", value, "fanDuelPlayerId");
            return (Criteria) this;
        }

        public Criteria andFanDuelPlayerIdGreaterThan(Integer value) {
            addCriterion("fan_duel_player_id >", value, "fanDuelPlayerId");
            return (Criteria) this;
        }

        public Criteria andFanDuelPlayerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("fan_duel_player_id >=", value, "fanDuelPlayerId");
            return (Criteria) this;
        }

        public Criteria andFanDuelPlayerIdLessThan(Integer value) {
            addCriterion("fan_duel_player_id <", value, "fanDuelPlayerId");
            return (Criteria) this;
        }

        public Criteria andFanDuelPlayerIdLessThanOrEqualTo(Integer value) {
            addCriterion("fan_duel_player_id <=", value, "fanDuelPlayerId");
            return (Criteria) this;
        }

        public Criteria andFanDuelPlayerIdIn(List<Integer> values) {
            addCriterion("fan_duel_player_id in", values, "fanDuelPlayerId");
            return (Criteria) this;
        }

        public Criteria andFanDuelPlayerIdNotIn(List<Integer> values) {
            addCriterion("fan_duel_player_id not in", values, "fanDuelPlayerId");
            return (Criteria) this;
        }

        public Criteria andFanDuelPlayerIdBetween(Integer value1, Integer value2) {
            addCriterion("fan_duel_player_id between", value1, value2, "fanDuelPlayerId");
            return (Criteria) this;
        }

        public Criteria andFanDuelPlayerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("fan_duel_player_id not between", value1, value2, "fanDuelPlayerId");
            return (Criteria) this;
        }

        public Criteria andDraftKingsPlayerIdIsNull() {
            addCriterion("draft_kings_player_id is null");
            return (Criteria) this;
        }

        public Criteria andDraftKingsPlayerIdIsNotNull() {
            addCriterion("draft_kings_player_id is not null");
            return (Criteria) this;
        }

        public Criteria andDraftKingsPlayerIdEqualTo(Integer value) {
            addCriterion("draft_kings_player_id =", value, "draftKingsPlayerId");
            return (Criteria) this;
        }

        public Criteria andDraftKingsPlayerIdNotEqualTo(Integer value) {
            addCriterion("draft_kings_player_id <>", value, "draftKingsPlayerId");
            return (Criteria) this;
        }

        public Criteria andDraftKingsPlayerIdGreaterThan(Integer value) {
            addCriterion("draft_kings_player_id >", value, "draftKingsPlayerId");
            return (Criteria) this;
        }

        public Criteria andDraftKingsPlayerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("draft_kings_player_id >=", value, "draftKingsPlayerId");
            return (Criteria) this;
        }

        public Criteria andDraftKingsPlayerIdLessThan(Integer value) {
            addCriterion("draft_kings_player_id <", value, "draftKingsPlayerId");
            return (Criteria) this;
        }

        public Criteria andDraftKingsPlayerIdLessThanOrEqualTo(Integer value) {
            addCriterion("draft_kings_player_id <=", value, "draftKingsPlayerId");
            return (Criteria) this;
        }

        public Criteria andDraftKingsPlayerIdIn(List<Integer> values) {
            addCriterion("draft_kings_player_id in", values, "draftKingsPlayerId");
            return (Criteria) this;
        }

        public Criteria andDraftKingsPlayerIdNotIn(List<Integer> values) {
            addCriterion("draft_kings_player_id not in", values, "draftKingsPlayerId");
            return (Criteria) this;
        }

        public Criteria andDraftKingsPlayerIdBetween(Integer value1, Integer value2) {
            addCriterion("draft_kings_player_id between", value1, value2, "draftKingsPlayerId");
            return (Criteria) this;
        }

        public Criteria andDraftKingsPlayerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("draft_kings_player_id not between", value1, value2, "draftKingsPlayerId");
            return (Criteria) this;
        }

        public Criteria andYahooPplayerIdIsNull() {
            addCriterion("yahoo_Pplayer_id is null");
            return (Criteria) this;
        }

        public Criteria andYahooPplayerIdIsNotNull() {
            addCriterion("yahoo_Pplayer_id is not null");
            return (Criteria) this;
        }

        public Criteria andYahooPplayerIdEqualTo(Integer value) {
            addCriterion("yahoo_Pplayer_id =", value, "yahooPplayerId");
            return (Criteria) this;
        }

        public Criteria andYahooPplayerIdNotEqualTo(Integer value) {
            addCriterion("yahoo_Pplayer_id <>", value, "yahooPplayerId");
            return (Criteria) this;
        }

        public Criteria andYahooPplayerIdGreaterThan(Integer value) {
            addCriterion("yahoo_Pplayer_id >", value, "yahooPplayerId");
            return (Criteria) this;
        }

        public Criteria andYahooPplayerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("yahoo_Pplayer_id >=", value, "yahooPplayerId");
            return (Criteria) this;
        }

        public Criteria andYahooPplayerIdLessThan(Integer value) {
            addCriterion("yahoo_Pplayer_id <", value, "yahooPplayerId");
            return (Criteria) this;
        }

        public Criteria andYahooPplayerIdLessThanOrEqualTo(Integer value) {
            addCriterion("yahoo_Pplayer_id <=", value, "yahooPplayerId");
            return (Criteria) this;
        }

        public Criteria andYahooPplayerIdIn(List<Integer> values) {
            addCriterion("yahoo_Pplayer_id in", values, "yahooPplayerId");
            return (Criteria) this;
        }

        public Criteria andYahooPplayerIdNotIn(List<Integer> values) {
            addCriterion("yahoo_Pplayer_id not in", values, "yahooPplayerId");
            return (Criteria) this;
        }

        public Criteria andYahooPplayerIdBetween(Integer value1, Integer value2) {
            addCriterion("yahoo_Pplayer_id between", value1, value2, "yahooPplayerId");
            return (Criteria) this;
        }

        public Criteria andYahooPplayerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("yahoo_Pplayer_id not between", value1, value2, "yahooPplayerId");
            return (Criteria) this;
        }

        public Criteria andFanDuelNameIsNull() {
            addCriterion("fan_duel_name is null");
            return (Criteria) this;
        }

        public Criteria andFanDuelNameIsNotNull() {
            addCriterion("fan_duel_name is not null");
            return (Criteria) this;
        }

        public Criteria andFanDuelNameEqualTo(String value) {
            addCriterion("fan_duel_name =", value, "fanDuelName");
            return (Criteria) this;
        }

        public Criteria andFanDuelNameNotEqualTo(String value) {
            addCriterion("fan_duel_name <>", value, "fanDuelName");
            return (Criteria) this;
        }

        public Criteria andFanDuelNameGreaterThan(String value) {
            addCriterion("fan_duel_name >", value, "fanDuelName");
            return (Criteria) this;
        }

        public Criteria andFanDuelNameGreaterThanOrEqualTo(String value) {
            addCriterion("fan_duel_name >=", value, "fanDuelName");
            return (Criteria) this;
        }

        public Criteria andFanDuelNameLessThan(String value) {
            addCriterion("fan_duel_name <", value, "fanDuelName");
            return (Criteria) this;
        }

        public Criteria andFanDuelNameLessThanOrEqualTo(String value) {
            addCriterion("fan_duel_name <=", value, "fanDuelName");
            return (Criteria) this;
        }

        public Criteria andFanDuelNameLike(String value) {
            addCriterion("fan_duel_name like", value, "fanDuelName");
            return (Criteria) this;
        }

        public Criteria andFanDuelNameNotLike(String value) {
            addCriterion("fan_duel_name not like", value, "fanDuelName");
            return (Criteria) this;
        }

        public Criteria andFanDuelNameIn(List<String> values) {
            addCriterion("fan_duel_name in", values, "fanDuelName");
            return (Criteria) this;
        }

        public Criteria andFanDuelNameNotIn(List<String> values) {
            addCriterion("fan_duel_name not in", values, "fanDuelName");
            return (Criteria) this;
        }

        public Criteria andFanDuelNameBetween(String value1, String value2) {
            addCriterion("fan_duel_name between", value1, value2, "fanDuelName");
            return (Criteria) this;
        }

        public Criteria andFanDuelNameNotBetween(String value1, String value2) {
            addCriterion("fan_duel_name not between", value1, value2, "fanDuelName");
            return (Criteria) this;
        }

        public Criteria andDraftKingsNameIsNull() {
            addCriterion("draft_kings_name is null");
            return (Criteria) this;
        }

        public Criteria andDraftKingsNameIsNotNull() {
            addCriterion("draft_kings_name is not null");
            return (Criteria) this;
        }

        public Criteria andDraftKingsNameEqualTo(String value) {
            addCriterion("draft_kings_name =", value, "draftKingsName");
            return (Criteria) this;
        }

        public Criteria andDraftKingsNameNotEqualTo(String value) {
            addCriterion("draft_kings_name <>", value, "draftKingsName");
            return (Criteria) this;
        }

        public Criteria andDraftKingsNameGreaterThan(String value) {
            addCriterion("draft_kings_name >", value, "draftKingsName");
            return (Criteria) this;
        }

        public Criteria andDraftKingsNameGreaterThanOrEqualTo(String value) {
            addCriterion("draft_kings_name >=", value, "draftKingsName");
            return (Criteria) this;
        }

        public Criteria andDraftKingsNameLessThan(String value) {
            addCriterion("draft_kings_name <", value, "draftKingsName");
            return (Criteria) this;
        }

        public Criteria andDraftKingsNameLessThanOrEqualTo(String value) {
            addCriterion("draft_kings_name <=", value, "draftKingsName");
            return (Criteria) this;
        }

        public Criteria andDraftKingsNameLike(String value) {
            addCriterion("draft_kings_name like", value, "draftKingsName");
            return (Criteria) this;
        }

        public Criteria andDraftKingsNameNotLike(String value) {
            addCriterion("draft_kings_name not like", value, "draftKingsName");
            return (Criteria) this;
        }

        public Criteria andDraftKingsNameIn(List<String> values) {
            addCriterion("draft_kings_name in", values, "draftKingsName");
            return (Criteria) this;
        }

        public Criteria andDraftKingsNameNotIn(List<String> values) {
            addCriterion("draft_kings_name not in", values, "draftKingsName");
            return (Criteria) this;
        }

        public Criteria andDraftKingsNameBetween(String value1, String value2) {
            addCriterion("draft_kings_name between", value1, value2, "draftKingsName");
            return (Criteria) this;
        }

        public Criteria andDraftKingsNameNotBetween(String value1, String value2) {
            addCriterion("draft_kings_name not between", value1, value2, "draftKingsName");
            return (Criteria) this;
        }

        public Criteria andYahooNameIsNull() {
            addCriterion("yahoo_name is null");
            return (Criteria) this;
        }

        public Criteria andYahooNameIsNotNull() {
            addCriterion("yahoo_name is not null");
            return (Criteria) this;
        }

        public Criteria andYahooNameEqualTo(String value) {
            addCriterion("yahoo_name =", value, "yahooName");
            return (Criteria) this;
        }

        public Criteria andYahooNameNotEqualTo(String value) {
            addCriterion("yahoo_name <>", value, "yahooName");
            return (Criteria) this;
        }

        public Criteria andYahooNameGreaterThan(String value) {
            addCriterion("yahoo_name >", value, "yahooName");
            return (Criteria) this;
        }

        public Criteria andYahooNameGreaterThanOrEqualTo(String value) {
            addCriterion("yahoo_name >=", value, "yahooName");
            return (Criteria) this;
        }

        public Criteria andYahooNameLessThan(String value) {
            addCriterion("yahoo_name <", value, "yahooName");
            return (Criteria) this;
        }

        public Criteria andYahooNameLessThanOrEqualTo(String value) {
            addCriterion("yahoo_name <=", value, "yahooName");
            return (Criteria) this;
        }

        public Criteria andYahooNameLike(String value) {
            addCriterion("yahoo_name like", value, "yahooName");
            return (Criteria) this;
        }

        public Criteria andYahooNameNotLike(String value) {
            addCriterion("yahoo_name not like", value, "yahooName");
            return (Criteria) this;
        }

        public Criteria andYahooNameIn(List<String> values) {
            addCriterion("yahoo_name in", values, "yahooName");
            return (Criteria) this;
        }

        public Criteria andYahooNameNotIn(List<String> values) {
            addCriterion("yahoo_name not in", values, "yahooName");
            return (Criteria) this;
        }

        public Criteria andYahooNameBetween(String value1, String value2) {
            addCriterion("yahoo_name between", value1, value2, "yahooName");
            return (Criteria) this;
        }

        public Criteria andYahooNameNotBetween(String value1, String value2) {
            addCriterion("yahoo_name not between", value1, value2, "yahooName");
            return (Criteria) this;
        }

        public Criteria andDepthChartPositionIsNull() {
            addCriterion("depth_chart_position is null");
            return (Criteria) this;
        }

        public Criteria andDepthChartPositionIsNotNull() {
            addCriterion("depth_chart_position is not null");
            return (Criteria) this;
        }

        public Criteria andDepthChartPositionEqualTo(String value) {
            addCriterion("depth_chart_position =", value, "depthChartPosition");
            return (Criteria) this;
        }

        public Criteria andDepthChartPositionNotEqualTo(String value) {
            addCriterion("depth_chart_position <>", value, "depthChartPosition");
            return (Criteria) this;
        }

        public Criteria andDepthChartPositionGreaterThan(String value) {
            addCriterion("depth_chart_position >", value, "depthChartPosition");
            return (Criteria) this;
        }

        public Criteria andDepthChartPositionGreaterThanOrEqualTo(String value) {
            addCriterion("depth_chart_position >=", value, "depthChartPosition");
            return (Criteria) this;
        }

        public Criteria andDepthChartPositionLessThan(String value) {
            addCriterion("depth_chart_position <", value, "depthChartPosition");
            return (Criteria) this;
        }

        public Criteria andDepthChartPositionLessThanOrEqualTo(String value) {
            addCriterion("depth_chart_position <=", value, "depthChartPosition");
            return (Criteria) this;
        }

        public Criteria andDepthChartPositionLike(String value) {
            addCriterion("depth_chart_position like", value, "depthChartPosition");
            return (Criteria) this;
        }

        public Criteria andDepthChartPositionNotLike(String value) {
            addCriterion("depth_chart_position not like", value, "depthChartPosition");
            return (Criteria) this;
        }

        public Criteria andDepthChartPositionIn(List<String> values) {
            addCriterion("depth_chart_position in", values, "depthChartPosition");
            return (Criteria) this;
        }

        public Criteria andDepthChartPositionNotIn(List<String> values) {
            addCriterion("depth_chart_position not in", values, "depthChartPosition");
            return (Criteria) this;
        }

        public Criteria andDepthChartPositionBetween(String value1, String value2) {
            addCriterion("depth_chart_position between", value1, value2, "depthChartPosition");
            return (Criteria) this;
        }

        public Criteria andDepthChartPositionNotBetween(String value1, String value2) {
            addCriterion("depth_chart_position not between", value1, value2, "depthChartPosition");
            return (Criteria) this;
        }

        public Criteria andDepthChartOrderIsNull() {
            addCriterion("depth_chart_order is null");
            return (Criteria) this;
        }

        public Criteria andDepthChartOrderIsNotNull() {
            addCriterion("depth_chart_order is not null");
            return (Criteria) this;
        }

        public Criteria andDepthChartOrderEqualTo(String value) {
            addCriterion("depth_chart_order =", value, "depthChartOrder");
            return (Criteria) this;
        }

        public Criteria andDepthChartOrderNotEqualTo(String value) {
            addCriterion("depth_chart_order <>", value, "depthChartOrder");
            return (Criteria) this;
        }

        public Criteria andDepthChartOrderGreaterThan(String value) {
            addCriterion("depth_chart_order >", value, "depthChartOrder");
            return (Criteria) this;
        }

        public Criteria andDepthChartOrderGreaterThanOrEqualTo(String value) {
            addCriterion("depth_chart_order >=", value, "depthChartOrder");
            return (Criteria) this;
        }

        public Criteria andDepthChartOrderLessThan(String value) {
            addCriterion("depth_chart_order <", value, "depthChartOrder");
            return (Criteria) this;
        }

        public Criteria andDepthChartOrderLessThanOrEqualTo(String value) {
            addCriterion("depth_chart_order <=", value, "depthChartOrder");
            return (Criteria) this;
        }

        public Criteria andDepthChartOrderLike(String value) {
            addCriterion("depth_chart_order like", value, "depthChartOrder");
            return (Criteria) this;
        }

        public Criteria andDepthChartOrderNotLike(String value) {
            addCriterion("depth_chart_order not like", value, "depthChartOrder");
            return (Criteria) this;
        }

        public Criteria andDepthChartOrderIn(List<String> values) {
            addCriterion("depth_chart_order in", values, "depthChartOrder");
            return (Criteria) this;
        }

        public Criteria andDepthChartOrderNotIn(List<String> values) {
            addCriterion("depth_chart_order not in", values, "depthChartOrder");
            return (Criteria) this;
        }

        public Criteria andDepthChartOrderBetween(String value1, String value2) {
            addCriterion("depth_chart_order between", value1, value2, "depthChartOrder");
            return (Criteria) this;
        }

        public Criteria andDepthChartOrderNotBetween(String value1, String value2) {
            addCriterion("depth_chart_order not between", value1, value2, "depthChartOrder");
            return (Criteria) this;
        }

        public Criteria andGlobalTeamIdIsNull() {
            addCriterion("global_team_id is null");
            return (Criteria) this;
        }

        public Criteria andGlobalTeamIdIsNotNull() {
            addCriterion("global_team_id is not null");
            return (Criteria) this;
        }

        public Criteria andGlobalTeamIdEqualTo(Integer value) {
            addCriterion("global_team_id =", value, "globalTeamId");
            return (Criteria) this;
        }

        public Criteria andGlobalTeamIdNotEqualTo(Integer value) {
            addCriterion("global_team_id <>", value, "globalTeamId");
            return (Criteria) this;
        }

        public Criteria andGlobalTeamIdGreaterThan(Integer value) {
            addCriterion("global_team_id >", value, "globalTeamId");
            return (Criteria) this;
        }

        public Criteria andGlobalTeamIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("global_team_id >=", value, "globalTeamId");
            return (Criteria) this;
        }

        public Criteria andGlobalTeamIdLessThan(Integer value) {
            addCriterion("global_team_id <", value, "globalTeamId");
            return (Criteria) this;
        }

        public Criteria andGlobalTeamIdLessThanOrEqualTo(Integer value) {
            addCriterion("global_team_id <=", value, "globalTeamId");
            return (Criteria) this;
        }

        public Criteria andGlobalTeamIdIn(List<Integer> values) {
            addCriterion("global_team_id in", values, "globalTeamId");
            return (Criteria) this;
        }

        public Criteria andGlobalTeamIdNotIn(List<Integer> values) {
            addCriterion("global_team_id not in", values, "globalTeamId");
            return (Criteria) this;
        }

        public Criteria andGlobalTeamIdBetween(Integer value1, Integer value2) {
            addCriterion("global_team_id between", value1, value2, "globalTeamId");
            return (Criteria) this;
        }

        public Criteria andGlobalTeamIdNotBetween(Integer value1, Integer value2) {
            addCriterion("global_team_id not between", value1, value2, "globalTeamId");
            return (Criteria) this;
        }

        public Criteria andFantasyDraftNameIsNull() {
            addCriterion("fantasy_draft_name is null");
            return (Criteria) this;
        }

        public Criteria andFantasyDraftNameIsNotNull() {
            addCriterion("fantasy_draft_name is not null");
            return (Criteria) this;
        }

        public Criteria andFantasyDraftNameEqualTo(String value) {
            addCriterion("fantasy_draft_name =", value, "fantasyDraftName");
            return (Criteria) this;
        }

        public Criteria andFantasyDraftNameNotEqualTo(String value) {
            addCriterion("fantasy_draft_name <>", value, "fantasyDraftName");
            return (Criteria) this;
        }

        public Criteria andFantasyDraftNameGreaterThan(String value) {
            addCriterion("fantasy_draft_name >", value, "fantasyDraftName");
            return (Criteria) this;
        }

        public Criteria andFantasyDraftNameGreaterThanOrEqualTo(String value) {
            addCriterion("fantasy_draft_name >=", value, "fantasyDraftName");
            return (Criteria) this;
        }

        public Criteria andFantasyDraftNameLessThan(String value) {
            addCriterion("fantasy_draft_name <", value, "fantasyDraftName");
            return (Criteria) this;
        }

        public Criteria andFantasyDraftNameLessThanOrEqualTo(String value) {
            addCriterion("fantasy_draft_name <=", value, "fantasyDraftName");
            return (Criteria) this;
        }

        public Criteria andFantasyDraftNameLike(String value) {
            addCriterion("fantasy_draft_name like", value, "fantasyDraftName");
            return (Criteria) this;
        }

        public Criteria andFantasyDraftNameNotLike(String value) {
            addCriterion("fantasy_draft_name not like", value, "fantasyDraftName");
            return (Criteria) this;
        }

        public Criteria andFantasyDraftNameIn(List<String> values) {
            addCriterion("fantasy_draft_name in", values, "fantasyDraftName");
            return (Criteria) this;
        }

        public Criteria andFantasyDraftNameNotIn(List<String> values) {
            addCriterion("fantasy_draft_name not in", values, "fantasyDraftName");
            return (Criteria) this;
        }

        public Criteria andFantasyDraftNameBetween(String value1, String value2) {
            addCriterion("fantasy_draft_name between", value1, value2, "fantasyDraftName");
            return (Criteria) this;
        }

        public Criteria andFantasyDraftNameNotBetween(String value1, String value2) {
            addCriterion("fantasy_draft_name not between", value1, value2, "fantasyDraftName");
            return (Criteria) this;
        }

        public Criteria andFantasyDraftPlayerIdIsNull() {
            addCriterion("fantasy_draft_player_id is null");
            return (Criteria) this;
        }

        public Criteria andFantasyDraftPlayerIdIsNotNull() {
            addCriterion("fantasy_draft_player_id is not null");
            return (Criteria) this;
        }

        public Criteria andFantasyDraftPlayerIdEqualTo(Integer value) {
            addCriterion("fantasy_draft_player_id =", value, "fantasyDraftPlayerId");
            return (Criteria) this;
        }

        public Criteria andFantasyDraftPlayerIdNotEqualTo(Integer value) {
            addCriterion("fantasy_draft_player_id <>", value, "fantasyDraftPlayerId");
            return (Criteria) this;
        }

        public Criteria andFantasyDraftPlayerIdGreaterThan(Integer value) {
            addCriterion("fantasy_draft_player_id >", value, "fantasyDraftPlayerId");
            return (Criteria) this;
        }

        public Criteria andFantasyDraftPlayerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("fantasy_draft_player_id >=", value, "fantasyDraftPlayerId");
            return (Criteria) this;
        }

        public Criteria andFantasyDraftPlayerIdLessThan(Integer value) {
            addCriterion("fantasy_draft_player_id <", value, "fantasyDraftPlayerId");
            return (Criteria) this;
        }

        public Criteria andFantasyDraftPlayerIdLessThanOrEqualTo(Integer value) {
            addCriterion("fantasy_draft_player_id <=", value, "fantasyDraftPlayerId");
            return (Criteria) this;
        }

        public Criteria andFantasyDraftPlayerIdIn(List<Integer> values) {
            addCriterion("fantasy_draft_player_id in", values, "fantasyDraftPlayerId");
            return (Criteria) this;
        }

        public Criteria andFantasyDraftPlayerIdNotIn(List<Integer> values) {
            addCriterion("fantasy_draft_player_id not in", values, "fantasyDraftPlayerId");
            return (Criteria) this;
        }

        public Criteria andFantasyDraftPlayerIdBetween(Integer value1, Integer value2) {
            addCriterion("fantasy_draft_player_id between", value1, value2, "fantasyDraftPlayerId");
            return (Criteria) this;
        }

        public Criteria andFantasyDraftPlayerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("fantasy_draft_player_id not between", value1, value2, "fantasyDraftPlayerId");
            return (Criteria) this;
        }

        public Criteria andUsaTodayPlayerIdIsNull() {
            addCriterion("usa_today_player_id is null");
            return (Criteria) this;
        }

        public Criteria andUsaTodayPlayerIdIsNotNull() {
            addCriterion("usa_today_player_id is not null");
            return (Criteria) this;
        }

        public Criteria andUsaTodayPlayerIdEqualTo(Integer value) {
            addCriterion("usa_today_player_id =", value, "usaTodayPlayerId");
            return (Criteria) this;
        }

        public Criteria andUsaTodayPlayerIdNotEqualTo(Integer value) {
            addCriterion("usa_today_player_id <>", value, "usaTodayPlayerId");
            return (Criteria) this;
        }

        public Criteria andUsaTodayPlayerIdGreaterThan(Integer value) {
            addCriterion("usa_today_player_id >", value, "usaTodayPlayerId");
            return (Criteria) this;
        }

        public Criteria andUsaTodayPlayerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("usa_today_player_id >=", value, "usaTodayPlayerId");
            return (Criteria) this;
        }

        public Criteria andUsaTodayPlayerIdLessThan(Integer value) {
            addCriterion("usa_today_player_id <", value, "usaTodayPlayerId");
            return (Criteria) this;
        }

        public Criteria andUsaTodayPlayerIdLessThanOrEqualTo(Integer value) {
            addCriterion("usa_today_player_id <=", value, "usaTodayPlayerId");
            return (Criteria) this;
        }

        public Criteria andUsaTodayPlayerIdIn(List<Integer> values) {
            addCriterion("usa_today_player_id in", values, "usaTodayPlayerId");
            return (Criteria) this;
        }

        public Criteria andUsaTodayPlayerIdNotIn(List<Integer> values) {
            addCriterion("usa_today_player_id not in", values, "usaTodayPlayerId");
            return (Criteria) this;
        }

        public Criteria andUsaTodayPlayerIdBetween(Integer value1, Integer value2) {
            addCriterion("usa_today_player_id between", value1, value2, "usaTodayPlayerId");
            return (Criteria) this;
        }

        public Criteria andUsaTodayPlayerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("usa_today_player_id not between", value1, value2, "usaTodayPlayerId");
            return (Criteria) this;
        }

        public Criteria andUsaTodayHeadshotUrlIsNull() {
            addCriterion("usa_today_headshot_url is null");
            return (Criteria) this;
        }

        public Criteria andUsaTodayHeadshotUrlIsNotNull() {
            addCriterion("usa_today_headshot_url is not null");
            return (Criteria) this;
        }

        public Criteria andUsaTodayHeadshotUrlEqualTo(String value) {
            addCriterion("usa_today_headshot_url =", value, "usaTodayHeadshotUrl");
            return (Criteria) this;
        }

        public Criteria andUsaTodayHeadshotUrlNotEqualTo(String value) {
            addCriterion("usa_today_headshot_url <>", value, "usaTodayHeadshotUrl");
            return (Criteria) this;
        }

        public Criteria andUsaTodayHeadshotUrlGreaterThan(String value) {
            addCriterion("usa_today_headshot_url >", value, "usaTodayHeadshotUrl");
            return (Criteria) this;
        }

        public Criteria andUsaTodayHeadshotUrlGreaterThanOrEqualTo(String value) {
            addCriterion("usa_today_headshot_url >=", value, "usaTodayHeadshotUrl");
            return (Criteria) this;
        }

        public Criteria andUsaTodayHeadshotUrlLessThan(String value) {
            addCriterion("usa_today_headshot_url <", value, "usaTodayHeadshotUrl");
            return (Criteria) this;
        }

        public Criteria andUsaTodayHeadshotUrlLessThanOrEqualTo(String value) {
            addCriterion("usa_today_headshot_url <=", value, "usaTodayHeadshotUrl");
            return (Criteria) this;
        }

        public Criteria andUsaTodayHeadshotUrlLike(String value) {
            addCriterion("usa_today_headshot_url like", value, "usaTodayHeadshotUrl");
            return (Criteria) this;
        }

        public Criteria andUsaTodayHeadshotUrlNotLike(String value) {
            addCriterion("usa_today_headshot_url not like", value, "usaTodayHeadshotUrl");
            return (Criteria) this;
        }

        public Criteria andUsaTodayHeadshotUrlIn(List<String> values) {
            addCriterion("usa_today_headshot_url in", values, "usaTodayHeadshotUrl");
            return (Criteria) this;
        }

        public Criteria andUsaTodayHeadshotUrlNotIn(List<String> values) {
            addCriterion("usa_today_headshot_url not in", values, "usaTodayHeadshotUrl");
            return (Criteria) this;
        }

        public Criteria andUsaTodayHeadshotUrlBetween(String value1, String value2) {
            addCriterion("usa_today_headshot_url between", value1, value2, "usaTodayHeadshotUrl");
            return (Criteria) this;
        }

        public Criteria andUsaTodayHeadshotUrlNotBetween(String value1, String value2) {
            addCriterion("usa_today_headshot_url not between", value1, value2, "usaTodayHeadshotUrl");
            return (Criteria) this;
        }

        public Criteria andUsaTodayHeadshotNoBackgroundUrlIsNull() {
            addCriterion("usa_today_headshot_no_background_url is null");
            return (Criteria) this;
        }

        public Criteria andUsaTodayHeadshotNoBackgroundUrlIsNotNull() {
            addCriterion("usa_today_headshot_no_background_url is not null");
            return (Criteria) this;
        }

        public Criteria andUsaTodayHeadshotNoBackgroundUrlEqualTo(String value) {
            addCriterion("usa_today_headshot_no_background_url =", value, "usaTodayHeadshotNoBackgroundUrl");
            return (Criteria) this;
        }

        public Criteria andUsaTodayHeadshotNoBackgroundUrlNotEqualTo(String value) {
            addCriterion("usa_today_headshot_no_background_url <>", value, "usaTodayHeadshotNoBackgroundUrl");
            return (Criteria) this;
        }

        public Criteria andUsaTodayHeadshotNoBackgroundUrlGreaterThan(String value) {
            addCriterion("usa_today_headshot_no_background_url >", value, "usaTodayHeadshotNoBackgroundUrl");
            return (Criteria) this;
        }

        public Criteria andUsaTodayHeadshotNoBackgroundUrlGreaterThanOrEqualTo(String value) {
            addCriterion("usa_today_headshot_no_background_url >=", value, "usaTodayHeadshotNoBackgroundUrl");
            return (Criteria) this;
        }

        public Criteria andUsaTodayHeadshotNoBackgroundUrlLessThan(String value) {
            addCriterion("usa_today_headshot_no_background_url <", value, "usaTodayHeadshotNoBackgroundUrl");
            return (Criteria) this;
        }

        public Criteria andUsaTodayHeadshotNoBackgroundUrlLessThanOrEqualTo(String value) {
            addCriterion("usa_today_headshot_no_background_url <=", value, "usaTodayHeadshotNoBackgroundUrl");
            return (Criteria) this;
        }

        public Criteria andUsaTodayHeadshotNoBackgroundUrlLike(String value) {
            addCriterion("usa_today_headshot_no_background_url like", value, "usaTodayHeadshotNoBackgroundUrl");
            return (Criteria) this;
        }

        public Criteria andUsaTodayHeadshotNoBackgroundUrlNotLike(String value) {
            addCriterion("usa_today_headshot_no_background_url not like", value, "usaTodayHeadshotNoBackgroundUrl");
            return (Criteria) this;
        }

        public Criteria andUsaTodayHeadshotNoBackgroundUrlIn(List<String> values) {
            addCriterion("usa_today_headshot_no_background_url in", values, "usaTodayHeadshotNoBackgroundUrl");
            return (Criteria) this;
        }

        public Criteria andUsaTodayHeadshotNoBackgroundUrlNotIn(List<String> values) {
            addCriterion("usa_today_headshot_no_background_url not in", values, "usaTodayHeadshotNoBackgroundUrl");
            return (Criteria) this;
        }

        public Criteria andUsaTodayHeadshotNoBackgroundUrlBetween(String value1, String value2) {
            addCriterion("usa_today_headshot_no_background_url between", value1, value2, "usaTodayHeadshotNoBackgroundUrl");
            return (Criteria) this;
        }

        public Criteria andUsaTodayHeadshotNoBackgroundUrlNotBetween(String value1, String value2) {
            addCriterion("usa_today_headshot_no_background_url not between", value1, value2, "usaTodayHeadshotNoBackgroundUrl");
            return (Criteria) this;
        }

        public Criteria andUsaTodayHeadshotUpdatedIsNull() {
            addCriterion("usa_today_headshot_updated is null");
            return (Criteria) this;
        }

        public Criteria andUsaTodayHeadshotUpdatedIsNotNull() {
            addCriterion("usa_today_headshot_updated is not null");
            return (Criteria) this;
        }

        public Criteria andUsaTodayHeadshotUpdatedEqualTo(Date value) {
            addCriterion("usa_today_headshot_updated =", value, "usaTodayHeadshotUpdated");
            return (Criteria) this;
        }

        public Criteria andUsaTodayHeadshotUpdatedNotEqualTo(Date value) {
            addCriterion("usa_today_headshot_updated <>", value, "usaTodayHeadshotUpdated");
            return (Criteria) this;
        }

        public Criteria andUsaTodayHeadshotUpdatedGreaterThan(Date value) {
            addCriterion("usa_today_headshot_updated >", value, "usaTodayHeadshotUpdated");
            return (Criteria) this;
        }

        public Criteria andUsaTodayHeadshotUpdatedGreaterThanOrEqualTo(Date value) {
            addCriterion("usa_today_headshot_updated >=", value, "usaTodayHeadshotUpdated");
            return (Criteria) this;
        }

        public Criteria andUsaTodayHeadshotUpdatedLessThan(Date value) {
            addCriterion("usa_today_headshot_updated <", value, "usaTodayHeadshotUpdated");
            return (Criteria) this;
        }

        public Criteria andUsaTodayHeadshotUpdatedLessThanOrEqualTo(Date value) {
            addCriterion("usa_today_headshot_updated <=", value, "usaTodayHeadshotUpdated");
            return (Criteria) this;
        }

        public Criteria andUsaTodayHeadshotUpdatedIn(List<Date> values) {
            addCriterion("usa_today_headshot_updated in", values, "usaTodayHeadshotUpdated");
            return (Criteria) this;
        }

        public Criteria andUsaTodayHeadshotUpdatedNotIn(List<Date> values) {
            addCriterion("usa_today_headshot_updated not in", values, "usaTodayHeadshotUpdated");
            return (Criteria) this;
        }

        public Criteria andUsaTodayHeadshotUpdatedBetween(Date value1, Date value2) {
            addCriterion("usa_today_headshot_updated between", value1, value2, "usaTodayHeadshotUpdated");
            return (Criteria) this;
        }

        public Criteria andUsaTodayHeadshotUpdatedNotBetween(Date value1, Date value2) {
            addCriterion("usa_today_headshot_updated not between", value1, value2, "usaTodayHeadshotUpdated");
            return (Criteria) this;
        }

        public Criteria andUsaTodayHeadshotNoBackgroundUpdatedIsNull() {
            addCriterion("usa_today_headshot_no_background_updated is null");
            return (Criteria) this;
        }

        public Criteria andUsaTodayHeadshotNoBackgroundUpdatedIsNotNull() {
            addCriterion("usa_today_headshot_no_background_updated is not null");
            return (Criteria) this;
        }

        public Criteria andUsaTodayHeadshotNoBackgroundUpdatedEqualTo(Date value) {
            addCriterion("usa_today_headshot_no_background_updated =", value, "usaTodayHeadshotNoBackgroundUpdated");
            return (Criteria) this;
        }

        public Criteria andUsaTodayHeadshotNoBackgroundUpdatedNotEqualTo(Date value) {
            addCriterion("usa_today_headshot_no_background_updated <>", value, "usaTodayHeadshotNoBackgroundUpdated");
            return (Criteria) this;
        }

        public Criteria andUsaTodayHeadshotNoBackgroundUpdatedGreaterThan(Date value) {
            addCriterion("usa_today_headshot_no_background_updated >", value, "usaTodayHeadshotNoBackgroundUpdated");
            return (Criteria) this;
        }

        public Criteria andUsaTodayHeadshotNoBackgroundUpdatedGreaterThanOrEqualTo(Date value) {
            addCriterion("usa_today_headshot_no_background_updated >=", value, "usaTodayHeadshotNoBackgroundUpdated");
            return (Criteria) this;
        }

        public Criteria andUsaTodayHeadshotNoBackgroundUpdatedLessThan(Date value) {
            addCriterion("usa_today_headshot_no_background_updated <", value, "usaTodayHeadshotNoBackgroundUpdated");
            return (Criteria) this;
        }

        public Criteria andUsaTodayHeadshotNoBackgroundUpdatedLessThanOrEqualTo(Date value) {
            addCriterion("usa_today_headshot_no_background_updated <=", value, "usaTodayHeadshotNoBackgroundUpdated");
            return (Criteria) this;
        }

        public Criteria andUsaTodayHeadshotNoBackgroundUpdatedIn(List<Date> values) {
            addCriterion("usa_today_headshot_no_background_updated in", values, "usaTodayHeadshotNoBackgroundUpdated");
            return (Criteria) this;
        }

        public Criteria andUsaTodayHeadshotNoBackgroundUpdatedNotIn(List<Date> values) {
            addCriterion("usa_today_headshot_no_background_updated not in", values, "usaTodayHeadshotNoBackgroundUpdated");
            return (Criteria) this;
        }

        public Criteria andUsaTodayHeadshotNoBackgroundUpdatedBetween(Date value1, Date value2) {
            addCriterion("usa_today_headshot_no_background_updated between", value1, value2, "usaTodayHeadshotNoBackgroundUpdated");
            return (Criteria) this;
        }

        public Criteria andUsaTodayHeadshotNoBackgroundUpdatedNotBetween(Date value1, Date value2) {
            addCriterion("usa_today_headshot_no_background_updated not between", value1, value2, "usaTodayHeadshotNoBackgroundUpdated");
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