package com.sc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XIAOSHOU_KEHULIANXIJILUExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XIAOSHOU_KEHULIANXIJILUExample() {
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

        public Criteria andLjidIsNull() {
            addCriterion("LJID is null");
            return (Criteria) this;
        }

        public Criteria andLjidIsNotNull() {
            addCriterion("LJID is not null");
            return (Criteria) this;
        }

        public Criteria andLjidEqualTo(Long value) {
            addCriterion("LJID =", value, "ljid");
            return (Criteria) this;
        }

        public Criteria andLjidNotEqualTo(Long value) {
            addCriterion("LJID <>", value, "ljid");
            return (Criteria) this;
        }

        public Criteria andLjidGreaterThan(Long value) {
            addCriterion("LJID >", value, "ljid");
            return (Criteria) this;
        }

        public Criteria andLjidGreaterThanOrEqualTo(Long value) {
            addCriterion("LJID >=", value, "ljid");
            return (Criteria) this;
        }

        public Criteria andLjidLessThan(Long value) {
            addCriterion("LJID <", value, "ljid");
            return (Criteria) this;
        }

        public Criteria andLjidLessThanOrEqualTo(Long value) {
            addCriterion("LJID <=", value, "ljid");
            return (Criteria) this;
        }

        public Criteria andLjidIn(List<Long> values) {
            addCriterion("LJID in", values, "ljid");
            return (Criteria) this;
        }

        public Criteria andLjidNotIn(List<Long> values) {
            addCriterion("LJID not in", values, "ljid");
            return (Criteria) this;
        }

        public Criteria andLjidBetween(Long value1, Long value2) {
            addCriterion("LJID between", value1, value2, "ljid");
            return (Criteria) this;
        }

        public Criteria andLjidNotBetween(Long value1, Long value2) {
            addCriterion("LJID not between", value1, value2, "ljid");
            return (Criteria) this;
        }

        public Criteria andLianxibiaotiIsNull() {
            addCriterion("LIANXIBIAOTI is null");
            return (Criteria) this;
        }

        public Criteria andLianxibiaotiIsNotNull() {
            addCriterion("LIANXIBIAOTI is not null");
            return (Criteria) this;
        }

        public Criteria andLianxibiaotiEqualTo(String value) {
            addCriterion("LIANXIBIAOTI =", value, "lianxibiaoti");
            return (Criteria) this;
        }

        public Criteria andLianxibiaotiNotEqualTo(String value) {
            addCriterion("LIANXIBIAOTI <>", value, "lianxibiaoti");
            return (Criteria) this;
        }

        public Criteria andLianxibiaotiGreaterThan(String value) {
            addCriterion("LIANXIBIAOTI >", value, "lianxibiaoti");
            return (Criteria) this;
        }

        public Criteria andLianxibiaotiGreaterThanOrEqualTo(String value) {
            addCriterion("LIANXIBIAOTI >=", value, "lianxibiaoti");
            return (Criteria) this;
        }

        public Criteria andLianxibiaotiLessThan(String value) {
            addCriterion("LIANXIBIAOTI <", value, "lianxibiaoti");
            return (Criteria) this;
        }

        public Criteria andLianxibiaotiLessThanOrEqualTo(String value) {
            addCriterion("LIANXIBIAOTI <=", value, "lianxibiaoti");
            return (Criteria) this;
        }

        public Criteria andLianxibiaotiLike(String value) {
            addCriterion("LIANXIBIAOTI like", value, "lianxibiaoti");
            return (Criteria) this;
        }

        public Criteria andLianxibiaotiNotLike(String value) {
            addCriterion("LIANXIBIAOTI not like", value, "lianxibiaoti");
            return (Criteria) this;
        }

        public Criteria andLianxibiaotiIn(List<String> values) {
            addCriterion("LIANXIBIAOTI in", values, "lianxibiaoti");
            return (Criteria) this;
        }

        public Criteria andLianxibiaotiNotIn(List<String> values) {
            addCriterion("LIANXIBIAOTI not in", values, "lianxibiaoti");
            return (Criteria) this;
        }

        public Criteria andLianxibiaotiBetween(String value1, String value2) {
            addCriterion("LIANXIBIAOTI between", value1, value2, "lianxibiaoti");
            return (Criteria) this;
        }

        public Criteria andLianxibiaotiNotBetween(String value1, String value2) {
            addCriterion("LIANXIBIAOTI not between", value1, value2, "lianxibiaoti");
            return (Criteria) this;
        }

        public Criteria andLianxishijianIsNull() {
            addCriterion("LIANXISHIJIAN is null");
            return (Criteria) this;
        }

        public Criteria andLianxishijianIsNotNull() {
            addCriterion("LIANXISHIJIAN is not null");
            return (Criteria) this;
        }

        public Criteria andLianxishijianEqualTo(String value) {
            addCriterion("LIANXISHIJIAN =", value, "lianxishijian");
            return (Criteria) this;
        }

        public Criteria andLianxishijianNotEqualTo(String value) {
            addCriterion("LIANXISHIJIAN <>", value, "lianxishijian");
            return (Criteria) this;
        }

        public Criteria andLianxishijianGreaterThan(String value) {
            addCriterion("LIANXISHIJIAN >", value, "lianxishijian");
            return (Criteria) this;
        }

        public Criteria andLianxishijianGreaterThanOrEqualTo(String value) {
            addCriterion("LIANXISHIJIAN >=", value, "lianxishijian");
            return (Criteria) this;
        }

        public Criteria andLianxishijianLessThan(String value) {
            addCriterion("LIANXISHIJIAN <", value, "lianxishijian");
            return (Criteria) this;
        }

        public Criteria andLianxishijianLessThanOrEqualTo(String value) {
            addCriterion("LIANXISHIJIAN <=", value, "lianxishijian");
            return (Criteria) this;
        }

        public Criteria andLianxishijianLike(String value) {
            addCriterion("LIANXISHIJIAN like", value, "lianxishijian");
            return (Criteria) this;
        }

        public Criteria andLianxishijianNotLike(String value) {
            addCriterion("LIANXISHIJIAN not like", value, "lianxishijian");
            return (Criteria) this;
        }

        public Criteria andLianxishijianIn(List<String> values) {
            addCriterion("LIANXISHIJIAN in", values, "lianxishijian");
            return (Criteria) this;
        }

        public Criteria andLianxishijianNotIn(List<String> values) {
            addCriterion("LIANXISHIJIAN not in", values, "lianxishijian");
            return (Criteria) this;
        }

        public Criteria andLianxishijianBetween(String value1, String value2) {
            addCriterion("LIANXISHIJIAN between", value1, value2, "lianxishijian");
            return (Criteria) this;
        }

        public Criteria andLianxishijianNotBetween(String value1, String value2) {
            addCriterion("LIANXISHIJIAN not between", value1, value2, "lianxishijian");
            return (Criteria) this;
        }

        public Criteria andKidIsNull() {
            addCriterion("KID is null");
            return (Criteria) this;
        }

        public Criteria andKidIsNotNull() {
            addCriterion("KID is not null");
            return (Criteria) this;
        }

        public Criteria andKidEqualTo(Long value) {
            addCriterion("KID =", value, "kid");
            return (Criteria) this;
        }

        public Criteria andKidNotEqualTo(Long value) {
            addCriterion("KID <>", value, "kid");
            return (Criteria) this;
        }

        public Criteria andKidGreaterThan(Long value) {
            addCriterion("KID >", value, "kid");
            return (Criteria) this;
        }

        public Criteria andKidGreaterThanOrEqualTo(Long value) {
            addCriterion("KID >=", value, "kid");
            return (Criteria) this;
        }

        public Criteria andKidLessThan(Long value) {
            addCriterion("KID <", value, "kid");
            return (Criteria) this;
        }

        public Criteria andKidLessThanOrEqualTo(Long value) {
            addCriterion("KID <=", value, "kid");
            return (Criteria) this;
        }

        public Criteria andKidIn(List<Long> values) {
            addCriterion("KID in", values, "kid");
            return (Criteria) this;
        }

        public Criteria andKidNotIn(List<Long> values) {
            addCriterion("KID not in", values, "kid");
            return (Criteria) this;
        }

        public Criteria andKidBetween(Long value1, Long value2) {
            addCriterion("KID between", value1, value2, "kid");
            return (Criteria) this;
        }

        public Criteria andKidNotBetween(Long value1, Long value2) {
            addCriterion("KID not between", value1, value2, "kid");
            return (Criteria) this;
        }

        public Criteria andLianxineirongIsNull() {
            addCriterion("LIANXINEIRONG is null");
            return (Criteria) this;
        }

        public Criteria andLianxineirongIsNotNull() {
            addCriterion("LIANXINEIRONG is not null");
            return (Criteria) this;
        }

        public Criteria andLianxineirongEqualTo(String value) {
            addCriterion("LIANXINEIRONG =", value, "lianxineirong");
            return (Criteria) this;
        }

        public Criteria andLianxineirongNotEqualTo(String value) {
            addCriterion("LIANXINEIRONG <>", value, "lianxineirong");
            return (Criteria) this;
        }

        public Criteria andLianxineirongGreaterThan(String value) {
            addCriterion("LIANXINEIRONG >", value, "lianxineirong");
            return (Criteria) this;
        }

        public Criteria andLianxineirongGreaterThanOrEqualTo(String value) {
            addCriterion("LIANXINEIRONG >=", value, "lianxineirong");
            return (Criteria) this;
        }

        public Criteria andLianxineirongLessThan(String value) {
            addCriterion("LIANXINEIRONG <", value, "lianxineirong");
            return (Criteria) this;
        }

        public Criteria andLianxineirongLessThanOrEqualTo(String value) {
            addCriterion("LIANXINEIRONG <=", value, "lianxineirong");
            return (Criteria) this;
        }

        public Criteria andLianxineirongLike(String value) {
            addCriterion("LIANXINEIRONG like", value, "lianxineirong");
            return (Criteria) this;
        }

        public Criteria andLianxineirongNotLike(String value) {
            addCriterion("LIANXINEIRONG not like", value, "lianxineirong");
            return (Criteria) this;
        }

        public Criteria andLianxineirongIn(List<String> values) {
            addCriterion("LIANXINEIRONG in", values, "lianxineirong");
            return (Criteria) this;
        }

        public Criteria andLianxineirongNotIn(List<String> values) {
            addCriterion("LIANXINEIRONG not in", values, "lianxineirong");
            return (Criteria) this;
        }

        public Criteria andLianxineirongBetween(String value1, String value2) {
            addCriterion("LIANXINEIRONG between", value1, value2, "lianxineirong");
            return (Criteria) this;
        }

        public Criteria andLianxineirongNotBetween(String value1, String value2) {
            addCriterion("LIANXINEIRONG not between", value1, value2, "lianxineirong");
            return (Criteria) this;
        }

        public Criteria andGidIsNull() {
            addCriterion("GID is null");
            return (Criteria) this;
        }

        public Criteria andGidIsNotNull() {
            addCriterion("GID is not null");
            return (Criteria) this;
        }

        public Criteria andGidEqualTo(Long value) {
            addCriterion("GID =", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotEqualTo(Long value) {
            addCriterion("GID <>", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThan(Long value) {
            addCriterion("GID >", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThanOrEqualTo(Long value) {
            addCriterion("GID >=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThan(Long value) {
            addCriterion("GID <", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThanOrEqualTo(Long value) {
            addCriterion("GID <=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidIn(List<Long> values) {
            addCriterion("GID in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotIn(List<Long> values) {
            addCriterion("GID not in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidBetween(Long value1, Long value2) {
            addCriterion("GID between", value1, value2, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotBetween(Long value1, Long value2) {
            addCriterion("GID not between", value1, value2, "gid");
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