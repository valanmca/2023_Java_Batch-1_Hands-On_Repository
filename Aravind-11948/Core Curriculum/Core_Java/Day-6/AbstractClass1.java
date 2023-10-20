package com.core.day_06;

abstract class Vehicle{ //cannot be static  and final
	
	Vehicle(int a) // executed when we create a obj for sub class  
	// if it contains arguments then we create sub class obj and call super class constructor 
	{
		
	}
	void noOfEngine() {
		System.out.println("I have one engine-- ");
	}
	
	abstract void noOfWheel() ;
	abstract void brandName();
}

class Bike extends Vehicle
{    
	Bike()
	{
	super(10);
	}
	
	//there is default constructor to call super class constructor
	 void noOfWheel() {
		 System.out.println("I have two wheels--");
		 
	 }
	 void brandName()
	 {
		System.out.println("MT-15--") ;
	 }
}

public class AbstractClass1 {

	public static void main(String[] args) {
		Vehicle obj=new Bike();
		obj.noOfEngine();
		obj.noOfWheel();
		obj.brandName();
		
	}

}
