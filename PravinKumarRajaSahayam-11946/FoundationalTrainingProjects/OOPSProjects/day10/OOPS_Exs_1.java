
package com.pravinkumar.day10;

class Fruits {
	// Variables
	String colour;
	float price;

	// Constructors
	Fruits(String colour, float price) {
		// this. is used for change or the different the instance variables
		// local variables
		this.colour = colour;
		this.price = price;
	}

	// Method
	void display() {
		System.out.println("Colour : " + colour);
		System.out.println("Price : " + price);
	}
}

public class OOPS_Exs_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Object Class Creation and Calling the Constructors
		Fruits Apple = new Fruits("Blue", 3000.0f);
		Apple.display();
		Fruits Grace = new Fruits("Green", 2000.0f);
		Grace.display();
		Fruits Orange = new Fruits("Red", 5000.0f);
		Orange.display();
	}

}
