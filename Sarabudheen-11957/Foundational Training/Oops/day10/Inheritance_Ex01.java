/********* Example for Inheritance Using Vehicle Class... ********/
package com.sara.day10;

class vehicle {
	void noOfEngine() {
		System.out.println("I have one Engine");
	}
}

class TwoWheeler extends vehicle {
	void noOfWheels() {
		System.out.println("I have Two Wheels");
	}
}

class Bike extends TwoWheeler {
	void brandName() {
		System.out.println("Brand Name Pulsar");
	}
}

public class Inheritance_Ex01 {

	public static void main(String[] args) {

		Bike bike = new Bike();
		bike.noOfEngine();
		bike.noOfWheels();
		bike.brandName();

	}

}
