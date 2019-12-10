package com.sc.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class SysDepartment implements Serializable {
    private BigDecimal did;

    private String dname;

    private String ddescribe;

    private BigDecimal gongsiid;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date lasttime;

    private static final long serialVersionUID = 1L;

    public SysDepartment(BigDecimal did, String dname, String ddescribe, BigDecimal gongsiid, Date lasttime) {
        this.did = did;
        this.dname = dname;
        this.ddescribe = ddescribe;
        this.gongsiid = gongsiid;
        this.lasttime = lasttime;
    }

    public SysDepartment() {
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

	@Override
	public String toString() {
		return "SysDepartment [did=" + did + ", dname=" + dname + ", ddescribe=" + ddescribe + ", gongsiid=" + gongsiid
				+ ", lasttime=" + lasttime + "]";
	}
    
}