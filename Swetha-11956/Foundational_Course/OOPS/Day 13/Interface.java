package com.swetha.day13;
interface VehiclePlan{
	 void engine();
	 void wheel();     //By default,interface methods are abstract,we cannot create obj for interface----it is collection of abstract method
	 abstract void brandName();
}

abstract class Vehicle1 implements VehiclePlan{
	public void engine() {
		System.out.println("All vehicle has one engine");
	}
	public abstract void wheel();
	public abstract void brandName();
}
class Bike1 extends Vehicle1{
	public void wheel() {
		System.out.println("Bike has two wheel");
	}
	public void brandName() {
		System.out.println("TVS");
	}
}
public class Interface {

	public static void main(String[] args) {
		Vehicle1 obj=new Bike1();
		obj.wheel();      //like abstract ,we can also create reference for interface
		obj.brandName();
		
		VehiclePlan obj1=new Bike1();
		obj1.engine();
		obj1.wheel();
		obj1.brandName();

	}

}
