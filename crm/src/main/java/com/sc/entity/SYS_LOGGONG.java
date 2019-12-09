package com.sc.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SYS_LOGGONG implements Serializable {
    private BigDecimal lid;

    private BigDecimal uid;

    private String ip;

    private String power;

    private Date time;

    private BigDecimal gongsiid;

    private static final long serialVersionUID = 1L;

    public SYS_LOGGONG(BigDecimal lid, BigDecimal uid, String ip, String power, Date time, BigDecimal gongsiid) {
        this.lid = lid;
        this.uid = uid;
        this.ip = ip;
        this.power = power;
        this.time = time;
        this.gongsiid = gongsiid;
    }

    public SYS_LOGGONG() {
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
}