package com.shaji.Day08;

class Mobile {
	// variable
	String brandName;
	float price;

	// Constructor
	Mobile(String brandName, float price) {
		this.brandName = brandName;
		this.price = price;
	}

	// Method
	void display() {
		System.out.println("Brand Name : " + brandName);
		System.out.println("Price : " + price);
	}
}

public class Mobile_Phone {

	public static void main(String[] args) {
		// Object creation and constructor calling
		Mobile Oppo = new Mobile("Oppo", 10000.0f);
		Mobile Vivo = new Mobile("Vivo", 29000.0f);
		Oppo.display();
		Vivo.display();
	}

}
