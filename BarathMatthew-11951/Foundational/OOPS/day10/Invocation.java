package com.matthew.day10;

class Vehicles2{
	Vehicles2(){
		System.out.println("Constructor From vehicles");
	}
} 

class TwoWheeler2 extends Vehicles2{
	TwoWheeler2(){
		System.out.println("Constructor from TwoWheeler");
	}
}

class Bike2 extends TwoWheeler2{
	Bike2 (){
		System.out.println("Constructor from Bike");
	}
}
public class Invocation {

	public static void main(String[] args) {
		Bike2 bike = new Bike2();

	}

}
