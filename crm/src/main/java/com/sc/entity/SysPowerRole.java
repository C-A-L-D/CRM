package com.sc.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SysPowerRole implements Serializable {
    private BigDecimal id;

    private BigDecimal pid;

    private BigDecimal roleId;

    private BigDecimal caozuopersonId;

    private Date lasttime;

    private static final long serialVersionUID = 1L;

    public SysPowerRole(BigDecimal id, BigDecimal pid, BigDecimal roleId, BigDecimal caozuopersonId, Date lasttime) {
        this.id = id;
        this.pid = pid;
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

    public BigDecimal getPid() {
        return pid;
    }

    public void setPid(BigDecimal pid) {
        this.pid = pid;
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
		return "SysPowerRole [id=" + id + ", pid=" + pid + ", roleId=" + roleId + ", caozuopersonId=" + caozuopersonId
				+ ", lasttime=" + lasttime + "]";
	}
    
}