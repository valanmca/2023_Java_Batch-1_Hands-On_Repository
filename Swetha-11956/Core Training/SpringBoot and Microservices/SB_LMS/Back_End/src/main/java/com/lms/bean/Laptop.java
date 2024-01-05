package com.lms.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="laptop")
public class Laptop {
	
	@Id
	@Column(name="lid")
	private int lid;
	
	@Column(name="brand_name")
	private String brandName;
	
	@Column(name="model_name")
	private String modelName;
	
	@Column(name="price")
	private int price;

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Laptop(int lid, String brandName, String modelName, int price) {
		super();
		this.lid = lid;
		this.brandName = brandName;
		this.modelName = modelName;
		this.price = price;
	}

	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
