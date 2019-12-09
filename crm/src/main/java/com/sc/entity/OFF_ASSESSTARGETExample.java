package com.sc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OFF_ASSESSTARGETExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OFF_ASSESSTARGETExample() {
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

        public Criteria andTargetidIsNull() {
            addCriterion("TARGETID is null");
            return (Criteria) this;
        }

        public Criteria andTargetidIsNotNull() {
            addCriterion("TARGETID is not null");
            return (Criteria) this;
        }

        public Criteria andTargetidEqualTo(Long value) {
            addCriterion("TARGETID =", value, "targetid");
            return (Criteria) this;
        }

        public Criteria andTargetidNotEqualTo(Long value) {
            addCriterion("TARGETID <>", value, "targetid");
            return (Criteria) this;
        }

        public Criteria andTargetidGreaterThan(Long value) {
            addCriterion("TARGETID >", value, "targetid");
            return (Criteria) this;
        }

        public Criteria andTargetidGreaterThanOrEqualTo(Long value) {
            addCriterion("TARGETID >=", value, "targetid");
            return (Criteria) this;
        }

        public Criteria andTargetidLessThan(Long value) {
            addCriterion("TARGETID <", value, "targetid");
            return (Criteria) this;
        }

        public Criteria andTargetidLessThanOrEqualTo(Long value) {
            addCriterion("TARGETID <=", value, "targetid");
            return (Criteria) this;
        }

        public Criteria andTargetidIn(List<Long> values) {
            addCriterion("TARGETID in", values, "targetid");
            return (Criteria) this;
        }

        public Criteria andTargetidNotIn(List<Long> values) {
            addCriterion("TARGETID not in", values, "targetid");
            return (Criteria) this;
        }

        public Criteria andTargetidBetween(Long value1, Long value2) {
            addCriterion("TARGETID between", value1, value2, "targetid");
            return (Criteria) this;
        }

        public Criteria andTargetidNotBetween(Long value1, Long value2) {
            addCriterion("TARGETID not between", value1, value2, "targetid");
            return (Criteria) this;
        }

        public Criteria andAssesstargetIsNull() {
            addCriterion("ASSESSTARGET is null");
            return (Criteria) this;
        }

        public Criteria andAssesstargetIsNotNull() {
            addCriterion("ASSESSTARGET is not null");
            return (Criteria) this;
        }

        public Criteria andAssesstargetEqualTo(String value) {
            addCriterion("ASSESSTARGET =", value, "assesstarget");
            return (Criteria) this;
        }

        public Criteria andAssesstargetNotEqualTo(String value) {
            addCriterion("ASSESSTARGET <>", value, "assesstarget");
            return (Criteria) this;
        }

        public Criteria andAssesstargetGreaterThan(String value) {
            addCriterion("ASSESSTARGET >", value, "assesstarget");
            return (Criteria) this;
        }

        public Criteria andAssesstargetGreaterThanOrEqualTo(String value) {
            addCriterion("ASSESSTARGET >=", value, "assesstarget");
            return (Criteria) this;
        }

        public Criteria andAssesstargetLessThan(String value) {
            addCriterion("ASSESSTARGET <", value, "assesstarget");
            return (Criteria) this;
        }

        public Criteria andAssesstargetLessThanOrEqualTo(String value) {
            addCriterion("ASSESSTARGET <=", value, "assesstarget");
            return (Criteria) this;
        }

        public Criteria andAssesstargetLike(String value) {
            addCriterion("ASSESSTARGET like", value, "assesstarget");
            return (Criteria) this;
        }

        public Criteria andAssesstargetNotLike(String value) {
            addCriterion("ASSESSTARGET not like", value, "assesstarget");
            return (Criteria) this;
        }

        public Criteria andAssesstargetIn(List<String> values) {
            addCriterion("ASSESSTARGET in", values, "assesstarget");
            return (Criteria) this;
        }

        public Criteria andAssesstargetNotIn(List<String> values) {
            addCriterion("ASSESSTARGET not in", values, "assesstarget");
            return (Criteria) this;
        }

        public Criteria andAssesstargetBetween(String value1, String value2) {
            addCriterion("ASSESSTARGET between", value1, value2, "assesstarget");
            return (Criteria) this;
        }

        public Criteria andAssesstargetNotBetween(String value1, String value2) {
            addCriterion("ASSESSTARGET not between", value1, value2, "assesstarget");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("REMARKS is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("REMARKS is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("REMARKS =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("REMARKS <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("REMARKS >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("REMARKS >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("REMARKS <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("REMARKS <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("REMARKS like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("REMARKS not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("REMARKS in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("REMARKS not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("REMARKS between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("REMARKS not between", value1, value2, "remarks");
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