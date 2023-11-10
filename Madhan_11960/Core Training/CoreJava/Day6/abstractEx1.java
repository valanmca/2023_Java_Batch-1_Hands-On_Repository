package com.madhan.coreday6;

abstract class Vehicle
{
	Vehicle()
	{
		System.out.println("Abstract Constructor");
	}
	void noOfEngine()
	{
		System.out.println("I have one engine");
	}
	abstract void noOfWheels();
	abstract void brandName();
}

class Bike extends Vehicle
{
	void noOfWheels()
	{
		System.out.println("I have four wheels");
	}
	void brandName()
	{
		System.out.println("Honda");
	}
}

public class abstractEx1 {

	public static void main(String[] args) {
		Vehicle obj=new Bike();
		obj.noOfWheels();
		obj.brandName();
		obj.noOfEngine();

	}

}
