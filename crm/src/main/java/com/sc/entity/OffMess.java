package com.sc.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

public class OffMess implements Serializable {
    private Long messid;

    private String title;

    private String content;

    private String sender;

    private Long companyid;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date lasttime;

    private static final long serialVersionUID = 1L;
   
  //一对一配置start
	private List<OffMessdetail> offMessdetail;
	
	public List<OffMessdetail> getOffMessdetail() {
		return offMessdetail;
	}

	public void setOffMessdetail(List<OffMessdetail> offMessdetail) {
		this.offMessdetail = offMessdetail;
	}
	//一对一配置end

	public OffMess(Long messid, String title, String content, String sender, Long companyid, Date lasttime) {
        this.messid = messid;
        this.title = title;
        this.content = content;
        this.sender = sender;
        this.companyid = companyid;
        this.lasttime = lasttime;
    }

    public OffMess() {
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

	@Override
	public String toString() {
		return "OffMess [messid=" + messid + ", title=" + title + ", content=" + content + ", sender=" + sender
				+ ", companyid=" + companyid + ", lasttime=" + lasttime + ", offMessdetail=" + offMessdetail
				+ "]";
	}

	
}