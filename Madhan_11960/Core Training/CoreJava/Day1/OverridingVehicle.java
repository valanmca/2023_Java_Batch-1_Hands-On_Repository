package com.madhan.coreday1;

class Vehicle
{
	void drive()
	{
		System.out.println("Driving a car");
	}
}

class Car extends Vehicle
{
	void drive()
	{
		System.out.println("Repairing a car");
	}
}
public class OverridingVehicle {

	public static void main(String[] args) {
		Car kwid=new Car();
		kwid.drive();

	}

}
