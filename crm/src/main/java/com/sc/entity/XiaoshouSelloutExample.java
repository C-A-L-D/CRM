package com.sc.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XiaoshouSelloutExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XiaoshouSelloutExample() {
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

        public Criteria andMaketimeIsNull() {
            addCriterion("MAKETIME is null");
            return (Criteria) this;
        }

        public Criteria andMaketimeIsNotNull() {
            addCriterion("MAKETIME is not null");
            return (Criteria) this;
        }

        public Criteria andMaketimeEqualTo(Date value) {
            addCriterion("MAKETIME =", value, "maketime");
            return (Criteria) this;
        }

        public Criteria andMaketimeNotEqualTo(Date value) {
            addCriterion("MAKETIME <>", value, "maketime");
            return (Criteria) this;
        }

        public Criteria andMaketimeGreaterThan(Date value) {
            addCriterion("MAKETIME >", value, "maketime");
            return (Criteria) this;
        }

        public Criteria andMaketimeGreaterThanOrEqualTo(Date value) {
            addCriterion("MAKETIME >=", value, "maketime");
            return (Criteria) this;
        }

        public Criteria andMaketimeLessThan(Date value) {
            addCriterion("MAKETIME <", value, "maketime");
            return (Criteria) this;
        }

        public Criteria andMaketimeLessThanOrEqualTo(Date value) {
            addCriterion("MAKETIME <=", value, "maketime");
            return (Criteria) this;
        }

        public Criteria andMaketimeIn(List<Date> values) {
            addCriterion("MAKETIME in", values, "maketime");
            return (Criteria) this;
        }

        public Criteria andMaketimeNotIn(List<Date> values) {
            addCriterion("MAKETIME not in", values, "maketime");
            return (Criteria) this;
        }

        public Criteria andMaketimeBetween(Date value1, Date value2) {
            addCriterion("MAKETIME between", value1, value2, "maketime");
            return (Criteria) this;
        }

        public Criteria andMaketimeNotBetween(Date value1, Date value2) {
            addCriterion("MAKETIME not between", value1, value2, "maketime");
            return (Criteria) this;
        }

        public Criteria andTidIsNull() {
            addCriterion("TID is null");
            return (Criteria) this;
        }

        public Criteria andTidIsNotNull() {
            addCriterion("TID is not null");
            return (Criteria) this;
        }

        public Criteria andTidEqualTo(String value) {
            addCriterion("TID =", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotEqualTo(String value) {
            addCriterion("TID <>", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThan(String value) {
            addCriterion("TID >", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThanOrEqualTo(String value) {
            addCriterion("TID >=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThan(String value) {
            addCriterion("TID <", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThanOrEqualTo(String value) {
            addCriterion("TID <=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLike(String value) {
            addCriterion("TID like", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotLike(String value) {
            addCriterion("TID not like", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidIn(List<String> values) {
            addCriterion("TID in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotIn(List<String> values) {
            addCriterion("TID not in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidBetween(String value1, String value2) {
            addCriterion("TID between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotBetween(String value1, String value2) {
            addCriterion("TID not between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andGuidIsNull() {
            addCriterion("GUID is null");
            return (Criteria) this;
        }

        public Criteria andGuidIsNotNull() {
            addCriterion("GUID is not null");
            return (Criteria) this;
        }

        public Criteria andGuidEqualTo(BigDecimal value) {
            addCriterion("GUID =", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidNotEqualTo(BigDecimal value) {
            addCriterion("GUID <>", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidGreaterThan(BigDecimal value) {
            addCriterion("GUID >", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GUID >=", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidLessThan(BigDecimal value) {
            addCriterion("GUID <", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GUID <=", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidIn(List<BigDecimal> values) {
            addCriterion("GUID in", values, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidNotIn(List<BigDecimal> values) {
            addCriterion("GUID not in", values, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GUID between", value1, value2, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GUID not between", value1, value2, "guid");
            return (Criteria) this;
        }

        public Criteria andSpriceIsNull() {
            addCriterion("SPRICE is null");
            return (Criteria) this;
        }

        public Criteria andSpriceIsNotNull() {
            addCriterion("SPRICE is not null");
            return (Criteria) this;
        }

        public Criteria andSpriceEqualTo(BigDecimal value) {
            addCriterion("SPRICE =", value, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceNotEqualTo(BigDecimal value) {
            addCriterion("SPRICE <>", value, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceGreaterThan(BigDecimal value) {
            addCriterion("SPRICE >", value, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SPRICE >=", value, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceLessThan(BigDecimal value) {
            addCriterion("SPRICE <", value, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SPRICE <=", value, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceIn(List<BigDecimal> values) {
            addCriterion("SPRICE in", values, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceNotIn(List<BigDecimal> values) {
            addCriterion("SPRICE not in", values, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SPRICE between", value1, value2, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SPRICE not between", value1, value2, "sprice");
            return (Criteria) this;
        }

        public Criteria andSstatusIsNull() {
            addCriterion("SSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andSstatusIsNotNull() {
            addCriterion("SSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andSstatusEqualTo(String value) {
            addCriterion("SSTATUS =", value, "sstatus");
            return (Criteria) this;
        }

        public Criteria andSstatusNotEqualTo(String value) {
            addCriterion("SSTATUS <>", value, "sstatus");
            return (Criteria) this;
        }

        public Criteria andSstatusGreaterThan(String value) {
            addCriterion("SSTATUS >", value, "sstatus");
            return (Criteria) this;
        }

        public Criteria andSstatusGreaterThanOrEqualTo(String value) {
            addCriterion("SSTATUS >=", value, "sstatus");
            return (Criteria) this;
        }

        public Criteria andSstatusLessThan(String value) {
            addCriterion("SSTATUS <", value, "sstatus");
            return (Criteria) this;
        }

        public Criteria andSstatusLessThanOrEqualTo(String value) {
            addCriterion("SSTATUS <=", value, "sstatus");
            return (Criteria) this;
        }

        public Criteria andSstatusLike(String value) {
            addCriterion("SSTATUS like", value, "sstatus");
            return (Criteria) this;
        }

        public Criteria andSstatusNotLike(String value) {
            addCriterion("SSTATUS not like", value, "sstatus");
            return (Criteria) this;
        }

        public Criteria andSstatusIn(List<String> values) {
            addCriterion("SSTATUS in", values, "sstatus");
            return (Criteria) this;
        }

        public Criteria andSstatusNotIn(List<String> values) {
            addCriterion("SSTATUS not in", values, "sstatus");
            return (Criteria) this;
        }

        public Criteria andSstatusBetween(String value1, String value2) {
            addCriterion("SSTATUS between", value1, value2, "sstatus");
            return (Criteria) this;
        }

        public Criteria andSstatusNotBetween(String value1, String value2) {
            addCriterion("SSTATUS not between", value1, value2, "sstatus");
            return (Criteria) this;
        }

        public Criteria andIsantiIsNull() {
            addCriterion("ISANTI is null");
            return (Criteria) this;
        }

        public Criteria andIsantiIsNotNull() {
            addCriterion("ISANTI is not null");
            return (Criteria) this;
        }

        public Criteria andIsantiEqualTo(String value) {
            addCriterion("ISANTI =", value, "isanti");
            return (Criteria) this;
        }

        public Criteria andIsantiNotEqualTo(String value) {
            addCriterion("ISANTI <>", value, "isanti");
            return (Criteria) this;
        }

        public Criteria andIsantiGreaterThan(String value) {
            addCriterion("ISANTI >", value, "isanti");
            return (Criteria) this;
        }

        public Criteria andIsantiGreaterThanOrEqualTo(String value) {
            addCriterion("ISANTI >=", value, "isanti");
            return (Criteria) this;
        }

        public Criteria andIsantiLessThan(String value) {
            addCriterion("ISANTI <", value, "isanti");
            return (Criteria) this;
        }

        public Criteria andIsantiLessThanOrEqualTo(String value) {
            addCriterion("ISANTI <=", value, "isanti");
            return (Criteria) this;
        }

        public Criteria andIsantiLike(String value) {
            addCriterion("ISANTI like", value, "isanti");
            return (Criteria) this;
        }

        public Criteria andIsantiNotLike(String value) {
            addCriterion("ISANTI not like", value, "isanti");
            return (Criteria) this;
        }

        public Criteria andIsantiIn(List<String> values) {
            addCriterion("ISANTI in", values, "isanti");
            return (Criteria) this;
        }

        public Criteria andIsantiNotIn(List<String> values) {
            addCriterion("ISANTI not in", values, "isanti");
            return (Criteria) this;
        }

        public Criteria andIsantiBetween(String value1, String value2) {
            addCriterion("ISANTI between", value1, value2, "isanti");
            return (Criteria) this;
        }

        public Criteria andIsantiNotBetween(String value1, String value2) {
            addCriterion("ISANTI not between", value1, value2, "isanti");
            return (Criteria) this;
        }

        public Criteria andLstatusIsNull() {
            addCriterion("LSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andLstatusIsNotNull() {
            addCriterion("LSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andLstatusEqualTo(String value) {
            addCriterion("LSTATUS =", value, "lstatus");
            return (Criteria) this;
        }

        public Criteria andLstatusNotEqualTo(String value) {
            addCriterion("LSTATUS <>", value, "lstatus");
            return (Criteria) this;
        }

        public Criteria andLstatusGreaterThan(String value) {
            addCriterion("LSTATUS >", value, "lstatus");
            return (Criteria) this;
        }

        public Criteria andLstatusGreaterThanOrEqualTo(String value) {
            addCriterion("LSTATUS >=", value, "lstatus");
            return (Criteria) this;
        }

        public Criteria andLstatusLessThan(String value) {
            addCriterion("LSTATUS <", value, "lstatus");
            return (Criteria) this;
        }

        public Criteria andLstatusLessThanOrEqualTo(String value) {
            addCriterion("LSTATUS <=", value, "lstatus");
            return (Criteria) this;
        }

        public Criteria andLstatusLike(String value) {
            addCriterion("LSTATUS like", value, "lstatus");
            return (Criteria) this;
        }

        public Criteria andLstatusNotLike(String value) {
            addCriterion("LSTATUS not like", value, "lstatus");
            return (Criteria) this;
        }

        public Criteria andLstatusIn(List<String> values) {
            addCriterion("LSTATUS in", values, "lstatus");
            return (Criteria) this;
        }

        public Criteria andLstatusNotIn(List<String> values) {
            addCriterion("LSTATUS not in", values, "lstatus");
            return (Criteria) this;
        }

        public Criteria andLstatusBetween(String value1, String value2) {
            addCriterion("LSTATUS between", value1, value2, "lstatus");
            return (Criteria) this;
        }

        public Criteria andLstatusNotBetween(String value1, String value2) {
            addCriterion("LSTATUS not between", value1, value2, "lstatus");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCidIsNull() {
            addCriterion("CID is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("CID is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(BigDecimal value) {
            addCriterion("CID =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(BigDecimal value) {
            addCriterion("CID <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(BigDecimal value) {
            addCriterion("CID >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CID >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(BigDecimal value) {
            addCriterion("CID <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CID <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<BigDecimal> values) {
            addCriterion("CID in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<BigDecimal> values) {
            addCriterion("CID not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CID between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CID not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andLastdateIsNull() {
            addCriterion("LASTDATE is null");
            return (Criteria) this;
        }

        public Criteria andLastdateIsNotNull() {
            addCriterion("LASTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andLastdateEqualTo(Date value) {
            addCriterion("LASTDATE =", value, "lastdate");
            return (Criteria) this;
        }

        public Criteria andLastdateNotEqualTo(Date value) {
            addCriterion("LASTDATE <>", value, "lastdate");
            return (Criteria) this;
        }

        public Criteria andLastdateGreaterThan(Date value) {
            addCriterion("LASTDATE >", value, "lastdate");
            return (Criteria) this;
        }

        public Criteria andLastdateGreaterThanOrEqualTo(Date value) {
            addCriterion("LASTDATE >=", value, "lastdate");
            return (Criteria) this;
        }

        public Criteria andLastdateLessThan(Date value) {
            addCriterion("LASTDATE <", value, "lastdate");
            return (Criteria) this;
        }

        public Criteria andLastdateLessThanOrEqualTo(Date value) {
            addCriterion("LASTDATE <=", value, "lastdate");
            return (Criteria) this;
        }

        public Criteria andLastdateIn(List<Date> values) {
            addCriterion("LASTDATE in", values, "lastdate");
            return (Criteria) this;
        }

        public Criteria andLastdateNotIn(List<Date> values) {
            addCriterion("LASTDATE not in", values, "lastdate");
            return (Criteria) this;
        }

        public Criteria andLastdateBetween(Date value1, Date value2) {
            addCriterion("LASTDATE between", value1, value2, "lastdate");
            return (Criteria) this;
        }

        public Criteria andLastdateNotBetween(Date value1, Date value2) {
            addCriterion("LASTDATE not between", value1, value2, "lastdate");
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