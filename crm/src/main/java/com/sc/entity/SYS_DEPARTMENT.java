package com.sc.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SYS_DEPARTMENT implements Serializable {
    private BigDecimal did;

    private String dname;

    private String ddescribe;

    private BigDecimal gongsiid;

    private Date lasttime;

    private static final long serialVersionUID = 1L;

    public SYS_DEPARTMENT(BigDecimal did, String dname, String ddescribe, BigDecimal gongsiid, Date lasttime) {
        this.did = did;
        this.dname = dname;
        this.ddescribe = ddescribe;
        this.gongsiid = gongsiid;
        this.lasttime = lasttime;
    }

    public SYS_DEPARTMENT() {
        super();
    }

    public BigDecimal getDid() {
        return did;
    }

    public void setDid(BigDecimal did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname == null ? null : dname.trim();
    }

    public String getDdescribe() {
        return ddescribe;
    }

    public void setDdescribe(String ddescribe) {
        this.ddescribe = ddescribe == null ? null : ddescribe.trim();
    }

    public BigDecimal getGongsiid() {
        return gongsiid;
    }

    public void setGongsiid(BigDecimal gongsiid) {
        this.gongsiid = gongsiid;
    }

    public Date getLasttime() {
        return lasttime;
    }

    public void setLasttime(Date lasttime) {
        this.lasttime = lasttime;
    }
}