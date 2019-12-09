package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

public class XIAOSHOU_KEHULIANXIREN implements Serializable {
    private Long lid;

    private Long kid;

    private String lianxirenxingming;

    private String yingwenming;

    private String zhiwu;

    private String bumen;

    private String shouji;

    private String bangongdianhua;

    private String dianziyoujian;

    private String dizhi;

    private String beizhuxinxi;

    private Long gid;

    private Date lasttime;

    private static final long serialVersionUID = 1L;

    public XIAOSHOU_KEHULIANXIREN(Long lid, Long kid, String lianxirenxingming, String yingwenming, String zhiwu, String bumen, String shouji, String bangongdianhua, String dianziyoujian, String dizhi, String beizhuxinxi, Long gid, Date lasttime) {
        this.lid = lid;
        this.kid = kid;
        this.lianxirenxingming = lianxirenxingming;
        this.yingwenming = yingwenming;
        this.zhiwu = zhiwu;
        this.bumen = bumen;
        this.shouji = shouji;
        this.bangongdianhua = bangongdianhua;
        this.dianziyoujian = dianziyoujian;
        this.dizhi = dizhi;
        this.beizhuxinxi = beizhuxinxi;
        this.gid = gid;
        this.lasttime = lasttime;
    }

    public XIAOSHOU_KEHULIANXIREN() {
        super();
    }

    public Long getLid() {
        return lid;
    }

    public void setLid(Long lid) {
        this.lid = lid;
    }

    public Long getKid() {
        return kid;
    }

    public void setKid(Long kid) {
        this.kid = kid;
    }

    public String getLianxirenxingming() {
        return lianxirenxingming;
    }

    public void setLianxirenxingming(String lianxirenxingming) {
        this.lianxirenxingming = lianxirenxingming == null ? null : lianxirenxingming.trim();
    }

    public String getYingwenming() {
        return yingwenming;
    }

    public void setYingwenming(String yingwenming) {
        this.yingwenming = yingwenming == null ? null : yingwenming.trim();
    }

    public String getZhiwu() {
        return zhiwu;
    }

    public void setZhiwu(String zhiwu) {
        this.zhiwu = zhiwu == null ? null : zhiwu.trim();
    }

    public String getBumen() {
        return bumen;
    }

    public void setBumen(String bumen) {
        this.bumen = bumen == null ? null : bumen.trim();
    }

    public String getShouji() {
        return shouji;
    }

    public void setShouji(String shouji) {
        this.shouji = shouji == null ? null : shouji.trim();
    }

    public String getBangongdianhua() {
        return bangongdianhua;
    }

    public void setBangongdianhua(String bangongdianhua) {
        this.bangongdianhua = bangongdianhua == null ? null : bangongdianhua.trim();
    }

    public String getDianziyoujian() {
        return dianziyoujian;
    }

    public void setDianziyoujian(String dianziyoujian) {
        this.dianziyoujian = dianziyoujian == null ? null : dianziyoujian.trim();
    }

    public String getDizhi() {
        return dizhi;
    }

    public void setDizhi(String dizhi) {
        this.dizhi = dizhi == null ? null : dizhi.trim();
    }

    public String getBeizhuxinxi() {
        return beizhuxinxi;
    }

    public void setBeizhuxinxi(String beizhuxinxi) {
        this.beizhuxinxi = beizhuxinxi == null ? null : beizhuxinxi.trim();
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
}