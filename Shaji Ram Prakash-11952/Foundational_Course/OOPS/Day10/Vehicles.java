package com.shaji.Day10;

class vehicle{
	void noOfEngine() {
		System.out.println("I have one Engine");
	}
}

class twoWheeler extends vehicle {
	void noOfWheels() {
		System.out.println("I have Two Wheels");
	}
}

class Bike extends twoWheeler{
	void brandName(){
		System.out.println("Brand Name TVS 50 with 40-mileage0");
	}
}

public class Vehicles {

	public static void main(String[] args) {
		Bike bike = new Bike();
		bike.noOfEngine();
		bike.noOfWheels();
		bike.brandName();
	}

}
