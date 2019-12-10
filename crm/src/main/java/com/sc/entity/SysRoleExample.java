package com.sc.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysRoleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysRoleExample() {
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

        public Criteria andRnameIsNull() {
            addCriterion("RNAME is null");
            return (Criteria) this;
        }

        public Criteria andRnameIsNotNull() {
            addCriterion("RNAME is not null");
            return (Criteria) this;
        }

        public Criteria andRnameEqualTo(String value) {
            addCriterion("RNAME =", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameNotEqualTo(String value) {
            addCriterion("RNAME <>", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameGreaterThan(String value) {
            addCriterion("RNAME >", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameGreaterThanOrEqualTo(String value) {
            addCriterion("RNAME >=", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameLessThan(String value) {
            addCriterion("RNAME <", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameLessThanOrEqualTo(String value) {
            addCriterion("RNAME <=", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameLike(String value) {
            addCriterion("RNAME like", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameNotLike(String value) {
            addCriterion("RNAME not like", value, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameIn(List<String> values) {
            addCriterion("RNAME in", values, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameNotIn(List<String> values) {
            addCriterion("RNAME not in", values, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameBetween(String value1, String value2) {
            addCriterion("RNAME between", value1, value2, "rname");
            return (Criteria) this;
        }

        public Criteria andRnameNotBetween(String value1, String value2) {
            addCriterion("RNAME not between", value1, value2, "rname");
            return (Criteria) this;
        }

        public Criteria andRdescribeIsNull() {
            addCriterion("RDESCRIBE is null");
            return (Criteria) this;
        }

        public Criteria andRdescribeIsNotNull() {
            addCriterion("RDESCRIBE is not null");
            return (Criteria) this;
        }

        public Criteria andRdescribeEqualTo(String value) {
            addCriterion("RDESCRIBE =", value, "rdescribe");
            return (Criteria) this;
        }

        public Criteria andRdescribeNotEqualTo(String value) {
            addCriterion("RDESCRIBE <>", value, "rdescribe");
            return (Criteria) this;
        }

        public Criteria andRdescribeGreaterThan(String value) {
            addCriterion("RDESCRIBE >", value, "rdescribe");
            return (Criteria) this;
        }

        public Criteria andRdescribeGreaterThanOrEqualTo(String value) {
            addCriterion("RDESCRIBE >=", value, "rdescribe");
            return (Criteria) this;
        }

        public Criteria andRdescribeLessThan(String value) {
            addCriterion("RDESCRIBE <", value, "rdescribe");
            return (Criteria) this;
        }

        public Criteria andRdescribeLessThanOrEqualTo(String value) {
            addCriterion("RDESCRIBE <=", value, "rdescribe");
            return (Criteria) this;
        }

        public Criteria andRdescribeLike(String value) {
            addCriterion("RDESCRIBE like", value, "rdescribe");
            return (Criteria) this;
        }

        public Criteria andRdescribeNotLike(String value) {
            addCriterion("RDESCRIBE not like", value, "rdescribe");
            return (Criteria) this;
        }

        public Criteria andRdescribeIn(List<String> values) {
            addCriterion("RDESCRIBE in", values, "rdescribe");
            return (Criteria) this;
        }

        public Criteria andRdescribeNotIn(List<String> values) {
            addCriterion("RDESCRIBE not in", values, "rdescribe");
            return (Criteria) this;
        }

        public Criteria andRdescribeBetween(String value1, String value2) {
            addCriterion("RDESCRIBE between", value1, value2, "rdescribe");
            return (Criteria) this;
        }

        public Criteria andRdescribeNotBetween(String value1, String value2) {
            addCriterion("RDESCRIBE not between", value1, value2, "rdescribe");
            return (Criteria) this;
        }

        public Criteria andHeadridIsNull() {
            addCriterion("HEADRID is null");
            return (Criteria) this;
        }

        public Criteria andHeadridIsNotNull() {
            addCriterion("HEADRID is not null");
            return (Criteria) this;
        }

        public Criteria andHeadridEqualTo(BigDecimal value) {
            addCriterion("HEADRID =", value, "headrid");
            return (Criteria) this;
        }

        public Criteria andHeadridNotEqualTo(BigDecimal value) {
            addCriterion("HEADRID <>", value, "headrid");
            return (Criteria) this;
        }

        public Criteria andHeadridGreaterThan(BigDecimal value) {
            addCriterion("HEADRID >", value, "headrid");
            return (Criteria) this;
        }

        public Criteria andHeadridGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HEADRID >=", value, "headrid");
            return (Criteria) this;
        }

        public Criteria andHeadridLessThan(BigDecimal value) {
            addCriterion("HEADRID <", value, "headrid");
            return (Criteria) this;
        }

        public Criteria andHeadridLessThanOrEqualTo(BigDecimal value) {
            addCriterion("HEADRID <=", value, "headrid");
            return (Criteria) this;
        }

        public Criteria andHeadridIn(List<BigDecimal> values) {
            addCriterion("HEADRID in", values, "headrid");
            return (Criteria) this;
        }

        public Criteria andHeadridNotIn(List<BigDecimal> values) {
            addCriterion("HEADRID not in", values, "headrid");
            return (Criteria) this;
        }

        public Criteria andHeadridBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HEADRID between", value1, value2, "headrid");
            return (Criteria) this;
        }

        public Criteria andHeadridNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HEADRID not between", value1, value2, "headrid");
            return (Criteria) this;
        }

        public Criteria andOpertoridIsNull() {
            addCriterion("OPERTORID is null");
            return (Criteria) this;
        }

        public Criteria andOpertoridIsNotNull() {
            addCriterion("OPERTORID is not null");
            return (Criteria) this;
        }

        public Criteria andOpertoridEqualTo(BigDecimal value) {
            addCriterion("OPERTORID =", value, "opertorid");
            return (Criteria) this;
        }

        public Criteria andOpertoridNotEqualTo(BigDecimal value) {
            addCriterion("OPERTORID <>", value, "opertorid");
            return (Criteria) this;
        }

        public Criteria andOpertoridGreaterThan(BigDecimal value) {
            addCriterion("OPERTORID >", value, "opertorid");
            return (Criteria) this;
        }

        public Criteria andOpertoridGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OPERTORID >=", value, "opertorid");
            return (Criteria) this;
        }

        public Criteria andOpertoridLessThan(BigDecimal value) {
            addCriterion("OPERTORID <", value, "opertorid");
            return (Criteria) this;
        }

        public Criteria andOpertoridLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OPERTORID <=", value, "opertorid");
            return (Criteria) this;
        }

        public Criteria andOpertoridIn(List<BigDecimal> values) {
            addCriterion("OPERTORID in", values, "opertorid");
            return (Criteria) this;
        }

        public Criteria andOpertoridNotIn(List<BigDecimal> values) {
            addCriterion("OPERTORID not in", values, "opertorid");
            return (Criteria) this;
        }

        public Criteria andOpertoridBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OPERTORID between", value1, value2, "opertorid");
            return (Criteria) this;
        }

        public Criteria andOpertoridNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OPERTORID not between", value1, value2, "opertorid");
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