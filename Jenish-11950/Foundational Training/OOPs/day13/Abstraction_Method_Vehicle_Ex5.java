package com.jenish.day13;

abstract class Vehicle {
	void engine() {
		System.out.println("All Vehicle have one Engine");
		
	}
	abstract void wheel();
	
	abstract void brandName(); //particially complete class
	
	}
class Bike extends Vehicle {
	void wheel() {
		System.out.println("Bike has two wheels");
		
	}
	void brandName() {
		System.out.println("TVS");
		
	}
}

public class Abstraction_Method_Vehicle_Ex5 {

	public static void main(String[] args) {
		Vehicle obj = new Bike();
		obj.wheel();
		obj.brandName();
		
		

	}

}
