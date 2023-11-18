package com.jeyandhan.day07;

//interface

interface VehiclePlan{
	void noOfEngine(); //by default public, abstract
	void noOfWheels();
	void brandName();
}

abstract class Vehicles1 implements VehiclePlan{
	

	public void noOfEngine() {
		System.out.println("I have one Engine");
	}
	
	public abstract void noOfWheels();
	public abstract void brandName();
}

class Bike1 extends Vehicles1 {
	
	public void noOfWheels() {
		System.out.println("I have two Wheels");
	}
	public void brandName() {
		System.out.println("Yamaha");
	}
}

class Car1 extends Vehicles1 {
	public void noOfWheels() {
		System.out.println("I have Four Wheels");
	}
	public void brandName() {
		System.out.println("Ford");
	}
}

public class Vehicle1 {

	public static void main(String[] args) {
		
		Vehicles1 bike = new Bike1();
		
		bike.noOfEngine();
		bike.noOfWheels();
		bike.brandName();
		
		Vehicles1 car = new Car1();
		
		car.noOfEngine();
		car.noOfWheels();
		car.brandName();
	}

}

