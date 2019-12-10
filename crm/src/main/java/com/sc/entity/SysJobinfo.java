package com.sc.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class SysJobinfo implements Serializable {
    private BigDecimal jid;

    private String jname;

    private BigDecimal did;

    private String jdescribe;

    private BigDecimal gongsiid;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date lasttime;

    private static final long serialVersionUID = 1L;

    public SysJobinfo(BigDecimal jid, String jname, BigDecimal did, String jdescribe, BigDecimal gongsiid, Date lasttime) {
        this.jid = jid;
        this.jname = jname;
        this.did = did;
        this.jdescribe = jdescribe;
        this.gongsiid = gongsiid;
        this.lasttime = lasttime;
    }

    public SysJobinfo() {
        super();
    }

    public BigDecimal getJid() {
        return jid;
    }

    public void setJid(BigDecimal jid) {
        this.jid = jid;
    }

    public String getJname() {
        return jname;
    }

    public void setJname(String jname) {
        this.jname = jname == null ? null : jname.trim();
    }

    public BigDecimal getDid() {
        return did;
    }

    public void setDid(BigDecimal did) {
        this.did = did;
    }

    public String getJdescribe() {
        return jdescribe;
    }

    public void setJdescribe(String jdescribe) {
        this.jdescribe = jdescribe == null ? null : jdescribe.trim();
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
		return "SysJobinfo [jid=" + jid + ", jname=" + jname + ", did=" + did + ", jdescribe=" + jdescribe
				+ ", gongsiid=" + gongsiid + ", lasttime=" + lasttime + "]";
	}
    
}