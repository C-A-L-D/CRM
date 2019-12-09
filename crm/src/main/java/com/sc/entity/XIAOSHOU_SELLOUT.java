package com.sc.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class XIAOSHOU_SELLOUT implements Serializable {
    private BigDecimal sid;

    private Date maketime;

    private String tid;

    private BigDecimal guid;

    private BigDecimal sprice;

    private String sstatus;

    private String isanti;

    private String lstatus;

    private String remark;

    private BigDecimal cid;

    private Date lastdate;

    private static final long serialVersionUID = 1L;

    public XIAOSHOU_SELLOUT(BigDecimal sid, Date maketime, String tid, BigDecimal guid, BigDecimal sprice, String sstatus, String isanti, String lstatus, String remark, BigDecimal cid, Date lastdate) {
        this.sid = sid;
        this.maketime = maketime;
        this.tid = tid;
        this.guid = guid;
        this.sprice = sprice;
        this.sstatus = sstatus;
        this.isanti = isanti;
        this.lstatus = lstatus;
        this.remark = remark;
        this.cid = cid;
        this.lastdate = lastdate;
    }

    public XIAOSHOU_SELLOUT() {
        super();
    }

    public BigDecimal getSid() {
        return sid;
    }

    public void setSid(BigDecimal sid) {
        this.sid = sid;
    }

    public Date getMaketime() {
        return maketime;
    }

    public void setMaketime(Date maketime) {
        this.maketime = maketime;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid == null ? null : tid.trim();
    }

    public BigDecimal getGuid() {
        return guid;
    }

    public void setGuid(BigDecimal guid) {
        this.guid = guid;
    }

    public BigDecimal getSprice() {
        return sprice;
    }

    public void setSprice(BigDecimal sprice) {
        this.sprice = sprice;
    }

    public String getSstatus() {
        return sstatus;
    }

    public void setSstatus(String sstatus) {
        this.sstatus = sstatus == null ? null : sstatus.trim();
    }

    public String getIsanti() {
        return isanti;
    }

    public void setIsanti(String isanti) {
        this.isanti = isanti == null ? null : isanti.trim();
    }

    public String getLstatus() {
        return lstatus;
    }

    public void setLstatus(String lstatus) {
        this.lstatus = lstatus == null ? null : lstatus.trim();
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

    public Date getLastdate() {
        return lastdate;
    }

    public void setLastdate(Date lastdate) {
        this.lastdate = lastdate;
    }
}