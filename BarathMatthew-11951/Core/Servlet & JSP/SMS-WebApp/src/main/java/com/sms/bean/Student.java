package com.sms.bean;



public class Student {

	private int sID;
	private String sName;
	private int sclass;
	private String gender;
	
	
	
	public Student(int sID, String sName, int sclass, String gender) {
		super();
		this.sID = sID;
		this.sName = sName;
		this.sclass = sclass;
		this.gender = gender;
	}
	public int getsID() {
		return sID;
	}
	public void setsID(int sID) {
		this.sID = sID;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public int getSclass() {
		return this.sclass;
	}
	public void setSclass(int sclass) {
		this.sclass=sclass;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	 
	
	
}
