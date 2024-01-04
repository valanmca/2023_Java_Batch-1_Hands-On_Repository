package com.car.bean;

public class Car {
	private String carNo;
	private String manufacture;
	private String model;
	private int kmsRan;
	private int priceExcepted;
	private int noOfOwners;
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
	public int getPriceExcepted() {
		return priceExcepted;
	}
	public void setPriceExcepted(int priceExcepted) {
		this.priceExcepted = priceExcepted;
	}
	public int getNoOfOwners() {
		return noOfOwners;
	}
	public void setNoOfOwners(int noOfOwners) {
		this.noOfOwners = noOfOwners;
	}
	
	public Car() {
		super();
		}
	public Car(String carNo, String manufacture, String model, int kmsRan, int priceExcepted, int noOfOwners) {
		super();
		this.carNo = carNo;
		this.manufacture = manufacture;
		this.model = model;
		this.kmsRan = kmsRan;
		this.priceExcepted = priceExcepted;
		this.noOfOwners = noOfOwners;
	}
	
	
	
}
