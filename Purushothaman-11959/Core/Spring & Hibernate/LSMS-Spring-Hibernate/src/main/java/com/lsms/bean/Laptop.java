package com.lsms.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_lsms")
public class Laptop {
	
	@Id
	@Column(name="l_id")
	private int lId;
	
	@Column(name="l_brandname")
	private String lBrandName;
	
	@Column(name="l_modelname")
	private String lModelName;
	
	@Column(name="l_price")
	private float lPrice;
	
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Laptop(int lId, String lBrandName, String lModelName, float lPrice) {
		super();
		this.lId = lId;
		this.lBrandName = lBrandName;
		this.lModelName = lModelName;
		this.lPrice = lPrice;
	}
	
	public int getlId() {
		return lId;
	}
	public void setlId(int lId) {
		this.lId = lId;
	}
	public String getlBrandName() {
		return lBrandName;
	}
	public void setlBrandName(String lBrandName) {
		this.lBrandName = lBrandName;
	}
	public String getlModelName() {
		return lModelName;
	}
	public void setlModelName(String lModelName) {
		this.lModelName = lModelName;
	}
	public float getlPrice() {
		return lPrice;
	}
	public void setlPrice(float lPrice) {
		this.lPrice = lPrice;
	}
	
	
	

}
