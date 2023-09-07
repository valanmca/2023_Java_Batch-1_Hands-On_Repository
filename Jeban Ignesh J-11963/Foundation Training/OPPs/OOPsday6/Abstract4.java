package com.jeban.OOPsday6;//Abstract class using Constructor. 

abstract class Vechicle1 {

	Vechicle1(String a) {
		System.out.println("Constructor from astract class");// we can use constructor inside the abstract class

	}

	public void engine() {
		System.out.println("all vechicle have one engine");

	}

	public abstract void Wheel();

	public abstract void brandname();

}

class Bike1 extends Vechicle1 {
	Bike1() {
		super("All");
	}

	public void Wheel() {
		System.out.println("Bike has two wheel");

	}

	public void brandname() {
		System.out.println("Honda");
	}

}

class Car extends Vechicle1 {
	Car() {
		super("All");
	}

	public void Wheel() {
		System.out.println("Car has Four wheel");

	}

	public void brandname() {
		System.out.println("Hundai");
	}

}

public class Abstract4 {

	public static void main(String[] args) {
		Vechicle1 obj = new Bike1();
//		obj.engine();
//		obj.Wheel();
//		obj.brandname();

		Vechicle1 obj1 = new Car();
		obj1.engine();
		obj1.Wheel();
		obj1.brandname();

	}

}
