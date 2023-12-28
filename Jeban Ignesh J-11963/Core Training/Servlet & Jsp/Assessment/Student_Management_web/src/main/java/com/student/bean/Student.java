package com.student.bean;

public class Student {
	private int rollNo;
	private String studentName;
	private String studentEmail;
	private String section;
	private String location;
	public Student(int rollNo, String studentName, String studentEmail, String section, String location) {
		super();
		this.rollNo = rollNo;
		this.studentName = studentName;
		this.studentEmail = studentEmail;
		this.section = section;
		this.location = location;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
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
