package com.jeban.oops;
class Vehicle{
	void drive() {
		System.out.println("All Veichels Repairied");
		
	}
}
class Car extends Vehicle{
	void drive() {
		System.out.println("Repairing a car");
	}
}

public class Program2 {

	public static void main(String[] args) {
		Car obj=new Car();
		obj.drive();

	}

}
