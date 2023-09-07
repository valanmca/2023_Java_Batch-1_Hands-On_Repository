package com.domnic.oopsday6;
//interface
interface VehiclePlan {// by default interface methods all are abstract
	void engine();

	void Wheels();

	void brandName();
}

abstract class Vehicle1 implements VehiclePlan{
	public void engine() {
		System.out.println("All vehicles have One Engine");
	}

	public abstract void Wheels();

	public abstract void brandName();
}

class Bike1 extends Vehicle1 {
	public void Wheels() {
		System.out.println("Bike has 2 Wheels");
	}

	public void brandName() {
		System.out.println("Yamaha");
	}
}

public class AbstractClass2 {

	public static void main(String[] args) {
		Vehicle1 vehicle = new Bike1();
		vehicle.Wheels();
		vehicle.brandName();

		VehiclePlan vehicle1=new Bike1();
		vehicle1.Wheels();
		vehicle.brandName();
		vehicle.engine();

	}

}
