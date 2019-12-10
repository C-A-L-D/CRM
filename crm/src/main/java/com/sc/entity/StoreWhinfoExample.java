package com.sc.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StoreWhinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StoreWhinfoExample() {
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

        public Criteria andWhidIsNull() {
            addCriterion("WHID is null");
            return (Criteria) this;
        }

        public Criteria andWhidIsNotNull() {
            addCriterion("WHID is not null");
            return (Criteria) this;
        }

        public Criteria andWhidEqualTo(BigDecimal value) {
            addCriterion("WHID =", value, "whid");
            return (Criteria) this;
        }

        public Criteria andWhidNotEqualTo(BigDecimal value) {
            addCriterion("WHID <>", value, "whid");
            return (Criteria) this;
        }

        public Criteria andWhidGreaterThan(BigDecimal value) {
            addCriterion("WHID >", value, "whid");
            return (Criteria) this;
        }

        public Criteria andWhidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WHID >=", value, "whid");
            return (Criteria) this;
        }

        public Criteria andWhidLessThan(BigDecimal value) {
            addCriterion("WHID <", value, "whid");
            return (Criteria) this;
        }

        public Criteria andWhidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WHID <=", value, "whid");
            return (Criteria) this;
        }

        public Criteria andWhidIn(List<BigDecimal> values) {
            addCriterion("WHID in", values, "whid");
            return (Criteria) this;
        }

        public Criteria andWhidNotIn(List<BigDecimal> values) {
            addCriterion("WHID not in", values, "whid");
            return (Criteria) this;
        }

        public Criteria andWhidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WHID between", value1, value2, "whid");
            return (Criteria) this;
        }

        public Criteria andWhidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WHID not between", value1, value2, "whid");
            return (Criteria) this;
        }

        public Criteria andWhnameIsNull() {
            addCriterion("WHNAME is null");
            return (Criteria) this;
        }

        public Criteria andWhnameIsNotNull() {
            addCriterion("WHNAME is not null");
            return (Criteria) this;
        }

        public Criteria andWhnameEqualTo(String value) {
            addCriterion("WHNAME =", value, "whname");
            return (Criteria) this;
        }

        public Criteria andWhnameNotEqualTo(String value) {
            addCriterion("WHNAME <>", value, "whname");
            return (Criteria) this;
        }

        public Criteria andWhnameGreaterThan(String value) {
            addCriterion("WHNAME >", value, "whname");
            return (Criteria) this;
        }

        public Criteria andWhnameGreaterThanOrEqualTo(String value) {
            addCriterion("WHNAME >=", value, "whname");
            return (Criteria) this;
        }

        public Criteria andWhnameLessThan(String value) {
            addCriterion("WHNAME <", value, "whname");
            return (Criteria) this;
        }

        public Criteria andWhnameLessThanOrEqualTo(String value) {
            addCriterion("WHNAME <=", value, "whname");
            return (Criteria) this;
        }

        public Criteria andWhnameLike(String value) {
            addCriterion("WHNAME like", value, "whname");
            return (Criteria) this;
        }

        public Criteria andWhnameNotLike(String value) {
            addCriterion("WHNAME not like", value, "whname");
            return (Criteria) this;
        }

        public Criteria andWhnameIn(List<String> values) {
            addCriterion("WHNAME in", values, "whname");
            return (Criteria) this;
        }

        public Criteria andWhnameNotIn(List<String> values) {
            addCriterion("WHNAME not in", values, "whname");
            return (Criteria) this;
        }

        public Criteria andWhnameBetween(String value1, String value2) {
            addCriterion("WHNAME between", value1, value2, "whname");
            return (Criteria) this;
        }

        public Criteria andWhnameNotBetween(String value1, String value2) {
            addCriterion("WHNAME not between", value1, value2, "whname");
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

        public Criteria andLastdateIsNull() {
            addCriterion("LASTDATE is null");
            return (Criteria) this;
        }

        public Criteria andLastdateIsNotNull() {
            addCriterion("LASTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andLastdateEqualTo(Date value) {
            addCriterion("LASTDATE =", value, "lastdate");
            return (Criteria) this;
        }

        public Criteria andLastdateNotEqualTo(Date value) {
            addCriterion("LASTDATE <>", value, "lastdate");
            return (Criteria) this;
        }

        public Criteria andLastdateGreaterThan(Date value) {
            addCriterion("LASTDATE >", value, "lastdate");
            return (Criteria) this;
        }

        public Criteria andLastdateGreaterThanOrEqualTo(Date value) {
            addCriterion("LASTDATE >=", value, "lastdate");
            return (Criteria) this;
        }

        public Criteria andLastdateLessThan(Date value) {
            addCriterion("LASTDATE <", value, "lastdate");
            return (Criteria) this;
        }

        public Criteria andLastdateLessThanOrEqualTo(Date value) {
            addCriterion("LASTDATE <=", value, "lastdate");
            return (Criteria) this;
        }

        public Criteria andLastdateIn(List<Date> values) {
            addCriterion("LASTDATE in", values, "lastdate");
            return (Criteria) this;
        }

        public Criteria andLastdateNotIn(List<Date> values) {
            addCriterion("LASTDATE not in", values, "lastdate");
            return (Criteria) this;
        }

        public Criteria andLastdateBetween(Date value1, Date value2) {
            addCriterion("LASTDATE between", value1, value2, "lastdate");
            return (Criteria) this;
        }

        public Criteria andLastdateNotBetween(Date value1, Date value2) {
            addCriterion("LASTDATE not between", value1, value2, "lastdate");
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