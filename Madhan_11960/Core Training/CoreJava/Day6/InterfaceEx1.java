package com.madhan.coreday6;
interface Vehicle1
{
	void noOfEngine();
	void noOfWheels();
	void brandName();
}

abstract class Bike1 implements Vehicle1
{
	public void noOfEngine()
	{
		System.out.println("I have One Engine");
	}
	public abstract void noOfWheels();
	public abstract void brandName();
	
}

class TwoWheeler extends Bike1
{
	public void noOfWheels()
	{
		System.out.println("I have two wheels");
	}
	public void brandName()
	{
		System.out.println("Honda");
	}
}

public class InterfaceEx1 {

	public static void main(String[] args) {
		Vehicle1 V=new TwoWheeler();
		V.brandName();
		V.noOfWheels();
		V.noOfEngine();
		

	}

}
