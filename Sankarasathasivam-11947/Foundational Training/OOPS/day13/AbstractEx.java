package com.shiva.day13;

abstract class Vehicle1
{
	Vehicle1(int a)//constructor
	{
		System.out.println("Constructor for abstract class");
	}
	public void engine()
	{
		System.out.println("All Vehicle has Engine");
	}
	
	abstract void wheel();
	
	abstract void brandName();
}

class Bike1 extends Vehicle1
{
	Bike1()
	{
		super(5);
	}
	public void wheel()
	{
		System.out.println("Bike has two wheels");
	}
	
	public void brandName()
	{
		System.out.println("Royal Enfield");
	}
}
public class AbstractEx {

	public static void main(String[] args) {
		
		Vehicle1 obj=new Bike1();
		obj.engine();
		obj.wheel();
		obj.brandName();

	}

}
