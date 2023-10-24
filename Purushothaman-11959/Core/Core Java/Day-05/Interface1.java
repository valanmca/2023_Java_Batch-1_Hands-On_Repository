package com.purushoth.day_05;

interface VehiclePlan { //abstract keyword is optional
	void noOfEngine();
	void noOfWheels(); //by default it is public & abstract
	void brandName();
}
abstract class Vehicle1 implements VehiclePlan {
	
	public void noOfEngine() {
		System.out.println("I have One Engine");
	}
	public abstract void noOfWheels();
	public abstract void brandName();      
}
class Bike1 extends Vehicle1  {
	
	public void noOfWheels() {
		System.out.println("I have Two Wheels");
	}
	public void brandName() {
		System.out.println("Honda");     //Private is only for variable,method,constructor
	}
}
public class Interface1 {

	public static void main(String[] args) {
		Vehicle bike=new Bike();
		bike.noOfEngine();
		bike.noOfWheels();
		bike.brandName();

	}

}
