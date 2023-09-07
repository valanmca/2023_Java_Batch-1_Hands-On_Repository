package com.naveen.day10;

// Multilevel Inheritance for constructor
class Vehicle1 { // Super Class
	Vehicle1() {
		System.out.println("Constructor From Vehicle");
	}
}

class TwoWheeler1 extends Vehicle1 { // Sub Class
	TwoWheeler1() {
		System.out.println("Constructor From TwoWheeler");
	}
}

class Bike1 extends TwoWheeler1 { // Sub Class
	Bike1() {
		System.out.println("Constructor From Bike");
	}
}

public class InheritanceEx04 {

	public static void main(String[] args) {
		Bike1 obj = new Bike1();
	}

}
