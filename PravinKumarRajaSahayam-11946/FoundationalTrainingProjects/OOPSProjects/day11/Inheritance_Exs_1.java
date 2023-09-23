//Using Inheritance (extends) Method for super class and sub class and sub class
package com.pravinkumar.day11;
//Inheritance using Instance for the Multilevel Inheritances
class Vehicles {
	void noOfEngine() {
		System.out.println("I have one Engine : ");
	}
}

class TwoWheeler extends Vehicles {
	void noOfWheels() {
		System.out.println("I have Two Wheels : ");
	}
}

class Bike extends TwoWheeler {
	void brandName() {
		System.out.println("Brand Name Honda : ");
	}
}

public class Inheritance_Exs_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike bike = new Bike();
		bike.noOfEngine();
		bike.noOfWheels();
		bike.brandName();
	}

}
