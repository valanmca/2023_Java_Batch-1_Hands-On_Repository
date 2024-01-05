package com.lsms.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_lsms")
public class Laptop {

	@Id
	@Column(name="lapId")
	private int lapId;
	@Column(name="brandName")
	private String brandName;
	@Column(name="modelName")
	private String modelName;
	@Column(name="lapPrice")
	private int lapPrice;
	
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Laptop(int lapId, String brandName, String modelName, int lapPrice) {
		super();
		this.lapId = lapId;
		this.brandName = brandName;
		this.modelName = modelName;
		this.lapPrice = lapPrice;
	}



	public int getLapId() {
		return lapId;
	}
	public void setLapId(int lapId) {
		this.lapId = lapId;
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
	public int getLapPrice() {
		return lapPrice;
	}
	public void setLapPrice(int lapPrice) {
		this.lapPrice = lapPrice;
	}



	@Override
	public String toString() {
		return "Laptop [lapId=" + lapId + ", brandName=" + brandName + ", modelName=" + modelName + ", lapPrice="
				+ lapPrice + "]";
	}
	
	
	
}
