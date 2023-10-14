package com.jenish.OopsRecap;

class Vehicleoverride {
	public void drive() {
		System.out.println("We can Drive a car");
	}
}
class Car extends Vehicleoverride{
	public void drive() {
		System.out.println("Repairing a car");
	}
}

public class Vehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		car.drive();

	}

}
