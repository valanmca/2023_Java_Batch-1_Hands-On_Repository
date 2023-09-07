package com.shaji.Day13;

abstract class vehicle {
	void engine() {
		System.out.println("All vehicle have one engine...");
	}

	abstract void wheels();

	abstract void brandName();
}

class Bike extends vehicle {
	void wheels() {
		System.out.println("Bike has Two Wheels ...");
	}
	void brandName() {
		System.out.println("Brand of Bike ...");

	}
}

public class Example4 {

	public static void main(String[] args) {
		vehicle obj = new Bike();
		obj.wheels();
		obj.brandName();
	}

}
