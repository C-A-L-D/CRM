package com.sc.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class XiaoshouKehuxinxi implements Serializable {
    private Long kid;

    private String kname;

    private String kshuxin;

    private String wangzhan;

    private String gupiaodaima;

    private String shangjidanwei;

    private String suoyouzhe;

    private String yuangongshu;

    private String hangyebianhao;

    private String kehuleixing;

    private String kehuzhuangtai;

    private String kehulaiyuan;

    private String fuzerenbianhao;

    private String gudingdianhua;

    private String yidongdianhua;

    private String kehuchuangzhen;

    private String kaihuyinhang;

    private String yinhangzhanghu;

    private String xiacilianxishijian;

    private String dianziyoujian;

    private String sicbianma;

    private String zhifufangshi;

    private String shifouyouxiao;

    private String xiangxidizhi;

    private String beizhuxinxi;

    private Long gid;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date lasttime;

    private static final long serialVersionUID = 1L;

    public XiaoshouKehuxinxi(Long kid, String kname, String kshuxin, String wangzhan, String gupiaodaima, String shangjidanwei, String suoyouzhe, String yuangongshu, String hangyebianhao, String kehuleixing, String kehuzhuangtai, String kehulaiyuan, String fuzerenbianhao, String gudingdianhua, String yidongdianhua, String kehuchuangzhen, String kaihuyinhang, String yinhangzhanghu, String xiacilianxishijian, String dianziyoujian, String sicbianma, String zhifufangshi, String shifouyouxiao, String xiangxidizhi, String beizhuxinxi, Long gid, Date lasttime) {
        this.kid = kid;
        this.kname = kname;
        this.kshuxin = kshuxin;
        this.wangzhan = wangzhan;
        this.gupiaodaima = gupiaodaima;
        this.shangjidanwei = shangjidanwei;
        this.suoyouzhe = suoyouzhe;
        this.yuangongshu = yuangongshu;
        this.hangyebianhao = hangyebianhao;
        this.kehuleixing = kehuleixing;
        this.kehuzhuangtai = kehuzhuangtai;
        this.kehulaiyuan = kehulaiyuan;
        this.fuzerenbianhao = fuzerenbianhao;
        this.gudingdianhua = gudingdianhua;
        this.yidongdianhua = yidongdianhua;
        this.kehuchuangzhen = kehuchuangzhen;
        this.kaihuyinhang = kaihuyinhang;
        this.yinhangzhanghu = yinhangzhanghu;
        this.xiacilianxishijian = xiacilianxishijian;
        this.dianziyoujian = dianziyoujian;
        this.sicbianma = sicbianma;
        this.zhifufangshi = zhifufangshi;
        this.shifouyouxiao = shifouyouxiao;
        this.xiangxidizhi = xiangxidizhi;
        this.beizhuxinxi = beizhuxinxi;
        this.gid = gid;
        this.lasttime = lasttime;
    }

    public XiaoshouKehuxinxi() {
        super();
    }

    public Long getKid() {
        return kid;
    }

    public void setKid(Long kid) {
        this.kid = kid;
    }

    public String getKname() {
        return kname;
    }

    public void setKname(String kname) {
        this.kname = kname == null ? null : kname.trim();
    }

    public String getKshuxin() {
        return kshuxin;
    }

    public void setKshuxin(String kshuxin) {
        this.kshuxin = kshuxin == null ? null : kshuxin.trim();
    }

    public String getWangzhan() {
        return wangzhan;
    }

    public void setWangzhan(String wangzhan) {
        this.wangzhan = wangzhan == null ? null : wangzhan.trim();
    }

    public String getGupiaodaima() {
        return gupiaodaima;
    }

    public void setGupiaodaima(String gupiaodaima) {
        this.gupiaodaima = gupiaodaima == null ? null : gupiaodaima.trim();
    }

    public String getShangjidanwei() {
        return shangjidanwei;
    }

    public void setShangjidanwei(String shangjidanwei) {
        this.shangjidanwei = shangjidanwei == null ? null : shangjidanwei.trim();
    }

    public String getSuoyouzhe() {
        return suoyouzhe;
    }

    public void setSuoyouzhe(String suoyouzhe) {
        this.suoyouzhe = suoyouzhe == null ? null : suoyouzhe.trim();
    }

    public String getYuangongshu() {
        return yuangongshu;
    }

    public void setYuangongshu(String yuangongshu) {
        this.yuangongshu = yuangongshu == null ? null : yuangongshu.trim();
    }

    public String getHangyebianhao() {
        return hangyebianhao;
    }

    public void setHangyebianhao(String hangyebianhao) {
        this.hangyebianhao = hangyebianhao == null ? null : hangyebianhao.trim();
    }

    public String getKehuleixing() {
        return kehuleixing;
    }

    public void setKehuleixing(String kehuleixing) {
        this.kehuleixing = kehuleixing == null ? null : kehuleixing.trim();
    }

    public String getKehuzhuangtai() {
        return kehuzhuangtai;
    }

    public void setKehuzhuangtai(String kehuzhuangtai) {
        this.kehuzhuangtai = kehuzhuangtai == null ? null : kehuzhuangtai.trim();
    }

    public String getKehulaiyuan() {
        return kehulaiyuan;
    }

    public void setKehulaiyuan(String kehulaiyuan) {
        this.kehulaiyuan = kehulaiyuan == null ? null : kehulaiyuan.trim();
    }

    public String getFuzerenbianhao() {
        return fuzerenbianhao;
    }

    public void setFuzerenbianhao(String fuzerenbianhao) {
        this.fuzerenbianhao = fuzerenbianhao == null ? null : fuzerenbianhao.trim();
    }

    public String getGudingdianhua() {
        return gudingdianhua;
    }

    public void setGudingdianhua(String gudingdianhua) {
        this.gudingdianhua = gudingdianhua == null ? null : gudingdianhua.trim();
    }

    public String getYidongdianhua() {
        return yidongdianhua;
    }

    public void setYidongdianhua(String yidongdianhua) {
        this.yidongdianhua = yidongdianhua == null ? null : yidongdianhua.trim();
    }

    public String getKehuchuangzhen() {
        return kehuchuangzhen;
    }

    public void setKehuchuangzhen(String kehuchuangzhen) {
        this.kehuchuangzhen = kehuchuangzhen == null ? null : kehuchuangzhen.trim();
    }

    public String getKaihuyinhang() {
        return kaihuyinhang;
    }

    public void setKaihuyinhang(String kaihuyinhang) {
        this.kaihuyinhang = kaihuyinhang == null ? null : kaihuyinhang.trim();
    }

    public String getYinhangzhanghu() {
        return yinhangzhanghu;
    }

    public void setYinhangzhanghu(String yinhangzhanghu) {
        this.yinhangzhanghu = yinhangzhanghu == null ? null : yinhangzhanghu.trim();
    }

    public String getXiacilianxishijian() {
        return xiacilianxishijian;
    }

    public void setXiacilianxishijian(String xiacilianxishijian) {
        this.xiacilianxishijian = xiacilianxishijian == null ? null : xiacilianxishijian.trim();
    }

    public String getDianziyoujian() {
        return dianziyoujian;
    }

    public void setDianziyoujian(String dianziyoujian) {
        this.dianziyoujian = dianziyoujian == null ? null : dianziyoujian.trim();
    }

    public String getSicbianma() {
        return sicbianma;
    }

    public void setSicbianma(String sicbianma) {
        this.sicbianma = sicbianma == null ? null : sicbianma.trim();
    }

    public String getZhifufangshi() {
        return zhifufangshi;
    }

    public void setZhifufangshi(String zhifufangshi) {
        this.zhifufangshi = zhifufangshi == null ? null : zhifufangshi.trim();
    }

    public String getShifouyouxiao() {
        return shifouyouxiao;
    }

    public void setShifouyouxiao(String shifouyouxiao) {
        this.shifouyouxiao = shifouyouxiao == null ? null : shifouyouxiao.trim();
    }

    public String getXiangxidizhi() {
        return xiangxidizhi;
    }

    public void setXiangxidizhi(String xiangxidizhi) {
        this.xiangxidizhi = xiangxidizhi == null ? null : xiangxidizhi.trim();
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

	@Override
	public String toString() {
		return "XiaoshouKehuxinxi [kid=" + kid + ", kname=" + kname + ", kshuxin=" + kshuxin + ", wangzhan=" + wangzhan
				+ ", gupiaodaima=" + gupiaodaima + ", shangjidanwei=" + shangjidanwei + ", suoyouzhe=" + suoyouzhe
				+ ", yuangongshu=" + yuangongshu + ", hangyebianhao=" + hangyebianhao + ", kehuleixing=" + kehuleixing
				+ ", kehuzhuangtai=" + kehuzhuangtai + ", kehulaiyuan=" + kehulaiyuan + ", fuzerenbianhao="
				+ fuzerenbianhao + ", gudingdianhua=" + gudingdianhua + ", yidongdianhua=" + yidongdianhua
				+ ", kehuchuangzhen=" + kehuchuangzhen + ", kaihuyinhang=" + kaihuyinhang + ", yinhangzhanghu="
				+ yinhangzhanghu + ", xiacilianxishijian=" + xiacilianxishijian + ", dianziyoujian=" + dianziyoujian
				+ ", sicbianma=" + sicbianma + ", zhifufangshi=" + zhifufangshi + ", shifouyouxiao=" + shifouyouxiao
				+ ", xiangxidizhi=" + xiangxidizhi + ", beizhuxinxi=" + beizhuxinxi + ", gid=" + gid + ", lasttime="
				+ lasttime + "]";
	}
    
}