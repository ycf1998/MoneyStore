package com.money.store.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UmsUserStatisticsInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UmsUserStatisticsInfoExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andDownloadAmountIsNull() {
            addCriterion("download_amount is null");
            return (Criteria) this;
        }

        public Criteria andDownloadAmountIsNotNull() {
            addCriterion("download_amount is not null");
            return (Criteria) this;
        }

        public Criteria andDownloadAmountEqualTo(String value) {
            addCriterion("download_amount =", value, "downloadAmount");
            return (Criteria) this;
        }

        public Criteria andDownloadAmountNotEqualTo(String value) {
            addCriterion("download_amount <>", value, "downloadAmount");
            return (Criteria) this;
        }

        public Criteria andDownloadAmountGreaterThan(String value) {
            addCriterion("download_amount >", value, "downloadAmount");
            return (Criteria) this;
        }

        public Criteria andDownloadAmountGreaterThanOrEqualTo(String value) {
            addCriterion("download_amount >=", value, "downloadAmount");
            return (Criteria) this;
        }

        public Criteria andDownloadAmountLessThan(String value) {
            addCriterion("download_amount <", value, "downloadAmount");
            return (Criteria) this;
        }

        public Criteria andDownloadAmountLessThanOrEqualTo(String value) {
            addCriterion("download_amount <=", value, "downloadAmount");
            return (Criteria) this;
        }

        public Criteria andDownloadAmountLike(String value) {
            addCriterion("download_amount like", value, "downloadAmount");
            return (Criteria) this;
        }

        public Criteria andDownloadAmountNotLike(String value) {
            addCriterion("download_amount not like", value, "downloadAmount");
            return (Criteria) this;
        }

        public Criteria andDownloadAmountIn(List<String> values) {
            addCriterion("download_amount in", values, "downloadAmount");
            return (Criteria) this;
        }

        public Criteria andDownloadAmountNotIn(List<String> values) {
            addCriterion("download_amount not in", values, "downloadAmount");
            return (Criteria) this;
        }

        public Criteria andDownloadAmountBetween(String value1, String value2) {
            addCriterion("download_amount between", value1, value2, "downloadAmount");
            return (Criteria) this;
        }

        public Criteria andDownloadAmountNotBetween(String value1, String value2) {
            addCriterion("download_amount not between", value1, value2, "downloadAmount");
            return (Criteria) this;
        }

        public Criteria andConsumeAmountIsNull() {
            addCriterion("consume_amount is null");
            return (Criteria) this;
        }

        public Criteria andConsumeAmountIsNotNull() {
            addCriterion("consume_amount is not null");
            return (Criteria) this;
        }

        public Criteria andConsumeAmountEqualTo(BigDecimal value) {
            addCriterion("consume_amount =", value, "consumeAmount");
            return (Criteria) this;
        }

        public Criteria andConsumeAmountNotEqualTo(BigDecimal value) {
            addCriterion("consume_amount <>", value, "consumeAmount");
            return (Criteria) this;
        }

        public Criteria andConsumeAmountGreaterThan(BigDecimal value) {
            addCriterion("consume_amount >", value, "consumeAmount");
            return (Criteria) this;
        }

        public Criteria andConsumeAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("consume_amount >=", value, "consumeAmount");
            return (Criteria) this;
        }

        public Criteria andConsumeAmountLessThan(BigDecimal value) {
            addCriterion("consume_amount <", value, "consumeAmount");
            return (Criteria) this;
        }

        public Criteria andConsumeAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("consume_amount <=", value, "consumeAmount");
            return (Criteria) this;
        }

        public Criteria andConsumeAmountIn(List<BigDecimal> values) {
            addCriterion("consume_amount in", values, "consumeAmount");
            return (Criteria) this;
        }

        public Criteria andConsumeAmountNotIn(List<BigDecimal> values) {
            addCriterion("consume_amount not in", values, "consumeAmount");
            return (Criteria) this;
        }

        public Criteria andConsumeAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("consume_amount between", value1, value2, "consumeAmount");
            return (Criteria) this;
        }

        public Criteria andConsumeAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("consume_amount not between", value1, value2, "consumeAmount");
            return (Criteria) this;
        }

        public Criteria andOrderCountIsNull() {
            addCriterion("order_count is null");
            return (Criteria) this;
        }

        public Criteria andOrderCountIsNotNull() {
            addCriterion("order_count is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCountEqualTo(Integer value) {
            addCriterion("order_count =", value, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountNotEqualTo(Integer value) {
            addCriterion("order_count <>", value, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountGreaterThan(Integer value) {
            addCriterion("order_count >", value, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_count >=", value, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountLessThan(Integer value) {
            addCriterion("order_count <", value, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountLessThanOrEqualTo(Integer value) {
            addCriterion("order_count <=", value, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountIn(List<Integer> values) {
            addCriterion("order_count in", values, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountNotIn(List<Integer> values) {
            addCriterion("order_count not in", values, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountBetween(Integer value1, Integer value2) {
            addCriterion("order_count between", value1, value2, "orderCount");
            return (Criteria) this;
        }

        public Criteria andOrderCountNotBetween(Integer value1, Integer value2) {
            addCriterion("order_count not between", value1, value2, "orderCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountIsNull() {
            addCriterion("comment_count is null");
            return (Criteria) this;
        }

        public Criteria andCommentCountIsNotNull() {
            addCriterion("comment_count is not null");
            return (Criteria) this;
        }

        public Criteria andCommentCountEqualTo(Integer value) {
            addCriterion("comment_count =", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountNotEqualTo(Integer value) {
            addCriterion("comment_count <>", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountGreaterThan(Integer value) {
            addCriterion("comment_count >", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_count >=", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountLessThan(Integer value) {
            addCriterion("comment_count <", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountLessThanOrEqualTo(Integer value) {
            addCriterion("comment_count <=", value, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountIn(List<Integer> values) {
            addCriterion("comment_count in", values, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountNotIn(List<Integer> values) {
            addCriterion("comment_count not in", values, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountBetween(Integer value1, Integer value2) {
            addCriterion("comment_count between", value1, value2, "commentCount");
            return (Criteria) this;
        }

        public Criteria andCommentCountNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_count not between", value1, value2, "commentCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountIsNull() {
            addCriterion("login_count is null");
            return (Criteria) this;
        }

        public Criteria andLoginCountIsNotNull() {
            addCriterion("login_count is not null");
            return (Criteria) this;
        }

        public Criteria andLoginCountEqualTo(Integer value) {
            addCriterion("login_count =", value, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountNotEqualTo(Integer value) {
            addCriterion("login_count <>", value, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountGreaterThan(Integer value) {
            addCriterion("login_count >", value, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("login_count >=", value, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountLessThan(Integer value) {
            addCriterion("login_count <", value, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountLessThanOrEqualTo(Integer value) {
            addCriterion("login_count <=", value, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountIn(List<Integer> values) {
            addCriterion("login_count in", values, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountNotIn(List<Integer> values) {
            addCriterion("login_count not in", values, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountBetween(Integer value1, Integer value2) {
            addCriterion("login_count between", value1, value2, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountNotBetween(Integer value1, Integer value2) {
            addCriterion("login_count not between", value1, value2, "loginCount");
            return (Criteria) this;
        }

        public Criteria andAttendCountIsNull() {
            addCriterion("attend_count is null");
            return (Criteria) this;
        }

        public Criteria andAttendCountIsNotNull() {
            addCriterion("attend_count is not null");
            return (Criteria) this;
        }

        public Criteria andAttendCountEqualTo(Integer value) {
            addCriterion("attend_count =", value, "attendCount");
            return (Criteria) this;
        }

        public Criteria andAttendCountNotEqualTo(Integer value) {
            addCriterion("attend_count <>", value, "attendCount");
            return (Criteria) this;
        }

        public Criteria andAttendCountGreaterThan(Integer value) {
            addCriterion("attend_count >", value, "attendCount");
            return (Criteria) this;
        }

        public Criteria andAttendCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("attend_count >=", value, "attendCount");
            return (Criteria) this;
        }

        public Criteria andAttendCountLessThan(Integer value) {
            addCriterion("attend_count <", value, "attendCount");
            return (Criteria) this;
        }

        public Criteria andAttendCountLessThanOrEqualTo(Integer value) {
            addCriterion("attend_count <=", value, "attendCount");
            return (Criteria) this;
        }

        public Criteria andAttendCountIn(List<Integer> values) {
            addCriterion("attend_count in", values, "attendCount");
            return (Criteria) this;
        }

        public Criteria andAttendCountNotIn(List<Integer> values) {
            addCriterion("attend_count not in", values, "attendCount");
            return (Criteria) this;
        }

        public Criteria andAttendCountBetween(Integer value1, Integer value2) {
            addCriterion("attend_count between", value1, value2, "attendCount");
            return (Criteria) this;
        }

        public Criteria andAttendCountNotBetween(Integer value1, Integer value2) {
            addCriterion("attend_count not between", value1, value2, "attendCount");
            return (Criteria) this;
        }

        public Criteria andFansCountIsNull() {
            addCriterion("fans_count is null");
            return (Criteria) this;
        }

        public Criteria andFansCountIsNotNull() {
            addCriterion("fans_count is not null");
            return (Criteria) this;
        }

        public Criteria andFansCountEqualTo(Integer value) {
            addCriterion("fans_count =", value, "fansCount");
            return (Criteria) this;
        }

        public Criteria andFansCountNotEqualTo(Integer value) {
            addCriterion("fans_count <>", value, "fansCount");
            return (Criteria) this;
        }

        public Criteria andFansCountGreaterThan(Integer value) {
            addCriterion("fans_count >", value, "fansCount");
            return (Criteria) this;
        }

        public Criteria andFansCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("fans_count >=", value, "fansCount");
            return (Criteria) this;
        }

        public Criteria andFansCountLessThan(Integer value) {
            addCriterion("fans_count <", value, "fansCount");
            return (Criteria) this;
        }

        public Criteria andFansCountLessThanOrEqualTo(Integer value) {
            addCriterion("fans_count <=", value, "fansCount");
            return (Criteria) this;
        }

        public Criteria andFansCountIn(List<Integer> values) {
            addCriterion("fans_count in", values, "fansCount");
            return (Criteria) this;
        }

        public Criteria andFansCountNotIn(List<Integer> values) {
            addCriterion("fans_count not in", values, "fansCount");
            return (Criteria) this;
        }

        public Criteria andFansCountBetween(Integer value1, Integer value2) {
            addCriterion("fans_count between", value1, value2, "fansCount");
            return (Criteria) this;
        }

        public Criteria andFansCountNotBetween(Integer value1, Integer value2) {
            addCriterion("fans_count not between", value1, value2, "fansCount");
            return (Criteria) this;
        }

        public Criteria andCollectAppCountIsNull() {
            addCriterion("collect_app_count is null");
            return (Criteria) this;
        }

        public Criteria andCollectAppCountIsNotNull() {
            addCriterion("collect_app_count is not null");
            return (Criteria) this;
        }

        public Criteria andCollectAppCountEqualTo(Integer value) {
            addCriterion("collect_app_count =", value, "collectAppCount");
            return (Criteria) this;
        }

        public Criteria andCollectAppCountNotEqualTo(Integer value) {
            addCriterion("collect_app_count <>", value, "collectAppCount");
            return (Criteria) this;
        }

        public Criteria andCollectAppCountGreaterThan(Integer value) {
            addCriterion("collect_app_count >", value, "collectAppCount");
            return (Criteria) this;
        }

        public Criteria andCollectAppCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("collect_app_count >=", value, "collectAppCount");
            return (Criteria) this;
        }

        public Criteria andCollectAppCountLessThan(Integer value) {
            addCriterion("collect_app_count <", value, "collectAppCount");
            return (Criteria) this;
        }

        public Criteria andCollectAppCountLessThanOrEqualTo(Integer value) {
            addCriterion("collect_app_count <=", value, "collectAppCount");
            return (Criteria) this;
        }

        public Criteria andCollectAppCountIn(List<Integer> values) {
            addCriterion("collect_app_count in", values, "collectAppCount");
            return (Criteria) this;
        }

        public Criteria andCollectAppCountNotIn(List<Integer> values) {
            addCriterion("collect_app_count not in", values, "collectAppCount");
            return (Criteria) this;
        }

        public Criteria andCollectAppCountBetween(Integer value1, Integer value2) {
            addCriterion("collect_app_count between", value1, value2, "collectAppCount");
            return (Criteria) this;
        }

        public Criteria andCollectAppCountNotBetween(Integer value1, Integer value2) {
            addCriterion("collect_app_count not between", value1, value2, "collectAppCount");
            return (Criteria) this;
        }

        public Criteria andCollectTopicCountIsNull() {
            addCriterion("collect_topic_count is null");
            return (Criteria) this;
        }

        public Criteria andCollectTopicCountIsNotNull() {
            addCriterion("collect_topic_count is not null");
            return (Criteria) this;
        }

        public Criteria andCollectTopicCountEqualTo(Integer value) {
            addCriterion("collect_topic_count =", value, "collectTopicCount");
            return (Criteria) this;
        }

        public Criteria andCollectTopicCountNotEqualTo(Integer value) {
            addCriterion("collect_topic_count <>", value, "collectTopicCount");
            return (Criteria) this;
        }

        public Criteria andCollectTopicCountGreaterThan(Integer value) {
            addCriterion("collect_topic_count >", value, "collectTopicCount");
            return (Criteria) this;
        }

        public Criteria andCollectTopicCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("collect_topic_count >=", value, "collectTopicCount");
            return (Criteria) this;
        }

        public Criteria andCollectTopicCountLessThan(Integer value) {
            addCriterion("collect_topic_count <", value, "collectTopicCount");
            return (Criteria) this;
        }

        public Criteria andCollectTopicCountLessThanOrEqualTo(Integer value) {
            addCriterion("collect_topic_count <=", value, "collectTopicCount");
            return (Criteria) this;
        }

        public Criteria andCollectTopicCountIn(List<Integer> values) {
            addCriterion("collect_topic_count in", values, "collectTopicCount");
            return (Criteria) this;
        }

        public Criteria andCollectTopicCountNotIn(List<Integer> values) {
            addCriterion("collect_topic_count not in", values, "collectTopicCount");
            return (Criteria) this;
        }

        public Criteria andCollectTopicCountBetween(Integer value1, Integer value2) {
            addCriterion("collect_topic_count between", value1, value2, "collectTopicCount");
            return (Criteria) this;
        }

        public Criteria andCollectTopicCountNotBetween(Integer value1, Integer value2) {
            addCriterion("collect_topic_count not between", value1, value2, "collectTopicCount");
            return (Criteria) this;
        }

        public Criteria andRecentDownloadTimeIsNull() {
            addCriterion("recent_download_time is null");
            return (Criteria) this;
        }

        public Criteria andRecentDownloadTimeIsNotNull() {
            addCriterion("recent_download_time is not null");
            return (Criteria) this;
        }

        public Criteria andRecentDownloadTimeEqualTo(Date value) {
            addCriterion("recent_download_time =", value, "recentDownloadTime");
            return (Criteria) this;
        }

        public Criteria andRecentDownloadTimeNotEqualTo(Date value) {
            addCriterion("recent_download_time <>", value, "recentDownloadTime");
            return (Criteria) this;
        }

        public Criteria andRecentDownloadTimeGreaterThan(Date value) {
            addCriterion("recent_download_time >", value, "recentDownloadTime");
            return (Criteria) this;
        }

        public Criteria andRecentDownloadTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("recent_download_time >=", value, "recentDownloadTime");
            return (Criteria) this;
        }

        public Criteria andRecentDownloadTimeLessThan(Date value) {
            addCriterion("recent_download_time <", value, "recentDownloadTime");
            return (Criteria) this;
        }

        public Criteria andRecentDownloadTimeLessThanOrEqualTo(Date value) {
            addCriterion("recent_download_time <=", value, "recentDownloadTime");
            return (Criteria) this;
        }

        public Criteria andRecentDownloadTimeIn(List<Date> values) {
            addCriterion("recent_download_time in", values, "recentDownloadTime");
            return (Criteria) this;
        }

        public Criteria andRecentDownloadTimeNotIn(List<Date> values) {
            addCriterion("recent_download_time not in", values, "recentDownloadTime");
            return (Criteria) this;
        }

        public Criteria andRecentDownloadTimeBetween(Date value1, Date value2) {
            addCriterion("recent_download_time between", value1, value2, "recentDownloadTime");
            return (Criteria) this;
        }

        public Criteria andRecentDownloadTimeNotBetween(Date value1, Date value2) {
            addCriterion("recent_download_time not between", value1, value2, "recentDownloadTime");
            return (Criteria) this;
        }

        public Criteria andAppCountIsNull() {
            addCriterion("app_count is null");
            return (Criteria) this;
        }

        public Criteria andAppCountIsNotNull() {
            addCriterion("app_count is not null");
            return (Criteria) this;
        }

        public Criteria andAppCountEqualTo(Integer value) {
            addCriterion("app_count =", value, "appCount");
            return (Criteria) this;
        }

        public Criteria andAppCountNotEqualTo(Integer value) {
            addCriterion("app_count <>", value, "appCount");
            return (Criteria) this;
        }

        public Criteria andAppCountGreaterThan(Integer value) {
            addCriterion("app_count >", value, "appCount");
            return (Criteria) this;
        }

        public Criteria andAppCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("app_count >=", value, "appCount");
            return (Criteria) this;
        }

        public Criteria andAppCountLessThan(Integer value) {
            addCriterion("app_count <", value, "appCount");
            return (Criteria) this;
        }

        public Criteria andAppCountLessThanOrEqualTo(Integer value) {
            addCriterion("app_count <=", value, "appCount");
            return (Criteria) this;
        }

        public Criteria andAppCountIn(List<Integer> values) {
            addCriterion("app_count in", values, "appCount");
            return (Criteria) this;
        }

        public Criteria andAppCountNotIn(List<Integer> values) {
            addCriterion("app_count not in", values, "appCount");
            return (Criteria) this;
        }

        public Criteria andAppCountBetween(Integer value1, Integer value2) {
            addCriterion("app_count between", value1, value2, "appCount");
            return (Criteria) this;
        }

        public Criteria andAppCountNotBetween(Integer value1, Integer value2) {
            addCriterion("app_count not between", value1, value2, "appCount");
            return (Criteria) this;
        }

        public Criteria andOnSaleAppCountIsNull() {
            addCriterion("on_sale_app_count is null");
            return (Criteria) this;
        }

        public Criteria andOnSaleAppCountIsNotNull() {
            addCriterion("on_sale_app_count is not null");
            return (Criteria) this;
        }

        public Criteria andOnSaleAppCountEqualTo(Integer value) {
            addCriterion("on_sale_app_count =", value, "onSaleAppCount");
            return (Criteria) this;
        }

        public Criteria andOnSaleAppCountNotEqualTo(Integer value) {
            addCriterion("on_sale_app_count <>", value, "onSaleAppCount");
            return (Criteria) this;
        }

        public Criteria andOnSaleAppCountGreaterThan(Integer value) {
            addCriterion("on_sale_app_count >", value, "onSaleAppCount");
            return (Criteria) this;
        }

        public Criteria andOnSaleAppCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("on_sale_app_count >=", value, "onSaleAppCount");
            return (Criteria) this;
        }

        public Criteria andOnSaleAppCountLessThan(Integer value) {
            addCriterion("on_sale_app_count <", value, "onSaleAppCount");
            return (Criteria) this;
        }

        public Criteria andOnSaleAppCountLessThanOrEqualTo(Integer value) {
            addCriterion("on_sale_app_count <=", value, "onSaleAppCount");
            return (Criteria) this;
        }

        public Criteria andOnSaleAppCountIn(List<Integer> values) {
            addCriterion("on_sale_app_count in", values, "onSaleAppCount");
            return (Criteria) this;
        }

        public Criteria andOnSaleAppCountNotIn(List<Integer> values) {
            addCriterion("on_sale_app_count not in", values, "onSaleAppCount");
            return (Criteria) this;
        }

        public Criteria andOnSaleAppCountBetween(Integer value1, Integer value2) {
            addCriterion("on_sale_app_count between", value1, value2, "onSaleAppCount");
            return (Criteria) this;
        }

        public Criteria andOnSaleAppCountNotBetween(Integer value1, Integer value2) {
            addCriterion("on_sale_app_count not between", value1, value2, "onSaleAppCount");
            return (Criteria) this;
        }

        public Criteria andDevDownloadedCountIsNull() {
            addCriterion("dev_downloaded_count is null");
            return (Criteria) this;
        }

        public Criteria andDevDownloadedCountIsNotNull() {
            addCriterion("dev_downloaded_count is not null");
            return (Criteria) this;
        }

        public Criteria andDevDownloadedCountEqualTo(Integer value) {
            addCriterion("dev_downloaded_count =", value, "devDownloadedCount");
            return (Criteria) this;
        }

        public Criteria andDevDownloadedCountNotEqualTo(Integer value) {
            addCriterion("dev_downloaded_count <>", value, "devDownloadedCount");
            return (Criteria) this;
        }

        public Criteria andDevDownloadedCountGreaterThan(Integer value) {
            addCriterion("dev_downloaded_count >", value, "devDownloadedCount");
            return (Criteria) this;
        }

        public Criteria andDevDownloadedCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("dev_downloaded_count >=", value, "devDownloadedCount");
            return (Criteria) this;
        }

        public Criteria andDevDownloadedCountLessThan(Integer value) {
            addCriterion("dev_downloaded_count <", value, "devDownloadedCount");
            return (Criteria) this;
        }

        public Criteria andDevDownloadedCountLessThanOrEqualTo(Integer value) {
            addCriterion("dev_downloaded_count <=", value, "devDownloadedCount");
            return (Criteria) this;
        }

        public Criteria andDevDownloadedCountIn(List<Integer> values) {
            addCriterion("dev_downloaded_count in", values, "devDownloadedCount");
            return (Criteria) this;
        }

        public Criteria andDevDownloadedCountNotIn(List<Integer> values) {
            addCriterion("dev_downloaded_count not in", values, "devDownloadedCount");
            return (Criteria) this;
        }

        public Criteria andDevDownloadedCountBetween(Integer value1, Integer value2) {
            addCriterion("dev_downloaded_count between", value1, value2, "devDownloadedCount");
            return (Criteria) this;
        }

        public Criteria andDevDownloadedCountNotBetween(Integer value1, Integer value2) {
            addCriterion("dev_downloaded_count not between", value1, value2, "devDownloadedCount");
            return (Criteria) this;
        }

        public Criteria andDevLoginCountIsNull() {
            addCriterion("dev_login_count is null");
            return (Criteria) this;
        }

        public Criteria andDevLoginCountIsNotNull() {
            addCriterion("dev_login_count is not null");
            return (Criteria) this;
        }

        public Criteria andDevLoginCountEqualTo(Integer value) {
            addCriterion("dev_login_count =", value, "devLoginCount");
            return (Criteria) this;
        }

        public Criteria andDevLoginCountNotEqualTo(Integer value) {
            addCriterion("dev_login_count <>", value, "devLoginCount");
            return (Criteria) this;
        }

        public Criteria andDevLoginCountGreaterThan(Integer value) {
            addCriterion("dev_login_count >", value, "devLoginCount");
            return (Criteria) this;
        }

        public Criteria andDevLoginCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("dev_login_count >=", value, "devLoginCount");
            return (Criteria) this;
        }

        public Criteria andDevLoginCountLessThan(Integer value) {
            addCriterion("dev_login_count <", value, "devLoginCount");
            return (Criteria) this;
        }

        public Criteria andDevLoginCountLessThanOrEqualTo(Integer value) {
            addCriterion("dev_login_count <=", value, "devLoginCount");
            return (Criteria) this;
        }

        public Criteria andDevLoginCountIn(List<Integer> values) {
            addCriterion("dev_login_count in", values, "devLoginCount");
            return (Criteria) this;
        }

        public Criteria andDevLoginCountNotIn(List<Integer> values) {
            addCriterion("dev_login_count not in", values, "devLoginCount");
            return (Criteria) this;
        }

        public Criteria andDevLoginCountBetween(Integer value1, Integer value2) {
            addCriterion("dev_login_count between", value1, value2, "devLoginCount");
            return (Criteria) this;
        }

        public Criteria andDevLoginCountNotBetween(Integer value1, Integer value2) {
            addCriterion("dev_login_count not between", value1, value2, "devLoginCount");
            return (Criteria) this;
        }

        public Criteria andRecentPublishTimeIsNull() {
            addCriterion("recent_publish_time is null");
            return (Criteria) this;
        }

        public Criteria andRecentPublishTimeIsNotNull() {
            addCriterion("recent_publish_time is not null");
            return (Criteria) this;
        }

        public Criteria andRecentPublishTimeEqualTo(Date value) {
            addCriterion("recent_publish_time =", value, "recentPublishTime");
            return (Criteria) this;
        }

        public Criteria andRecentPublishTimeNotEqualTo(Date value) {
            addCriterion("recent_publish_time <>", value, "recentPublishTime");
            return (Criteria) this;
        }

        public Criteria andRecentPublishTimeGreaterThan(Date value) {
            addCriterion("recent_publish_time >", value, "recentPublishTime");
            return (Criteria) this;
        }

        public Criteria andRecentPublishTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("recent_publish_time >=", value, "recentPublishTime");
            return (Criteria) this;
        }

        public Criteria andRecentPublishTimeLessThan(Date value) {
            addCriterion("recent_publish_time <", value, "recentPublishTime");
            return (Criteria) this;
        }

        public Criteria andRecentPublishTimeLessThanOrEqualTo(Date value) {
            addCriterion("recent_publish_time <=", value, "recentPublishTime");
            return (Criteria) this;
        }

        public Criteria andRecentPublishTimeIn(List<Date> values) {
            addCriterion("recent_publish_time in", values, "recentPublishTime");
            return (Criteria) this;
        }

        public Criteria andRecentPublishTimeNotIn(List<Date> values) {
            addCriterion("recent_publish_time not in", values, "recentPublishTime");
            return (Criteria) this;
        }

        public Criteria andRecentPublishTimeBetween(Date value1, Date value2) {
            addCriterion("recent_publish_time between", value1, value2, "recentPublishTime");
            return (Criteria) this;
        }

        public Criteria andRecentPublishTimeNotBetween(Date value1, Date value2) {
            addCriterion("recent_publish_time not between", value1, value2, "recentPublishTime");
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