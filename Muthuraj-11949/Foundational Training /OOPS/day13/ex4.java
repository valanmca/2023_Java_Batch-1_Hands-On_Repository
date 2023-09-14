package com.muthu.day13;
abstract class Vehicle{
	void engine() {
		System.out.println("All Vehicle have one engine");
	}
	abstract void wheel();
	abstract void brandName();
}
class Bike extends Vehicle{ 
	void wheel() {
		System.out.println("Bike has two wheel");
	}
	void brandName() {
		System.out.println("PULSAR");
	}
	
}


public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle obj=new Bike();
		obj. wheel();
		obj. brandName();

	}

}
