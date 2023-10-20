package com.jenish.day6;
interface VechiclePlan { //blueprint & we cannot create constructor, it is public
	void noOfEngine(); //public & abstract
	void noOfWheels();
	void brandName();
}
abstract class Vehicle1 implements VechiclePlan {
	public void noOfEngine() {
		System.out.println("I have One Engine");
	}
	public abstract void noOfWheels();
	public abstract void brandName();
}
class Bike1 extends Vehicle1 {
	public void noOfWheels() {
		System.out.println("I have Two Wheels");
	}
	public void brandName() {
		System.out.println("Honda");
	}
}
public class Ex_2_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VechiclePlan bike = new Bike1();
		bike.noOfEngine();
		bike.noOfWheels();
		bike.brandName();
	
	}

}
