package com.gayathri.day1;
/*
Write a java program to create a class called vehicle with a method called drive().
Create a subclass called car that overrides the drive() method to print "Repairing a car".

*/
class Vehicle{
	void drive() {
		System.out.println("All vehicles can use drive");
	}
}
class Car extends Vehicle{
	void drive() {
		//super.drive();
		System.out.println("Repairing a car");
	}
}
public class VehicleClassEx2 {

	public static void main(String[] args) {
		Car obj = new Car();
		obj.drive();

	}

}
