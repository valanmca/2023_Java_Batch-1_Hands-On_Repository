package com.dharshu.day10;

//Multilevel Inheritance
class vehicle{   //Parent class or Super class
	void noOfEngine() {
		System.out.println("One Engine");
	}
}

class TwoWheeler extends vehicle{    //Child class or subclass
	void noOfWheeler() {
		System.out.println("Two Wheels");
	}
}

class Bike extends TwoWheeler{   //grand child class 
	void brandname() {
		System.out.println("Brand Name : Duke");
	}
}
public class VehicleInheritance {
	

	public static void main(String[] args) {
		Bike bike=new Bike();
		bike.noOfEngine();
		bike.noOfWheeler();
		bike.brandname();
		

	}

}
