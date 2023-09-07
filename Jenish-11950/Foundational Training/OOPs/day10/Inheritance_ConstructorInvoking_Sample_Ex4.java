package com.jenish.day10;

class Vehicle1{
	Vehicle1() {
		System.out.println("Constructor from Vehicle");
		}
}

class TwoWheeler1 extends Vehicle1{
	TwoWheeler1(){
		System.out.println("Constructor from TwoWheeler");
	}
}

class Bike1 extends TwoWheeler1 {
	Bike1() {
		System.out.println("Constructor from Bike");
	}
}
public class Inheritance_ConstructorInvoking_Sample_Ex4 {

	public static void main(String[] args) {
		Bike1 bike = new Bike1();

	}

}
