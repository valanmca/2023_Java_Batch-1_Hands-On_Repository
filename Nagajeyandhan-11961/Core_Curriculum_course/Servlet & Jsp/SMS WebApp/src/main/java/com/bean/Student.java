package com.bean;

public class Student {
	//variables
	private int rollNo;
	private String name;
	private String email;
	private String section;
	private String location;
	
	//constructor
	public Student(int rollNo, String name, String email, String section, String location) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.email = email;
		this.section = section;
		this.location = location;
	}
	public Student() {
		super();
	}
	
	//getter and setter 
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
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
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
}
