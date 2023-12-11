package com.vms.bean;

public class Vehicle {

	private int no;
	private String Brandname;
	private float mileage;

	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vehicle(int no, String Brandname, float mileage) {
		super();
		this.no = no;
		this.Brandname = Brandname;
		this.mileage = mileage;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getBrandname() {
		return Brandname;
	}

	public void setBrandname(String Brandname) {
		this.Brandname = Brandname;
	}

	public float getMileage() {
		return mileage;
	}

	public void setMileage(float mileage) {
		this.mileage = mileage;
	}

	public void display() {
		System.out.println("Vehicle No : " + no);
		System.out.println("Venicle Brand : " + Brandname);
		System.out.println("Vehicle Mileage : " + mileage);
	}

}
