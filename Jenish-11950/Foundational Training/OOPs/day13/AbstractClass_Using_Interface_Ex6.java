package com.jenish.day13;

interface VehiclePlan {
	void engine();
	void wheel();
	void brandName();
}
abstract class Vehicle01 implements VehiclePlan{
	public void engine() {
		System.out.println("All Vehicle have one Engine");
		
	}
	public abstract void wheel();
	
	public abstract void brandName(); //particially complete class
	
	}
class Biker extends Vehicle01 {
	public void wheel() {
		System.out.println("Bike has two wheels");
		
	}
	public void brandName() {
		System.out.println("TVS");
		
	}
}

public class AbstractClass_Using_Interface_Ex6 {

	public static void main(String[] args) {
		
		
		VehiclePlan obj1 = new Biker();
		obj1.wheel();
		obj1.engine();
		obj1.brandName();
	}

}
