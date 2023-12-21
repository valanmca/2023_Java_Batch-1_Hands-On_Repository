package com.cms.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_customer")
public class Customer {
	
	
	@Id
	@Column(name="c_id")
	private int id;
	
	@Column(name="c_name")
	private String name;
	
	@Column(name="c_email")
	private String email;
	
	@Column(name="c_no")
	private String no;
	
	@Column(name="c_location")
	private String location;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int id, String name, String email, String no, String location) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.no = no;
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

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	

}
