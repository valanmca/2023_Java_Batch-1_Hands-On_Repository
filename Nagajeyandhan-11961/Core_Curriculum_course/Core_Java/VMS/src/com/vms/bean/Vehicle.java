package com.vms.bean;

public class Vehicle {
	
	private int id;
	private int vehicleNumber;
	private String vehicleName;
	private int price;
	
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vehicle(int id, int vehicleNumber, String vehicleName, int price) {
		super();
		this.id = id;
		this.vehicleNumber = vehicleNumber;
		this.vehicleName = vehicleName;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(int vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
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
	
	public void display() {
		System.out.println("Vehicle Id: "+id);
		System.out.println("Vehicle Number: "+vehicleNumber);
		System.out.println("Vehicle Name: "+vehicleName);
		System.out.println("Vehicle Price: "+price);
	}
	
}
