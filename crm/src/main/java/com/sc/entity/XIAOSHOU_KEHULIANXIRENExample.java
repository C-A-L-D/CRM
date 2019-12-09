package com.sc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XIAOSHOU_KEHULIANXIRENExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XIAOSHOU_KEHULIANXIRENExample() {
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

        public Criteria andLidIsNull() {
            addCriterion("LID is null");
            return (Criteria) this;
        }

        public Criteria andLidIsNotNull() {
            addCriterion("LID is not null");
            return (Criteria) this;
        }

        public Criteria andLidEqualTo(Long value) {
            addCriterion("LID =", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidNotEqualTo(Long value) {
            addCriterion("LID <>", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidGreaterThan(Long value) {
            addCriterion("LID >", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidGreaterThanOrEqualTo(Long value) {
            addCriterion("LID >=", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidLessThan(Long value) {
            addCriterion("LID <", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidLessThanOrEqualTo(Long value) {
            addCriterion("LID <=", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidIn(List<Long> values) {
            addCriterion("LID in", values, "lid");
            return (Criteria) this;
        }

        public Criteria andLidNotIn(List<Long> values) {
            addCriterion("LID not in", values, "lid");
            return (Criteria) this;
        }

        public Criteria andLidBetween(Long value1, Long value2) {
            addCriterion("LID between", value1, value2, "lid");
            return (Criteria) this;
        }

        public Criteria andLidNotBetween(Long value1, Long value2) {
            addCriterion("LID not between", value1, value2, "lid");
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

        public Criteria andLianxirenxingmingIsNull() {
            addCriterion("LIANXIRENXINGMING is null");
            return (Criteria) this;
        }

        public Criteria andLianxirenxingmingIsNotNull() {
            addCriterion("LIANXIRENXINGMING is not null");
            return (Criteria) this;
        }

        public Criteria andLianxirenxingmingEqualTo(String value) {
            addCriterion("LIANXIRENXINGMING =", value, "lianxirenxingming");
            return (Criteria) this;
        }

        public Criteria andLianxirenxingmingNotEqualTo(String value) {
            addCriterion("LIANXIRENXINGMING <>", value, "lianxirenxingming");
            return (Criteria) this;
        }

        public Criteria andLianxirenxingmingGreaterThan(String value) {
            addCriterion("LIANXIRENXINGMING >", value, "lianxirenxingming");
            return (Criteria) this;
        }

        public Criteria andLianxirenxingmingGreaterThanOrEqualTo(String value) {
            addCriterion("LIANXIRENXINGMING >=", value, "lianxirenxingming");
            return (Criteria) this;
        }

        public Criteria andLianxirenxingmingLessThan(String value) {
            addCriterion("LIANXIRENXINGMING <", value, "lianxirenxingming");
            return (Criteria) this;
        }

        public Criteria andLianxirenxingmingLessThanOrEqualTo(String value) {
            addCriterion("LIANXIRENXINGMING <=", value, "lianxirenxingming");
            return (Criteria) this;
        }

        public Criteria andLianxirenxingmingLike(String value) {
            addCriterion("LIANXIRENXINGMING like", value, "lianxirenxingming");
            return (Criteria) this;
        }

        public Criteria andLianxirenxingmingNotLike(String value) {
            addCriterion("LIANXIRENXINGMING not like", value, "lianxirenxingming");
            return (Criteria) this;
        }

        public Criteria andLianxirenxingmingIn(List<String> values) {
            addCriterion("LIANXIRENXINGMING in", values, "lianxirenxingming");
            return (Criteria) this;
        }

        public Criteria andLianxirenxingmingNotIn(List<String> values) {
            addCriterion("LIANXIRENXINGMING not in", values, "lianxirenxingming");
            return (Criteria) this;
        }

        public Criteria andLianxirenxingmingBetween(String value1, String value2) {
            addCriterion("LIANXIRENXINGMING between", value1, value2, "lianxirenxingming");
            return (Criteria) this;
        }

        public Criteria andLianxirenxingmingNotBetween(String value1, String value2) {
            addCriterion("LIANXIRENXINGMING not between", value1, value2, "lianxirenxingming");
            return (Criteria) this;
        }

        public Criteria andYingwenmingIsNull() {
            addCriterion("YINGWENMING is null");
            return (Criteria) this;
        }

        public Criteria andYingwenmingIsNotNull() {
            addCriterion("YINGWENMING is not null");
            return (Criteria) this;
        }

        public Criteria andYingwenmingEqualTo(String value) {
            addCriterion("YINGWENMING =", value, "yingwenming");
            return (Criteria) this;
        }

        public Criteria andYingwenmingNotEqualTo(String value) {
            addCriterion("YINGWENMING <>", value, "yingwenming");
            return (Criteria) this;
        }

        public Criteria andYingwenmingGreaterThan(String value) {
            addCriterion("YINGWENMING >", value, "yingwenming");
            return (Criteria) this;
        }

        public Criteria andYingwenmingGreaterThanOrEqualTo(String value) {
            addCriterion("YINGWENMING >=", value, "yingwenming");
            return (Criteria) this;
        }

        public Criteria andYingwenmingLessThan(String value) {
            addCriterion("YINGWENMING <", value, "yingwenming");
            return (Criteria) this;
        }

        public Criteria andYingwenmingLessThanOrEqualTo(String value) {
            addCriterion("YINGWENMING <=", value, "yingwenming");
            return (Criteria) this;
        }

        public Criteria andYingwenmingLike(String value) {
            addCriterion("YINGWENMING like", value, "yingwenming");
            return (Criteria) this;
        }

        public Criteria andYingwenmingNotLike(String value) {
            addCriterion("YINGWENMING not like", value, "yingwenming");
            return (Criteria) this;
        }

        public Criteria andYingwenmingIn(List<String> values) {
            addCriterion("YINGWENMING in", values, "yingwenming");
            return (Criteria) this;
        }

        public Criteria andYingwenmingNotIn(List<String> values) {
            addCriterion("YINGWENMING not in", values, "yingwenming");
            return (Criteria) this;
        }

        public Criteria andYingwenmingBetween(String value1, String value2) {
            addCriterion("YINGWENMING between", value1, value2, "yingwenming");
            return (Criteria) this;
        }

        public Criteria andYingwenmingNotBetween(String value1, String value2) {
            addCriterion("YINGWENMING not between", value1, value2, "yingwenming");
            return (Criteria) this;
        }

        public Criteria andZhiwuIsNull() {
            addCriterion("ZHIWU is null");
            return (Criteria) this;
        }

        public Criteria andZhiwuIsNotNull() {
            addCriterion("ZHIWU is not null");
            return (Criteria) this;
        }

        public Criteria andZhiwuEqualTo(String value) {
            addCriterion("ZHIWU =", value, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andZhiwuNotEqualTo(String value) {
            addCriterion("ZHIWU <>", value, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andZhiwuGreaterThan(String value) {
            addCriterion("ZHIWU >", value, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andZhiwuGreaterThanOrEqualTo(String value) {
            addCriterion("ZHIWU >=", value, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andZhiwuLessThan(String value) {
            addCriterion("ZHIWU <", value, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andZhiwuLessThanOrEqualTo(String value) {
            addCriterion("ZHIWU <=", value, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andZhiwuLike(String value) {
            addCriterion("ZHIWU like", value, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andZhiwuNotLike(String value) {
            addCriterion("ZHIWU not like", value, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andZhiwuIn(List<String> values) {
            addCriterion("ZHIWU in", values, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andZhiwuNotIn(List<String> values) {
            addCriterion("ZHIWU not in", values, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andZhiwuBetween(String value1, String value2) {
            addCriterion("ZHIWU between", value1, value2, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andZhiwuNotBetween(String value1, String value2) {
            addCriterion("ZHIWU not between", value1, value2, "zhiwu");
            return (Criteria) this;
        }

        public Criteria andBumenIsNull() {
            addCriterion("BUMEN is null");
            return (Criteria) this;
        }

        public Criteria andBumenIsNotNull() {
            addCriterion("BUMEN is not null");
            return (Criteria) this;
        }

        public Criteria andBumenEqualTo(String value) {
            addCriterion("BUMEN =", value, "bumen");
            return (Criteria) this;
        }

        public Criteria andBumenNotEqualTo(String value) {
            addCriterion("BUMEN <>", value, "bumen");
            return (Criteria) this;
        }

        public Criteria andBumenGreaterThan(String value) {
            addCriterion("BUMEN >", value, "bumen");
            return (Criteria) this;
        }

        public Criteria andBumenGreaterThanOrEqualTo(String value) {
            addCriterion("BUMEN >=", value, "bumen");
            return (Criteria) this;
        }

        public Criteria andBumenLessThan(String value) {
            addCriterion("BUMEN <", value, "bumen");
            return (Criteria) this;
        }

        public Criteria andBumenLessThanOrEqualTo(String value) {
            addCriterion("BUMEN <=", value, "bumen");
            return (Criteria) this;
        }

        public Criteria andBumenLike(String value) {
            addCriterion("BUMEN like", value, "bumen");
            return (Criteria) this;
        }

        public Criteria andBumenNotLike(String value) {
            addCriterion("BUMEN not like", value, "bumen");
            return (Criteria) this;
        }

        public Criteria andBumenIn(List<String> values) {
            addCriterion("BUMEN in", values, "bumen");
            return (Criteria) this;
        }

        public Criteria andBumenNotIn(List<String> values) {
            addCriterion("BUMEN not in", values, "bumen");
            return (Criteria) this;
        }

        public Criteria andBumenBetween(String value1, String value2) {
            addCriterion("BUMEN between", value1, value2, "bumen");
            return (Criteria) this;
        }

        public Criteria andBumenNotBetween(String value1, String value2) {
            addCriterion("BUMEN not between", value1, value2, "bumen");
            return (Criteria) this;
        }

        public Criteria andShoujiIsNull() {
            addCriterion("SHOUJI is null");
            return (Criteria) this;
        }

        public Criteria andShoujiIsNotNull() {
            addCriterion("SHOUJI is not null");
            return (Criteria) this;
        }

        public Criteria andShoujiEqualTo(String value) {
            addCriterion("SHOUJI =", value, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiNotEqualTo(String value) {
            addCriterion("SHOUJI <>", value, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiGreaterThan(String value) {
            addCriterion("SHOUJI >", value, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiGreaterThanOrEqualTo(String value) {
            addCriterion("SHOUJI >=", value, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiLessThan(String value) {
            addCriterion("SHOUJI <", value, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiLessThanOrEqualTo(String value) {
            addCriterion("SHOUJI <=", value, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiLike(String value) {
            addCriterion("SHOUJI like", value, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiNotLike(String value) {
            addCriterion("SHOUJI not like", value, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiIn(List<String> values) {
            addCriterion("SHOUJI in", values, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiNotIn(List<String> values) {
            addCriterion("SHOUJI not in", values, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiBetween(String value1, String value2) {
            addCriterion("SHOUJI between", value1, value2, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiNotBetween(String value1, String value2) {
            addCriterion("SHOUJI not between", value1, value2, "shouji");
            return (Criteria) this;
        }

        public Criteria andBangongdianhuaIsNull() {
            addCriterion("BANGONGDIANHUA is null");
            return (Criteria) this;
        }

        public Criteria andBangongdianhuaIsNotNull() {
            addCriterion("BANGONGDIANHUA is not null");
            return (Criteria) this;
        }

        public Criteria andBangongdianhuaEqualTo(String value) {
            addCriterion("BANGONGDIANHUA =", value, "bangongdianhua");
            return (Criteria) this;
        }

        public Criteria andBangongdianhuaNotEqualTo(String value) {
            addCriterion("BANGONGDIANHUA <>", value, "bangongdianhua");
            return (Criteria) this;
        }

        public Criteria andBangongdianhuaGreaterThan(String value) {
            addCriterion("BANGONGDIANHUA >", value, "bangongdianhua");
            return (Criteria) this;
        }

        public Criteria andBangongdianhuaGreaterThanOrEqualTo(String value) {
            addCriterion("BANGONGDIANHUA >=", value, "bangongdianhua");
            return (Criteria) this;
        }

        public Criteria andBangongdianhuaLessThan(String value) {
            addCriterion("BANGONGDIANHUA <", value, "bangongdianhua");
            return (Criteria) this;
        }

        public Criteria andBangongdianhuaLessThanOrEqualTo(String value) {
            addCriterion("BANGONGDIANHUA <=", value, "bangongdianhua");
            return (Criteria) this;
        }

        public Criteria andBangongdianhuaLike(String value) {
            addCriterion("BANGONGDIANHUA like", value, "bangongdianhua");
            return (Criteria) this;
        }

        public Criteria andBangongdianhuaNotLike(String value) {
            addCriterion("BANGONGDIANHUA not like", value, "bangongdianhua");
            return (Criteria) this;
        }

        public Criteria andBangongdianhuaIn(List<String> values) {
            addCriterion("BANGONGDIANHUA in", values, "bangongdianhua");
            return (Criteria) this;
        }

        public Criteria andBangongdianhuaNotIn(List<String> values) {
            addCriterion("BANGONGDIANHUA not in", values, "bangongdianhua");
            return (Criteria) this;
        }

        public Criteria andBangongdianhuaBetween(String value1, String value2) {
            addCriterion("BANGONGDIANHUA between", value1, value2, "bangongdianhua");
            return (Criteria) this;
        }

        public Criteria andBangongdianhuaNotBetween(String value1, String value2) {
            addCriterion("BANGONGDIANHUA not between", value1, value2, "bangongdianhua");
            return (Criteria) this;
        }

        public Criteria andDianziyoujianIsNull() {
            addCriterion("DIANZIYOUJIAN is null");
            return (Criteria) this;
        }

        public Criteria andDianziyoujianIsNotNull() {
            addCriterion("DIANZIYOUJIAN is not null");
            return (Criteria) this;
        }

        public Criteria andDianziyoujianEqualTo(String value) {
            addCriterion("DIANZIYOUJIAN =", value, "dianziyoujian");
            return (Criteria) this;
        }

        public Criteria andDianziyoujianNotEqualTo(String value) {
            addCriterion("DIANZIYOUJIAN <>", value, "dianziyoujian");
            return (Criteria) this;
        }

        public Criteria andDianziyoujianGreaterThan(String value) {
            addCriterion("DIANZIYOUJIAN >", value, "dianziyoujian");
            return (Criteria) this;
        }

        public Criteria andDianziyoujianGreaterThanOrEqualTo(String value) {
            addCriterion("DIANZIYOUJIAN >=", value, "dianziyoujian");
            return (Criteria) this;
        }

        public Criteria andDianziyoujianLessThan(String value) {
            addCriterion("DIANZIYOUJIAN <", value, "dianziyoujian");
            return (Criteria) this;
        }

        public Criteria andDianziyoujianLessThanOrEqualTo(String value) {
            addCriterion("DIANZIYOUJIAN <=", value, "dianziyoujian");
            return (Criteria) this;
        }

        public Criteria andDianziyoujianLike(String value) {
            addCriterion("DIANZIYOUJIAN like", value, "dianziyoujian");
            return (Criteria) this;
        }

        public Criteria andDianziyoujianNotLike(String value) {
            addCriterion("DIANZIYOUJIAN not like", value, "dianziyoujian");
            return (Criteria) this;
        }

        public Criteria andDianziyoujianIn(List<String> values) {
            addCriterion("DIANZIYOUJIAN in", values, "dianziyoujian");
            return (Criteria) this;
        }

        public Criteria andDianziyoujianNotIn(List<String> values) {
            addCriterion("DIANZIYOUJIAN not in", values, "dianziyoujian");
            return (Criteria) this;
        }

        public Criteria andDianziyoujianBetween(String value1, String value2) {
            addCriterion("DIANZIYOUJIAN between", value1, value2, "dianziyoujian");
            return (Criteria) this;
        }

        public Criteria andDianziyoujianNotBetween(String value1, String value2) {
            addCriterion("DIANZIYOUJIAN not between", value1, value2, "dianziyoujian");
            return (Criteria) this;
        }

        public Criteria andDizhiIsNull() {
            addCriterion("DIZHI is null");
            return (Criteria) this;
        }

        public Criteria andDizhiIsNotNull() {
            addCriterion("DIZHI is not null");
            return (Criteria) this;
        }

        public Criteria andDizhiEqualTo(String value) {
            addCriterion("DIZHI =", value, "dizhi");
            return (Criteria) this;
        }

        public Criteria andDizhiNotEqualTo(String value) {
            addCriterion("DIZHI <>", value, "dizhi");
            return (Criteria) this;
        }

        public Criteria andDizhiGreaterThan(String value) {
            addCriterion("DIZHI >", value, "dizhi");
            return (Criteria) this;
        }

        public Criteria andDizhiGreaterThanOrEqualTo(String value) {
            addCriterion("DIZHI >=", value, "dizhi");
            return (Criteria) this;
        }

        public Criteria andDizhiLessThan(String value) {
            addCriterion("DIZHI <", value, "dizhi");
            return (Criteria) this;
        }

        public Criteria andDizhiLessThanOrEqualTo(String value) {
            addCriterion("DIZHI <=", value, "dizhi");
            return (Criteria) this;
        }

        public Criteria andDizhiLike(String value) {
            addCriterion("DIZHI like", value, "dizhi");
            return (Criteria) this;
        }

        public Criteria andDizhiNotLike(String value) {
            addCriterion("DIZHI not like", value, "dizhi");
            return (Criteria) this;
        }

        public Criteria andDizhiIn(List<String> values) {
            addCriterion("DIZHI in", values, "dizhi");
            return (Criteria) this;
        }

        public Criteria andDizhiNotIn(List<String> values) {
            addCriterion("DIZHI not in", values, "dizhi");
            return (Criteria) this;
        }

        public Criteria andDizhiBetween(String value1, String value2) {
            addCriterion("DIZHI between", value1, value2, "dizhi");
            return (Criteria) this;
        }

        public Criteria andDizhiNotBetween(String value1, String value2) {
            addCriterion("DIZHI not between", value1, value2, "dizhi");
            return (Criteria) this;
        }

        public Criteria andBeizhuxinxiIsNull() {
            addCriterion("BEIZHUXINXI is null");
            return (Criteria) this;
        }

        public Criteria andBeizhuxinxiIsNotNull() {
            addCriterion("BEIZHUXINXI is not null");
            return (Criteria) this;
        }

        public Criteria andBeizhuxinxiEqualTo(String value) {
            addCriterion("BEIZHUXINXI =", value, "beizhuxinxi");
            return (Criteria) this;
        }

        public Criteria andBeizhuxinxiNotEqualTo(String value) {
            addCriterion("BEIZHUXINXI <>", value, "beizhuxinxi");
            return (Criteria) this;
        }

        public Criteria andBeizhuxinxiGreaterThan(String value) {
            addCriterion("BEIZHUXINXI >", value, "beizhuxinxi");
            return (Criteria) this;
        }

        public Criteria andBeizhuxinxiGreaterThanOrEqualTo(String value) {
            addCriterion("BEIZHUXINXI >=", value, "beizhuxinxi");
            return (Criteria) this;
        }

        public Criteria andBeizhuxinxiLessThan(String value) {
            addCriterion("BEIZHUXINXI <", value, "beizhuxinxi");
            return (Criteria) this;
        }

        public Criteria andBeizhuxinxiLessThanOrEqualTo(String value) {
            addCriterion("BEIZHUXINXI <=", value, "beizhuxinxi");
            return (Criteria) this;
        }

        public Criteria andBeizhuxinxiLike(String value) {
            addCriterion("BEIZHUXINXI like", value, "beizhuxinxi");
            return (Criteria) this;
        }

        public Criteria andBeizhuxinxiNotLike(String value) {
            addCriterion("BEIZHUXINXI not like", value, "beizhuxinxi");
            return (Criteria) this;
        }

        public Criteria andBeizhuxinxiIn(List<String> values) {
            addCriterion("BEIZHUXINXI in", values, "beizhuxinxi");
            return (Criteria) this;
        }

        public Criteria andBeizhuxinxiNotIn(List<String> values) {
            addCriterion("BEIZHUXINXI not in", values, "beizhuxinxi");
            return (Criteria) this;
        }

        public Criteria andBeizhuxinxiBetween(String value1, String value2) {
            addCriterion("BEIZHUXINXI between", value1, value2, "beizhuxinxi");
            return (Criteria) this;
        }

        public Criteria andBeizhuxinxiNotBetween(String value1, String value2) {
            addCriterion("BEIZHUXINXI not between", value1, value2, "beizhuxinxi");
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