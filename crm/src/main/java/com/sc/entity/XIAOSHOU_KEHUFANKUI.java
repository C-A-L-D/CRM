package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

public class XIAOSHOU_KEHUFANKUI implements Serializable {
    private Long fid;

    private String jiluyouxianji;

    private Long kid;

    private String zhuangtai;

    private String fankuileixing;

    private String fankuishijian;

    private String fankuiyuanyin;

    private String fuzeren;

    private String fankuilaiyuan;

    private String fankuizhuti;

    private String fankuimiaoshu;

    private String fenxi;

    private Long gid;

    private Date lasttime;

    private static final long serialVersionUID = 1L;

    public XIAOSHOU_KEHUFANKUI(Long fid, String jiluyouxianji, Long kid, String zhuangtai, String fankuileixing, String fankuishijian, String fankuiyuanyin, String fuzeren, String fankuilaiyuan, String fankuizhuti, String fankuimiaoshu, String fenxi, Long gid, Date lasttime) {
        this.fid = fid;
        this.jiluyouxianji = jiluyouxianji;
        this.kid = kid;
        this.zhuangtai = zhuangtai;
        this.fankuileixing = fankuileixing;
        this.fankuishijian = fankuishijian;
        this.fankuiyuanyin = fankuiyuanyin;
        this.fuzeren = fuzeren;
        this.fankuilaiyuan = fankuilaiyuan;
        this.fankuizhuti = fankuizhuti;
        this.fankuimiaoshu = fankuimiaoshu;
        this.fenxi = fenxi;
        this.gid = gid;
        this.lasttime = lasttime;
    }

    public XIAOSHOU_KEHUFANKUI() {
        super();
    }

    public Long getFid() {
        return fid;
    }

    public void setFid(Long fid) {
        this.fid = fid;
    }

    public String getJiluyouxianji() {
        return jiluyouxianji;
    }

    public void setJiluyouxianji(String jiluyouxianji) {
        this.jiluyouxianji = jiluyouxianji == null ? null : jiluyouxianji.trim();
    }

    public Long getKid() {
        return kid;
    }

    public void setKid(Long kid) {
        this.kid = kid;
    }

    public String getZhuangtai() {
        return zhuangtai;
    }

    public void setZhuangtai(String zhuangtai) {
        this.zhuangtai = zhuangtai == null ? null : zhuangtai.trim();
    }

    public String getFankuileixing() {
        return fankuileixing;
    }

    public void setFankuileixing(String fankuileixing) {
        this.fankuileixing = fankuileixing == null ? null : fankuileixing.trim();
    }

    public String getFankuishijian() {
        return fankuishijian;
    }

    public void setFankuishijian(String fankuishijian) {
        this.fankuishijian = fankuishijian == null ? null : fankuishijian.trim();
    }

    public String getFankuiyuanyin() {
        return fankuiyuanyin;
    }

    public void setFankuiyuanyin(String fankuiyuanyin) {
        this.fankuiyuanyin = fankuiyuanyin == null ? null : fankuiyuanyin.trim();
    }

    public String getFuzeren() {
        return fuzeren;
    }

    public void setFuzeren(String fuzeren) {
        this.fuzeren = fuzeren == null ? null : fuzeren.trim();
    }

    public String getFankuilaiyuan() {
        return fankuilaiyuan;
    }

    public void setFankuilaiyuan(String fankuilaiyuan) {
        this.fankuilaiyuan = fankuilaiyuan == null ? null : fankuilaiyuan.trim();
    }

    public String getFankuizhuti() {
        return fankuizhuti;
    }

    public void setFankuizhuti(String fankuizhuti) {
        this.fankuizhuti = fankuizhuti == null ? null : fankuizhuti.trim();
    }

    public String getFankuimiaoshu() {
        return fankuimiaoshu;
    }

    public void setFankuimiaoshu(String fankuimiaoshu) {
        this.fankuimiaoshu = fankuimiaoshu == null ? null : fankuimiaoshu.trim();
    }

    public String getFenxi() {
        return fenxi;
    }

    public void setFenxi(String fenxi) {
        this.fenxi = fenxi == null ? null : fenxi.trim();
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