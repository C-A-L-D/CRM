package com.sc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OFF_MESSDETAILExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OFF_MESSDETAILExample() {
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

        public Criteria andDetailidIsNull() {
            addCriterion("DETAILID is null");
            return (Criteria) this;
        }

        public Criteria andDetailidIsNotNull() {
            addCriterion("DETAILID is not null");
            return (Criteria) this;
        }

        public Criteria andDetailidEqualTo(Long value) {
            addCriterion("DETAILID =", value, "detailid");
            return (Criteria) this;
        }

        public Criteria andDetailidNotEqualTo(Long value) {
            addCriterion("DETAILID <>", value, "detailid");
            return (Criteria) this;
        }

        public Criteria andDetailidGreaterThan(Long value) {
            addCriterion("DETAILID >", value, "detailid");
            return (Criteria) this;
        }

        public Criteria andDetailidGreaterThanOrEqualTo(Long value) {
            addCriterion("DETAILID >=", value, "detailid");
            return (Criteria) this;
        }

        public Criteria andDetailidLessThan(Long value) {
            addCriterion("DETAILID <", value, "detailid");
            return (Criteria) this;
        }

        public Criteria andDetailidLessThanOrEqualTo(Long value) {
            addCriterion("DETAILID <=", value, "detailid");
            return (Criteria) this;
        }

        public Criteria andDetailidIn(List<Long> values) {
            addCriterion("DETAILID in", values, "detailid");
            return (Criteria) this;
        }

        public Criteria andDetailidNotIn(List<Long> values) {
            addCriterion("DETAILID not in", values, "detailid");
            return (Criteria) this;
        }

        public Criteria andDetailidBetween(Long value1, Long value2) {
            addCriterion("DETAILID between", value1, value2, "detailid");
            return (Criteria) this;
        }

        public Criteria andDetailidNotBetween(Long value1, Long value2) {
            addCriterion("DETAILID not between", value1, value2, "detailid");
            return (Criteria) this;
        }

        public Criteria andMessidIsNull() {
            addCriterion("MESSID is null");
            return (Criteria) this;
        }

        public Criteria andMessidIsNotNull() {
            addCriterion("MESSID is not null");
            return (Criteria) this;
        }

        public Criteria andMessidEqualTo(Long value) {
            addCriterion("MESSID =", value, "messid");
            return (Criteria) this;
        }

        public Criteria andMessidNotEqualTo(Long value) {
            addCriterion("MESSID <>", value, "messid");
            return (Criteria) this;
        }

        public Criteria andMessidGreaterThan(Long value) {
            addCriterion("MESSID >", value, "messid");
            return (Criteria) this;
        }

        public Criteria andMessidGreaterThanOrEqualTo(Long value) {
            addCriterion("MESSID >=", value, "messid");
            return (Criteria) this;
        }

        public Criteria andMessidLessThan(Long value) {
            addCriterion("MESSID <", value, "messid");
            return (Criteria) this;
        }

        public Criteria andMessidLessThanOrEqualTo(Long value) {
            addCriterion("MESSID <=", value, "messid");
            return (Criteria) this;
        }

        public Criteria andMessidIn(List<Long> values) {
            addCriterion("MESSID in", values, "messid");
            return (Criteria) this;
        }

        public Criteria andMessidNotIn(List<Long> values) {
            addCriterion("MESSID not in", values, "messid");
            return (Criteria) this;
        }

        public Criteria andMessidBetween(Long value1, Long value2) {
            addCriterion("MESSID between", value1, value2, "messid");
            return (Criteria) this;
        }

        public Criteria andMessidNotBetween(Long value1, Long value2) {
            addCriterion("MESSID not between", value1, value2, "messid");
            return (Criteria) this;
        }

        public Criteria andReceiveridIsNull() {
            addCriterion("RECEIVERID is null");
            return (Criteria) this;
        }

        public Criteria andReceiveridIsNotNull() {
            addCriterion("RECEIVERID is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveridEqualTo(Long value) {
            addCriterion("RECEIVERID =", value, "receiverid");
            return (Criteria) this;
        }

        public Criteria andReceiveridNotEqualTo(Long value) {
            addCriterion("RECEIVERID <>", value, "receiverid");
            return (Criteria) this;
        }

        public Criteria andReceiveridGreaterThan(Long value) {
            addCriterion("RECEIVERID >", value, "receiverid");
            return (Criteria) this;
        }

        public Criteria andReceiveridGreaterThanOrEqualTo(Long value) {
            addCriterion("RECEIVERID >=", value, "receiverid");
            return (Criteria) this;
        }

        public Criteria andReceiveridLessThan(Long value) {
            addCriterion("RECEIVERID <", value, "receiverid");
            return (Criteria) this;
        }

        public Criteria andReceiveridLessThanOrEqualTo(Long value) {
            addCriterion("RECEIVERID <=", value, "receiverid");
            return (Criteria) this;
        }

        public Criteria andReceiveridIn(List<Long> values) {
            addCriterion("RECEIVERID in", values, "receiverid");
            return (Criteria) this;
        }

        public Criteria andReceiveridNotIn(List<Long> values) {
            addCriterion("RECEIVERID not in", values, "receiverid");
            return (Criteria) this;
        }

        public Criteria andReceiveridBetween(Long value1, Long value2) {
            addCriterion("RECEIVERID between", value1, value2, "receiverid");
            return (Criteria) this;
        }

        public Criteria andReceiveridNotBetween(Long value1, Long value2) {
            addCriterion("RECEIVERID not between", value1, value2, "receiverid");
            return (Criteria) this;
        }

        public Criteria andMessstateIsNull() {
            addCriterion("MESSSTATE is null");
            return (Criteria) this;
        }

        public Criteria andMessstateIsNotNull() {
            addCriterion("MESSSTATE is not null");
            return (Criteria) this;
        }

        public Criteria andMessstateEqualTo(String value) {
            addCriterion("MESSSTATE =", value, "messstate");
            return (Criteria) this;
        }

        public Criteria andMessstateNotEqualTo(String value) {
            addCriterion("MESSSTATE <>", value, "messstate");
            return (Criteria) this;
        }

        public Criteria andMessstateGreaterThan(String value) {
            addCriterion("MESSSTATE >", value, "messstate");
            return (Criteria) this;
        }

        public Criteria andMessstateGreaterThanOrEqualTo(String value) {
            addCriterion("MESSSTATE >=", value, "messstate");
            return (Criteria) this;
        }

        public Criteria andMessstateLessThan(String value) {
            addCriterion("MESSSTATE <", value, "messstate");
            return (Criteria) this;
        }

        public Criteria andMessstateLessThanOrEqualTo(String value) {
            addCriterion("MESSSTATE <=", value, "messstate");
            return (Criteria) this;
        }

        public Criteria andMessstateLike(String value) {
            addCriterion("MESSSTATE like", value, "messstate");
            return (Criteria) this;
        }

        public Criteria andMessstateNotLike(String value) {
            addCriterion("MESSSTATE not like", value, "messstate");
            return (Criteria) this;
        }

        public Criteria andMessstateIn(List<String> values) {
            addCriterion("MESSSTATE in", values, "messstate");
            return (Criteria) this;
        }

        public Criteria andMessstateNotIn(List<String> values) {
            addCriterion("MESSSTATE not in", values, "messstate");
            return (Criteria) this;
        }

        public Criteria andMessstateBetween(String value1, String value2) {
            addCriterion("MESSSTATE between", value1, value2, "messstate");
            return (Criteria) this;
        }

        public Criteria andMessstateNotBetween(String value1, String value2) {
            addCriterion("MESSSTATE not between", value1, value2, "messstate");
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