//IN THIS  MAIN Class ONLY ONE SUPER CLASS  TWO  subtract two sub class
//it is Multilevel superclass.
//This class has more than one parental class,hence it is called multilevel inheritance.
//example.

package com.muthu.day10;

class Vehicle{
	void noOfEngine(){
	System.out.println("I have one Engine");
		
	}
}
class TwoWheeler extends Vehicle{
	void noOfwheels() {
		System.out.println("I have two Wheels");
	}
}
class Bike extends TwoWheeler{
	void noOfBrandName() {
		System.out.println("I have Name Honda");
	}
}


public class inheritance {

	public static void main(String[] args) {
		Bike bike=new Bike();
		bike.noOfBrandName();
		bike.noOfEngine();
		bike.noOfwheels();

	}

}
