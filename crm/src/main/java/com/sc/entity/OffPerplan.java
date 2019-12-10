package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class OffPerplan implements Serializable {
    private Long planid;

    private String plankind;

    private String plantheme;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date starttime;

    private Long writeperid;

    private String plandesc;

    private Long companyid;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date lasttime;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date startdate;

    private static final long serialVersionUID = 1L;

    public OffPerplan(Long planid, String plankind, String plantheme, Date starttime, Long writeperid, String plandesc, Long companyid, Date lasttime, Date startdate) {
        this.planid = planid;
        this.plankind = plankind;
        this.plantheme = plantheme;
        this.starttime = starttime;
        this.writeperid = writeperid;
        this.plandesc = plandesc;
        this.companyid = companyid;
        this.lasttime = lasttime;
        this.startdate = startdate;
    }

    public OffPerplan() {
        super();
    }

    public Long getPlanid() {
        return planid;
    }

    public void setPlanid(Long planid) {
        this.planid = planid;
    }

    public String getPlankind() {
        return plankind;
    }

    public void setPlankind(String plankind) {
        this.plankind = plankind == null ? null : plankind.trim();
    }

    public String getPlantheme() {
        return plantheme;
    }

    public void setPlantheme(String plantheme) {
        this.plantheme = plantheme == null ? null : plantheme.trim();
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Long getWriteperid() {
        return writeperid;
    }

    public void setWriteperid(Long writeperid) {
        this.writeperid = writeperid;
    }

    public String getPlandesc() {
        return plandesc;
    }

    public void setPlandesc(String plandesc) {
        this.plandesc = plandesc == null ? null : plandesc.trim();
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

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

	@Override
	public String toString() {
		return "OffPerplan [planid=" + planid + ", plankind=" + plankind + ", plantheme=" + plantheme + ", starttime="
				+ starttime + ", writeperid=" + writeperid + ", plandesc=" + plandesc + ", companyid=" + companyid
				+ ", lasttime=" + lasttime + ", startdate=" + startdate + "]";
	}
    
}