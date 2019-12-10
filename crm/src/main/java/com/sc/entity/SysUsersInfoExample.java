package com.sc.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysUsersInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysUsersInfoExample() {
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

        public Criteria andSidIsNull() {
            addCriterion("SID is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("SID is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(BigDecimal value) {
            addCriterion("SID =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(BigDecimal value) {
            addCriterion("SID <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(BigDecimal value) {
            addCriterion("SID >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SID >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(BigDecimal value) {
            addCriterion("SID <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SID <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<BigDecimal> values) {
            addCriterion("SID in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<BigDecimal> values) {
            addCriterion("SID not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SID between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SID not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSnameIsNull() {
            addCriterion("SNAME is null");
            return (Criteria) this;
        }

        public Criteria andSnameIsNotNull() {
            addCriterion("SNAME is not null");
            return (Criteria) this;
        }

        public Criteria andSnameEqualTo(String value) {
            addCriterion("SNAME =", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotEqualTo(String value) {
            addCriterion("SNAME <>", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThan(String value) {
            addCriterion("SNAME >", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThanOrEqualTo(String value) {
            addCriterion("SNAME >=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThan(String value) {
            addCriterion("SNAME <", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThanOrEqualTo(String value) {
            addCriterion("SNAME <=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLike(String value) {
            addCriterion("SNAME like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotLike(String value) {
            addCriterion("SNAME not like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameIn(List<String> values) {
            addCriterion("SNAME in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotIn(List<String> values) {
            addCriterion("SNAME not in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameBetween(String value1, String value2) {
            addCriterion("SNAME between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotBetween(String value1, String value2) {
            addCriterion("SNAME not between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSsexIsNull() {
            addCriterion("SSEX is null");
            return (Criteria) this;
        }

        public Criteria andSsexIsNotNull() {
            addCriterion("SSEX is not null");
            return (Criteria) this;
        }

        public Criteria andSsexEqualTo(String value) {
            addCriterion("SSEX =", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexNotEqualTo(String value) {
            addCriterion("SSEX <>", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexGreaterThan(String value) {
            addCriterion("SSEX >", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexGreaterThanOrEqualTo(String value) {
            addCriterion("SSEX >=", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexLessThan(String value) {
            addCriterion("SSEX <", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexLessThanOrEqualTo(String value) {
            addCriterion("SSEX <=", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexLike(String value) {
            addCriterion("SSEX like", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexNotLike(String value) {
            addCriterion("SSEX not like", value, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexIn(List<String> values) {
            addCriterion("SSEX in", values, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexNotIn(List<String> values) {
            addCriterion("SSEX not in", values, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexBetween(String value1, String value2) {
            addCriterion("SSEX between", value1, value2, "ssex");
            return (Criteria) this;
        }

        public Criteria andSsexNotBetween(String value1, String value2) {
            addCriterion("SSEX not between", value1, value2, "ssex");
            return (Criteria) this;
        }

        public Criteria andSphotoIsNull() {
            addCriterion("SPHOTO is null");
            return (Criteria) this;
        }

        public Criteria andSphotoIsNotNull() {
            addCriterion("SPHOTO is not null");
            return (Criteria) this;
        }

        public Criteria andSphotoEqualTo(String value) {
            addCriterion("SPHOTO =", value, "sphoto");
            return (Criteria) this;
        }

        public Criteria andSphotoNotEqualTo(String value) {
            addCriterion("SPHOTO <>", value, "sphoto");
            return (Criteria) this;
        }

        public Criteria andSphotoGreaterThan(String value) {
            addCriterion("SPHOTO >", value, "sphoto");
            return (Criteria) this;
        }

        public Criteria andSphotoGreaterThanOrEqualTo(String value) {
            addCriterion("SPHOTO >=", value, "sphoto");
            return (Criteria) this;
        }

        public Criteria andSphotoLessThan(String value) {
            addCriterion("SPHOTO <", value, "sphoto");
            return (Criteria) this;
        }

        public Criteria andSphotoLessThanOrEqualTo(String value) {
            addCriterion("SPHOTO <=", value, "sphoto");
            return (Criteria) this;
        }

        public Criteria andSphotoLike(String value) {
            addCriterion("SPHOTO like", value, "sphoto");
            return (Criteria) this;
        }

        public Criteria andSphotoNotLike(String value) {
            addCriterion("SPHOTO not like", value, "sphoto");
            return (Criteria) this;
        }

        public Criteria andSphotoIn(List<String> values) {
            addCriterion("SPHOTO in", values, "sphoto");
            return (Criteria) this;
        }

        public Criteria andSphotoNotIn(List<String> values) {
            addCriterion("SPHOTO not in", values, "sphoto");
            return (Criteria) this;
        }

        public Criteria andSphotoBetween(String value1, String value2) {
            addCriterion("SPHOTO between", value1, value2, "sphoto");
            return (Criteria) this;
        }

        public Criteria andSphotoNotBetween(String value1, String value2) {
            addCriterion("SPHOTO not between", value1, value2, "sphoto");
            return (Criteria) this;
        }

        public Criteria andSidcardIsNull() {
            addCriterion("SIDCARD is null");
            return (Criteria) this;
        }

        public Criteria andSidcardIsNotNull() {
            addCriterion("SIDCARD is not null");
            return (Criteria) this;
        }

        public Criteria andSidcardEqualTo(String value) {
            addCriterion("SIDCARD =", value, "sidcard");
            return (Criteria) this;
        }

        public Criteria andSidcardNotEqualTo(String value) {
            addCriterion("SIDCARD <>", value, "sidcard");
            return (Criteria) this;
        }

        public Criteria andSidcardGreaterThan(String value) {
            addCriterion("SIDCARD >", value, "sidcard");
            return (Criteria) this;
        }

        public Criteria andSidcardGreaterThanOrEqualTo(String value) {
            addCriterion("SIDCARD >=", value, "sidcard");
            return (Criteria) this;
        }

        public Criteria andSidcardLessThan(String value) {
            addCriterion("SIDCARD <", value, "sidcard");
            return (Criteria) this;
        }

        public Criteria andSidcardLessThanOrEqualTo(String value) {
            addCriterion("SIDCARD <=", value, "sidcard");
            return (Criteria) this;
        }

        public Criteria andSidcardLike(String value) {
            addCriterion("SIDCARD like", value, "sidcard");
            return (Criteria) this;
        }

        public Criteria andSidcardNotLike(String value) {
            addCriterion("SIDCARD not like", value, "sidcard");
            return (Criteria) this;
        }

        public Criteria andSidcardIn(List<String> values) {
            addCriterion("SIDCARD in", values, "sidcard");
            return (Criteria) this;
        }

        public Criteria andSidcardNotIn(List<String> values) {
            addCriterion("SIDCARD not in", values, "sidcard");
            return (Criteria) this;
        }

        public Criteria andSidcardBetween(String value1, String value2) {
            addCriterion("SIDCARD between", value1, value2, "sidcard");
            return (Criteria) this;
        }

        public Criteria andSidcardNotBetween(String value1, String value2) {
            addCriterion("SIDCARD not between", value1, value2, "sidcard");
            return (Criteria) this;
        }

        public Criteria andSaddressHomeIsNull() {
            addCriterion("SADDRESS_HOME is null");
            return (Criteria) this;
        }

        public Criteria andSaddressHomeIsNotNull() {
            addCriterion("SADDRESS_HOME is not null");
            return (Criteria) this;
        }

        public Criteria andSaddressHomeEqualTo(String value) {
            addCriterion("SADDRESS_HOME =", value, "saddressHome");
            return (Criteria) this;
        }

        public Criteria andSaddressHomeNotEqualTo(String value) {
            addCriterion("SADDRESS_HOME <>", value, "saddressHome");
            return (Criteria) this;
        }

        public Criteria andSaddressHomeGreaterThan(String value) {
            addCriterion("SADDRESS_HOME >", value, "saddressHome");
            return (Criteria) this;
        }

        public Criteria andSaddressHomeGreaterThanOrEqualTo(String value) {
            addCriterion("SADDRESS_HOME >=", value, "saddressHome");
            return (Criteria) this;
        }

        public Criteria andSaddressHomeLessThan(String value) {
            addCriterion("SADDRESS_HOME <", value, "saddressHome");
            return (Criteria) this;
        }

        public Criteria andSaddressHomeLessThanOrEqualTo(String value) {
            addCriterion("SADDRESS_HOME <=", value, "saddressHome");
            return (Criteria) this;
        }

        public Criteria andSaddressHomeLike(String value) {
            addCriterion("SADDRESS_HOME like", value, "saddressHome");
            return (Criteria) this;
        }

        public Criteria andSaddressHomeNotLike(String value) {
            addCriterion("SADDRESS_HOME not like", value, "saddressHome");
            return (Criteria) this;
        }

        public Criteria andSaddressHomeIn(List<String> values) {
            addCriterion("SADDRESS_HOME in", values, "saddressHome");
            return (Criteria) this;
        }

        public Criteria andSaddressHomeNotIn(List<String> values) {
            addCriterion("SADDRESS_HOME not in", values, "saddressHome");
            return (Criteria) this;
        }

        public Criteria andSaddressHomeBetween(String value1, String value2) {
            addCriterion("SADDRESS_HOME between", value1, value2, "saddressHome");
            return (Criteria) this;
        }

        public Criteria andSaddressHomeNotBetween(String value1, String value2) {
            addCriterion("SADDRESS_HOME not between", value1, value2, "saddressHome");
            return (Criteria) this;
        }

        public Criteria andSaddressNowIsNull() {
            addCriterion("SADDRESS_NOW is null");
            return (Criteria) this;
        }

        public Criteria andSaddressNowIsNotNull() {
            addCriterion("SADDRESS_NOW is not null");
            return (Criteria) this;
        }

        public Criteria andSaddressNowEqualTo(String value) {
            addCriterion("SADDRESS_NOW =", value, "saddressNow");
            return (Criteria) this;
        }

        public Criteria andSaddressNowNotEqualTo(String value) {
            addCriterion("SADDRESS_NOW <>", value, "saddressNow");
            return (Criteria) this;
        }

        public Criteria andSaddressNowGreaterThan(String value) {
            addCriterion("SADDRESS_NOW >", value, "saddressNow");
            return (Criteria) this;
        }

        public Criteria andSaddressNowGreaterThanOrEqualTo(String value) {
            addCriterion("SADDRESS_NOW >=", value, "saddressNow");
            return (Criteria) this;
        }

        public Criteria andSaddressNowLessThan(String value) {
            addCriterion("SADDRESS_NOW <", value, "saddressNow");
            return (Criteria) this;
        }

        public Criteria andSaddressNowLessThanOrEqualTo(String value) {
            addCriterion("SADDRESS_NOW <=", value, "saddressNow");
            return (Criteria) this;
        }

        public Criteria andSaddressNowLike(String value) {
            addCriterion("SADDRESS_NOW like", value, "saddressNow");
            return (Criteria) this;
        }

        public Criteria andSaddressNowNotLike(String value) {
            addCriterion("SADDRESS_NOW not like", value, "saddressNow");
            return (Criteria) this;
        }

        public Criteria andSaddressNowIn(List<String> values) {
            addCriterion("SADDRESS_NOW in", values, "saddressNow");
            return (Criteria) this;
        }

        public Criteria andSaddressNowNotIn(List<String> values) {
            addCriterion("SADDRESS_NOW not in", values, "saddressNow");
            return (Criteria) this;
        }

        public Criteria andSaddressNowBetween(String value1, String value2) {
            addCriterion("SADDRESS_NOW between", value1, value2, "saddressNow");
            return (Criteria) this;
        }

        public Criteria andSaddressNowNotBetween(String value1, String value2) {
            addCriterion("SADDRESS_NOW not between", value1, value2, "saddressNow");
            return (Criteria) this;
        }

        public Criteria andSxlIsNull() {
            addCriterion("SXL is null");
            return (Criteria) this;
        }

        public Criteria andSxlIsNotNull() {
            addCriterion("SXL is not null");
            return (Criteria) this;
        }

        public Criteria andSxlEqualTo(String value) {
            addCriterion("SXL =", value, "sxl");
            return (Criteria) this;
        }

        public Criteria andSxlNotEqualTo(String value) {
            addCriterion("SXL <>", value, "sxl");
            return (Criteria) this;
        }

        public Criteria andSxlGreaterThan(String value) {
            addCriterion("SXL >", value, "sxl");
            return (Criteria) this;
        }

        public Criteria andSxlGreaterThanOrEqualTo(String value) {
            addCriterion("SXL >=", value, "sxl");
            return (Criteria) this;
        }

        public Criteria andSxlLessThan(String value) {
            addCriterion("SXL <", value, "sxl");
            return (Criteria) this;
        }

        public Criteria andSxlLessThanOrEqualTo(String value) {
            addCriterion("SXL <=", value, "sxl");
            return (Criteria) this;
        }

        public Criteria andSxlLike(String value) {
            addCriterion("SXL like", value, "sxl");
            return (Criteria) this;
        }

        public Criteria andSxlNotLike(String value) {
            addCriterion("SXL not like", value, "sxl");
            return (Criteria) this;
        }

        public Criteria andSxlIn(List<String> values) {
            addCriterion("SXL in", values, "sxl");
            return (Criteria) this;
        }

        public Criteria andSxlNotIn(List<String> values) {
            addCriterion("SXL not in", values, "sxl");
            return (Criteria) this;
        }

        public Criteria andSxlBetween(String value1, String value2) {
            addCriterion("SXL between", value1, value2, "sxl");
            return (Criteria) this;
        }

        public Criteria andSxlNotBetween(String value1, String value2) {
            addCriterion("SXL not between", value1, value2, "sxl");
            return (Criteria) this;
        }

        public Criteria andSzzmmIsNull() {
            addCriterion("SZZMM is null");
            return (Criteria) this;
        }

        public Criteria andSzzmmIsNotNull() {
            addCriterion("SZZMM is not null");
            return (Criteria) this;
        }

        public Criteria andSzzmmEqualTo(String value) {
            addCriterion("SZZMM =", value, "szzmm");
            return (Criteria) this;
        }

        public Criteria andSzzmmNotEqualTo(String value) {
            addCriterion("SZZMM <>", value, "szzmm");
            return (Criteria) this;
        }

        public Criteria andSzzmmGreaterThan(String value) {
            addCriterion("SZZMM >", value, "szzmm");
            return (Criteria) this;
        }

        public Criteria andSzzmmGreaterThanOrEqualTo(String value) {
            addCriterion("SZZMM >=", value, "szzmm");
            return (Criteria) this;
        }

        public Criteria andSzzmmLessThan(String value) {
            addCriterion("SZZMM <", value, "szzmm");
            return (Criteria) this;
        }

        public Criteria andSzzmmLessThanOrEqualTo(String value) {
            addCriterion("SZZMM <=", value, "szzmm");
            return (Criteria) this;
        }

        public Criteria andSzzmmLike(String value) {
            addCriterion("SZZMM like", value, "szzmm");
            return (Criteria) this;
        }

        public Criteria andSzzmmNotLike(String value) {
            addCriterion("SZZMM not like", value, "szzmm");
            return (Criteria) this;
        }

        public Criteria andSzzmmIn(List<String> values) {
            addCriterion("SZZMM in", values, "szzmm");
            return (Criteria) this;
        }

        public Criteria andSzzmmNotIn(List<String> values) {
            addCriterion("SZZMM not in", values, "szzmm");
            return (Criteria) this;
        }

        public Criteria andSzzmmBetween(String value1, String value2) {
            addCriterion("SZZMM between", value1, value2, "szzmm");
            return (Criteria) this;
        }

        public Criteria andSzzmmNotBetween(String value1, String value2) {
            addCriterion("SZZMM not between", value1, value2, "szzmm");
            return (Criteria) this;
        }

        public Criteria andSschoolIsNull() {
            addCriterion("SSCHOOL is null");
            return (Criteria) this;
        }

        public Criteria andSschoolIsNotNull() {
            addCriterion("SSCHOOL is not null");
            return (Criteria) this;
        }

        public Criteria andSschoolEqualTo(String value) {
            addCriterion("SSCHOOL =", value, "sschool");
            return (Criteria) this;
        }

        public Criteria andSschoolNotEqualTo(String value) {
            addCriterion("SSCHOOL <>", value, "sschool");
            return (Criteria) this;
        }

        public Criteria andSschoolGreaterThan(String value) {
            addCriterion("SSCHOOL >", value, "sschool");
            return (Criteria) this;
        }

        public Criteria andSschoolGreaterThanOrEqualTo(String value) {
            addCriterion("SSCHOOL >=", value, "sschool");
            return (Criteria) this;
        }

        public Criteria andSschoolLessThan(String value) {
            addCriterion("SSCHOOL <", value, "sschool");
            return (Criteria) this;
        }

        public Criteria andSschoolLessThanOrEqualTo(String value) {
            addCriterion("SSCHOOL <=", value, "sschool");
            return (Criteria) this;
        }

        public Criteria andSschoolLike(String value) {
            addCriterion("SSCHOOL like", value, "sschool");
            return (Criteria) this;
        }

        public Criteria andSschoolNotLike(String value) {
            addCriterion("SSCHOOL not like", value, "sschool");
            return (Criteria) this;
        }

        public Criteria andSschoolIn(List<String> values) {
            addCriterion("SSCHOOL in", values, "sschool");
            return (Criteria) this;
        }

        public Criteria andSschoolNotIn(List<String> values) {
            addCriterion("SSCHOOL not in", values, "sschool");
            return (Criteria) this;
        }

        public Criteria andSschoolBetween(String value1, String value2) {
            addCriterion("SSCHOOL between", value1, value2, "sschool");
            return (Criteria) this;
        }

        public Criteria andSschoolNotBetween(String value1, String value2) {
            addCriterion("SSCHOOL not between", value1, value2, "sschool");
            return (Criteria) this;
        }

        public Criteria andSphoneIsNull() {
            addCriterion("SPHONE is null");
            return (Criteria) this;
        }

        public Criteria andSphoneIsNotNull() {
            addCriterion("SPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andSphoneEqualTo(String value) {
            addCriterion("SPHONE =", value, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneNotEqualTo(String value) {
            addCriterion("SPHONE <>", value, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneGreaterThan(String value) {
            addCriterion("SPHONE >", value, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneGreaterThanOrEqualTo(String value) {
            addCriterion("SPHONE >=", value, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneLessThan(String value) {
            addCriterion("SPHONE <", value, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneLessThanOrEqualTo(String value) {
            addCriterion("SPHONE <=", value, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneLike(String value) {
            addCriterion("SPHONE like", value, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneNotLike(String value) {
            addCriterion("SPHONE not like", value, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneIn(List<String> values) {
            addCriterion("SPHONE in", values, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneNotIn(List<String> values) {
            addCriterion("SPHONE not in", values, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneBetween(String value1, String value2) {
            addCriterion("SPHONE between", value1, value2, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneNotBetween(String value1, String value2) {
            addCriterion("SPHONE not between", value1, value2, "sphone");
            return (Criteria) this;
        }

        public Criteria andSphoneLineIsNull() {
            addCriterion("SPHONE_LINE is null");
            return (Criteria) this;
        }

        public Criteria andSphoneLineIsNotNull() {
            addCriterion("SPHONE_LINE is not null");
            return (Criteria) this;
        }

        public Criteria andSphoneLineEqualTo(String value) {
            addCriterion("SPHONE_LINE =", value, "sphoneLine");
            return (Criteria) this;
        }

        public Criteria andSphoneLineNotEqualTo(String value) {
            addCriterion("SPHONE_LINE <>", value, "sphoneLine");
            return (Criteria) this;
        }

        public Criteria andSphoneLineGreaterThan(String value) {
            addCriterion("SPHONE_LINE >", value, "sphoneLine");
            return (Criteria) this;
        }

        public Criteria andSphoneLineGreaterThanOrEqualTo(String value) {
            addCriterion("SPHONE_LINE >=", value, "sphoneLine");
            return (Criteria) this;
        }

        public Criteria andSphoneLineLessThan(String value) {
            addCriterion("SPHONE_LINE <", value, "sphoneLine");
            return (Criteria) this;
        }

        public Criteria andSphoneLineLessThanOrEqualTo(String value) {
            addCriterion("SPHONE_LINE <=", value, "sphoneLine");
            return (Criteria) this;
        }

        public Criteria andSphoneLineLike(String value) {
            addCriterion("SPHONE_LINE like", value, "sphoneLine");
            return (Criteria) this;
        }

        public Criteria andSphoneLineNotLike(String value) {
            addCriterion("SPHONE_LINE not like", value, "sphoneLine");
            return (Criteria) this;
        }

        public Criteria andSphoneLineIn(List<String> values) {
            addCriterion("SPHONE_LINE in", values, "sphoneLine");
            return (Criteria) this;
        }

        public Criteria andSphoneLineNotIn(List<String> values) {
            addCriterion("SPHONE_LINE not in", values, "sphoneLine");
            return (Criteria) this;
        }

        public Criteria andSphoneLineBetween(String value1, String value2) {
            addCriterion("SPHONE_LINE between", value1, value2, "sphoneLine");
            return (Criteria) this;
        }

        public Criteria andSphoneLineNotBetween(String value1, String value2) {
            addCriterion("SPHONE_LINE not between", value1, value2, "sphoneLine");
            return (Criteria) this;
        }

        public Criteria andSchatLineIsNull() {
            addCriterion("SCHAT_LINE is null");
            return (Criteria) this;
        }

        public Criteria andSchatLineIsNotNull() {
            addCriterion("SCHAT_LINE is not null");
            return (Criteria) this;
        }

        public Criteria andSchatLineEqualTo(String value) {
            addCriterion("SCHAT_LINE =", value, "schatLine");
            return (Criteria) this;
        }

        public Criteria andSchatLineNotEqualTo(String value) {
            addCriterion("SCHAT_LINE <>", value, "schatLine");
            return (Criteria) this;
        }

        public Criteria andSchatLineGreaterThan(String value) {
            addCriterion("SCHAT_LINE >", value, "schatLine");
            return (Criteria) this;
        }

        public Criteria andSchatLineGreaterThanOrEqualTo(String value) {
            addCriterion("SCHAT_LINE >=", value, "schatLine");
            return (Criteria) this;
        }

        public Criteria andSchatLineLessThan(String value) {
            addCriterion("SCHAT_LINE <", value, "schatLine");
            return (Criteria) this;
        }

        public Criteria andSchatLineLessThanOrEqualTo(String value) {
            addCriterion("SCHAT_LINE <=", value, "schatLine");
            return (Criteria) this;
        }

        public Criteria andSchatLineLike(String value) {
            addCriterion("SCHAT_LINE like", value, "schatLine");
            return (Criteria) this;
        }

        public Criteria andSchatLineNotLike(String value) {
            addCriterion("SCHAT_LINE not like", value, "schatLine");
            return (Criteria) this;
        }

        public Criteria andSchatLineIn(List<String> values) {
            addCriterion("SCHAT_LINE in", values, "schatLine");
            return (Criteria) this;
        }

        public Criteria andSchatLineNotIn(List<String> values) {
            addCriterion("SCHAT_LINE not in", values, "schatLine");
            return (Criteria) this;
        }

        public Criteria andSchatLineBetween(String value1, String value2) {
            addCriterion("SCHAT_LINE between", value1, value2, "schatLine");
            return (Criteria) this;
        }

        public Criteria andSchatLineNotBetween(String value1, String value2) {
            addCriterion("SCHAT_LINE not between", value1, value2, "schatLine");
            return (Criteria) this;
        }

        public Criteria andSshStatusIsNull() {
            addCriterion("SSH_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andSshStatusIsNotNull() {
            addCriterion("SSH_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andSshStatusEqualTo(String value) {
            addCriterion("SSH_STATUS =", value, "sshStatus");
            return (Criteria) this;
        }

        public Criteria andSshStatusNotEqualTo(String value) {
            addCriterion("SSH_STATUS <>", value, "sshStatus");
            return (Criteria) this;
        }

        public Criteria andSshStatusGreaterThan(String value) {
            addCriterion("SSH_STATUS >", value, "sshStatus");
            return (Criteria) this;
        }

        public Criteria andSshStatusGreaterThanOrEqualTo(String value) {
            addCriterion("SSH_STATUS >=", value, "sshStatus");
            return (Criteria) this;
        }

        public Criteria andSshStatusLessThan(String value) {
            addCriterion("SSH_STATUS <", value, "sshStatus");
            return (Criteria) this;
        }

        public Criteria andSshStatusLessThanOrEqualTo(String value) {
            addCriterion("SSH_STATUS <=", value, "sshStatus");
            return (Criteria) this;
        }

        public Criteria andSshStatusLike(String value) {
            addCriterion("SSH_STATUS like", value, "sshStatus");
            return (Criteria) this;
        }

        public Criteria andSshStatusNotLike(String value) {
            addCriterion("SSH_STATUS not like", value, "sshStatus");
            return (Criteria) this;
        }

        public Criteria andSshStatusIn(List<String> values) {
            addCriterion("SSH_STATUS in", values, "sshStatus");
            return (Criteria) this;
        }

        public Criteria andSshStatusNotIn(List<String> values) {
            addCriterion("SSH_STATUS not in", values, "sshStatus");
            return (Criteria) this;
        }

        public Criteria andSshStatusBetween(String value1, String value2) {
            addCriterion("SSH_STATUS between", value1, value2, "sshStatus");
            return (Criteria) this;
        }

        public Criteria andSshStatusNotBetween(String value1, String value2) {
            addCriterion("SSH_STATUS not between", value1, value2, "sshStatus");
            return (Criteria) this;
        }

        public Criteria andSjobidIsNull() {
            addCriterion("SJOBID is null");
            return (Criteria) this;
        }

        public Criteria andSjobidIsNotNull() {
            addCriterion("SJOBID is not null");
            return (Criteria) this;
        }

        public Criteria andSjobidEqualTo(BigDecimal value) {
            addCriterion("SJOBID =", value, "sjobid");
            return (Criteria) this;
        }

        public Criteria andSjobidNotEqualTo(BigDecimal value) {
            addCriterion("SJOBID <>", value, "sjobid");
            return (Criteria) this;
        }

        public Criteria andSjobidGreaterThan(BigDecimal value) {
            addCriterion("SJOBID >", value, "sjobid");
            return (Criteria) this;
        }

        public Criteria andSjobidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SJOBID >=", value, "sjobid");
            return (Criteria) this;
        }

        public Criteria andSjobidLessThan(BigDecimal value) {
            addCriterion("SJOBID <", value, "sjobid");
            return (Criteria) this;
        }

        public Criteria andSjobidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SJOBID <=", value, "sjobid");
            return (Criteria) this;
        }

        public Criteria andSjobidIn(List<BigDecimal> values) {
            addCriterion("SJOBID in", values, "sjobid");
            return (Criteria) this;
        }

        public Criteria andSjobidNotIn(List<BigDecimal> values) {
            addCriterion("SJOBID not in", values, "sjobid");
            return (Criteria) this;
        }

        public Criteria andSjobidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SJOBID between", value1, value2, "sjobid");
            return (Criteria) this;
        }

        public Criteria andSjobidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SJOBID not between", value1, value2, "sjobid");
            return (Criteria) this;
        }

        public Criteria andSstatusIsNull() {
            addCriterion("SSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andSstatusIsNotNull() {
            addCriterion("SSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andSstatusEqualTo(String value) {
            addCriterion("SSTATUS =", value, "sstatus");
            return (Criteria) this;
        }

        public Criteria andSstatusNotEqualTo(String value) {
            addCriterion("SSTATUS <>", value, "sstatus");
            return (Criteria) this;
        }

        public Criteria andSstatusGreaterThan(String value) {
            addCriterion("SSTATUS >", value, "sstatus");
            return (Criteria) this;
        }

        public Criteria andSstatusGreaterThanOrEqualTo(String value) {
            addCriterion("SSTATUS >=", value, "sstatus");
            return (Criteria) this;
        }

        public Criteria andSstatusLessThan(String value) {
            addCriterion("SSTATUS <", value, "sstatus");
            return (Criteria) this;
        }

        public Criteria andSstatusLessThanOrEqualTo(String value) {
            addCriterion("SSTATUS <=", value, "sstatus");
            return (Criteria) this;
        }

        public Criteria andSstatusLike(String value) {
            addCriterion("SSTATUS like", value, "sstatus");
            return (Criteria) this;
        }

        public Criteria andSstatusNotLike(String value) {
            addCriterion("SSTATUS not like", value, "sstatus");
            return (Criteria) this;
        }

        public Criteria andSstatusIn(List<String> values) {
            addCriterion("SSTATUS in", values, "sstatus");
            return (Criteria) this;
        }

        public Criteria andSstatusNotIn(List<String> values) {
            addCriterion("SSTATUS not in", values, "sstatus");
            return (Criteria) this;
        }

        public Criteria andSstatusBetween(String value1, String value2) {
            addCriterion("SSTATUS between", value1, value2, "sstatus");
            return (Criteria) this;
        }

        public Criteria andSstatusNotBetween(String value1, String value2) {
            addCriterion("SSTATUS not between", value1, value2, "sstatus");
            return (Criteria) this;
        }

        public Criteria andSdescribeIsNull() {
            addCriterion("SDESCRIBE is null");
            return (Criteria) this;
        }

        public Criteria andSdescribeIsNotNull() {
            addCriterion("SDESCRIBE is not null");
            return (Criteria) this;
        }

        public Criteria andSdescribeEqualTo(String value) {
            addCriterion("SDESCRIBE =", value, "sdescribe");
            return (Criteria) this;
        }

        public Criteria andSdescribeNotEqualTo(String value) {
            addCriterion("SDESCRIBE <>", value, "sdescribe");
            return (Criteria) this;
        }

        public Criteria andSdescribeGreaterThan(String value) {
            addCriterion("SDESCRIBE >", value, "sdescribe");
            return (Criteria) this;
        }

        public Criteria andSdescribeGreaterThanOrEqualTo(String value) {
            addCriterion("SDESCRIBE >=", value, "sdescribe");
            return (Criteria) this;
        }

        public Criteria andSdescribeLessThan(String value) {
            addCriterion("SDESCRIBE <", value, "sdescribe");
            return (Criteria) this;
        }

        public Criteria andSdescribeLessThanOrEqualTo(String value) {
            addCriterion("SDESCRIBE <=", value, "sdescribe");
            return (Criteria) this;
        }

        public Criteria andSdescribeLike(String value) {
            addCriterion("SDESCRIBE like", value, "sdescribe");
            return (Criteria) this;
        }

        public Criteria andSdescribeNotLike(String value) {
            addCriterion("SDESCRIBE not like", value, "sdescribe");
            return (Criteria) this;
        }

        public Criteria andSdescribeIn(List<String> values) {
            addCriterion("SDESCRIBE in", values, "sdescribe");
            return (Criteria) this;
        }

        public Criteria andSdescribeNotIn(List<String> values) {
            addCriterion("SDESCRIBE not in", values, "sdescribe");
            return (Criteria) this;
        }

        public Criteria andSdescribeBetween(String value1, String value2) {
            addCriterion("SDESCRIBE between", value1, value2, "sdescribe");
            return (Criteria) this;
        }

        public Criteria andSdescribeNotBetween(String value1, String value2) {
            addCriterion("SDESCRIBE not between", value1, value2, "sdescribe");
            return (Criteria) this;
        }

        public Criteria andGongsiidIsNull() {
            addCriterion("GONGSIID is null");
            return (Criteria) this;
        }

        public Criteria andGongsiidIsNotNull() {
            addCriterion("GONGSIID is not null");
            return (Criteria) this;
        }

        public Criteria andGongsiidEqualTo(BigDecimal value) {
            addCriterion("GONGSIID =", value, "gongsiid");
            return (Criteria) this;
        }

        public Criteria andGongsiidNotEqualTo(BigDecimal value) {
            addCriterion("GONGSIID <>", value, "gongsiid");
            return (Criteria) this;
        }

        public Criteria andGongsiidGreaterThan(BigDecimal value) {
            addCriterion("GONGSIID >", value, "gongsiid");
            return (Criteria) this;
        }

        public Criteria andGongsiidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GONGSIID >=", value, "gongsiid");
            return (Criteria) this;
        }

        public Criteria andGongsiidLessThan(BigDecimal value) {
            addCriterion("GONGSIID <", value, "gongsiid");
            return (Criteria) this;
        }

        public Criteria andGongsiidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GONGSIID <=", value, "gongsiid");
            return (Criteria) this;
        }

        public Criteria andGongsiidIn(List<BigDecimal> values) {
            addCriterion("GONGSIID in", values, "gongsiid");
            return (Criteria) this;
        }

        public Criteria andGongsiidNotIn(List<BigDecimal> values) {
            addCriterion("GONGSIID not in", values, "gongsiid");
            return (Criteria) this;
        }

        public Criteria andGongsiidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GONGSIID between", value1, value2, "gongsiid");
            return (Criteria) this;
        }

        public Criteria andGongsiidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GONGSIID not between", value1, value2, "gongsiid");
            return (Criteria) this;
        }

        public Criteria andLasttimeIsNull() {
            addCriterion("LASTTIME is null");
            return (Criteria) this;
        }

        public Criteria andLasttimeIsNotNull() {
            addCriterion("LASTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andLasttimeEqualTo(Date value) {
            addCriterion("LASTTIME =", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeNotEqualTo(Date value) {
            addCriterion("LASTTIME <>", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeGreaterThan(Date value) {
            addCriterion("LASTTIME >", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LASTTIME >=", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeLessThan(Date value) {
            addCriterion("LASTTIME <", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeLessThanOrEqualTo(Date value) {
            addCriterion("LASTTIME <=", value, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeIn(List<Date> values) {
            addCriterion("LASTTIME in", values, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeNotIn(List<Date> values) {
            addCriterion("LASTTIME not in", values, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeBetween(Date value1, Date value2) {
            addCriterion("LASTTIME between", value1, value2, "lasttime");
            return (Criteria) this;
        }

        public Criteria andLasttimeNotBetween(Date value1, Date value2) {
            addCriterion("LASTTIME not between", value1, value2, "lasttime");
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