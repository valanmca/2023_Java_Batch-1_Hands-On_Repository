package com.naveen.day9;

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
		System.out.println("Color : " + color);
		System.out.println("Price : " + price);
	}
}

public class Basic01 {

	public static void main(String[] args) {
		// Object Creation and Calling Constructor
		Fruits apple = new Fruits("Red", 50.0f);
		apple.display();

		Fruits mango = new Fruits("Yellow", 40.0f);
		mango.display();

	}

}
