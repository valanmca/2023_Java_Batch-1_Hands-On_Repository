package com.tms.model;

public class Teacher {

	private int teacherId;
	private String teacherName;
	private String teacherEmail;
	private String teacherQualification;
	private String teacherLocation;

	public Teacher(int teacherId, String teacherName, String teacherEmail, String teacherQualification,
			String teacherLocation) {
		super();
		this.teacherId = teacherId;
		this.teacherName = teacherName;
		this.teacherEmail = teacherEmail;
		this.teacherQualification = teacherQualification;
		this.teacherLocation = teacherLocation;
	}

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getTeacherEmail() {
		return teacherEmail;
	}

	public void setTeacherEmail(String teacherEmail) {
		this.teacherEmail = teacherEmail;
	}

	public String getTeacherQualification() {
		return teacherQualification;
	}

	public void setTeacherQualification(String teacherQualification) {
		this.teacherQualification = teacherQualification;
	}

	public String getTeacherLocation() {
		return teacherLocation;
	}

	public void setTeacherLocation(String teacherLocation) {
		this.teacherLocation = teacherLocation;
	}

	public void display() {
		System.out.println("Teacher Id :" + teacherId);
		System.out.println("Teacher Name :" + teacherName);
		System.out.println("Teacher Email :" + teacherEmail);
		System.out.println("Teacher Qualification :" + teacherQualification);
		System.out.println("Teacher Location :" + teacherLocation);

	}

}
