package com.dharshu.day6;

//The purpose of abstract class is we can group the common functionality of the sub class.
abstract class Vehicle{
	Vehicle(int a){
		System.out.println("Constructor");
		System.out.println(a);
	}
	void noOfEngine() {
		System.out.println("The vehicle has a Engine");
	}
	abstract void noOfWheel();
	abstract void brandName();
}

class Bike extends Vehicle{
	Bike(){
		super(5);
	}
	void noOfWheel() {
		System.out.println("The bike has two wheel");
	}
	void brandName() {
		System.out.println("Honda");
	}
}

public class Abstract_Class {

	public static void main(String[] args) {
		Vehicle bike = new Bike();
		bike.noOfEngine();
		bike.noOfWheel();
		bike.brandName();

	}

}
