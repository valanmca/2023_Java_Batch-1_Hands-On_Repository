package com.purushoth.day13;

abstract class Vehicle3 {
	
	Vehicle3(int a){
		System.out.println(a);
	}
	public void engine() {
		System.out.println("All Vehicles have One Engine");
	}
	public abstract void wheel();
	
	public abstract void brandName();
}

class Bike3 extends Vehicle3{
	Bike3(){
	super(3);
	}
	public void wheel() {
		System.out.println("Bike has 2 Wheel");
	}
	public void brandName() {
		System.out.println("Rx 100");
	}
}
public class VehicleAbstract {

	public static void main(String[] args) {
		Vehicle3 obj=new Bike3();
		obj.engine();
		obj.brandName();
		obj.wheel();

	}

}  //Abstract for Vehicle. 
