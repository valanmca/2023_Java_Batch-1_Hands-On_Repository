package com.naveen.day10;

// Multilevel Inheritance...
class Vehicle { // Super Class
	void noOfEngine() {
		System.out.println("I have one Engine");
	}
}

class TwoWheeler extends Vehicle { // Sub Class
	void noOfWheels() {
		System.out.println("I have two wheels");
	}
}

class Bike extends TwoWheeler { // Sub Class
	void brandName() {
		System.out.println("Brand Name Honda");
	}
}

public class InheritanceEx01 {

	public static void main(String[] args) {
		Bike obj = new Bike();
		obj.noOfEngine();
		obj.noOfWheels();
		obj.brandName();
	}

}
