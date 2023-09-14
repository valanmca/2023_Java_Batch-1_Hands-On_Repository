package com.purushoth.day10;

class Vehicle{
	void noOfEngine() {
		System.out.println("I have one Engine");
	}
}

class TwoWheeler extends Vehicle{//using the property of vehicle.
	void noOfWheels() {
		System.out.println("I have two wheels");
	}
}

class Bike extends TwoWheeler{//using the property of twowheeler.
	void brandName() {
		System.out.println("Brand Name Honda");
	}
}
public class VehicleInheritance {

	public static void main(String[] args) {
		Bike bike=new Bike();
		bike.noOfEngine();
		bike.noOfWheels();
		bike.brandName();

	}

}//Inheritance for vehicles and it is multilevel inheritance.
