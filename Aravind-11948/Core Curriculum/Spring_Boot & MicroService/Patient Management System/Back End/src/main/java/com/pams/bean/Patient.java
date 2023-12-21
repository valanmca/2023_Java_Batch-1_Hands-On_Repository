package com.pams.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_patient")
public class Patient {
	@Id
	@Column(name="p_id")
	private int id;
	
	@Column(name="p_name")
	private String name;
	
	@Column(name="p_age")
	private int age;
	
	@Column(name="p_email")
	private String email;
	
	@Column(name="p_bloodgroup")
	private String bgroup;
	
	@Column(name="p_location")
	private String location;

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patient(int id, String name, int age, String email, String bgroup, String location) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
		this.bgroup = bgroup;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBgroup() {
		return bgroup;
	}

	public void setBgroup(String bgroup) {
		this.bgroup = bgroup;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	
	

}
