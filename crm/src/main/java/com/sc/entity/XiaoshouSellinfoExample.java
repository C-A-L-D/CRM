package com.sc.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XiaoshouSellinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XiaoshouSellinfoExample() {
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

        public Criteria andSsidIsNull() {
            addCriterion("SSID is null");
            return (Criteria) this;
        }

        public Criteria andSsidIsNotNull() {
            addCriterion("SSID is not null");
            return (Criteria) this;
        }

        public Criteria andSsidEqualTo(BigDecimal value) {
            addCriterion("SSID =", value, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidNotEqualTo(BigDecimal value) {
            addCriterion("SSID <>", value, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidGreaterThan(BigDecimal value) {
            addCriterion("SSID >", value, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SSID >=", value, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidLessThan(BigDecimal value) {
            addCriterion("SSID <", value, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SSID <=", value, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidIn(List<BigDecimal> values) {
            addCriterion("SSID in", values, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidNotIn(List<BigDecimal> values) {
            addCriterion("SSID not in", values, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SSID between", value1, value2, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SSID not between", value1, value2, "ssid");
            return (Criteria) this;
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

        public Criteria andGidIsNull() {
            addCriterion("GID is null");
            return (Criteria) this;
        }

        public Criteria andGidIsNotNull() {
            addCriterion("GID is not null");
            return (Criteria) this;
        }

        public Criteria andGidEqualTo(BigDecimal value) {
            addCriterion("GID =", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotEqualTo(BigDecimal value) {
            addCriterion("GID <>", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThan(BigDecimal value) {
            addCriterion("GID >", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GID >=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThan(BigDecimal value) {
            addCriterion("GID <", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GID <=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidIn(List<BigDecimal> values) {
            addCriterion("GID in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotIn(List<BigDecimal> values) {
            addCriterion("GID not in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GID between", value1, value2, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GID not between", value1, value2, "gid");
            return (Criteria) this;
        }

        public Criteria andGnumIsNull() {
            addCriterion("GNUM is null");
            return (Criteria) this;
        }

        public Criteria andGnumIsNotNull() {
            addCriterion("GNUM is not null");
            return (Criteria) this;
        }

        public Criteria andGnumEqualTo(BigDecimal value) {
            addCriterion("GNUM =", value, "gnum");
            return (Criteria) this;
        }

        public Criteria andGnumNotEqualTo(BigDecimal value) {
            addCriterion("GNUM <>", value, "gnum");
            return (Criteria) this;
        }

        public Criteria andGnumGreaterThan(BigDecimal value) {
            addCriterion("GNUM >", value, "gnum");
            return (Criteria) this;
        }

        public Criteria andGnumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GNUM >=", value, "gnum");
            return (Criteria) this;
        }

        public Criteria andGnumLessThan(BigDecimal value) {
            addCriterion("GNUM <", value, "gnum");
            return (Criteria) this;
        }

        public Criteria andGnumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GNUM <=", value, "gnum");
            return (Criteria) this;
        }

        public Criteria andGnumIn(List<BigDecimal> values) {
            addCriterion("GNUM in", values, "gnum");
            return (Criteria) this;
        }

        public Criteria andGnumNotIn(List<BigDecimal> values) {
            addCriterion("GNUM not in", values, "gnum");
            return (Criteria) this;
        }

        public Criteria andGnumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GNUM between", value1, value2, "gnum");
            return (Criteria) this;
        }

        public Criteria andGnumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GNUM not between", value1, value2, "gnum");
            return (Criteria) this;
        }

        public Criteria andGpriceIsNull() {
            addCriterion("GPRICE is null");
            return (Criteria) this;
        }

        public Criteria andGpriceIsNotNull() {
            addCriterion("GPRICE is not null");
            return (Criteria) this;
        }

        public Criteria andGpriceEqualTo(BigDecimal value) {
            addCriterion("GPRICE =", value, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceNotEqualTo(BigDecimal value) {
            addCriterion("GPRICE <>", value, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceGreaterThan(BigDecimal value) {
            addCriterion("GPRICE >", value, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GPRICE >=", value, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceLessThan(BigDecimal value) {
            addCriterion("GPRICE <", value, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GPRICE <=", value, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceIn(List<BigDecimal> values) {
            addCriterion("GPRICE in", values, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceNotIn(List<BigDecimal> values) {
            addCriterion("GPRICE not in", values, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GPRICE between", value1, value2, "gprice");
            return (Criteria) this;
        }

        public Criteria andGpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GPRICE not between", value1, value2, "gprice");
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

        public Criteria andCidIsNull() {
            addCriterion("CID is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("CID is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(BigDecimal value) {
            addCriterion("CID =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(BigDecimal value) {
            addCriterion("CID <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(BigDecimal value) {
            addCriterion("CID >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CID >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(BigDecimal value) {
            addCriterion("CID <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CID <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<BigDecimal> values) {
            addCriterion("CID in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<BigDecimal> values) {
            addCriterion("CID not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CID between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CID not between", value1, value2, "cid");
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