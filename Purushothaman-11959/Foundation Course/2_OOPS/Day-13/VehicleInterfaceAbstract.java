package com.purushoth.day13;

interface VehiclePlan {
	void engine(); //abstract keyword is optional.
	void wheel(); // abstract keyword is optional.
	void brandName(); // abstract keyword is optional.
}
abstract class Vehicle implements VehiclePlan {
	public void engine() {
		System.out.println("All Vehicles have One Engine");
	}
	public abstract void wheel();
	
	public abstract void brandName();
}

class Bike extends Vehicle{
	public void wheel() {
		System.out.println("Bike has 2 Wheel");
	}
	public void brandName() {
		System.out.println("Rx 100");
	}
}
public class VehicleInterfaceAbstract {

	public static void main(String[] args) {
		/*Vehicle obj;  //reference for object.
		Vehicle obj1=new Bike(); //Dynamic Method Dispatch.
		obj1.engine();
		obj1.brandName();
		obj1.wheel();*/
		
		
		VehiclePlan obj=new Bike();
		obj.engine();
		obj.wheel();
		obj.brandName();

	}

} //Interface,Abstract for Vehicle. 
