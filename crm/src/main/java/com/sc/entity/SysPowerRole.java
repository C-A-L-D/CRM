package com.sc.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class SysPowerRole implements Serializable {
    private BigDecimal id;

    private BigDecimal pcolumnId;

    private BigDecimal roleId;

    private BigDecimal caozuopersonId;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date lasttime;

    private static final long serialVersionUID = 1L;

    public SysPowerRole(BigDecimal id, BigDecimal pcolumnId, BigDecimal roleId, BigDecimal caozuopersonId, Date lasttime) {
        this.id = id;
        this.pcolumnId = pcolumnId;
        this.roleId = roleId;
        this.caozuopersonId = caozuopersonId;
        this.lasttime = lasttime;
    }

    public SysPowerRole() {
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

	@Override
	public String toString() {
		return "SysPowerRole [id=" + id + ", pcolumnId=" + pcolumnId + ", roleId=" + roleId + ", caozuopersonId="
				+ caozuopersonId + ", lasttime=" + lasttime + "]";
	}
    
}