package com.shiva.core.day06;

abstract class Vehicle {

	Vehicle(int a) {
		System.out.println("Constructor");// In abstract class also we can use constructor because the subclass always
											// invokes the default constructor
	}

	void noOfEngine() {
		System.out.println("I have One Engine");
	}

	abstract void noOfWheels();

	abstract void brandName();
}

class Bike extends Vehicle {

	Bike(int b) {
		super(5);
	}

	void noOfWheels() {
		System.out.println("I have two Wheels");
	}

	void brandName() {
		System.out.println("Royal Enfield");
	}
}

public class Abs_01 {

	public static void main(String[] args) {
		Vehicle bike = new Bike(10);
		bike.noOfEngine();
		bike.noOfWheels();
		bike.brandName();
	}

}
