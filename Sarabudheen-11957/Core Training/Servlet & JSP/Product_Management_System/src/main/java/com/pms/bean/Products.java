package com.pms.bean;

public class Products {

	// Declaring the variables
	private int productId;
	private String productName;
	private int productQuantity;
	private float productPrice;

	// Constructor from superClass
	public Products() {
		super();
	}

	// Constructor using fields
	public Products(int productId, String productName, int productQuantity, float productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productQuantity = productQuantity;
		this.productPrice = productPrice;
	}

	// Getters and Setters methods()
	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	public float getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}

}
