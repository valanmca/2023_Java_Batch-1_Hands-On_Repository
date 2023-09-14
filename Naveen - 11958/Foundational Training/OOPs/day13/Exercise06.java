package com.naveen.day13;

// Program to implement constructor inside abstract class
abstract class Vehicle1 {

	Vehicle1(int a) {
		System.out.println("Constructor from Abstract Class");
	}

	public void engine() {
		System.out.println("All Vehicle have one engine");
	}

	public abstract void wheel();

	public abstract void brandName();
}

class Bike1 extends Vehicle1 {
	Bike1() {
		super(5);
	}

	public void wheel() {
		System.out.println("Bike has two wheel");
	}

	public void brandName() {
		System.out.println("TVS");
	}
}

public class Exercise06 {

	public static void main(String[] args) {

		Vehicle1 obj = new Bike1();
		obj.engine();
		obj.wheel();
		obj.brandName();

	}

}
