package com.shiva.core.day06;

abstract interface VehiclePlan {
	void noOfEngine();//public & abstract

	void noOfWheels();

	void brandName();
}

abstract class Vehicles implements VehiclePlan {
	public void noOfEngine() {
		System.out.println("I have One Engine");
	}

	public abstract void noOfWheels();

	public abstract void brandName();
}

class Bikes extends Vehicles {
	public void noOfWheels() {
		System.out.println("I have two Wheels");
	}

	public void brandName() {
		System.out.println("Honda");
	}
}

public class Interf_01 {

	public static void main(String[] args) {
		VehiclePlan bike = new Bikes();
		bike.noOfEngine();
		bike.noOfWheels();
		bike.brandName();
	}

}
