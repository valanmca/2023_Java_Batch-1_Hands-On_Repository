package com.matthew.day13;
//in interface the scope is default public 
//so we have to make all the method as public
interface VehiclePlan{
	//interface collection of only abstract class
	// in interface abstract keyword is optional
	//in interface all the method are default abstract
	//cannot create an object for interface
	abstract void engine();
	void wheel();
	void brandName();
	
}
abstract class Vehicle implements VehiclePlan{
	//abstract is a collection of both abstract method + concrete method
	public void engine() {
		System.out.println("All vehicle have one engine");
	}
	public abstract void wheel();// we cannot predefine no of wheels so we use abstract
	public abstract void brandName();
}

class Bike extends Vehicle{
	//we have to override all the abstract methods in abstract class
	public void wheel(){
			System.out.println("Bike has two wheels");
	}
	
	public void brandName() {
		System.out.println("Royal Enfield");
	}
}

public class Assessment3 {

	public static void main(String[] args) {
		//creating reference for vehicle
		Vehicle obj;
		//creating object for the reference obj
		obj = new Bike();
		obj.brandName();
		obj.wheel();
		obj.engine();
		
		//creating reference for interface
		
		VehiclePlan vp ;
		//vp = new Bike(); we cant use this because interface is not a class,to use this  we have to use 'implements' keyword and set all the method scope to public 
		vp = new Bike();
		
	}

}
