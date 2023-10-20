package com.dharshu.day6;

//interface must be a public or default access specifier.
interface VehiclePlan{
	void noOfEngine();//public & abstract
	void noOfWheel();
	void brandName();
}
abstract class Vehicle1 implements VehiclePlan{

	public void noOfEngine() {
		System.out.println("The vehicle has a Engine");
	}
	public abstract void noOfWheel();
	public abstract void brandName();
}

class Bike1 extends Vehicle1{
	
	public void noOfWheel() {
		System.out.println("The bike has two wheel");
	}
	public void brandName() {
		System.out.println("Honda");
	}
}


public class Interface_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VehiclePlan bike = new Bike1();
		bike.noOfEngine();
		bike.noOfWheel();
		bike.brandName();

	}

}
