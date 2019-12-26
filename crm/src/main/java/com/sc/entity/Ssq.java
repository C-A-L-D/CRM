package com.sc.entity;

public class Ssq {
	private String province;
	private String city;
	private String area;
	private String xxdz;
	public Ssq() {
		super();
	}
	public Ssq(String province, String city, String area, String xxdz) {
		super();
		this.province = province;
		this.city = city;
		this.area = area;
		this.xxdz = xxdz;
	}
	public String getprovince() {
		return province;
	}
	public void setprovince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getXxdz() {
		return xxdz;
	}
	public void setXxdz(String xxdz) {
		this.xxdz = xxdz;
	}
	@Override
	public String toString() {
		return province + "-" + city + "-" + area + "-" + xxdz;
	}
	
	
}
