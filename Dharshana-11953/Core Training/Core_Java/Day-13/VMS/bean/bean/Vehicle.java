package com.vms.bean;

public class Vehicle {
	private int vehi_id;
	private String vehi_type;
	String vehi_brandname;
	String vehi_ownername;
	
	public Vehicle() {
		super();
	}
	
	public Vehicle(int vehi_id,String vehi_type,String vehi_brandname,String vehi_ownername) {
		super();
		this.vehi_id=vehi_id;
		this.vehi_type=vehi_type;
		this.vehi_brandname=vehi_brandname;
		this.vehi_ownername=vehi_ownername;
	}

	public int getVehi_id() {
		return vehi_id;
	}

	public void setVehi_id(int vehi_id) {
		this.vehi_id = vehi_id;
	}

	public String getVehi_type() {
		return vehi_type;
	}

	public void setVehi_type(String vehi_type) {
		this.vehi_type = vehi_type;
	}

	public String getVehi_brandname() {
		return vehi_brandname;
	}

	public void setVehi_brandname(String vehi_brandname) {
		this.vehi_brandname = vehi_brandname;
	}

	public String getVehi_ownername() {
		return vehi_ownername;
	}

	public void setVehi_ownername(String vehi_ownername) {
		this.vehi_ownername = vehi_ownername;
	}
	public void display() {
		System.out.println("Vehicle Id : " + vehi_id);
		System.out.println("Vehicle Type : " + vehi_type);
		System.out.println("Vehicle BrandName : " + vehi_brandname);
		System.out.println("Vehicle OwnerName : " + vehi_ownername);
		System.out.println("-----------------------------------");
	}
	
}
