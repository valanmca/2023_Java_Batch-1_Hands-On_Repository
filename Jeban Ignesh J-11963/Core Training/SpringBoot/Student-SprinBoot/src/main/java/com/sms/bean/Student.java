package com.sms.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_Student")
public class Student {
	@Id
	@Column(name="Rollno")
	private int id;
	@Column(name="Studentname")
	private String name;
	@Column(name="Studentemail")
	private String email;
	@Column(name="Section")
	private String section;
	@Column(name="Location")
	private String location;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, String email, String section, String location) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.section = section;
		this.location = location;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", section=" + section + ", location="
				+ location + "]";
	}

}
