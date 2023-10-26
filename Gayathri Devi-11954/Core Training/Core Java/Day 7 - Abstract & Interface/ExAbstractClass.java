package com.gayathri.day6;
abstract class Vehicle{
	Vehicle(){
		System.out.println("I am Abstract Class default Constructor");
	}
	Vehicle(int a){
		System.out.println("I am Abstract Class Parameterized Constructor \n a : "+a);
	}
	void noOfEngine() {
		System.out.println("I have one engine");
	}
	abstract void noOfWheels();
	abstract void brandName();
}
class Bike extends Vehicle{
	Bike(){
		super(5);
	}
	void noOfWheels() {  
		System.out.println("I have 2 wheels");
	}
	void brandName() {
		System.out.println("Hero");
	}
}
public class ExAbstractClass {

	public static void main(String[] args) {
		Vehicle reference = new Bike();
		reference.noOfEngine();
		reference.brandName();
		reference.noOfWheels();

	}

}
