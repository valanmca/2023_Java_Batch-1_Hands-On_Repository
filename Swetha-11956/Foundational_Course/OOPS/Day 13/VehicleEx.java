package com.swetha.day13;


abstract class Vehicle{
	void engine() {
		System.out.println("All vehicle has one engine");
	}
	abstract void wheel();
	abstract void brandName();
}
class Bike extends Vehicle{
	int a=8;
	void wheel() {
		System.out.println("Bike has two wheel");
	}
	void brandName() {
		System.out.println("TVS");
	}
}
public class VehicleEx {

	public static void main(String[] args) {
		Vehicle obj=new Bike();
		obj.wheel();
		obj.brandName();
		

	}

}
