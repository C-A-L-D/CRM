package com.sc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OffPerplanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OffPerplanExample() {
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

        public Criteria andPlanidIsNull() {
            addCriterion("PLANID is null");
            return (Criteria) this;
        }

        public Criteria andPlanidIsNotNull() {
            addCriterion("PLANID is not null");
            return (Criteria) this;
        }

        public Criteria andPlanidEqualTo(Long value) {
            addCriterion("PLANID =", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidNotEqualTo(Long value) {
            addCriterion("PLANID <>", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidGreaterThan(Long value) {
            addCriterion("PLANID >", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidGreaterThanOrEqualTo(Long value) {
            addCriterion("PLANID >=", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidLessThan(Long value) {
            addCriterion("PLANID <", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidLessThanOrEqualTo(Long value) {
            addCriterion("PLANID <=", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidIn(List<Long> values) {
            addCriterion("PLANID in", values, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidNotIn(List<Long> values) {
            addCriterion("PLANID not in", values, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidBetween(Long value1, Long value2) {
            addCriterion("PLANID between", value1, value2, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidNotBetween(Long value1, Long value2) {
            addCriterion("PLANID not between", value1, value2, "planid");
            return (Criteria) this;
        }

        public Criteria andPlankindIsNull() {
            addCriterion("PLANKIND is null");
            return (Criteria) this;
        }

        public Criteria andPlankindIsNotNull() {
            addCriterion("PLANKIND is not null");
            return (Criteria) this;
        }

        public Criteria andPlankindEqualTo(String value) {
            addCriterion("PLANKIND =", value, "plankind");
            return (Criteria) this;
        }

        public Criteria andPlankindNotEqualTo(String value) {
            addCriterion("PLANKIND <>", value, "plankind");
            return (Criteria) this;
        }

        public Criteria andPlankindGreaterThan(String value) {
            addCriterion("PLANKIND >", value, "plankind");
            return (Criteria) this;
        }

        public Criteria andPlankindGreaterThanOrEqualTo(String value) {
            addCriterion("PLANKIND >=", value, "plankind");
            return (Criteria) this;
        }

        public Criteria andPlankindLessThan(String value) {
            addCriterion("PLANKIND <", value, "plankind");
            return (Criteria) this;
        }

        public Criteria andPlankindLessThanOrEqualTo(String value) {
            addCriterion("PLANKIND <=", value, "plankind");
            return (Criteria) this;
        }

        public Criteria andPlankindLike(String value) {
            addCriterion("PLANKIND like", value, "plankind");
            return (Criteria) this;
        }

        public Criteria andPlankindNotLike(String value) {
            addCriterion("PLANKIND not like", value, "plankind");
            return (Criteria) this;
        }

        public Criteria andPlankindIn(List<String> values) {
            addCriterion("PLANKIND in", values, "plankind");
            return (Criteria) this;
        }

        public Criteria andPlankindNotIn(List<String> values) {
            addCriterion("PLANKIND not in", values, "plankind");
            return (Criteria) this;
        }

        public Criteria andPlankindBetween(String value1, String value2) {
            addCriterion("PLANKIND between", value1, value2, "plankind");
            return (Criteria) this;
        }

        public Criteria andPlankindNotBetween(String value1, String value2) {
            addCriterion("PLANKIND not between", value1, value2, "plankind");
            return (Criteria) this;
        }

        public Criteria andPlanthemeIsNull() {
            addCriterion("PLANTHEME is null");
            return (Criteria) this;
        }

        public Criteria andPlanthemeIsNotNull() {
            addCriterion("PLANTHEME is not null");
            return (Criteria) this;
        }

        public Criteria andPlanthemeEqualTo(String value) {
            addCriterion("PLANTHEME =", value, "plantheme");
            return (Criteria) this;
        }

        public Criteria andPlanthemeNotEqualTo(String value) {
            addCriterion("PLANTHEME <>", value, "plantheme");
            return (Criteria) this;
        }

        public Criteria andPlanthemeGreaterThan(String value) {
            addCriterion("PLANTHEME >", value, "plantheme");
            return (Criteria) this;
        }

        public Criteria andPlanthemeGreaterThanOrEqualTo(String value) {
            addCriterion("PLANTHEME >=", value, "plantheme");
            return (Criteria) this;
        }

        public Criteria andPlanthemeLessThan(String value) {
            addCriterion("PLANTHEME <", value, "plantheme");
            return (Criteria) this;
        }

        public Criteria andPlanthemeLessThanOrEqualTo(String value) {
            addCriterion("PLANTHEME <=", value, "plantheme");
            return (Criteria) this;
        }

        public Criteria andPlanthemeLike(String value) {
            addCriterion("PLANTHEME like", value, "plantheme");
            return (Criteria) this;
        }

        public Criteria andPlanthemeNotLike(String value) {
            addCriterion("PLANTHEME not like", value, "plantheme");
            return (Criteria) this;
        }

        public Criteria andPlanthemeIn(List<String> values) {
            addCriterion("PLANTHEME in", values, "plantheme");
            return (Criteria) this;
        }

        public Criteria andPlanthemeNotIn(List<String> values) {
            addCriterion("PLANTHEME not in", values, "plantheme");
            return (Criteria) this;
        }

        public Criteria andPlanthemeBetween(String value1, String value2) {
            addCriterion("PLANTHEME between", value1, value2, "plantheme");
            return (Criteria) this;
        }

        public Criteria andPlanthemeNotBetween(String value1, String value2) {
            addCriterion("PLANTHEME not between", value1, value2, "plantheme");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("STARTTIME is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("STARTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterion("STARTTIME =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterion("STARTTIME <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterion("STARTTIME >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("STARTTIME >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterion("STARTTIME <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("STARTTIME <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterion("STARTTIME in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterion("STARTTIME not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterion("STARTTIME between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("STARTTIME not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andWriteperidIsNull() {
            addCriterion("WRITEPERID is null");
            return (Criteria) this;
        }

        public Criteria andWriteperidIsNotNull() {
            addCriterion("WRITEPERID is not null");
            return (Criteria) this;
        }

        public Criteria andWriteperidEqualTo(Long value) {
            addCriterion("WRITEPERID =", value, "writeperid");
            return (Criteria) this;
        }

        public Criteria andWriteperidNotEqualTo(Long value) {
            addCriterion("WRITEPERID <>", value, "writeperid");
            return (Criteria) this;
        }

        public Criteria andWriteperidGreaterThan(Long value) {
            addCriterion("WRITEPERID >", value, "writeperid");
            return (Criteria) this;
        }

        public Criteria andWriteperidGreaterThanOrEqualTo(Long value) {
            addCriterion("WRITEPERID >=", value, "writeperid");
            return (Criteria) this;
        }

        public Criteria andWriteperidLessThan(Long value) {
            addCriterion("WRITEPERID <", value, "writeperid");
            return (Criteria) this;
        }

        public Criteria andWriteperidLessThanOrEqualTo(Long value) {
            addCriterion("WRITEPERID <=", value, "writeperid");
            return (Criteria) this;
        }

        public Criteria andWriteperidIn(List<Long> values) {
            addCriterion("WRITEPERID in", values, "writeperid");
            return (Criteria) this;
        }

        public Criteria andWriteperidNotIn(List<Long> values) {
            addCriterion("WRITEPERID not in", values, "writeperid");
            return (Criteria) this;
        }

        public Criteria andWriteperidBetween(Long value1, Long value2) {
            addCriterion("WRITEPERID between", value1, value2, "writeperid");
            return (Criteria) this;
        }

        public Criteria andWriteperidNotBetween(Long value1, Long value2) {
            addCriterion("WRITEPERID not between", value1, value2, "writeperid");
            return (Criteria) this;
        }

        public Criteria andPlandescIsNull() {
            addCriterion("PLANDESC is null");
            return (Criteria) this;
        }

        public Criteria andPlandescIsNotNull() {
            addCriterion("PLANDESC is not null");
            return (Criteria) this;
        }

        public Criteria andPlandescEqualTo(String value) {
            addCriterion("PLANDESC =", value, "plandesc");
            return (Criteria) this;
        }

        public Criteria andPlandescNotEqualTo(String value) {
            addCriterion("PLANDESC <>", value, "plandesc");
            return (Criteria) this;
        }

        public Criteria andPlandescGreaterThan(String value) {
            addCriterion("PLANDESC >", value, "plandesc");
            return (Criteria) this;
        }

        public Criteria andPlandescGreaterThanOrEqualTo(String value) {
            addCriterion("PLANDESC >=", value, "plandesc");
            return (Criteria) this;
        }

        public Criteria andPlandescLessThan(String value) {
            addCriterion("PLANDESC <", value, "plandesc");
            return (Criteria) this;
        }

        public Criteria andPlandescLessThanOrEqualTo(String value) {
            addCriterion("PLANDESC <=", value, "plandesc");
            return (Criteria) this;
        }

        public Criteria andPlandescLike(String value) {
            addCriterion("PLANDESC like", value, "plandesc");
            return (Criteria) this;
        }

        public Criteria andPlandescNotLike(String value) {
            addCriterion("PLANDESC not like", value, "plandesc");
            return (Criteria) this;
        }

        public Criteria andPlandescIn(List<String> values) {
            addCriterion("PLANDESC in", values, "plandesc");
            return (Criteria) this;
        }

        public Criteria andPlandescNotIn(List<String> values) {
            addCriterion("PLANDESC not in", values, "plandesc");
            return (Criteria) this;
        }

        public Criteria andPlandescBetween(String value1, String value2) {
            addCriterion("PLANDESC between", value1, value2, "plandesc");
            return (Criteria) this;
        }

        public Criteria andPlandescNotBetween(String value1, String value2) {
            addCriterion("PLANDESC not between", value1, value2, "plandesc");
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

        public Criteria andStartdateIsNull() {
            addCriterion("STARTDATE is null");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNotNull() {
            addCriterion("STARTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andStartdateEqualTo(Date value) {
            addCriterion("STARTDATE =", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotEqualTo(Date value) {
            addCriterion("STARTDATE <>", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThan(Date value) {
            addCriterion("STARTDATE >", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThanOrEqualTo(Date value) {
            addCriterion("STARTDATE >=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThan(Date value) {
            addCriterion("STARTDATE <", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThanOrEqualTo(Date value) {
            addCriterion("STARTDATE <=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateIn(List<Date> values) {
            addCriterion("STARTDATE in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotIn(List<Date> values) {
            addCriterion("STARTDATE not in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateBetween(Date value1, Date value2) {
            addCriterion("STARTDATE between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotBetween(Date value1, Date value2) {
            addCriterion("STARTDATE not between", value1, value2, "startdate");
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