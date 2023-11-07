package com.vms.bean;

public class Vehicle {
	private int id;
	private String type;
	private String brandname;
	private String ownername;
	
	public Vehicle() {
		super();
	}
	public Vehicle(int id, String type, String brandname, String ownername) {
		super();
		this.id = id;
		this.type = type;
		this.brandname = brandname;
		this.ownername = ownername;
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
	public String getBrandname() {
		return brandname;
	}
	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}
	public String getOwnername() {
		return ownername;
	}
	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}
	public void display() {
		System.out.println("Vehicle Id : " +id);
		System.out.println("Vehicle Type : " +type);
		System.out.println("Vehicle Brandname : " +brandname);
		System.out.println("Vehicle Ownername : " +ownername);
		System.out.println("-----------------------------------");
	}
	
}
