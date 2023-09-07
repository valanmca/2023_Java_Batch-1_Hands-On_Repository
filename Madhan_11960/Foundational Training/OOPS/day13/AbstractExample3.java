package com.madhan.day13;

abstract class Vehicle1   //abstract class
{
	int a=10;
	public abstract void wheel();  //abstract method
	public abstract void brandName();
	
	Vehicle1(int a) //constructor
	{
		System.out.println("Constructor for abstract class:"+a);
	}
	
	public void noofEngine() //concrete method
	{
		System.out.println("All vehicle have one engine");
	}

}

class Bike1 extends Vehicle1  //concrete class
{
	Bike1()
	{
		super(5);
	}
	public void wheel()
	{
		System.out.println("I have two wheels");
	}
	public void brandName()
	{
		System.out.println("Honda");
		
	}
}

abstract public class AbstractExample3 {

	public static void main(String[] args) {
		
	Vehicle1 obj=new Bike1();
		obj.brandName();
		obj.wheel();
		obj.noofEngine();
		System.out.println(obj.a);

	}

}
