//Abstract Class with Constructor(Vehicle)

package com.jeyandhan.day13;

 abstract  class Vehicle1 {

	Vehicle1(int a) {
		System.out.println("Abstract Class " + a);
	}

	 public  void engine() {
		System.out.println("All vehicle have one Engine");
	}

	// declaration
	public abstract  void wheel();

	public abstract void brandName();
}

class Bike1 extends Vehicle1 { // sub class
	Bike1() {
		super(10);
	}

	public  void wheel() { // defining
		System.out.println("Bike has Two Wheel");
	}

	public void brandName() {
		System.out.println("The Brand Name is Pulsar");
	}
}

public class VechileAbstract1 {

	public static void main(String[] args) {
		// object creation

		Vehicle1 obj = new Bike1(); // DMD for abstract class

		obj.wheel();

		obj.brandName();

	}

}
