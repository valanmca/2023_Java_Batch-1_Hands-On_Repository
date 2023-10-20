package com.jeban.AbstractInterface;

interface VehiclePlan {
	void noOfEngine();// public&abstract

	void noOfWheels();

	void brandname();
}

abstract class Vehicle implements VehiclePlan {
	public Vehicle(int a) {
		System.out.println("Constructor");
	}

	public void noOfEngine() {
		System.out.println("I have one Engine");
	}

	public abstract void noOfWheels();

	public abstract void brandname();

	
}

class Bike extends Vehicle {
	Bike() {
		super(4);
	}

	public void noOfWheels() {
		System.out.println("I Have Two Wheels");
	}

	public void brandname() {
		System.out.println("Honda");
	}

}

public class Abstract1 {

	public static void main(String[] args) {
		Vehicle bike = new Bike();
		bike.noOfEngine();
		bike.noOfWheels();
		bike.brandname();

	}

}
