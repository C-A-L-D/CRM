package com.sc.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class STORE_WHINFO implements Serializable {
    private BigDecimal whid;

    private String whname;

    private String remark;

    private BigDecimal cid;

    private Date lastdate;

    private static final long serialVersionUID = 1L;

    public STORE_WHINFO(BigDecimal whid, String whname, String remark, BigDecimal cid, Date lastdate) {
        this.whid = whid;
        this.whname = whname;
        this.remark = remark;
        this.cid = cid;
        this.lastdate = lastdate;
    }

    public STORE_WHINFO() {
        super();
    }

    public BigDecimal getWhid() {
        return whid;
    }

    public void setWhid(BigDecimal whid) {
        this.whid = whid;
    }

    public String getWhname() {
        return whname;
    }

    public void setWhname(String whname) {
        this.whname = whname == null ? null : whname.trim();
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