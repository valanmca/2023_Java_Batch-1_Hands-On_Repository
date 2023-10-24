package com.purushoth.day_05;

abstract class Vehicle {
	
	Vehicle(int a){
		System.out.println("Constructor");
	}
	void noOfEngine() {
		System.out.println("I have One Engine");
	}
	abstract void noOfWheels();
	abstract void brandName();
}
class Bike extends Vehicle {
	Bike(){
		super(5);
	}
	void noOfWheels() {
		System.out.println("I have Two Wheels");
	}
	void brandName() {
		System.out.println("Honda");
	}
}
public class Abstract1 {

	public static void main(String[] args) {
		Vehicle bike=new Bike();
		bike.noOfEngine();
		bike.noOfWheels();
		bike.brandName();

	}

}
