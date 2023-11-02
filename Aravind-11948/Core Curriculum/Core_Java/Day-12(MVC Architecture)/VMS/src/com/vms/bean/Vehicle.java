package com.vms.bean;

public class Vehicle {
	
	private int id;
	private String type;
	private String brand;
	
	
	public Vehicle() {
		super();
		
	}
	
	
	public Vehicle(int id, String type, String brand) {
		super();
		this.id = id;
		this.type = type;
		this.brand = brand;
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
	
	public void display()
	{
		System.out.println("Vehicle Id = "+id);
		System.out.println("Vehicle Type = "+type);
		System.out.println("Vehicle brand = "+brand);
		
		System.out.println("------------------------");
		
		
	}
	
	
	

}
