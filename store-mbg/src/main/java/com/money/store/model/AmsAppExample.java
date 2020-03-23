package com.money.store.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AmsAppExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AmsAppExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andSizeIsNull() {
            addCriterion("size is null");
            return (Criteria) this;
        }

        public Criteria andSizeIsNotNull() {
            addCriterion("size is not null");
            return (Criteria) this;
        }

        public Criteria andSizeEqualTo(String value) {
            addCriterion("size =", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotEqualTo(String value) {
            addCriterion("size <>", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThan(String value) {
            addCriterion("size >", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThanOrEqualTo(String value) {
            addCriterion("size >=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThan(String value) {
            addCriterion("size <", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThanOrEqualTo(String value) {
            addCriterion("size <=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLike(String value) {
            addCriterion("size like", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotLike(String value) {
            addCriterion("size not like", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeIn(List<String> values) {
            addCriterion("size in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotIn(List<String> values) {
            addCriterion("size not in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeBetween(String value1, String value2) {
            addCriterion("size between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotBetween(String value1, String value2) {
            addCriterion("size not between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andApkNameIsNull() {
            addCriterion("apk_name is null");
            return (Criteria) this;
        }

        public Criteria andApkNameIsNotNull() {
            addCriterion("apk_name is not null");
            return (Criteria) this;
        }

        public Criteria andApkNameEqualTo(String value) {
            addCriterion("apk_name =", value, "apkName");
            return (Criteria) this;
        }

        public Criteria andApkNameNotEqualTo(String value) {
            addCriterion("apk_name <>", value, "apkName");
            return (Criteria) this;
        }

        public Criteria andApkNameGreaterThan(String value) {
            addCriterion("apk_name >", value, "apkName");
            return (Criteria) this;
        }

        public Criteria andApkNameGreaterThanOrEqualTo(String value) {
            addCriterion("apk_name >=", value, "apkName");
            return (Criteria) this;
        }

        public Criteria andApkNameLessThan(String value) {
            addCriterion("apk_name <", value, "apkName");
            return (Criteria) this;
        }

        public Criteria andApkNameLessThanOrEqualTo(String value) {
            addCriterion("apk_name <=", value, "apkName");
            return (Criteria) this;
        }

        public Criteria andApkNameLike(String value) {
            addCriterion("apk_name like", value, "apkName");
            return (Criteria) this;
        }

        public Criteria andApkNameNotLike(String value) {
            addCriterion("apk_name not like", value, "apkName");
            return (Criteria) this;
        }

        public Criteria andApkNameIn(List<String> values) {
            addCriterion("apk_name in", values, "apkName");
            return (Criteria) this;
        }

        public Criteria andApkNameNotIn(List<String> values) {
            addCriterion("apk_name not in", values, "apkName");
            return (Criteria) this;
        }

        public Criteria andApkNameBetween(String value1, String value2) {
            addCriterion("apk_name between", value1, value2, "apkName");
            return (Criteria) this;
        }

        public Criteria andApkNameNotBetween(String value1, String value2) {
            addCriterion("apk_name not between", value1, value2, "apkName");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNull() {
            addCriterion("language is null");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNotNull() {
            addCriterion("language is not null");
            return (Criteria) this;
        }

        public Criteria andLanguageEqualTo(String value) {
            addCriterion("language =", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotEqualTo(String value) {
            addCriterion("language <>", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThan(String value) {
            addCriterion("language >", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("language >=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThan(String value) {
            addCriterion("language <", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThanOrEqualTo(String value) {
            addCriterion("language <=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLike(String value) {
            addCriterion("language like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotLike(String value) {
            addCriterion("language not like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageIn(List<String> values) {
            addCriterion("language in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotIn(List<String> values) {
            addCriterion("language not in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageBetween(String value1, String value2) {
            addCriterion("language between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotBetween(String value1, String value2) {
            addCriterion("language not between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andScreenSizeIsNull() {
            addCriterion("screen_size is null");
            return (Criteria) this;
        }

        public Criteria andScreenSizeIsNotNull() {
            addCriterion("screen_size is not null");
            return (Criteria) this;
        }

        public Criteria andScreenSizeEqualTo(String value) {
            addCriterion("screen_size =", value, "screenSize");
            return (Criteria) this;
        }

        public Criteria andScreenSizeNotEqualTo(String value) {
            addCriterion("screen_size <>", value, "screenSize");
            return (Criteria) this;
        }

        public Criteria andScreenSizeGreaterThan(String value) {
            addCriterion("screen_size >", value, "screenSize");
            return (Criteria) this;
        }

        public Criteria andScreenSizeGreaterThanOrEqualTo(String value) {
            addCriterion("screen_size >=", value, "screenSize");
            return (Criteria) this;
        }

        public Criteria andScreenSizeLessThan(String value) {
            addCriterion("screen_size <", value, "screenSize");
            return (Criteria) this;
        }

        public Criteria andScreenSizeLessThanOrEqualTo(String value) {
            addCriterion("screen_size <=", value, "screenSize");
            return (Criteria) this;
        }

        public Criteria andScreenSizeLike(String value) {
            addCriterion("screen_size like", value, "screenSize");
            return (Criteria) this;
        }

        public Criteria andScreenSizeNotLike(String value) {
            addCriterion("screen_size not like", value, "screenSize");
            return (Criteria) this;
        }

        public Criteria andScreenSizeIn(List<String> values) {
            addCriterion("screen_size in", values, "screenSize");
            return (Criteria) this;
        }

        public Criteria andScreenSizeNotIn(List<String> values) {
            addCriterion("screen_size not in", values, "screenSize");
            return (Criteria) this;
        }

        public Criteria andScreenSizeBetween(String value1, String value2) {
            addCriterion("screen_size between", value1, value2, "screenSize");
            return (Criteria) this;
        }

        public Criteria andScreenSizeNotBetween(String value1, String value2) {
            addCriterion("screen_size not between", value1, value2, "screenSize");
            return (Criteria) this;
        }

        public Criteria andExpensesIsNull() {
            addCriterion("expenses is null");
            return (Criteria) this;
        }

        public Criteria andExpensesIsNotNull() {
            addCriterion("expenses is not null");
            return (Criteria) this;
        }

        public Criteria andExpensesEqualTo(String value) {
            addCriterion("expenses =", value, "expenses");
            return (Criteria) this;
        }

        public Criteria andExpensesNotEqualTo(String value) {
            addCriterion("expenses <>", value, "expenses");
            return (Criteria) this;
        }

        public Criteria andExpensesGreaterThan(String value) {
            addCriterion("expenses >", value, "expenses");
            return (Criteria) this;
        }

        public Criteria andExpensesGreaterThanOrEqualTo(String value) {
            addCriterion("expenses >=", value, "expenses");
            return (Criteria) this;
        }

        public Criteria andExpensesLessThan(String value) {
            addCriterion("expenses <", value, "expenses");
            return (Criteria) this;
        }

        public Criteria andExpensesLessThanOrEqualTo(String value) {
            addCriterion("expenses <=", value, "expenses");
            return (Criteria) this;
        }

        public Criteria andExpensesLike(String value) {
            addCriterion("expenses like", value, "expenses");
            return (Criteria) this;
        }

        public Criteria andExpensesNotLike(String value) {
            addCriterion("expenses not like", value, "expenses");
            return (Criteria) this;
        }

        public Criteria andExpensesIn(List<String> values) {
            addCriterion("expenses in", values, "expenses");
            return (Criteria) this;
        }

        public Criteria andExpensesNotIn(List<String> values) {
            addCriterion("expenses not in", values, "expenses");
            return (Criteria) this;
        }

        public Criteria andExpensesBetween(String value1, String value2) {
            addCriterion("expenses between", value1, value2, "expenses");
            return (Criteria) this;
        }

        public Criteria andExpensesNotBetween(String value1, String value2) {
            addCriterion("expenses not between", value1, value2, "expenses");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(BigDecimal value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(BigDecimal value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(BigDecimal value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(BigDecimal value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<BigDecimal> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<BigDecimal> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andAdvertisementIsNull() {
            addCriterion("advertisement is null");
            return (Criteria) this;
        }

        public Criteria andAdvertisementIsNotNull() {
            addCriterion("advertisement is not null");
            return (Criteria) this;
        }

        public Criteria andAdvertisementEqualTo(String value) {
            addCriterion("advertisement =", value, "advertisement");
            return (Criteria) this;
        }

        public Criteria andAdvertisementNotEqualTo(String value) {
            addCriterion("advertisement <>", value, "advertisement");
            return (Criteria) this;
        }

        public Criteria andAdvertisementGreaterThan(String value) {
            addCriterion("advertisement >", value, "advertisement");
            return (Criteria) this;
        }

        public Criteria andAdvertisementGreaterThanOrEqualTo(String value) {
            addCriterion("advertisement >=", value, "advertisement");
            return (Criteria) this;
        }

        public Criteria andAdvertisementLessThan(String value) {
            addCriterion("advertisement <", value, "advertisement");
            return (Criteria) this;
        }

        public Criteria andAdvertisementLessThanOrEqualTo(String value) {
            addCriterion("advertisement <=", value, "advertisement");
            return (Criteria) this;
        }

        public Criteria andAdvertisementLike(String value) {
            addCriterion("advertisement like", value, "advertisement");
            return (Criteria) this;
        }

        public Criteria andAdvertisementNotLike(String value) {
            addCriterion("advertisement not like", value, "advertisement");
            return (Criteria) this;
        }

        public Criteria andAdvertisementIn(List<String> values) {
            addCriterion("advertisement in", values, "advertisement");
            return (Criteria) this;
        }

        public Criteria andAdvertisementNotIn(List<String> values) {
            addCriterion("advertisement not in", values, "advertisement");
            return (Criteria) this;
        }

        public Criteria andAdvertisementBetween(String value1, String value2) {
            addCriterion("advertisement between", value1, value2, "advertisement");
            return (Criteria) this;
        }

        public Criteria andAdvertisementNotBetween(String value1, String value2) {
            addCriterion("advertisement not between", value1, value2, "advertisement");
            return (Criteria) this;
        }

        public Criteria andPulishStatusIsNull() {
            addCriterion("pulish_status is null");
            return (Criteria) this;
        }

        public Criteria andPulishStatusIsNotNull() {
            addCriterion("pulish_status is not null");
            return (Criteria) this;
        }

        public Criteria andPulishStatusEqualTo(Integer value) {
            addCriterion("pulish_status =", value, "pulishStatus");
            return (Criteria) this;
        }

        public Criteria andPulishStatusNotEqualTo(Integer value) {
            addCriterion("pulish_status <>", value, "pulishStatus");
            return (Criteria) this;
        }

        public Criteria andPulishStatusGreaterThan(Integer value) {
            addCriterion("pulish_status >", value, "pulishStatus");
            return (Criteria) this;
        }

        public Criteria andPulishStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("pulish_status >=", value, "pulishStatus");
            return (Criteria) this;
        }

        public Criteria andPulishStatusLessThan(Integer value) {
            addCriterion("pulish_status <", value, "pulishStatus");
            return (Criteria) this;
        }

        public Criteria andPulishStatusLessThanOrEqualTo(Integer value) {
            addCriterion("pulish_status <=", value, "pulishStatus");
            return (Criteria) this;
        }

        public Criteria andPulishStatusIn(List<Integer> values) {
            addCriterion("pulish_status in", values, "pulishStatus");
            return (Criteria) this;
        }

        public Criteria andPulishStatusNotIn(List<Integer> values) {
            addCriterion("pulish_status not in", values, "pulishStatus");
            return (Criteria) this;
        }

        public Criteria andPulishStatusBetween(Integer value1, Integer value2) {
            addCriterion("pulish_status between", value1, value2, "pulishStatus");
            return (Criteria) this;
        }

        public Criteria andPulishStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("pulish_status not between", value1, value2, "pulishStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusIsNull() {
            addCriterion("verify_status is null");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusIsNotNull() {
            addCriterion("verify_status is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusEqualTo(Integer value) {
            addCriterion("verify_status =", value, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusNotEqualTo(Integer value) {
            addCriterion("verify_status <>", value, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusGreaterThan(Integer value) {
            addCriterion("verify_status >", value, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("verify_status >=", value, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusLessThan(Integer value) {
            addCriterion("verify_status <", value, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusLessThanOrEqualTo(Integer value) {
            addCriterion("verify_status <=", value, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusIn(List<Integer> values) {
            addCriterion("verify_status in", values, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusNotIn(List<Integer> values) {
            addCriterion("verify_status not in", values, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusBetween(Integer value1, Integer value2) {
            addCriterion("verify_status between", value1, value2, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("verify_status not between", value1, value2, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andDownloadsIsNull() {
            addCriterion("downloads is null");
            return (Criteria) this;
        }

        public Criteria andDownloadsIsNotNull() {
            addCriterion("downloads is not null");
            return (Criteria) this;
        }

        public Criteria andDownloadsEqualTo(String value) {
            addCriterion("downloads =", value, "downloads");
            return (Criteria) this;
        }

        public Criteria andDownloadsNotEqualTo(String value) {
            addCriterion("downloads <>", value, "downloads");
            return (Criteria) this;
        }

        public Criteria andDownloadsGreaterThan(String value) {
            addCriterion("downloads >", value, "downloads");
            return (Criteria) this;
        }

        public Criteria andDownloadsGreaterThanOrEqualTo(String value) {
            addCriterion("downloads >=", value, "downloads");
            return (Criteria) this;
        }

        public Criteria andDownloadsLessThan(String value) {
            addCriterion("downloads <", value, "downloads");
            return (Criteria) this;
        }

        public Criteria andDownloadsLessThanOrEqualTo(String value) {
            addCriterion("downloads <=", value, "downloads");
            return (Criteria) this;
        }

        public Criteria andDownloadsLike(String value) {
            addCriterion("downloads like", value, "downloads");
            return (Criteria) this;
        }

        public Criteria andDownloadsNotLike(String value) {
            addCriterion("downloads not like", value, "downloads");
            return (Criteria) this;
        }

        public Criteria andDownloadsIn(List<String> values) {
            addCriterion("downloads in", values, "downloads");
            return (Criteria) this;
        }

        public Criteria andDownloadsNotIn(List<String> values) {
            addCriterion("downloads not in", values, "downloads");
            return (Criteria) this;
        }

        public Criteria andDownloadsBetween(String value1, String value2) {
            addCriterion("downloads between", value1, value2, "downloads");
            return (Criteria) this;
        }

        public Criteria andDownloadsNotBetween(String value1, String value2) {
            addCriterion("downloads not between", value1, value2, "downloads");
            return (Criteria) this;
        }

        public Criteria andLogoIsNull() {
            addCriterion("logo is null");
            return (Criteria) this;
        }

        public Criteria andLogoIsNotNull() {
            addCriterion("logo is not null");
            return (Criteria) this;
        }

        public Criteria andLogoEqualTo(String value) {
            addCriterion("logo =", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotEqualTo(String value) {
            addCriterion("logo <>", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThan(String value) {
            addCriterion("logo >", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThanOrEqualTo(String value) {
            addCriterion("logo >=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThan(String value) {
            addCriterion("logo <", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThanOrEqualTo(String value) {
            addCriterion("logo <=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLike(String value) {
            addCriterion("logo like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotLike(String value) {
            addCriterion("logo not like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoIn(List<String> values) {
            addCriterion("logo in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotIn(List<String> values) {
            addCriterion("logo not in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoBetween(String value1, String value2) {
            addCriterion("logo between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotBetween(String value1, String value2) {
            addCriterion("logo not between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andVideoIsNull() {
            addCriterion("video is null");
            return (Criteria) this;
        }

        public Criteria andVideoIsNotNull() {
            addCriterion("video is not null");
            return (Criteria) this;
        }

        public Criteria andVideoEqualTo(String value) {
            addCriterion("video =", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoNotEqualTo(String value) {
            addCriterion("video <>", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoGreaterThan(String value) {
            addCriterion("video >", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoGreaterThanOrEqualTo(String value) {
            addCriterion("video >=", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoLessThan(String value) {
            addCriterion("video <", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoLessThanOrEqualTo(String value) {
            addCriterion("video <=", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoLike(String value) {
            addCriterion("video like", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoNotLike(String value) {
            addCriterion("video not like", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoIn(List<String> values) {
            addCriterion("video in", values, "video");
            return (Criteria) this;
        }

        public Criteria andVideoNotIn(List<String> values) {
            addCriterion("video not in", values, "video");
            return (Criteria) this;
        }

        public Criteria andVideoBetween(String value1, String value2) {
            addCriterion("video between", value1, value2, "video");
            return (Criteria) this;
        }

        public Criteria andVideoNotBetween(String value1, String value2) {
            addCriterion("video not between", value1, value2, "video");
            return (Criteria) this;
        }

        public Criteria andPicsIsNull() {
            addCriterion("pics is null");
            return (Criteria) this;
        }

        public Criteria andPicsIsNotNull() {
            addCriterion("pics is not null");
            return (Criteria) this;
        }

        public Criteria andPicsEqualTo(String value) {
            addCriterion("pics =", value, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsNotEqualTo(String value) {
            addCriterion("pics <>", value, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsGreaterThan(String value) {
            addCriterion("pics >", value, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsGreaterThanOrEqualTo(String value) {
            addCriterion("pics >=", value, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsLessThan(String value) {
            addCriterion("pics <", value, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsLessThanOrEqualTo(String value) {
            addCriterion("pics <=", value, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsLike(String value) {
            addCriterion("pics like", value, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsNotLike(String value) {
            addCriterion("pics not like", value, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsIn(List<String> values) {
            addCriterion("pics in", values, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsNotIn(List<String> values) {
            addCriterion("pics not in", values, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsBetween(String value1, String value2) {
            addCriterion("pics between", value1, value2, "pics");
            return (Criteria) this;
        }

        public Criteria andPicsNotBetween(String value1, String value2) {
            addCriterion("pics not between", value1, value2, "pics");
            return (Criteria) this;
        }

        public Criteria andCopyrightIsNull() {
            addCriterion("copyright is null");
            return (Criteria) this;
        }

        public Criteria andCopyrightIsNotNull() {
            addCriterion("copyright is not null");
            return (Criteria) this;
        }

        public Criteria andCopyrightEqualTo(String value) {
            addCriterion("copyright =", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightNotEqualTo(String value) {
            addCriterion("copyright <>", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightGreaterThan(String value) {
            addCriterion("copyright >", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightGreaterThanOrEqualTo(String value) {
            addCriterion("copyright >=", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightLessThan(String value) {
            addCriterion("copyright <", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightLessThanOrEqualTo(String value) {
            addCriterion("copyright <=", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightLike(String value) {
            addCriterion("copyright like", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightNotLike(String value) {
            addCriterion("copyright not like", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightIn(List<String> values) {
            addCriterion("copyright in", values, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightNotIn(List<String> values) {
            addCriterion("copyright not in", values, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightBetween(String value1, String value2) {
            addCriterion("copyright between", value1, value2, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightNotBetween(String value1, String value2) {
            addCriterion("copyright not between", value1, value2, "copyright");
            return (Criteria) this;
        }

        public Criteria andLabelIsNull() {
            addCriterion("label is null");
            return (Criteria) this;
        }

        public Criteria andLabelIsNotNull() {
            addCriterion("label is not null");
            return (Criteria) this;
        }

        public Criteria andLabelEqualTo(String value) {
            addCriterion("label =", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotEqualTo(String value) {
            addCriterion("label <>", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelGreaterThan(String value) {
            addCriterion("label >", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelGreaterThanOrEqualTo(String value) {
            addCriterion("label >=", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelLessThan(String value) {
            addCriterion("label <", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelLessThanOrEqualTo(String value) {
            addCriterion("label <=", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelLike(String value) {
            addCriterion("label like", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotLike(String value) {
            addCriterion("label not like", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelIn(List<String> values) {
            addCriterion("label in", values, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotIn(List<String> values) {
            addCriterion("label not in", values, "label");
            return (Criteria) this;
        }

        public Criteria andLabelBetween(String value1, String value2) {
            addCriterion("label between", value1, value2, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotBetween(String value1, String value2) {
            addCriterion("label not between", value1, value2, "label");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
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

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andOnSaleDateIsNull() {
            addCriterion("on_sale_date is null");
            return (Criteria) this;
        }

        public Criteria andOnSaleDateIsNotNull() {
            addCriterion("on_sale_date is not null");
            return (Criteria) this;
        }

        public Criteria andOnSaleDateEqualTo(Date value) {
            addCriterion("on_sale_date =", value, "onSaleDate");
            return (Criteria) this;
        }

        public Criteria andOnSaleDateNotEqualTo(Date value) {
            addCriterion("on_sale_date <>", value, "onSaleDate");
            return (Criteria) this;
        }

        public Criteria andOnSaleDateGreaterThan(Date value) {
            addCriterion("on_sale_date >", value, "onSaleDate");
            return (Criteria) this;
        }

        public Criteria andOnSaleDateGreaterThanOrEqualTo(Date value) {
            addCriterion("on_sale_date >=", value, "onSaleDate");
            return (Criteria) this;
        }

        public Criteria andOnSaleDateLessThan(Date value) {
            addCriterion("on_sale_date <", value, "onSaleDate");
            return (Criteria) this;
        }

        public Criteria andOnSaleDateLessThanOrEqualTo(Date value) {
            addCriterion("on_sale_date <=", value, "onSaleDate");
            return (Criteria) this;
        }

        public Criteria andOnSaleDateIn(List<Date> values) {
            addCriterion("on_sale_date in", values, "onSaleDate");
            return (Criteria) this;
        }

        public Criteria andOnSaleDateNotIn(List<Date> values) {
            addCriterion("on_sale_date not in", values, "onSaleDate");
            return (Criteria) this;
        }

        public Criteria andOnSaleDateBetween(Date value1, Date value2) {
            addCriterion("on_sale_date between", value1, value2, "onSaleDate");
            return (Criteria) this;
        }

        public Criteria andOnSaleDateNotBetween(Date value1, Date value2) {
            addCriterion("on_sale_date not between", value1, value2, "onSaleDate");
            return (Criteria) this;
        }

        public Criteria andOffSaleDateIsNull() {
            addCriterion("off_sale_date is null");
            return (Criteria) this;
        }

        public Criteria andOffSaleDateIsNotNull() {
            addCriterion("off_sale_date is not null");
            return (Criteria) this;
        }

        public Criteria andOffSaleDateEqualTo(Date value) {
            addCriterion("off_sale_date =", value, "offSaleDate");
            return (Criteria) this;
        }

        public Criteria andOffSaleDateNotEqualTo(Date value) {
            addCriterion("off_sale_date <>", value, "offSaleDate");
            return (Criteria) this;
        }

        public Criteria andOffSaleDateGreaterThan(Date value) {
            addCriterion("off_sale_date >", value, "offSaleDate");
            return (Criteria) this;
        }

        public Criteria andOffSaleDateGreaterThanOrEqualTo(Date value) {
            addCriterion("off_sale_date >=", value, "offSaleDate");
            return (Criteria) this;
        }

        public Criteria andOffSaleDateLessThan(Date value) {
            addCriterion("off_sale_date <", value, "offSaleDate");
            return (Criteria) this;
        }

        public Criteria andOffSaleDateLessThanOrEqualTo(Date value) {
            addCriterion("off_sale_date <=", value, "offSaleDate");
            return (Criteria) this;
        }

        public Criteria andOffSaleDateIn(List<Date> values) {
            addCriterion("off_sale_date in", values, "offSaleDate");
            return (Criteria) this;
        }

        public Criteria andOffSaleDateNotIn(List<Date> values) {
            addCriterion("off_sale_date not in", values, "offSaleDate");
            return (Criteria) this;
        }

        public Criteria andOffSaleDateBetween(Date value1, Date value2) {
            addCriterion("off_sale_date between", value1, value2, "offSaleDate");
            return (Criteria) this;
        }

        public Criteria andOffSaleDateNotBetween(Date value1, Date value2) {
            addCriterion("off_sale_date not between", value1, value2, "offSaleDate");
            return (Criteria) this;
        }

        public Criteria andCategoryLevel1IsNull() {
            addCriterion("category_level1 is null");
            return (Criteria) this;
        }

        public Criteria andCategoryLevel1IsNotNull() {
            addCriterion("category_level1 is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryLevel1EqualTo(Integer value) {
            addCriterion("category_level1 =", value, "categoryLevel1");
            return (Criteria) this;
        }

        public Criteria andCategoryLevel1NotEqualTo(Integer value) {
            addCriterion("category_level1 <>", value, "categoryLevel1");
            return (Criteria) this;
        }

        public Criteria andCategoryLevel1GreaterThan(Integer value) {
            addCriterion("category_level1 >", value, "categoryLevel1");
            return (Criteria) this;
        }

        public Criteria andCategoryLevel1GreaterThanOrEqualTo(Integer value) {
            addCriterion("category_level1 >=", value, "categoryLevel1");
            return (Criteria) this;
        }

        public Criteria andCategoryLevel1LessThan(Integer value) {
            addCriterion("category_level1 <", value, "categoryLevel1");
            return (Criteria) this;
        }

        public Criteria andCategoryLevel1LessThanOrEqualTo(Integer value) {
            addCriterion("category_level1 <=", value, "categoryLevel1");
            return (Criteria) this;
        }

        public Criteria andCategoryLevel1In(List<Integer> values) {
            addCriterion("category_level1 in", values, "categoryLevel1");
            return (Criteria) this;
        }

        public Criteria andCategoryLevel1NotIn(List<Integer> values) {
            addCriterion("category_level1 not in", values, "categoryLevel1");
            return (Criteria) this;
        }

        public Criteria andCategoryLevel1Between(Integer value1, Integer value2) {
            addCriterion("category_level1 between", value1, value2, "categoryLevel1");
            return (Criteria) this;
        }

        public Criteria andCategoryLevel1NotBetween(Integer value1, Integer value2) {
            addCriterion("category_level1 not between", value1, value2, "categoryLevel1");
            return (Criteria) this;
        }

        public Criteria andCategoryLevel2IsNull() {
            addCriterion("category_level2 is null");
            return (Criteria) this;
        }

        public Criteria andCategoryLevel2IsNotNull() {
            addCriterion("category_level2 is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryLevel2EqualTo(Integer value) {
            addCriterion("category_level2 =", value, "categoryLevel2");
            return (Criteria) this;
        }

        public Criteria andCategoryLevel2NotEqualTo(Integer value) {
            addCriterion("category_level2 <>", value, "categoryLevel2");
            return (Criteria) this;
        }

        public Criteria andCategoryLevel2GreaterThan(Integer value) {
            addCriterion("category_level2 >", value, "categoryLevel2");
            return (Criteria) this;
        }

        public Criteria andCategoryLevel2GreaterThanOrEqualTo(Integer value) {
            addCriterion("category_level2 >=", value, "categoryLevel2");
            return (Criteria) this;
        }

        public Criteria andCategoryLevel2LessThan(Integer value) {
            addCriterion("category_level2 <", value, "categoryLevel2");
            return (Criteria) this;
        }

        public Criteria andCategoryLevel2LessThanOrEqualTo(Integer value) {
            addCriterion("category_level2 <=", value, "categoryLevel2");
            return (Criteria) this;
        }

        public Criteria andCategoryLevel2In(List<Integer> values) {
            addCriterion("category_level2 in", values, "categoryLevel2");
            return (Criteria) this;
        }

        public Criteria andCategoryLevel2NotIn(List<Integer> values) {
            addCriterion("category_level2 not in", values, "categoryLevel2");
            return (Criteria) this;
        }

        public Criteria andCategoryLevel2Between(Integer value1, Integer value2) {
            addCriterion("category_level2 between", value1, value2, "categoryLevel2");
            return (Criteria) this;
        }

        public Criteria andCategoryLevel2NotBetween(Integer value1, Integer value2) {
            addCriterion("category_level2 not between", value1, value2, "categoryLevel2");
            return (Criteria) this;
        }

        public Criteria andCategoryLevel3IsNull() {
            addCriterion("category_level3 is null");
            return (Criteria) this;
        }

        public Criteria andCategoryLevel3IsNotNull() {
            addCriterion("category_level3 is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryLevel3EqualTo(Integer value) {
            addCriterion("category_level3 =", value, "categoryLevel3");
            return (Criteria) this;
        }

        public Criteria andCategoryLevel3NotEqualTo(Integer value) {
            addCriterion("category_level3 <>", value, "categoryLevel3");
            return (Criteria) this;
        }

        public Criteria andCategoryLevel3GreaterThan(Integer value) {
            addCriterion("category_level3 >", value, "categoryLevel3");
            return (Criteria) this;
        }

        public Criteria andCategoryLevel3GreaterThanOrEqualTo(Integer value) {
            addCriterion("category_level3 >=", value, "categoryLevel3");
            return (Criteria) this;
        }

        public Criteria andCategoryLevel3LessThan(Integer value) {
            addCriterion("category_level3 <", value, "categoryLevel3");
            return (Criteria) this;
        }

        public Criteria andCategoryLevel3LessThanOrEqualTo(Integer value) {
            addCriterion("category_level3 <=", value, "categoryLevel3");
            return (Criteria) this;
        }

        public Criteria andCategoryLevel3In(List<Integer> values) {
            addCriterion("category_level3 in", values, "categoryLevel3");
            return (Criteria) this;
        }

        public Criteria andCategoryLevel3NotIn(List<Integer> values) {
            addCriterion("category_level3 not in", values, "categoryLevel3");
            return (Criteria) this;
        }

        public Criteria andCategoryLevel3Between(Integer value1, Integer value2) {
            addCriterion("category_level3 between", value1, value2, "categoryLevel3");
            return (Criteria) this;
        }

        public Criteria andCategoryLevel3NotBetween(Integer value1, Integer value2) {
            addCriterion("category_level3 not between", value1, value2, "categoryLevel3");
            return (Criteria) this;
        }

        public Criteria andNowVersionIsNull() {
            addCriterion("now_version is null");
            return (Criteria) this;
        }

        public Criteria andNowVersionIsNotNull() {
            addCriterion("now_version is not null");
            return (Criteria) this;
        }

        public Criteria andNowVersionEqualTo(Long value) {
            addCriterion("now_version =", value, "nowVersion");
            return (Criteria) this;
        }

        public Criteria andNowVersionNotEqualTo(Long value) {
            addCriterion("now_version <>", value, "nowVersion");
            return (Criteria) this;
        }

        public Criteria andNowVersionGreaterThan(Long value) {
            addCriterion("now_version >", value, "nowVersion");
            return (Criteria) this;
        }

        public Criteria andNowVersionGreaterThanOrEqualTo(Long value) {
            addCriterion("now_version >=", value, "nowVersion");
            return (Criteria) this;
        }

        public Criteria andNowVersionLessThan(Long value) {
            addCriterion("now_version <", value, "nowVersion");
            return (Criteria) this;
        }

        public Criteria andNowVersionLessThanOrEqualTo(Long value) {
            addCriterion("now_version <=", value, "nowVersion");
            return (Criteria) this;
        }

        public Criteria andNowVersionIn(List<Long> values) {
            addCriterion("now_version in", values, "nowVersion");
            return (Criteria) this;
        }

        public Criteria andNowVersionNotIn(List<Long> values) {
            addCriterion("now_version not in", values, "nowVersion");
            return (Criteria) this;
        }

        public Criteria andNowVersionBetween(Long value1, Long value2) {
            addCriterion("now_version between", value1, value2, "nowVersion");
            return (Criteria) this;
        }

        public Criteria andNowVersionNotBetween(Long value1, Long value2) {
            addCriterion("now_version not between", value1, value2, "nowVersion");
            return (Criteria) this;
        }

        public Criteria andApplyRecordIdIsNull() {
            addCriterion("apply_record_id is null");
            return (Criteria) this;
        }

        public Criteria andApplyRecordIdIsNotNull() {
            addCriterion("apply_record_id is not null");
            return (Criteria) this;
        }

        public Criteria andApplyRecordIdEqualTo(Long value) {
            addCriterion("apply_record_id =", value, "applyRecordId");
            return (Criteria) this;
        }

        public Criteria andApplyRecordIdNotEqualTo(Long value) {
            addCriterion("apply_record_id <>", value, "applyRecordId");
            return (Criteria) this;
        }

        public Criteria andApplyRecordIdGreaterThan(Long value) {
            addCriterion("apply_record_id >", value, "applyRecordId");
            return (Criteria) this;
        }

        public Criteria andApplyRecordIdGreaterThanOrEqualTo(Long value) {
            addCriterion("apply_record_id >=", value, "applyRecordId");
            return (Criteria) this;
        }

        public Criteria andApplyRecordIdLessThan(Long value) {
            addCriterion("apply_record_id <", value, "applyRecordId");
            return (Criteria) this;
        }

        public Criteria andApplyRecordIdLessThanOrEqualTo(Long value) {
            addCriterion("apply_record_id <=", value, "applyRecordId");
            return (Criteria) this;
        }

        public Criteria andApplyRecordIdIn(List<Long> values) {
            addCriterion("apply_record_id in", values, "applyRecordId");
            return (Criteria) this;
        }

        public Criteria andApplyRecordIdNotIn(List<Long> values) {
            addCriterion("apply_record_id not in", values, "applyRecordId");
            return (Criteria) this;
        }

        public Criteria andApplyRecordIdBetween(Long value1, Long value2) {
            addCriterion("apply_record_id between", value1, value2, "applyRecordId");
            return (Criteria) this;
        }

        public Criteria andApplyRecordIdNotBetween(Long value1, Long value2) {
            addCriterion("apply_record_id not between", value1, value2, "applyRecordId");
            return (Criteria) this;
        }
    }

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