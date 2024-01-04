package com.ems.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_employee")
public class Employee {
	@Id
	@Column(name="emp_id")
	private int id;
	@Column(name="ename")
	private String name;
	@Column(name="company")
	private String company;
	@Column(name="erole")
	private String role;

	public Employee() {
		super();
	}

	

	public Employee(int id, String name, String company, String role) {
		super();
		this.id = id;
		this.name = name;
		this.company = company;
		this.role = role;
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

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	

}
