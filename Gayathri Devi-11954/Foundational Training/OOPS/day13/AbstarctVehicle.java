package com.gayathri.day13;

interface VehiclePlan{//interface is a collection of abstract methods
	void engine();//abstract keyword is optional
	void wheel();//by default, interface take the methods as abstract methods
	public abstract void brand();
}
abstract class Vehicle implements VehiclePlan{
	public void engine() {
		System.out.println("All the vehicles have 1 engine");
	}

	public abstract void wheel();

	public abstract void brand();
}
class Bike extends Vehicle{
	public void wheel()
	{
		System.out.println("Bike has 2 wheels");
	}
	public void brand() {
		System.out.println("Brand : Passion Pro");
	}
}

public class AbstarctVehicle {//main class also a abstract class

	public static void main(String[] args) {
//		Vehicle obj;
//	obj.engine();
		
		Vehicle obj = new Bike();//abstract class allow to create a reference ,bt don't create a object
		obj.wheel();
		obj.brand();
//		obj.engine();
		
		VehiclePlan vp = new Bike();
		vp.engine();
		vp.wheel();
		vp.brand();

	}

}
