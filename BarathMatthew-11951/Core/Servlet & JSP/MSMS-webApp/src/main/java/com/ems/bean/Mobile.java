package com.ems.bean;

public class Mobile {

	private int mobId;
	private String brandName;
	private String modelName;
	private int mobPrice;
	
	public Mobile() {
		
	}
	public Mobile(int mobId,String brandName,String modelName,int mobPrice) {
		super();
		this.mobId = mobId;
		this.brandName = brandName;
		this.modelName = modelName;
		this.mobPrice = mobPrice;
		
	}
	
	public int getMobId() {
		return mobId;
	}

	public void setMobId(int mobId) {
		this.mobId = mobId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getMobPrice() {
		return mobPrice;
	}

	public void setMobPrice(int mobprice) {
		this.mobPrice = mobprice;
	}

	public void display() {
		System.out.println("Mobile ID : "+mobId);
		System.out.println("Mobile Brand : "+brandName);
		System.out.println("Mobile Name : "+modelName);
		System.out.println("Mobile Price : "+mobPrice);
		
	}

}
