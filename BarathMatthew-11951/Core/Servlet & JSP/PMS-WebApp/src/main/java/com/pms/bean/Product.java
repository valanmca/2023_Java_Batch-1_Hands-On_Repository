package com.pms.bean;

public class Product {
	private int pId;
	private String pName;
	private int pQnt;
	private int pPrice;
	
	public Product() {
		super();
		
	}
	
	public Product(int pId, String pName, int pQnt, int pPrice) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pQnt = pQnt;
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
	public int getpQnt() {
		return pQnt;
	}
	public void setpQnt(int pQnt) {
		this.pQnt = pQnt;
	}
	public int getpPrice() {
		return pPrice;
	}
	public void setpPrice(int pPrice) {
		this.pPrice = pPrice;
	}
}
