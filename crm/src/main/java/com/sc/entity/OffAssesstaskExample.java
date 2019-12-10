package com.sc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OffAssesstaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OffAssesstaskExample() {
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

        public Criteria andTasktitleIsNull() {
            addCriterion("TASKTITLE is null");
            return (Criteria) this;
        }

        public Criteria andTasktitleIsNotNull() {
            addCriterion("TASKTITLE is not null");
            return (Criteria) this;
        }

        public Criteria andTasktitleEqualTo(String value) {
            addCriterion("TASKTITLE =", value, "tasktitle");
            return (Criteria) this;
        }

        public Criteria andTasktitleNotEqualTo(String value) {
            addCriterion("TASKTITLE <>", value, "tasktitle");
            return (Criteria) this;
        }

        public Criteria andTasktitleGreaterThan(String value) {
            addCriterion("TASKTITLE >", value, "tasktitle");
            return (Criteria) this;
        }

        public Criteria andTasktitleGreaterThanOrEqualTo(String value) {
            addCriterion("TASKTITLE >=", value, "tasktitle");
            return (Criteria) this;
        }

        public Criteria andTasktitleLessThan(String value) {
            addCriterion("TASKTITLE <", value, "tasktitle");
            return (Criteria) this;
        }

        public Criteria andTasktitleLessThanOrEqualTo(String value) {
            addCriterion("TASKTITLE <=", value, "tasktitle");
            return (Criteria) this;
        }

        public Criteria andTasktitleLike(String value) {
            addCriterion("TASKTITLE like", value, "tasktitle");
            return (Criteria) this;
        }

        public Criteria andTasktitleNotLike(String value) {
            addCriterion("TASKTITLE not like", value, "tasktitle");
            return (Criteria) this;
        }

        public Criteria andTasktitleIn(List<String> values) {
            addCriterion("TASKTITLE in", values, "tasktitle");
            return (Criteria) this;
        }

        public Criteria andTasktitleNotIn(List<String> values) {
            addCriterion("TASKTITLE not in", values, "tasktitle");
            return (Criteria) this;
        }

        public Criteria andTasktitleBetween(String value1, String value2) {
            addCriterion("TASKTITLE between", value1, value2, "tasktitle");
            return (Criteria) this;
        }

        public Criteria andTasktitleNotBetween(String value1, String value2) {
            addCriterion("TASKTITLE not between", value1, value2, "tasktitle");
            return (Criteria) this;
        }

        public Criteria andTaskdetailIsNull() {
            addCriterion("TASKDETAIL is null");
            return (Criteria) this;
        }

        public Criteria andTaskdetailIsNotNull() {
            addCriterion("TASKDETAIL is not null");
            return (Criteria) this;
        }

        public Criteria andTaskdetailEqualTo(String value) {
            addCriterion("TASKDETAIL =", value, "taskdetail");
            return (Criteria) this;
        }

        public Criteria andTaskdetailNotEqualTo(String value) {
            addCriterion("TASKDETAIL <>", value, "taskdetail");
            return (Criteria) this;
        }

        public Criteria andTaskdetailGreaterThan(String value) {
            addCriterion("TASKDETAIL >", value, "taskdetail");
            return (Criteria) this;
        }

        public Criteria andTaskdetailGreaterThanOrEqualTo(String value) {
            addCriterion("TASKDETAIL >=", value, "taskdetail");
            return (Criteria) this;
        }

        public Criteria andTaskdetailLessThan(String value) {
            addCriterion("TASKDETAIL <", value, "taskdetail");
            return (Criteria) this;
        }

        public Criteria andTaskdetailLessThanOrEqualTo(String value) {
            addCriterion("TASKDETAIL <=", value, "taskdetail");
            return (Criteria) this;
        }

        public Criteria andTaskdetailLike(String value) {
            addCriterion("TASKDETAIL like", value, "taskdetail");
            return (Criteria) this;
        }

        public Criteria andTaskdetailNotLike(String value) {
            addCriterion("TASKDETAIL not like", value, "taskdetail");
            return (Criteria) this;
        }

        public Criteria andTaskdetailIn(List<String> values) {
            addCriterion("TASKDETAIL in", values, "taskdetail");
            return (Criteria) this;
        }

        public Criteria andTaskdetailNotIn(List<String> values) {
            addCriterion("TASKDETAIL not in", values, "taskdetail");
            return (Criteria) this;
        }

        public Criteria andTaskdetailBetween(String value1, String value2) {
            addCriterion("TASKDETAIL between", value1, value2, "taskdetail");
            return (Criteria) this;
        }

        public Criteria andTaskdetailNotBetween(String value1, String value2) {
            addCriterion("TASKDETAIL not between", value1, value2, "taskdetail");
            return (Criteria) this;
        }

        public Criteria andTaskpublisherIsNull() {
            addCriterion("TASKPUBLISHER is null");
            return (Criteria) this;
        }

        public Criteria andTaskpublisherIsNotNull() {
            addCriterion("TASKPUBLISHER is not null");
            return (Criteria) this;
        }

        public Criteria andTaskpublisherEqualTo(String value) {
            addCriterion("TASKPUBLISHER =", value, "taskpublisher");
            return (Criteria) this;
        }

        public Criteria andTaskpublisherNotEqualTo(String value) {
            addCriterion("TASKPUBLISHER <>", value, "taskpublisher");
            return (Criteria) this;
        }

        public Criteria andTaskpublisherGreaterThan(String value) {
            addCriterion("TASKPUBLISHER >", value, "taskpublisher");
            return (Criteria) this;
        }

        public Criteria andTaskpublisherGreaterThanOrEqualTo(String value) {
            addCriterion("TASKPUBLISHER >=", value, "taskpublisher");
            return (Criteria) this;
        }

        public Criteria andTaskpublisherLessThan(String value) {
            addCriterion("TASKPUBLISHER <", value, "taskpublisher");
            return (Criteria) this;
        }

        public Criteria andTaskpublisherLessThanOrEqualTo(String value) {
            addCriterion("TASKPUBLISHER <=", value, "taskpublisher");
            return (Criteria) this;
        }

        public Criteria andTaskpublisherLike(String value) {
            addCriterion("TASKPUBLISHER like", value, "taskpublisher");
            return (Criteria) this;
        }

        public Criteria andTaskpublisherNotLike(String value) {
            addCriterion("TASKPUBLISHER not like", value, "taskpublisher");
            return (Criteria) this;
        }

        public Criteria andTaskpublisherIn(List<String> values) {
            addCriterion("TASKPUBLISHER in", values, "taskpublisher");
            return (Criteria) this;
        }

        public Criteria andTaskpublisherNotIn(List<String> values) {
            addCriterion("TASKPUBLISHER not in", values, "taskpublisher");
            return (Criteria) this;
        }

        public Criteria andTaskpublisherBetween(String value1, String value2) {
            addCriterion("TASKPUBLISHER between", value1, value2, "taskpublisher");
            return (Criteria) this;
        }

        public Criteria andTaskpublisherNotBetween(String value1, String value2) {
            addCriterion("TASKPUBLISHER not between", value1, value2, "taskpublisher");
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

        public Criteria andTaskstarttimeIsNull() {
            addCriterion("TASKSTARTTIME is null");
            return (Criteria) this;
        }

        public Criteria andTaskstarttimeIsNotNull() {
            addCriterion("TASKSTARTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andTaskstarttimeEqualTo(Date value) {
            addCriterion("TASKSTARTTIME =", value, "taskstarttime");
            return (Criteria) this;
        }

        public Criteria andTaskstarttimeNotEqualTo(Date value) {
            addCriterion("TASKSTARTTIME <>", value, "taskstarttime");
            return (Criteria) this;
        }

        public Criteria andTaskstarttimeGreaterThan(Date value) {
            addCriterion("TASKSTARTTIME >", value, "taskstarttime");
            return (Criteria) this;
        }

        public Criteria andTaskstarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("TASKSTARTTIME >=", value, "taskstarttime");
            return (Criteria) this;
        }

        public Criteria andTaskstarttimeLessThan(Date value) {
            addCriterion("TASKSTARTTIME <", value, "taskstarttime");
            return (Criteria) this;
        }

        public Criteria andTaskstarttimeLessThanOrEqualTo(Date value) {
            addCriterion("TASKSTARTTIME <=", value, "taskstarttime");
            return (Criteria) this;
        }

        public Criteria andTaskstarttimeIn(List<Date> values) {
            addCriterion("TASKSTARTTIME in", values, "taskstarttime");
            return (Criteria) this;
        }

        public Criteria andTaskstarttimeNotIn(List<Date> values) {
            addCriterion("TASKSTARTTIME not in", values, "taskstarttime");
            return (Criteria) this;
        }

        public Criteria andTaskstarttimeBetween(Date value1, Date value2) {
            addCriterion("TASKSTARTTIME between", value1, value2, "taskstarttime");
            return (Criteria) this;
        }

        public Criteria andTaskstarttimeNotBetween(Date value1, Date value2) {
            addCriterion("TASKSTARTTIME not between", value1, value2, "taskstarttime");
            return (Criteria) this;
        }

        public Criteria andTaskendtimeIsNull() {
            addCriterion("TASKENDTIME is null");
            return (Criteria) this;
        }

        public Criteria andTaskendtimeIsNotNull() {
            addCriterion("TASKENDTIME is not null");
            return (Criteria) this;
        }

        public Criteria andTaskendtimeEqualTo(Date value) {
            addCriterion("TASKENDTIME =", value, "taskendtime");
            return (Criteria) this;
        }

        public Criteria andTaskendtimeNotEqualTo(Date value) {
            addCriterion("TASKENDTIME <>", value, "taskendtime");
            return (Criteria) this;
        }

        public Criteria andTaskendtimeGreaterThan(Date value) {
            addCriterion("TASKENDTIME >", value, "taskendtime");
            return (Criteria) this;
        }

        public Criteria andTaskendtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("TASKENDTIME >=", value, "taskendtime");
            return (Criteria) this;
        }

        public Criteria andTaskendtimeLessThan(Date value) {
            addCriterion("TASKENDTIME <", value, "taskendtime");
            return (Criteria) this;
        }

        public Criteria andTaskendtimeLessThanOrEqualTo(Date value) {
            addCriterion("TASKENDTIME <=", value, "taskendtime");
            return (Criteria) this;
        }

        public Criteria andTaskendtimeIn(List<Date> values) {
            addCriterion("TASKENDTIME in", values, "taskendtime");
            return (Criteria) this;
        }

        public Criteria andTaskendtimeNotIn(List<Date> values) {
            addCriterion("TASKENDTIME not in", values, "taskendtime");
            return (Criteria) this;
        }

        public Criteria andTaskendtimeBetween(Date value1, Date value2) {
            addCriterion("TASKENDTIME between", value1, value2, "taskendtime");
            return (Criteria) this;
        }

        public Criteria andTaskendtimeNotBetween(Date value1, Date value2) {
            addCriterion("TASKENDTIME not between", value1, value2, "taskendtime");
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