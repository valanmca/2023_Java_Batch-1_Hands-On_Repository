package com.domnic.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "table_vehicle")
public class Vehicle {

	@Id
	@Column(name = "vId")
	private int vId;
	
	@Column(name = "vType")
	private String vType;
	
	@Column(name = "vName")
	private String vName;
	
	@Column(name = "vNumber")
	private String vNumber;
	
	@Column(name = "oName")
	private String oName;

	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vehicle(int vId, String vType, String vName, String vNumber, String oName) {
		super();
		this.vId = vId;
		this.vType = vType;
		this.vName = vName;
		this.vNumber = vNumber;
		this.oName = oName;
	}

	public int getvId() {
		return vId;
	}

	public void setvId(int vId) {
		this.vId = vId;
	}

	public String getvType() {
		return vType;
	}

	public void setvType(String vType) {
		this.vType = vType;
	}

	public String getvName() {
		return vName;
	}

	public void setvName(String vName) {
		this.vName = vName;
	}

	public String getvNumber() {
		return vNumber;
	}

	public void setvNumber(String vNumber) {
		this.vNumber = vNumber;
	}

	public String getoName() {
		return oName;
	}

	public void setoName(String oName) {
		this.oName = oName;
	}

	@Override
	public String toString() {
		return "Vehicle [vId=" + vId + ", vType=" + vType + ", vName=" + vName + ", vNumber=" + vNumber + ", oName="
				+ oName + "]";
	}

}
