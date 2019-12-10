package com.sc.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class SysGongsiinfo implements Serializable {
    private BigDecimal id;

    private String gname;

    private String gcode;

    private String gemail;

    private String glinkman;

    private String gaddress;

    private String gtel;

    private String gphone;

    private String gchuanzhen;

    private String gopenyinghang;

    private String gyinghangaccount;

    private String gtf;

    private String gdescribe;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date lasttime;

    private static final long serialVersionUID = 1L;

    public SysGongsiinfo(BigDecimal id, String gname, String gcode, String gemail, String glinkman, String gaddress, String gtel, String gphone, String gchuanzhen, String gopenyinghang, String gyinghangaccount, String gtf, String gdescribe, Date lasttime) {
        this.id = id;
        this.gname = gname;
        this.gcode = gcode;
        this.gemail = gemail;
        this.glinkman = glinkman;
        this.gaddress = gaddress;
        this.gtel = gtel;
        this.gphone = gphone;
        this.gchuanzhen = gchuanzhen;
        this.gopenyinghang = gopenyinghang;
        this.gyinghangaccount = gyinghangaccount;
        this.gtf = gtf;
        this.gdescribe = gdescribe;
        this.lasttime = lasttime;
    }

    public SysGongsiinfo() {
        super();
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname == null ? null : gname.trim();
    }

    public String getGcode() {
        return gcode;
    }

    public void setGcode(String gcode) {
        this.gcode = gcode == null ? null : gcode.trim();
    }

    public String getGemail() {
        return gemail;
    }

    public void setGemail(String gemail) {
        this.gemail = gemail == null ? null : gemail.trim();
    }

    public String getGlinkman() {
        return glinkman;
    }

    public void setGlinkman(String glinkman) {
        this.glinkman = glinkman == null ? null : glinkman.trim();
    }

    public String getGaddress() {
        return gaddress;
    }

    public void setGaddress(String gaddress) {
        this.gaddress = gaddress == null ? null : gaddress.trim();
    }

    public String getGtel() {
        return gtel;
    }

    public void setGtel(String gtel) {
        this.gtel = gtel == null ? null : gtel.trim();
    }

    public String getGphone() {
        return gphone;
    }

    public void setGphone(String gphone) {
        this.gphone = gphone == null ? null : gphone.trim();
    }

    public String getGchuanzhen() {
        return gchuanzhen;
    }

    public void setGchuanzhen(String gchuanzhen) {
        this.gchuanzhen = gchuanzhen == null ? null : gchuanzhen.trim();
    }

    public String getGopenyinghang() {
        return gopenyinghang;
    }

    public void setGopenyinghang(String gopenyinghang) {
        this.gopenyinghang = gopenyinghang == null ? null : gopenyinghang.trim();
    }

    public String getGyinghangaccount() {
        return gyinghangaccount;
    }

    public void setGyinghangaccount(String gyinghangaccount) {
        this.gyinghangaccount = gyinghangaccount == null ? null : gyinghangaccount.trim();
    }

    public String getGtf() {
        return gtf;
    }

    public void setGtf(String gtf) {
        this.gtf = gtf == null ? null : gtf.trim();
    }

    public String getGdescribe() {
        return gdescribe;
    }

    public void setGdescribe(String gdescribe) {
        this.gdescribe = gdescribe == null ? null : gdescribe.trim();
    }

    public Date getLasttime() {
        return lasttime;
    }

    public void setLasttime(Date lasttime) {
        this.lasttime = lasttime;
    }

	@Override
	public String toString() {
		return "SysGongsiinfo [id=" + id + ", gname=" + gname + ", gcode=" + gcode + ", gemail=" + gemail
				+ ", glinkman=" + glinkman + ", gaddress=" + gaddress + ", gtel=" + gtel + ", gphone=" + gphone
				+ ", gchuanzhen=" + gchuanzhen + ", gopenyinghang=" + gopenyinghang + ", gyinghangaccount="
				+ gyinghangaccount + ", gtf=" + gtf + ", gdescribe=" + gdescribe + ", lasttime=" + lasttime + "]";
	}
    
}