package com.pms.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_products")
public class Product {
	
	 
	 @Id
	 @Column(name="p_id")
	private int pId;
	 
	 @Column(name="p_name")
	private String pName;
	
	 @Column(name="p_quantity")
	private int pQuantity;
	 
	 @Column(name="p_price")
	private int pPrice;
	 
	 

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Product(int pId, String pName, int pQuantity, int pPrice) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pQuantity = pQuantity;
		this.pPrice = pPrice;
	}



	public int getpId() {
		return pId;
	}



	public void setpId(int pId) {
		this.pId = pId;
	}



	public String getpName() {
		return pName;
	}



	public void setpName(String pName) {
		this.pName = pName;
	}



	public int getpQuantity() {
		return pQuantity;
	}



	public void setpQuantity(int pQuantity) {
		this.pQuantity = pQuantity;
	}



	public int getpPrice() {
		return pPrice;
	}



	public void setpPrice(int pPrice) {
		this.pPrice = pPrice;
	}
	
	
	 
	 
	
	

}
