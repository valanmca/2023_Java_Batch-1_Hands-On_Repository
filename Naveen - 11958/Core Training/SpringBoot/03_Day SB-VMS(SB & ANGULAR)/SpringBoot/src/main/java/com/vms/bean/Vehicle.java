package com.vms.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_vms")
public class Vehicle {
	
	@Id
	@Column(name = "vid")
	private int id;
	
	@Column(name = "vtype")
	private String vehicleType;
	
	@Column(name = "vname")
	private String vehicleName;
	
	@Column(name = "vnum")
	private int number1;
	
	@Column(name = "owner")
	private String name;

	public Vehicle(int id, String vehicleType, String vehicleName, int number1, String name) {
		super();
		this.id = id;
		this.vehicleType = vehicleType;
		this.vehicleName = vehicleName;
		this.number1 = number1;
		this.name = name;
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

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public int getNumber1() {
		return number1;
	}

	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", vehicleType=" + vehicleType + ", vehicleName=" + vehicleName + ", number1="
				+ number1 + ", name=" + name + "]";
	}
	
	

}
