//Method Overriding

package com.jeyandhan.day01;

class Vehicle{
	
	public void drive() { //method
		
		System.out.println("Repairing Drive");
	}
}

class Car extends Vehicle{ // single inheritance
	
	public void drive() { //method overriding
		
		super.drive(); // calls the super class method
		
		System.out.println("Repairing a Car");
	}
}

public class Vehicles {

	public static void main(String[] args) {
		
		Car car = new Car(); //object creation 
		
		car.drive(); //method calling
	}

}
