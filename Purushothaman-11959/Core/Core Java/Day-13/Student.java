package com.sms.bean;

public class Student {
	private int stdId;
	private String stdName;
	private String stdDept;
	private float stdPercentage;
	

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Student(int stdId, String stdName, String stdDept, float stdPercentage) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdDept = stdDept;
		this.stdPercentage = stdPercentage;
	}



	public int getStdId() {
		return stdId;
	}



	public void setStdId(int stdId) {
		this.stdId = stdId;
	}



	public String getStdName() {
		return stdName;
	}



	public void setStdName(String stdName) {
		this.stdName = stdName;
	}



	public String getStdDept() {
		return stdDept;
	}



	public void setStdDept(String stdDept) {
		this.stdDept = stdDept;
	}



	public float getStdPercentage() {
		return stdPercentage;
	}



	public void setStdPercentage(float stdPercentage) {
		this.stdPercentage = stdPercentage;
	}
	
	public void display() {
		System.out.println("Student Id: "+stdId);
		System.out.println("Student Name: "+stdName);
		System.out.println("Student Dept: "+stdDept);
		System.out.println("Student Percentage: "+stdPercentage);
	}


}
