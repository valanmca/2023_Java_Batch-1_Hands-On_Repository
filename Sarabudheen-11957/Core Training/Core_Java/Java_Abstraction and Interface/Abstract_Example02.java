/*********Example for Abstract class and Abstract methods with Constructor************/
package com.sara.CoreJava.Day_07;

abstract class Vehicle1 {

	// Creating Constructor for Vehicle1 class
	Vehicle1(int a) {
		System.out.println("Concreate Class");
	}

	// Creating concrete class
	void noOfEngine() {
		System.out.println("I have 1 engine");
	}

	// Creating Abstract classes
	abstract void noOfWheels();

	abstract void brandName();

}

class Bike1 extends Vehicle1 {

	// Creating Constructor for Bike1 class
	Bike1() {
		super(5);
	}

	// Overriding the abstract classes
	void noOfWheels() {
		System.out.println("I have 2 Wheels");
	}

	void brandName() {
		System.out.println("Brand Name : Bajaj Pulsar");
	}

}

public class Abstract_Example02 {

	public static void main(String[] args) {
		// Creating object for Bike1 class

		Vehicle1 bike = new Bike1();// DMD
		bike.noOfEngine();
		bike.noOfWheels();
		bike.brandName();
	}

}
