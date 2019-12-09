package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

public class OFF_ASSESSTARGET implements Serializable {
    private Long targetid;

    private String assesstarget;

    private String remarks;

    private Long companyid;

    private Date lasttime;

    private static final long serialVersionUID = 1L;

    public OFF_ASSESSTARGET(Long targetid, String assesstarget, String remarks, Long companyid, Date lasttime) {
        this.targetid = targetid;
        this.assesstarget = assesstarget;
        this.remarks = remarks;
        this.companyid = companyid;
        this.lasttime = lasttime;
    }

    public OFF_ASSESSTARGET() {
        super();
    }

    public Long getTargetid() {
        return targetid;
    }

    public void setTargetid(Long targetid) {
        this.targetid = targetid;
    }

    public String getAssesstarget() {
        return assesstarget;
    }

    public void setAssesstarget(String assesstarget) {
        this.assesstarget = assesstarget == null ? null : assesstarget.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
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
}