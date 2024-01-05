package com.cms.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_customer")
public class Customer {
	@Id
	@Column(name = "cid")
	private int id;

	@Column(name = "cname")
	private String name;

	@Column(name = "cemail")
	private String email;

	@Column(name = "cnumber")
	private String number;

	@Column(name = "clocation")
	private String location;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int id, String name, String email, String number, String location) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.number = number;
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

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
