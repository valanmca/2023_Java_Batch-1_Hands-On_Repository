//Class Object Example Program with mobile details

package com.jeyandhan.day08;

class Mobiles {
	// Variables

	String brandName;
	float price;

	// Constructor
	Mobiles(String brandName, float price) {
		System.out.println("");
		this.brandName = brandName;
		this.price = price;
	}

	// Method
	void display() {
		System.out.println("Enter the Brand Name of the Mobile: " + brandName);
		System.out.println("Enter the Price of the Mobile: " + price);
	}
}

public class Mobile {

	public static void main(String[] args) {
		// object creation and constructor calling

		Mobiles samsung = new Mobiles("Samsung", 10000.0f);
		// method calling
		samsung.display();

		Mobiles nokia = new Mobiles("Nokia", 5000.0f);
		nokia.display();

	}

}
