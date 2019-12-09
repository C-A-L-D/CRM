package com.sc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OFF_TASKDETAILExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OFF_TASKDETAILExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTaskidIsNull() {
            addCriterion("TASKID is null");
            return (Criteria) this;
        }

        public Criteria andTaskidIsNotNull() {
            addCriterion("TASKID is not null");
            return (Criteria) this;
        }

        public Criteria andTaskidEqualTo(Long value) {
            addCriterion("TASKID =", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotEqualTo(Long value) {
            addCriterion("TASKID <>", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidGreaterThan(Long value) {
            addCriterion("TASKID >", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidGreaterThanOrEqualTo(Long value) {
            addCriterion("TASKID >=", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidLessThan(Long value) {
            addCriterion("TASKID <", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidLessThanOrEqualTo(Long value) {
            addCriterion("TASKID <=", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidIn(List<Long> values) {
            addCriterion("TASKID in", values, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotIn(List<Long> values) {
            addCriterion("TASKID not in", values, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidBetween(Long value1, Long value2) {
            addCriterion("TASKID between", value1, value2, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotBetween(Long value1, Long value2) {
            addCriterion("TASKID not between", value1, value2, "taskid");
            return (Criteria) this;
        }

        public Criteria andAcceptuseridIsNull() {
            addCriterion("ACCEPTUSERID is null");
            return (Criteria) this;
        }

        public Criteria andAcceptuseridIsNotNull() {
            addCriterion("ACCEPTUSERID is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptuseridEqualTo(Long value) {
            addCriterion("ACCEPTUSERID =", value, "acceptuserid");
            return (Criteria) this;
        }

        public Criteria andAcceptuseridNotEqualTo(Long value) {
            addCriterion("ACCEPTUSERID <>", value, "acceptuserid");
            return (Criteria) this;
        }

        public Criteria andAcceptuseridGreaterThan(Long value) {
            addCriterion("ACCEPTUSERID >", value, "acceptuserid");
            return (Criteria) this;
        }

        public Criteria andAcceptuseridGreaterThanOrEqualTo(Long value) {
            addCriterion("ACCEPTUSERID >=", value, "acceptuserid");
            return (Criteria) this;
        }

        public Criteria andAcceptuseridLessThan(Long value) {
            addCriterion("ACCEPTUSERID <", value, "acceptuserid");
            return (Criteria) this;
        }

        public Criteria andAcceptuseridLessThanOrEqualTo(Long value) {
            addCriterion("ACCEPTUSERID <=", value, "acceptuserid");
            return (Criteria) this;
        }

        public Criteria andAcceptuseridIn(List<Long> values) {
            addCriterion("ACCEPTUSERID in", values, "acceptuserid");
            return (Criteria) this;
        }

        public Criteria andAcceptuseridNotIn(List<Long> values) {
            addCriterion("ACCEPTUSERID not in", values, "acceptuserid");
            return (Criteria) this;
        }

        public Criteria andAcceptuseridBetween(Long value1, Long value2) {
            addCriterion("ACCEPTUSERID between", value1, value2, "acceptuserid");
            return (Criteria) this;
        }

        public Criteria andAcceptuseridNotBetween(Long value1, Long value2) {
            addCriterion("ACCEPTUSERID not between", value1, value2, "acceptuserid");
            return (Criteria) this;
        }

        public Criteria andIsfinishIsNull() {
            addCriterion("ISFINISH is null");
            return (Criteria) this;
        }

        public Criteria andIsfinishIsNotNull() {
            addCriterion("ISFINISH is not null");
            return (Criteria) this;
        }

        public Criteria andIsfinishEqualTo(String value) {
            addCriterion("ISFINISH =", value, "isfinish");
            return (Criteria) this;
        }

        public Criteria andIsfinishNotEqualTo(String value) {
            addCriterion("ISFINISH <>", value, "isfinish");
            return (Criteria) this;
        }

        public Criteria andIsfinishGreaterThan(String value) {
            addCriterion("ISFINISH >", value, "isfinish");
            return (Criteria) this;
        }

        public Criteria andIsfinishGreaterThanOrEqualTo(String value) {
            addCriterion("ISFINISH >=", value, "isfinish");
            return (Criteria) this;
        }

        public Criteria andIsfinishLessThan(String value) {
            addCriterion("ISFINISH <", value, "isfinish");
            return (Criteria) this;
        }

        public Criteria andIsfinishLessThanOrEqualTo(String value) {
            addCriterion("ISFINISH <=", value, "isfinish");
            return (Criteria) this;
        }

        public Criteria andIsfinishLike(String value) {
            addCriterion("ISFINISH like", value, "isfinish");
            return (Criteria) this;
        }

        public Criteria andIsfinishNotLike(String value) {
            addCriterion("ISFINISH not like", value, "isfinish");
            return (Criteria) this;
        }

        public Criteria andIsfinishIn(List<String> values) {
            addCriterion("ISFINISH in", values, "isfinish");
            return (Criteria) this;
        }

        public Criteria andIsfinishNotIn(List<String> values) {
            addCriterion("ISFINISH not in", values, "isfinish");
            return (Criteria) this;
        }

        public Criteria andIsfinishBetween(String value1, String value2) {
            addCriterion("ISFINISH between", value1, value2, "isfinish");
            return (Criteria) this;
        }

        public Criteria andIsfinishNotBetween(String value1, String value2) {
            addCriterion("ISFINISH not between", value1, value2, "isfinish");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("STATE is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("STATE like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("STATE not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("STATE not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andCompanyidIsNull() {
            addCriterion("COMPANYID is null");
            return (Criteria) this;
        }

        public Criteria andCompanyidIsNotNull() {
            addCriterion("COMPANYID is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyidEqualTo(Long value) {
            addCriterion("COMPANYID =", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotEqualTo(Long value) {
            addCriterion("COMPANYID <>", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidGreaterThan(Long value) {
            addCriterion("COMPANYID >", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidGreaterThanOrEqualTo(Long value) {
            addCriterion("COMPANYID >=", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLessThan(Long value) {
            addCriterion("COMPANYID <", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLessThanOrEqualTo(Long value) {
            addCriterion("COMPANYID <=", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidIn(List<Long> values) {
            addCriterion("COMPANYID in", values, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotIn(List<Long> values) {
            addCriterion("COMPANYID not in", values, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidBetween(Long value1, Long value2) {
            addCriterion("COMPANYID between", value1, value2, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotBetween(Long value1, Long value2) {
            addCriterion("COMPANYID not between", value1, value2, "companyid");
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