package com.sc.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class JH_CGD implements Serializable {
    private Long cgdId;

    private String cgTheme;

    private Date cgTime;

    private String gysId;

    private BigDecimal hkMoney;

    private String fkqk;

    private String cgJz;

    private Date jhtime;

    private String jhplace;

    private String jhway;

    private String operator;

    private String remark;

    private Long gsId;

    private Date ltime;

    private String fphm;

    private static final long serialVersionUID = 1L;

    public JH_CGD(Long cgdId, String cgTheme, Date cgTime, String gysId, BigDecimal hkMoney, String fkqk, String cgJz, Date jhtime, String jhplace, String jhway, String operator, String remark, Long gsId, Date ltime, String fphm) {
        this.cgdId = cgdId;
        this.cgTheme = cgTheme;
        this.cgTime = cgTime;
        this.gysId = gysId;
        this.hkMoney = hkMoney;
        this.fkqk = fkqk;
        this.cgJz = cgJz;
        this.jhtime = jhtime;
        this.jhplace = jhplace;
        this.jhway = jhway;
        this.operator = operator;
        this.remark = remark;
        this.gsId = gsId;
        this.ltime = ltime;
        this.fphm = fphm;
    }

    public JH_CGD() {
        super();
    }

    public Long getCgdId() {
        return cgdId;
    }

    public void setCgdId(Long cgdId) {
        this.cgdId = cgdId;
    }

    public String getCgTheme() {
        return cgTheme;
    }

    public void setCgTheme(String cgTheme) {
        this.cgTheme = cgTheme == null ? null : cgTheme.trim();
    }

    public Date getCgTime() {
        return cgTime;
    }

    public void setCgTime(Date cgTime) {
        this.cgTime = cgTime;
    }

    public String getGysId() {
        return gysId;
    }

    public void setGysId(String gysId) {
        this.gysId = gysId == null ? null : gysId.trim();
    }

    public BigDecimal getHkMoney() {
        return hkMoney;
    }

    public void setHkMoney(BigDecimal hkMoney) {
        this.hkMoney = hkMoney;
    }

    public String getFkqk() {
        return fkqk;
    }

    public void setFkqk(String fkqk) {
        this.fkqk = fkqk == null ? null : fkqk.trim();
    }

    public String getCgJz() {
        return cgJz;
    }

    public void setCgJz(String cgJz) {
        this.cgJz = cgJz == null ? null : cgJz.trim();
    }

    public Date getJhtime() {
        return jhtime;
    }

    public void setJhtime(Date jhtime) {
        this.jhtime = jhtime;
    }

    public String getJhplace() {
        return jhplace;
    }

    public void setJhplace(String jhplace) {
        this.jhplace = jhplace == null ? null : jhplace.trim();
    }

    public String getJhway() {
        return jhway;
    }

    public void setJhway(String jhway) {
        this.jhway = jhway == null ? null : jhway.trim();
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Long getGsId() {
        return gsId;
    }

    public void setGsId(Long gsId) {
        this.gsId = gsId;
    }

    public Date getLtime() {
        return ltime;
    }

    public void setLtime(Date ltime) {
        this.ltime = ltime;
    }

    public String getFphm() {
        return fphm;
    }

    public void setFphm(String fphm) {
        this.fphm = fphm == null ? null : fphm.trim();
    }
}