/********* Creating Constructor for Fruits Class... *********/
package com.sara.day09;

class Fruits {
	// Variables
	String color;
	float price;

	// Constructor
	Fruits(String color, float price) {
		this.color = color;
		this.price = price;
	}

	// Method
	void display() {
		System.out.println(" ");
		System.out.println("Color : " + color);
		System.out.println("Price : " + price);
	}
}

public class Oops_Example4 {

	public static void main(String[] args) {

		Fruits apple = new Fruits("Red", 100.0f);
		apple.display();

		Fruits mango = new Fruits("Yelow", 80.0f);
		mango.display();

	}

}
