package com.madhan.day13;

interface vehiclePlan  //interface is collection of only abstract methods
{
	void noofEngine();  //In interface,all the methods are abstract by default 
	void wheel();
	void brandName();
}

abstract class Vehicle  implements vehiclePlan
{
	public abstract void wheel();  //abstract method
	public abstract void brandName();
	
	public void noofEngine() //concrete method
	{
		System.out.println("All vehicle have one engine");
	}

}

class Bike extends Vehicle
{
	public void wheel()
	{
		System.out.println("I have two wheels");
	}
	public void brandName()
	{
		System.out.println("Honda");
		
	}
}
public class AbstractandinterfaceExample2usingvehicle {

	public static void main(String[] args) {
		
		Vehicle obj=new Bike();
		obj.brandName();
		obj.wheel();
		obj.noofEngine();
		
		vehiclePlan obj1=new Bike();
		obj1.brandName();
		obj1.wheel();
		obj1.noofEngine();
        
	}

}
