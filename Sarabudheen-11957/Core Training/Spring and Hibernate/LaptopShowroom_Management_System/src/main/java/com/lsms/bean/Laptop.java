package com.lsms.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Laptops")
public class Laptop {

	@Id
	@Column(name = "Laptop_Id")
	private int id;
	
	@Column(name = "Laptop_Brand_Name")
	private String brandName;
	
	@Column(name = "Laptop_Model_Name")
	private String modelName;
	
	@Column(name = "Laptop_Price")
	private float price;

	public Laptop() {
		super();
	}

	public Laptop(int id, String brandName, String modelName, float price) {
		super();
		this.id = id;
		this.brandName = brandName;
		this.modelName = modelName;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "|| Laptop Details : Laptop Id : " + id + "||\nLaptop Brand Name : " + brandName + "|| \n Laptop Model Name : " + modelName + "|| \n Laptop Price : " + price +"||";
	}
	
	
	
	
	
	
}
