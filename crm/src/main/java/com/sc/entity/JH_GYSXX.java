package com.sc.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class JH_GYSXX implements Serializable {
    private BigDecimal gysId;

    private String gysName;

    private String gysJc;

    private String lxr;

    private String gdPhone;

    private String ydPhone;

    private String lxcz;

    private String lxdz;

    private String lxyb;

    private String mail;

    private String khbank;

    private String yhzh;

    private String gszy;

    private String isYx;

    private String operator;

    private String remark;

    private BigDecimal gsId;

    private Date ltime;

    private static final long serialVersionUID = 1L;

    public JH_GYSXX(BigDecimal gysId, String gysName, String gysJc, String lxr, String gdPhone, String ydPhone, String lxcz, String lxdz, String lxyb, String mail, String khbank, String yhzh, String gszy, String isYx, String operator, String remark, BigDecimal gsId, Date ltime) {
        this.gysId = gysId;
        this.gysName = gysName;
        this.gysJc = gysJc;
        this.lxr = lxr;
        this.gdPhone = gdPhone;
        this.ydPhone = ydPhone;
        this.lxcz = lxcz;
        this.lxdz = lxdz;
        this.lxyb = lxyb;
        this.mail = mail;
        this.khbank = khbank;
        this.yhzh = yhzh;
        this.gszy = gszy;
        this.isYx = isYx;
        this.operator = operator;
        this.remark = remark;
        this.gsId = gsId;
        this.ltime = ltime;
    }

    public JH_GYSXX() {
        super();
    }

    public BigDecimal getGysId() {
        return gysId;
    }

    public void setGysId(BigDecimal gysId) {
        this.gysId = gysId;
    }

    public String getGysName() {
        return gysName;
    }

    public void setGysName(String gysName) {
        this.gysName = gysName == null ? null : gysName.trim();
    }

    public String getGysJc() {
        return gysJc;
    }

    public void setGysJc(String gysJc) {
        this.gysJc = gysJc == null ? null : gysJc.trim();
    }

    public String getLxr() {
        return lxr;
    }

    public void setLxr(String lxr) {
        this.lxr = lxr == null ? null : lxr.trim();
    }

    public String getGdPhone() {
        return gdPhone;
    }

    public void setGdPhone(String gdPhone) {
        this.gdPhone = gdPhone == null ? null : gdPhone.trim();
    }

    public String getYdPhone() {
        return ydPhone;
    }

    public void setYdPhone(String ydPhone) {
        this.ydPhone = ydPhone == null ? null : ydPhone.trim();
    }

    public String getLxcz() {
        return lxcz;
    }

    public void setLxcz(String lxcz) {
        this.lxcz = lxcz == null ? null : lxcz.trim();
    }

    public String getLxdz() {
        return lxdz;
    }

    public void setLxdz(String lxdz) {
        this.lxdz = lxdz == null ? null : lxdz.trim();
    }

    public String getLxyb() {
        return lxyb;
    }

    public void setLxyb(String lxyb) {
        this.lxyb = lxyb == null ? null : lxyb.trim();
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail == null ? null : mail.trim();
    }

    public String getKhbank() {
        return khbank;
    }

    public void setKhbank(String khbank) {
        this.khbank = khbank == null ? null : khbank.trim();
    }

    public String getYhzh() {
        return yhzh;
    }

    public void setYhzh(String yhzh) {
        this.yhzh = yhzh == null ? null : yhzh.trim();
    }

    public String getGszy() {
        return gszy;
    }

    public void setGszy(String gszy) {
        this.gszy = gszy == null ? null : gszy.trim();
    }

    public String getIsYx() {
        return isYx;
    }

    public void setIsYx(String isYx) {
        this.isYx = isYx == null ? null : isYx.trim();
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

    public BigDecimal getGsId() {
        return gsId;
    }

    public void setGsId(BigDecimal gsId) {
        this.gsId = gsId;
    }

    public Date getLtime() {
        return ltime;
    }

    public void setLtime(Date ltime) {
        this.ltime = ltime;
    }
}