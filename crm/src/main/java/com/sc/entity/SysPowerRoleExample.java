package com.sc.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysPowerRoleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysPowerRoleExample() {
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

        public Criteria andPcolumnIdIsNull() {
            addCriterion("PCOLUMN_ID is null");
            return (Criteria) this;
        }

        public Criteria andPcolumnIdIsNotNull() {
            addCriterion("PCOLUMN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPcolumnIdEqualTo(BigDecimal value) {
            addCriterion("PCOLUMN_ID =", value, "pcolumnId");
            return (Criteria) this;
        }

        public Criteria andPcolumnIdNotEqualTo(BigDecimal value) {
            addCriterion("PCOLUMN_ID <>", value, "pcolumnId");
            return (Criteria) this;
        }

        public Criteria andPcolumnIdGreaterThan(BigDecimal value) {
            addCriterion("PCOLUMN_ID >", value, "pcolumnId");
            return (Criteria) this;
        }

        public Criteria andPcolumnIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PCOLUMN_ID >=", value, "pcolumnId");
            return (Criteria) this;
        }

        public Criteria andPcolumnIdLessThan(BigDecimal value) {
            addCriterion("PCOLUMN_ID <", value, "pcolumnId");
            return (Criteria) this;
        }

        public Criteria andPcolumnIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PCOLUMN_ID <=", value, "pcolumnId");
            return (Criteria) this;
        }

        public Criteria andPcolumnIdIn(List<BigDecimal> values) {
            addCriterion("PCOLUMN_ID in", values, "pcolumnId");
            return (Criteria) this;
        }

        public Criteria andPcolumnIdNotIn(List<BigDecimal> values) {
            addCriterion("PCOLUMN_ID not in", values, "pcolumnId");
            return (Criteria) this;
        }

        public Criteria andPcolumnIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PCOLUMN_ID between", value1, value2, "pcolumnId");
            return (Criteria) this;
        }

        public Criteria andPcolumnIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PCOLUMN_ID not between", value1, value2, "pcolumnId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNull() {
            addCriterion("ROLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("ROLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(BigDecimal value) {
            addCriterion("ROLE_ID =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(BigDecimal value) {
            addCriterion("ROLE_ID <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(BigDecimal value) {
            addCriterion("ROLE_ID >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ROLE_ID >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(BigDecimal value) {
            addCriterion("ROLE_ID <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ROLE_ID <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(List<BigDecimal> values) {
            addCriterion("ROLE_ID in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(List<BigDecimal> values) {
            addCriterion("ROLE_ID not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ROLE_ID between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ROLE_ID not between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andCaozuopersonIdIsNull() {
            addCriterion("CAOZUOPERSON_ID is null");
            return (Criteria) this;
        }

        public Criteria andCaozuopersonIdIsNotNull() {
            addCriterion("CAOZUOPERSON_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCaozuopersonIdEqualTo(BigDecimal value) {
            addCriterion("CAOZUOPERSON_ID =", value, "caozuopersonId");
            return (Criteria) this;
        }

        public Criteria andCaozuopersonIdNotEqualTo(BigDecimal value) {
            addCriterion("CAOZUOPERSON_ID <>", value, "caozuopersonId");
            return (Criteria) this;
        }

        public Criteria andCaozuopersonIdGreaterThan(BigDecimal value) {
            addCriterion("CAOZUOPERSON_ID >", value, "caozuopersonId");
            return (Criteria) this;
        }

        public Criteria andCaozuopersonIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CAOZUOPERSON_ID >=", value, "caozuopersonId");
            return (Criteria) this;
        }

        public Criteria andCaozuopersonIdLessThan(BigDecimal value) {
            addCriterion("CAOZUOPERSON_ID <", value, "caozuopersonId");
            return (Criteria) this;
        }

        public Criteria andCaozuopersonIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CAOZUOPERSON_ID <=", value, "caozuopersonId");
            return (Criteria) this;
        }

        public Criteria andCaozuopersonIdIn(List<BigDecimal> values) {
            addCriterion("CAOZUOPERSON_ID in", values, "caozuopersonId");
            return (Criteria) this;
        }

        public Criteria andCaozuopersonIdNotIn(List<BigDecimal> values) {
            addCriterion("CAOZUOPERSON_ID not in", values, "caozuopersonId");
            return (Criteria) this;
        }

        public Criteria andCaozuopersonIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CAOZUOPERSON_ID between", value1, value2, "caozuopersonId");
            return (Criteria) this;
        }

        public Criteria andCaozuopersonIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CAOZUOPERSON_ID not between", value1, value2, "caozuopersonId");
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