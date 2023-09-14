package com.jenish.day10;
//multilevel inheritance

class Vehicle{
	void noOfEngine() {
		System.out.println("I Have One Engine");
		}
}

class TwoWheeler extends Vehicle{
	void noOfWheels(){
		System.out.println("I have Two Wheels");
	}
}

class Bike extends TwoWheeler{
	void brandName() {
		System.out.println("Brand Name Hero");
	}
}
public class Inheritance_Sample_Vehicle_Ex1 {

	public static void main(String[] args) {
		Bike bike=new Bike();
		bike.noOfEngine();
		bike.noOfWheels();
		bike.brandName();

	}

}
