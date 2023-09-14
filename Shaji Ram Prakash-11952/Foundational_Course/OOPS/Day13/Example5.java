package com.shaji.Day13;

interface vehiclePlan{
	void engine(); // Abstract keyword is optional in interface class
	void wheels();
	void brandName();
}

abstract class Vehicle1 implements vehiclePlan {
	public void engine() {
		System.out.println("All vehicle have one engine...");
	}

	public abstract void wheels();

	public abstract void brandName();
}

class bike1 extends Vehicle1 {
	public void wheels() {
		System.out.println("Bike has Two Wheels ...");
	}
	public void brandName() {
		System.out.println("Brand of Bike ...");

	}
}

public class Example5 {

	public static void main(String[] args) {
		Vehicle1 obj = new bike1();
		obj.wheels();
		obj.engine();
		obj.brandName();
		
		System.out.println("\n");
		
		vehiclePlan obj1 = new bike1();
		obj1.wheels();
		obj1.engine();
		obj1.brandName();
	}

}
