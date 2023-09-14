//Abstraction and Interface (Vehicle)

package com.jeyandhan.day13;

interface VehiclePlan { // interface class

	// abstract method
	public void engine();

	public void wheel();

	public void brandName();
}

abstract class Vehicle implements VehiclePlan {
	public void engine() {
		System.out.println("All vehicle have one Engine");
	}

	// declaration
	public abstract void wheel();

	public abstract void brandName();
}

class Bike extends Vehicle implements VehiclePlan { // sub class
	public void wheel() { // defining
		System.out.println("Bike has Two Wheel");
	}

	public void brandName() {
		System.out.println("The Brand Name is Pulsar");
	}
}

public class VechileAbstract {

	public static void main(String[] args) {
		// object creation

		Vehicle obj = new Bike(); // DMD for abstract class

		obj.wheel();

		obj.brandName();

		VehiclePlan obj1 = new Bike(); // DMD for interface class

		obj1.wheel();

		obj1.brandName();

	}

}
