package com.vms.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_vehicle")
public class Vehicle {
	
	@Id
	@Column(name="v_no")
	private int vNo;
	@Column(name="v_brand")
	private String vName;
	@Column(name="v_price")
	private int vPrice;
	public Vehicle() {
		super();
	}
	public Vehicle(int vNo, String vName, int vPrice) {
		super();
		this.vNo = vNo;
		this.vName = vName;
		this.vPrice = vPrice;
	}
	public int getvNo() {
		return vNo;
	}
	public void setvNo(int vNo) {
		this.vNo = vNo;
	}
	public String getvName() {
		return vName;
	}
	public void setvName(String vName) {
		this.vName = vName;
	}
	public int getvPrice() {
		return vPrice;
	}
	public void setvPrice(int vPrice) {
		this.vPrice = vPrice;
	}
	@Override
	public String toString() {
		return "Vehicle [vNo=" + vNo + ", vName=" + vName + ", vPrice=" + vPrice + "]";
	}
	
	
}
