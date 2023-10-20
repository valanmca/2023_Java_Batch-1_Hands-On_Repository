package com.mahesh.core_java;

class Vehicle
{
	void drive()
	{
		System.out.println("Every vehicle may repair");
	}
}
class Car extends Vehicle
{
	void drive()
	{
		System.out.println("Repairing a car in Car service center");
	}
}

class Bike extends Car
{
	void drive()
	{
		System.out.println("Repairing a Bike in Bike service center");
	}
}
public class Service {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bike repair = new Bike();
		repair.drive();

	}

}
