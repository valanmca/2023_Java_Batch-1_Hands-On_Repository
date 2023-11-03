package com.naveen.day5;

abstract class Vehicle {
	Vehicle(int a) {
		System.out.println("Constructor");
	}

	void nofEngine() {
		System.out.println("I have One Engine");
	}

	abstract void noOfWheels();

	abstract void brandName();
}

class Bike extends Vehicle {
	Bike() {
		super(4);
	}

	void noOfWheels() {
		System.out.println("I have Two Wheels");
	}

	void brandName() {
		System.out.println("Honda");
	}
}

public class Ex_1_Abstractclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle bike = new Bike();
		bike.nofEngine();
		bike.noOfWheels();
		bike.brandName();
	}

}
