
//constructor inovacitation
package com.jeyavel.OOPS.day10;

//parent class
class Vehicle1 {
	Vehicle1() {
		System.out.println("Ihave one Engine");
	}
}

//derived class
class TwoWheeler1 extends Vehicle1 {
	TwoWheeler1() {
		System.out.println("Ihave Two Wheels");
	}
}

//derived class
class BrandName1 extends TwoWheeler1 {
	BrandName1() {
		System.out.println("Brand Name Is Honda");
	}
}

public class ConstructorInovaction {
	public static void main(String[] args) {

		@SuppressWarnings("unused")
		BrandName1 Brand = new BrandName1();
		

	}
}
