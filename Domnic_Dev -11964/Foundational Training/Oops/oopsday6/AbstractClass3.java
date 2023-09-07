package com.domnic.oopsday6;

abstract class Vehicle2 {
	Vehicle2(int a){
		System.out.println("Constructor from abstract class");
	}
	
	public void engine() {
		System.out.println("All vehicles have One Engine");
	}

	public abstract void Wheels();

	public abstract void brandName();
}

class Bike2 extends Vehicle2 {
	Bike2(){
		super(2);
	}
	public void Wheels() {
		System.out.println("Bike has 2 Wheels");
	}

	public void brandName() {
		System.out.println("Yamaha");
	}
}

public class AbstractClass3 {

	public static void main(String[] args) {
		Vehicle2 obj = new Bike2();
		obj.engine();
		obj.Wheels();
		obj.brandName();
		

	}

}
