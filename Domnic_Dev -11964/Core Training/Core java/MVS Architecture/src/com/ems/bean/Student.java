package com.ems.bean;

public class Student {

	private int std_id;
	private String std_name;
	private String std_sec;
	
	public Student() {
		super();
	}
	
	public Student(int std_id, String std_name, String std_sec) {
		super();
		this.std_id = std_id;
		this.std_name = std_name;
		this.std_sec = std_sec;
	}
	
	public int getStd_id() {
		return std_id;
	}
	public void setStd_id(int std_id) {
		this.std_id = std_id;
	}
	public String getStd_name() {
		return std_name;
	}
	public void setStd_name(String std_name) {
		this.std_name = std_name;
	}
	public String getStd_sec() {
		return std_sec;
	}
	public void setStd_sec(String std_sec) {
		this.std_sec = std_sec;
	}
	
	public void display() {
        System.out.println("Student id: "+std_id);
        System.out.println("Student name: "+std_name);
        System.out.println("Student Sec: "+std_sec);
    }



}
