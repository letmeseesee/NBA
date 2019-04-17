package com.nba.model;

import java.util.ArrayList;
import java.util.List;

public class TeamsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    private Boolean forUpdate;

    public TeamsExample() {
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

        public Criteria andKeyIsNull() {
            addCriterion("`key` is null");
            return (Criteria) this;
        }

        public Criteria andKeyIsNotNull() {
            addCriterion("`key` is not null");
            return (Criteria) this;
        }

        public Criteria andKeyEqualTo(String value) {
            addCriterion("`key` =", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyNotEqualTo(String value) {
            addCriterion("`key` <>", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyGreaterThan(String value) {
            addCriterion("`key` >", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyGreaterThanOrEqualTo(String value) {
            addCriterion("`key` >=", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyLessThan(String value) {
            addCriterion("`key` <", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyLessThanOrEqualTo(String value) {
            addCriterion("`key` <=", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyLike(String value) {
            addCriterion("`key` like", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyNotLike(String value) {
            addCriterion("`key` not like", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyIn(List<String> values) {
            addCriterion("`key` in", values, "key");
            return (Criteria) this;
        }

        public Criteria andKeyNotIn(List<String> values) {
            addCriterion("`key` not in", values, "key");
            return (Criteria) this;
        }

        public Criteria andKeyBetween(String value1, String value2) {
            addCriterion("`key` between", value1, value2, "key");
            return (Criteria) this;
        }

        public Criteria andKeyNotBetween(String value1, String value2) {
            addCriterion("`key` not between", value1, value2, "key");
            return (Criteria) this;
        }

        public Criteria andActiveIsNull() {
            addCriterion("active is null");
            return (Criteria) this;
        }

        public Criteria andActiveIsNotNull() {
            addCriterion("active is not null");
            return (Criteria) this;
        }

        public Criteria andActiveEqualTo(Byte value) {
            addCriterion("active =", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotEqualTo(Byte value) {
            addCriterion("active <>", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveGreaterThan(Byte value) {
            addCriterion("active >", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveGreaterThanOrEqualTo(Byte value) {
            addCriterion("active >=", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveLessThan(Byte value) {
            addCriterion("active <", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveLessThanOrEqualTo(Byte value) {
            addCriterion("active <=", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveIn(List<Byte> values) {
            addCriterion("active in", values, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotIn(List<Byte> values) {
            addCriterion("active not in", values, "active");
            return (Criteria) this;
        }

        public Criteria andActiveBetween(Byte value1, Byte value2) {
            addCriterion("active between", value1, value2, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotBetween(Byte value1, Byte value2) {
            addCriterion("active not between", value1, value2, "active");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("`name` is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("`name` is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("`name` =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("`name` <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("`name` >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("`name` >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("`name` <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("`name` <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("`name` like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("`name` not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("`name` in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("`name` not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("`name` between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("`name` not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andLeagueIdIsNull() {
            addCriterion("league_id is null");
            return (Criteria) this;
        }

        public Criteria andLeagueIdIsNotNull() {
            addCriterion("league_id is not null");
            return (Criteria) this;
        }

        public Criteria andLeagueIdEqualTo(Integer value) {
            addCriterion("league_id =", value, "leagueId");
            return (Criteria) this;
        }

        public Criteria andLeagueIdNotEqualTo(Integer value) {
            addCriterion("league_id <>", value, "leagueId");
            return (Criteria) this;
        }

        public Criteria andLeagueIdGreaterThan(Integer value) {
            addCriterion("league_id >", value, "leagueId");
            return (Criteria) this;
        }

        public Criteria andLeagueIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("league_id >=", value, "leagueId");
            return (Criteria) this;
        }

        public Criteria andLeagueIdLessThan(Integer value) {
            addCriterion("league_id <", value, "leagueId");
            return (Criteria) this;
        }

        public Criteria andLeagueIdLessThanOrEqualTo(Integer value) {
            addCriterion("league_id <=", value, "leagueId");
            return (Criteria) this;
        }

        public Criteria andLeagueIdIn(List<Integer> values) {
            addCriterion("league_id in", values, "leagueId");
            return (Criteria) this;
        }

        public Criteria andLeagueIdNotIn(List<Integer> values) {
            addCriterion("league_id not in", values, "leagueId");
            return (Criteria) this;
        }

        public Criteria andLeagueIdBetween(Integer value1, Integer value2) {
            addCriterion("league_id between", value1, value2, "leagueId");
            return (Criteria) this;
        }

        public Criteria andLeagueIdNotBetween(Integer value1, Integer value2) {
            addCriterion("league_id not between", value1, value2, "leagueId");
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

        public Criteria andConferenceIsNull() {
            addCriterion("conference is null");
            return (Criteria) this;
        }

        public Criteria andConferenceIsNotNull() {
            addCriterion("conference is not null");
            return (Criteria) this;
        }

        public Criteria andConferenceEqualTo(String value) {
            addCriterion("conference =", value, "conference");
            return (Criteria) this;
        }

        public Criteria andConferenceNotEqualTo(String value) {
            addCriterion("conference <>", value, "conference");
            return (Criteria) this;
        }

        public Criteria andConferenceGreaterThan(String value) {
            addCriterion("conference >", value, "conference");
            return (Criteria) this;
        }

        public Criteria andConferenceGreaterThanOrEqualTo(String value) {
            addCriterion("conference >=", value, "conference");
            return (Criteria) this;
        }

        public Criteria andConferenceLessThan(String value) {
            addCriterion("conference <", value, "conference");
            return (Criteria) this;
        }

        public Criteria andConferenceLessThanOrEqualTo(String value) {
            addCriterion("conference <=", value, "conference");
            return (Criteria) this;
        }

        public Criteria andConferenceLike(String value) {
            addCriterion("conference like", value, "conference");
            return (Criteria) this;
        }

        public Criteria andConferenceNotLike(String value) {
            addCriterion("conference not like", value, "conference");
            return (Criteria) this;
        }

        public Criteria andConferenceIn(List<String> values) {
            addCriterion("conference in", values, "conference");
            return (Criteria) this;
        }

        public Criteria andConferenceNotIn(List<String> values) {
            addCriterion("conference not in", values, "conference");
            return (Criteria) this;
        }

        public Criteria andConferenceBetween(String value1, String value2) {
            addCriterion("conference between", value1, value2, "conference");
            return (Criteria) this;
        }

        public Criteria andConferenceNotBetween(String value1, String value2) {
            addCriterion("conference not between", value1, value2, "conference");
            return (Criteria) this;
        }

        public Criteria andDivisionIsNull() {
            addCriterion("division is null");
            return (Criteria) this;
        }

        public Criteria andDivisionIsNotNull() {
            addCriterion("division is not null");
            return (Criteria) this;
        }

        public Criteria andDivisionEqualTo(String value) {
            addCriterion("division =", value, "division");
            return (Criteria) this;
        }

        public Criteria andDivisionNotEqualTo(String value) {
            addCriterion("division <>", value, "division");
            return (Criteria) this;
        }

        public Criteria andDivisionGreaterThan(String value) {
            addCriterion("division >", value, "division");
            return (Criteria) this;
        }

        public Criteria andDivisionGreaterThanOrEqualTo(String value) {
            addCriterion("division >=", value, "division");
            return (Criteria) this;
        }

        public Criteria andDivisionLessThan(String value) {
            addCriterion("division <", value, "division");
            return (Criteria) this;
        }

        public Criteria andDivisionLessThanOrEqualTo(String value) {
            addCriterion("division <=", value, "division");
            return (Criteria) this;
        }

        public Criteria andDivisionLike(String value) {
            addCriterion("division like", value, "division");
            return (Criteria) this;
        }

        public Criteria andDivisionNotLike(String value) {
            addCriterion("division not like", value, "division");
            return (Criteria) this;
        }

        public Criteria andDivisionIn(List<String> values) {
            addCriterion("division in", values, "division");
            return (Criteria) this;
        }

        public Criteria andDivisionNotIn(List<String> values) {
            addCriterion("division not in", values, "division");
            return (Criteria) this;
        }

        public Criteria andDivisionBetween(String value1, String value2) {
            addCriterion("division between", value1, value2, "division");
            return (Criteria) this;
        }

        public Criteria andDivisionNotBetween(String value1, String value2) {
            addCriterion("division not between", value1, value2, "division");
            return (Criteria) this;
        }

        public Criteria andPrimaryColorIsNull() {
            addCriterion("primary_color is null");
            return (Criteria) this;
        }

        public Criteria andPrimaryColorIsNotNull() {
            addCriterion("primary_color is not null");
            return (Criteria) this;
        }

        public Criteria andPrimaryColorEqualTo(String value) {
            addCriterion("primary_color =", value, "primaryColor");
            return (Criteria) this;
        }

        public Criteria andPrimaryColorNotEqualTo(String value) {
            addCriterion("primary_color <>", value, "primaryColor");
            return (Criteria) this;
        }

        public Criteria andPrimaryColorGreaterThan(String value) {
            addCriterion("primary_color >", value, "primaryColor");
            return (Criteria) this;
        }

        public Criteria andPrimaryColorGreaterThanOrEqualTo(String value) {
            addCriterion("primary_color >=", value, "primaryColor");
            return (Criteria) this;
        }

        public Criteria andPrimaryColorLessThan(String value) {
            addCriterion("primary_color <", value, "primaryColor");
            return (Criteria) this;
        }

        public Criteria andPrimaryColorLessThanOrEqualTo(String value) {
            addCriterion("primary_color <=", value, "primaryColor");
            return (Criteria) this;
        }

        public Criteria andPrimaryColorLike(String value) {
            addCriterion("primary_color like", value, "primaryColor");
            return (Criteria) this;
        }

        public Criteria andPrimaryColorNotLike(String value) {
            addCriterion("primary_color not like", value, "primaryColor");
            return (Criteria) this;
        }

        public Criteria andPrimaryColorIn(List<String> values) {
            addCriterion("primary_color in", values, "primaryColor");
            return (Criteria) this;
        }

        public Criteria andPrimaryColorNotIn(List<String> values) {
            addCriterion("primary_color not in", values, "primaryColor");
            return (Criteria) this;
        }

        public Criteria andPrimaryColorBetween(String value1, String value2) {
            addCriterion("primary_color between", value1, value2, "primaryColor");
            return (Criteria) this;
        }

        public Criteria andPrimaryColorNotBetween(String value1, String value2) {
            addCriterion("primary_color not between", value1, value2, "primaryColor");
            return (Criteria) this;
        }

        public Criteria andSecondaryColorIsNull() {
            addCriterion("secondary_color is null");
            return (Criteria) this;
        }

        public Criteria andSecondaryColorIsNotNull() {
            addCriterion("secondary_color is not null");
            return (Criteria) this;
        }

        public Criteria andSecondaryColorEqualTo(String value) {
            addCriterion("secondary_color =", value, "secondaryColor");
            return (Criteria) this;
        }

        public Criteria andSecondaryColorNotEqualTo(String value) {
            addCriterion("secondary_color <>", value, "secondaryColor");
            return (Criteria) this;
        }

        public Criteria andSecondaryColorGreaterThan(String value) {
            addCriterion("secondary_color >", value, "secondaryColor");
            return (Criteria) this;
        }

        public Criteria andSecondaryColorGreaterThanOrEqualTo(String value) {
            addCriterion("secondary_color >=", value, "secondaryColor");
            return (Criteria) this;
        }

        public Criteria andSecondaryColorLessThan(String value) {
            addCriterion("secondary_color <", value, "secondaryColor");
            return (Criteria) this;
        }

        public Criteria andSecondaryColorLessThanOrEqualTo(String value) {
            addCriterion("secondary_color <=", value, "secondaryColor");
            return (Criteria) this;
        }

        public Criteria andSecondaryColorLike(String value) {
            addCriterion("secondary_color like", value, "secondaryColor");
            return (Criteria) this;
        }

        public Criteria andSecondaryColorNotLike(String value) {
            addCriterion("secondary_color not like", value, "secondaryColor");
            return (Criteria) this;
        }

        public Criteria andSecondaryColorIn(List<String> values) {
            addCriterion("secondary_color in", values, "secondaryColor");
            return (Criteria) this;
        }

        public Criteria andSecondaryColorNotIn(List<String> values) {
            addCriterion("secondary_color not in", values, "secondaryColor");
            return (Criteria) this;
        }

        public Criteria andSecondaryColorBetween(String value1, String value2) {
            addCriterion("secondary_color between", value1, value2, "secondaryColor");
            return (Criteria) this;
        }

        public Criteria andSecondaryColorNotBetween(String value1, String value2) {
            addCriterion("secondary_color not between", value1, value2, "secondaryColor");
            return (Criteria) this;
        }

        public Criteria andTertiaryColorIsNull() {
            addCriterion("tertiary_color is null");
            return (Criteria) this;
        }

        public Criteria andTertiaryColorIsNotNull() {
            addCriterion("tertiary_color is not null");
            return (Criteria) this;
        }

        public Criteria andTertiaryColorEqualTo(String value) {
            addCriterion("tertiary_color =", value, "tertiaryColor");
            return (Criteria) this;
        }

        public Criteria andTertiaryColorNotEqualTo(String value) {
            addCriterion("tertiary_color <>", value, "tertiaryColor");
            return (Criteria) this;
        }

        public Criteria andTertiaryColorGreaterThan(String value) {
            addCriterion("tertiary_color >", value, "tertiaryColor");
            return (Criteria) this;
        }

        public Criteria andTertiaryColorGreaterThanOrEqualTo(String value) {
            addCriterion("tertiary_color >=", value, "tertiaryColor");
            return (Criteria) this;
        }

        public Criteria andTertiaryColorLessThan(String value) {
            addCriterion("tertiary_color <", value, "tertiaryColor");
            return (Criteria) this;
        }

        public Criteria andTertiaryColorLessThanOrEqualTo(String value) {
            addCriterion("tertiary_color <=", value, "tertiaryColor");
            return (Criteria) this;
        }

        public Criteria andTertiaryColorLike(String value) {
            addCriterion("tertiary_color like", value, "tertiaryColor");
            return (Criteria) this;
        }

        public Criteria andTertiaryColorNotLike(String value) {
            addCriterion("tertiary_color not like", value, "tertiaryColor");
            return (Criteria) this;
        }

        public Criteria andTertiaryColorIn(List<String> values) {
            addCriterion("tertiary_color in", values, "tertiaryColor");
            return (Criteria) this;
        }

        public Criteria andTertiaryColorNotIn(List<String> values) {
            addCriterion("tertiary_color not in", values, "tertiaryColor");
            return (Criteria) this;
        }

        public Criteria andTertiaryColorBetween(String value1, String value2) {
            addCriterion("tertiary_color between", value1, value2, "tertiaryColor");
            return (Criteria) this;
        }

        public Criteria andTertiaryColorNotBetween(String value1, String value2) {
            addCriterion("tertiary_color not between", value1, value2, "tertiaryColor");
            return (Criteria) this;
        }

        public Criteria andQuaternaryColorIsNull() {
            addCriterion("quaternary_color is null");
            return (Criteria) this;
        }

        public Criteria andQuaternaryColorIsNotNull() {
            addCriterion("quaternary_color is not null");
            return (Criteria) this;
        }

        public Criteria andQuaternaryColorEqualTo(String value) {
            addCriterion("quaternary_color =", value, "quaternaryColor");
            return (Criteria) this;
        }

        public Criteria andQuaternaryColorNotEqualTo(String value) {
            addCriterion("quaternary_color <>", value, "quaternaryColor");
            return (Criteria) this;
        }

        public Criteria andQuaternaryColorGreaterThan(String value) {
            addCriterion("quaternary_color >", value, "quaternaryColor");
            return (Criteria) this;
        }

        public Criteria andQuaternaryColorGreaterThanOrEqualTo(String value) {
            addCriterion("quaternary_color >=", value, "quaternaryColor");
            return (Criteria) this;
        }

        public Criteria andQuaternaryColorLessThan(String value) {
            addCriterion("quaternary_color <", value, "quaternaryColor");
            return (Criteria) this;
        }

        public Criteria andQuaternaryColorLessThanOrEqualTo(String value) {
            addCriterion("quaternary_color <=", value, "quaternaryColor");
            return (Criteria) this;
        }

        public Criteria andQuaternaryColorLike(String value) {
            addCriterion("quaternary_color like", value, "quaternaryColor");
            return (Criteria) this;
        }

        public Criteria andQuaternaryColorNotLike(String value) {
            addCriterion("quaternary_color not like", value, "quaternaryColor");
            return (Criteria) this;
        }

        public Criteria andQuaternaryColorIn(List<String> values) {
            addCriterion("quaternary_color in", values, "quaternaryColor");
            return (Criteria) this;
        }

        public Criteria andQuaternaryColorNotIn(List<String> values) {
            addCriterion("quaternary_color not in", values, "quaternaryColor");
            return (Criteria) this;
        }

        public Criteria andQuaternaryColorBetween(String value1, String value2) {
            addCriterion("quaternary_color between", value1, value2, "quaternaryColor");
            return (Criteria) this;
        }

        public Criteria andQuaternaryColorNotBetween(String value1, String value2) {
            addCriterion("quaternary_color not between", value1, value2, "quaternaryColor");
            return (Criteria) this;
        }

        public Criteria andWikipediaLogoUrlIsNull() {
            addCriterion("wikipedia_logo_url is null");
            return (Criteria) this;
        }

        public Criteria andWikipediaLogoUrlIsNotNull() {
            addCriterion("wikipedia_logo_url is not null");
            return (Criteria) this;
        }

        public Criteria andWikipediaLogoUrlEqualTo(String value) {
            addCriterion("wikipedia_logo_url =", value, "wikipediaLogoUrl");
            return (Criteria) this;
        }

        public Criteria andWikipediaLogoUrlNotEqualTo(String value) {
            addCriterion("wikipedia_logo_url <>", value, "wikipediaLogoUrl");
            return (Criteria) this;
        }

        public Criteria andWikipediaLogoUrlGreaterThan(String value) {
            addCriterion("wikipedia_logo_url >", value, "wikipediaLogoUrl");
            return (Criteria) this;
        }

        public Criteria andWikipediaLogoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("wikipedia_logo_url >=", value, "wikipediaLogoUrl");
            return (Criteria) this;
        }

        public Criteria andWikipediaLogoUrlLessThan(String value) {
            addCriterion("wikipedia_logo_url <", value, "wikipediaLogoUrl");
            return (Criteria) this;
        }

        public Criteria andWikipediaLogoUrlLessThanOrEqualTo(String value) {
            addCriterion("wikipedia_logo_url <=", value, "wikipediaLogoUrl");
            return (Criteria) this;
        }

        public Criteria andWikipediaLogoUrlLike(String value) {
            addCriterion("wikipedia_logo_url like", value, "wikipediaLogoUrl");
            return (Criteria) this;
        }

        public Criteria andWikipediaLogoUrlNotLike(String value) {
            addCriterion("wikipedia_logo_url not like", value, "wikipediaLogoUrl");
            return (Criteria) this;
        }

        public Criteria andWikipediaLogoUrlIn(List<String> values) {
            addCriterion("wikipedia_logo_url in", values, "wikipediaLogoUrl");
            return (Criteria) this;
        }

        public Criteria andWikipediaLogoUrlNotIn(List<String> values) {
            addCriterion("wikipedia_logo_url not in", values, "wikipediaLogoUrl");
            return (Criteria) this;
        }

        public Criteria andWikipediaLogoUrlBetween(String value1, String value2) {
            addCriterion("wikipedia_logo_url between", value1, value2, "wikipediaLogoUrl");
            return (Criteria) this;
        }

        public Criteria andWikipediaLogoUrlNotBetween(String value1, String value2) {
            addCriterion("wikipedia_logo_url not between", value1, value2, "wikipediaLogoUrl");
            return (Criteria) this;
        }

        public Criteria andWikipediaWordMarkUrlIsNull() {
            addCriterion("wikipedia_word_mark_url is null");
            return (Criteria) this;
        }

        public Criteria andWikipediaWordMarkUrlIsNotNull() {
            addCriterion("wikipedia_word_mark_url is not null");
            return (Criteria) this;
        }

        public Criteria andWikipediaWordMarkUrlEqualTo(String value) {
            addCriterion("wikipedia_word_mark_url =", value, "wikipediaWordMarkUrl");
            return (Criteria) this;
        }

        public Criteria andWikipediaWordMarkUrlNotEqualTo(String value) {
            addCriterion("wikipedia_word_mark_url <>", value, "wikipediaWordMarkUrl");
            return (Criteria) this;
        }

        public Criteria andWikipediaWordMarkUrlGreaterThan(String value) {
            addCriterion("wikipedia_word_mark_url >", value, "wikipediaWordMarkUrl");
            return (Criteria) this;
        }

        public Criteria andWikipediaWordMarkUrlGreaterThanOrEqualTo(String value) {
            addCriterion("wikipedia_word_mark_url >=", value, "wikipediaWordMarkUrl");
            return (Criteria) this;
        }

        public Criteria andWikipediaWordMarkUrlLessThan(String value) {
            addCriterion("wikipedia_word_mark_url <", value, "wikipediaWordMarkUrl");
            return (Criteria) this;
        }

        public Criteria andWikipediaWordMarkUrlLessThanOrEqualTo(String value) {
            addCriterion("wikipedia_word_mark_url <=", value, "wikipediaWordMarkUrl");
            return (Criteria) this;
        }

        public Criteria andWikipediaWordMarkUrlLike(String value) {
            addCriterion("wikipedia_word_mark_url like", value, "wikipediaWordMarkUrl");
            return (Criteria) this;
        }

        public Criteria andWikipediaWordMarkUrlNotLike(String value) {
            addCriterion("wikipedia_word_mark_url not like", value, "wikipediaWordMarkUrl");
            return (Criteria) this;
        }

        public Criteria andWikipediaWordMarkUrlIn(List<String> values) {
            addCriterion("wikipedia_word_mark_url in", values, "wikipediaWordMarkUrl");
            return (Criteria) this;
        }

        public Criteria andWikipediaWordMarkUrlNotIn(List<String> values) {
            addCriterion("wikipedia_word_mark_url not in", values, "wikipediaWordMarkUrl");
            return (Criteria) this;
        }

        public Criteria andWikipediaWordMarkUrlBetween(String value1, String value2) {
            addCriterion("wikipedia_word_mark_url between", value1, value2, "wikipediaWordMarkUrl");
            return (Criteria) this;
        }

        public Criteria andWikipediaWordMarkUrlNotBetween(String value1, String value2) {
            addCriterion("wikipedia_word_mark_url not between", value1, value2, "wikipediaWordMarkUrl");
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