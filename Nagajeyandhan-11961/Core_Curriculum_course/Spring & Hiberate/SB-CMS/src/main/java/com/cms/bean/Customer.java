package com.cms.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_customer")
public class Customer {
	@Id
	@Column(name="c_id")
	private int id;
	@Column(name="c_name")
	private String name;
	@Column(name="c_email")
	private String email;
	@Column(name="c_contact")
	private int contact;
	@Column(name="c_location")
	private String location;

	public Customer() {
		super();
	}

	public Customer(int id, String name, String email, int contact, String location) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.contact = contact;
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

	public int getContact() {
		return contact;
	}

	public void setContact(int contact) {
		this.contact = contact;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
