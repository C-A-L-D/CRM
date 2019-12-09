package com.sc.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JH_GYSXXExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JH_GYSXXExample() {
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

        public Criteria andGysIdIsNull() {
            addCriterion("GYS_ID is null");
            return (Criteria) this;
        }

        public Criteria andGysIdIsNotNull() {
            addCriterion("GYS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGysIdEqualTo(BigDecimal value) {
            addCriterion("GYS_ID =", value, "gysId");
            return (Criteria) this;
        }

        public Criteria andGysIdNotEqualTo(BigDecimal value) {
            addCriterion("GYS_ID <>", value, "gysId");
            return (Criteria) this;
        }

        public Criteria andGysIdGreaterThan(BigDecimal value) {
            addCriterion("GYS_ID >", value, "gysId");
            return (Criteria) this;
        }

        public Criteria andGysIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GYS_ID >=", value, "gysId");
            return (Criteria) this;
        }

        public Criteria andGysIdLessThan(BigDecimal value) {
            addCriterion("GYS_ID <", value, "gysId");
            return (Criteria) this;
        }

        public Criteria andGysIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GYS_ID <=", value, "gysId");
            return (Criteria) this;
        }

        public Criteria andGysIdIn(List<BigDecimal> values) {
            addCriterion("GYS_ID in", values, "gysId");
            return (Criteria) this;
        }

        public Criteria andGysIdNotIn(List<BigDecimal> values) {
            addCriterion("GYS_ID not in", values, "gysId");
            return (Criteria) this;
        }

        public Criteria andGysIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GYS_ID between", value1, value2, "gysId");
            return (Criteria) this;
        }

        public Criteria andGysIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GYS_ID not between", value1, value2, "gysId");
            return (Criteria) this;
        }

        public Criteria andGysNameIsNull() {
            addCriterion("GYS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andGysNameIsNotNull() {
            addCriterion("GYS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andGysNameEqualTo(String value) {
            addCriterion("GYS_NAME =", value, "gysName");
            return (Criteria) this;
        }

        public Criteria andGysNameNotEqualTo(String value) {
            addCriterion("GYS_NAME <>", value, "gysName");
            return (Criteria) this;
        }

        public Criteria andGysNameGreaterThan(String value) {
            addCriterion("GYS_NAME >", value, "gysName");
            return (Criteria) this;
        }

        public Criteria andGysNameGreaterThanOrEqualTo(String value) {
            addCriterion("GYS_NAME >=", value, "gysName");
            return (Criteria) this;
        }

        public Criteria andGysNameLessThan(String value) {
            addCriterion("GYS_NAME <", value, "gysName");
            return (Criteria) this;
        }

        public Criteria andGysNameLessThanOrEqualTo(String value) {
            addCriterion("GYS_NAME <=", value, "gysName");
            return (Criteria) this;
        }

        public Criteria andGysNameLike(String value) {
            addCriterion("GYS_NAME like", value, "gysName");
            return (Criteria) this;
        }

        public Criteria andGysNameNotLike(String value) {
            addCriterion("GYS_NAME not like", value, "gysName");
            return (Criteria) this;
        }

        public Criteria andGysNameIn(List<String> values) {
            addCriterion("GYS_NAME in", values, "gysName");
            return (Criteria) this;
        }

        public Criteria andGysNameNotIn(List<String> values) {
            addCriterion("GYS_NAME not in", values, "gysName");
            return (Criteria) this;
        }

        public Criteria andGysNameBetween(String value1, String value2) {
            addCriterion("GYS_NAME between", value1, value2, "gysName");
            return (Criteria) this;
        }

        public Criteria andGysNameNotBetween(String value1, String value2) {
            addCriterion("GYS_NAME not between", value1, value2, "gysName");
            return (Criteria) this;
        }

        public Criteria andGysJcIsNull() {
            addCriterion("GYS_JC is null");
            return (Criteria) this;
        }

        public Criteria andGysJcIsNotNull() {
            addCriterion("GYS_JC is not null");
            return (Criteria) this;
        }

        public Criteria andGysJcEqualTo(String value) {
            addCriterion("GYS_JC =", value, "gysJc");
            return (Criteria) this;
        }

        public Criteria andGysJcNotEqualTo(String value) {
            addCriterion("GYS_JC <>", value, "gysJc");
            return (Criteria) this;
        }

        public Criteria andGysJcGreaterThan(String value) {
            addCriterion("GYS_JC >", value, "gysJc");
            return (Criteria) this;
        }

        public Criteria andGysJcGreaterThanOrEqualTo(String value) {
            addCriterion("GYS_JC >=", value, "gysJc");
            return (Criteria) this;
        }

        public Criteria andGysJcLessThan(String value) {
            addCriterion("GYS_JC <", value, "gysJc");
            return (Criteria) this;
        }

        public Criteria andGysJcLessThanOrEqualTo(String value) {
            addCriterion("GYS_JC <=", value, "gysJc");
            return (Criteria) this;
        }

        public Criteria andGysJcLike(String value) {
            addCriterion("GYS_JC like", value, "gysJc");
            return (Criteria) this;
        }

        public Criteria andGysJcNotLike(String value) {
            addCriterion("GYS_JC not like", value, "gysJc");
            return (Criteria) this;
        }

        public Criteria andGysJcIn(List<String> values) {
            addCriterion("GYS_JC in", values, "gysJc");
            return (Criteria) this;
        }

        public Criteria andGysJcNotIn(List<String> values) {
            addCriterion("GYS_JC not in", values, "gysJc");
            return (Criteria) this;
        }

        public Criteria andGysJcBetween(String value1, String value2) {
            addCriterion("GYS_JC between", value1, value2, "gysJc");
            return (Criteria) this;
        }

        public Criteria andGysJcNotBetween(String value1, String value2) {
            addCriterion("GYS_JC not between", value1, value2, "gysJc");
            return (Criteria) this;
        }

        public Criteria andLxrIsNull() {
            addCriterion("LXR is null");
            return (Criteria) this;
        }

        public Criteria andLxrIsNotNull() {
            addCriterion("LXR is not null");
            return (Criteria) this;
        }

        public Criteria andLxrEqualTo(String value) {
            addCriterion("LXR =", value, "lxr");
            return (Criteria) this;
        }

        public Criteria andLxrNotEqualTo(String value) {
            addCriterion("LXR <>", value, "lxr");
            return (Criteria) this;
        }

        public Criteria andLxrGreaterThan(String value) {
            addCriterion("LXR >", value, "lxr");
            return (Criteria) this;
        }

        public Criteria andLxrGreaterThanOrEqualTo(String value) {
            addCriterion("LXR >=", value, "lxr");
            return (Criteria) this;
        }

        public Criteria andLxrLessThan(String value) {
            addCriterion("LXR <", value, "lxr");
            return (Criteria) this;
        }

        public Criteria andLxrLessThanOrEqualTo(String value) {
            addCriterion("LXR <=", value, "lxr");
            return (Criteria) this;
        }

        public Criteria andLxrLike(String value) {
            addCriterion("LXR like", value, "lxr");
            return (Criteria) this;
        }

        public Criteria andLxrNotLike(String value) {
            addCriterion("LXR not like", value, "lxr");
            return (Criteria) this;
        }

        public Criteria andLxrIn(List<String> values) {
            addCriterion("LXR in", values, "lxr");
            return (Criteria) this;
        }

        public Criteria andLxrNotIn(List<String> values) {
            addCriterion("LXR not in", values, "lxr");
            return (Criteria) this;
        }

        public Criteria andLxrBetween(String value1, String value2) {
            addCriterion("LXR between", value1, value2, "lxr");
            return (Criteria) this;
        }

        public Criteria andLxrNotBetween(String value1, String value2) {
            addCriterion("LXR not between", value1, value2, "lxr");
            return (Criteria) this;
        }

        public Criteria andGdPhoneIsNull() {
            addCriterion("GD_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andGdPhoneIsNotNull() {
            addCriterion("GD_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andGdPhoneEqualTo(String value) {
            addCriterion("GD_PHONE =", value, "gdPhone");
            return (Criteria) this;
        }

        public Criteria andGdPhoneNotEqualTo(String value) {
            addCriterion("GD_PHONE <>", value, "gdPhone");
            return (Criteria) this;
        }

        public Criteria andGdPhoneGreaterThan(String value) {
            addCriterion("GD_PHONE >", value, "gdPhone");
            return (Criteria) this;
        }

        public Criteria andGdPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("GD_PHONE >=", value, "gdPhone");
            return (Criteria) this;
        }

        public Criteria andGdPhoneLessThan(String value) {
            addCriterion("GD_PHONE <", value, "gdPhone");
            return (Criteria) this;
        }

        public Criteria andGdPhoneLessThanOrEqualTo(String value) {
            addCriterion("GD_PHONE <=", value, "gdPhone");
            return (Criteria) this;
        }

        public Criteria andGdPhoneLike(String value) {
            addCriterion("GD_PHONE like", value, "gdPhone");
            return (Criteria) this;
        }

        public Criteria andGdPhoneNotLike(String value) {
            addCriterion("GD_PHONE not like", value, "gdPhone");
            return (Criteria) this;
        }

        public Criteria andGdPhoneIn(List<String> values) {
            addCriterion("GD_PHONE in", values, "gdPhone");
            return (Criteria) this;
        }

        public Criteria andGdPhoneNotIn(List<String> values) {
            addCriterion("GD_PHONE not in", values, "gdPhone");
            return (Criteria) this;
        }

        public Criteria andGdPhoneBetween(String value1, String value2) {
            addCriterion("GD_PHONE between", value1, value2, "gdPhone");
            return (Criteria) this;
        }

        public Criteria andGdPhoneNotBetween(String value1, String value2) {
            addCriterion("GD_PHONE not between", value1, value2, "gdPhone");
            return (Criteria) this;
        }

        public Criteria andYdPhoneIsNull() {
            addCriterion("YD_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andYdPhoneIsNotNull() {
            addCriterion("YD_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andYdPhoneEqualTo(String value) {
            addCriterion("YD_PHONE =", value, "ydPhone");
            return (Criteria) this;
        }

        public Criteria andYdPhoneNotEqualTo(String value) {
            addCriterion("YD_PHONE <>", value, "ydPhone");
            return (Criteria) this;
        }

        public Criteria andYdPhoneGreaterThan(String value) {
            addCriterion("YD_PHONE >", value, "ydPhone");
            return (Criteria) this;
        }

        public Criteria andYdPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("YD_PHONE >=", value, "ydPhone");
            return (Criteria) this;
        }

        public Criteria andYdPhoneLessThan(String value) {
            addCriterion("YD_PHONE <", value, "ydPhone");
            return (Criteria) this;
        }

        public Criteria andYdPhoneLessThanOrEqualTo(String value) {
            addCriterion("YD_PHONE <=", value, "ydPhone");
            return (Criteria) this;
        }

        public Criteria andYdPhoneLike(String value) {
            addCriterion("YD_PHONE like", value, "ydPhone");
            return (Criteria) this;
        }

        public Criteria andYdPhoneNotLike(String value) {
            addCriterion("YD_PHONE not like", value, "ydPhone");
            return (Criteria) this;
        }

        public Criteria andYdPhoneIn(List<String> values) {
            addCriterion("YD_PHONE in", values, "ydPhone");
            return (Criteria) this;
        }

        public Criteria andYdPhoneNotIn(List<String> values) {
            addCriterion("YD_PHONE not in", values, "ydPhone");
            return (Criteria) this;
        }

        public Criteria andYdPhoneBetween(String value1, String value2) {
            addCriterion("YD_PHONE between", value1, value2, "ydPhone");
            return (Criteria) this;
        }

        public Criteria andYdPhoneNotBetween(String value1, String value2) {
            addCriterion("YD_PHONE not between", value1, value2, "ydPhone");
            return (Criteria) this;
        }

        public Criteria andLxczIsNull() {
            addCriterion("LXCZ is null");
            return (Criteria) this;
        }

        public Criteria andLxczIsNotNull() {
            addCriterion("LXCZ is not null");
            return (Criteria) this;
        }

        public Criteria andLxczEqualTo(String value) {
            addCriterion("LXCZ =", value, "lxcz");
            return (Criteria) this;
        }

        public Criteria andLxczNotEqualTo(String value) {
            addCriterion("LXCZ <>", value, "lxcz");
            return (Criteria) this;
        }

        public Criteria andLxczGreaterThan(String value) {
            addCriterion("LXCZ >", value, "lxcz");
            return (Criteria) this;
        }

        public Criteria andLxczGreaterThanOrEqualTo(String value) {
            addCriterion("LXCZ >=", value, "lxcz");
            return (Criteria) this;
        }

        public Criteria andLxczLessThan(String value) {
            addCriterion("LXCZ <", value, "lxcz");
            return (Criteria) this;
        }

        public Criteria andLxczLessThanOrEqualTo(String value) {
            addCriterion("LXCZ <=", value, "lxcz");
            return (Criteria) this;
        }

        public Criteria andLxczLike(String value) {
            addCriterion("LXCZ like", value, "lxcz");
            return (Criteria) this;
        }

        public Criteria andLxczNotLike(String value) {
            addCriterion("LXCZ not like", value, "lxcz");
            return (Criteria) this;
        }

        public Criteria andLxczIn(List<String> values) {
            addCriterion("LXCZ in", values, "lxcz");
            return (Criteria) this;
        }

        public Criteria andLxczNotIn(List<String> values) {
            addCriterion("LXCZ not in", values, "lxcz");
            return (Criteria) this;
        }

        public Criteria andLxczBetween(String value1, String value2) {
            addCriterion("LXCZ between", value1, value2, "lxcz");
            return (Criteria) this;
        }

        public Criteria andLxczNotBetween(String value1, String value2) {
            addCriterion("LXCZ not between", value1, value2, "lxcz");
            return (Criteria) this;
        }

        public Criteria andLxdzIsNull() {
            addCriterion("LXDZ is null");
            return (Criteria) this;
        }

        public Criteria andLxdzIsNotNull() {
            addCriterion("LXDZ is not null");
            return (Criteria) this;
        }

        public Criteria andLxdzEqualTo(String value) {
            addCriterion("LXDZ =", value, "lxdz");
            return (Criteria) this;
        }

        public Criteria andLxdzNotEqualTo(String value) {
            addCriterion("LXDZ <>", value, "lxdz");
            return (Criteria) this;
        }

        public Criteria andLxdzGreaterThan(String value) {
            addCriterion("LXDZ >", value, "lxdz");
            return (Criteria) this;
        }

        public Criteria andLxdzGreaterThanOrEqualTo(String value) {
            addCriterion("LXDZ >=", value, "lxdz");
            return (Criteria) this;
        }

        public Criteria andLxdzLessThan(String value) {
            addCriterion("LXDZ <", value, "lxdz");
            return (Criteria) this;
        }

        public Criteria andLxdzLessThanOrEqualTo(String value) {
            addCriterion("LXDZ <=", value, "lxdz");
            return (Criteria) this;
        }

        public Criteria andLxdzLike(String value) {
            addCriterion("LXDZ like", value, "lxdz");
            return (Criteria) this;
        }

        public Criteria andLxdzNotLike(String value) {
            addCriterion("LXDZ not like", value, "lxdz");
            return (Criteria) this;
        }

        public Criteria andLxdzIn(List<String> values) {
            addCriterion("LXDZ in", values, "lxdz");
            return (Criteria) this;
        }

        public Criteria andLxdzNotIn(List<String> values) {
            addCriterion("LXDZ not in", values, "lxdz");
            return (Criteria) this;
        }

        public Criteria andLxdzBetween(String value1, String value2) {
            addCriterion("LXDZ between", value1, value2, "lxdz");
            return (Criteria) this;
        }

        public Criteria andLxdzNotBetween(String value1, String value2) {
            addCriterion("LXDZ not between", value1, value2, "lxdz");
            return (Criteria) this;
        }

        public Criteria andLxybIsNull() {
            addCriterion("LXYB is null");
            return (Criteria) this;
        }

        public Criteria andLxybIsNotNull() {
            addCriterion("LXYB is not null");
            return (Criteria) this;
        }

        public Criteria andLxybEqualTo(String value) {
            addCriterion("LXYB =", value, "lxyb");
            return (Criteria) this;
        }

        public Criteria andLxybNotEqualTo(String value) {
            addCriterion("LXYB <>", value, "lxyb");
            return (Criteria) this;
        }

        public Criteria andLxybGreaterThan(String value) {
            addCriterion("LXYB >", value, "lxyb");
            return (Criteria) this;
        }

        public Criteria andLxybGreaterThanOrEqualTo(String value) {
            addCriterion("LXYB >=", value, "lxyb");
            return (Criteria) this;
        }

        public Criteria andLxybLessThan(String value) {
            addCriterion("LXYB <", value, "lxyb");
            return (Criteria) this;
        }

        public Criteria andLxybLessThanOrEqualTo(String value) {
            addCriterion("LXYB <=", value, "lxyb");
            return (Criteria) this;
        }

        public Criteria andLxybLike(String value) {
            addCriterion("LXYB like", value, "lxyb");
            return (Criteria) this;
        }

        public Criteria andLxybNotLike(String value) {
            addCriterion("LXYB not like", value, "lxyb");
            return (Criteria) this;
        }

        public Criteria andLxybIn(List<String> values) {
            addCriterion("LXYB in", values, "lxyb");
            return (Criteria) this;
        }

        public Criteria andLxybNotIn(List<String> values) {
            addCriterion("LXYB not in", values, "lxyb");
            return (Criteria) this;
        }

        public Criteria andLxybBetween(String value1, String value2) {
            addCriterion("LXYB between", value1, value2, "lxyb");
            return (Criteria) this;
        }

        public Criteria andLxybNotBetween(String value1, String value2) {
            addCriterion("LXYB not between", value1, value2, "lxyb");
            return (Criteria) this;
        }

        public Criteria andMailIsNull() {
            addCriterion("MAIL is null");
            return (Criteria) this;
        }

        public Criteria andMailIsNotNull() {
            addCriterion("MAIL is not null");
            return (Criteria) this;
        }

        public Criteria andMailEqualTo(String value) {
            addCriterion("MAIL =", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotEqualTo(String value) {
            addCriterion("MAIL <>", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailGreaterThan(String value) {
            addCriterion("MAIL >", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailGreaterThanOrEqualTo(String value) {
            addCriterion("MAIL >=", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLessThan(String value) {
            addCriterion("MAIL <", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLessThanOrEqualTo(String value) {
            addCriterion("MAIL <=", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLike(String value) {
            addCriterion("MAIL like", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotLike(String value) {
            addCriterion("MAIL not like", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailIn(List<String> values) {
            addCriterion("MAIL in", values, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotIn(List<String> values) {
            addCriterion("MAIL not in", values, "mail");
            return (Criteria) this;
        }

        public Criteria andMailBetween(String value1, String value2) {
            addCriterion("MAIL between", value1, value2, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotBetween(String value1, String value2) {
            addCriterion("MAIL not between", value1, value2, "mail");
            return (Criteria) this;
        }

        public Criteria andKhbankIsNull() {
            addCriterion("KHBANK is null");
            return (Criteria) this;
        }

        public Criteria andKhbankIsNotNull() {
            addCriterion("KHBANK is not null");
            return (Criteria) this;
        }

        public Criteria andKhbankEqualTo(String value) {
            addCriterion("KHBANK =", value, "khbank");
            return (Criteria) this;
        }

        public Criteria andKhbankNotEqualTo(String value) {
            addCriterion("KHBANK <>", value, "khbank");
            return (Criteria) this;
        }

        public Criteria andKhbankGreaterThan(String value) {
            addCriterion("KHBANK >", value, "khbank");
            return (Criteria) this;
        }

        public Criteria andKhbankGreaterThanOrEqualTo(String value) {
            addCriterion("KHBANK >=", value, "khbank");
            return (Criteria) this;
        }

        public Criteria andKhbankLessThan(String value) {
            addCriterion("KHBANK <", value, "khbank");
            return (Criteria) this;
        }

        public Criteria andKhbankLessThanOrEqualTo(String value) {
            addCriterion("KHBANK <=", value, "khbank");
            return (Criteria) this;
        }

        public Criteria andKhbankLike(String value) {
            addCriterion("KHBANK like", value, "khbank");
            return (Criteria) this;
        }

        public Criteria andKhbankNotLike(String value) {
            addCriterion("KHBANK not like", value, "khbank");
            return (Criteria) this;
        }

        public Criteria andKhbankIn(List<String> values) {
            addCriterion("KHBANK in", values, "khbank");
            return (Criteria) this;
        }

        public Criteria andKhbankNotIn(List<String> values) {
            addCriterion("KHBANK not in", values, "khbank");
            return (Criteria) this;
        }

        public Criteria andKhbankBetween(String value1, String value2) {
            addCriterion("KHBANK between", value1, value2, "khbank");
            return (Criteria) this;
        }

        public Criteria andKhbankNotBetween(String value1, String value2) {
            addCriterion("KHBANK not between", value1, value2, "khbank");
            return (Criteria) this;
        }

        public Criteria andYhzhIsNull() {
            addCriterion("YHZH is null");
            return (Criteria) this;
        }

        public Criteria andYhzhIsNotNull() {
            addCriterion("YHZH is not null");
            return (Criteria) this;
        }

        public Criteria andYhzhEqualTo(String value) {
            addCriterion("YHZH =", value, "yhzh");
            return (Criteria) this;
        }

        public Criteria andYhzhNotEqualTo(String value) {
            addCriterion("YHZH <>", value, "yhzh");
            return (Criteria) this;
        }

        public Criteria andYhzhGreaterThan(String value) {
            addCriterion("YHZH >", value, "yhzh");
            return (Criteria) this;
        }

        public Criteria andYhzhGreaterThanOrEqualTo(String value) {
            addCriterion("YHZH >=", value, "yhzh");
            return (Criteria) this;
        }

        public Criteria andYhzhLessThan(String value) {
            addCriterion("YHZH <", value, "yhzh");
            return (Criteria) this;
        }

        public Criteria andYhzhLessThanOrEqualTo(String value) {
            addCriterion("YHZH <=", value, "yhzh");
            return (Criteria) this;
        }

        public Criteria andYhzhLike(String value) {
            addCriterion("YHZH like", value, "yhzh");
            return (Criteria) this;
        }

        public Criteria andYhzhNotLike(String value) {
            addCriterion("YHZH not like", value, "yhzh");
            return (Criteria) this;
        }

        public Criteria andYhzhIn(List<String> values) {
            addCriterion("YHZH in", values, "yhzh");
            return (Criteria) this;
        }

        public Criteria andYhzhNotIn(List<String> values) {
            addCriterion("YHZH not in", values, "yhzh");
            return (Criteria) this;
        }

        public Criteria andYhzhBetween(String value1, String value2) {
            addCriterion("YHZH between", value1, value2, "yhzh");
            return (Criteria) this;
        }

        public Criteria andYhzhNotBetween(String value1, String value2) {
            addCriterion("YHZH not between", value1, value2, "yhzh");
            return (Criteria) this;
        }

        public Criteria andGszyIsNull() {
            addCriterion("GSZY is null");
            return (Criteria) this;
        }

        public Criteria andGszyIsNotNull() {
            addCriterion("GSZY is not null");
            return (Criteria) this;
        }

        public Criteria andGszyEqualTo(String value) {
            addCriterion("GSZY =", value, "gszy");
            return (Criteria) this;
        }

        public Criteria andGszyNotEqualTo(String value) {
            addCriterion("GSZY <>", value, "gszy");
            return (Criteria) this;
        }

        public Criteria andGszyGreaterThan(String value) {
            addCriterion("GSZY >", value, "gszy");
            return (Criteria) this;
        }

        public Criteria andGszyGreaterThanOrEqualTo(String value) {
            addCriterion("GSZY >=", value, "gszy");
            return (Criteria) this;
        }

        public Criteria andGszyLessThan(String value) {
            addCriterion("GSZY <", value, "gszy");
            return (Criteria) this;
        }

        public Criteria andGszyLessThanOrEqualTo(String value) {
            addCriterion("GSZY <=", value, "gszy");
            return (Criteria) this;
        }

        public Criteria andGszyLike(String value) {
            addCriterion("GSZY like", value, "gszy");
            return (Criteria) this;
        }

        public Criteria andGszyNotLike(String value) {
            addCriterion("GSZY not like", value, "gszy");
            return (Criteria) this;
        }

        public Criteria andGszyIn(List<String> values) {
            addCriterion("GSZY in", values, "gszy");
            return (Criteria) this;
        }

        public Criteria andGszyNotIn(List<String> values) {
            addCriterion("GSZY not in", values, "gszy");
            return (Criteria) this;
        }

        public Criteria andGszyBetween(String value1, String value2) {
            addCriterion("GSZY between", value1, value2, "gszy");
            return (Criteria) this;
        }

        public Criteria andGszyNotBetween(String value1, String value2) {
            addCriterion("GSZY not between", value1, value2, "gszy");
            return (Criteria) this;
        }

        public Criteria andIsYxIsNull() {
            addCriterion("IS_YX is null");
            return (Criteria) this;
        }

        public Criteria andIsYxIsNotNull() {
            addCriterion("IS_YX is not null");
            return (Criteria) this;
        }

        public Criteria andIsYxEqualTo(String value) {
            addCriterion("IS_YX =", value, "isYx");
            return (Criteria) this;
        }

        public Criteria andIsYxNotEqualTo(String value) {
            addCriterion("IS_YX <>", value, "isYx");
            return (Criteria) this;
        }

        public Criteria andIsYxGreaterThan(String value) {
            addCriterion("IS_YX >", value, "isYx");
            return (Criteria) this;
        }

        public Criteria andIsYxGreaterThanOrEqualTo(String value) {
            addCriterion("IS_YX >=", value, "isYx");
            return (Criteria) this;
        }

        public Criteria andIsYxLessThan(String value) {
            addCriterion("IS_YX <", value, "isYx");
            return (Criteria) this;
        }

        public Criteria andIsYxLessThanOrEqualTo(String value) {
            addCriterion("IS_YX <=", value, "isYx");
            return (Criteria) this;
        }

        public Criteria andIsYxLike(String value) {
            addCriterion("IS_YX like", value, "isYx");
            return (Criteria) this;
        }

        public Criteria andIsYxNotLike(String value) {
            addCriterion("IS_YX not like", value, "isYx");
            return (Criteria) this;
        }

        public Criteria andIsYxIn(List<String> values) {
            addCriterion("IS_YX in", values, "isYx");
            return (Criteria) this;
        }

        public Criteria andIsYxNotIn(List<String> values) {
            addCriterion("IS_YX not in", values, "isYx");
            return (Criteria) this;
        }

        public Criteria andIsYxBetween(String value1, String value2) {
            addCriterion("IS_YX between", value1, value2, "isYx");
            return (Criteria) this;
        }

        public Criteria andIsYxNotBetween(String value1, String value2) {
            addCriterion("IS_YX not between", value1, value2, "isYx");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNull() {
            addCriterion("OPERATOR is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("OPERATOR is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(String value) {
            addCriterion("OPERATOR =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(String value) {
            addCriterion("OPERATOR <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(String value) {
            addCriterion("OPERATOR >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATOR >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(String value) {
            addCriterion("OPERATOR <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(String value) {
            addCriterion("OPERATOR <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLike(String value) {
            addCriterion("OPERATOR like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotLike(String value) {
            addCriterion("OPERATOR not like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<String> values) {
            addCriterion("OPERATOR in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<String> values) {
            addCriterion("OPERATOR not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(String value1, String value2) {
            addCriterion("OPERATOR between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(String value1, String value2) {
            addCriterion("OPERATOR not between", value1, value2, "operator");
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

        public Criteria andGsIdIsNull() {
            addCriterion("GS_ID is null");
            return (Criteria) this;
        }

        public Criteria andGsIdIsNotNull() {
            addCriterion("GS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGsIdEqualTo(BigDecimal value) {
            addCriterion("GS_ID =", value, "gsId");
            return (Criteria) this;
        }

        public Criteria andGsIdNotEqualTo(BigDecimal value) {
            addCriterion("GS_ID <>", value, "gsId");
            return (Criteria) this;
        }

        public Criteria andGsIdGreaterThan(BigDecimal value) {
            addCriterion("GS_ID >", value, "gsId");
            return (Criteria) this;
        }

        public Criteria andGsIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GS_ID >=", value, "gsId");
            return (Criteria) this;
        }

        public Criteria andGsIdLessThan(BigDecimal value) {
            addCriterion("GS_ID <", value, "gsId");
            return (Criteria) this;
        }

        public Criteria andGsIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GS_ID <=", value, "gsId");
            return (Criteria) this;
        }

        public Criteria andGsIdIn(List<BigDecimal> values) {
            addCriterion("GS_ID in", values, "gsId");
            return (Criteria) this;
        }

        public Criteria andGsIdNotIn(List<BigDecimal> values) {
            addCriterion("GS_ID not in", values, "gsId");
            return (Criteria) this;
        }

        public Criteria andGsIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GS_ID between", value1, value2, "gsId");
            return (Criteria) this;
        }

        public Criteria andGsIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GS_ID not between", value1, value2, "gsId");
            return (Criteria) this;
        }

        public Criteria andLtimeIsNull() {
            addCriterion("LTIME is null");
            return (Criteria) this;
        }

        public Criteria andLtimeIsNotNull() {
            addCriterion("LTIME is not null");
            return (Criteria) this;
        }

        public Criteria andLtimeEqualTo(Date value) {
            addCriterion("LTIME =", value, "ltime");
            return (Criteria) this;
        }

        public Criteria andLtimeNotEqualTo(Date value) {
            addCriterion("LTIME <>", value, "ltime");
            return (Criteria) this;
        }

        public Criteria andLtimeGreaterThan(Date value) {
            addCriterion("LTIME >", value, "ltime");
            return (Criteria) this;
        }

        public Criteria andLtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LTIME >=", value, "ltime");
            return (Criteria) this;
        }

        public Criteria andLtimeLessThan(Date value) {
            addCriterion("LTIME <", value, "ltime");
            return (Criteria) this;
        }

        public Criteria andLtimeLessThanOrEqualTo(Date value) {
            addCriterion("LTIME <=", value, "ltime");
            return (Criteria) this;
        }

        public Criteria andLtimeIn(List<Date> values) {
            addCriterion("LTIME in", values, "ltime");
            return (Criteria) this;
        }

        public Criteria andLtimeNotIn(List<Date> values) {
            addCriterion("LTIME not in", values, "ltime");
            return (Criteria) this;
        }

        public Criteria andLtimeBetween(Date value1, Date value2) {
            addCriterion("LTIME between", value1, value2, "ltime");
            return (Criteria) this;
        }

        public Criteria andLtimeNotBetween(Date value1, Date value2) {
            addCriterion("LTIME not between", value1, value2, "ltime");
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