/*********Example for Abstract class and Abstract methods************/
package com.sara.CoreJava.Day_07;

abstract class Vehicle {

	// Creating concrete class
	void noOfEngine() {
		System.out.println("I have 1 engine");
	}

	// Creating Abstract classes
	abstract void noOfWheels();

	abstract void brandName();

}

class Bike extends Vehicle {
	// Overriding the abstract classes
	void noOfWheels() {
		System.out.println("I have 2 Wheels");
	}

	void brandName() {
		System.out.println("Brand Name : Bajaj Pulsar");
	}

}

public class Abstract_Example01 {

	public static void main(String[] args) {

		// Creating object for Bike class
		Vehicle bike = new Bike();// DMD
		bike.noOfEngine();
		bike.noOfWheels();
		bike.brandName();
	}

}
