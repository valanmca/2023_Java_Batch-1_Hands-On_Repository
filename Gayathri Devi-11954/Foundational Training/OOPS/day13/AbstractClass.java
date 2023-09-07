package com.gayathri.day13;

abstract class MyVehicle  {//abstract will allow to create a constructor class
	MyVehicle(int a)//abstract class = abstract methods + concrete method
	{
		System.out.println("COnstructtor of Abstract class " +a);
	}
	public void engine() {
		System.out.println("All the vehicles have 1 engine");
	}

	public abstract void wheel();

	public abstract void brand();
}

class MyBike extends MyVehicle {
	MyBike()
	{
		super(10);	
	}
	
	public void wheel() {
		System.out.println("Bike has 2 wheels");
	}

	public void brand() {
		System.out.println("Brand : Passion Pro");
	}
}

public class AbstractClass {

	public static void main(String[] args) {
		MyVehicle obj = new MyBike();
		obj.engine();
		obj.wheel();
		obj.brand();

	}

}
