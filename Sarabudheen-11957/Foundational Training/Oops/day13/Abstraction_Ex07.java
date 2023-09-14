/****** Using Constructor in the Abstract class... ******/
package com.sara.day13;

abstract class Vehicle2 {

	Vehicle2(int a) {
		System.out.println("Constructor from Abstract Class...");
	}

	public void engine() {
		System.out.println("All Vehicle have one engine...");
	}

	public abstract void wheels();

	public abstract void brandName();
}

class Bike2 extends Vehicle2 {
	Bike2() {
		super(5);
	}

	public void wheels() {
		System.out.println("Bike has Two Wheels...");
	}

	public void brandName() {
		System.out.println("Pulsar...");
	}
}

public class Abstraction_Ex07 {

	public static void main(String[] args) {
		Vehicle2 obj = new Bike2();
		obj.wheels();
		obj.engine();
		obj.brandName();

	}

}
