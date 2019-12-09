package com.sc.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SYS_ROLE implements Serializable {
    private BigDecimal rid;

    private String rname;

    private String rdescribe;

    private BigDecimal headrid;

    private BigDecimal opertorid;

    private Date lasttime;

    private static final long serialVersionUID = 1L;

    public SYS_ROLE(BigDecimal rid, String rname, String rdescribe, BigDecimal headrid, BigDecimal opertorid, Date lasttime) {
        this.rid = rid;
        this.rname = rname;
        this.rdescribe = rdescribe;
        this.headrid = headrid;
        this.opertorid = opertorid;
        this.lasttime = lasttime;
    }

    public SYS_ROLE() {
        super();
    }

    public BigDecimal getRid() {
        return rid;
    }

    public void setRid(BigDecimal rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname == null ? null : rname.trim();
    }

    public String getRdescribe() {
        return rdescribe;
    }

    public void setRdescribe(String rdescribe) {
        this.rdescribe = rdescribe == null ? null : rdescribe.trim();
    }

    public BigDecimal getHeadrid() {
        return headrid;
    }

    public void setHeadrid(BigDecimal headrid) {
        this.headrid = headrid;
    }

    public BigDecimal getOpertorid() {
        return opertorid;
    }

    public void setOpertorid(BigDecimal opertorid) {
        this.opertorid = opertorid;
    }

    public Date getLasttime() {
        return lasttime;
    }

    public void setLasttime(Date lasttime) {
        this.lasttime = lasttime;
    }
}