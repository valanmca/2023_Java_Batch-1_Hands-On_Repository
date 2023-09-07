package com.madhan.day10;

// This is an example of Multilevel inheritance

class Vehicle
{
	static void noofEngine()
	{
		System.out.println("I have one engine");
	}
}

class TwoWheeler 
{
	void noofWheels()
	{
		System.out.println("I have two Wheels");
	}
}

class Bike extends TwoWheeler
{
	void brandName()
	{
		System.out.println("Honda");
	}
}

public class InheritanceEx1 {

	public static void main(String[] args) {
		Bike b=new Bike();
		b.brandName();
		b.noofWheels();
//		Vehicle v=new Vehicle();
		Vehicle.noofEngine();
		

	}

}
