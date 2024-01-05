package com.vms.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//Vehicle Id, Vehicle Type, Vehicle Name, Vehicle Number and Owner Name.

@Entity
@Table(name = "tbl_vehicle")
public class Vehicle {
	@Id
	@Column(name = "vid")
	private int id;
	
	@Column(name = "vtype")
	private String type;
	
	@Column(name = "vname")
	private String name;
	
	@Column(name = "vnumber")
	private String number;
	
	@Column(name = "vowner")
	private String owner;

	public Vehicle() {
		super();

	}

	public Vehicle(int id, String type, String name, String number, String owner) {
		super();
		this.id = id;
		this.type = type;
		this.name = name;
		this.number = number;
		this.owner = owner;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

}
