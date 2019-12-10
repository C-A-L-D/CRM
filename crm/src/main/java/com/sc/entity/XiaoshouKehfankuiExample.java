package com.sc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XiaoshouKehfankuiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XiaoshouKehfankuiExample() {
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

        public Criteria andFidIsNull() {
            addCriterion("FID is null");
            return (Criteria) this;
        }

        public Criteria andFidIsNotNull() {
            addCriterion("FID is not null");
            return (Criteria) this;
        }

        public Criteria andFidEqualTo(Long value) {
            addCriterion("FID =", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotEqualTo(Long value) {
            addCriterion("FID <>", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThan(Long value) {
            addCriterion("FID >", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThanOrEqualTo(Long value) {
            addCriterion("FID >=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThan(Long value) {
            addCriterion("FID <", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThanOrEqualTo(Long value) {
            addCriterion("FID <=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidIn(List<Long> values) {
            addCriterion("FID in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotIn(List<Long> values) {
            addCriterion("FID not in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidBetween(Long value1, Long value2) {
            addCriterion("FID between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotBetween(Long value1, Long value2) {
            addCriterion("FID not between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andJiluyouxianjiIsNull() {
            addCriterion("JILUYOUXIANJI is null");
            return (Criteria) this;
        }

        public Criteria andJiluyouxianjiIsNotNull() {
            addCriterion("JILUYOUXIANJI is not null");
            return (Criteria) this;
        }

        public Criteria andJiluyouxianjiEqualTo(String value) {
            addCriterion("JILUYOUXIANJI =", value, "jiluyouxianji");
            return (Criteria) this;
        }

        public Criteria andJiluyouxianjiNotEqualTo(String value) {
            addCriterion("JILUYOUXIANJI <>", value, "jiluyouxianji");
            return (Criteria) this;
        }

        public Criteria andJiluyouxianjiGreaterThan(String value) {
            addCriterion("JILUYOUXIANJI >", value, "jiluyouxianji");
            return (Criteria) this;
        }

        public Criteria andJiluyouxianjiGreaterThanOrEqualTo(String value) {
            addCriterion("JILUYOUXIANJI >=", value, "jiluyouxianji");
            return (Criteria) this;
        }

        public Criteria andJiluyouxianjiLessThan(String value) {
            addCriterion("JILUYOUXIANJI <", value, "jiluyouxianji");
            return (Criteria) this;
        }

        public Criteria andJiluyouxianjiLessThanOrEqualTo(String value) {
            addCriterion("JILUYOUXIANJI <=", value, "jiluyouxianji");
            return (Criteria) this;
        }

        public Criteria andJiluyouxianjiLike(String value) {
            addCriterion("JILUYOUXIANJI like", value, "jiluyouxianji");
            return (Criteria) this;
        }

        public Criteria andJiluyouxianjiNotLike(String value) {
            addCriterion("JILUYOUXIANJI not like", value, "jiluyouxianji");
            return (Criteria) this;
        }

        public Criteria andJiluyouxianjiIn(List<String> values) {
            addCriterion("JILUYOUXIANJI in", values, "jiluyouxianji");
            return (Criteria) this;
        }

        public Criteria andJiluyouxianjiNotIn(List<String> values) {
            addCriterion("JILUYOUXIANJI not in", values, "jiluyouxianji");
            return (Criteria) this;
        }

        public Criteria andJiluyouxianjiBetween(String value1, String value2) {
            addCriterion("JILUYOUXIANJI between", value1, value2, "jiluyouxianji");
            return (Criteria) this;
        }

        public Criteria andJiluyouxianjiNotBetween(String value1, String value2) {
            addCriterion("JILUYOUXIANJI not between", value1, value2, "jiluyouxianji");
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

        public Criteria andZhuangtaiIsNull() {
            addCriterion("ZHUANGTAI is null");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiIsNotNull() {
            addCriterion("ZHUANGTAI is not null");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiEqualTo(String value) {
            addCriterion("ZHUANGTAI =", value, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiNotEqualTo(String value) {
            addCriterion("ZHUANGTAI <>", value, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiGreaterThan(String value) {
            addCriterion("ZHUANGTAI >", value, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiGreaterThanOrEqualTo(String value) {
            addCriterion("ZHUANGTAI >=", value, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiLessThan(String value) {
            addCriterion("ZHUANGTAI <", value, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiLessThanOrEqualTo(String value) {
            addCriterion("ZHUANGTAI <=", value, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiLike(String value) {
            addCriterion("ZHUANGTAI like", value, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiNotLike(String value) {
            addCriterion("ZHUANGTAI not like", value, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiIn(List<String> values) {
            addCriterion("ZHUANGTAI in", values, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiNotIn(List<String> values) {
            addCriterion("ZHUANGTAI not in", values, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiBetween(String value1, String value2) {
            addCriterion("ZHUANGTAI between", value1, value2, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andZhuangtaiNotBetween(String value1, String value2) {
            addCriterion("ZHUANGTAI not between", value1, value2, "zhuangtai");
            return (Criteria) this;
        }

        public Criteria andFankuileixingIsNull() {
            addCriterion("FANKUILEIXING is null");
            return (Criteria) this;
        }

        public Criteria andFankuileixingIsNotNull() {
            addCriterion("FANKUILEIXING is not null");
            return (Criteria) this;
        }

        public Criteria andFankuileixingEqualTo(String value) {
            addCriterion("FANKUILEIXING =", value, "fankuileixing");
            return (Criteria) this;
        }

        public Criteria andFankuileixingNotEqualTo(String value) {
            addCriterion("FANKUILEIXING <>", value, "fankuileixing");
            return (Criteria) this;
        }

        public Criteria andFankuileixingGreaterThan(String value) {
            addCriterion("FANKUILEIXING >", value, "fankuileixing");
            return (Criteria) this;
        }

        public Criteria andFankuileixingGreaterThanOrEqualTo(String value) {
            addCriterion("FANKUILEIXING >=", value, "fankuileixing");
            return (Criteria) this;
        }

        public Criteria andFankuileixingLessThan(String value) {
            addCriterion("FANKUILEIXING <", value, "fankuileixing");
            return (Criteria) this;
        }

        public Criteria andFankuileixingLessThanOrEqualTo(String value) {
            addCriterion("FANKUILEIXING <=", value, "fankuileixing");
            return (Criteria) this;
        }

        public Criteria andFankuileixingLike(String value) {
            addCriterion("FANKUILEIXING like", value, "fankuileixing");
            return (Criteria) this;
        }

        public Criteria andFankuileixingNotLike(String value) {
            addCriterion("FANKUILEIXING not like", value, "fankuileixing");
            return (Criteria) this;
        }

        public Criteria andFankuileixingIn(List<String> values) {
            addCriterion("FANKUILEIXING in", values, "fankuileixing");
            return (Criteria) this;
        }

        public Criteria andFankuileixingNotIn(List<String> values) {
            addCriterion("FANKUILEIXING not in", values, "fankuileixing");
            return (Criteria) this;
        }

        public Criteria andFankuileixingBetween(String value1, String value2) {
            addCriterion("FANKUILEIXING between", value1, value2, "fankuileixing");
            return (Criteria) this;
        }

        public Criteria andFankuileixingNotBetween(String value1, String value2) {
            addCriterion("FANKUILEIXING not between", value1, value2, "fankuileixing");
            return (Criteria) this;
        }

        public Criteria andFankuishijianIsNull() {
            addCriterion("FANKUISHIJIAN is null");
            return (Criteria) this;
        }

        public Criteria andFankuishijianIsNotNull() {
            addCriterion("FANKUISHIJIAN is not null");
            return (Criteria) this;
        }

        public Criteria andFankuishijianEqualTo(String value) {
            addCriterion("FANKUISHIJIAN =", value, "fankuishijian");
            return (Criteria) this;
        }

        public Criteria andFankuishijianNotEqualTo(String value) {
            addCriterion("FANKUISHIJIAN <>", value, "fankuishijian");
            return (Criteria) this;
        }

        public Criteria andFankuishijianGreaterThan(String value) {
            addCriterion("FANKUISHIJIAN >", value, "fankuishijian");
            return (Criteria) this;
        }

        public Criteria andFankuishijianGreaterThanOrEqualTo(String value) {
            addCriterion("FANKUISHIJIAN >=", value, "fankuishijian");
            return (Criteria) this;
        }

        public Criteria andFankuishijianLessThan(String value) {
            addCriterion("FANKUISHIJIAN <", value, "fankuishijian");
            return (Criteria) this;
        }

        public Criteria andFankuishijianLessThanOrEqualTo(String value) {
            addCriterion("FANKUISHIJIAN <=", value, "fankuishijian");
            return (Criteria) this;
        }

        public Criteria andFankuishijianLike(String value) {
            addCriterion("FANKUISHIJIAN like", value, "fankuishijian");
            return (Criteria) this;
        }

        public Criteria andFankuishijianNotLike(String value) {
            addCriterion("FANKUISHIJIAN not like", value, "fankuishijian");
            return (Criteria) this;
        }

        public Criteria andFankuishijianIn(List<String> values) {
            addCriterion("FANKUISHIJIAN in", values, "fankuishijian");
            return (Criteria) this;
        }

        public Criteria andFankuishijianNotIn(List<String> values) {
            addCriterion("FANKUISHIJIAN not in", values, "fankuishijian");
            return (Criteria) this;
        }

        public Criteria andFankuishijianBetween(String value1, String value2) {
            addCriterion("FANKUISHIJIAN between", value1, value2, "fankuishijian");
            return (Criteria) this;
        }

        public Criteria andFankuishijianNotBetween(String value1, String value2) {
            addCriterion("FANKUISHIJIAN not between", value1, value2, "fankuishijian");
            return (Criteria) this;
        }

        public Criteria andFankuiyuanyinIsNull() {
            addCriterion("FANKUIYUANYIN is null");
            return (Criteria) this;
        }

        public Criteria andFankuiyuanyinIsNotNull() {
            addCriterion("FANKUIYUANYIN is not null");
            return (Criteria) this;
        }

        public Criteria andFankuiyuanyinEqualTo(String value) {
            addCriterion("FANKUIYUANYIN =", value, "fankuiyuanyin");
            return (Criteria) this;
        }

        public Criteria andFankuiyuanyinNotEqualTo(String value) {
            addCriterion("FANKUIYUANYIN <>", value, "fankuiyuanyin");
            return (Criteria) this;
        }

        public Criteria andFankuiyuanyinGreaterThan(String value) {
            addCriterion("FANKUIYUANYIN >", value, "fankuiyuanyin");
            return (Criteria) this;
        }

        public Criteria andFankuiyuanyinGreaterThanOrEqualTo(String value) {
            addCriterion("FANKUIYUANYIN >=", value, "fankuiyuanyin");
            return (Criteria) this;
        }

        public Criteria andFankuiyuanyinLessThan(String value) {
            addCriterion("FANKUIYUANYIN <", value, "fankuiyuanyin");
            return (Criteria) this;
        }

        public Criteria andFankuiyuanyinLessThanOrEqualTo(String value) {
            addCriterion("FANKUIYUANYIN <=", value, "fankuiyuanyin");
            return (Criteria) this;
        }

        public Criteria andFankuiyuanyinLike(String value) {
            addCriterion("FANKUIYUANYIN like", value, "fankuiyuanyin");
            return (Criteria) this;
        }

        public Criteria andFankuiyuanyinNotLike(String value) {
            addCriterion("FANKUIYUANYIN not like", value, "fankuiyuanyin");
            return (Criteria) this;
        }

        public Criteria andFankuiyuanyinIn(List<String> values) {
            addCriterion("FANKUIYUANYIN in", values, "fankuiyuanyin");
            return (Criteria) this;
        }

        public Criteria andFankuiyuanyinNotIn(List<String> values) {
            addCriterion("FANKUIYUANYIN not in", values, "fankuiyuanyin");
            return (Criteria) this;
        }

        public Criteria andFankuiyuanyinBetween(String value1, String value2) {
            addCriterion("FANKUIYUANYIN between", value1, value2, "fankuiyuanyin");
            return (Criteria) this;
        }

        public Criteria andFankuiyuanyinNotBetween(String value1, String value2) {
            addCriterion("FANKUIYUANYIN not between", value1, value2, "fankuiyuanyin");
            return (Criteria) this;
        }

        public Criteria andFuzerenIsNull() {
            addCriterion("FUZEREN is null");
            return (Criteria) this;
        }

        public Criteria andFuzerenIsNotNull() {
            addCriterion("FUZEREN is not null");
            return (Criteria) this;
        }

        public Criteria andFuzerenEqualTo(String value) {
            addCriterion("FUZEREN =", value, "fuzeren");
            return (Criteria) this;
        }

        public Criteria andFuzerenNotEqualTo(String value) {
            addCriterion("FUZEREN <>", value, "fuzeren");
            return (Criteria) this;
        }

        public Criteria andFuzerenGreaterThan(String value) {
            addCriterion("FUZEREN >", value, "fuzeren");
            return (Criteria) this;
        }

        public Criteria andFuzerenGreaterThanOrEqualTo(String value) {
            addCriterion("FUZEREN >=", value, "fuzeren");
            return (Criteria) this;
        }

        public Criteria andFuzerenLessThan(String value) {
            addCriterion("FUZEREN <", value, "fuzeren");
            return (Criteria) this;
        }

        public Criteria andFuzerenLessThanOrEqualTo(String value) {
            addCriterion("FUZEREN <=", value, "fuzeren");
            return (Criteria) this;
        }

        public Criteria andFuzerenLike(String value) {
            addCriterion("FUZEREN like", value, "fuzeren");
            return (Criteria) this;
        }

        public Criteria andFuzerenNotLike(String value) {
            addCriterion("FUZEREN not like", value, "fuzeren");
            return (Criteria) this;
        }

        public Criteria andFuzerenIn(List<String> values) {
            addCriterion("FUZEREN in", values, "fuzeren");
            return (Criteria) this;
        }

        public Criteria andFuzerenNotIn(List<String> values) {
            addCriterion("FUZEREN not in", values, "fuzeren");
            return (Criteria) this;
        }

        public Criteria andFuzerenBetween(String value1, String value2) {
            addCriterion("FUZEREN between", value1, value2, "fuzeren");
            return (Criteria) this;
        }

        public Criteria andFuzerenNotBetween(String value1, String value2) {
            addCriterion("FUZEREN not between", value1, value2, "fuzeren");
            return (Criteria) this;
        }

        public Criteria andFankuilaiyuanIsNull() {
            addCriterion("FANKUILAIYUAN is null");
            return (Criteria) this;
        }

        public Criteria andFankuilaiyuanIsNotNull() {
            addCriterion("FANKUILAIYUAN is not null");
            return (Criteria) this;
        }

        public Criteria andFankuilaiyuanEqualTo(String value) {
            addCriterion("FANKUILAIYUAN =", value, "fankuilaiyuan");
            return (Criteria) this;
        }

        public Criteria andFankuilaiyuanNotEqualTo(String value) {
            addCriterion("FANKUILAIYUAN <>", value, "fankuilaiyuan");
            return (Criteria) this;
        }

        public Criteria andFankuilaiyuanGreaterThan(String value) {
            addCriterion("FANKUILAIYUAN >", value, "fankuilaiyuan");
            return (Criteria) this;
        }

        public Criteria andFankuilaiyuanGreaterThanOrEqualTo(String value) {
            addCriterion("FANKUILAIYUAN >=", value, "fankuilaiyuan");
            return (Criteria) this;
        }

        public Criteria andFankuilaiyuanLessThan(String value) {
            addCriterion("FANKUILAIYUAN <", value, "fankuilaiyuan");
            return (Criteria) this;
        }

        public Criteria andFankuilaiyuanLessThanOrEqualTo(String value) {
            addCriterion("FANKUILAIYUAN <=", value, "fankuilaiyuan");
            return (Criteria) this;
        }

        public Criteria andFankuilaiyuanLike(String value) {
            addCriterion("FANKUILAIYUAN like", value, "fankuilaiyuan");
            return (Criteria) this;
        }

        public Criteria andFankuilaiyuanNotLike(String value) {
            addCriterion("FANKUILAIYUAN not like", value, "fankuilaiyuan");
            return (Criteria) this;
        }

        public Criteria andFankuilaiyuanIn(List<String> values) {
            addCriterion("FANKUILAIYUAN in", values, "fankuilaiyuan");
            return (Criteria) this;
        }

        public Criteria andFankuilaiyuanNotIn(List<String> values) {
            addCriterion("FANKUILAIYUAN not in", values, "fankuilaiyuan");
            return (Criteria) this;
        }

        public Criteria andFankuilaiyuanBetween(String value1, String value2) {
            addCriterion("FANKUILAIYUAN between", value1, value2, "fankuilaiyuan");
            return (Criteria) this;
        }

        public Criteria andFankuilaiyuanNotBetween(String value1, String value2) {
            addCriterion("FANKUILAIYUAN not between", value1, value2, "fankuilaiyuan");
            return (Criteria) this;
        }

        public Criteria andFankuizhutiIsNull() {
            addCriterion("FANKUIZHUTI is null");
            return (Criteria) this;
        }

        public Criteria andFankuizhutiIsNotNull() {
            addCriterion("FANKUIZHUTI is not null");
            return (Criteria) this;
        }

        public Criteria andFankuizhutiEqualTo(String value) {
            addCriterion("FANKUIZHUTI =", value, "fankuizhuti");
            return (Criteria) this;
        }

        public Criteria andFankuizhutiNotEqualTo(String value) {
            addCriterion("FANKUIZHUTI <>", value, "fankuizhuti");
            return (Criteria) this;
        }

        public Criteria andFankuizhutiGreaterThan(String value) {
            addCriterion("FANKUIZHUTI >", value, "fankuizhuti");
            return (Criteria) this;
        }

        public Criteria andFankuizhutiGreaterThanOrEqualTo(String value) {
            addCriterion("FANKUIZHUTI >=", value, "fankuizhuti");
            return (Criteria) this;
        }

        public Criteria andFankuizhutiLessThan(String value) {
            addCriterion("FANKUIZHUTI <", value, "fankuizhuti");
            return (Criteria) this;
        }

        public Criteria andFankuizhutiLessThanOrEqualTo(String value) {
            addCriterion("FANKUIZHUTI <=", value, "fankuizhuti");
            return (Criteria) this;
        }

        public Criteria andFankuizhutiLike(String value) {
            addCriterion("FANKUIZHUTI like", value, "fankuizhuti");
            return (Criteria) this;
        }

        public Criteria andFankuizhutiNotLike(String value) {
            addCriterion("FANKUIZHUTI not like", value, "fankuizhuti");
            return (Criteria) this;
        }

        public Criteria andFankuizhutiIn(List<String> values) {
            addCriterion("FANKUIZHUTI in", values, "fankuizhuti");
            return (Criteria) this;
        }

        public Criteria andFankuizhutiNotIn(List<String> values) {
            addCriterion("FANKUIZHUTI not in", values, "fankuizhuti");
            return (Criteria) this;
        }

        public Criteria andFankuizhutiBetween(String value1, String value2) {
            addCriterion("FANKUIZHUTI between", value1, value2, "fankuizhuti");
            return (Criteria) this;
        }

        public Criteria andFankuizhutiNotBetween(String value1, String value2) {
            addCriterion("FANKUIZHUTI not between", value1, value2, "fankuizhuti");
            return (Criteria) this;
        }

        public Criteria andFankuimiaoshuIsNull() {
            addCriterion("FANKUIMIAOSHU is null");
            return (Criteria) this;
        }

        public Criteria andFankuimiaoshuIsNotNull() {
            addCriterion("FANKUIMIAOSHU is not null");
            return (Criteria) this;
        }

        public Criteria andFankuimiaoshuEqualTo(String value) {
            addCriterion("FANKUIMIAOSHU =", value, "fankuimiaoshu");
            return (Criteria) this;
        }

        public Criteria andFankuimiaoshuNotEqualTo(String value) {
            addCriterion("FANKUIMIAOSHU <>", value, "fankuimiaoshu");
            return (Criteria) this;
        }

        public Criteria andFankuimiaoshuGreaterThan(String value) {
            addCriterion("FANKUIMIAOSHU >", value, "fankuimiaoshu");
            return (Criteria) this;
        }

        public Criteria andFankuimiaoshuGreaterThanOrEqualTo(String value) {
            addCriterion("FANKUIMIAOSHU >=", value, "fankuimiaoshu");
            return (Criteria) this;
        }

        public Criteria andFankuimiaoshuLessThan(String value) {
            addCriterion("FANKUIMIAOSHU <", value, "fankuimiaoshu");
            return (Criteria) this;
        }

        public Criteria andFankuimiaoshuLessThanOrEqualTo(String value) {
            addCriterion("FANKUIMIAOSHU <=", value, "fankuimiaoshu");
            return (Criteria) this;
        }

        public Criteria andFankuimiaoshuLike(String value) {
            addCriterion("FANKUIMIAOSHU like", value, "fankuimiaoshu");
            return (Criteria) this;
        }

        public Criteria andFankuimiaoshuNotLike(String value) {
            addCriterion("FANKUIMIAOSHU not like", value, "fankuimiaoshu");
            return (Criteria) this;
        }

        public Criteria andFankuimiaoshuIn(List<String> values) {
            addCriterion("FANKUIMIAOSHU in", values, "fankuimiaoshu");
            return (Criteria) this;
        }

        public Criteria andFankuimiaoshuNotIn(List<String> values) {
            addCriterion("FANKUIMIAOSHU not in", values, "fankuimiaoshu");
            return (Criteria) this;
        }

        public Criteria andFankuimiaoshuBetween(String value1, String value2) {
            addCriterion("FANKUIMIAOSHU between", value1, value2, "fankuimiaoshu");
            return (Criteria) this;
        }

        public Criteria andFankuimiaoshuNotBetween(String value1, String value2) {
            addCriterion("FANKUIMIAOSHU not between", value1, value2, "fankuimiaoshu");
            return (Criteria) this;
        }

        public Criteria andFenxiIsNull() {
            addCriterion("FENXI is null");
            return (Criteria) this;
        }

        public Criteria andFenxiIsNotNull() {
            addCriterion("FENXI is not null");
            return (Criteria) this;
        }

        public Criteria andFenxiEqualTo(String value) {
            addCriterion("FENXI =", value, "fenxi");
            return (Criteria) this;
        }

        public Criteria andFenxiNotEqualTo(String value) {
            addCriterion("FENXI <>", value, "fenxi");
            return (Criteria) this;
        }

        public Criteria andFenxiGreaterThan(String value) {
            addCriterion("FENXI >", value, "fenxi");
            return (Criteria) this;
        }

        public Criteria andFenxiGreaterThanOrEqualTo(String value) {
            addCriterion("FENXI >=", value, "fenxi");
            return (Criteria) this;
        }

        public Criteria andFenxiLessThan(String value) {
            addCriterion("FENXI <", value, "fenxi");
            return (Criteria) this;
        }

        public Criteria andFenxiLessThanOrEqualTo(String value) {
            addCriterion("FENXI <=", value, "fenxi");
            return (Criteria) this;
        }

        public Criteria andFenxiLike(String value) {
            addCriterion("FENXI like", value, "fenxi");
            return (Criteria) this;
        }

        public Criteria andFenxiNotLike(String value) {
            addCriterion("FENXI not like", value, "fenxi");
            return (Criteria) this;
        }

        public Criteria andFenxiIn(List<String> values) {
            addCriterion("FENXI in", values, "fenxi");
            return (Criteria) this;
        }

        public Criteria andFenxiNotIn(List<String> values) {
            addCriterion("FENXI not in", values, "fenxi");
            return (Criteria) this;
        }

        public Criteria andFenxiBetween(String value1, String value2) {
            addCriterion("FENXI between", value1, value2, "fenxi");
            return (Criteria) this;
        }

        public Criteria andFenxiNotBetween(String value1, String value2) {
            addCriterion("FENXI not between", value1, value2, "fenxi");
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