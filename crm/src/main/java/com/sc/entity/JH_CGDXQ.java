package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

public class JH_CGDXQ implements Serializable {
    private Long cgXqId;

    private Long cgdId;

    private Long cpId;

    private Long cpNumber;

    private String isRk;

    private String operator;

    private String remark;

    private Long gsId;

    private Date ltime;

    private String isrk;

    private static final long serialVersionUID = 1L;

    public JH_CGDXQ(Long cgXqId, Long cgdId, Long cpId, Long cpNumber, String isRk, String operator, String remark, Long gsId, Date ltime, String isrk) {
        this.cgXqId = cgXqId;
        this.cgdId = cgdId;
        this.cpId = cpId;
        this.cpNumber = cpNumber;
        this.isRk = isRk;
        this.operator = operator;
        this.remark = remark;
        this.gsId = gsId;
        this.ltime = ltime;
        this.isrk = isrk;
    }

    public JH_CGDXQ() {
        super();
    }

    public Long getCgXqId() {
        return cgXqId;
    }

    public void setCgXqId(Long cgXqId) {
        this.cgXqId = cgXqId;
    }

    public Long getCgdId() {
        return cgdId;
    }

    public void setCgdId(Long cgdId) {
        this.cgdId = cgdId;
    }

    public Long getCpId() {
        return cpId;
    }

    public void setCpId(Long cpId) {
        this.cpId = cpId;
    }

    public Long getCpNumber() {
        return cpNumber;
    }

    public void setCpNumber(Long cpNumber) {
        this.cpNumber = cpNumber;
    }

    public String getIsRk() {
        return isRk;
    }

    public void setIsRk(String isRk) {
        this.isRk = isRk == null ? null : isRk.trim();
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

    public String getIsrk() {
        return isrk;
    }

    public void setIsrk(String isrk) {
        this.isrk = isrk == null ? null : isrk.trim();
    }
}