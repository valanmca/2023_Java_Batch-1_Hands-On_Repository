package com.bean;

public class Vehicle {
	
	private int vechicleId;
	private String vehicleName;
	private int price;
	
	public Vehicle(int vechicleId, String vehicleName, int price) {
		super();
		this.vechicleId = vechicleId;
		this.vehicleName = vehicleName;
		this.price = price;
	}
	
	public int getVechicleId() {
		return vechicleId;
	}
	public void setVechicleId(int vechicleId) {
		this.vechicleId = vechicleId;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Vehicle() {
		super();
	}
	
}
