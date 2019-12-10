package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class OffMessdetail implements Serializable {
    private Long detailid;

    private Long messid;

    private Long receiverid;

    private String messstate;

    private Long companyid;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date lasttime;

    private static final long serialVersionUID = 1L;

    public OffMessdetail(Long detailid, Long messid, Long receiverid, String messstate, Long companyid, Date lasttime) {
        this.detailid = detailid;
        this.messid = messid;
        this.receiverid = receiverid;
        this.messstate = messstate;
        this.companyid = companyid;
        this.lasttime = lasttime;
    }

    public OffMessdetail() {
        super();
    }

    public Long getDetailid() {
        return detailid;
    }

    public void setDetailid(Long detailid) {
        this.detailid = detailid;
    }

    public Long getMessid() {
        return messid;
    }

    public void setMessid(Long messid) {
        this.messid = messid;
    }

    public Long getReceiverid() {
        return receiverid;
    }

    public void setReceiverid(Long receiverid) {
        this.receiverid = receiverid;
    }

    public String getMessstate() {
        return messstate;
    }

    public void setMessstate(String messstate) {
        this.messstate = messstate == null ? null : messstate.trim();
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
		return "OffMessdetail [detailid=" + detailid + ", messid=" + messid + ", receiverid=" + receiverid
				+ ", messstate=" + messstate + ", companyid=" + companyid + ", lasttime=" + lasttime + "]";
	}
    
}