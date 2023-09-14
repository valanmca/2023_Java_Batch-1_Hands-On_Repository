package com.jeban.OOPsday2;

class Fruits {
	// Variables
	String colour;
	float price;

	// Constructor
	Fruits(String colour, float price) {
		this.colour = colour;
		this.price = price;

	}

	// Method
	void display() {
		System.out.println(	"Colour is:" + colour);
		System.out.println("price is:" + price);
	}
}

public class OOPs1 {

	public static void main(String[] args) {
		// object Creation and Calling Constructor
		Fruits Apple = new Fruits("red", 100.0f);
		// method calling
		Apple.display();

		Fruits Orange = new Fruits("orange", 100.0f);
		Orange.display();

	}

}
