package com.sc.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysPowerinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysPowerinfoExample() {
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

        public Criteria andPidIsNull() {
            addCriterion("PID is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("PID is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(BigDecimal value) {
            addCriterion("PID =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(BigDecimal value) {
            addCriterion("PID <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(BigDecimal value) {
            addCriterion("PID >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PID >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(BigDecimal value) {
            addCriterion("PID <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PID <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<BigDecimal> values) {
            addCriterion("PID in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<BigDecimal> values) {
            addCriterion("PID not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PID between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PID not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPnameIsNull() {
            addCriterion("PNAME is null");
            return (Criteria) this;
        }

        public Criteria andPnameIsNotNull() {
            addCriterion("PNAME is not null");
            return (Criteria) this;
        }

        public Criteria andPnameEqualTo(String value) {
            addCriterion("PNAME =", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotEqualTo(String value) {
            addCriterion("PNAME <>", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameGreaterThan(String value) {
            addCriterion("PNAME >", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameGreaterThanOrEqualTo(String value) {
            addCriterion("PNAME >=", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLessThan(String value) {
            addCriterion("PNAME <", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLessThanOrEqualTo(String value) {
            addCriterion("PNAME <=", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLike(String value) {
            addCriterion("PNAME like", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotLike(String value) {
            addCriterion("PNAME not like", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameIn(List<String> values) {
            addCriterion("PNAME in", values, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotIn(List<String> values) {
            addCriterion("PNAME not in", values, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameBetween(String value1, String value2) {
            addCriterion("PNAME between", value1, value2, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotBetween(String value1, String value2) {
            addCriterion("PNAME not between", value1, value2, "pname");
            return (Criteria) this;
        }

        public Criteria andPpowerIsNull() {
            addCriterion("PPOWER is null");
            return (Criteria) this;
        }

        public Criteria andPpowerIsNotNull() {
            addCriterion("PPOWER is not null");
            return (Criteria) this;
        }

        public Criteria andPpowerEqualTo(String value) {
            addCriterion("PPOWER =", value, "ppower");
            return (Criteria) this;
        }

        public Criteria andPpowerNotEqualTo(String value) {
            addCriterion("PPOWER <>", value, "ppower");
            return (Criteria) this;
        }

        public Criteria andPpowerGreaterThan(String value) {
            addCriterion("PPOWER >", value, "ppower");
            return (Criteria) this;
        }

        public Criteria andPpowerGreaterThanOrEqualTo(String value) {
            addCriterion("PPOWER >=", value, "ppower");
            return (Criteria) this;
        }

        public Criteria andPpowerLessThan(String value) {
            addCriterion("PPOWER <", value, "ppower");
            return (Criteria) this;
        }

        public Criteria andPpowerLessThanOrEqualTo(String value) {
            addCriterion("PPOWER <=", value, "ppower");
            return (Criteria) this;
        }

        public Criteria andPpowerLike(String value) {
            addCriterion("PPOWER like", value, "ppower");
            return (Criteria) this;
        }

        public Criteria andPpowerNotLike(String value) {
            addCriterion("PPOWER not like", value, "ppower");
            return (Criteria) this;
        }

        public Criteria andPpowerIn(List<String> values) {
            addCriterion("PPOWER in", values, "ppower");
            return (Criteria) this;
        }

        public Criteria andPpowerNotIn(List<String> values) {
            addCriterion("PPOWER not in", values, "ppower");
            return (Criteria) this;
        }

        public Criteria andPpowerBetween(String value1, String value2) {
            addCriterion("PPOWER between", value1, value2, "ppower");
            return (Criteria) this;
        }

        public Criteria andPpowerNotBetween(String value1, String value2) {
            addCriterion("PPOWER not between", value1, value2, "ppower");
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

        public Criteria andPcolumnIdEqualTo(String value) {
            addCriterion("PCOLUMN_ID =", value, "pcolumnId");
            return (Criteria) this;
        }

        public Criteria andPcolumnIdNotEqualTo(String value) {
            addCriterion("PCOLUMN_ID <>", value, "pcolumnId");
            return (Criteria) this;
        }

        public Criteria andPcolumnIdGreaterThan(String value) {
            addCriterion("PCOLUMN_ID >", value, "pcolumnId");
            return (Criteria) this;
        }

        public Criteria andPcolumnIdGreaterThanOrEqualTo(String value) {
            addCriterion("PCOLUMN_ID >=", value, "pcolumnId");
            return (Criteria) this;
        }

        public Criteria andPcolumnIdLessThan(String value) {
            addCriterion("PCOLUMN_ID <", value, "pcolumnId");
            return (Criteria) this;
        }

        public Criteria andPcolumnIdLessThanOrEqualTo(String value) {
            addCriterion("PCOLUMN_ID <=", value, "pcolumnId");
            return (Criteria) this;
        }

        public Criteria andPcolumnIdLike(String value) {
            addCriterion("PCOLUMN_ID like", value, "pcolumnId");
            return (Criteria) this;
        }

        public Criteria andPcolumnIdNotLike(String value) {
            addCriterion("PCOLUMN_ID not like", value, "pcolumnId");
            return (Criteria) this;
        }

        public Criteria andPcolumnIdIn(List<String> values) {
            addCriterion("PCOLUMN_ID in", values, "pcolumnId");
            return (Criteria) this;
        }

        public Criteria andPcolumnIdNotIn(List<String> values) {
            addCriterion("PCOLUMN_ID not in", values, "pcolumnId");
            return (Criteria) this;
        }

        public Criteria andPcolumnIdBetween(String value1, String value2) {
            addCriterion("PCOLUMN_ID between", value1, value2, "pcolumnId");
            return (Criteria) this;
        }

        public Criteria andPcolumnIdNotBetween(String value1, String value2) {
            addCriterion("PCOLUMN_ID not between", value1, value2, "pcolumnId");
            return (Criteria) this;
        }

        public Criteria andPdescribeIsNull() {
            addCriterion("PDESCRIBE is null");
            return (Criteria) this;
        }

        public Criteria andPdescribeIsNotNull() {
            addCriterion("PDESCRIBE is not null");
            return (Criteria) this;
        }

        public Criteria andPdescribeEqualTo(String value) {
            addCriterion("PDESCRIBE =", value, "pdescribe");
            return (Criteria) this;
        }

        public Criteria andPdescribeNotEqualTo(String value) {
            addCriterion("PDESCRIBE <>", value, "pdescribe");
            return (Criteria) this;
        }

        public Criteria andPdescribeGreaterThan(String value) {
            addCriterion("PDESCRIBE >", value, "pdescribe");
            return (Criteria) this;
        }

        public Criteria andPdescribeGreaterThanOrEqualTo(String value) {
            addCriterion("PDESCRIBE >=", value, "pdescribe");
            return (Criteria) this;
        }

        public Criteria andPdescribeLessThan(String value) {
            addCriterion("PDESCRIBE <", value, "pdescribe");
            return (Criteria) this;
        }

        public Criteria andPdescribeLessThanOrEqualTo(String value) {
            addCriterion("PDESCRIBE <=", value, "pdescribe");
            return (Criteria) this;
        }

        public Criteria andPdescribeLike(String value) {
            addCriterion("PDESCRIBE like", value, "pdescribe");
            return (Criteria) this;
        }

        public Criteria andPdescribeNotLike(String value) {
            addCriterion("PDESCRIBE not like", value, "pdescribe");
            return (Criteria) this;
        }

        public Criteria andPdescribeIn(List<String> values) {
            addCriterion("PDESCRIBE in", values, "pdescribe");
            return (Criteria) this;
        }

        public Criteria andPdescribeNotIn(List<String> values) {
            addCriterion("PDESCRIBE not in", values, "pdescribe");
            return (Criteria) this;
        }

        public Criteria andPdescribeBetween(String value1, String value2) {
            addCriterion("PDESCRIBE between", value1, value2, "pdescribe");
            return (Criteria) this;
        }

        public Criteria andPdescribeNotBetween(String value1, String value2) {
            addCriterion("PDESCRIBE not between", value1, value2, "pdescribe");
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