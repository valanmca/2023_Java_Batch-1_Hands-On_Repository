package com.oops;

class vehicle {
	void drive() {
		System.out.println("Able to drive a vehicle");
	}

}

class car extends vehicle {
	void drive() {
		System.out.println("Repairing a car");
		
	}

}

public class Overriding_vehicle {

	public static void main(String[] args) {
		
		vehicle obj=new car();
		obj.drive();

	}

}
