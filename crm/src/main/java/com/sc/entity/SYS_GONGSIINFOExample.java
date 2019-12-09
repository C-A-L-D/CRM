package com.sc.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SYS_GONGSIINFOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SYS_GONGSIINFOExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(BigDecimal value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(BigDecimal value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(BigDecimal value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(BigDecimal value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<BigDecimal> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<BigDecimal> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID not between", value1, value2, "id");
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

        public Criteria andGcodeIsNull() {
            addCriterion("GCODE is null");
            return (Criteria) this;
        }

        public Criteria andGcodeIsNotNull() {
            addCriterion("GCODE is not null");
            return (Criteria) this;
        }

        public Criteria andGcodeEqualTo(String value) {
            addCriterion("GCODE =", value, "gcode");
            return (Criteria) this;
        }

        public Criteria andGcodeNotEqualTo(String value) {
            addCriterion("GCODE <>", value, "gcode");
            return (Criteria) this;
        }

        public Criteria andGcodeGreaterThan(String value) {
            addCriterion("GCODE >", value, "gcode");
            return (Criteria) this;
        }

        public Criteria andGcodeGreaterThanOrEqualTo(String value) {
            addCriterion("GCODE >=", value, "gcode");
            return (Criteria) this;
        }

        public Criteria andGcodeLessThan(String value) {
            addCriterion("GCODE <", value, "gcode");
            return (Criteria) this;
        }

        public Criteria andGcodeLessThanOrEqualTo(String value) {
            addCriterion("GCODE <=", value, "gcode");
            return (Criteria) this;
        }

        public Criteria andGcodeLike(String value) {
            addCriterion("GCODE like", value, "gcode");
            return (Criteria) this;
        }

        public Criteria andGcodeNotLike(String value) {
            addCriterion("GCODE not like", value, "gcode");
            return (Criteria) this;
        }

        public Criteria andGcodeIn(List<String> values) {
            addCriterion("GCODE in", values, "gcode");
            return (Criteria) this;
        }

        public Criteria andGcodeNotIn(List<String> values) {
            addCriterion("GCODE not in", values, "gcode");
            return (Criteria) this;
        }

        public Criteria andGcodeBetween(String value1, String value2) {
            addCriterion("GCODE between", value1, value2, "gcode");
            return (Criteria) this;
        }

        public Criteria andGcodeNotBetween(String value1, String value2) {
            addCriterion("GCODE not between", value1, value2, "gcode");
            return (Criteria) this;
        }

        public Criteria andGemailIsNull() {
            addCriterion("GEMAIL is null");
            return (Criteria) this;
        }

        public Criteria andGemailIsNotNull() {
            addCriterion("GEMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andGemailEqualTo(String value) {
            addCriterion("GEMAIL =", value, "gemail");
            return (Criteria) this;
        }

        public Criteria andGemailNotEqualTo(String value) {
            addCriterion("GEMAIL <>", value, "gemail");
            return (Criteria) this;
        }

        public Criteria andGemailGreaterThan(String value) {
            addCriterion("GEMAIL >", value, "gemail");
            return (Criteria) this;
        }

        public Criteria andGemailGreaterThanOrEqualTo(String value) {
            addCriterion("GEMAIL >=", value, "gemail");
            return (Criteria) this;
        }

        public Criteria andGemailLessThan(String value) {
            addCriterion("GEMAIL <", value, "gemail");
            return (Criteria) this;
        }

        public Criteria andGemailLessThanOrEqualTo(String value) {
            addCriterion("GEMAIL <=", value, "gemail");
            return (Criteria) this;
        }

        public Criteria andGemailLike(String value) {
            addCriterion("GEMAIL like", value, "gemail");
            return (Criteria) this;
        }

        public Criteria andGemailNotLike(String value) {
            addCriterion("GEMAIL not like", value, "gemail");
            return (Criteria) this;
        }

        public Criteria andGemailIn(List<String> values) {
            addCriterion("GEMAIL in", values, "gemail");
            return (Criteria) this;
        }

        public Criteria andGemailNotIn(List<String> values) {
            addCriterion("GEMAIL not in", values, "gemail");
            return (Criteria) this;
        }

        public Criteria andGemailBetween(String value1, String value2) {
            addCriterion("GEMAIL between", value1, value2, "gemail");
            return (Criteria) this;
        }

        public Criteria andGemailNotBetween(String value1, String value2) {
            addCriterion("GEMAIL not between", value1, value2, "gemail");
            return (Criteria) this;
        }

        public Criteria andGlinkmanIsNull() {
            addCriterion("GLINKMAN is null");
            return (Criteria) this;
        }

        public Criteria andGlinkmanIsNotNull() {
            addCriterion("GLINKMAN is not null");
            return (Criteria) this;
        }

        public Criteria andGlinkmanEqualTo(String value) {
            addCriterion("GLINKMAN =", value, "glinkman");
            return (Criteria) this;
        }

        public Criteria andGlinkmanNotEqualTo(String value) {
            addCriterion("GLINKMAN <>", value, "glinkman");
            return (Criteria) this;
        }

        public Criteria andGlinkmanGreaterThan(String value) {
            addCriterion("GLINKMAN >", value, "glinkman");
            return (Criteria) this;
        }

        public Criteria andGlinkmanGreaterThanOrEqualTo(String value) {
            addCriterion("GLINKMAN >=", value, "glinkman");
            return (Criteria) this;
        }

        public Criteria andGlinkmanLessThan(String value) {
            addCriterion("GLINKMAN <", value, "glinkman");
            return (Criteria) this;
        }

        public Criteria andGlinkmanLessThanOrEqualTo(String value) {
            addCriterion("GLINKMAN <=", value, "glinkman");
            return (Criteria) this;
        }

        public Criteria andGlinkmanLike(String value) {
            addCriterion("GLINKMAN like", value, "glinkman");
            return (Criteria) this;
        }

        public Criteria andGlinkmanNotLike(String value) {
            addCriterion("GLINKMAN not like", value, "glinkman");
            return (Criteria) this;
        }

        public Criteria andGlinkmanIn(List<String> values) {
            addCriterion("GLINKMAN in", values, "glinkman");
            return (Criteria) this;
        }

        public Criteria andGlinkmanNotIn(List<String> values) {
            addCriterion("GLINKMAN not in", values, "glinkman");
            return (Criteria) this;
        }

        public Criteria andGlinkmanBetween(String value1, String value2) {
            addCriterion("GLINKMAN between", value1, value2, "glinkman");
            return (Criteria) this;
        }

        public Criteria andGlinkmanNotBetween(String value1, String value2) {
            addCriterion("GLINKMAN not between", value1, value2, "glinkman");
            return (Criteria) this;
        }

        public Criteria andGaddressIsNull() {
            addCriterion("GADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andGaddressIsNotNull() {
            addCriterion("GADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andGaddressEqualTo(String value) {
            addCriterion("GADDRESS =", value, "gaddress");
            return (Criteria) this;
        }

        public Criteria andGaddressNotEqualTo(String value) {
            addCriterion("GADDRESS <>", value, "gaddress");
            return (Criteria) this;
        }

        public Criteria andGaddressGreaterThan(String value) {
            addCriterion("GADDRESS >", value, "gaddress");
            return (Criteria) this;
        }

        public Criteria andGaddressGreaterThanOrEqualTo(String value) {
            addCriterion("GADDRESS >=", value, "gaddress");
            return (Criteria) this;
        }

        public Criteria andGaddressLessThan(String value) {
            addCriterion("GADDRESS <", value, "gaddress");
            return (Criteria) this;
        }

        public Criteria andGaddressLessThanOrEqualTo(String value) {
            addCriterion("GADDRESS <=", value, "gaddress");
            return (Criteria) this;
        }

        public Criteria andGaddressLike(String value) {
            addCriterion("GADDRESS like", value, "gaddress");
            return (Criteria) this;
        }

        public Criteria andGaddressNotLike(String value) {
            addCriterion("GADDRESS not like", value, "gaddress");
            return (Criteria) this;
        }

        public Criteria andGaddressIn(List<String> values) {
            addCriterion("GADDRESS in", values, "gaddress");
            return (Criteria) this;
        }

        public Criteria andGaddressNotIn(List<String> values) {
            addCriterion("GADDRESS not in", values, "gaddress");
            return (Criteria) this;
        }

        public Criteria andGaddressBetween(String value1, String value2) {
            addCriterion("GADDRESS between", value1, value2, "gaddress");
            return (Criteria) this;
        }

        public Criteria andGaddressNotBetween(String value1, String value2) {
            addCriterion("GADDRESS not between", value1, value2, "gaddress");
            return (Criteria) this;
        }

        public Criteria andGtelIsNull() {
            addCriterion("GTEL is null");
            return (Criteria) this;
        }

        public Criteria andGtelIsNotNull() {
            addCriterion("GTEL is not null");
            return (Criteria) this;
        }

        public Criteria andGtelEqualTo(String value) {
            addCriterion("GTEL =", value, "gtel");
            return (Criteria) this;
        }

        public Criteria andGtelNotEqualTo(String value) {
            addCriterion("GTEL <>", value, "gtel");
            return (Criteria) this;
        }

        public Criteria andGtelGreaterThan(String value) {
            addCriterion("GTEL >", value, "gtel");
            return (Criteria) this;
        }

        public Criteria andGtelGreaterThanOrEqualTo(String value) {
            addCriterion("GTEL >=", value, "gtel");
            return (Criteria) this;
        }

        public Criteria andGtelLessThan(String value) {
            addCriterion("GTEL <", value, "gtel");
            return (Criteria) this;
        }

        public Criteria andGtelLessThanOrEqualTo(String value) {
            addCriterion("GTEL <=", value, "gtel");
            return (Criteria) this;
        }

        public Criteria andGtelLike(String value) {
            addCriterion("GTEL like", value, "gtel");
            return (Criteria) this;
        }

        public Criteria andGtelNotLike(String value) {
            addCriterion("GTEL not like", value, "gtel");
            return (Criteria) this;
        }

        public Criteria andGtelIn(List<String> values) {
            addCriterion("GTEL in", values, "gtel");
            return (Criteria) this;
        }

        public Criteria andGtelNotIn(List<String> values) {
            addCriterion("GTEL not in", values, "gtel");
            return (Criteria) this;
        }

        public Criteria andGtelBetween(String value1, String value2) {
            addCriterion("GTEL between", value1, value2, "gtel");
            return (Criteria) this;
        }

        public Criteria andGtelNotBetween(String value1, String value2) {
            addCriterion("GTEL not between", value1, value2, "gtel");
            return (Criteria) this;
        }

        public Criteria andGphoneIsNull() {
            addCriterion("GPHONE is null");
            return (Criteria) this;
        }

        public Criteria andGphoneIsNotNull() {
            addCriterion("GPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andGphoneEqualTo(String value) {
            addCriterion("GPHONE =", value, "gphone");
            return (Criteria) this;
        }

        public Criteria andGphoneNotEqualTo(String value) {
            addCriterion("GPHONE <>", value, "gphone");
            return (Criteria) this;
        }

        public Criteria andGphoneGreaterThan(String value) {
            addCriterion("GPHONE >", value, "gphone");
            return (Criteria) this;
        }

        public Criteria andGphoneGreaterThanOrEqualTo(String value) {
            addCriterion("GPHONE >=", value, "gphone");
            return (Criteria) this;
        }

        public Criteria andGphoneLessThan(String value) {
            addCriterion("GPHONE <", value, "gphone");
            return (Criteria) this;
        }

        public Criteria andGphoneLessThanOrEqualTo(String value) {
            addCriterion("GPHONE <=", value, "gphone");
            return (Criteria) this;
        }

        public Criteria andGphoneLike(String value) {
            addCriterion("GPHONE like", value, "gphone");
            return (Criteria) this;
        }

        public Criteria andGphoneNotLike(String value) {
            addCriterion("GPHONE not like", value, "gphone");
            return (Criteria) this;
        }

        public Criteria andGphoneIn(List<String> values) {
            addCriterion("GPHONE in", values, "gphone");
            return (Criteria) this;
        }

        public Criteria andGphoneNotIn(List<String> values) {
            addCriterion("GPHONE not in", values, "gphone");
            return (Criteria) this;
        }

        public Criteria andGphoneBetween(String value1, String value2) {
            addCriterion("GPHONE between", value1, value2, "gphone");
            return (Criteria) this;
        }

        public Criteria andGphoneNotBetween(String value1, String value2) {
            addCriterion("GPHONE not between", value1, value2, "gphone");
            return (Criteria) this;
        }

        public Criteria andGchuanzhenIsNull() {
            addCriterion("GCHUANZHEN is null");
            return (Criteria) this;
        }

        public Criteria andGchuanzhenIsNotNull() {
            addCriterion("GCHUANZHEN is not null");
            return (Criteria) this;
        }

        public Criteria andGchuanzhenEqualTo(String value) {
            addCriterion("GCHUANZHEN =", value, "gchuanzhen");
            return (Criteria) this;
        }

        public Criteria andGchuanzhenNotEqualTo(String value) {
            addCriterion("GCHUANZHEN <>", value, "gchuanzhen");
            return (Criteria) this;
        }

        public Criteria andGchuanzhenGreaterThan(String value) {
            addCriterion("GCHUANZHEN >", value, "gchuanzhen");
            return (Criteria) this;
        }

        public Criteria andGchuanzhenGreaterThanOrEqualTo(String value) {
            addCriterion("GCHUANZHEN >=", value, "gchuanzhen");
            return (Criteria) this;
        }

        public Criteria andGchuanzhenLessThan(String value) {
            addCriterion("GCHUANZHEN <", value, "gchuanzhen");
            return (Criteria) this;
        }

        public Criteria andGchuanzhenLessThanOrEqualTo(String value) {
            addCriterion("GCHUANZHEN <=", value, "gchuanzhen");
            return (Criteria) this;
        }

        public Criteria andGchuanzhenLike(String value) {
            addCriterion("GCHUANZHEN like", value, "gchuanzhen");
            return (Criteria) this;
        }

        public Criteria andGchuanzhenNotLike(String value) {
            addCriterion("GCHUANZHEN not like", value, "gchuanzhen");
            return (Criteria) this;
        }

        public Criteria andGchuanzhenIn(List<String> values) {
            addCriterion("GCHUANZHEN in", values, "gchuanzhen");
            return (Criteria) this;
        }

        public Criteria andGchuanzhenNotIn(List<String> values) {
            addCriterion("GCHUANZHEN not in", values, "gchuanzhen");
            return (Criteria) this;
        }

        public Criteria andGchuanzhenBetween(String value1, String value2) {
            addCriterion("GCHUANZHEN between", value1, value2, "gchuanzhen");
            return (Criteria) this;
        }

        public Criteria andGchuanzhenNotBetween(String value1, String value2) {
            addCriterion("GCHUANZHEN not between", value1, value2, "gchuanzhen");
            return (Criteria) this;
        }

        public Criteria andGopenyinghangIsNull() {
            addCriterion("GOPENYINGHANG is null");
            return (Criteria) this;
        }

        public Criteria andGopenyinghangIsNotNull() {
            addCriterion("GOPENYINGHANG is not null");
            return (Criteria) this;
        }

        public Criteria andGopenyinghangEqualTo(String value) {
            addCriterion("GOPENYINGHANG =", value, "gopenyinghang");
            return (Criteria) this;
        }

        public Criteria andGopenyinghangNotEqualTo(String value) {
            addCriterion("GOPENYINGHANG <>", value, "gopenyinghang");
            return (Criteria) this;
        }

        public Criteria andGopenyinghangGreaterThan(String value) {
            addCriterion("GOPENYINGHANG >", value, "gopenyinghang");
            return (Criteria) this;
        }

        public Criteria andGopenyinghangGreaterThanOrEqualTo(String value) {
            addCriterion("GOPENYINGHANG >=", value, "gopenyinghang");
            return (Criteria) this;
        }

        public Criteria andGopenyinghangLessThan(String value) {
            addCriterion("GOPENYINGHANG <", value, "gopenyinghang");
            return (Criteria) this;
        }

        public Criteria andGopenyinghangLessThanOrEqualTo(String value) {
            addCriterion("GOPENYINGHANG <=", value, "gopenyinghang");
            return (Criteria) this;
        }

        public Criteria andGopenyinghangLike(String value) {
            addCriterion("GOPENYINGHANG like", value, "gopenyinghang");
            return (Criteria) this;
        }

        public Criteria andGopenyinghangNotLike(String value) {
            addCriterion("GOPENYINGHANG not like", value, "gopenyinghang");
            return (Criteria) this;
        }

        public Criteria andGopenyinghangIn(List<String> values) {
            addCriterion("GOPENYINGHANG in", values, "gopenyinghang");
            return (Criteria) this;
        }

        public Criteria andGopenyinghangNotIn(List<String> values) {
            addCriterion("GOPENYINGHANG not in", values, "gopenyinghang");
            return (Criteria) this;
        }

        public Criteria andGopenyinghangBetween(String value1, String value2) {
            addCriterion("GOPENYINGHANG between", value1, value2, "gopenyinghang");
            return (Criteria) this;
        }

        public Criteria andGopenyinghangNotBetween(String value1, String value2) {
            addCriterion("GOPENYINGHANG not between", value1, value2, "gopenyinghang");
            return (Criteria) this;
        }

        public Criteria andGyinghangaccountIsNull() {
            addCriterion("GYINGHANGACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andGyinghangaccountIsNotNull() {
            addCriterion("GYINGHANGACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andGyinghangaccountEqualTo(String value) {
            addCriterion("GYINGHANGACCOUNT =", value, "gyinghangaccount");
            return (Criteria) this;
        }

        public Criteria andGyinghangaccountNotEqualTo(String value) {
            addCriterion("GYINGHANGACCOUNT <>", value, "gyinghangaccount");
            return (Criteria) this;
        }

        public Criteria andGyinghangaccountGreaterThan(String value) {
            addCriterion("GYINGHANGACCOUNT >", value, "gyinghangaccount");
            return (Criteria) this;
        }

        public Criteria andGyinghangaccountGreaterThanOrEqualTo(String value) {
            addCriterion("GYINGHANGACCOUNT >=", value, "gyinghangaccount");
            return (Criteria) this;
        }

        public Criteria andGyinghangaccountLessThan(String value) {
            addCriterion("GYINGHANGACCOUNT <", value, "gyinghangaccount");
            return (Criteria) this;
        }

        public Criteria andGyinghangaccountLessThanOrEqualTo(String value) {
            addCriterion("GYINGHANGACCOUNT <=", value, "gyinghangaccount");
            return (Criteria) this;
        }

        public Criteria andGyinghangaccountLike(String value) {
            addCriterion("GYINGHANGACCOUNT like", value, "gyinghangaccount");
            return (Criteria) this;
        }

        public Criteria andGyinghangaccountNotLike(String value) {
            addCriterion("GYINGHANGACCOUNT not like", value, "gyinghangaccount");
            return (Criteria) this;
        }

        public Criteria andGyinghangaccountIn(List<String> values) {
            addCriterion("GYINGHANGACCOUNT in", values, "gyinghangaccount");
            return (Criteria) this;
        }

        public Criteria andGyinghangaccountNotIn(List<String> values) {
            addCriterion("GYINGHANGACCOUNT not in", values, "gyinghangaccount");
            return (Criteria) this;
        }

        public Criteria andGyinghangaccountBetween(String value1, String value2) {
            addCriterion("GYINGHANGACCOUNT between", value1, value2, "gyinghangaccount");
            return (Criteria) this;
        }

        public Criteria andGyinghangaccountNotBetween(String value1, String value2) {
            addCriterion("GYINGHANGACCOUNT not between", value1, value2, "gyinghangaccount");
            return (Criteria) this;
        }

        public Criteria andGtfIsNull() {
            addCriterion("GTF is null");
            return (Criteria) this;
        }

        public Criteria andGtfIsNotNull() {
            addCriterion("GTF is not null");
            return (Criteria) this;
        }

        public Criteria andGtfEqualTo(String value) {
            addCriterion("GTF =", value, "gtf");
            return (Criteria) this;
        }

        public Criteria andGtfNotEqualTo(String value) {
            addCriterion("GTF <>", value, "gtf");
            return (Criteria) this;
        }

        public Criteria andGtfGreaterThan(String value) {
            addCriterion("GTF >", value, "gtf");
            return (Criteria) this;
        }

        public Criteria andGtfGreaterThanOrEqualTo(String value) {
            addCriterion("GTF >=", value, "gtf");
            return (Criteria) this;
        }

        public Criteria andGtfLessThan(String value) {
            addCriterion("GTF <", value, "gtf");
            return (Criteria) this;
        }

        public Criteria andGtfLessThanOrEqualTo(String value) {
            addCriterion("GTF <=", value, "gtf");
            return (Criteria) this;
        }

        public Criteria andGtfLike(String value) {
            addCriterion("GTF like", value, "gtf");
            return (Criteria) this;
        }

        public Criteria andGtfNotLike(String value) {
            addCriterion("GTF not like", value, "gtf");
            return (Criteria) this;
        }

        public Criteria andGtfIn(List<String> values) {
            addCriterion("GTF in", values, "gtf");
            return (Criteria) this;
        }

        public Criteria andGtfNotIn(List<String> values) {
            addCriterion("GTF not in", values, "gtf");
            return (Criteria) this;
        }

        public Criteria andGtfBetween(String value1, String value2) {
            addCriterion("GTF between", value1, value2, "gtf");
            return (Criteria) this;
        }

        public Criteria andGtfNotBetween(String value1, String value2) {
            addCriterion("GTF not between", value1, value2, "gtf");
            return (Criteria) this;
        }

        public Criteria andGdescribeIsNull() {
            addCriterion("GDESCRIBE is null");
            return (Criteria) this;
        }

        public Criteria andGdescribeIsNotNull() {
            addCriterion("GDESCRIBE is not null");
            return (Criteria) this;
        }

        public Criteria andGdescribeEqualTo(String value) {
            addCriterion("GDESCRIBE =", value, "gdescribe");
            return (Criteria) this;
        }

        public Criteria andGdescribeNotEqualTo(String value) {
            addCriterion("GDESCRIBE <>", value, "gdescribe");
            return (Criteria) this;
        }

        public Criteria andGdescribeGreaterThan(String value) {
            addCriterion("GDESCRIBE >", value, "gdescribe");
            return (Criteria) this;
        }

        public Criteria andGdescribeGreaterThanOrEqualTo(String value) {
            addCriterion("GDESCRIBE >=", value, "gdescribe");
            return (Criteria) this;
        }

        public Criteria andGdescribeLessThan(String value) {
            addCriterion("GDESCRIBE <", value, "gdescribe");
            return (Criteria) this;
        }

        public Criteria andGdescribeLessThanOrEqualTo(String value) {
            addCriterion("GDESCRIBE <=", value, "gdescribe");
            return (Criteria) this;
        }

        public Criteria andGdescribeLike(String value) {
            addCriterion("GDESCRIBE like", value, "gdescribe");
            return (Criteria) this;
        }

        public Criteria andGdescribeNotLike(String value) {
            addCriterion("GDESCRIBE not like", value, "gdescribe");
            return (Criteria) this;
        }

        public Criteria andGdescribeIn(List<String> values) {
            addCriterion("GDESCRIBE in", values, "gdescribe");
            return (Criteria) this;
        }

        public Criteria andGdescribeNotIn(List<String> values) {
            addCriterion("GDESCRIBE not in", values, "gdescribe");
            return (Criteria) this;
        }

        public Criteria andGdescribeBetween(String value1, String value2) {
            addCriterion("GDESCRIBE between", value1, value2, "gdescribe");
            return (Criteria) this;
        }

        public Criteria andGdescribeNotBetween(String value1, String value2) {
            addCriterion("GDESCRIBE not between", value1, value2, "gdescribe");
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