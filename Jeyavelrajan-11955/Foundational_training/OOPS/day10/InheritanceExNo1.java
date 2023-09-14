
//Multi level Inheritance Example
package com.jeyavel.OOPS.day10;

//parent class
class Vehicle {
	void noOfEngine() {
		System.out.println("Ihave one Engine");
	}
}
//derived class
class TwoWheeler extends Vehicle {
	void wheels() {
		System.out.println("Ihave Two Wheels");
	}
}
//derived class
class BrandName extends TwoWheeler {
	void brandName() {
		System.out.println("Brand Name Is Honda");
	}
}

public class InheritanceExNo1 {

	public static void main(String[] args) {
		BrandName Brand = new BrandName();
		Brand.noOfEngine();
		Brand.wheels();
		Brand.brandName();

	}

}
