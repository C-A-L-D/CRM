package com.sc.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SYS_USERSExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SYS_USERSExample() {
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

        public Criteria andUnameIsNull() {
            addCriterion("UNAME is null");
            return (Criteria) this;
        }

        public Criteria andUnameIsNotNull() {
            addCriterion("UNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUnameEqualTo(String value) {
            addCriterion("UNAME =", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotEqualTo(String value) {
            addCriterion("UNAME <>", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameGreaterThan(String value) {
            addCriterion("UNAME >", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameGreaterThanOrEqualTo(String value) {
            addCriterion("UNAME >=", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLessThan(String value) {
            addCriterion("UNAME <", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLessThanOrEqualTo(String value) {
            addCriterion("UNAME <=", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLike(String value) {
            addCriterion("UNAME like", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotLike(String value) {
            addCriterion("UNAME not like", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameIn(List<String> values) {
            addCriterion("UNAME in", values, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotIn(List<String> values) {
            addCriterion("UNAME not in", values, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameBetween(String value1, String value2) {
            addCriterion("UNAME between", value1, value2, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotBetween(String value1, String value2) {
            addCriterion("UNAME not between", value1, value2, "uname");
            return (Criteria) this;
        }

        public Criteria andUpasswordIsNull() {
            addCriterion("UPASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andUpasswordIsNotNull() {
            addCriterion("UPASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andUpasswordEqualTo(String value) {
            addCriterion("UPASSWORD =", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordNotEqualTo(String value) {
            addCriterion("UPASSWORD <>", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordGreaterThan(String value) {
            addCriterion("UPASSWORD >", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("UPASSWORD >=", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordLessThan(String value) {
            addCriterion("UPASSWORD <", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordLessThanOrEqualTo(String value) {
            addCriterion("UPASSWORD <=", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordLike(String value) {
            addCriterion("UPASSWORD like", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordNotLike(String value) {
            addCriterion("UPASSWORD not like", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordIn(List<String> values) {
            addCriterion("UPASSWORD in", values, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordNotIn(List<String> values) {
            addCriterion("UPASSWORD not in", values, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordBetween(String value1, String value2) {
            addCriterion("UPASSWORD between", value1, value2, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordNotBetween(String value1, String value2) {
            addCriterion("UPASSWORD not between", value1, value2, "upassword");
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

        public Criteria andUstateIsNull() {
            addCriterion("USTATE is null");
            return (Criteria) this;
        }

        public Criteria andUstateIsNotNull() {
            addCriterion("USTATE is not null");
            return (Criteria) this;
        }

        public Criteria andUstateEqualTo(String value) {
            addCriterion("USTATE =", value, "ustate");
            return (Criteria) this;
        }

        public Criteria andUstateNotEqualTo(String value) {
            addCriterion("USTATE <>", value, "ustate");
            return (Criteria) this;
        }

        public Criteria andUstateGreaterThan(String value) {
            addCriterion("USTATE >", value, "ustate");
            return (Criteria) this;
        }

        public Criteria andUstateGreaterThanOrEqualTo(String value) {
            addCriterion("USTATE >=", value, "ustate");
            return (Criteria) this;
        }

        public Criteria andUstateLessThan(String value) {
            addCriterion("USTATE <", value, "ustate");
            return (Criteria) this;
        }

        public Criteria andUstateLessThanOrEqualTo(String value) {
            addCriterion("USTATE <=", value, "ustate");
            return (Criteria) this;
        }

        public Criteria andUstateLike(String value) {
            addCriterion("USTATE like", value, "ustate");
            return (Criteria) this;
        }

        public Criteria andUstateNotLike(String value) {
            addCriterion("USTATE not like", value, "ustate");
            return (Criteria) this;
        }

        public Criteria andUstateIn(List<String> values) {
            addCriterion("USTATE in", values, "ustate");
            return (Criteria) this;
        }

        public Criteria andUstateNotIn(List<String> values) {
            addCriterion("USTATE not in", values, "ustate");
            return (Criteria) this;
        }

        public Criteria andUstateBetween(String value1, String value2) {
            addCriterion("USTATE between", value1, value2, "ustate");
            return (Criteria) this;
        }

        public Criteria andUstateNotBetween(String value1, String value2) {
            addCriterion("USTATE not between", value1, value2, "ustate");
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