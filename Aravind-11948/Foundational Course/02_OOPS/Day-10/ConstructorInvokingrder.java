package com.aravind.day10;

class vehicle1 {
	// vehicle
	vehicle1() { // Two wheeler

		System.out.println("constructor from vehicle1"); // bike

	}
}

class TwoWheeler1 extends vehicle1 {// sub class extends super class
	TwoWheeler1() {
		System.out.println("constructor from TwoWheeler1");
	}
}

class bike1 extends TwoWheeler1 {
	bike1() {
		System.out.println("constructor from bike1 ");
	}
}

public class ConstructorInvokingrder {

	public static void main(String[] args) {
		bike1 obj = new bike1();

	}

}
