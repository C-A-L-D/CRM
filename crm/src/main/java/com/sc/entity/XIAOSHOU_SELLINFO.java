package com.sc.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class XIAOSHOU_SELLINFO implements Serializable {
    private BigDecimal ssid;

    private BigDecimal sid;

    private BigDecimal gid;

    private BigDecimal gnum;

    private BigDecimal gprice;

    private String remark;

    private BigDecimal cid;

    private Date lasttime;

    private static final long serialVersionUID = 1L;

    public XIAOSHOU_SELLINFO(BigDecimal ssid, BigDecimal sid, BigDecimal gid, BigDecimal gnum, BigDecimal gprice, String remark, BigDecimal cid, Date lasttime) {
        this.ssid = ssid;
        this.sid = sid;
        this.gid = gid;
        this.gnum = gnum;
        this.gprice = gprice;
        this.remark = remark;
        this.cid = cid;
        this.lasttime = lasttime;
    }

    public XIAOSHOU_SELLINFO() {
        super();
    }

    public BigDecimal getSsid() {
        return ssid;
    }

    public void setSsid(BigDecimal ssid) {
        this.ssid = ssid;
    }

    public BigDecimal getSid() {
        return sid;
    }

    public void setSid(BigDecimal sid) {
        this.sid = sid;
    }

    public BigDecimal getGid() {
        return gid;
    }

    public void setGid(BigDecimal gid) {
        this.gid = gid;
    }

    public BigDecimal getGnum() {
        return gnum;
    }

    public void setGnum(BigDecimal gnum) {
        this.gnum = gnum;
    }

    public BigDecimal getGprice() {
        return gprice;
    }

    public void setGprice(BigDecimal gprice) {
        this.gprice = gprice;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public BigDecimal getCid() {
        return cid;
    }

    public void setCid(BigDecimal cid) {
        this.cid = cid;
    }

    public Date getLasttime() {
        return lasttime;
    }

    public void setLasttime(Date lasttime) {
        this.lasttime = lasttime;
    }
}