package com.madhan.day10;

class Vehicle1
{
	Vehicle1()
	{
		System.out.println("I have one engine");
	}
}

class TwoWheeler1 extends Vehicle1
{
	TwoWheeler1()
	{
		System.out.println("I have two Wheels");
	}
}

class Bike1 extends TwoWheeler1
{
	Bike1()
	{
		System.out.println("Honda");
	}
}


public class ConstructorinvokingOrder {

	public static void main(String[] args) {
		Bike1 b=new Bike1();
		
	}

}
