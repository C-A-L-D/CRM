package com.sc.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SYS_JOBINFOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SYS_JOBINFOExample() {
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

        public Criteria andJidIsNull() {
            addCriterion("JID is null");
            return (Criteria) this;
        }

        public Criteria andJidIsNotNull() {
            addCriterion("JID is not null");
            return (Criteria) this;
        }

        public Criteria andJidEqualTo(BigDecimal value) {
            addCriterion("JID =", value, "jid");
            return (Criteria) this;
        }

        public Criteria andJidNotEqualTo(BigDecimal value) {
            addCriterion("JID <>", value, "jid");
            return (Criteria) this;
        }

        public Criteria andJidGreaterThan(BigDecimal value) {
            addCriterion("JID >", value, "jid");
            return (Criteria) this;
        }

        public Criteria andJidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("JID >=", value, "jid");
            return (Criteria) this;
        }

        public Criteria andJidLessThan(BigDecimal value) {
            addCriterion("JID <", value, "jid");
            return (Criteria) this;
        }

        public Criteria andJidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("JID <=", value, "jid");
            return (Criteria) this;
        }

        public Criteria andJidIn(List<BigDecimal> values) {
            addCriterion("JID in", values, "jid");
            return (Criteria) this;
        }

        public Criteria andJidNotIn(List<BigDecimal> values) {
            addCriterion("JID not in", values, "jid");
            return (Criteria) this;
        }

        public Criteria andJidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JID between", value1, value2, "jid");
            return (Criteria) this;
        }

        public Criteria andJidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JID not between", value1, value2, "jid");
            return (Criteria) this;
        }

        public Criteria andJnameIsNull() {
            addCriterion("JNAME is null");
            return (Criteria) this;
        }

        public Criteria andJnameIsNotNull() {
            addCriterion("JNAME is not null");
            return (Criteria) this;
        }

        public Criteria andJnameEqualTo(String value) {
            addCriterion("JNAME =", value, "jname");
            return (Criteria) this;
        }

        public Criteria andJnameNotEqualTo(String value) {
            addCriterion("JNAME <>", value, "jname");
            return (Criteria) this;
        }

        public Criteria andJnameGreaterThan(String value) {
            addCriterion("JNAME >", value, "jname");
            return (Criteria) this;
        }

        public Criteria andJnameGreaterThanOrEqualTo(String value) {
            addCriterion("JNAME >=", value, "jname");
            return (Criteria) this;
        }

        public Criteria andJnameLessThan(String value) {
            addCriterion("JNAME <", value, "jname");
            return (Criteria) this;
        }

        public Criteria andJnameLessThanOrEqualTo(String value) {
            addCriterion("JNAME <=", value, "jname");
            return (Criteria) this;
        }

        public Criteria andJnameLike(String value) {
            addCriterion("JNAME like", value, "jname");
            return (Criteria) this;
        }

        public Criteria andJnameNotLike(String value) {
            addCriterion("JNAME not like", value, "jname");
            return (Criteria) this;
        }

        public Criteria andJnameIn(List<String> values) {
            addCriterion("JNAME in", values, "jname");
            return (Criteria) this;
        }

        public Criteria andJnameNotIn(List<String> values) {
            addCriterion("JNAME not in", values, "jname");
            return (Criteria) this;
        }

        public Criteria andJnameBetween(String value1, String value2) {
            addCriterion("JNAME between", value1, value2, "jname");
            return (Criteria) this;
        }

        public Criteria andJnameNotBetween(String value1, String value2) {
            addCriterion("JNAME not between", value1, value2, "jname");
            return (Criteria) this;
        }

        public Criteria andDidIsNull() {
            addCriterion("DID is null");
            return (Criteria) this;
        }

        public Criteria andDidIsNotNull() {
            addCriterion("DID is not null");
            return (Criteria) this;
        }

        public Criteria andDidEqualTo(BigDecimal value) {
            addCriterion("DID =", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotEqualTo(BigDecimal value) {
            addCriterion("DID <>", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThan(BigDecimal value) {
            addCriterion("DID >", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DID >=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThan(BigDecimal value) {
            addCriterion("DID <", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DID <=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidIn(List<BigDecimal> values) {
            addCriterion("DID in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotIn(List<BigDecimal> values) {
            addCriterion("DID not in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DID between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DID not between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andJdescribeIsNull() {
            addCriterion("JDESCRIBE is null");
            return (Criteria) this;
        }

        public Criteria andJdescribeIsNotNull() {
            addCriterion("JDESCRIBE is not null");
            return (Criteria) this;
        }

        public Criteria andJdescribeEqualTo(String value) {
            addCriterion("JDESCRIBE =", value, "jdescribe");
            return (Criteria) this;
        }

        public Criteria andJdescribeNotEqualTo(String value) {
            addCriterion("JDESCRIBE <>", value, "jdescribe");
            return (Criteria) this;
        }

        public Criteria andJdescribeGreaterThan(String value) {
            addCriterion("JDESCRIBE >", value, "jdescribe");
            return (Criteria) this;
        }

        public Criteria andJdescribeGreaterThanOrEqualTo(String value) {
            addCriterion("JDESCRIBE >=", value, "jdescribe");
            return (Criteria) this;
        }

        public Criteria andJdescribeLessThan(String value) {
            addCriterion("JDESCRIBE <", value, "jdescribe");
            return (Criteria) this;
        }

        public Criteria andJdescribeLessThanOrEqualTo(String value) {
            addCriterion("JDESCRIBE <=", value, "jdescribe");
            return (Criteria) this;
        }

        public Criteria andJdescribeLike(String value) {
            addCriterion("JDESCRIBE like", value, "jdescribe");
            return (Criteria) this;
        }

        public Criteria andJdescribeNotLike(String value) {
            addCriterion("JDESCRIBE not like", value, "jdescribe");
            return (Criteria) this;
        }

        public Criteria andJdescribeIn(List<String> values) {
            addCriterion("JDESCRIBE in", values, "jdescribe");
            return (Criteria) this;
        }

        public Criteria andJdescribeNotIn(List<String> values) {
            addCriterion("JDESCRIBE not in", values, "jdescribe");
            return (Criteria) this;
        }

        public Criteria andJdescribeBetween(String value1, String value2) {
            addCriterion("JDESCRIBE between", value1, value2, "jdescribe");
            return (Criteria) this;
        }

        public Criteria andJdescribeNotBetween(String value1, String value2) {
            addCriterion("JDESCRIBE not between", value1, value2, "jdescribe");
            return (Criteria) this;
        }

        public Criteria andGongsiidIsNull() {
            addCriterion("GONGSIID is null");
            return (Criteria) this;
        }

        public Criteria andGongsiidIsNotNull() {
            addCriterion("GONGSIID is not null");
            return (Criteria) this;
        }

        public Criteria andGongsiidEqualTo(BigDecimal value) {
            addCriterion("GONGSIID =", value, "gongsiid");
            return (Criteria) this;
        }

        public Criteria andGongsiidNotEqualTo(BigDecimal value) {
            addCriterion("GONGSIID <>", value, "gongsiid");
            return (Criteria) this;
        }

        public Criteria andGongsiidGreaterThan(BigDecimal value) {
            addCriterion("GONGSIID >", value, "gongsiid");
            return (Criteria) this;
        }

        public Criteria andGongsiidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GONGSIID >=", value, "gongsiid");
            return (Criteria) this;
        }

        public Criteria andGongsiidLessThan(BigDecimal value) {
            addCriterion("GONGSIID <", value, "gongsiid");
            return (Criteria) this;
        }

        public Criteria andGongsiidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GONGSIID <=", value, "gongsiid");
            return (Criteria) this;
        }

        public Criteria andGongsiidIn(List<BigDecimal> values) {
            addCriterion("GONGSIID in", values, "gongsiid");
            return (Criteria) this;
        }

        public Criteria andGongsiidNotIn(List<BigDecimal> values) {
            addCriterion("GONGSIID not in", values, "gongsiid");
            return (Criteria) this;
        }

        public Criteria andGongsiidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GONGSIID between", value1, value2, "gongsiid");
            return (Criteria) this;
        }

        public Criteria andGongsiidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GONGSIID not between", value1, value2, "gongsiid");
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