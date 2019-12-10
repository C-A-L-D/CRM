package com.sc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XiaoshouKehuliusgiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XiaoshouKehuliusgiExample() {
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

        public Criteria andKsidIsNull() {
            addCriterion("KSID is null");
            return (Criteria) this;
        }

        public Criteria andKsidIsNotNull() {
            addCriterion("KSID is not null");
            return (Criteria) this;
        }

        public Criteria andKsidEqualTo(Long value) {
            addCriterion("KSID =", value, "ksid");
            return (Criteria) this;
        }

        public Criteria andKsidNotEqualTo(Long value) {
            addCriterion("KSID <>", value, "ksid");
            return (Criteria) this;
        }

        public Criteria andKsidGreaterThan(Long value) {
            addCriterion("KSID >", value, "ksid");
            return (Criteria) this;
        }

        public Criteria andKsidGreaterThanOrEqualTo(Long value) {
            addCriterion("KSID >=", value, "ksid");
            return (Criteria) this;
        }

        public Criteria andKsidLessThan(Long value) {
            addCriterion("KSID <", value, "ksid");
            return (Criteria) this;
        }

        public Criteria andKsidLessThanOrEqualTo(Long value) {
            addCriterion("KSID <=", value, "ksid");
            return (Criteria) this;
        }

        public Criteria andKsidIn(List<Long> values) {
            addCriterion("KSID in", values, "ksid");
            return (Criteria) this;
        }

        public Criteria andKsidNotIn(List<Long> values) {
            addCriterion("KSID not in", values, "ksid");
            return (Criteria) this;
        }

        public Criteria andKsidBetween(Long value1, Long value2) {
            addCriterion("KSID between", value1, value2, "ksid");
            return (Criteria) this;
        }

        public Criteria andKsidNotBetween(Long value1, Long value2) {
            addCriterion("KSID not between", value1, value2, "ksid");
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

        public Criteria andCaozuorenyuanbianhaoIsNull() {
            addCriterion("CAOZUORENYUANBIANHAO is null");
            return (Criteria) this;
        }

        public Criteria andCaozuorenyuanbianhaoIsNotNull() {
            addCriterion("CAOZUORENYUANBIANHAO is not null");
            return (Criteria) this;
        }

        public Criteria andCaozuorenyuanbianhaoEqualTo(String value) {
            addCriterion("CAOZUORENYUANBIANHAO =", value, "caozuorenyuanbianhao");
            return (Criteria) this;
        }

        public Criteria andCaozuorenyuanbianhaoNotEqualTo(String value) {
            addCriterion("CAOZUORENYUANBIANHAO <>", value, "caozuorenyuanbianhao");
            return (Criteria) this;
        }

        public Criteria andCaozuorenyuanbianhaoGreaterThan(String value) {
            addCriterion("CAOZUORENYUANBIANHAO >", value, "caozuorenyuanbianhao");
            return (Criteria) this;
        }

        public Criteria andCaozuorenyuanbianhaoGreaterThanOrEqualTo(String value) {
            addCriterion("CAOZUORENYUANBIANHAO >=", value, "caozuorenyuanbianhao");
            return (Criteria) this;
        }

        public Criteria andCaozuorenyuanbianhaoLessThan(String value) {
            addCriterion("CAOZUORENYUANBIANHAO <", value, "caozuorenyuanbianhao");
            return (Criteria) this;
        }

        public Criteria andCaozuorenyuanbianhaoLessThanOrEqualTo(String value) {
            addCriterion("CAOZUORENYUANBIANHAO <=", value, "caozuorenyuanbianhao");
            return (Criteria) this;
        }

        public Criteria andCaozuorenyuanbianhaoLike(String value) {
            addCriterion("CAOZUORENYUANBIANHAO like", value, "caozuorenyuanbianhao");
            return (Criteria) this;
        }

        public Criteria andCaozuorenyuanbianhaoNotLike(String value) {
            addCriterion("CAOZUORENYUANBIANHAO not like", value, "caozuorenyuanbianhao");
            return (Criteria) this;
        }

        public Criteria andCaozuorenyuanbianhaoIn(List<String> values) {
            addCriterion("CAOZUORENYUANBIANHAO in", values, "caozuorenyuanbianhao");
            return (Criteria) this;
        }

        public Criteria andCaozuorenyuanbianhaoNotIn(List<String> values) {
            addCriterion("CAOZUORENYUANBIANHAO not in", values, "caozuorenyuanbianhao");
            return (Criteria) this;
        }

        public Criteria andCaozuorenyuanbianhaoBetween(String value1, String value2) {
            addCriterion("CAOZUORENYUANBIANHAO between", value1, value2, "caozuorenyuanbianhao");
            return (Criteria) this;
        }

        public Criteria andCaozuorenyuanbianhaoNotBetween(String value1, String value2) {
            addCriterion("CAOZUORENYUANBIANHAO not between", value1, value2, "caozuorenyuanbianhao");
            return (Criteria) this;
        }

        public Criteria andChulifangshiIsNull() {
            addCriterion("CHULIFANGSHI is null");
            return (Criteria) this;
        }

        public Criteria andChulifangshiIsNotNull() {
            addCriterion("CHULIFANGSHI is not null");
            return (Criteria) this;
        }

        public Criteria andChulifangshiEqualTo(String value) {
            addCriterion("CHULIFANGSHI =", value, "chulifangshi");
            return (Criteria) this;
        }

        public Criteria andChulifangshiNotEqualTo(String value) {
            addCriterion("CHULIFANGSHI <>", value, "chulifangshi");
            return (Criteria) this;
        }

        public Criteria andChulifangshiGreaterThan(String value) {
            addCriterion("CHULIFANGSHI >", value, "chulifangshi");
            return (Criteria) this;
        }

        public Criteria andChulifangshiGreaterThanOrEqualTo(String value) {
            addCriterion("CHULIFANGSHI >=", value, "chulifangshi");
            return (Criteria) this;
        }

        public Criteria andChulifangshiLessThan(String value) {
            addCriterion("CHULIFANGSHI <", value, "chulifangshi");
            return (Criteria) this;
        }

        public Criteria andChulifangshiLessThanOrEqualTo(String value) {
            addCriterion("CHULIFANGSHI <=", value, "chulifangshi");
            return (Criteria) this;
        }

        public Criteria andChulifangshiLike(String value) {
            addCriterion("CHULIFANGSHI like", value, "chulifangshi");
            return (Criteria) this;
        }

        public Criteria andChulifangshiNotLike(String value) {
            addCriterion("CHULIFANGSHI not like", value, "chulifangshi");
            return (Criteria) this;
        }

        public Criteria andChulifangshiIn(List<String> values) {
            addCriterion("CHULIFANGSHI in", values, "chulifangshi");
            return (Criteria) this;
        }

        public Criteria andChulifangshiNotIn(List<String> values) {
            addCriterion("CHULIFANGSHI not in", values, "chulifangshi");
            return (Criteria) this;
        }

        public Criteria andChulifangshiBetween(String value1, String value2) {
            addCriterion("CHULIFANGSHI between", value1, value2, "chulifangshi");
            return (Criteria) this;
        }

        public Criteria andChulifangshiNotBetween(String value1, String value2) {
            addCriterion("CHULIFANGSHI not between", value1, value2, "chulifangshi");
            return (Criteria) this;
        }

        public Criteria andChulicuoshiIsNull() {
            addCriterion("CHULICUOSHI is null");
            return (Criteria) this;
        }

        public Criteria andChulicuoshiIsNotNull() {
            addCriterion("CHULICUOSHI is not null");
            return (Criteria) this;
        }

        public Criteria andChulicuoshiEqualTo(String value) {
            addCriterion("CHULICUOSHI =", value, "chulicuoshi");
            return (Criteria) this;
        }

        public Criteria andChulicuoshiNotEqualTo(String value) {
            addCriterion("CHULICUOSHI <>", value, "chulicuoshi");
            return (Criteria) this;
        }

        public Criteria andChulicuoshiGreaterThan(String value) {
            addCriterion("CHULICUOSHI >", value, "chulicuoshi");
            return (Criteria) this;
        }

        public Criteria andChulicuoshiGreaterThanOrEqualTo(String value) {
            addCriterion("CHULICUOSHI >=", value, "chulicuoshi");
            return (Criteria) this;
        }

        public Criteria andChulicuoshiLessThan(String value) {
            addCriterion("CHULICUOSHI <", value, "chulicuoshi");
            return (Criteria) this;
        }

        public Criteria andChulicuoshiLessThanOrEqualTo(String value) {
            addCriterion("CHULICUOSHI <=", value, "chulicuoshi");
            return (Criteria) this;
        }

        public Criteria andChulicuoshiLike(String value) {
            addCriterion("CHULICUOSHI like", value, "chulicuoshi");
            return (Criteria) this;
        }

        public Criteria andChulicuoshiNotLike(String value) {
            addCriterion("CHULICUOSHI not like", value, "chulicuoshi");
            return (Criteria) this;
        }

        public Criteria andChulicuoshiIn(List<String> values) {
            addCriterion("CHULICUOSHI in", values, "chulicuoshi");
            return (Criteria) this;
        }

        public Criteria andChulicuoshiNotIn(List<String> values) {
            addCriterion("CHULICUOSHI not in", values, "chulicuoshi");
            return (Criteria) this;
        }

        public Criteria andChulicuoshiBetween(String value1, String value2) {
            addCriterion("CHULICUOSHI between", value1, value2, "chulicuoshi");
            return (Criteria) this;
        }

        public Criteria andChulicuoshiNotBetween(String value1, String value2) {
            addCriterion("CHULICUOSHI not between", value1, value2, "chulicuoshi");
            return (Criteria) this;
        }

        public Criteria andShifouliushiIsNull() {
            addCriterion("SHIFOULIUSHI is null");
            return (Criteria) this;
        }

        public Criteria andShifouliushiIsNotNull() {
            addCriterion("SHIFOULIUSHI is not null");
            return (Criteria) this;
        }

        public Criteria andShifouliushiEqualTo(String value) {
            addCriterion("SHIFOULIUSHI =", value, "shifouliushi");
            return (Criteria) this;
        }

        public Criteria andShifouliushiNotEqualTo(String value) {
            addCriterion("SHIFOULIUSHI <>", value, "shifouliushi");
            return (Criteria) this;
        }

        public Criteria andShifouliushiGreaterThan(String value) {
            addCriterion("SHIFOULIUSHI >", value, "shifouliushi");
            return (Criteria) this;
        }

        public Criteria andShifouliushiGreaterThanOrEqualTo(String value) {
            addCriterion("SHIFOULIUSHI >=", value, "shifouliushi");
            return (Criteria) this;
        }

        public Criteria andShifouliushiLessThan(String value) {
            addCriterion("SHIFOULIUSHI <", value, "shifouliushi");
            return (Criteria) this;
        }

        public Criteria andShifouliushiLessThanOrEqualTo(String value) {
            addCriterion("SHIFOULIUSHI <=", value, "shifouliushi");
            return (Criteria) this;
        }

        public Criteria andShifouliushiLike(String value) {
            addCriterion("SHIFOULIUSHI like", value, "shifouliushi");
            return (Criteria) this;
        }

        public Criteria andShifouliushiNotLike(String value) {
            addCriterion("SHIFOULIUSHI not like", value, "shifouliushi");
            return (Criteria) this;
        }

        public Criteria andShifouliushiIn(List<String> values) {
            addCriterion("SHIFOULIUSHI in", values, "shifouliushi");
            return (Criteria) this;
        }

        public Criteria andShifouliushiNotIn(List<String> values) {
            addCriterion("SHIFOULIUSHI not in", values, "shifouliushi");
            return (Criteria) this;
        }

        public Criteria andShifouliushiBetween(String value1, String value2) {
            addCriterion("SHIFOULIUSHI between", value1, value2, "shifouliushi");
            return (Criteria) this;
        }

        public Criteria andShifouliushiNotBetween(String value1, String value2) {
            addCriterion("SHIFOULIUSHI not between", value1, value2, "shifouliushi");
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