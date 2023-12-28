package com.student.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_Student")
public class Student {
	@Id
	@Column(name="Rollno")
	private int rno;
	@Column(name="Studentname")
	private String name;
	@Column(name="Studentemail")
	private String email;
	@Column(name="Section")
	private String section;
	@Column(name="Location")
	private String location;

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

	@Override
	public String toString() {
		return "Student [rno=" + rno + ", name=" + name + ", email=" + email + ", section=" + section + ", location="
				+ location + "]";
	}
}