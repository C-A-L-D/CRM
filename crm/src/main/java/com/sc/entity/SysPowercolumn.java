package com.sc.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class SysPowercolumn implements Serializable {
    private BigDecimal cid;

    private String cname;

    private String cdescribe;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date lasttime;

    private static final long serialVersionUID = 1L;

    public SysPowercolumn(BigDecimal cid, String cname, String cdescribe, Date lasttime) {
        this.cid = cid;
        this.cname = cname;
        this.cdescribe = cdescribe;
        this.lasttime = lasttime;
    }

    public SysPowercolumn() {
        super();
    }

    public BigDecimal getCid() {
        return cid;
    }

    public void setCid(BigDecimal cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public String getCdescribe() {
        return cdescribe;
    }

    public void setCdescribe(String cdescribe) {
        this.cdescribe = cdescribe == null ? null : cdescribe.trim();
    }

    public Date getLasttime() {
        return lasttime;
    }

    public void setLasttime(Date lasttime) {
        this.lasttime = lasttime;
    }

	@Override
	public String toString() {
		return "SysPowercolumn [cid=" + cid + ", cname=" + cname + ", cdescribe=" + cdescribe + ", lasttime=" + lasttime
				+ "]";
	}
    
}