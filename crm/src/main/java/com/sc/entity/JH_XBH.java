package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

public class JH_XBH implements Serializable {
    private Long id;

    private Long cpId;

    private Date jhTime;

    private String state;

    private String operator;

    private String remark;

    private Long gsId;

    private Date ltime;

    private static final long serialVersionUID = 1L;

    public JH_XBH(Long id, Long cpId, Date jhTime, String state, String operator, String remark, Long gsId, Date ltime) {
        this.id = id;
        this.cpId = cpId;
        this.jhTime = jhTime;
        this.state = state;
        this.operator = operator;
        this.remark = remark;
        this.gsId = gsId;
        this.ltime = ltime;
    }

    public JH_XBH() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCpId() {
        return cpId;
    }

    public void setCpId(Long cpId) {
        this.cpId = cpId;
    }

    public Date getJhTime() {
        return jhTime;
    }

    public void setJhTime(Date jhTime) {
        this.jhTime = jhTime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
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
}