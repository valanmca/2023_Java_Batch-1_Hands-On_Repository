package com.swetha.day10;
class Vehicle1{                  
	Vehicle1() {              //Using Constructors
		System.out.println("Constructor from vehicle");
	}
}
class TwoWheeler1 extends Vehicle1{
	 TwoWheeler1() {
		System.out.println("Constructor from Two wheeler");
	}
}
class Bike1 extends TwoWheeler1{
	Bike1() {
		System.out.println("Constructor from Bike");
	}
}

public class Constructor {

	public static void main(String[] args) {
		Bike1 bike=new Bike1();            //once the object is created,it will initialize the constructor
	}

}
