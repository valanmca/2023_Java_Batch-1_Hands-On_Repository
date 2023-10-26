/******** Example Java program for inheritance and method overriding ********/
package com.sara.CoreJava.Day_01;

class vehicle {
	// Creating drive() method
	void drive() {
		System.out.println("All Vehicle can be drive");
	}
}

class car extends vehicle {
	// drive() Method overriding
	void drive() {
		System.out.println("Repairing a Car");
	}
}

public class Assignment_03 {
	public static void main(String[] args) {
		// Creating an object for car class
		car obj = new car();
		obj.drive();
	}
}
