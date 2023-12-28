package com.teacher.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_Teacher")
public class Teacher {
	@Id
	@Column(name="Teacher_Id")
	private int id;
	@Column(name="Teacher_Name")
	private String name;
	@Column(name="Teacher_Email")
	private String email;
	@Column(name="Teacher_Qualification")
	private String qualification;
	@Column(name="Teacher_Location")
	private String location;

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

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", email=" + email + ", qualification=" + qualification
				+ ", location=" + location + "]";
	}

}
