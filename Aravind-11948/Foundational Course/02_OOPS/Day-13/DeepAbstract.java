package com.aravind.day13;

abstract class Vehicle1

{
	Vehicle1(int a) {    // constructor
		System.out.println("constructor for abstract"+a);
	}

	public void engine() {
		System.out.println("All vehicle have one engine");
	}

	public abstract void wheel();

	public abstract void brandName();
}

class Bike1 extends Vehicle1 {
	Bike1()
	{
		super(10);
	}
	public void wheel() {
		System.out.println("I have two wheels");
	}

	public void brandName() {
		System.out.println("MT-15");
	}

}

public class DeepAbstract {

	public static void main(String[] args) {
		Vehicle1 obj = new Bike1();
		obj.wheel();
		obj.brandName();
		obj.engine();

	}

}
