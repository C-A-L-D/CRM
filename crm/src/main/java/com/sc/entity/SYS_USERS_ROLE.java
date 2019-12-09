package com.sc.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SYS_USERS_ROLE implements Serializable {
    private BigDecimal id;

    private BigDecimal uid;

    private BigDecimal rid;

    private BigDecimal operatorid;

    private Date lasttime;

    private static final long serialVersionUID = 1L;

    public SYS_USERS_ROLE(BigDecimal id, BigDecimal uid, BigDecimal rid, BigDecimal operatorid, Date lasttime) {
        this.id = id;
        this.uid = uid;
        this.rid = rid;
        this.operatorid = operatorid;
        this.lasttime = lasttime;
    }

    public SYS_USERS_ROLE() {
        super();
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getUid() {
        return uid;
    }

    public void setUid(BigDecimal uid) {
        this.uid = uid;
    }

    public BigDecimal getRid() {
        return rid;
    }

    public void setRid(BigDecimal rid) {
        this.rid = rid;
    }

    public BigDecimal getOperatorid() {
        return operatorid;
    }

    public void setOperatorid(BigDecimal operatorid) {
        this.operatorid = operatorid;
    }

    public Date getLasttime() {
        return lasttime;
    }

    public void setLasttime(Date lasttime) {
        this.lasttime = lasttime;
    }
}