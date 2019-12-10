package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class XiaoshouEhuluiamxijilu implements Serializable {
    private Long ljid;

    private String lianxibiaoti;

    private String lianxishijian;

    private Long kid;

    private String lianxineirong;

    private Long gid;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date lasttime;

    private static final long serialVersionUID = 1L;

    public XiaoshouEhuluiamxijilu(Long ljid, String lianxibiaoti, String lianxishijian, Long kid, String lianxineirong, Long gid, Date lasttime) {
        this.ljid = ljid;
        this.lianxibiaoti = lianxibiaoti;
        this.lianxishijian = lianxishijian;
        this.kid = kid;
        this.lianxineirong = lianxineirong;
        this.gid = gid;
        this.lasttime = lasttime;
    }

    public XiaoshouEhuluiamxijilu() {
        super();
    }

    public Long getLjid() {
        return ljid;
    }

    public void setLjid(Long ljid) {
        this.ljid = ljid;
    }

    public String getLianxibiaoti() {
        return lianxibiaoti;
    }

    public void setLianxibiaoti(String lianxibiaoti) {
        this.lianxibiaoti = lianxibiaoti == null ? null : lianxibiaoti.trim();
    }

    public String getLianxishijian() {
        return lianxishijian;
    }

    public void setLianxishijian(String lianxishijian) {
        this.lianxishijian = lianxishijian == null ? null : lianxishijian.trim();
    }

    public Long getKid() {
        return kid;
    }

    public void setKid(Long kid) {
        this.kid = kid;
    }

    public String getLianxineirong() {
        return lianxineirong;
    }

    public void setLianxineirong(String lianxineirong) {
        this.lianxineirong = lianxineirong == null ? null : lianxineirong.trim();
    }

    public Long getGid() {
        return gid;
    }

    public void setGid(Long gid) {
        this.gid = gid;
    }

    public Date getLasttime() {
        return lasttime;
    }

    public void setLasttime(Date lasttime) {
        this.lasttime = lasttime;
    }

	@Override
	public String toString() {
		return "XiaoshouEhuluiamxijilu [ljid=" + ljid + ", lianxibiaoti=" + lianxibiaoti + ", lianxishijian="
				+ lianxishijian + ", kid=" + kid + ", lianxineirong=" + lianxineirong + ", gid=" + gid + ", lasttime="
				+ lasttime + "]";
	}
    
}