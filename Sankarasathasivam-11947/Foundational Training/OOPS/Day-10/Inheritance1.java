package com.shiva.day10;

//Multilevel Inheritance      

class Vehicle//Super Class
{
	void noOfEngine()
	{
		System.out.println("I have one Engine");
	}
}

class TwoWheeler extends Vehicle//Sub Class
{
	void noOfWheels()
	{
		System.out.println("I have two wheels");
	}
}

class Bike extends TwoWheeler//last Subclass
{
	void brandName()
	{
		System.out.println("Brand Name Royal Enfield");
	}
}
public class Inheritance1 {

	public static void main(String[] args) {
		Bike bike=new Bike();
		bike.noOfEngine();
		bike.noOfWheels();
		bike.brandName();

	}

}
