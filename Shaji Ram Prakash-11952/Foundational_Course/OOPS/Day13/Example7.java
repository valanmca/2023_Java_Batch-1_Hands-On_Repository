package com.shaji.Day13;

abstract class Vehicle3{
	Vehicle3(int a){
		System.out.println("Constructor on Abstract class(Example value : "+a+")");
	}
	public void engine(){
		System.out.println("All vehicle has one Engine");
	}
	public abstract void wheel();
	
	public abstract void brandName();
}

class Bike3 extends Vehicle3{
	Bike3(){
		super(10);
	}
	public void wheel() {
		System.out.println("Bike as two wheels");
	}
	public void brandName() {
		System.out.println("Bike Brand");
	}
}

public class Example7 {

	public static void main(String[] args) {
		Vehicle3 obj = new Bike3();
		obj.brandName();
		obj.engine();
		obj.wheel();

	}

}
