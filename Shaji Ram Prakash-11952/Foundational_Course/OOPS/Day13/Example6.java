package com.shaji.Day13;

abstract class Vehicle2{
	Vehicle2(){
		System.out.println("Constructor on Abstract class");
	}
	public void engine(){
		System.out.println("All vehicle has one Engine");
	}
	public abstract void wheel();
	
	public abstract void brandName();
}

class Bike2 extends Vehicle2{
	public void wheel() {
		System.out.println("Bike as two wheels");
	}
	public void brandName() {
		System.out.println("Bike Brand");
	}
}

public class Example6 {

	public static void main(String[] args) {
		Vehicle2 obj = new Bike2();
		obj.engine();
		obj.brandName();
		obj.wheel();

	}

}
