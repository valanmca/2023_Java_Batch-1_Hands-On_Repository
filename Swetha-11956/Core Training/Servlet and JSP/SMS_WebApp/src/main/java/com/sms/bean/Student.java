package com.sms.bean;

public class Student {
	private int rno;
	private String name;
	private String dept;
	
	public Student() {
		super();
		
	}
	
	
	public Student(int rno, String name, String dept) {
		super();
		this.rno = rno;
		this.name = name;
		this.dept = dept;
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
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	

}
