package com.sms.bean;

public class StudentBean {
	private int sId;
	private String sName;
	private String sDept;
	public StudentBean(int sId, String sName, String sDept) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sDept = sDept;
	}
	public StudentBean() {
		super();
	}
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsDept() {
		return sDept;
	}
	public void setsDept(String sDept) {
		this.sDept = sDept;
	}
}
