package com.sc.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JH_CGDExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JH_CGDExample() {
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

        public Criteria andCgdIdIsNull() {
            addCriterion("CGD_ID is null");
            return (Criteria) this;
        }

        public Criteria andCgdIdIsNotNull() {
            addCriterion("CGD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCgdIdEqualTo(Long value) {
            addCriterion("CGD_ID =", value, "cgdId");
            return (Criteria) this;
        }

        public Criteria andCgdIdNotEqualTo(Long value) {
            addCriterion("CGD_ID <>", value, "cgdId");
            return (Criteria) this;
        }

        public Criteria andCgdIdGreaterThan(Long value) {
            addCriterion("CGD_ID >", value, "cgdId");
            return (Criteria) this;
        }

        public Criteria andCgdIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CGD_ID >=", value, "cgdId");
            return (Criteria) this;
        }

        public Criteria andCgdIdLessThan(Long value) {
            addCriterion("CGD_ID <", value, "cgdId");
            return (Criteria) this;
        }

        public Criteria andCgdIdLessThanOrEqualTo(Long value) {
            addCriterion("CGD_ID <=", value, "cgdId");
            return (Criteria) this;
        }

        public Criteria andCgdIdIn(List<Long> values) {
            addCriterion("CGD_ID in", values, "cgdId");
            return (Criteria) this;
        }

        public Criteria andCgdIdNotIn(List<Long> values) {
            addCriterion("CGD_ID not in", values, "cgdId");
            return (Criteria) this;
        }

        public Criteria andCgdIdBetween(Long value1, Long value2) {
            addCriterion("CGD_ID between", value1, value2, "cgdId");
            return (Criteria) this;
        }

        public Criteria andCgdIdNotBetween(Long value1, Long value2) {
            addCriterion("CGD_ID not between", value1, value2, "cgdId");
            return (Criteria) this;
        }

        public Criteria andCgThemeIsNull() {
            addCriterion("CG_THEME is null");
            return (Criteria) this;
        }

        public Criteria andCgThemeIsNotNull() {
            addCriterion("CG_THEME is not null");
            return (Criteria) this;
        }

        public Criteria andCgThemeEqualTo(String value) {
            addCriterion("CG_THEME =", value, "cgTheme");
            return (Criteria) this;
        }

        public Criteria andCgThemeNotEqualTo(String value) {
            addCriterion("CG_THEME <>", value, "cgTheme");
            return (Criteria) this;
        }

        public Criteria andCgThemeGreaterThan(String value) {
            addCriterion("CG_THEME >", value, "cgTheme");
            return (Criteria) this;
        }

        public Criteria andCgThemeGreaterThanOrEqualTo(String value) {
            addCriterion("CG_THEME >=", value, "cgTheme");
            return (Criteria) this;
        }

        public Criteria andCgThemeLessThan(String value) {
            addCriterion("CG_THEME <", value, "cgTheme");
            return (Criteria) this;
        }

        public Criteria andCgThemeLessThanOrEqualTo(String value) {
            addCriterion("CG_THEME <=", value, "cgTheme");
            return (Criteria) this;
        }

        public Criteria andCgThemeLike(String value) {
            addCriterion("CG_THEME like", value, "cgTheme");
            return (Criteria) this;
        }

        public Criteria andCgThemeNotLike(String value) {
            addCriterion("CG_THEME not like", value, "cgTheme");
            return (Criteria) this;
        }

        public Criteria andCgThemeIn(List<String> values) {
            addCriterion("CG_THEME in", values, "cgTheme");
            return (Criteria) this;
        }

        public Criteria andCgThemeNotIn(List<String> values) {
            addCriterion("CG_THEME not in", values, "cgTheme");
            return (Criteria) this;
        }

        public Criteria andCgThemeBetween(String value1, String value2) {
            addCriterion("CG_THEME between", value1, value2, "cgTheme");
            return (Criteria) this;
        }

        public Criteria andCgThemeNotBetween(String value1, String value2) {
            addCriterion("CG_THEME not between", value1, value2, "cgTheme");
            return (Criteria) this;
        }

        public Criteria andCgTimeIsNull() {
            addCriterion("CG_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCgTimeIsNotNull() {
            addCriterion("CG_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCgTimeEqualTo(Date value) {
            addCriterion("CG_TIME =", value, "cgTime");
            return (Criteria) this;
        }

        public Criteria andCgTimeNotEqualTo(Date value) {
            addCriterion("CG_TIME <>", value, "cgTime");
            return (Criteria) this;
        }

        public Criteria andCgTimeGreaterThan(Date value) {
            addCriterion("CG_TIME >", value, "cgTime");
            return (Criteria) this;
        }

        public Criteria andCgTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CG_TIME >=", value, "cgTime");
            return (Criteria) this;
        }

        public Criteria andCgTimeLessThan(Date value) {
            addCriterion("CG_TIME <", value, "cgTime");
            return (Criteria) this;
        }

        public Criteria andCgTimeLessThanOrEqualTo(Date value) {
            addCriterion("CG_TIME <=", value, "cgTime");
            return (Criteria) this;
        }

        public Criteria andCgTimeIn(List<Date> values) {
            addCriterion("CG_TIME in", values, "cgTime");
            return (Criteria) this;
        }

        public Criteria andCgTimeNotIn(List<Date> values) {
            addCriterion("CG_TIME not in", values, "cgTime");
            return (Criteria) this;
        }

        public Criteria andCgTimeBetween(Date value1, Date value2) {
            addCriterion("CG_TIME between", value1, value2, "cgTime");
            return (Criteria) this;
        }

        public Criteria andCgTimeNotBetween(Date value1, Date value2) {
            addCriterion("CG_TIME not between", value1, value2, "cgTime");
            return (Criteria) this;
        }

        public Criteria andGysIdIsNull() {
            addCriterion("GYS_ID is null");
            return (Criteria) this;
        }

        public Criteria andGysIdIsNotNull() {
            addCriterion("GYS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGysIdEqualTo(String value) {
            addCriterion("GYS_ID =", value, "gysId");
            return (Criteria) this;
        }

        public Criteria andGysIdNotEqualTo(String value) {
            addCriterion("GYS_ID <>", value, "gysId");
            return (Criteria) this;
        }

        public Criteria andGysIdGreaterThan(String value) {
            addCriterion("GYS_ID >", value, "gysId");
            return (Criteria) this;
        }

        public Criteria andGysIdGreaterThanOrEqualTo(String value) {
            addCriterion("GYS_ID >=", value, "gysId");
            return (Criteria) this;
        }

        public Criteria andGysIdLessThan(String value) {
            addCriterion("GYS_ID <", value, "gysId");
            return (Criteria) this;
        }

        public Criteria andGysIdLessThanOrEqualTo(String value) {
            addCriterion("GYS_ID <=", value, "gysId");
            return (Criteria) this;
        }

        public Criteria andGysIdLike(String value) {
            addCriterion("GYS_ID like", value, "gysId");
            return (Criteria) this;
        }

        public Criteria andGysIdNotLike(String value) {
            addCriterion("GYS_ID not like", value, "gysId");
            return (Criteria) this;
        }

        public Criteria andGysIdIn(List<String> values) {
            addCriterion("GYS_ID in", values, "gysId");
            return (Criteria) this;
        }

        public Criteria andGysIdNotIn(List<String> values) {
            addCriterion("GYS_ID not in", values, "gysId");
            return (Criteria) this;
        }

        public Criteria andGysIdBetween(String value1, String value2) {
            addCriterion("GYS_ID between", value1, value2, "gysId");
            return (Criteria) this;
        }

        public Criteria andGysIdNotBetween(String value1, String value2) {
            addCriterion("GYS_ID not between", value1, value2, "gysId");
            return (Criteria) this;
        }

        public Criteria andHkMoneyIsNull() {
            addCriterion("HK_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andHkMoneyIsNotNull() {
            addCriterion("HK_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andHkMoneyEqualTo(BigDecimal value) {
            addCriterion("HK_MONEY =", value, "hkMoney");
            return (Criteria) this;
        }

        public Criteria andHkMoneyNotEqualTo(BigDecimal value) {
            addCriterion("HK_MONEY <>", value, "hkMoney");
            return (Criteria) this;
        }

        public Criteria andHkMoneyGreaterThan(BigDecimal value) {
            addCriterion("HK_MONEY >", value, "hkMoney");
            return (Criteria) this;
        }

        public Criteria andHkMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HK_MONEY >=", value, "hkMoney");
            return (Criteria) this;
        }

        public Criteria andHkMoneyLessThan(BigDecimal value) {
            addCriterion("HK_MONEY <", value, "hkMoney");
            return (Criteria) this;
        }

        public Criteria andHkMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("HK_MONEY <=", value, "hkMoney");
            return (Criteria) this;
        }

        public Criteria andHkMoneyIn(List<BigDecimal> values) {
            addCriterion("HK_MONEY in", values, "hkMoney");
            return (Criteria) this;
        }

        public Criteria andHkMoneyNotIn(List<BigDecimal> values) {
            addCriterion("HK_MONEY not in", values, "hkMoney");
            return (Criteria) this;
        }

        public Criteria andHkMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HK_MONEY between", value1, value2, "hkMoney");
            return (Criteria) this;
        }

        public Criteria andHkMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HK_MONEY not between", value1, value2, "hkMoney");
            return (Criteria) this;
        }

        public Criteria andFkqkIsNull() {
            addCriterion("FKQK is null");
            return (Criteria) this;
        }

        public Criteria andFkqkIsNotNull() {
            addCriterion("FKQK is not null");
            return (Criteria) this;
        }

        public Criteria andFkqkEqualTo(String value) {
            addCriterion("FKQK =", value, "fkqk");
            return (Criteria) this;
        }

        public Criteria andFkqkNotEqualTo(String value) {
            addCriterion("FKQK <>", value, "fkqk");
            return (Criteria) this;
        }

        public Criteria andFkqkGreaterThan(String value) {
            addCriterion("FKQK >", value, "fkqk");
            return (Criteria) this;
        }

        public Criteria andFkqkGreaterThanOrEqualTo(String value) {
            addCriterion("FKQK >=", value, "fkqk");
            return (Criteria) this;
        }

        public Criteria andFkqkLessThan(String value) {
            addCriterion("FKQK <", value, "fkqk");
            return (Criteria) this;
        }

        public Criteria andFkqkLessThanOrEqualTo(String value) {
            addCriterion("FKQK <=", value, "fkqk");
            return (Criteria) this;
        }

        public Criteria andFkqkLike(String value) {
            addCriterion("FKQK like", value, "fkqk");
            return (Criteria) this;
        }

        public Criteria andFkqkNotLike(String value) {
            addCriterion("FKQK not like", value, "fkqk");
            return (Criteria) this;
        }

        public Criteria andFkqkIn(List<String> values) {
            addCriterion("FKQK in", values, "fkqk");
            return (Criteria) this;
        }

        public Criteria andFkqkNotIn(List<String> values) {
            addCriterion("FKQK not in", values, "fkqk");
            return (Criteria) this;
        }

        public Criteria andFkqkBetween(String value1, String value2) {
            addCriterion("FKQK between", value1, value2, "fkqk");
            return (Criteria) this;
        }

        public Criteria andFkqkNotBetween(String value1, String value2) {
            addCriterion("FKQK not between", value1, value2, "fkqk");
            return (Criteria) this;
        }

        public Criteria andCgJzIsNull() {
            addCriterion("CG_JZ is null");
            return (Criteria) this;
        }

        public Criteria andCgJzIsNotNull() {
            addCriterion("CG_JZ is not null");
            return (Criteria) this;
        }

        public Criteria andCgJzEqualTo(String value) {
            addCriterion("CG_JZ =", value, "cgJz");
            return (Criteria) this;
        }

        public Criteria andCgJzNotEqualTo(String value) {
            addCriterion("CG_JZ <>", value, "cgJz");
            return (Criteria) this;
        }

        public Criteria andCgJzGreaterThan(String value) {
            addCriterion("CG_JZ >", value, "cgJz");
            return (Criteria) this;
        }

        public Criteria andCgJzGreaterThanOrEqualTo(String value) {
            addCriterion("CG_JZ >=", value, "cgJz");
            return (Criteria) this;
        }

        public Criteria andCgJzLessThan(String value) {
            addCriterion("CG_JZ <", value, "cgJz");
            return (Criteria) this;
        }

        public Criteria andCgJzLessThanOrEqualTo(String value) {
            addCriterion("CG_JZ <=", value, "cgJz");
            return (Criteria) this;
        }

        public Criteria andCgJzLike(String value) {
            addCriterion("CG_JZ like", value, "cgJz");
            return (Criteria) this;
        }

        public Criteria andCgJzNotLike(String value) {
            addCriterion("CG_JZ not like", value, "cgJz");
            return (Criteria) this;
        }

        public Criteria andCgJzIn(List<String> values) {
            addCriterion("CG_JZ in", values, "cgJz");
            return (Criteria) this;
        }

        public Criteria andCgJzNotIn(List<String> values) {
            addCriterion("CG_JZ not in", values, "cgJz");
            return (Criteria) this;
        }

        public Criteria andCgJzBetween(String value1, String value2) {
            addCriterion("CG_JZ between", value1, value2, "cgJz");
            return (Criteria) this;
        }

        public Criteria andCgJzNotBetween(String value1, String value2) {
            addCriterion("CG_JZ not between", value1, value2, "cgJz");
            return (Criteria) this;
        }

        public Criteria andJhtimeIsNull() {
            addCriterion("JHTIME is null");
            return (Criteria) this;
        }

        public Criteria andJhtimeIsNotNull() {
            addCriterion("JHTIME is not null");
            return (Criteria) this;
        }

        public Criteria andJhtimeEqualTo(Date value) {
            addCriterion("JHTIME =", value, "jhtime");
            return (Criteria) this;
        }

        public Criteria andJhtimeNotEqualTo(Date value) {
            addCriterion("JHTIME <>", value, "jhtime");
            return (Criteria) this;
        }

        public Criteria andJhtimeGreaterThan(Date value) {
            addCriterion("JHTIME >", value, "jhtime");
            return (Criteria) this;
        }

        public Criteria andJhtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("JHTIME >=", value, "jhtime");
            return (Criteria) this;
        }

        public Criteria andJhtimeLessThan(Date value) {
            addCriterion("JHTIME <", value, "jhtime");
            return (Criteria) this;
        }

        public Criteria andJhtimeLessThanOrEqualTo(Date value) {
            addCriterion("JHTIME <=", value, "jhtime");
            return (Criteria) this;
        }

        public Criteria andJhtimeIn(List<Date> values) {
            addCriterion("JHTIME in", values, "jhtime");
            return (Criteria) this;
        }

        public Criteria andJhtimeNotIn(List<Date> values) {
            addCriterion("JHTIME not in", values, "jhtime");
            return (Criteria) this;
        }

        public Criteria andJhtimeBetween(Date value1, Date value2) {
            addCriterion("JHTIME between", value1, value2, "jhtime");
            return (Criteria) this;
        }

        public Criteria andJhtimeNotBetween(Date value1, Date value2) {
            addCriterion("JHTIME not between", value1, value2, "jhtime");
            return (Criteria) this;
        }

        public Criteria andJhplaceIsNull() {
            addCriterion("JHPLACE is null");
            return (Criteria) this;
        }

        public Criteria andJhplaceIsNotNull() {
            addCriterion("JHPLACE is not null");
            return (Criteria) this;
        }

        public Criteria andJhplaceEqualTo(String value) {
            addCriterion("JHPLACE =", value, "jhplace");
            return (Criteria) this;
        }

        public Criteria andJhplaceNotEqualTo(String value) {
            addCriterion("JHPLACE <>", value, "jhplace");
            return (Criteria) this;
        }

        public Criteria andJhplaceGreaterThan(String value) {
            addCriterion("JHPLACE >", value, "jhplace");
            return (Criteria) this;
        }

        public Criteria andJhplaceGreaterThanOrEqualTo(String value) {
            addCriterion("JHPLACE >=", value, "jhplace");
            return (Criteria) this;
        }

        public Criteria andJhplaceLessThan(String value) {
            addCriterion("JHPLACE <", value, "jhplace");
            return (Criteria) this;
        }

        public Criteria andJhplaceLessThanOrEqualTo(String value) {
            addCriterion("JHPLACE <=", value, "jhplace");
            return (Criteria) this;
        }

        public Criteria andJhplaceLike(String value) {
            addCriterion("JHPLACE like", value, "jhplace");
            return (Criteria) this;
        }

        public Criteria andJhplaceNotLike(String value) {
            addCriterion("JHPLACE not like", value, "jhplace");
            return (Criteria) this;
        }

        public Criteria andJhplaceIn(List<String> values) {
            addCriterion("JHPLACE in", values, "jhplace");
            return (Criteria) this;
        }

        public Criteria andJhplaceNotIn(List<String> values) {
            addCriterion("JHPLACE not in", values, "jhplace");
            return (Criteria) this;
        }

        public Criteria andJhplaceBetween(String value1, String value2) {
            addCriterion("JHPLACE between", value1, value2, "jhplace");
            return (Criteria) this;
        }

        public Criteria andJhplaceNotBetween(String value1, String value2) {
            addCriterion("JHPLACE not between", value1, value2, "jhplace");
            return (Criteria) this;
        }

        public Criteria andJhwayIsNull() {
            addCriterion("JHWAY is null");
            return (Criteria) this;
        }

        public Criteria andJhwayIsNotNull() {
            addCriterion("JHWAY is not null");
            return (Criteria) this;
        }

        public Criteria andJhwayEqualTo(String value) {
            addCriterion("JHWAY =", value, "jhway");
            return (Criteria) this;
        }

        public Criteria andJhwayNotEqualTo(String value) {
            addCriterion("JHWAY <>", value, "jhway");
            return (Criteria) this;
        }

        public Criteria andJhwayGreaterThan(String value) {
            addCriterion("JHWAY >", value, "jhway");
            return (Criteria) this;
        }

        public Criteria andJhwayGreaterThanOrEqualTo(String value) {
            addCriterion("JHWAY >=", value, "jhway");
            return (Criteria) this;
        }

        public Criteria andJhwayLessThan(String value) {
            addCriterion("JHWAY <", value, "jhway");
            return (Criteria) this;
        }

        public Criteria andJhwayLessThanOrEqualTo(String value) {
            addCriterion("JHWAY <=", value, "jhway");
            return (Criteria) this;
        }

        public Criteria andJhwayLike(String value) {
            addCriterion("JHWAY like", value, "jhway");
            return (Criteria) this;
        }

        public Criteria andJhwayNotLike(String value) {
            addCriterion("JHWAY not like", value, "jhway");
            return (Criteria) this;
        }

        public Criteria andJhwayIn(List<String> values) {
            addCriterion("JHWAY in", values, "jhway");
            return (Criteria) this;
        }

        public Criteria andJhwayNotIn(List<String> values) {
            addCriterion("JHWAY not in", values, "jhway");
            return (Criteria) this;
        }

        public Criteria andJhwayBetween(String value1, String value2) {
            addCriterion("JHWAY between", value1, value2, "jhway");
            return (Criteria) this;
        }

        public Criteria andJhwayNotBetween(String value1, String value2) {
            addCriterion("JHWAY not between", value1, value2, "jhway");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNull() {
            addCriterion("OPERATOR is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("OPERATOR is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(String value) {
            addCriterion("OPERATOR =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(String value) {
            addCriterion("OPERATOR <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(String value) {
            addCriterion("OPERATOR >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATOR >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(String value) {
            addCriterion("OPERATOR <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(String value) {
            addCriterion("OPERATOR <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLike(String value) {
            addCriterion("OPERATOR like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotLike(String value) {
            addCriterion("OPERATOR not like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<String> values) {
            addCriterion("OPERATOR in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<String> values) {
            addCriterion("OPERATOR not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(String value1, String value2) {
            addCriterion("OPERATOR between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(String value1, String value2) {
            addCriterion("OPERATOR not between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andGsIdIsNull() {
            addCriterion("GS_ID is null");
            return (Criteria) this;
        }

        public Criteria andGsIdIsNotNull() {
            addCriterion("GS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGsIdEqualTo(Long value) {
            addCriterion("GS_ID =", value, "gsId");
            return (Criteria) this;
        }

        public Criteria andGsIdNotEqualTo(Long value) {
            addCriterion("GS_ID <>", value, "gsId");
            return (Criteria) this;
        }

        public Criteria andGsIdGreaterThan(Long value) {
            addCriterion("GS_ID >", value, "gsId");
            return (Criteria) this;
        }

        public Criteria andGsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("GS_ID >=", value, "gsId");
            return (Criteria) this;
        }

        public Criteria andGsIdLessThan(Long value) {
            addCriterion("GS_ID <", value, "gsId");
            return (Criteria) this;
        }

        public Criteria andGsIdLessThanOrEqualTo(Long value) {
            addCriterion("GS_ID <=", value, "gsId");
            return (Criteria) this;
        }

        public Criteria andGsIdIn(List<Long> values) {
            addCriterion("GS_ID in", values, "gsId");
            return (Criteria) this;
        }

        public Criteria andGsIdNotIn(List<Long> values) {
            addCriterion("GS_ID not in", values, "gsId");
            return (Criteria) this;
        }

        public Criteria andGsIdBetween(Long value1, Long value2) {
            addCriterion("GS_ID between", value1, value2, "gsId");
            return (Criteria) this;
        }

        public Criteria andGsIdNotBetween(Long value1, Long value2) {
            addCriterion("GS_ID not between", value1, value2, "gsId");
            return (Criteria) this;
        }

        public Criteria andLtimeIsNull() {
            addCriterion("LTIME is null");
            return (Criteria) this;
        }

        public Criteria andLtimeIsNotNull() {
            addCriterion("LTIME is not null");
            return (Criteria) this;
        }

        public Criteria andLtimeEqualTo(Date value) {
            addCriterion("LTIME =", value, "ltime");
            return (Criteria) this;
        }

        public Criteria andLtimeNotEqualTo(Date value) {
            addCriterion("LTIME <>", value, "ltime");
            return (Criteria) this;
        }

        public Criteria andLtimeGreaterThan(Date value) {
            addCriterion("LTIME >", value, "ltime");
            return (Criteria) this;
        }

        public Criteria andLtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LTIME >=", value, "ltime");
            return (Criteria) this;
        }

        public Criteria andLtimeLessThan(Date value) {
            addCriterion("LTIME <", value, "ltime");
            return (Criteria) this;
        }

        public Criteria andLtimeLessThanOrEqualTo(Date value) {
            addCriterion("LTIME <=", value, "ltime");
            return (Criteria) this;
        }

        public Criteria andLtimeIn(List<Date> values) {
            addCriterion("LTIME in", values, "ltime");
            return (Criteria) this;
        }

        public Criteria andLtimeNotIn(List<Date> values) {
            addCriterion("LTIME not in", values, "ltime");
            return (Criteria) this;
        }

        public Criteria andLtimeBetween(Date value1, Date value2) {
            addCriterion("LTIME between", value1, value2, "ltime");
            return (Criteria) this;
        }

        public Criteria andLtimeNotBetween(Date value1, Date value2) {
            addCriterion("LTIME not between", value1, value2, "ltime");
            return (Criteria) this;
        }

        public Criteria andFphmIsNull() {
            addCriterion("FPHM is null");
            return (Criteria) this;
        }

        public Criteria andFphmIsNotNull() {
            addCriterion("FPHM is not null");
            return (Criteria) this;
        }

        public Criteria andFphmEqualTo(String value) {
            addCriterion("FPHM =", value, "fphm");
            return (Criteria) this;
        }

        public Criteria andFphmNotEqualTo(String value) {
            addCriterion("FPHM <>", value, "fphm");
            return (Criteria) this;
        }

        public Criteria andFphmGreaterThan(String value) {
            addCriterion("FPHM >", value, "fphm");
            return (Criteria) this;
        }

        public Criteria andFphmGreaterThanOrEqualTo(String value) {
            addCriterion("FPHM >=", value, "fphm");
            return (Criteria) this;
        }

        public Criteria andFphmLessThan(String value) {
            addCriterion("FPHM <", value, "fphm");
            return (Criteria) this;
        }

        public Criteria andFphmLessThanOrEqualTo(String value) {
            addCriterion("FPHM <=", value, "fphm");
            return (Criteria) this;
        }

        public Criteria andFphmLike(String value) {
            addCriterion("FPHM like", value, "fphm");
            return (Criteria) this;
        }

        public Criteria andFphmNotLike(String value) {
            addCriterion("FPHM not like", value, "fphm");
            return (Criteria) this;
        }

        public Criteria andFphmIn(List<String> values) {
            addCriterion("FPHM in", values, "fphm");
            return (Criteria) this;
        }

        public Criteria andFphmNotIn(List<String> values) {
            addCriterion("FPHM not in", values, "fphm");
            return (Criteria) this;
        }

        public Criteria andFphmBetween(String value1, String value2) {
            addCriterion("FPHM between", value1, value2, "fphm");
            return (Criteria) this;
        }

        public Criteria andFphmNotBetween(String value1, String value2) {
            addCriterion("FPHM not between", value1, value2, "fphm");
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