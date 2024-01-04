package com.mms.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_mobile")
public class Mobile {
	@Id
	@Column(name="mob_no")
	private int mobileID;
	
	@Column(name="mob_brand")
	private String mobileBrand;
	
	@Column(name="mob_model")
	private String mobileModel;
	
	@Column(name="mob_price")
	private int mobilePrice;

	public Mobile() {
		super();
	}

	public Mobile(int mobileID, String mobileBrand, String mobileModel, int mobilePrice) {
		super();
		this.mobileID = mobileID;
		this.mobileBrand = mobileBrand;
		this.mobileModel = mobileModel;
		this.mobilePrice = mobilePrice;
	}

	public int getMobileID() {
		return mobileID;
	}

	public void setMobileID(int mobileID) {
		this.mobileID = mobileID;
	}

	public String getMobileBrand() {
		return mobileBrand;
	}

	public void setMobileBrand(String mobileBrand) {
		this.mobileBrand = mobileBrand;
	}

	public String getMobileModel() {
		return mobileModel;
	}

	public void setMobileModel(String mobileModel) {
		this.mobileModel = mobileModel;
	}

	public int getMobilePrice() {
		return mobilePrice;
	}

	public void setMobilePrice(int mobilePrice) {
		this.mobilePrice = mobilePrice;
	}

}
