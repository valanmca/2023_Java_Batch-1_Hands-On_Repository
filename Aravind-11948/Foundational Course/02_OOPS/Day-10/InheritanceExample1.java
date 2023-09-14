package com.aravind.day10;// multilevel - inheritance

class vehicle {
                                                                                           // vehicle
	void noOfEngine() {                                                                      //Two wheeler
		
		System.out.println("I Have one engine");                                              //bike

	}
}

class TwoWheeler extends vehicle {// sub class extends super class
	void NoOfWheels() {
		System.out.println("I have Two Wheels");
	}
}

class bike extends TwoWheeler {
	void BrandName() {
		System.out.println("Honda");
	}
}

public class InheritanceExample1 {

	public static void main(String[] args) {
		vehicle obj = new vehicle(); // it only print i have one engine
		obj.noOfEngine();

		System.out.println("create obj for TwoWheeler extends vehicle");

		TwoWheeler obj1 = new TwoWheeler();
		obj1.noOfEngine();
		obj1.NoOfWheels();
		
		System.out.println("create obj for bike extends TwoWheeler");
		bike obj2 = new bike();
		obj2.noOfEngine();
		obj2.NoOfWheels();
		obj2.BrandName();

	}

}
