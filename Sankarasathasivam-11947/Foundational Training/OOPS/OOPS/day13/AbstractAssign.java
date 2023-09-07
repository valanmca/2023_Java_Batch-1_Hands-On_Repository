package com.shiva.day13;

interface VehiclePlan //it is a collection of abstract method
{
	void engine();//by default it is declared as abstract method
	void wheel();
	void brandName();
}

abstract class Vehicle implements VehiclePlan
{
	public void engine()
	{
		System.out.println("All Vehicle has Engine");
	}
	
	public abstract void wheel();
	
	public abstract void brandName();
}

class Bike extends Vehicle
{
	public void wheel()
	{
		System.out.println("Bike has two wheels");
	}
	
	public void brandName()
	{
		System.out.println("Royal Enfield");
	}
}
public class AbstractAssign {

	public static void main(String[] args) {
		
		Vehicle obj=new Bike();
		obj.engine();
		obj.wheel();
		obj.brandName();
		
		VehiclePlan obj1=new Bike();
		obj1.engine();
		obj1.wheel();
		obj1.brandName();

	}

}
