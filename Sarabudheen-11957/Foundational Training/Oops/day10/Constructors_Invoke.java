/***** Constructor Invoking... *****/
package com.sara.day10;

class vehicle1{
	vehicle1() {
		System.out.println("Constructor for Vehicle");
	}
}

class TwoWheeler1 extends vehicle1{
	TwoWheeler1() {
		System.out.println("Constructor for TwoWheeler");
	}
}

class Bike1 extends TwoWheeler1{
	Bike1() {
		System.out.println("Constructor for Bike");
	}
}

public class Constructors_Invoke {

	public static void main(String[] args) {
		
		Bike1 bike = new Bike1();
		

	}

}
