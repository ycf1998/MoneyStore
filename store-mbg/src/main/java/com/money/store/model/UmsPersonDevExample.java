package com.money.store.model;

import java.util.ArrayList;
import java.util.List;

public class UmsPersonDevExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UmsPersonDevExample() {
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

        public Criteria andAppIdIsNull() {
            addCriterion("app_id is null");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNotNull() {
            addCriterion("app_id is not null");
            return (Criteria) this;
        }

        public Criteria andAppIdEqualTo(String value) {
            addCriterion("app_id =", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotEqualTo(String value) {
            addCriterion("app_id <>", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThan(String value) {
            addCriterion("app_id >", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThanOrEqualTo(String value) {
            addCriterion("app_id >=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThan(String value) {
            addCriterion("app_id <", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThanOrEqualTo(String value) {
            addCriterion("app_id <=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLike(String value) {
            addCriterion("app_id like", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotLike(String value) {
            addCriterion("app_id not like", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdIn(List<String> values) {
            addCriterion("app_id in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotIn(List<String> values) {
            addCriterion("app_id not in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdBetween(String value1, String value2) {
            addCriterion("app_id between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotBetween(String value1, String value2) {
            addCriterion("app_id not between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andAppKeyIsNull() {
            addCriterion("app_key is null");
            return (Criteria) this;
        }

        public Criteria andAppKeyIsNotNull() {
            addCriterion("app_key is not null");
            return (Criteria) this;
        }

        public Criteria andAppKeyEqualTo(String value) {
            addCriterion("app_key =", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyNotEqualTo(String value) {
            addCriterion("app_key <>", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyGreaterThan(String value) {
            addCriterion("app_key >", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyGreaterThanOrEqualTo(String value) {
            addCriterion("app_key >=", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyLessThan(String value) {
            addCriterion("app_key <", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyLessThanOrEqualTo(String value) {
            addCriterion("app_key <=", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyLike(String value) {
            addCriterion("app_key like", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyNotLike(String value) {
            addCriterion("app_key not like", value, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyIn(List<String> values) {
            addCriterion("app_key in", values, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyNotIn(List<String> values) {
            addCriterion("app_key not in", values, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyBetween(String value1, String value2) {
            addCriterion("app_key between", value1, value2, "appKey");
            return (Criteria) this;
        }

        public Criteria andAppKeyNotBetween(String value1, String value2) {
            addCriterion("app_key not between", value1, value2, "appKey");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNull() {
            addCriterion("real_name is null");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNotNull() {
            addCriterion("real_name is not null");
            return (Criteria) this;
        }

        public Criteria andRealNameEqualTo(String value) {
            addCriterion("real_name =", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotEqualTo(String value) {
            addCriterion("real_name <>", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThan(String value) {
            addCriterion("real_name >", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("real_name >=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThan(String value) {
            addCriterion("real_name <", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThanOrEqualTo(String value) {
            addCriterion("real_name <=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLike(String value) {
            addCriterion("real_name like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotLike(String value) {
            addCriterion("real_name not like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameIn(List<String> values) {
            addCriterion("real_name in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotIn(List<String> values) {
            addCriterion("real_name not in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameBetween(String value1, String value2) {
            addCriterion("real_name between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotBetween(String value1, String value2) {
            addCriterion("real_name not between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNull() {
            addCriterion("id_card is null");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNotNull() {
            addCriterion("id_card is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardEqualTo(String value) {
            addCriterion("id_card =", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotEqualTo(String value) {
            addCriterion("id_card <>", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThan(String value) {
            addCriterion("id_card >", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("id_card >=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThan(String value) {
            addCriterion("id_card <", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThanOrEqualTo(String value) {
            addCriterion("id_card <=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLike(String value) {
            addCriterion("id_card like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotLike(String value) {
            addCriterion("id_card not like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardIn(List<String> values) {
            addCriterion("id_card in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotIn(List<String> values) {
            addCriterion("id_card not in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardBetween(String value1, String value2) {
            addCriterion("id_card between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotBetween(String value1, String value2) {
            addCriterion("id_card not between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardPicIsNull() {
            addCriterion("id_card_pic is null");
            return (Criteria) this;
        }

        public Criteria andIdCardPicIsNotNull() {
            addCriterion("id_card_pic is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardPicEqualTo(String value) {
            addCriterion("id_card_pic =", value, "idCardPic");
            return (Criteria) this;
        }

        public Criteria andIdCardPicNotEqualTo(String value) {
            addCriterion("id_card_pic <>", value, "idCardPic");
            return (Criteria) this;
        }

        public Criteria andIdCardPicGreaterThan(String value) {
            addCriterion("id_card_pic >", value, "idCardPic");
            return (Criteria) this;
        }

        public Criteria andIdCardPicGreaterThanOrEqualTo(String value) {
            addCriterion("id_card_pic >=", value, "idCardPic");
            return (Criteria) this;
        }

        public Criteria andIdCardPicLessThan(String value) {
            addCriterion("id_card_pic <", value, "idCardPic");
            return (Criteria) this;
        }

        public Criteria andIdCardPicLessThanOrEqualTo(String value) {
            addCriterion("id_card_pic <=", value, "idCardPic");
            return (Criteria) this;
        }

        public Criteria andIdCardPicLike(String value) {
            addCriterion("id_card_pic like", value, "idCardPic");
            return (Criteria) this;
        }

        public Criteria andIdCardPicNotLike(String value) {
            addCriterion("id_card_pic not like", value, "idCardPic");
            return (Criteria) this;
        }

        public Criteria andIdCardPicIn(List<String> values) {
            addCriterion("id_card_pic in", values, "idCardPic");
            return (Criteria) this;
        }

        public Criteria andIdCardPicNotIn(List<String> values) {
            addCriterion("id_card_pic not in", values, "idCardPic");
            return (Criteria) this;
        }

        public Criteria andIdCardPicBetween(String value1, String value2) {
            addCriterion("id_card_pic between", value1, value2, "idCardPic");
            return (Criteria) this;
        }

        public Criteria andIdCardPicNotBetween(String value1, String value2) {
            addCriterion("id_card_pic not between", value1, value2, "idCardPic");
            return (Criteria) this;
        }

        public Criteria andCardholderIsNull() {
            addCriterion("cardholder is null");
            return (Criteria) this;
        }

        public Criteria andCardholderIsNotNull() {
            addCriterion("cardholder is not null");
            return (Criteria) this;
        }

        public Criteria andCardholderEqualTo(String value) {
            addCriterion("cardholder =", value, "cardholder");
            return (Criteria) this;
        }

        public Criteria andCardholderNotEqualTo(String value) {
            addCriterion("cardholder <>", value, "cardholder");
            return (Criteria) this;
        }

        public Criteria andCardholderGreaterThan(String value) {
            addCriterion("cardholder >", value, "cardholder");
            return (Criteria) this;
        }

        public Criteria andCardholderGreaterThanOrEqualTo(String value) {
            addCriterion("cardholder >=", value, "cardholder");
            return (Criteria) this;
        }

        public Criteria andCardholderLessThan(String value) {
            addCriterion("cardholder <", value, "cardholder");
            return (Criteria) this;
        }

        public Criteria andCardholderLessThanOrEqualTo(String value) {
            addCriterion("cardholder <=", value, "cardholder");
            return (Criteria) this;
        }

        public Criteria andCardholderLike(String value) {
            addCriterion("cardholder like", value, "cardholder");
            return (Criteria) this;
        }

        public Criteria andCardholderNotLike(String value) {
            addCriterion("cardholder not like", value, "cardholder");
            return (Criteria) this;
        }

        public Criteria andCardholderIn(List<String> values) {
            addCriterion("cardholder in", values, "cardholder");
            return (Criteria) this;
        }

        public Criteria andCardholderNotIn(List<String> values) {
            addCriterion("cardholder not in", values, "cardholder");
            return (Criteria) this;
        }

        public Criteria andCardholderBetween(String value1, String value2) {
            addCriterion("cardholder between", value1, value2, "cardholder");
            return (Criteria) this;
        }

        public Criteria andCardholderNotBetween(String value1, String value2) {
            addCriterion("cardholder not between", value1, value2, "cardholder");
            return (Criteria) this;
        }

        public Criteria andBankCardTypeIsNull() {
            addCriterion("bank_card_type is null");
            return (Criteria) this;
        }

        public Criteria andBankCardTypeIsNotNull() {
            addCriterion("bank_card_type is not null");
            return (Criteria) this;
        }

        public Criteria andBankCardTypeEqualTo(String value) {
            addCriterion("bank_card_type =", value, "bankCardType");
            return (Criteria) this;
        }

        public Criteria andBankCardTypeNotEqualTo(String value) {
            addCriterion("bank_card_type <>", value, "bankCardType");
            return (Criteria) this;
        }

        public Criteria andBankCardTypeGreaterThan(String value) {
            addCriterion("bank_card_type >", value, "bankCardType");
            return (Criteria) this;
        }

        public Criteria andBankCardTypeGreaterThanOrEqualTo(String value) {
            addCriterion("bank_card_type >=", value, "bankCardType");
            return (Criteria) this;
        }

        public Criteria andBankCardTypeLessThan(String value) {
            addCriterion("bank_card_type <", value, "bankCardType");
            return (Criteria) this;
        }

        public Criteria andBankCardTypeLessThanOrEqualTo(String value) {
            addCriterion("bank_card_type <=", value, "bankCardType");
            return (Criteria) this;
        }

        public Criteria andBankCardTypeLike(String value) {
            addCriterion("bank_card_type like", value, "bankCardType");
            return (Criteria) this;
        }

        public Criteria andBankCardTypeNotLike(String value) {
            addCriterion("bank_card_type not like", value, "bankCardType");
            return (Criteria) this;
        }

        public Criteria andBankCardTypeIn(List<String> values) {
            addCriterion("bank_card_type in", values, "bankCardType");
            return (Criteria) this;
        }

        public Criteria andBankCardTypeNotIn(List<String> values) {
            addCriterion("bank_card_type not in", values, "bankCardType");
            return (Criteria) this;
        }

        public Criteria andBankCardTypeBetween(String value1, String value2) {
            addCriterion("bank_card_type between", value1, value2, "bankCardType");
            return (Criteria) this;
        }

        public Criteria andBankCardTypeNotBetween(String value1, String value2) {
            addCriterion("bank_card_type not between", value1, value2, "bankCardType");
            return (Criteria) this;
        }

        public Criteria andBankCardNumberIsNull() {
            addCriterion("bank_card_number is null");
            return (Criteria) this;
        }

        public Criteria andBankCardNumberIsNotNull() {
            addCriterion("bank_card_number is not null");
            return (Criteria) this;
        }

        public Criteria andBankCardNumberEqualTo(String value) {
            addCriterion("bank_card_number =", value, "bankCardNumber");
            return (Criteria) this;
        }

        public Criteria andBankCardNumberNotEqualTo(String value) {
            addCriterion("bank_card_number <>", value, "bankCardNumber");
            return (Criteria) this;
        }

        public Criteria andBankCardNumberGreaterThan(String value) {
            addCriterion("bank_card_number >", value, "bankCardNumber");
            return (Criteria) this;
        }

        public Criteria andBankCardNumberGreaterThanOrEqualTo(String value) {
            addCriterion("bank_card_number >=", value, "bankCardNumber");
            return (Criteria) this;
        }

        public Criteria andBankCardNumberLessThan(String value) {
            addCriterion("bank_card_number <", value, "bankCardNumber");
            return (Criteria) this;
        }

        public Criteria andBankCardNumberLessThanOrEqualTo(String value) {
            addCriterion("bank_card_number <=", value, "bankCardNumber");
            return (Criteria) this;
        }

        public Criteria andBankCardNumberLike(String value) {
            addCriterion("bank_card_number like", value, "bankCardNumber");
            return (Criteria) this;
        }

        public Criteria andBankCardNumberNotLike(String value) {
            addCriterion("bank_card_number not like", value, "bankCardNumber");
            return (Criteria) this;
        }

        public Criteria andBankCardNumberIn(List<String> values) {
            addCriterion("bank_card_number in", values, "bankCardNumber");
            return (Criteria) this;
        }

        public Criteria andBankCardNumberNotIn(List<String> values) {
            addCriterion("bank_card_number not in", values, "bankCardNumber");
            return (Criteria) this;
        }

        public Criteria andBankCardNumberBetween(String value1, String value2) {
            addCriterion("bank_card_number between", value1, value2, "bankCardNumber");
            return (Criteria) this;
        }

        public Criteria andBankCardNumberNotBetween(String value1, String value2) {
            addCriterion("bank_card_number not between", value1, value2, "bankCardNumber");
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