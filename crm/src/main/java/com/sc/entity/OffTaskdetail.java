package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class OffTaskdetail implements Serializable {
    private Long id;

    private Long taskid;

    private Long acceptuserid;

    private String isfinish;

    private String state;

    private Long companyid;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date lasttime;

    private static final long serialVersionUID = 1L;

    public OffTaskdetail(Long id, Long taskid, Long acceptuserid, String isfinish, String state, Long companyid, Date lasttime) {
        this.id = id;
        this.taskid = taskid;
        this.acceptuserid = acceptuserid;
        this.isfinish = isfinish;
        this.state = state;
        this.companyid = companyid;
        this.lasttime = lasttime;
    }

    public OffTaskdetail() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTaskid() {
        return taskid;
    }

    public void setTaskid(Long taskid) {
        this.taskid = taskid;
    }

    public Long getAcceptuserid() {
        return acceptuserid;
    }

    public void setAcceptuserid(Long acceptuserid) {
        this.acceptuserid = acceptuserid;
    }

    public String getIsfinish() {
        return isfinish;
    }

    public void setIsfinish(String isfinish) {
        this.isfinish = isfinish == null ? null : isfinish.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Long getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Long companyid) {
        this.companyid = companyid;
    }

    public Date getLasttime() {
        return lasttime;
    }

    public void setLasttime(Date lasttime) {
        this.lasttime = lasttime;
    }

	@Override
	public String toString() {
		return "OffTaskdetail [id=" + id + ", taskid=" + taskid + ", acceptuserid=" + acceptuserid + ", isfinish="
				+ isfinish + ", state=" + state + ", companyid=" + companyid + ", lasttime=" + lasttime + "]";
	}
    
}