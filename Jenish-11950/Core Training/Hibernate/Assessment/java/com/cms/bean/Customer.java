package com.cms.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_Customer")

public class Customer {
	@Id
	@Column(name = "cus_id")
	private int id;

	@Column(name = "cus_name")
	private String name;

	@Column(name = "cus_email")
	private String email;

	@Column(name = "cus_contactnumber")
	private int number;

	@Column(name = "cus_location")
	private String location;

	public Customer(int id, String name, String email, int number, String location) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.number = number;
		this.location = location;
	}

	public Customer() {
		super();
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

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", number=" + number + ", location="
				+ location + "]";
	}

}
