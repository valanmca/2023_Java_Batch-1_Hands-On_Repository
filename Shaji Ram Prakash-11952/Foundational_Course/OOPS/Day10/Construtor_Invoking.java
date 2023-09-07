package com.shaji.Day10;

class vehicle1{
	vehicle1() {
		System.out.println("Constructor From Vehicle");
	}
}

class twoWheeler1 extends vehicle1 {
	twoWheeler1() {
		System.out.println("Constructor From TwoWheeler");
	}
}

class Bike1 extends twoWheeler1{
	Bike1(){
		System.out.println("Constructor From Bike");
	}
}

public class Construtor_Invoking {

	public static void main(String[] args) {
		Bike1 bike = new Bike1();

	}

}
