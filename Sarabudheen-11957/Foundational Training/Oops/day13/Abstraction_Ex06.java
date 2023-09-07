/***** Creating Abstract class for vehicle with interface... *****/
package com.sara.day13;

interface VehiclePlan {
	void engine();

	void wheels();

	void brandName();
}

abstract class Vehicle1 implements VehiclePlan {
	public void engine() {
		System.out.println("All Vehicle have one engine...");
	}

	public abstract void wheels();

	public abstract void brandName();
}

class Bike1 extends Vehicle1 {
	public void wheels() {
		System.out.println("Bike has Two Wheels...");
	}

	public void brandName() {
		System.out.println("Pulsar...");
	}
}

class car1 extends Vehicle1 {
	public void wheels() {
		System.out.println("car has four Wheels...");
	}

	public void brandName() {
		System.out.println("Audi...");
	}
}
public class Abstraction_Ex06 {

	public static void main(String[] args) {
		Vehicle1 obj = new Bike1();
		obj.wheels();
		obj.brandName();

		VehiclePlan obj1 = new Bike1();
		obj1.wheels();
		obj1.engine();
		obj1.brandName();

	}

}
