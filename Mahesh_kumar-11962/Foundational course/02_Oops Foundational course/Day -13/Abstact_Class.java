package com.mahesh.Oops_day13;

abstract class Vehicle {
	void engine() {
		System.out.println("vehicle have one engine.");
	}

	abstract void wheels();
	abstract void gear();

	abstract void brandname();
}

class Bike extends Vehicle
{
 void wheels()
 {
	 System.out.println("Bike have 2 wheels");
 }
 void brandname()
 {
	 System.out.println("TVS RTR 1604v");
 }
 void gear()
 {
	 System.out.println("5 gears");
 }
}
public class Abstact_Class {

	public static void main(String[] args) {
		
		Vehicle bike = new Bike();
		bike.engine();
		bike.brandname();
		bike.wheels();
		bike.gear();

	}

}
