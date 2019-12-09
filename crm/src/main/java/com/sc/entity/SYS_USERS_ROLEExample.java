package com.sc.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SYS_USERS_ROLEExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SYS_USERS_ROLEExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(BigDecimal value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(BigDecimal value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(BigDecimal value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(BigDecimal value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<BigDecimal> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<BigDecimal> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("UID is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("UID is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(BigDecimal value) {
            addCriterion("UID =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(BigDecimal value) {
            addCriterion("UID <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(BigDecimal value) {
            addCriterion("UID >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UID >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(BigDecimal value) {
            addCriterion("UID <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UID <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<BigDecimal> values) {
            addCriterion("UID in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<BigDecimal> values) {
            addCriterion("UID not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UID between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UID not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andRidIsNull() {
            addCriterion("RID is null");
            return (Criteria) this;
        }

        public Criteria andRidIsNotNull() {
            addCriterion("RID is not null");
            return (Criteria) this;
        }

        public Criteria andRidEqualTo(BigDecimal value) {
            addCriterion("RID =", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotEqualTo(BigDecimal value) {
            addCriterion("RID <>", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThan(BigDecimal value) {
            addCriterion("RID >", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RID >=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThan(BigDecimal value) {
            addCriterion("RID <", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RID <=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidIn(List<BigDecimal> values) {
            addCriterion("RID in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotIn(List<BigDecimal> values) {
            addCriterion("RID not in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RID between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RID not between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andOperatoridIsNull() {
            addCriterion("OPERATORID is null");
            return (Criteria) this;
        }

        public Criteria andOperatoridIsNotNull() {
            addCriterion("OPERATORID is not null");
            return (Criteria) this;
        }

        public Criteria andOperatoridEqualTo(BigDecimal value) {
            addCriterion("OPERATORID =", value, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridNotEqualTo(BigDecimal value) {
            addCriterion("OPERATORID <>", value, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridGreaterThan(BigDecimal value) {
            addCriterion("OPERATORID >", value, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OPERATORID >=", value, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridLessThan(BigDecimal value) {
            addCriterion("OPERATORID <", value, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OPERATORID <=", value, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridIn(List<BigDecimal> values) {
            addCriterion("OPERATORID in", values, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridNotIn(List<BigDecimal> values) {
            addCriterion("OPERATORID not in", values, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OPERATORID between", value1, value2, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OPERATORID not between", value1, value2, "operatorid");
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