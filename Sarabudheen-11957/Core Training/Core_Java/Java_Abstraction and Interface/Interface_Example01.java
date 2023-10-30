package com.sara.CoreJava.Day_07;

//Creating an interface
interface VehiclePlan {
	void noOfEngine();// public & Abstract

	void noOfWheels();

	void brandName();
}

abstract class Vehicle2 implements VehiclePlan {

	// Creating concrete class
	public void noOfEngine() {
		System.out.println("I have 1 engine");
	}

	// Creating Abstract classes
	public abstract void noOfWheels();

	public abstract void brandName();

}

class Bike2 extends Vehicle2 {

	// Overriding the abstract classes
	public void noOfWheels() {
		System.out.println("I have 2 Wheels");
	}

	public void brandName() {
		System.out.println("Brand Name : Bajaj Pulsar");
	}

}

public class Interface_Example01 {

	public static void main(String[] args) {

		VehiclePlan bike = new Bike2();
		bike.noOfEngine();
		bike.noOfWheels();
		bike.brandName();

	}

}
