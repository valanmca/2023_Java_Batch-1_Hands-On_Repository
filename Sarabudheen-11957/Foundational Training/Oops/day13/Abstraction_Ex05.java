/******** Creating Abstract class for vehicle... *******/
package com.sara.day13;

abstract class Vehicle {
	void engine() {
		System.out.println("All Vehicle have one engine...");
	}

	abstract void wheels();

	abstract void brandName();
}

class Bike extends Vehicle {
	void wheels() {
		System.out.println("Bike has Two Wheels...");
	}

	void brandName() {
		System.out.println("Pulsar...");
	}
}

public class Abstraction_Ex05 {

	public static void main(String[] args) {
		Vehicle obj = new Bike();
		obj.wheels();
		obj.brandName();

	}

}
