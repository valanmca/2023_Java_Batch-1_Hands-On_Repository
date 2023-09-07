package com.naveen.day13;

// Program to implement interface .
interface VehiclePlan {
	void engine();

	void wheel();

	void brandName();

}

abstract class Vehicle implements VehiclePlan {
	public void engine() {
		System.out.println("All Vehicle have one engine");
	}

	public abstract void wheel();

	public abstract void brandName();
}

class Bike extends Vehicle {
	public void wheel() {
		System.out.println("Bike has two wheel");
	}

	public void brandName() {
		System.out.println("TVS");
	}
}

public class Exercise05 {

	public static void main(String[] args) {
		Vehicle obj = new Bike();
		obj.wheel();
		obj.brandName();
		obj.engine();

		VehiclePlan obj1 = new Bike();
		obj1.wheel();
		obj1.brandName();
		obj1.engine();
	}

}
