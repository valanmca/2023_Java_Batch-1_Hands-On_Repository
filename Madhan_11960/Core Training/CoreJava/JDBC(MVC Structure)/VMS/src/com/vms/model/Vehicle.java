package com.vms.model;

public class Vehicle {
   
	private int  vehId;
	private int vehNo;
	private String VehType;
	
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vehicle(int vehId, int vehNo, String vehType) {
		super();
		this.vehId = vehId;
		this.vehNo = vehNo;
		VehType = vehType;
	}

	public int getVehId() {
		return vehId;
	}

	public void setVehId(int vehId) {
		this.vehId = vehId;
	}

	public int getVehNo() {
		return vehNo;
	}

	public void setVehNo(int vehNo) {
		this.vehNo = vehNo;
	}

	public String getVehType() {
		return VehType;
	}

	public void setVehType(String vehType) {
		VehType = vehType;
	}
	
	public void display() {
		System.out.println("Vehicle ID :"+vehId);
		System.out.println("Vehicle No :"+vehNo);
		System.out.println("Vehicle Type:"+VehType);
	}
	
	
	
}
