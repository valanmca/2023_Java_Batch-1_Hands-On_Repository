package com.vms.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_vehicles")
public class Vehicle {
	@Id
	@Column(name = "v_no")
	private int no;

	@Column(name = "v_brand")
	private String brand;

	@Column(name = "v_mileage")
	private float mileage;

	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vehicle(int no, String brand, float mileage) {
		super();
		this.no = no;
		this.brand = brand;
		this.mileage = mileage;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public float getMileage() {
		return mileage;
	}

	public void setMileage(float mileage) {
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return "Vehicle [no=" + no + ", brand=" + brand + ", mileage=" + mileage + "]";
	}

}
