package com.sc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XIAOSHOU_KEHUXINXIExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XIAOSHOU_KEHUXINXIExample() {
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

        public Criteria andKnameIsNull() {
            addCriterion("KNAME is null");
            return (Criteria) this;
        }

        public Criteria andKnameIsNotNull() {
            addCriterion("KNAME is not null");
            return (Criteria) this;
        }

        public Criteria andKnameEqualTo(String value) {
            addCriterion("KNAME =", value, "kname");
            return (Criteria) this;
        }

        public Criteria andKnameNotEqualTo(String value) {
            addCriterion("KNAME <>", value, "kname");
            return (Criteria) this;
        }

        public Criteria andKnameGreaterThan(String value) {
            addCriterion("KNAME >", value, "kname");
            return (Criteria) this;
        }

        public Criteria andKnameGreaterThanOrEqualTo(String value) {
            addCriterion("KNAME >=", value, "kname");
            return (Criteria) this;
        }

        public Criteria andKnameLessThan(String value) {
            addCriterion("KNAME <", value, "kname");
            return (Criteria) this;
        }

        public Criteria andKnameLessThanOrEqualTo(String value) {
            addCriterion("KNAME <=", value, "kname");
            return (Criteria) this;
        }

        public Criteria andKnameLike(String value) {
            addCriterion("KNAME like", value, "kname");
            return (Criteria) this;
        }

        public Criteria andKnameNotLike(String value) {
            addCriterion("KNAME not like", value, "kname");
            return (Criteria) this;
        }

        public Criteria andKnameIn(List<String> values) {
            addCriterion("KNAME in", values, "kname");
            return (Criteria) this;
        }

        public Criteria andKnameNotIn(List<String> values) {
            addCriterion("KNAME not in", values, "kname");
            return (Criteria) this;
        }

        public Criteria andKnameBetween(String value1, String value2) {
            addCriterion("KNAME between", value1, value2, "kname");
            return (Criteria) this;
        }

        public Criteria andKnameNotBetween(String value1, String value2) {
            addCriterion("KNAME not between", value1, value2, "kname");
            return (Criteria) this;
        }

        public Criteria andKshuxinIsNull() {
            addCriterion("KSHUXIN is null");
            return (Criteria) this;
        }

        public Criteria andKshuxinIsNotNull() {
            addCriterion("KSHUXIN is not null");
            return (Criteria) this;
        }

        public Criteria andKshuxinEqualTo(String value) {
            addCriterion("KSHUXIN =", value, "kshuxin");
            return (Criteria) this;
        }

        public Criteria andKshuxinNotEqualTo(String value) {
            addCriterion("KSHUXIN <>", value, "kshuxin");
            return (Criteria) this;
        }

        public Criteria andKshuxinGreaterThan(String value) {
            addCriterion("KSHUXIN >", value, "kshuxin");
            return (Criteria) this;
        }

        public Criteria andKshuxinGreaterThanOrEqualTo(String value) {
            addCriterion("KSHUXIN >=", value, "kshuxin");
            return (Criteria) this;
        }

        public Criteria andKshuxinLessThan(String value) {
            addCriterion("KSHUXIN <", value, "kshuxin");
            return (Criteria) this;
        }

        public Criteria andKshuxinLessThanOrEqualTo(String value) {
            addCriterion("KSHUXIN <=", value, "kshuxin");
            return (Criteria) this;
        }

        public Criteria andKshuxinLike(String value) {
            addCriterion("KSHUXIN like", value, "kshuxin");
            return (Criteria) this;
        }

        public Criteria andKshuxinNotLike(String value) {
            addCriterion("KSHUXIN not like", value, "kshuxin");
            return (Criteria) this;
        }

        public Criteria andKshuxinIn(List<String> values) {
            addCriterion("KSHUXIN in", values, "kshuxin");
            return (Criteria) this;
        }

        public Criteria andKshuxinNotIn(List<String> values) {
            addCriterion("KSHUXIN not in", values, "kshuxin");
            return (Criteria) this;
        }

        public Criteria andKshuxinBetween(String value1, String value2) {
            addCriterion("KSHUXIN between", value1, value2, "kshuxin");
            return (Criteria) this;
        }

        public Criteria andKshuxinNotBetween(String value1, String value2) {
            addCriterion("KSHUXIN not between", value1, value2, "kshuxin");
            return (Criteria) this;
        }

        public Criteria andWangzhanIsNull() {
            addCriterion("WANGZHAN is null");
            return (Criteria) this;
        }

        public Criteria andWangzhanIsNotNull() {
            addCriterion("WANGZHAN is not null");
            return (Criteria) this;
        }

        public Criteria andWangzhanEqualTo(String value) {
            addCriterion("WANGZHAN =", value, "wangzhan");
            return (Criteria) this;
        }

        public Criteria andWangzhanNotEqualTo(String value) {
            addCriterion("WANGZHAN <>", value, "wangzhan");
            return (Criteria) this;
        }

        public Criteria andWangzhanGreaterThan(String value) {
            addCriterion("WANGZHAN >", value, "wangzhan");
            return (Criteria) this;
        }

        public Criteria andWangzhanGreaterThanOrEqualTo(String value) {
            addCriterion("WANGZHAN >=", value, "wangzhan");
            return (Criteria) this;
        }

        public Criteria andWangzhanLessThan(String value) {
            addCriterion("WANGZHAN <", value, "wangzhan");
            return (Criteria) this;
        }

        public Criteria andWangzhanLessThanOrEqualTo(String value) {
            addCriterion("WANGZHAN <=", value, "wangzhan");
            return (Criteria) this;
        }

        public Criteria andWangzhanLike(String value) {
            addCriterion("WANGZHAN like", value, "wangzhan");
            return (Criteria) this;
        }

        public Criteria andWangzhanNotLike(String value) {
            addCriterion("WANGZHAN not like", value, "wangzhan");
            return (Criteria) this;
        }

        public Criteria andWangzhanIn(List<String> values) {
            addCriterion("WANGZHAN in", values, "wangzhan");
            return (Criteria) this;
        }

        public Criteria andWangzhanNotIn(List<String> values) {
            addCriterion("WANGZHAN not in", values, "wangzhan");
            return (Criteria) this;
        }

        public Criteria andWangzhanBetween(String value1, String value2) {
            addCriterion("WANGZHAN between", value1, value2, "wangzhan");
            return (Criteria) this;
        }

        public Criteria andWangzhanNotBetween(String value1, String value2) {
            addCriterion("WANGZHAN not between", value1, value2, "wangzhan");
            return (Criteria) this;
        }

        public Criteria andGupiaodaimaIsNull() {
            addCriterion("GUPIAODAIMA is null");
            return (Criteria) this;
        }

        public Criteria andGupiaodaimaIsNotNull() {
            addCriterion("GUPIAODAIMA is not null");
            return (Criteria) this;
        }

        public Criteria andGupiaodaimaEqualTo(String value) {
            addCriterion("GUPIAODAIMA =", value, "gupiaodaima");
            return (Criteria) this;
        }

        public Criteria andGupiaodaimaNotEqualTo(String value) {
            addCriterion("GUPIAODAIMA <>", value, "gupiaodaima");
            return (Criteria) this;
        }

        public Criteria andGupiaodaimaGreaterThan(String value) {
            addCriterion("GUPIAODAIMA >", value, "gupiaodaima");
            return (Criteria) this;
        }

        public Criteria andGupiaodaimaGreaterThanOrEqualTo(String value) {
            addCriterion("GUPIAODAIMA >=", value, "gupiaodaima");
            return (Criteria) this;
        }

        public Criteria andGupiaodaimaLessThan(String value) {
            addCriterion("GUPIAODAIMA <", value, "gupiaodaima");
            return (Criteria) this;
        }

        public Criteria andGupiaodaimaLessThanOrEqualTo(String value) {
            addCriterion("GUPIAODAIMA <=", value, "gupiaodaima");
            return (Criteria) this;
        }

        public Criteria andGupiaodaimaLike(String value) {
            addCriterion("GUPIAODAIMA like", value, "gupiaodaima");
            return (Criteria) this;
        }

        public Criteria andGupiaodaimaNotLike(String value) {
            addCriterion("GUPIAODAIMA not like", value, "gupiaodaima");
            return (Criteria) this;
        }

        public Criteria andGupiaodaimaIn(List<String> values) {
            addCriterion("GUPIAODAIMA in", values, "gupiaodaima");
            return (Criteria) this;
        }

        public Criteria andGupiaodaimaNotIn(List<String> values) {
            addCriterion("GUPIAODAIMA not in", values, "gupiaodaima");
            return (Criteria) this;
        }

        public Criteria andGupiaodaimaBetween(String value1, String value2) {
            addCriterion("GUPIAODAIMA between", value1, value2, "gupiaodaima");
            return (Criteria) this;
        }

        public Criteria andGupiaodaimaNotBetween(String value1, String value2) {
            addCriterion("GUPIAODAIMA not between", value1, value2, "gupiaodaima");
            return (Criteria) this;
        }

        public Criteria andShangjidanweiIsNull() {
            addCriterion("SHANGJIDANWEI is null");
            return (Criteria) this;
        }

        public Criteria andShangjidanweiIsNotNull() {
            addCriterion("SHANGJIDANWEI is not null");
            return (Criteria) this;
        }

        public Criteria andShangjidanweiEqualTo(String value) {
            addCriterion("SHANGJIDANWEI =", value, "shangjidanwei");
            return (Criteria) this;
        }

        public Criteria andShangjidanweiNotEqualTo(String value) {
            addCriterion("SHANGJIDANWEI <>", value, "shangjidanwei");
            return (Criteria) this;
        }

        public Criteria andShangjidanweiGreaterThan(String value) {
            addCriterion("SHANGJIDANWEI >", value, "shangjidanwei");
            return (Criteria) this;
        }

        public Criteria andShangjidanweiGreaterThanOrEqualTo(String value) {
            addCriterion("SHANGJIDANWEI >=", value, "shangjidanwei");
            return (Criteria) this;
        }

        public Criteria andShangjidanweiLessThan(String value) {
            addCriterion("SHANGJIDANWEI <", value, "shangjidanwei");
            return (Criteria) this;
        }

        public Criteria andShangjidanweiLessThanOrEqualTo(String value) {
            addCriterion("SHANGJIDANWEI <=", value, "shangjidanwei");
            return (Criteria) this;
        }

        public Criteria andShangjidanweiLike(String value) {
            addCriterion("SHANGJIDANWEI like", value, "shangjidanwei");
            return (Criteria) this;
        }

        public Criteria andShangjidanweiNotLike(String value) {
            addCriterion("SHANGJIDANWEI not like", value, "shangjidanwei");
            return (Criteria) this;
        }

        public Criteria andShangjidanweiIn(List<String> values) {
            addCriterion("SHANGJIDANWEI in", values, "shangjidanwei");
            return (Criteria) this;
        }

        public Criteria andShangjidanweiNotIn(List<String> values) {
            addCriterion("SHANGJIDANWEI not in", values, "shangjidanwei");
            return (Criteria) this;
        }

        public Criteria andShangjidanweiBetween(String value1, String value2) {
            addCriterion("SHANGJIDANWEI between", value1, value2, "shangjidanwei");
            return (Criteria) this;
        }

        public Criteria andShangjidanweiNotBetween(String value1, String value2) {
            addCriterion("SHANGJIDANWEI not between", value1, value2, "shangjidanwei");
            return (Criteria) this;
        }

        public Criteria andSuoyouzheIsNull() {
            addCriterion("SUOYOUZHE is null");
            return (Criteria) this;
        }

        public Criteria andSuoyouzheIsNotNull() {
            addCriterion("SUOYOUZHE is not null");
            return (Criteria) this;
        }

        public Criteria andSuoyouzheEqualTo(String value) {
            addCriterion("SUOYOUZHE =", value, "suoyouzhe");
            return (Criteria) this;
        }

        public Criteria andSuoyouzheNotEqualTo(String value) {
            addCriterion("SUOYOUZHE <>", value, "suoyouzhe");
            return (Criteria) this;
        }

        public Criteria andSuoyouzheGreaterThan(String value) {
            addCriterion("SUOYOUZHE >", value, "suoyouzhe");
            return (Criteria) this;
        }

        public Criteria andSuoyouzheGreaterThanOrEqualTo(String value) {
            addCriterion("SUOYOUZHE >=", value, "suoyouzhe");
            return (Criteria) this;
        }

        public Criteria andSuoyouzheLessThan(String value) {
            addCriterion("SUOYOUZHE <", value, "suoyouzhe");
            return (Criteria) this;
        }

        public Criteria andSuoyouzheLessThanOrEqualTo(String value) {
            addCriterion("SUOYOUZHE <=", value, "suoyouzhe");
            return (Criteria) this;
        }

        public Criteria andSuoyouzheLike(String value) {
            addCriterion("SUOYOUZHE like", value, "suoyouzhe");
            return (Criteria) this;
        }

        public Criteria andSuoyouzheNotLike(String value) {
            addCriterion("SUOYOUZHE not like", value, "suoyouzhe");
            return (Criteria) this;
        }

        public Criteria andSuoyouzheIn(List<String> values) {
            addCriterion("SUOYOUZHE in", values, "suoyouzhe");
            return (Criteria) this;
        }

        public Criteria andSuoyouzheNotIn(List<String> values) {
            addCriterion("SUOYOUZHE not in", values, "suoyouzhe");
            return (Criteria) this;
        }

        public Criteria andSuoyouzheBetween(String value1, String value2) {
            addCriterion("SUOYOUZHE between", value1, value2, "suoyouzhe");
            return (Criteria) this;
        }

        public Criteria andSuoyouzheNotBetween(String value1, String value2) {
            addCriterion("SUOYOUZHE not between", value1, value2, "suoyouzhe");
            return (Criteria) this;
        }

        public Criteria andYuangongshuIsNull() {
            addCriterion("YUANGONGSHU is null");
            return (Criteria) this;
        }

        public Criteria andYuangongshuIsNotNull() {
            addCriterion("YUANGONGSHU is not null");
            return (Criteria) this;
        }

        public Criteria andYuangongshuEqualTo(String value) {
            addCriterion("YUANGONGSHU =", value, "yuangongshu");
            return (Criteria) this;
        }

        public Criteria andYuangongshuNotEqualTo(String value) {
            addCriterion("YUANGONGSHU <>", value, "yuangongshu");
            return (Criteria) this;
        }

        public Criteria andYuangongshuGreaterThan(String value) {
            addCriterion("YUANGONGSHU >", value, "yuangongshu");
            return (Criteria) this;
        }

        public Criteria andYuangongshuGreaterThanOrEqualTo(String value) {
            addCriterion("YUANGONGSHU >=", value, "yuangongshu");
            return (Criteria) this;
        }

        public Criteria andYuangongshuLessThan(String value) {
            addCriterion("YUANGONGSHU <", value, "yuangongshu");
            return (Criteria) this;
        }

        public Criteria andYuangongshuLessThanOrEqualTo(String value) {
            addCriterion("YUANGONGSHU <=", value, "yuangongshu");
            return (Criteria) this;
        }

        public Criteria andYuangongshuLike(String value) {
            addCriterion("YUANGONGSHU like", value, "yuangongshu");
            return (Criteria) this;
        }

        public Criteria andYuangongshuNotLike(String value) {
            addCriterion("YUANGONGSHU not like", value, "yuangongshu");
            return (Criteria) this;
        }

        public Criteria andYuangongshuIn(List<String> values) {
            addCriterion("YUANGONGSHU in", values, "yuangongshu");
            return (Criteria) this;
        }

        public Criteria andYuangongshuNotIn(List<String> values) {
            addCriterion("YUANGONGSHU not in", values, "yuangongshu");
            return (Criteria) this;
        }

        public Criteria andYuangongshuBetween(String value1, String value2) {
            addCriterion("YUANGONGSHU between", value1, value2, "yuangongshu");
            return (Criteria) this;
        }

        public Criteria andYuangongshuNotBetween(String value1, String value2) {
            addCriterion("YUANGONGSHU not between", value1, value2, "yuangongshu");
            return (Criteria) this;
        }

        public Criteria andHangyebianhaoIsNull() {
            addCriterion("HANGYEBIANHAO is null");
            return (Criteria) this;
        }

        public Criteria andHangyebianhaoIsNotNull() {
            addCriterion("HANGYEBIANHAO is not null");
            return (Criteria) this;
        }

        public Criteria andHangyebianhaoEqualTo(String value) {
            addCriterion("HANGYEBIANHAO =", value, "hangyebianhao");
            return (Criteria) this;
        }

        public Criteria andHangyebianhaoNotEqualTo(String value) {
            addCriterion("HANGYEBIANHAO <>", value, "hangyebianhao");
            return (Criteria) this;
        }

        public Criteria andHangyebianhaoGreaterThan(String value) {
            addCriterion("HANGYEBIANHAO >", value, "hangyebianhao");
            return (Criteria) this;
        }

        public Criteria andHangyebianhaoGreaterThanOrEqualTo(String value) {
            addCriterion("HANGYEBIANHAO >=", value, "hangyebianhao");
            return (Criteria) this;
        }

        public Criteria andHangyebianhaoLessThan(String value) {
            addCriterion("HANGYEBIANHAO <", value, "hangyebianhao");
            return (Criteria) this;
        }

        public Criteria andHangyebianhaoLessThanOrEqualTo(String value) {
            addCriterion("HANGYEBIANHAO <=", value, "hangyebianhao");
            return (Criteria) this;
        }

        public Criteria andHangyebianhaoLike(String value) {
            addCriterion("HANGYEBIANHAO like", value, "hangyebianhao");
            return (Criteria) this;
        }

        public Criteria andHangyebianhaoNotLike(String value) {
            addCriterion("HANGYEBIANHAO not like", value, "hangyebianhao");
            return (Criteria) this;
        }

        public Criteria andHangyebianhaoIn(List<String> values) {
            addCriterion("HANGYEBIANHAO in", values, "hangyebianhao");
            return (Criteria) this;
        }

        public Criteria andHangyebianhaoNotIn(List<String> values) {
            addCriterion("HANGYEBIANHAO not in", values, "hangyebianhao");
            return (Criteria) this;
        }

        public Criteria andHangyebianhaoBetween(String value1, String value2) {
            addCriterion("HANGYEBIANHAO between", value1, value2, "hangyebianhao");
            return (Criteria) this;
        }

        public Criteria andHangyebianhaoNotBetween(String value1, String value2) {
            addCriterion("HANGYEBIANHAO not between", value1, value2, "hangyebianhao");
            return (Criteria) this;
        }

        public Criteria andKehuleixingIsNull() {
            addCriterion("KEHULEIXING is null");
            return (Criteria) this;
        }

        public Criteria andKehuleixingIsNotNull() {
            addCriterion("KEHULEIXING is not null");
            return (Criteria) this;
        }

        public Criteria andKehuleixingEqualTo(String value) {
            addCriterion("KEHULEIXING =", value, "kehuleixing");
            return (Criteria) this;
        }

        public Criteria andKehuleixingNotEqualTo(String value) {
            addCriterion("KEHULEIXING <>", value, "kehuleixing");
            return (Criteria) this;
        }

        public Criteria andKehuleixingGreaterThan(String value) {
            addCriterion("KEHULEIXING >", value, "kehuleixing");
            return (Criteria) this;
        }

        public Criteria andKehuleixingGreaterThanOrEqualTo(String value) {
            addCriterion("KEHULEIXING >=", value, "kehuleixing");
            return (Criteria) this;
        }

        public Criteria andKehuleixingLessThan(String value) {
            addCriterion("KEHULEIXING <", value, "kehuleixing");
            return (Criteria) this;
        }

        public Criteria andKehuleixingLessThanOrEqualTo(String value) {
            addCriterion("KEHULEIXING <=", value, "kehuleixing");
            return (Criteria) this;
        }

        public Criteria andKehuleixingLike(String value) {
            addCriterion("KEHULEIXING like", value, "kehuleixing");
            return (Criteria) this;
        }

        public Criteria andKehuleixingNotLike(String value) {
            addCriterion("KEHULEIXING not like", value, "kehuleixing");
            return (Criteria) this;
        }

        public Criteria andKehuleixingIn(List<String> values) {
            addCriterion("KEHULEIXING in", values, "kehuleixing");
            return (Criteria) this;
        }

        public Criteria andKehuleixingNotIn(List<String> values) {
            addCriterion("KEHULEIXING not in", values, "kehuleixing");
            return (Criteria) this;
        }

        public Criteria andKehuleixingBetween(String value1, String value2) {
            addCriterion("KEHULEIXING between", value1, value2, "kehuleixing");
            return (Criteria) this;
        }

        public Criteria andKehuleixingNotBetween(String value1, String value2) {
            addCriterion("KEHULEIXING not between", value1, value2, "kehuleixing");
            return (Criteria) this;
        }

        public Criteria andKehuzhuangtaiIsNull() {
            addCriterion("KEHUZHUANGTAI is null");
            return (Criteria) this;
        }

        public Criteria andKehuzhuangtaiIsNotNull() {
            addCriterion("KEHUZHUANGTAI is not null");
            return (Criteria) this;
        }

        public Criteria andKehuzhuangtaiEqualTo(String value) {
            addCriterion("KEHUZHUANGTAI =", value, "kehuzhuangtai");
            return (Criteria) this;
        }

        public Criteria andKehuzhuangtaiNotEqualTo(String value) {
            addCriterion("KEHUZHUANGTAI <>", value, "kehuzhuangtai");
            return (Criteria) this;
        }

        public Criteria andKehuzhuangtaiGreaterThan(String value) {
            addCriterion("KEHUZHUANGTAI >", value, "kehuzhuangtai");
            return (Criteria) this;
        }

        public Criteria andKehuzhuangtaiGreaterThanOrEqualTo(String value) {
            addCriterion("KEHUZHUANGTAI >=", value, "kehuzhuangtai");
            return (Criteria) this;
        }

        public Criteria andKehuzhuangtaiLessThan(String value) {
            addCriterion("KEHUZHUANGTAI <", value, "kehuzhuangtai");
            return (Criteria) this;
        }

        public Criteria andKehuzhuangtaiLessThanOrEqualTo(String value) {
            addCriterion("KEHUZHUANGTAI <=", value, "kehuzhuangtai");
            return (Criteria) this;
        }

        public Criteria andKehuzhuangtaiLike(String value) {
            addCriterion("KEHUZHUANGTAI like", value, "kehuzhuangtai");
            return (Criteria) this;
        }

        public Criteria andKehuzhuangtaiNotLike(String value) {
            addCriterion("KEHUZHUANGTAI not like", value, "kehuzhuangtai");
            return (Criteria) this;
        }

        public Criteria andKehuzhuangtaiIn(List<String> values) {
            addCriterion("KEHUZHUANGTAI in", values, "kehuzhuangtai");
            return (Criteria) this;
        }

        public Criteria andKehuzhuangtaiNotIn(List<String> values) {
            addCriterion("KEHUZHUANGTAI not in", values, "kehuzhuangtai");
            return (Criteria) this;
        }

        public Criteria andKehuzhuangtaiBetween(String value1, String value2) {
            addCriterion("KEHUZHUANGTAI between", value1, value2, "kehuzhuangtai");
            return (Criteria) this;
        }

        public Criteria andKehuzhuangtaiNotBetween(String value1, String value2) {
            addCriterion("KEHUZHUANGTAI not between", value1, value2, "kehuzhuangtai");
            return (Criteria) this;
        }

        public Criteria andKehulaiyuanIsNull() {
            addCriterion("KEHULAIYUAN is null");
            return (Criteria) this;
        }

        public Criteria andKehulaiyuanIsNotNull() {
            addCriterion("KEHULAIYUAN is not null");
            return (Criteria) this;
        }

        public Criteria andKehulaiyuanEqualTo(String value) {
            addCriterion("KEHULAIYUAN =", value, "kehulaiyuan");
            return (Criteria) this;
        }

        public Criteria andKehulaiyuanNotEqualTo(String value) {
            addCriterion("KEHULAIYUAN <>", value, "kehulaiyuan");
            return (Criteria) this;
        }

        public Criteria andKehulaiyuanGreaterThan(String value) {
            addCriterion("KEHULAIYUAN >", value, "kehulaiyuan");
            return (Criteria) this;
        }

        public Criteria andKehulaiyuanGreaterThanOrEqualTo(String value) {
            addCriterion("KEHULAIYUAN >=", value, "kehulaiyuan");
            return (Criteria) this;
        }

        public Criteria andKehulaiyuanLessThan(String value) {
            addCriterion("KEHULAIYUAN <", value, "kehulaiyuan");
            return (Criteria) this;
        }

        public Criteria andKehulaiyuanLessThanOrEqualTo(String value) {
            addCriterion("KEHULAIYUAN <=", value, "kehulaiyuan");
            return (Criteria) this;
        }

        public Criteria andKehulaiyuanLike(String value) {
            addCriterion("KEHULAIYUAN like", value, "kehulaiyuan");
            return (Criteria) this;
        }

        public Criteria andKehulaiyuanNotLike(String value) {
            addCriterion("KEHULAIYUAN not like", value, "kehulaiyuan");
            return (Criteria) this;
        }

        public Criteria andKehulaiyuanIn(List<String> values) {
            addCriterion("KEHULAIYUAN in", values, "kehulaiyuan");
            return (Criteria) this;
        }

        public Criteria andKehulaiyuanNotIn(List<String> values) {
            addCriterion("KEHULAIYUAN not in", values, "kehulaiyuan");
            return (Criteria) this;
        }

        public Criteria andKehulaiyuanBetween(String value1, String value2) {
            addCriterion("KEHULAIYUAN between", value1, value2, "kehulaiyuan");
            return (Criteria) this;
        }

        public Criteria andKehulaiyuanNotBetween(String value1, String value2) {
            addCriterion("KEHULAIYUAN not between", value1, value2, "kehulaiyuan");
            return (Criteria) this;
        }

        public Criteria andFuzerenbianhaoIsNull() {
            addCriterion("FUZERENBIANHAO is null");
            return (Criteria) this;
        }

        public Criteria andFuzerenbianhaoIsNotNull() {
            addCriterion("FUZERENBIANHAO is not null");
            return (Criteria) this;
        }

        public Criteria andFuzerenbianhaoEqualTo(String value) {
            addCriterion("FUZERENBIANHAO =", value, "fuzerenbianhao");
            return (Criteria) this;
        }

        public Criteria andFuzerenbianhaoNotEqualTo(String value) {
            addCriterion("FUZERENBIANHAO <>", value, "fuzerenbianhao");
            return (Criteria) this;
        }

        public Criteria andFuzerenbianhaoGreaterThan(String value) {
            addCriterion("FUZERENBIANHAO >", value, "fuzerenbianhao");
            return (Criteria) this;
        }

        public Criteria andFuzerenbianhaoGreaterThanOrEqualTo(String value) {
            addCriterion("FUZERENBIANHAO >=", value, "fuzerenbianhao");
            return (Criteria) this;
        }

        public Criteria andFuzerenbianhaoLessThan(String value) {
            addCriterion("FUZERENBIANHAO <", value, "fuzerenbianhao");
            return (Criteria) this;
        }

        public Criteria andFuzerenbianhaoLessThanOrEqualTo(String value) {
            addCriterion("FUZERENBIANHAO <=", value, "fuzerenbianhao");
            return (Criteria) this;
        }

        public Criteria andFuzerenbianhaoLike(String value) {
            addCriterion("FUZERENBIANHAO like", value, "fuzerenbianhao");
            return (Criteria) this;
        }

        public Criteria andFuzerenbianhaoNotLike(String value) {
            addCriterion("FUZERENBIANHAO not like", value, "fuzerenbianhao");
            return (Criteria) this;
        }

        public Criteria andFuzerenbianhaoIn(List<String> values) {
            addCriterion("FUZERENBIANHAO in", values, "fuzerenbianhao");
            return (Criteria) this;
        }

        public Criteria andFuzerenbianhaoNotIn(List<String> values) {
            addCriterion("FUZERENBIANHAO not in", values, "fuzerenbianhao");
            return (Criteria) this;
        }

        public Criteria andFuzerenbianhaoBetween(String value1, String value2) {
            addCriterion("FUZERENBIANHAO between", value1, value2, "fuzerenbianhao");
            return (Criteria) this;
        }

        public Criteria andFuzerenbianhaoNotBetween(String value1, String value2) {
            addCriterion("FUZERENBIANHAO not between", value1, value2, "fuzerenbianhao");
            return (Criteria) this;
        }

        public Criteria andGudingdianhuaIsNull() {
            addCriterion("GUDINGDIANHUA is null");
            return (Criteria) this;
        }

        public Criteria andGudingdianhuaIsNotNull() {
            addCriterion("GUDINGDIANHUA is not null");
            return (Criteria) this;
        }

        public Criteria andGudingdianhuaEqualTo(String value) {
            addCriterion("GUDINGDIANHUA =", value, "gudingdianhua");
            return (Criteria) this;
        }

        public Criteria andGudingdianhuaNotEqualTo(String value) {
            addCriterion("GUDINGDIANHUA <>", value, "gudingdianhua");
            return (Criteria) this;
        }

        public Criteria andGudingdianhuaGreaterThan(String value) {
            addCriterion("GUDINGDIANHUA >", value, "gudingdianhua");
            return (Criteria) this;
        }

        public Criteria andGudingdianhuaGreaterThanOrEqualTo(String value) {
            addCriterion("GUDINGDIANHUA >=", value, "gudingdianhua");
            return (Criteria) this;
        }

        public Criteria andGudingdianhuaLessThan(String value) {
            addCriterion("GUDINGDIANHUA <", value, "gudingdianhua");
            return (Criteria) this;
        }

        public Criteria andGudingdianhuaLessThanOrEqualTo(String value) {
            addCriterion("GUDINGDIANHUA <=", value, "gudingdianhua");
            return (Criteria) this;
        }

        public Criteria andGudingdianhuaLike(String value) {
            addCriterion("GUDINGDIANHUA like", value, "gudingdianhua");
            return (Criteria) this;
        }

        public Criteria andGudingdianhuaNotLike(String value) {
            addCriterion("GUDINGDIANHUA not like", value, "gudingdianhua");
            return (Criteria) this;
        }

        public Criteria andGudingdianhuaIn(List<String> values) {
            addCriterion("GUDINGDIANHUA in", values, "gudingdianhua");
            return (Criteria) this;
        }

        public Criteria andGudingdianhuaNotIn(List<String> values) {
            addCriterion("GUDINGDIANHUA not in", values, "gudingdianhua");
            return (Criteria) this;
        }

        public Criteria andGudingdianhuaBetween(String value1, String value2) {
            addCriterion("GUDINGDIANHUA between", value1, value2, "gudingdianhua");
            return (Criteria) this;
        }

        public Criteria andGudingdianhuaNotBetween(String value1, String value2) {
            addCriterion("GUDINGDIANHUA not between", value1, value2, "gudingdianhua");
            return (Criteria) this;
        }

        public Criteria andYidongdianhuaIsNull() {
            addCriterion("YIDONGDIANHUA is null");
            return (Criteria) this;
        }

        public Criteria andYidongdianhuaIsNotNull() {
            addCriterion("YIDONGDIANHUA is not null");
            return (Criteria) this;
        }

        public Criteria andYidongdianhuaEqualTo(String value) {
            addCriterion("YIDONGDIANHUA =", value, "yidongdianhua");
            return (Criteria) this;
        }

        public Criteria andYidongdianhuaNotEqualTo(String value) {
            addCriterion("YIDONGDIANHUA <>", value, "yidongdianhua");
            return (Criteria) this;
        }

        public Criteria andYidongdianhuaGreaterThan(String value) {
            addCriterion("YIDONGDIANHUA >", value, "yidongdianhua");
            return (Criteria) this;
        }

        public Criteria andYidongdianhuaGreaterThanOrEqualTo(String value) {
            addCriterion("YIDONGDIANHUA >=", value, "yidongdianhua");
            return (Criteria) this;
        }

        public Criteria andYidongdianhuaLessThan(String value) {
            addCriterion("YIDONGDIANHUA <", value, "yidongdianhua");
            return (Criteria) this;
        }

        public Criteria andYidongdianhuaLessThanOrEqualTo(String value) {
            addCriterion("YIDONGDIANHUA <=", value, "yidongdianhua");
            return (Criteria) this;
        }

        public Criteria andYidongdianhuaLike(String value) {
            addCriterion("YIDONGDIANHUA like", value, "yidongdianhua");
            return (Criteria) this;
        }

        public Criteria andYidongdianhuaNotLike(String value) {
            addCriterion("YIDONGDIANHUA not like", value, "yidongdianhua");
            return (Criteria) this;
        }

        public Criteria andYidongdianhuaIn(List<String> values) {
            addCriterion("YIDONGDIANHUA in", values, "yidongdianhua");
            return (Criteria) this;
        }

        public Criteria andYidongdianhuaNotIn(List<String> values) {
            addCriterion("YIDONGDIANHUA not in", values, "yidongdianhua");
            return (Criteria) this;
        }

        public Criteria andYidongdianhuaBetween(String value1, String value2) {
            addCriterion("YIDONGDIANHUA between", value1, value2, "yidongdianhua");
            return (Criteria) this;
        }

        public Criteria andYidongdianhuaNotBetween(String value1, String value2) {
            addCriterion("YIDONGDIANHUA not between", value1, value2, "yidongdianhua");
            return (Criteria) this;
        }

        public Criteria andKehuchuangzhenIsNull() {
            addCriterion("KEHUCHUANGZHEN is null");
            return (Criteria) this;
        }

        public Criteria andKehuchuangzhenIsNotNull() {
            addCriterion("KEHUCHUANGZHEN is not null");
            return (Criteria) this;
        }

        public Criteria andKehuchuangzhenEqualTo(String value) {
            addCriterion("KEHUCHUANGZHEN =", value, "kehuchuangzhen");
            return (Criteria) this;
        }

        public Criteria andKehuchuangzhenNotEqualTo(String value) {
            addCriterion("KEHUCHUANGZHEN <>", value, "kehuchuangzhen");
            return (Criteria) this;
        }

        public Criteria andKehuchuangzhenGreaterThan(String value) {
            addCriterion("KEHUCHUANGZHEN >", value, "kehuchuangzhen");
            return (Criteria) this;
        }

        public Criteria andKehuchuangzhenGreaterThanOrEqualTo(String value) {
            addCriterion("KEHUCHUANGZHEN >=", value, "kehuchuangzhen");
            return (Criteria) this;
        }

        public Criteria andKehuchuangzhenLessThan(String value) {
            addCriterion("KEHUCHUANGZHEN <", value, "kehuchuangzhen");
            return (Criteria) this;
        }

        public Criteria andKehuchuangzhenLessThanOrEqualTo(String value) {
            addCriterion("KEHUCHUANGZHEN <=", value, "kehuchuangzhen");
            return (Criteria) this;
        }

        public Criteria andKehuchuangzhenLike(String value) {
            addCriterion("KEHUCHUANGZHEN like", value, "kehuchuangzhen");
            return (Criteria) this;
        }

        public Criteria andKehuchuangzhenNotLike(String value) {
            addCriterion("KEHUCHUANGZHEN not like", value, "kehuchuangzhen");
            return (Criteria) this;
        }

        public Criteria andKehuchuangzhenIn(List<String> values) {
            addCriterion("KEHUCHUANGZHEN in", values, "kehuchuangzhen");
            return (Criteria) this;
        }

        public Criteria andKehuchuangzhenNotIn(List<String> values) {
            addCriterion("KEHUCHUANGZHEN not in", values, "kehuchuangzhen");
            return (Criteria) this;
        }

        public Criteria andKehuchuangzhenBetween(String value1, String value2) {
            addCriterion("KEHUCHUANGZHEN between", value1, value2, "kehuchuangzhen");
            return (Criteria) this;
        }

        public Criteria andKehuchuangzhenNotBetween(String value1, String value2) {
            addCriterion("KEHUCHUANGZHEN not between", value1, value2, "kehuchuangzhen");
            return (Criteria) this;
        }

        public Criteria andKaihuyinhangIsNull() {
            addCriterion("KAIHUYINHANG is null");
            return (Criteria) this;
        }

        public Criteria andKaihuyinhangIsNotNull() {
            addCriterion("KAIHUYINHANG is not null");
            return (Criteria) this;
        }

        public Criteria andKaihuyinhangEqualTo(String value) {
            addCriterion("KAIHUYINHANG =", value, "kaihuyinhang");
            return (Criteria) this;
        }

        public Criteria andKaihuyinhangNotEqualTo(String value) {
            addCriterion("KAIHUYINHANG <>", value, "kaihuyinhang");
            return (Criteria) this;
        }

        public Criteria andKaihuyinhangGreaterThan(String value) {
            addCriterion("KAIHUYINHANG >", value, "kaihuyinhang");
            return (Criteria) this;
        }

        public Criteria andKaihuyinhangGreaterThanOrEqualTo(String value) {
            addCriterion("KAIHUYINHANG >=", value, "kaihuyinhang");
            return (Criteria) this;
        }

        public Criteria andKaihuyinhangLessThan(String value) {
            addCriterion("KAIHUYINHANG <", value, "kaihuyinhang");
            return (Criteria) this;
        }

        public Criteria andKaihuyinhangLessThanOrEqualTo(String value) {
            addCriterion("KAIHUYINHANG <=", value, "kaihuyinhang");
            return (Criteria) this;
        }

        public Criteria andKaihuyinhangLike(String value) {
            addCriterion("KAIHUYINHANG like", value, "kaihuyinhang");
            return (Criteria) this;
        }

        public Criteria andKaihuyinhangNotLike(String value) {
            addCriterion("KAIHUYINHANG not like", value, "kaihuyinhang");
            return (Criteria) this;
        }

        public Criteria andKaihuyinhangIn(List<String> values) {
            addCriterion("KAIHUYINHANG in", values, "kaihuyinhang");
            return (Criteria) this;
        }

        public Criteria andKaihuyinhangNotIn(List<String> values) {
            addCriterion("KAIHUYINHANG not in", values, "kaihuyinhang");
            return (Criteria) this;
        }

        public Criteria andKaihuyinhangBetween(String value1, String value2) {
            addCriterion("KAIHUYINHANG between", value1, value2, "kaihuyinhang");
            return (Criteria) this;
        }

        public Criteria andKaihuyinhangNotBetween(String value1, String value2) {
            addCriterion("KAIHUYINHANG not between", value1, value2, "kaihuyinhang");
            return (Criteria) this;
        }

        public Criteria andYinhangzhanghuIsNull() {
            addCriterion("YINHANGZHANGHU is null");
            return (Criteria) this;
        }

        public Criteria andYinhangzhanghuIsNotNull() {
            addCriterion("YINHANGZHANGHU is not null");
            return (Criteria) this;
        }

        public Criteria andYinhangzhanghuEqualTo(String value) {
            addCriterion("YINHANGZHANGHU =", value, "yinhangzhanghu");
            return (Criteria) this;
        }

        public Criteria andYinhangzhanghuNotEqualTo(String value) {
            addCriterion("YINHANGZHANGHU <>", value, "yinhangzhanghu");
            return (Criteria) this;
        }

        public Criteria andYinhangzhanghuGreaterThan(String value) {
            addCriterion("YINHANGZHANGHU >", value, "yinhangzhanghu");
            return (Criteria) this;
        }

        public Criteria andYinhangzhanghuGreaterThanOrEqualTo(String value) {
            addCriterion("YINHANGZHANGHU >=", value, "yinhangzhanghu");
            return (Criteria) this;
        }

        public Criteria andYinhangzhanghuLessThan(String value) {
            addCriterion("YINHANGZHANGHU <", value, "yinhangzhanghu");
            return (Criteria) this;
        }

        public Criteria andYinhangzhanghuLessThanOrEqualTo(String value) {
            addCriterion("YINHANGZHANGHU <=", value, "yinhangzhanghu");
            return (Criteria) this;
        }

        public Criteria andYinhangzhanghuLike(String value) {
            addCriterion("YINHANGZHANGHU like", value, "yinhangzhanghu");
            return (Criteria) this;
        }

        public Criteria andYinhangzhanghuNotLike(String value) {
            addCriterion("YINHANGZHANGHU not like", value, "yinhangzhanghu");
            return (Criteria) this;
        }

        public Criteria andYinhangzhanghuIn(List<String> values) {
            addCriterion("YINHANGZHANGHU in", values, "yinhangzhanghu");
            return (Criteria) this;
        }

        public Criteria andYinhangzhanghuNotIn(List<String> values) {
            addCriterion("YINHANGZHANGHU not in", values, "yinhangzhanghu");
            return (Criteria) this;
        }

        public Criteria andYinhangzhanghuBetween(String value1, String value2) {
            addCriterion("YINHANGZHANGHU between", value1, value2, "yinhangzhanghu");
            return (Criteria) this;
        }

        public Criteria andYinhangzhanghuNotBetween(String value1, String value2) {
            addCriterion("YINHANGZHANGHU not between", value1, value2, "yinhangzhanghu");
            return (Criteria) this;
        }

        public Criteria andXiacilianxishijianIsNull() {
            addCriterion("XIACILIANXISHIJIAN is null");
            return (Criteria) this;
        }

        public Criteria andXiacilianxishijianIsNotNull() {
            addCriterion("XIACILIANXISHIJIAN is not null");
            return (Criteria) this;
        }

        public Criteria andXiacilianxishijianEqualTo(String value) {
            addCriterion("XIACILIANXISHIJIAN =", value, "xiacilianxishijian");
            return (Criteria) this;
        }

        public Criteria andXiacilianxishijianNotEqualTo(String value) {
            addCriterion("XIACILIANXISHIJIAN <>", value, "xiacilianxishijian");
            return (Criteria) this;
        }

        public Criteria andXiacilianxishijianGreaterThan(String value) {
            addCriterion("XIACILIANXISHIJIAN >", value, "xiacilianxishijian");
            return (Criteria) this;
        }

        public Criteria andXiacilianxishijianGreaterThanOrEqualTo(String value) {
            addCriterion("XIACILIANXISHIJIAN >=", value, "xiacilianxishijian");
            return (Criteria) this;
        }

        public Criteria andXiacilianxishijianLessThan(String value) {
            addCriterion("XIACILIANXISHIJIAN <", value, "xiacilianxishijian");
            return (Criteria) this;
        }

        public Criteria andXiacilianxishijianLessThanOrEqualTo(String value) {
            addCriterion("XIACILIANXISHIJIAN <=", value, "xiacilianxishijian");
            return (Criteria) this;
        }

        public Criteria andXiacilianxishijianLike(String value) {
            addCriterion("XIACILIANXISHIJIAN like", value, "xiacilianxishijian");
            return (Criteria) this;
        }

        public Criteria andXiacilianxishijianNotLike(String value) {
            addCriterion("XIACILIANXISHIJIAN not like", value, "xiacilianxishijian");
            return (Criteria) this;
        }

        public Criteria andXiacilianxishijianIn(List<String> values) {
            addCriterion("XIACILIANXISHIJIAN in", values, "xiacilianxishijian");
            return (Criteria) this;
        }

        public Criteria andXiacilianxishijianNotIn(List<String> values) {
            addCriterion("XIACILIANXISHIJIAN not in", values, "xiacilianxishijian");
            return (Criteria) this;
        }

        public Criteria andXiacilianxishijianBetween(String value1, String value2) {
            addCriterion("XIACILIANXISHIJIAN between", value1, value2, "xiacilianxishijian");
            return (Criteria) this;
        }

        public Criteria andXiacilianxishijianNotBetween(String value1, String value2) {
            addCriterion("XIACILIANXISHIJIAN not between", value1, value2, "xiacilianxishijian");
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

        public Criteria andSicbianmaIsNull() {
            addCriterion("SICBIANMA is null");
            return (Criteria) this;
        }

        public Criteria andSicbianmaIsNotNull() {
            addCriterion("SICBIANMA is not null");
            return (Criteria) this;
        }

        public Criteria andSicbianmaEqualTo(String value) {
            addCriterion("SICBIANMA =", value, "sicbianma");
            return (Criteria) this;
        }

        public Criteria andSicbianmaNotEqualTo(String value) {
            addCriterion("SICBIANMA <>", value, "sicbianma");
            return (Criteria) this;
        }

        public Criteria andSicbianmaGreaterThan(String value) {
            addCriterion("SICBIANMA >", value, "sicbianma");
            return (Criteria) this;
        }

        public Criteria andSicbianmaGreaterThanOrEqualTo(String value) {
            addCriterion("SICBIANMA >=", value, "sicbianma");
            return (Criteria) this;
        }

        public Criteria andSicbianmaLessThan(String value) {
            addCriterion("SICBIANMA <", value, "sicbianma");
            return (Criteria) this;
        }

        public Criteria andSicbianmaLessThanOrEqualTo(String value) {
            addCriterion("SICBIANMA <=", value, "sicbianma");
            return (Criteria) this;
        }

        public Criteria andSicbianmaLike(String value) {
            addCriterion("SICBIANMA like", value, "sicbianma");
            return (Criteria) this;
        }

        public Criteria andSicbianmaNotLike(String value) {
            addCriterion("SICBIANMA not like", value, "sicbianma");
            return (Criteria) this;
        }

        public Criteria andSicbianmaIn(List<String> values) {
            addCriterion("SICBIANMA in", values, "sicbianma");
            return (Criteria) this;
        }

        public Criteria andSicbianmaNotIn(List<String> values) {
            addCriterion("SICBIANMA not in", values, "sicbianma");
            return (Criteria) this;
        }

        public Criteria andSicbianmaBetween(String value1, String value2) {
            addCriterion("SICBIANMA between", value1, value2, "sicbianma");
            return (Criteria) this;
        }

        public Criteria andSicbianmaNotBetween(String value1, String value2) {
            addCriterion("SICBIANMA not between", value1, value2, "sicbianma");
            return (Criteria) this;
        }

        public Criteria andZhifufangshiIsNull() {
            addCriterion("ZHIFUFANGSHI is null");
            return (Criteria) this;
        }

        public Criteria andZhifufangshiIsNotNull() {
            addCriterion("ZHIFUFANGSHI is not null");
            return (Criteria) this;
        }

        public Criteria andZhifufangshiEqualTo(String value) {
            addCriterion("ZHIFUFANGSHI =", value, "zhifufangshi");
            return (Criteria) this;
        }

        public Criteria andZhifufangshiNotEqualTo(String value) {
            addCriterion("ZHIFUFANGSHI <>", value, "zhifufangshi");
            return (Criteria) this;
        }

        public Criteria andZhifufangshiGreaterThan(String value) {
            addCriterion("ZHIFUFANGSHI >", value, "zhifufangshi");
            return (Criteria) this;
        }

        public Criteria andZhifufangshiGreaterThanOrEqualTo(String value) {
            addCriterion("ZHIFUFANGSHI >=", value, "zhifufangshi");
            return (Criteria) this;
        }

        public Criteria andZhifufangshiLessThan(String value) {
            addCriterion("ZHIFUFANGSHI <", value, "zhifufangshi");
            return (Criteria) this;
        }

        public Criteria andZhifufangshiLessThanOrEqualTo(String value) {
            addCriterion("ZHIFUFANGSHI <=", value, "zhifufangshi");
            return (Criteria) this;
        }

        public Criteria andZhifufangshiLike(String value) {
            addCriterion("ZHIFUFANGSHI like", value, "zhifufangshi");
            return (Criteria) this;
        }

        public Criteria andZhifufangshiNotLike(String value) {
            addCriterion("ZHIFUFANGSHI not like", value, "zhifufangshi");
            return (Criteria) this;
        }

        public Criteria andZhifufangshiIn(List<String> values) {
            addCriterion("ZHIFUFANGSHI in", values, "zhifufangshi");
            return (Criteria) this;
        }

        public Criteria andZhifufangshiNotIn(List<String> values) {
            addCriterion("ZHIFUFANGSHI not in", values, "zhifufangshi");
            return (Criteria) this;
        }

        public Criteria andZhifufangshiBetween(String value1, String value2) {
            addCriterion("ZHIFUFANGSHI between", value1, value2, "zhifufangshi");
            return (Criteria) this;
        }

        public Criteria andZhifufangshiNotBetween(String value1, String value2) {
            addCriterion("ZHIFUFANGSHI not between", value1, value2, "zhifufangshi");
            return (Criteria) this;
        }

        public Criteria andShifouyouxiaoIsNull() {
            addCriterion("SHIFOUYOUXIAO is null");
            return (Criteria) this;
        }

        public Criteria andShifouyouxiaoIsNotNull() {
            addCriterion("SHIFOUYOUXIAO is not null");
            return (Criteria) this;
        }

        public Criteria andShifouyouxiaoEqualTo(String value) {
            addCriterion("SHIFOUYOUXIAO =", value, "shifouyouxiao");
            return (Criteria) this;
        }

        public Criteria andShifouyouxiaoNotEqualTo(String value) {
            addCriterion("SHIFOUYOUXIAO <>", value, "shifouyouxiao");
            return (Criteria) this;
        }

        public Criteria andShifouyouxiaoGreaterThan(String value) {
            addCriterion("SHIFOUYOUXIAO >", value, "shifouyouxiao");
            return (Criteria) this;
        }

        public Criteria andShifouyouxiaoGreaterThanOrEqualTo(String value) {
            addCriterion("SHIFOUYOUXIAO >=", value, "shifouyouxiao");
            return (Criteria) this;
        }

        public Criteria andShifouyouxiaoLessThan(String value) {
            addCriterion("SHIFOUYOUXIAO <", value, "shifouyouxiao");
            return (Criteria) this;
        }

        public Criteria andShifouyouxiaoLessThanOrEqualTo(String value) {
            addCriterion("SHIFOUYOUXIAO <=", value, "shifouyouxiao");
            return (Criteria) this;
        }

        public Criteria andShifouyouxiaoLike(String value) {
            addCriterion("SHIFOUYOUXIAO like", value, "shifouyouxiao");
            return (Criteria) this;
        }

        public Criteria andShifouyouxiaoNotLike(String value) {
            addCriterion("SHIFOUYOUXIAO not like", value, "shifouyouxiao");
            return (Criteria) this;
        }

        public Criteria andShifouyouxiaoIn(List<String> values) {
            addCriterion("SHIFOUYOUXIAO in", values, "shifouyouxiao");
            return (Criteria) this;
        }

        public Criteria andShifouyouxiaoNotIn(List<String> values) {
            addCriterion("SHIFOUYOUXIAO not in", values, "shifouyouxiao");
            return (Criteria) this;
        }

        public Criteria andShifouyouxiaoBetween(String value1, String value2) {
            addCriterion("SHIFOUYOUXIAO between", value1, value2, "shifouyouxiao");
            return (Criteria) this;
        }

        public Criteria andShifouyouxiaoNotBetween(String value1, String value2) {
            addCriterion("SHIFOUYOUXIAO not between", value1, value2, "shifouyouxiao");
            return (Criteria) this;
        }

        public Criteria andXiangxidizhiIsNull() {
            addCriterion("XIANGXIDIZHI is null");
            return (Criteria) this;
        }

        public Criteria andXiangxidizhiIsNotNull() {
            addCriterion("XIANGXIDIZHI is not null");
            return (Criteria) this;
        }

        public Criteria andXiangxidizhiEqualTo(String value) {
            addCriterion("XIANGXIDIZHI =", value, "xiangxidizhi");
            return (Criteria) this;
        }

        public Criteria andXiangxidizhiNotEqualTo(String value) {
            addCriterion("XIANGXIDIZHI <>", value, "xiangxidizhi");
            return (Criteria) this;
        }

        public Criteria andXiangxidizhiGreaterThan(String value) {
            addCriterion("XIANGXIDIZHI >", value, "xiangxidizhi");
            return (Criteria) this;
        }

        public Criteria andXiangxidizhiGreaterThanOrEqualTo(String value) {
            addCriterion("XIANGXIDIZHI >=", value, "xiangxidizhi");
            return (Criteria) this;
        }

        public Criteria andXiangxidizhiLessThan(String value) {
            addCriterion("XIANGXIDIZHI <", value, "xiangxidizhi");
            return (Criteria) this;
        }

        public Criteria andXiangxidizhiLessThanOrEqualTo(String value) {
            addCriterion("XIANGXIDIZHI <=", value, "xiangxidizhi");
            return (Criteria) this;
        }

        public Criteria andXiangxidizhiLike(String value) {
            addCriterion("XIANGXIDIZHI like", value, "xiangxidizhi");
            return (Criteria) this;
        }

        public Criteria andXiangxidizhiNotLike(String value) {
            addCriterion("XIANGXIDIZHI not like", value, "xiangxidizhi");
            return (Criteria) this;
        }

        public Criteria andXiangxidizhiIn(List<String> values) {
            addCriterion("XIANGXIDIZHI in", values, "xiangxidizhi");
            return (Criteria) this;
        }

        public Criteria andXiangxidizhiNotIn(List<String> values) {
            addCriterion("XIANGXIDIZHI not in", values, "xiangxidizhi");
            return (Criteria) this;
        }

        public Criteria andXiangxidizhiBetween(String value1, String value2) {
            addCriterion("XIANGXIDIZHI between", value1, value2, "xiangxidizhi");
            return (Criteria) this;
        }

        public Criteria andXiangxidizhiNotBetween(String value1, String value2) {
            addCriterion("XIANGXIDIZHI not between", value1, value2, "xiangxidizhi");
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