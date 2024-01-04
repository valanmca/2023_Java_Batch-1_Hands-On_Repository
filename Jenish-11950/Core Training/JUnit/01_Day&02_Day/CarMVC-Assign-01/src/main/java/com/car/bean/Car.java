package com.car.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_carz")
public class Car {
	@Id
	@Column(name = "carNo")
	private String carNo;
	
	@Column(name = "manufacture")
	private String manufacture;
	
	@Column(name = "model")
	private String model;
	
	@Column(name = "kmsRan")
	private int kmsRan;
	
	@Column(name = "priceExpected")
	private int priceExpected;
	
	@Column(name = "noOfOwners")
	private int noOfOwners;

	public Car(String carNo, String manufacture, String model, int kmsRan, int priceExpected, int noOfOwners) {
		super();
		this.carNo = carNo;
		this.manufacture = manufacture;
		this.model = model;
		this.kmsRan = kmsRan;
		this.priceExpected = priceExpected;
		this.noOfOwners = noOfOwners;
	}

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCarNo() {
		return carNo;
	}

	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}

	public String getManufacture() {
		return manufacture;
	}

	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getKmsRan() {
		return kmsRan;
	}

	public void setKmsRan(int kmsRan) {
		this.kmsRan = kmsRan;
	}

	public int getPriceExpected() {
		return priceExpected;
	}

	public void setPriceExpected(int priceExpected) {
		this.priceExpected = priceExpected;
	}

	public int getNoOfOwners() {
		return noOfOwners;
	}

	public void setNoOfOwners(int noOfOwners) {
		this.noOfOwners = noOfOwners;
	}

	@Override
	public String toString() {
		return "Car [carNo=" + carNo + ", manufacture=" + manufacture + ", model=" + model + ", kmsRan=" + kmsRan
				+ ", priceExpected=" + priceExpected + ", noOfOwners=" + noOfOwners + "]";
	}

}
