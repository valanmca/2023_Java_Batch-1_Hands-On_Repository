package com.naveen.day8;

class Mobile {
	// Variables
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

public class OopsEx02 {

	public static void main(String[] args) {
		// Object creation and Constructor Calling
		Mobile samsung = new Mobile("samsung", 10000.0f);
		samsung.display();

		Mobile nokia = new Mobile("nokia", 8000.0f);
		nokia.display();
	}

}
