package com.sms.bean;

public class Student {
	
	private String sName;
	private int sId;

	public Student() {
		super();
	}

	public Student(String sName, int sId) {
		super();
		this.sName = sName;
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}
	public void display() {
        System.out.println("Student Id : " + sId);
        System.out.println("Student Name : " + sName);
        System.out.println("\n");
    }

}
