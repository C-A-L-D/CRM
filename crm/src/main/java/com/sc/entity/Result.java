package com.sc.entity;

public class Result {
	
	private Integer status;
	private String msg;
	
	
	public Result() {
		super();
	}


	public Result(Integer status, String msg) {
		super();
		this.status = status;
		this.msg = msg;
	}


	public Integer getStatus() {
		return status;
	}


	public void setStatus(Integer status) {
		this.status = status;
	}


	public String getMsg() {
		return msg;
	}


	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
	
	

}
