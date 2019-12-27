package com.sc.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class SysUsersInfo implements Serializable {
    private BigDecimal sid;

    private String sname;

    private String ssex;

    private String sphoto;

    private String sidcard;

    private String saddressHome;

    private String saddressNow;

    private String sxl;

    private String szzmm;

    private String sschool;

    private String sphone;

    private String sphoneLine;

    private String schatLine;

    private String sshStatus;

    private BigDecimal sjobid;

    private String sstatus;

    private String sdescribe;

    private BigDecimal gongsiid;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date lasttime;
    
    private SysGongsiinfo sysGongsiinfo;

    private static final long serialVersionUID = 1L;

    public SysUsersInfo(BigDecimal sid, String sname, String ssex, String sphoto, String sidcard, String saddressHome, String saddressNow, String sxl, String szzmm, String sschool, String sphone, String sphoneLine, String schatLine, String sshStatus, BigDecimal sjobid, String sstatus, String sdescribe, BigDecimal gongsiid, Date lasttime) {
        this.sid = sid;
        this.sname = sname;
        this.ssex = ssex;
        this.sphoto = sphoto;
        this.sidcard = sidcard;
        this.saddressHome = saddressHome;
        this.saddressNow = saddressNow;
        this.sxl = sxl;
        this.szzmm = szzmm;
        this.sschool = sschool;
        this.sphone = sphone;
        this.sphoneLine = sphoneLine;
        this.schatLine = schatLine;
        this.sshStatus = sshStatus;
        this.sjobid = sjobid;
        this.sstatus = sstatus;
        this.sdescribe = sdescribe;
        this.gongsiid = gongsiid;
        this.lasttime = lasttime;
    }
    

    public SysUsersInfo(BigDecimal sid, String sname, String ssex, String sphoto, String sidcard, String saddressHome,
			String saddressNow, String sxl, String szzmm, String sschool, String sphone, String sphoneLine,
			String schatLine, String sshStatus, BigDecimal sjobid, String sstatus, String sdescribe,
			BigDecimal gongsiid, Date lasttime, SysGongsiinfo sysGongsiinfo) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.ssex = ssex;
		this.sphoto = sphoto;
		this.sidcard = sidcard;
		this.saddressHome = saddressHome;
		this.saddressNow = saddressNow;
		this.sxl = sxl;
		this.szzmm = szzmm;
		this.sschool = sschool;
		this.sphone = sphone;
		this.sphoneLine = sphoneLine;
		this.schatLine = schatLine;
		this.sshStatus = sshStatus;
		this.sjobid = sjobid;
		this.sstatus = sstatus;
		this.sdescribe = sdescribe;
		this.gongsiid = gongsiid;
		this.lasttime = lasttime;
		this.sysGongsiinfo = sysGongsiinfo;
	}


	public SysGongsiinfo getSysGongsiinfo() {
		return sysGongsiinfo;
	}


	public void setSysGongsiinfo(SysGongsiinfo sysGongsiinfo) {
		this.sysGongsiinfo = sysGongsiinfo;
	}


	public SysUsersInfo() {
        super();
    }

    public BigDecimal getSid() {
        return sid;
    }

    public void setSid(BigDecimal sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex == null ? null : ssex.trim();
    }

    public String getSphoto() {
        return sphoto;
    }

    public void setSphoto(String sphoto) {
        this.sphoto = sphoto == null ? null : sphoto.trim();
    }

    public String getSidcard() {
        return sidcard;
    }

    public void setSidcard(String sidcard) {
        this.sidcard = sidcard == null ? null : sidcard.trim();
    }

    public String getSaddressHome() {
        return saddressHome;
    }

    public void setSaddressHome(String saddressHome) {
        this.saddressHome = saddressHome == null ? null : saddressHome.trim();
    }

    public String getSaddressNow() {
        return saddressNow;
    }

    public void setSaddressNow(String saddressNow) {
        this.saddressNow = saddressNow == null ? null : saddressNow.trim();
    }

    public String getSxl() {
        return sxl;
    }

    public void setSxl(String sxl) {
        this.sxl = sxl == null ? null : sxl.trim();
    }

    public String getSzzmm() {
        return szzmm;
    }

    public void setSzzmm(String szzmm) {
        this.szzmm = szzmm == null ? null : szzmm.trim();
    }

    public String getSschool() {
        return sschool;
    }

    public void setSschool(String sschool) {
        this.sschool = sschool == null ? null : sschool.trim();
    }

    public String getSphone() {
        return sphone;
    }

    public void setSphone(String sphone) {
        this.sphone = sphone == null ? null : sphone.trim();
    }

    public String getSphoneLine() {
        return sphoneLine;
    }

    public void setSphoneLine(String sphoneLine) {
        this.sphoneLine = sphoneLine == null ? null : sphoneLine.trim();
    }

    public String getSchatLine() {
        return schatLine;
    }

    public void setSchatLine(String schatLine) {
        this.schatLine = schatLine == null ? null : schatLine.trim();
    }

    public String getSshStatus() {
        return sshStatus;
    }

    public void setSshStatus(String sshStatus) {
        this.sshStatus = sshStatus == null ? null : sshStatus.trim();
    }

    public BigDecimal getSjobid() {
        return sjobid;
    }

    public void setSjobid(BigDecimal sjobid) {
        this.sjobid = sjobid;
    }

    public String getSstatus() {
        return sstatus;
    }

    public void setSstatus(String sstatus) {
        this.sstatus = sstatus == null ? null : sstatus.trim();
    }

    public String getSdescribe() {
        return sdescribe;
    }

    public void setSdescribe(String sdescribe) {
        this.sdescribe = sdescribe == null ? null : sdescribe.trim();
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
		return "SysUsersInfo [sid=" + sid + ", sname=" + sname + ", ssex=" + ssex + ", sphoto=" + sphoto + ", sidcard="
				+ sidcard + ", saddressHome=" + saddressHome + ", saddressNow=" + saddressNow + ", sxl=" + sxl
				+ ", szzmm=" + szzmm + ", sschool=" + sschool + ", sphone=" + sphone + ", sphoneLine=" + sphoneLine
				+ ", schatLine=" + schatLine + ", sshStatus=" + sshStatus + ", sjobid=" + sjobid + ", sstatus="
				+ sstatus + ", sdescribe=" + sdescribe + ", gongsiid=" + gongsiid + ", lasttime=" + lasttime
				+ ", sysGongsiinfo=" + sysGongsiinfo + "]";
	}
    
}