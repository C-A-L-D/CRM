package com.sc.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SYS_POWER_ROLE implements Serializable {
    private BigDecimal id;

    private BigDecimal pcolumnId;

    private BigDecimal roleId;

    private BigDecimal caozuopersonId;

    private Date lasttime;

    private static final long serialVersionUID = 1L;

    public SYS_POWER_ROLE(BigDecimal id, BigDecimal pcolumnId, BigDecimal roleId, BigDecimal caozuopersonId, Date lasttime) {
        this.id = id;
        this.pcolumnId = pcolumnId;
        this.roleId = roleId;
        this.caozuopersonId = caozuopersonId;
        this.lasttime = lasttime;
    }

    public SYS_POWER_ROLE() {
        super();
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getPcolumnId() {
        return pcolumnId;
    }

    public void setPcolumnId(BigDecimal pcolumnId) {
        this.pcolumnId = pcolumnId;
    }

    public BigDecimal getRoleId() {
        return roleId;
    }

    public void setRoleId(BigDecimal roleId) {
        this.roleId = roleId;
    }

    public BigDecimal getCaozuopersonId() {
        return caozuopersonId;
    }

    public void setCaozuopersonId(BigDecimal caozuopersonId) {
        this.caozuopersonId = caozuopersonId;
    }

    public Date getLasttime() {
        return lasttime;
    }

    public void setLasttime(Date lasttime) {
        this.lasttime = lasttime;
    }
}