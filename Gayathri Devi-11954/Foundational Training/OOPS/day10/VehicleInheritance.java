package com.gayathri.day10;//multilevel inheritance

class Vehicle{//parent class
	void noOfEngine() {
		System.out.println("I have only one engine");
	}
}

class TwoWheeler extends Vehicle{//child class
	void noOfWheels() {
		System.out.println("I have 2 wheels");
	}
}

class Bike extends TwoWheeler{//grand child class
	void brandName() {
		System.out.println("Passion Pro");
	}
}
public class VehicleInheritance {

	public static void main(String[] args) {
		Bike bike = new Bike();
		bike.noOfEngine();
		bike.noOfWheels();
		bike.brandName();
	}
}