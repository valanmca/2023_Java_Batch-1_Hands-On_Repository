package com.domnic.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_vehicle")
public class Vehicle {

	@Id
	@Column(name="vId")
	private int vId;
	
	@Column(name="vName")
    private String vName;
	
	@Column(name="vManufacturer")
    private String vManufacturer;

	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Vehicle(int vId, String vName, String vManufacturer) {
		super();
		this.vId = vId;
		this.vName = vName;
		this.vManufacturer = vManufacturer;
	}

	public int getvId() {
		return vId;
	}

	public void setvId(int vId) {
		this.vId = vId;
	}

	public String getvName() {
		return vName;
	}

	public void setvName(String vName) {
		this.vName = vName;
	}

	public String getvManufacturer() {
		return vManufacturer;
	}

	public void setvManufacturer(String vManufacturer) {
		this.vManufacturer = vManufacturer;
	}
	
	@Override
	public String toString() {
		return "Vehicle [vId=" + vId + ", vName=" + vName + ", vManufacturer=" + vManufacturer + "]";
	}

}
