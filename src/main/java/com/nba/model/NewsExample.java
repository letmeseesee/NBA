package com.nba.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NewsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    private Boolean forUpdate;

    public NewsExample() {
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

        public Criteria andNewsIdIsNull() {
            addCriterion("news_id is null");
            return (Criteria) this;
        }

        public Criteria andNewsIdIsNotNull() {
            addCriterion("news_id is not null");
            return (Criteria) this;
        }

        public Criteria andNewsIdEqualTo(Integer value) {
            addCriterion("news_id =", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdNotEqualTo(Integer value) {
            addCriterion("news_id <>", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdGreaterThan(Integer value) {
            addCriterion("news_id >", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("news_id >=", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdLessThan(Integer value) {
            addCriterion("news_id <", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdLessThanOrEqualTo(Integer value) {
            addCriterion("news_id <=", value, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdIn(List<Integer> values) {
            addCriterion("news_id in", values, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdNotIn(List<Integer> values) {
            addCriterion("news_id not in", values, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdBetween(Integer value1, Integer value2) {
            addCriterion("news_id between", value1, value2, "newsId");
            return (Criteria) this;
        }

        public Criteria andNewsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("news_id not between", value1, value2, "newsId");
            return (Criteria) this;
        }

        public Criteria andUpdatedIsNull() {
            addCriterion("Updated is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedIsNotNull() {
            addCriterion("Updated is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedEqualTo(Date value) {
            addCriterion("Updated =", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotEqualTo(Date value) {
            addCriterion("Updated <>", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedGreaterThan(Date value) {
            addCriterion("Updated >", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedGreaterThanOrEqualTo(Date value) {
            addCriterion("Updated >=", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedLessThan(Date value) {
            addCriterion("Updated <", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedLessThanOrEqualTo(Date value) {
            addCriterion("Updated <=", value, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedIn(List<Date> values) {
            addCriterion("Updated in", values, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotIn(List<Date> values) {
            addCriterion("Updated not in", values, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedBetween(Date value1, Date value2) {
            addCriterion("Updated between", value1, value2, "updated");
            return (Criteria) this;
        }

        public Criteria andUpdatedNotBetween(Date value1, Date value2) {
            addCriterion("Updated not between", value1, value2, "updated");
            return (Criteria) this;
        }

        public Criteria andTimeAgeIsNull() {
            addCriterion("time_age is null");
            return (Criteria) this;
        }

        public Criteria andTimeAgeIsNotNull() {
            addCriterion("time_age is not null");
            return (Criteria) this;
        }

        public Criteria andTimeAgeEqualTo(Date value) {
            addCriterion("time_age =", value, "timeAge");
            return (Criteria) this;
        }

        public Criteria andTimeAgeNotEqualTo(Date value) {
            addCriterion("time_age <>", value, "timeAge");
            return (Criteria) this;
        }

        public Criteria andTimeAgeGreaterThan(Date value) {
            addCriterion("time_age >", value, "timeAge");
            return (Criteria) this;
        }

        public Criteria andTimeAgeGreaterThanOrEqualTo(Date value) {
            addCriterion("time_age >=", value, "timeAge");
            return (Criteria) this;
        }

        public Criteria andTimeAgeLessThan(Date value) {
            addCriterion("time_age <", value, "timeAge");
            return (Criteria) this;
        }

        public Criteria andTimeAgeLessThanOrEqualTo(Date value) {
            addCriterion("time_age <=", value, "timeAge");
            return (Criteria) this;
        }

        public Criteria andTimeAgeIn(List<Date> values) {
            addCriterion("time_age in", values, "timeAge");
            return (Criteria) this;
        }

        public Criteria andTimeAgeNotIn(List<Date> values) {
            addCriterion("time_age not in", values, "timeAge");
            return (Criteria) this;
        }

        public Criteria andTimeAgeBetween(Date value1, Date value2) {
            addCriterion("time_age between", value1, value2, "timeAge");
            return (Criteria) this;
        }

        public Criteria andTimeAgeNotBetween(Date value1, Date value2) {
            addCriterion("time_age not between", value1, value2, "timeAge");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andTermOfUseIsNull() {
            addCriterion("term_of_use is null");
            return (Criteria) this;
        }

        public Criteria andTermOfUseIsNotNull() {
            addCriterion("term_of_use is not null");
            return (Criteria) this;
        }

        public Criteria andTermOfUseEqualTo(String value) {
            addCriterion("term_of_use =", value, "termOfUse");
            return (Criteria) this;
        }

        public Criteria andTermOfUseNotEqualTo(String value) {
            addCriterion("term_of_use <>", value, "termOfUse");
            return (Criteria) this;
        }

        public Criteria andTermOfUseGreaterThan(String value) {
            addCriterion("term_of_use >", value, "termOfUse");
            return (Criteria) this;
        }

        public Criteria andTermOfUseGreaterThanOrEqualTo(String value) {
            addCriterion("term_of_use >=", value, "termOfUse");
            return (Criteria) this;
        }

        public Criteria andTermOfUseLessThan(String value) {
            addCriterion("term_of_use <", value, "termOfUse");
            return (Criteria) this;
        }

        public Criteria andTermOfUseLessThanOrEqualTo(String value) {
            addCriterion("term_of_use <=", value, "termOfUse");
            return (Criteria) this;
        }

        public Criteria andTermOfUseLike(String value) {
            addCriterion("term_of_use like", value, "termOfUse");
            return (Criteria) this;
        }

        public Criteria andTermOfUseNotLike(String value) {
            addCriterion("term_of_use not like", value, "termOfUse");
            return (Criteria) this;
        }

        public Criteria andTermOfUseIn(List<String> values) {
            addCriterion("term_of_use in", values, "termOfUse");
            return (Criteria) this;
        }

        public Criteria andTermOfUseNotIn(List<String> values) {
            addCriterion("term_of_use not in", values, "termOfUse");
            return (Criteria) this;
        }

        public Criteria andTermOfUseBetween(String value1, String value2) {
            addCriterion("term_of_use between", value1, value2, "termOfUse");
            return (Criteria) this;
        }

        public Criteria andTermOfUseNotBetween(String value1, String value2) {
            addCriterion("term_of_use not between", value1, value2, "termOfUse");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNull() {
            addCriterion("author is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNotNull() {
            addCriterion("author is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEqualTo(String value) {
            addCriterion("author =", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotEqualTo(String value) {
            addCriterion("author <>", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThan(String value) {
            addCriterion("author >", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("author >=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThan(String value) {
            addCriterion("author <", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThanOrEqualTo(String value) {
            addCriterion("author <=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLike(String value) {
            addCriterion("author like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotLike(String value) {
            addCriterion("author not like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorIn(List<String> values) {
            addCriterion("author in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotIn(List<String> values) {
            addCriterion("author not in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorBetween(String value1, String value2) {
            addCriterion("author between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotBetween(String value1, String value2) {
            addCriterion("author not between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andCategoriesIsNull() {
            addCriterion("categories is null");
            return (Criteria) this;
        }

        public Criteria andCategoriesIsNotNull() {
            addCriterion("categories is not null");
            return (Criteria) this;
        }

        public Criteria andCategoriesEqualTo(String value) {
            addCriterion("categories =", value, "categories");
            return (Criteria) this;
        }

        public Criteria andCategoriesNotEqualTo(String value) {
            addCriterion("categories <>", value, "categories");
            return (Criteria) this;
        }

        public Criteria andCategoriesGreaterThan(String value) {
            addCriterion("categories >", value, "categories");
            return (Criteria) this;
        }

        public Criteria andCategoriesGreaterThanOrEqualTo(String value) {
            addCriterion("categories >=", value, "categories");
            return (Criteria) this;
        }

        public Criteria andCategoriesLessThan(String value) {
            addCriterion("categories <", value, "categories");
            return (Criteria) this;
        }

        public Criteria andCategoriesLessThanOrEqualTo(String value) {
            addCriterion("categories <=", value, "categories");
            return (Criteria) this;
        }

        public Criteria andCategoriesLike(String value) {
            addCriterion("categories like", value, "categories");
            return (Criteria) this;
        }

        public Criteria andCategoriesNotLike(String value) {
            addCriterion("categories not like", value, "categories");
            return (Criteria) this;
        }

        public Criteria andCategoriesIn(List<String> values) {
            addCriterion("categories in", values, "categories");
            return (Criteria) this;
        }

        public Criteria andCategoriesNotIn(List<String> values) {
            addCriterion("categories not in", values, "categories");
            return (Criteria) this;
        }

        public Criteria andCategoriesBetween(String value1, String value2) {
            addCriterion("categories between", value1, value2, "categories");
            return (Criteria) this;
        }

        public Criteria andCategoriesNotBetween(String value1, String value2) {
            addCriterion("categories not between", value1, value2, "categories");
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

        public Criteria andPlayerId2IsNull() {
            addCriterion("player_id2 is null");
            return (Criteria) this;
        }

        public Criteria andPlayerId2IsNotNull() {
            addCriterion("player_id2 is not null");
            return (Criteria) this;
        }

        public Criteria andPlayerId2EqualTo(Integer value) {
            addCriterion("player_id2 =", value, "playerId2");
            return (Criteria) this;
        }

        public Criteria andPlayerId2NotEqualTo(Integer value) {
            addCriterion("player_id2 <>", value, "playerId2");
            return (Criteria) this;
        }

        public Criteria andPlayerId2GreaterThan(Integer value) {
            addCriterion("player_id2 >", value, "playerId2");
            return (Criteria) this;
        }

        public Criteria andPlayerId2GreaterThanOrEqualTo(Integer value) {
            addCriterion("player_id2 >=", value, "playerId2");
            return (Criteria) this;
        }

        public Criteria andPlayerId2LessThan(Integer value) {
            addCriterion("player_id2 <", value, "playerId2");
            return (Criteria) this;
        }

        public Criteria andPlayerId2LessThanOrEqualTo(Integer value) {
            addCriterion("player_id2 <=", value, "playerId2");
            return (Criteria) this;
        }

        public Criteria andPlayerId2In(List<Integer> values) {
            addCriterion("player_id2 in", values, "playerId2");
            return (Criteria) this;
        }

        public Criteria andPlayerId2NotIn(List<Integer> values) {
            addCriterion("player_id2 not in", values, "playerId2");
            return (Criteria) this;
        }

        public Criteria andPlayerId2Between(Integer value1, Integer value2) {
            addCriterion("player_id2 between", value1, value2, "playerId2");
            return (Criteria) this;
        }

        public Criteria andPlayerId2NotBetween(Integer value1, Integer value2) {
            addCriterion("player_id2 not between", value1, value2, "playerId2");
            return (Criteria) this;
        }

        public Criteria andTeamId2IsNull() {
            addCriterion("team_id2 is null");
            return (Criteria) this;
        }

        public Criteria andTeamId2IsNotNull() {
            addCriterion("team_id2 is not null");
            return (Criteria) this;
        }

        public Criteria andTeamId2EqualTo(Integer value) {
            addCriterion("team_id2 =", value, "teamId2");
            return (Criteria) this;
        }

        public Criteria andTeamId2NotEqualTo(Integer value) {
            addCriterion("team_id2 <>", value, "teamId2");
            return (Criteria) this;
        }

        public Criteria andTeamId2GreaterThan(Integer value) {
            addCriterion("team_id2 >", value, "teamId2");
            return (Criteria) this;
        }

        public Criteria andTeamId2GreaterThanOrEqualTo(Integer value) {
            addCriterion("team_id2 >=", value, "teamId2");
            return (Criteria) this;
        }

        public Criteria andTeamId2LessThan(Integer value) {
            addCriterion("team_id2 <", value, "teamId2");
            return (Criteria) this;
        }

        public Criteria andTeamId2LessThanOrEqualTo(Integer value) {
            addCriterion("team_id2 <=", value, "teamId2");
            return (Criteria) this;
        }

        public Criteria andTeamId2In(List<Integer> values) {
            addCriterion("team_id2 in", values, "teamId2");
            return (Criteria) this;
        }

        public Criteria andTeamId2NotIn(List<Integer> values) {
            addCriterion("team_id2 not in", values, "teamId2");
            return (Criteria) this;
        }

        public Criteria andTeamId2Between(Integer value1, Integer value2) {
            addCriterion("team_id2 between", value1, value2, "teamId2");
            return (Criteria) this;
        }

        public Criteria andTeamId2NotBetween(Integer value1, Integer value2) {
            addCriterion("team_id2 not between", value1, value2, "teamId2");
            return (Criteria) this;
        }

        public Criteria andTeam2IsNull() {
            addCriterion("team2 is null");
            return (Criteria) this;
        }

        public Criteria andTeam2IsNotNull() {
            addCriterion("team2 is not null");
            return (Criteria) this;
        }

        public Criteria andTeam2EqualTo(String value) {
            addCriterion("team2 =", value, "team2");
            return (Criteria) this;
        }

        public Criteria andTeam2NotEqualTo(String value) {
            addCriterion("team2 <>", value, "team2");
            return (Criteria) this;
        }

        public Criteria andTeam2GreaterThan(String value) {
            addCriterion("team2 >", value, "team2");
            return (Criteria) this;
        }

        public Criteria andTeam2GreaterThanOrEqualTo(String value) {
            addCriterion("team2 >=", value, "team2");
            return (Criteria) this;
        }

        public Criteria andTeam2LessThan(String value) {
            addCriterion("team2 <", value, "team2");
            return (Criteria) this;
        }

        public Criteria andTeam2LessThanOrEqualTo(String value) {
            addCriterion("team2 <=", value, "team2");
            return (Criteria) this;
        }

        public Criteria andTeam2Like(String value) {
            addCriterion("team2 like", value, "team2");
            return (Criteria) this;
        }

        public Criteria andTeam2NotLike(String value) {
            addCriterion("team2 not like", value, "team2");
            return (Criteria) this;
        }

        public Criteria andTeam2In(List<String> values) {
            addCriterion("team2 in", values, "team2");
            return (Criteria) this;
        }

        public Criteria andTeam2NotIn(List<String> values) {
            addCriterion("team2 not in", values, "team2");
            return (Criteria) this;
        }

        public Criteria andTeam2Between(String value1, String value2) {
            addCriterion("team2 between", value1, value2, "team2");
            return (Criteria) this;
        }

        public Criteria andTeam2NotBetween(String value1, String value2) {
            addCriterion("team2 not between", value1, value2, "team2");
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