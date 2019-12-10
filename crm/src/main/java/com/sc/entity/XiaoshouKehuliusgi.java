package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class XiaoshouKehuliusgi implements Serializable {
    private Long ksid;

    private Long kid;

    private String caozuorenyuanbianhao;

    private String chulifangshi;

    private String chulicuoshi;

    private String shifouliushi;

    private Long gid;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date lasttime;

    private static final long serialVersionUID = 1L;

    public XiaoshouKehuliusgi(Long ksid, Long kid, String caozuorenyuanbianhao, String chulifangshi, String chulicuoshi, String shifouliushi, Long gid, Date lasttime) {
        this.ksid = ksid;
        this.kid = kid;
        this.caozuorenyuanbianhao = caozuorenyuanbianhao;
        this.chulifangshi = chulifangshi;
        this.chulicuoshi = chulicuoshi;
        this.shifouliushi = shifouliushi;
        this.gid = gid;
        this.lasttime = lasttime;
    }

    public XiaoshouKehuliusgi() {
        super();
    }

    public Long getKsid() {
        return ksid;
    }

    public void setKsid(Long ksid) {
        this.ksid = ksid;
    }

    public Long getKid() {
        return kid;
    }

    public void setKid(Long kid) {
        this.kid = kid;
    }

    public String getCaozuorenyuanbianhao() {
        return caozuorenyuanbianhao;
    }

    public void setCaozuorenyuanbianhao(String caozuorenyuanbianhao) {
        this.caozuorenyuanbianhao = caozuorenyuanbianhao == null ? null : caozuorenyuanbianhao.trim();
    }

    public String getChulifangshi() {
        return chulifangshi;
    }

    public void setChulifangshi(String chulifangshi) {
        this.chulifangshi = chulifangshi == null ? null : chulifangshi.trim();
    }

    public String getChulicuoshi() {
        return chulicuoshi;
    }

    public void setChulicuoshi(String chulicuoshi) {
        this.chulicuoshi = chulicuoshi == null ? null : chulicuoshi.trim();
    }

    public String getShifouliushi() {
        return shifouliushi;
    }

    public void setShifouliushi(String shifouliushi) {
        this.shifouliushi = shifouliushi == null ? null : shifouliushi.trim();
    }

    public Long getGid() {
        return gid;
    }

    public void setGid(Long gid) {
        this.gid = gid;
    }

    public Date getLasttime() {
        return lasttime;
    }

    public void setLasttime(Date lasttime) {
        this.lasttime = lasttime;
    }

	@Override
	public String toString() {
		return "XiaoshouKehuliusgi [ksid=" + ksid + ", kid=" + kid + ", caozuorenyuanbianhao=" + caozuorenyuanbianhao
				+ ", chulifangshi=" + chulifangshi + ", chulicuoshi=" + chulicuoshi + ", shifouliushi=" + shifouliushi
				+ ", gid=" + gid + ", lasttime=" + lasttime + "]";
	}
    
}