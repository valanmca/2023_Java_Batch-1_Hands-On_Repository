package com.domnic.oopsday3;
//constructor invokation order

class vehicle1 {
	vehicle1() {
		System.out.println("Contructor from vehicle");
	}
}

class TwoWheeler1 extends vehicle1 {
	TwoWheeler1() {
		System.out.println("Constructor from Twowheeler");
	}
}

class Bike1 extends TwoWheeler1 {
	Bike1() {
		System.out.println("Constructor from bike ");
	}
}

public class Inherit4 {

	public static void main(String[] args) {

		Bike1 obj = new Bike1();

	}

}
