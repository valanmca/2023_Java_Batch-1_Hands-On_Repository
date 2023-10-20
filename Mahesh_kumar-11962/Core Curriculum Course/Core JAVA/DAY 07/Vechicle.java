package com.mahesh.core_java_day_07;

abstract class vandi
{
	//we can use constructor inside the abstract class
	vandi(int a)
	{
		System.out.println("abstract constructor");
	}
    final void noOfEngine()
	{
		System.out.print("I have one engine");
	}
	abstract void nowheels();
	abstract void brand();
}

class biker extends vandi
{
	biker()
	{
		super(4);  
	}
	void nowheels()
	{
	System.out.println("Bike have 2 wheels");	
	}
	void brand()
	{
		System.out.println("Honda");
	}
}
public class Vechicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		vandi rider = new biker();
		rider.brand();
		rider.nowheels();
	}

}
