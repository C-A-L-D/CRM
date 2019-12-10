package com.sc.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class StoreGinfo implements Serializable {
    private BigDecimal gid;

    private String gname;

    private String gcategopy;

    private String gdesp;

    private String gunit;

    private BigDecimal whid;

    private BigDecimal storenum;

    private BigDecimal pricebuy;

    private BigDecimal pricesold;

    private BigDecimal priceact;

    private String remark;

    private BigDecimal cid;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date lasttime;

    private static final long serialVersionUID = 1L;

    public StoreGinfo(BigDecimal gid, String gname, String gcategopy, String gdesp, String gunit, BigDecimal whid, BigDecimal storenum, BigDecimal pricebuy, BigDecimal pricesold, BigDecimal priceact, String remark, BigDecimal cid, Date lasttime) {
        this.gid = gid;
        this.gname = gname;
        this.gcategopy = gcategopy;
        this.gdesp = gdesp;
        this.gunit = gunit;
        this.whid = whid;
        this.storenum = storenum;
        this.pricebuy = pricebuy;
        this.pricesold = pricesold;
        this.priceact = priceact;
        this.remark = remark;
        this.cid = cid;
        this.lasttime = lasttime;
    }

    public StoreGinfo() {
        super();
    }

    public BigDecimal getGid() {
        return gid;
    }

    public void setGid(BigDecimal gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname == null ? null : gname.trim();
    }

    public String getGcategopy() {
        return gcategopy;
    }

    public void setGcategopy(String gcategopy) {
        this.gcategopy = gcategopy == null ? null : gcategopy.trim();
    }

    public String getGdesp() {
        return gdesp;
    }

    public void setGdesp(String gdesp) {
        this.gdesp = gdesp == null ? null : gdesp.trim();
    }

    public String getGunit() {
        return gunit;
    }

    public void setGunit(String gunit) {
        this.gunit = gunit == null ? null : gunit.trim();
    }

    public BigDecimal getWhid() {
        return whid;
    }

    public void setWhid(BigDecimal whid) {
        this.whid = whid;
    }

    public BigDecimal getStorenum() {
        return storenum;
    }

    public void setStorenum(BigDecimal storenum) {
        this.storenum = storenum;
    }

    public BigDecimal getPricebuy() {
        return pricebuy;
    }

    public void setPricebuy(BigDecimal pricebuy) {
        this.pricebuy = pricebuy;
    }

    public BigDecimal getPricesold() {
        return pricesold;
    }

    public void setPricesold(BigDecimal pricesold) {
        this.pricesold = pricesold;
    }

    public BigDecimal getPriceact() {
        return priceact;
    }

    public void setPriceact(BigDecimal priceact) {
        this.priceact = priceact;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public BigDecimal getCid() {
        return cid;
    }

    public void setCid(BigDecimal cid) {
        this.cid = cid;
    }

    public Date getLasttime() {
        return lasttime;
    }

    public void setLasttime(Date lasttime) {
        this.lasttime = lasttime;
    }

	@Override
	public String toString() {
		return "StoreGinfo [gid=" + gid + ", gname=" + gname + ", gcategopy=" + gcategopy + ", gdesp=" + gdesp
				+ ", gunit=" + gunit + ", whid=" + whid + ", storenum=" + storenum + ", pricebuy=" + pricebuy
				+ ", pricesold=" + pricesold + ", priceact=" + priceact + ", remark=" + remark + ", cid=" + cid
				+ ", lasttime=" + lasttime + "]";
	}
    
}