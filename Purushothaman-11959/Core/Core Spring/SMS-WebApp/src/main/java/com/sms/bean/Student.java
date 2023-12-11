package com.sms.bean;

public class Student {
	private int stdRollNo;
	private String stdName;
	private String stdEmail;
	private String stdSection;
	private int stdStandard;
	private String stdLocation;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(int stdRollNo, String stdName, String stdEmail, String stdSection, int stdStandard,
			String stdLocation) {
		super();
		this.stdRollNo = stdRollNo;
		this.stdName = stdName;
		this.stdEmail = stdEmail;
		this.stdSection = stdSection;
		this.stdStandard = stdStandard;
		this.stdLocation = stdLocation;
	}
	
	public int getStdRollNo() {
		return stdRollNo;
	}
	public void setStdRollNo(int stdRollNo) {
		this.stdRollNo = stdRollNo;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getStdEmail() {
		return stdEmail;
	}
	public void setStdEmail(String stdEmail) {
		this.stdEmail = stdEmail;
	}
	public String getStdSection() {
		return stdSection;
	}
	public void setStdSection(String stdSection) {
		this.stdSection = stdSection;
	}
	public int getStdStandard() {
		return stdStandard;
	}
	public void setStdStandard(int stdStandard) {
		this.stdStandard = stdStandard;
	}
	public String getStdLocation() {
		return stdLocation;
	}
	public void setStdLocation(String stdLocation) {
		this.stdLocation = stdLocation;
	}
	

}
