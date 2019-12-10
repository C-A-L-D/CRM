package com.sc.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class SysLoggong implements Serializable {
    private BigDecimal lid;

    private BigDecimal uid;

    private String ip;

    private String power;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date time;

    private BigDecimal gongsiid;

    private static final long serialVersionUID = 1L;

    public SysLoggong(BigDecimal lid, BigDecimal uid, String ip, String power, Date time, BigDecimal gongsiid) {
        this.lid = lid;
        this.uid = uid;
        this.ip = ip;
        this.power = power;
        this.time = time;
        this.gongsiid = gongsiid;
    }

    public SysLoggong() {
        super();
    }

    public BigDecimal getLid() {
        return lid;
    }

    public void setLid(BigDecimal lid) {
        this.lid = lid;
    }

    public BigDecimal getUid() {
        return uid;
    }

    public void setUid(BigDecimal uid) {
        this.uid = uid;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power == null ? null : power.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public BigDecimal getGongsiid() {
        return gongsiid;
    }

    public void setGongsiid(BigDecimal gongsiid) {
        this.gongsiid = gongsiid;
    }

	@Override
	public String toString() {
		return "SysLoggong [lid=" + lid + ", uid=" + uid + ", ip=" + ip + ", power=" + power + ", time=" + time
				+ ", gongsiid=" + gongsiid + "]";
	}
    
}