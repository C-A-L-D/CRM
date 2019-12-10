package com.sc.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StoreGinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StoreGinfoExample() {
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

        public Criteria andGidIsNull() {
            addCriterion("GID is null");
            return (Criteria) this;
        }

        public Criteria andGidIsNotNull() {
            addCriterion("GID is not null");
            return (Criteria) this;
        }

        public Criteria andGidEqualTo(BigDecimal value) {
            addCriterion("GID =", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotEqualTo(BigDecimal value) {
            addCriterion("GID <>", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThan(BigDecimal value) {
            addCriterion("GID >", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GID >=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThan(BigDecimal value) {
            addCriterion("GID <", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GID <=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidIn(List<BigDecimal> values) {
            addCriterion("GID in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotIn(List<BigDecimal> values) {
            addCriterion("GID not in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GID between", value1, value2, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GID not between", value1, value2, "gid");
            return (Criteria) this;
        }

        public Criteria andGnameIsNull() {
            addCriterion("GNAME is null");
            return (Criteria) this;
        }

        public Criteria andGnameIsNotNull() {
            addCriterion("GNAME is not null");
            return (Criteria) this;
        }

        public Criteria andGnameEqualTo(String value) {
            addCriterion("GNAME =", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotEqualTo(String value) {
            addCriterion("GNAME <>", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameGreaterThan(String value) {
            addCriterion("GNAME >", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameGreaterThanOrEqualTo(String value) {
            addCriterion("GNAME >=", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameLessThan(String value) {
            addCriterion("GNAME <", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameLessThanOrEqualTo(String value) {
            addCriterion("GNAME <=", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameLike(String value) {
            addCriterion("GNAME like", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotLike(String value) {
            addCriterion("GNAME not like", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameIn(List<String> values) {
            addCriterion("GNAME in", values, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotIn(List<String> values) {
            addCriterion("GNAME not in", values, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameBetween(String value1, String value2) {
            addCriterion("GNAME between", value1, value2, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotBetween(String value1, String value2) {
            addCriterion("GNAME not between", value1, value2, "gname");
            return (Criteria) this;
        }

        public Criteria andGcategopyIsNull() {
            addCriterion("GCATEGOPY is null");
            return (Criteria) this;
        }

        public Criteria andGcategopyIsNotNull() {
            addCriterion("GCATEGOPY is not null");
            return (Criteria) this;
        }

        public Criteria andGcategopyEqualTo(String value) {
            addCriterion("GCATEGOPY =", value, "gcategopy");
            return (Criteria) this;
        }

        public Criteria andGcategopyNotEqualTo(String value) {
            addCriterion("GCATEGOPY <>", value, "gcategopy");
            return (Criteria) this;
        }

        public Criteria andGcategopyGreaterThan(String value) {
            addCriterion("GCATEGOPY >", value, "gcategopy");
            return (Criteria) this;
        }

        public Criteria andGcategopyGreaterThanOrEqualTo(String value) {
            addCriterion("GCATEGOPY >=", value, "gcategopy");
            return (Criteria) this;
        }

        public Criteria andGcategopyLessThan(String value) {
            addCriterion("GCATEGOPY <", value, "gcategopy");
            return (Criteria) this;
        }

        public Criteria andGcategopyLessThanOrEqualTo(String value) {
            addCriterion("GCATEGOPY <=", value, "gcategopy");
            return (Criteria) this;
        }

        public Criteria andGcategopyLike(String value) {
            addCriterion("GCATEGOPY like", value, "gcategopy");
            return (Criteria) this;
        }

        public Criteria andGcategopyNotLike(String value) {
            addCriterion("GCATEGOPY not like", value, "gcategopy");
            return (Criteria) this;
        }

        public Criteria andGcategopyIn(List<String> values) {
            addCriterion("GCATEGOPY in", values, "gcategopy");
            return (Criteria) this;
        }

        public Criteria andGcategopyNotIn(List<String> values) {
            addCriterion("GCATEGOPY not in", values, "gcategopy");
            return (Criteria) this;
        }

        public Criteria andGcategopyBetween(String value1, String value2) {
            addCriterion("GCATEGOPY between", value1, value2, "gcategopy");
            return (Criteria) this;
        }

        public Criteria andGcategopyNotBetween(String value1, String value2) {
            addCriterion("GCATEGOPY not between", value1, value2, "gcategopy");
            return (Criteria) this;
        }

        public Criteria andGdespIsNull() {
            addCriterion("GDESP is null");
            return (Criteria) this;
        }

        public Criteria andGdespIsNotNull() {
            addCriterion("GDESP is not null");
            return (Criteria) this;
        }

        public Criteria andGdespEqualTo(String value) {
            addCriterion("GDESP =", value, "gdesp");
            return (Criteria) this;
        }

        public Criteria andGdespNotEqualTo(String value) {
            addCriterion("GDESP <>", value, "gdesp");
            return (Criteria) this;
        }

        public Criteria andGdespGreaterThan(String value) {
            addCriterion("GDESP >", value, "gdesp");
            return (Criteria) this;
        }

        public Criteria andGdespGreaterThanOrEqualTo(String value) {
            addCriterion("GDESP >=", value, "gdesp");
            return (Criteria) this;
        }

        public Criteria andGdespLessThan(String value) {
            addCriterion("GDESP <", value, "gdesp");
            return (Criteria) this;
        }

        public Criteria andGdespLessThanOrEqualTo(String value) {
            addCriterion("GDESP <=", value, "gdesp");
            return (Criteria) this;
        }

        public Criteria andGdespLike(String value) {
            addCriterion("GDESP like", value, "gdesp");
            return (Criteria) this;
        }

        public Criteria andGdespNotLike(String value) {
            addCriterion("GDESP not like", value, "gdesp");
            return (Criteria) this;
        }

        public Criteria andGdespIn(List<String> values) {
            addCriterion("GDESP in", values, "gdesp");
            return (Criteria) this;
        }

        public Criteria andGdespNotIn(List<String> values) {
            addCriterion("GDESP not in", values, "gdesp");
            return (Criteria) this;
        }

        public Criteria andGdespBetween(String value1, String value2) {
            addCriterion("GDESP between", value1, value2, "gdesp");
            return (Criteria) this;
        }

        public Criteria andGdespNotBetween(String value1, String value2) {
            addCriterion("GDESP not between", value1, value2, "gdesp");
            return (Criteria) this;
        }

        public Criteria andGunitIsNull() {
            addCriterion("GUNIT is null");
            return (Criteria) this;
        }

        public Criteria andGunitIsNotNull() {
            addCriterion("GUNIT is not null");
            return (Criteria) this;
        }

        public Criteria andGunitEqualTo(String value) {
            addCriterion("GUNIT =", value, "gunit");
            return (Criteria) this;
        }

        public Criteria andGunitNotEqualTo(String value) {
            addCriterion("GUNIT <>", value, "gunit");
            return (Criteria) this;
        }

        public Criteria andGunitGreaterThan(String value) {
            addCriterion("GUNIT >", value, "gunit");
            return (Criteria) this;
        }

        public Criteria andGunitGreaterThanOrEqualTo(String value) {
            addCriterion("GUNIT >=", value, "gunit");
            return (Criteria) this;
        }

        public Criteria andGunitLessThan(String value) {
            addCriterion("GUNIT <", value, "gunit");
            return (Criteria) this;
        }

        public Criteria andGunitLessThanOrEqualTo(String value) {
            addCriterion("GUNIT <=", value, "gunit");
            return (Criteria) this;
        }

        public Criteria andGunitLike(String value) {
            addCriterion("GUNIT like", value, "gunit");
            return (Criteria) this;
        }

        public Criteria andGunitNotLike(String value) {
            addCriterion("GUNIT not like", value, "gunit");
            return (Criteria) this;
        }

        public Criteria andGunitIn(List<String> values) {
            addCriterion("GUNIT in", values, "gunit");
            return (Criteria) this;
        }

        public Criteria andGunitNotIn(List<String> values) {
            addCriterion("GUNIT not in", values, "gunit");
            return (Criteria) this;
        }

        public Criteria andGunitBetween(String value1, String value2) {
            addCriterion("GUNIT between", value1, value2, "gunit");
            return (Criteria) this;
        }

        public Criteria andGunitNotBetween(String value1, String value2) {
            addCriterion("GUNIT not between", value1, value2, "gunit");
            return (Criteria) this;
        }

        public Criteria andWhidIsNull() {
            addCriterion("WHID is null");
            return (Criteria) this;
        }

        public Criteria andWhidIsNotNull() {
            addCriterion("WHID is not null");
            return (Criteria) this;
        }

        public Criteria andWhidEqualTo(BigDecimal value) {
            addCriterion("WHID =", value, "whid");
            return (Criteria) this;
        }

        public Criteria andWhidNotEqualTo(BigDecimal value) {
            addCriterion("WHID <>", value, "whid");
            return (Criteria) this;
        }

        public Criteria andWhidGreaterThan(BigDecimal value) {
            addCriterion("WHID >", value, "whid");
            return (Criteria) this;
        }

        public Criteria andWhidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WHID >=", value, "whid");
            return (Criteria) this;
        }

        public Criteria andWhidLessThan(BigDecimal value) {
            addCriterion("WHID <", value, "whid");
            return (Criteria) this;
        }

        public Criteria andWhidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WHID <=", value, "whid");
            return (Criteria) this;
        }

        public Criteria andWhidIn(List<BigDecimal> values) {
            addCriterion("WHID in", values, "whid");
            return (Criteria) this;
        }

        public Criteria andWhidNotIn(List<BigDecimal> values) {
            addCriterion("WHID not in", values, "whid");
            return (Criteria) this;
        }

        public Criteria andWhidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WHID between", value1, value2, "whid");
            return (Criteria) this;
        }

        public Criteria andWhidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WHID not between", value1, value2, "whid");
            return (Criteria) this;
        }

        public Criteria andStorenumIsNull() {
            addCriterion("STORENUM is null");
            return (Criteria) this;
        }

        public Criteria andStorenumIsNotNull() {
            addCriterion("STORENUM is not null");
            return (Criteria) this;
        }

        public Criteria andStorenumEqualTo(BigDecimal value) {
            addCriterion("STORENUM =", value, "storenum");
            return (Criteria) this;
        }

        public Criteria andStorenumNotEqualTo(BigDecimal value) {
            addCriterion("STORENUM <>", value, "storenum");
            return (Criteria) this;
        }

        public Criteria andStorenumGreaterThan(BigDecimal value) {
            addCriterion("STORENUM >", value, "storenum");
            return (Criteria) this;
        }

        public Criteria andStorenumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("STORENUM >=", value, "storenum");
            return (Criteria) this;
        }

        public Criteria andStorenumLessThan(BigDecimal value) {
            addCriterion("STORENUM <", value, "storenum");
            return (Criteria) this;
        }

        public Criteria andStorenumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("STORENUM <=", value, "storenum");
            return (Criteria) this;
        }

        public Criteria andStorenumIn(List<BigDecimal> values) {
            addCriterion("STORENUM in", values, "storenum");
            return (Criteria) this;
        }

        public Criteria andStorenumNotIn(List<BigDecimal> values) {
            addCriterion("STORENUM not in", values, "storenum");
            return (Criteria) this;
        }

        public Criteria andStorenumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STORENUM between", value1, value2, "storenum");
            return (Criteria) this;
        }

        public Criteria andStorenumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STORENUM not between", value1, value2, "storenum");
            return (Criteria) this;
        }

        public Criteria andPricebuyIsNull() {
            addCriterion("PRICEBUY is null");
            return (Criteria) this;
        }

        public Criteria andPricebuyIsNotNull() {
            addCriterion("PRICEBUY is not null");
            return (Criteria) this;
        }

        public Criteria andPricebuyEqualTo(BigDecimal value) {
            addCriterion("PRICEBUY =", value, "pricebuy");
            return (Criteria) this;
        }

        public Criteria andPricebuyNotEqualTo(BigDecimal value) {
            addCriterion("PRICEBUY <>", value, "pricebuy");
            return (Criteria) this;
        }

        public Criteria andPricebuyGreaterThan(BigDecimal value) {
            addCriterion("PRICEBUY >", value, "pricebuy");
            return (Criteria) this;
        }

        public Criteria andPricebuyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRICEBUY >=", value, "pricebuy");
            return (Criteria) this;
        }

        public Criteria andPricebuyLessThan(BigDecimal value) {
            addCriterion("PRICEBUY <", value, "pricebuy");
            return (Criteria) this;
        }

        public Criteria andPricebuyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRICEBUY <=", value, "pricebuy");
            return (Criteria) this;
        }

        public Criteria andPricebuyIn(List<BigDecimal> values) {
            addCriterion("PRICEBUY in", values, "pricebuy");
            return (Criteria) this;
        }

        public Criteria andPricebuyNotIn(List<BigDecimal> values) {
            addCriterion("PRICEBUY not in", values, "pricebuy");
            return (Criteria) this;
        }

        public Criteria andPricebuyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRICEBUY between", value1, value2, "pricebuy");
            return (Criteria) this;
        }

        public Criteria andPricebuyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRICEBUY not between", value1, value2, "pricebuy");
            return (Criteria) this;
        }

        public Criteria andPricesoldIsNull() {
            addCriterion("PRICESOLD is null");
            return (Criteria) this;
        }

        public Criteria andPricesoldIsNotNull() {
            addCriterion("PRICESOLD is not null");
            return (Criteria) this;
        }

        public Criteria andPricesoldEqualTo(BigDecimal value) {
            addCriterion("PRICESOLD =", value, "pricesold");
            return (Criteria) this;
        }

        public Criteria andPricesoldNotEqualTo(BigDecimal value) {
            addCriterion("PRICESOLD <>", value, "pricesold");
            return (Criteria) this;
        }

        public Criteria andPricesoldGreaterThan(BigDecimal value) {
            addCriterion("PRICESOLD >", value, "pricesold");
            return (Criteria) this;
        }

        public Criteria andPricesoldGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRICESOLD >=", value, "pricesold");
            return (Criteria) this;
        }

        public Criteria andPricesoldLessThan(BigDecimal value) {
            addCriterion("PRICESOLD <", value, "pricesold");
            return (Criteria) this;
        }

        public Criteria andPricesoldLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRICESOLD <=", value, "pricesold");
            return (Criteria) this;
        }

        public Criteria andPricesoldIn(List<BigDecimal> values) {
            addCriterion("PRICESOLD in", values, "pricesold");
            return (Criteria) this;
        }

        public Criteria andPricesoldNotIn(List<BigDecimal> values) {
            addCriterion("PRICESOLD not in", values, "pricesold");
            return (Criteria) this;
        }

        public Criteria andPricesoldBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRICESOLD between", value1, value2, "pricesold");
            return (Criteria) this;
        }

        public Criteria andPricesoldNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRICESOLD not between", value1, value2, "pricesold");
            return (Criteria) this;
        }

        public Criteria andPriceactIsNull() {
            addCriterion("PRICEACT is null");
            return (Criteria) this;
        }

        public Criteria andPriceactIsNotNull() {
            addCriterion("PRICEACT is not null");
            return (Criteria) this;
        }

        public Criteria andPriceactEqualTo(BigDecimal value) {
            addCriterion("PRICEACT =", value, "priceact");
            return (Criteria) this;
        }

        public Criteria andPriceactNotEqualTo(BigDecimal value) {
            addCriterion("PRICEACT <>", value, "priceact");
            return (Criteria) this;
        }

        public Criteria andPriceactGreaterThan(BigDecimal value) {
            addCriterion("PRICEACT >", value, "priceact");
            return (Criteria) this;
        }

        public Criteria andPriceactGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRICEACT >=", value, "priceact");
            return (Criteria) this;
        }

        public Criteria andPriceactLessThan(BigDecimal value) {
            addCriterion("PRICEACT <", value, "priceact");
            return (Criteria) this;
        }

        public Criteria andPriceactLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRICEACT <=", value, "priceact");
            return (Criteria) this;
        }

        public Criteria andPriceactIn(List<BigDecimal> values) {
            addCriterion("PRICEACT in", values, "priceact");
            return (Criteria) this;
        }

        public Criteria andPriceactNotIn(List<BigDecimal> values) {
            addCriterion("PRICEACT not in", values, "priceact");
            return (Criteria) this;
        }

        public Criteria andPriceactBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRICEACT between", value1, value2, "priceact");
            return (Criteria) this;
        }

        public Criteria andPriceactNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRICEACT not between", value1, value2, "priceact");
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