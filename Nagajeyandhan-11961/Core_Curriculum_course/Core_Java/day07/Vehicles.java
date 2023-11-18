package com.jeyandhan.day07;
//abstraction

abstract class Vehicle{
	

	void noOfEngine() {
		System.out.println("I have one Engine");
	}
	
	abstract void noOfWheels();
	abstract void brandName();
}

class Bike extends Vehicle {
	
	void noOfWheels() {
		System.out.println("I have two Wheels");
	}
	void brandName() {
		System.out.println("Yamaha");
	}
}

class Car extends Vehicle {
	void noOfWheels() {
		System.out.println("I have Four Wheels");
	}
	void brandName() {
		System.out.println("Ford");
	}
}

public class Vehicles {

	public static void main(String[] args) {
		
		Vehicle bike = new Bike();
		
		bike.noOfEngine();
		bike.noOfWheels();
		bike.brandName();
		
		Car car = new Car();
		
		car.noOfEngine();
		car.noOfWheels();
		car.brandName();
	}

}
