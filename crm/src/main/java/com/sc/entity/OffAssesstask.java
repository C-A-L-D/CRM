package com.sc.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import  com.sc.entity.OffAssesstarget;
import org.springframework.format.annotation.DateTimeFormat;

public class OffAssesstask implements Serializable {
    private Long taskid;

    private String tasktitle;

    private String taskdetail;

    private String taskpublisher;

    private String assesstarget;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date taskstarttime;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date taskendtime;

    private Long companyid;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date lasttime;

    private static final long serialVersionUID = 1L;
    //配置状态
    private String state;
    
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public OffAssesstask(Long taskid, String tasktitle, String taskdetail, String taskpublisher, String assesstarget, Date taskstarttime, Date taskendtime, Long companyid, Date lasttime) {
        this.taskid = taskid;
        this.tasktitle = tasktitle;
        this.taskdetail = taskdetail;
        this.taskpublisher = taskpublisher;
        this.assesstarget = assesstarget;
        this.taskstarttime = taskstarttime;
        this.taskendtime = taskendtime;
        this.companyid = companyid;
        this.lasttime = lasttime;
    }

    public OffAssesstask() {
        super();
    }

    public Long getTaskid() {
        return taskid;
    }

    public void setTaskid(Long taskid) {
        this.taskid = taskid;
    }

    public String getTasktitle() {
        return tasktitle;
    }

    public void setTasktitle(String tasktitle) {
        this.tasktitle = tasktitle == null ? null : tasktitle.trim();
    }

    public String getTaskdetail() {
        return taskdetail;
    }

    public void setTaskdetail(String taskdetail) {
        this.taskdetail = taskdetail == null ? null : taskdetail.trim();
    }

    public String getTaskpublisher() {
        return taskpublisher;
    }

    public void setTaskpublisher(String taskpublisher) {
        this.taskpublisher = taskpublisher == null ? null : taskpublisher.trim();
    }

    public String getAssesstarget() {
        return assesstarget;
    }

    public void setAssesstarget(String assesstarget) {
        this.assesstarget = assesstarget == null ? null : assesstarget.trim();
    }

    public Date getTaskstarttime() {
        return taskstarttime;
    }

    public void setTaskstarttime(Date taskstarttime) {
        this.taskstarttime = taskstarttime;
    }

    public Date getTaskendtime() {
        return taskendtime;
    }

    public void setTaskendtime(Date taskendtime) {
        this.taskendtime = taskendtime;
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
		return "OffAssesstask [taskid=" + taskid + ", tasktitle=" + tasktitle + ", taskdetail=" + taskdetail
				+ ", taskpublisher=" + taskpublisher + ", assesstarget=" + assesstarget + ", taskstarttime="
				+ taskstarttime + ", taskendtime=" + taskendtime + ", companyid=" + companyid + ", lasttime=" + lasttime
				+ ", state=" + state + "]";
	}

	
	
    
}