package com.sc.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class SysUsers implements Serializable {
    private BigDecimal uid;

    private String uname;

    private String upassword;

    private BigDecimal sid;

    private BigDecimal gongsiid;

    private String ustate;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date lasttime;

    private static final long serialVersionUID = 1L;

    private SysGongsiinfo sysGongsiinfo;
    
    public SysUsers(BigDecimal uid, String uname, String upassword, BigDecimal sid, BigDecimal gongsiid, String ustate, Date lasttime) {
        this.uid = uid;
        this.uname = uname;
        this.upassword = upassword;
        this.sid = sid;
        this.gongsiid = gongsiid;
        this.ustate = ustate;
        this.lasttime = lasttime;
    }

    
    
    public SysUsers(BigDecimal uid, String uname, String upassword, BigDecimal sid, BigDecimal gongsiid, String ustate,
			Date lasttime, SysGongsiinfo sysGongsiinfo) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.upassword = upassword;
		this.sid = sid;
		this.gongsiid = gongsiid;
		this.ustate = ustate;
		this.lasttime = lasttime;
		this.sysGongsiinfo = sysGongsiinfo;
	}



	public SysGongsiinfo getSysGongsiinfo() {
		return sysGongsiinfo;
	}



	public void setSysGongsiinfo(SysGongsiinfo sysGongsiinfo) {
		this.sysGongsiinfo = sysGongsiinfo;
	}



	public SysUsers() {
        super();
    }

    public BigDecimal getUid() {
        return uid;
    }

    public void setUid(BigDecimal uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword == null ? null : upassword.trim();
    }

    public BigDecimal getSid() {
        return sid;
    }

    public void setSid(BigDecimal sid) {
        this.sid = sid;
    }

    public BigDecimal getGongsiid() {
        return gongsiid;
    }

    public void setGongsiid(BigDecimal gongsiid) {
        this.gongsiid = gongsiid;
    }

    public String getUstate() {
        return ustate;
    }

    public void setUstate(String ustate) {
        this.ustate = ustate == null ? null : ustate.trim();
    }

    public Date getLasttime() {
        return lasttime;
    }

    public void setLasttime(Date lasttime) {
        this.lasttime = lasttime;
    }

	@Override
	public String toString() {
		return "SysUsers [uid=" + uid + ", uname=" + uname + ", upassword=" + upassword + ", sid=" + sid + ", gongsiid="
				+ gongsiid + ", ustate=" + ustate + ", lasttime=" + lasttime + "]";
	}
    
}