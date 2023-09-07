//OOPS using Mobile
package com.pravinkumar.day9;

class Mobile {
	// Variables
	String brandName;
	float price;

	// Constructors
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

public class OOPS_Exs_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Object Creation and Constructors Calling
		Mobile samsung = new Mobile("Samsung", 10000.0f);
		samsung.display();
		Mobile nokia = new Mobile("Nokia", 8000.0f);
		nokia.display();
	}

}
