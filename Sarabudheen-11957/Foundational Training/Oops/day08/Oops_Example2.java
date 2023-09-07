/*********** Creating Class For Mobile... **********/
package com.sara.day08;

class Mobile {
	// Varibles
	String brandName;
	float price;

	// Constructor
	Mobile(String brandName, float price) {
		System.out.println(" ");
		this.brandName = brandName;
		this.price = price;
	}

	// Method
	void display() {
		System.out.println("Brand Name : " + brandName);
		System.out.println("Price : " + price);
	}
}

public class Oops_Example2 {

	public static void main(String[] args) {
		// Object Creation and Constructor calling...
		Mobile redmi = new Mobile("Redmi", 12000.0f);
		redmi.display();

		Mobile oneplus = new Mobile("Oneplus", 30000.0f);
		oneplus.display();

	}

}
