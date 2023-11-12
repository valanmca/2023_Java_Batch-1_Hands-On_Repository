package com.sms.bean;

public class Student {
	private int rno;
	private String name;
	private String dept;

	public static void main(String[] args) {

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

	public Student(int rno, String name, String dept) {
		super();
		this.rno = rno;
		this.name = name;
		this.dept = dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	public void display() {
		System.out.println("Student roll no : "+rno);
		System.out.println("Student Name  : "+name);
		System.out.println("Student Department : "+dept);
		
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

}
