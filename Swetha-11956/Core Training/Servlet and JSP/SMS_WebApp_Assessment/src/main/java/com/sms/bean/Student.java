package com.sms.bean;

public class Student {
	private int rno;
	private String name;
	private String email;
	private String std;
	private String location;
	
	
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int rno, String name, String email, String std, String location) {
		super();
		this.rno = rno;
		this.name = name;
		this.email = email;
		this.std = std;
		this.location = location;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStd() {
		return std;
	}
	public void setStd(String std) {
		this.std = std;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
}
