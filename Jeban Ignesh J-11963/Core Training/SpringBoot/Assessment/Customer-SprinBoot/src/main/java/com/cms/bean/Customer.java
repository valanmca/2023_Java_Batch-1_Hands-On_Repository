package com.cms.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_Customer")
public class Customer {
	@Id
	@Column(name="Customer_Id")
	private int id;
	@Column(name="Customer_Name")
	private String name;
	@Column(name="Customer_Email")
	private String email;
	@Column(name="Customer_Contact")
	private String cno;
	@Column(name="Customer_Location")
	private String location;
	

	public Customer(int id, String name, String email, String cno, String location) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.cno = cno;
		this.location = location;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
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

	public String getCno() {
		return cno;
	}

	public void setCno(String cno) {
		this.cno = cno;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
