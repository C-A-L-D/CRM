package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

public class OFF_MESS implements Serializable {
    private Long messid;

    private String title;

    private String content;

    private String sender;

    private Long companyid;

    private Date lasttime;

    private static final long serialVersionUID = 1L;

    public OFF_MESS(Long messid, String title, String content, String sender, Long companyid, Date lasttime) {
        this.messid = messid;
        this.title = title;
        this.content = content;
        this.sender = sender;
        this.companyid = companyid;
        this.lasttime = lasttime;
    }

    public OFF_MESS() {
        super();
    }

    public Long getMessid() {
        return messid;
    }

    public void setMessid(Long messid) {
        this.messid = messid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender == null ? null : sender.trim();
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