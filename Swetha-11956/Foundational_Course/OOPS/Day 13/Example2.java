package com.swetha.day13;
abstract class Vehicle2 {
	Vehicle2(int a){
		System.out.println("Constructor for abstract class");
	}
	public void engine() {
		System.out.println("All vehicle has one engine");
	}
	public abstract void wheel();
	public abstract void brandName();
}
class Bike2 extends Vehicle2{
	
	Bike2(){    //Creating a constructor to access the constructor Vehicle2
	super(7);
	}
	
	public void wheel() {
		System.out.println("Bike has two wheel");
	}
	public void brandName() {
		System.out.println("TVS");
	}
}
public class Example2 {

	public static void main(String[] args) {
		Vehicle2 obj1=new Bike2();
		obj1.engine();
		obj1.wheel();
		obj1.brandName();
		

	}

}
