package com.naveen.day1;
/*Write a program to create a class called Vehicle with a method called drive(). create
 * a subclass called Car that overrides the drive() method to print "Repairing a car."*/
class Vehicle {
	public void drive() {
		System.out.println("All vehicles can able to repair");
	}
}

class Car extends Vehicle {
	public void drive() {
		System.out.println("Repairing a car!");
	}
}

public class Ex02 {

	public static void main(String[] args) {
		
		Car obj = new Car();
		obj.drive();
		

	}

}
