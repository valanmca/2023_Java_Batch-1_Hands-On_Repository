package com.dharshu.day13;

//we can not create the object because it contains only the declaration part
//we can create the reference for the interface
//Interface is not a class
interface VehiclePlan{//be default the interface is the abstract and also public ,interface is the collection of abstract method
	void engine();//abstract is the optional
	
	void wheel();
	
	void BrandName();
	
	}

abstract class Vehicle implements VehiclePlan{
	public void engine() {
		System.out.println("\nAll the vehicle have one engine");
	}
	public abstract void wheel();
	
	public abstract void BrandName();
}

class Bike extends Vehicle{
	 
	public void wheel() {
		System.out.println("Bike has 2 wheel");
	}
	
	public void BrandName() {
		System.out.println("Brand name is: Honda");
	}
}

public class AbstractVehicle {

	public static void main(String[] args) {
		Vehicle vehi;
		
		Vehicle vehicle=new Bike();
		vehicle.wheel();
		vehicle.BrandName();
		
		VehiclePlan vp=new Bike();
		vp.engine();
		vp.wheel();
		vp.BrandName();

	}

}
