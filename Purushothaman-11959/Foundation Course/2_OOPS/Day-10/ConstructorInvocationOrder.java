package com.purushoth.day10;

class Vehicle1{
	Vehicle1(){
		System.out.println("Constructor from Vehicle");
	}
}

class TwoWheeler2 extends Vehicle1{
	TwoWheeler2(){
		System.out.println("Constructor from TwoWheeler");
	}
}

class Bike1 extends TwoWheeler2{
	Bike1(){
		System.out.println("Constructor from Bike");
	}
}
public class ConstructorInvocationOrder {

	public static void main(String[] args) {
		Bike1 bike=new Bike1();
	}

}
