package com.sc.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class SysUsersRole implements Serializable {
    private BigDecimal id;

    private BigDecimal userId;

    private BigDecimal rid;

    private BigDecimal operatorid;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date lasttime;

    private static final long serialVersionUID = 1L;

    public SysUsersRole(BigDecimal id, BigDecimal userId, BigDecimal rid, BigDecimal operatorid, Date lasttime) {
        this.id = id;
        this.userId = userId;
        this.rid = rid;
        this.operatorid = operatorid;
        this.lasttime = lasttime;
    }

    public SysUsersRole() {
        super();
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getUserId() {
        return userId;
    }

    public void setUserId(BigDecimal userId) {
        this.userId = userId;
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

	@Override
	public String toString() {
		return "SysUsersRole [id=" + id + ", userId=" + userId + ", rid=" + rid + ", operatorid=" + operatorid
				+ ", lasttime=" + lasttime + "]";
	}
    
}