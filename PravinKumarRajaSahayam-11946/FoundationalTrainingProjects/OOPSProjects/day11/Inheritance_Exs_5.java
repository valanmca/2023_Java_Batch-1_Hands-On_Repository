//Using Inheritance (extends) for the super class and the sub class and the subs class
package com.pravinkumar.day11;
//Without Calling the Object from the Constructors
class Vehicles1 {
	Vehicles1() {
		System.out.println("Constructor From Vehicles : ");
	}
}

class TwoWheeler1 extends Vehicles1 {
	TwoWheeler1() {
		System.out.println("Constructors From TwoWheeler : ");
	}
}

class Bike1 extends TwoWheeler1 {
	Bike1() {
		System.out.println("Constructors From Bike : ");
	}
}

public class Inheritance_Exs_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike1 bike = new Bike1();
	}
}
