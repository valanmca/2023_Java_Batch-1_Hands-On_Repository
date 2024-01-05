package com.vms.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_vehicle")
public class Vehicle {

	@Id
	@Column(name="v_id")
	private int vId;
	
	@Column(name="v_name")
	private String vName;
	
	@Column(name="v_company")
	private String vCompany;
	
	@Column(name="v_price")
	private String vPrice;

	
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vehicle(int vId, String vName, String vCompany, String vPrice) {
		super();
		this.vId = vId;
		this.vName = vName;
		this.vCompany = vCompany;
		this.vPrice = vPrice;
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

	public String getvCompany() {
		return vCompany;
	}

	public void setvCompany(String vCompany) {
		this.vCompany = vCompany;
	}

	public String getvPrice() {
		return vPrice;
	}

	public void setvPrice(String vPrice) {
		this.vPrice = vPrice;
	}

}
