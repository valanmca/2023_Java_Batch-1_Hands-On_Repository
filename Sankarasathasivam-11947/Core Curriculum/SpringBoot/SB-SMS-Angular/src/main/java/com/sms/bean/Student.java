package com.sms.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_student")
public class Student {
	@Id
	@Column(name = "srollno")
	private int rollno;
	
	@Column(name = "sname")
	private String name;
	
	@Column(name = "semail")
	private String email;
	
	@Column(name = "ssection")
	private char section;
	
	@Column(name = "slocation")
	private String location;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int rollno, String name, String email, char section, String location) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.email = email;
		this.section = section;
		this.location = location;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
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

	public char getSection() {
		return section;
	}

	public void setSection(char section) {
		this.section = section;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
