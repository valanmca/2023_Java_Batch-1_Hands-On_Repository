package com.domnic.oopsday3;
//inheritance basic operations

class vehicle {
	void noOfEngine() {
		System.out.println("I Have 1 engine ");
	}
}

class Twowheeler extends vehicle {
	void noOfWheels() {
		System.out.println("I have 2 wheels");
	}
}

class Bike extends Twowheeler {
	void brandName() {
		System.out.println("Yamaha");
	}
}

public class Inherit1 {

	public static void main(String[] args) {                   //we can create obj for the last subclass 
		Bike obj = new Bike();                             //and call all the methods
		obj.noOfEngine();
		obj.noOfWheels();
		obj.brandName();
	}

}
