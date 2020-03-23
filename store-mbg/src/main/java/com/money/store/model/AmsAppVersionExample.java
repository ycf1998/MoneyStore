package com.money.store.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AmsAppVersionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AmsAppVersionExample() {
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

        public Criteria andAppIdIsNull() {
            addCriterion("app_id is null");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNotNull() {
            addCriterion("app_id is not null");
            return (Criteria) this;
        }

        public Criteria andAppIdEqualTo(Long value) {
            addCriterion("app_id =", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotEqualTo(Long value) {
            addCriterion("app_id <>", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThan(Long value) {
            addCriterion("app_id >", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThanOrEqualTo(Long value) {
            addCriterion("app_id >=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThan(Long value) {
            addCriterion("app_id <", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThanOrEqualTo(Long value) {
            addCriterion("app_id <=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdIn(List<Long> values) {
            addCriterion("app_id in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotIn(List<Long> values) {
            addCriterion("app_id not in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdBetween(Long value1, Long value2) {
            addCriterion("app_id between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotBetween(Long value1, Long value2) {
            addCriterion("app_id not between", value1, value2, "appId");
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

        public Criteria andApkSizeIsNull() {
            addCriterion("apk_size is null");
            return (Criteria) this;
        }

        public Criteria andApkSizeIsNotNull() {
            addCriterion("apk_size is not null");
            return (Criteria) this;
        }

        public Criteria andApkSizeEqualTo(String value) {
            addCriterion("apk_size =", value, "apkSize");
            return (Criteria) this;
        }

        public Criteria andApkSizeNotEqualTo(String value) {
            addCriterion("apk_size <>", value, "apkSize");
            return (Criteria) this;
        }

        public Criteria andApkSizeGreaterThan(String value) {
            addCriterion("apk_size >", value, "apkSize");
            return (Criteria) this;
        }

        public Criteria andApkSizeGreaterThanOrEqualTo(String value) {
            addCriterion("apk_size >=", value, "apkSize");
            return (Criteria) this;
        }

        public Criteria andApkSizeLessThan(String value) {
            addCriterion("apk_size <", value, "apkSize");
            return (Criteria) this;
        }

        public Criteria andApkSizeLessThanOrEqualTo(String value) {
            addCriterion("apk_size <=", value, "apkSize");
            return (Criteria) this;
        }

        public Criteria andApkSizeLike(String value) {
            addCriterion("apk_size like", value, "apkSize");
            return (Criteria) this;
        }

        public Criteria andApkSizeNotLike(String value) {
            addCriterion("apk_size not like", value, "apkSize");
            return (Criteria) this;
        }

        public Criteria andApkSizeIn(List<String> values) {
            addCriterion("apk_size in", values, "apkSize");
            return (Criteria) this;
        }

        public Criteria andApkSizeNotIn(List<String> values) {
            addCriterion("apk_size not in", values, "apkSize");
            return (Criteria) this;
        }

        public Criteria andApkSizeBetween(String value1, String value2) {
            addCriterion("apk_size between", value1, value2, "apkSize");
            return (Criteria) this;
        }

        public Criteria andApkSizeNotBetween(String value1, String value2) {
            addCriterion("apk_size not between", value1, value2, "apkSize");
            return (Criteria) this;
        }

        public Criteria andPackageNameIsNull() {
            addCriterion("package_name is null");
            return (Criteria) this;
        }

        public Criteria andPackageNameIsNotNull() {
            addCriterion("package_name is not null");
            return (Criteria) this;
        }

        public Criteria andPackageNameEqualTo(String value) {
            addCriterion("package_name =", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameNotEqualTo(String value) {
            addCriterion("package_name <>", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameGreaterThan(String value) {
            addCriterion("package_name >", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameGreaterThanOrEqualTo(String value) {
            addCriterion("package_name >=", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameLessThan(String value) {
            addCriterion("package_name <", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameLessThanOrEqualTo(String value) {
            addCriterion("package_name <=", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameLike(String value) {
            addCriterion("package_name like", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameNotLike(String value) {
            addCriterion("package_name not like", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameIn(List<String> values) {
            addCriterion("package_name in", values, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameNotIn(List<String> values) {
            addCriterion("package_name not in", values, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameBetween(String value1, String value2) {
            addCriterion("package_name between", value1, value2, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameNotBetween(String value1, String value2) {
            addCriterion("package_name not between", value1, value2, "packageName");
            return (Criteria) this;
        }

        public Criteria andVersionNameIsNull() {
            addCriterion("version_name is null");
            return (Criteria) this;
        }

        public Criteria andVersionNameIsNotNull() {
            addCriterion("version_name is not null");
            return (Criteria) this;
        }

        public Criteria andVersionNameEqualTo(String value) {
            addCriterion("version_name =", value, "versionName");
            return (Criteria) this;
        }

        public Criteria andVersionNameNotEqualTo(String value) {
            addCriterion("version_name <>", value, "versionName");
            return (Criteria) this;
        }

        public Criteria andVersionNameGreaterThan(String value) {
            addCriterion("version_name >", value, "versionName");
            return (Criteria) this;
        }

        public Criteria andVersionNameGreaterThanOrEqualTo(String value) {
            addCriterion("version_name >=", value, "versionName");
            return (Criteria) this;
        }

        public Criteria andVersionNameLessThan(String value) {
            addCriterion("version_name <", value, "versionName");
            return (Criteria) this;
        }

        public Criteria andVersionNameLessThanOrEqualTo(String value) {
            addCriterion("version_name <=", value, "versionName");
            return (Criteria) this;
        }

        public Criteria andVersionNameLike(String value) {
            addCriterion("version_name like", value, "versionName");
            return (Criteria) this;
        }

        public Criteria andVersionNameNotLike(String value) {
            addCriterion("version_name not like", value, "versionName");
            return (Criteria) this;
        }

        public Criteria andVersionNameIn(List<String> values) {
            addCriterion("version_name in", values, "versionName");
            return (Criteria) this;
        }

        public Criteria andVersionNameNotIn(List<String> values) {
            addCriterion("version_name not in", values, "versionName");
            return (Criteria) this;
        }

        public Criteria andVersionNameBetween(String value1, String value2) {
            addCriterion("version_name between", value1, value2, "versionName");
            return (Criteria) this;
        }

        public Criteria andVersionNameNotBetween(String value1, String value2) {
            addCriterion("version_name not between", value1, value2, "versionName");
            return (Criteria) this;
        }

        public Criteria andVersionNumberIsNull() {
            addCriterion("version_number is null");
            return (Criteria) this;
        }

        public Criteria andVersionNumberIsNotNull() {
            addCriterion("version_number is not null");
            return (Criteria) this;
        }

        public Criteria andVersionNumberEqualTo(String value) {
            addCriterion("version_number =", value, "versionNumber");
            return (Criteria) this;
        }

        public Criteria andVersionNumberNotEqualTo(String value) {
            addCriterion("version_number <>", value, "versionNumber");
            return (Criteria) this;
        }

        public Criteria andVersionNumberGreaterThan(String value) {
            addCriterion("version_number >", value, "versionNumber");
            return (Criteria) this;
        }

        public Criteria andVersionNumberGreaterThanOrEqualTo(String value) {
            addCriterion("version_number >=", value, "versionNumber");
            return (Criteria) this;
        }

        public Criteria andVersionNumberLessThan(String value) {
            addCriterion("version_number <", value, "versionNumber");
            return (Criteria) this;
        }

        public Criteria andVersionNumberLessThanOrEqualTo(String value) {
            addCriterion("version_number <=", value, "versionNumber");
            return (Criteria) this;
        }

        public Criteria andVersionNumberLike(String value) {
            addCriterion("version_number like", value, "versionNumber");
            return (Criteria) this;
        }

        public Criteria andVersionNumberNotLike(String value) {
            addCriterion("version_number not like", value, "versionNumber");
            return (Criteria) this;
        }

        public Criteria andVersionNumberIn(List<String> values) {
            addCriterion("version_number in", values, "versionNumber");
            return (Criteria) this;
        }

        public Criteria andVersionNumberNotIn(List<String> values) {
            addCriterion("version_number not in", values, "versionNumber");
            return (Criteria) this;
        }

        public Criteria andVersionNumberBetween(String value1, String value2) {
            addCriterion("version_number between", value1, value2, "versionNumber");
            return (Criteria) this;
        }

        public Criteria andVersionNumberNotBetween(String value1, String value2) {
            addCriterion("version_number not between", value1, value2, "versionNumber");
            return (Criteria) this;
        }

        public Criteria andSdkVersionIsNull() {
            addCriterion("sdk_version is null");
            return (Criteria) this;
        }

        public Criteria andSdkVersionIsNotNull() {
            addCriterion("sdk_version is not null");
            return (Criteria) this;
        }

        public Criteria andSdkVersionEqualTo(String value) {
            addCriterion("sdk_version =", value, "sdkVersion");
            return (Criteria) this;
        }

        public Criteria andSdkVersionNotEqualTo(String value) {
            addCriterion("sdk_version <>", value, "sdkVersion");
            return (Criteria) this;
        }

        public Criteria andSdkVersionGreaterThan(String value) {
            addCriterion("sdk_version >", value, "sdkVersion");
            return (Criteria) this;
        }

        public Criteria andSdkVersionGreaterThanOrEqualTo(String value) {
            addCriterion("sdk_version >=", value, "sdkVersion");
            return (Criteria) this;
        }

        public Criteria andSdkVersionLessThan(String value) {
            addCriterion("sdk_version <", value, "sdkVersion");
            return (Criteria) this;
        }

        public Criteria andSdkVersionLessThanOrEqualTo(String value) {
            addCriterion("sdk_version <=", value, "sdkVersion");
            return (Criteria) this;
        }

        public Criteria andSdkVersionLike(String value) {
            addCriterion("sdk_version like", value, "sdkVersion");
            return (Criteria) this;
        }

        public Criteria andSdkVersionNotLike(String value) {
            addCriterion("sdk_version not like", value, "sdkVersion");
            return (Criteria) this;
        }

        public Criteria andSdkVersionIn(List<String> values) {
            addCriterion("sdk_version in", values, "sdkVersion");
            return (Criteria) this;
        }

        public Criteria andSdkVersionNotIn(List<String> values) {
            addCriterion("sdk_version not in", values, "sdkVersion");
            return (Criteria) this;
        }

        public Criteria andSdkVersionBetween(String value1, String value2) {
            addCriterion("sdk_version between", value1, value2, "sdkVersion");
            return (Criteria) this;
        }

        public Criteria andSdkVersionNotBetween(String value1, String value2) {
            addCriterion("sdk_version not between", value1, value2, "sdkVersion");
            return (Criteria) this;
        }

        public Criteria andTargetSdkVersionIsNull() {
            addCriterion("target_sdk_version is null");
            return (Criteria) this;
        }

        public Criteria andTargetSdkVersionIsNotNull() {
            addCriterion("target_sdk_version is not null");
            return (Criteria) this;
        }

        public Criteria andTargetSdkVersionEqualTo(String value) {
            addCriterion("target_sdk_version =", value, "targetSdkVersion");
            return (Criteria) this;
        }

        public Criteria andTargetSdkVersionNotEqualTo(String value) {
            addCriterion("target_sdk_version <>", value, "targetSdkVersion");
            return (Criteria) this;
        }

        public Criteria andTargetSdkVersionGreaterThan(String value) {
            addCriterion("target_sdk_version >", value, "targetSdkVersion");
            return (Criteria) this;
        }

        public Criteria andTargetSdkVersionGreaterThanOrEqualTo(String value) {
            addCriterion("target_sdk_version >=", value, "targetSdkVersion");
            return (Criteria) this;
        }

        public Criteria andTargetSdkVersionLessThan(String value) {
            addCriterion("target_sdk_version <", value, "targetSdkVersion");
            return (Criteria) this;
        }

        public Criteria andTargetSdkVersionLessThanOrEqualTo(String value) {
            addCriterion("target_sdk_version <=", value, "targetSdkVersion");
            return (Criteria) this;
        }

        public Criteria andTargetSdkVersionLike(String value) {
            addCriterion("target_sdk_version like", value, "targetSdkVersion");
            return (Criteria) this;
        }

        public Criteria andTargetSdkVersionNotLike(String value) {
            addCriterion("target_sdk_version not like", value, "targetSdkVersion");
            return (Criteria) this;
        }

        public Criteria andTargetSdkVersionIn(List<String> values) {
            addCriterion("target_sdk_version in", values, "targetSdkVersion");
            return (Criteria) this;
        }

        public Criteria andTargetSdkVersionNotIn(List<String> values) {
            addCriterion("target_sdk_version not in", values, "targetSdkVersion");
            return (Criteria) this;
        }

        public Criteria andTargetSdkVersionBetween(String value1, String value2) {
            addCriterion("target_sdk_version between", value1, value2, "targetSdkVersion");
            return (Criteria) this;
        }

        public Criteria andTargetSdkVersionNotBetween(String value1, String value2) {
            addCriterion("target_sdk_version not between", value1, value2, "targetSdkVersion");
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

        public Criteria andOnlineDateIsNull() {
            addCriterion("online_date is null");
            return (Criteria) this;
        }

        public Criteria andOnlineDateIsNotNull() {
            addCriterion("online_date is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineDateEqualTo(Date value) {
            addCriterion("online_date =", value, "onlineDate");
            return (Criteria) this;
        }

        public Criteria andOnlineDateNotEqualTo(Date value) {
            addCriterion("online_date <>", value, "onlineDate");
            return (Criteria) this;
        }

        public Criteria andOnlineDateGreaterThan(Date value) {
            addCriterion("online_date >", value, "onlineDate");
            return (Criteria) this;
        }

        public Criteria andOnlineDateGreaterThanOrEqualTo(Date value) {
            addCriterion("online_date >=", value, "onlineDate");
            return (Criteria) this;
        }

        public Criteria andOnlineDateLessThan(Date value) {
            addCriterion("online_date <", value, "onlineDate");
            return (Criteria) this;
        }

        public Criteria andOnlineDateLessThanOrEqualTo(Date value) {
            addCriterion("online_date <=", value, "onlineDate");
            return (Criteria) this;
        }

        public Criteria andOnlineDateIn(List<Date> values) {
            addCriterion("online_date in", values, "onlineDate");
            return (Criteria) this;
        }

        public Criteria andOnlineDateNotIn(List<Date> values) {
            addCriterion("online_date not in", values, "onlineDate");
            return (Criteria) this;
        }

        public Criteria andOnlineDateBetween(Date value1, Date value2) {
            addCriterion("online_date between", value1, value2, "onlineDate");
            return (Criteria) this;
        }

        public Criteria andOnlineDateNotBetween(Date value1, Date value2) {
            addCriterion("online_date not between", value1, value2, "onlineDate");
            return (Criteria) this;
        }

        public Criteria andOfflineDateIsNull() {
            addCriterion("offline_date is null");
            return (Criteria) this;
        }

        public Criteria andOfflineDateIsNotNull() {
            addCriterion("offline_date is not null");
            return (Criteria) this;
        }

        public Criteria andOfflineDateEqualTo(Date value) {
            addCriterion("offline_date =", value, "offlineDate");
            return (Criteria) this;
        }

        public Criteria andOfflineDateNotEqualTo(Date value) {
            addCriterion("offline_date <>", value, "offlineDate");
            return (Criteria) this;
        }

        public Criteria andOfflineDateGreaterThan(Date value) {
            addCriterion("offline_date >", value, "offlineDate");
            return (Criteria) this;
        }

        public Criteria andOfflineDateGreaterThanOrEqualTo(Date value) {
            addCriterion("offline_date >=", value, "offlineDate");
            return (Criteria) this;
        }

        public Criteria andOfflineDateLessThan(Date value) {
            addCriterion("offline_date <", value, "offlineDate");
            return (Criteria) this;
        }

        public Criteria andOfflineDateLessThanOrEqualTo(Date value) {
            addCriterion("offline_date <=", value, "offlineDate");
            return (Criteria) this;
        }

        public Criteria andOfflineDateIn(List<Date> values) {
            addCriterion("offline_date in", values, "offlineDate");
            return (Criteria) this;
        }

        public Criteria andOfflineDateNotIn(List<Date> values) {
            addCriterion("offline_date not in", values, "offlineDate");
            return (Criteria) this;
        }

        public Criteria andOfflineDateBetween(Date value1, Date value2) {
            addCriterion("offline_date between", value1, value2, "offlineDate");
            return (Criteria) this;
        }

        public Criteria andOfflineDateNotBetween(Date value1, Date value2) {
            addCriterion("offline_date not between", value1, value2, "offlineDate");
            return (Criteria) this;
        }

        public Criteria andApplyUserIsNull() {
            addCriterion("apply_user is null");
            return (Criteria) this;
        }

        public Criteria andApplyUserIsNotNull() {
            addCriterion("apply_user is not null");
            return (Criteria) this;
        }

        public Criteria andApplyUserEqualTo(Long value) {
            addCriterion("apply_user =", value, "applyUser");
            return (Criteria) this;
        }

        public Criteria andApplyUserNotEqualTo(Long value) {
            addCriterion("apply_user <>", value, "applyUser");
            return (Criteria) this;
        }

        public Criteria andApplyUserGreaterThan(Long value) {
            addCriterion("apply_user >", value, "applyUser");
            return (Criteria) this;
        }

        public Criteria andApplyUserGreaterThanOrEqualTo(Long value) {
            addCriterion("apply_user >=", value, "applyUser");
            return (Criteria) this;
        }

        public Criteria andApplyUserLessThan(Long value) {
            addCriterion("apply_user <", value, "applyUser");
            return (Criteria) this;
        }

        public Criteria andApplyUserLessThanOrEqualTo(Long value) {
            addCriterion("apply_user <=", value, "applyUser");
            return (Criteria) this;
        }

        public Criteria andApplyUserIn(List<Long> values) {
            addCriterion("apply_user in", values, "applyUser");
            return (Criteria) this;
        }

        public Criteria andApplyUserNotIn(List<Long> values) {
            addCriterion("apply_user not in", values, "applyUser");
            return (Criteria) this;
        }

        public Criteria andApplyUserBetween(Long value1, Long value2) {
            addCriterion("apply_user between", value1, value2, "applyUser");
            return (Criteria) this;
        }

        public Criteria andApplyUserNotBetween(Long value1, Long value2) {
            addCriterion("apply_user not between", value1, value2, "applyUser");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIsNull() {
            addCriterion("apply_time is null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIsNotNull() {
            addCriterion("apply_time is not null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeEqualTo(Date value) {
            addCriterion("apply_time =", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotEqualTo(Date value) {
            addCriterion("apply_time <>", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThan(Date value) {
            addCriterion("apply_time >", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("apply_time >=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThan(Date value) {
            addCriterion("apply_time <", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThanOrEqualTo(Date value) {
            addCriterion("apply_time <=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIn(List<Date> values) {
            addCriterion("apply_time in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotIn(List<Date> values) {
            addCriterion("apply_time not in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeBetween(Date value1, Date value2) {
            addCriterion("apply_time between", value1, value2, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotBetween(Date value1, Date value2) {
            addCriterion("apply_time not between", value1, value2, "applyTime");
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