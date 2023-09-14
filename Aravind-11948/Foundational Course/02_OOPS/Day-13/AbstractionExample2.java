package com.aravind.day13;
interface  VehiclePlan// interface is collection of abstract method
{
	abstract void engine ();// abstract keyword are default
	void wheel();
	
	void brandName();
}

	abstract class Vehicle implements VehiclePlan

    {
	public void engine ()
	{
		System.out.println("All vehicle have one engine");
	}
	public abstract void wheel();
	public abstract void brandName();
}

class Bike extends Vehicle{
	public void wheel()
	{
		System.out.println("I have two wheels");
	}
	public void brandName()
	{
		System.out.println("MT-15");
	}
	
}
public class AbstractionExample2 {

	public static void main(String[] args) {
		Vehicle obj;//  reference for abstract class we cannot create obj
		obj=new Bike();//super class reference =sub class object
		obj.wheel();
		obj.brandName();
		obj.engine();
		VehiclePlan obj1;
		obj1=new Bike();
		obj1.engine();
		obj1.brandName();
		obj1.engine();
		
		

	}

}
