package com.vms.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_vehicle")
public class Vehicle {

	@Id
	@Column(name="vec_id")
	private int id;
	
	@Column(name="vec_type")
	private String type;
	
	@Column(name="vec_brandname")
	private String brand;
	
	@Column(name="vec_ownername")
	private String owner;

	public Vehicle(int id, String type, String brand, String owner) {
		super();
		this.id = id;
		this.type = type;
		this.brand = brand;
		this.owner = owner;
	}

	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
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

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", type=" + type + ", brand=" + brand + ", owner=" + owner + "]";
	}

}
