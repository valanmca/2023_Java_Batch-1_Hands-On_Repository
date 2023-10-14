package com.dharshu.OopsRecap;

class Vehicle {
	
	public void drive() {
		System.out.println("We can drive a car");
	}
}

class Car extends Vehicle{
	public void drive() {
		System.out.println("Repairing a Car");
	}
}

public class VehicleOverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car=new Car();
		car.drive();
	}

}
