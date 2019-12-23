package com.sc.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

public class SysPowerinfo implements Serializable {
    private BigDecimal pid;

    private String pname;

    private String ppower;

    private BigDecimal pcolumnId;

    private String pdescribe;

    private Date lasttime;

    private SysPowercolumn sysPowercolumn;
    
    private static final long serialVersionUID = 1L;

    public SysPowerinfo(BigDecimal pid, String pname, String ppower, BigDecimal pcolumnId, String pdescribe, Date lasttime) {
        this.pid = pid;
        this.pname = pname;
        this.ppower = ppower;
        this.pcolumnId = pcolumnId;
        this.pdescribe = pdescribe;
        this.lasttime = lasttime;
    }
    
    public SysPowerinfo(BigDecimal pid, String pname, String ppower, BigDecimal pcolumnId, String pdescribe,
			Date lasttime, SysPowercolumn sysPowercolumn) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.ppower = ppower;
		this.pcolumnId = pcolumnId;
		this.pdescribe = pdescribe;
		this.lasttime = lasttime;
		this.sysPowercolumn = sysPowercolumn;
	}  

	public SysPowercolumn getSysPowercolumn() {
		return sysPowercolumn;
	}

	public void setSysPowercolumn(SysPowercolumn sysPowercolumn) {
		this.sysPowercolumn = sysPowercolumn;
	}

	public SysPowerinfo() {
        super();
    }

    public BigDecimal getPid() {
        return pid;
    }

    public void setPid(BigDecimal pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    public String getPpower() {
        return ppower;
    }

    public void setPpower(String ppower) {
        this.ppower = ppower == null ? null : ppower.trim();
    }

    public BigDecimal getPcolumnId() {
        return pcolumnId;
    }

    public void setPcolumnId(BigDecimal pcolumnId) {
        this.pcolumnId = pcolumnId;
    }

    public String getPdescribe() {
        return pdescribe;
    }

    public void setPdescribe(String pdescribe) {
        this.pdescribe = pdescribe == null ? null : pdescribe.trim();
    }

    public Date getLasttime() {
        return lasttime;
    }

    public void setLasttime(Date lasttime) {
        this.lasttime = lasttime;
    }

	@Override
	public String toString() {
		return "SysPowerinfo [pid=" + pid + ", pname=" + pname + ", ppower=" + ppower + ", pcolumnId=" + pcolumnId
				+ ", pdescribe=" + pdescribe + ", lasttime=" + lasttime + ", sysPowercolumn=" + sysPowercolumn + "]";
	}
    
}