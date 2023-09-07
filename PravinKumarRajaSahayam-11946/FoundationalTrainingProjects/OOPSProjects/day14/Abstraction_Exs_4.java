//Abstraction class Method
package com.pravinkumar.day14;

//Using the Constructors in the Abstract class
abstract class Vehicle10 {
	// Abstract class we can defines a constructors its print the output without
	// error
	// the constructors will prints the sub class from the super class
	Vehicle10(int a) {
		System.out.println("Constructors from the Abstract class : " + a);
	}

	public void engine() {
		System.out.println("All Vehicles have one Engine ");
	}

	public abstract void wheels();

	public abstract void brandName();
}

class bike10 extends Vehicle10 {
	// we can create a empty constructors for using the super keyword
	bike10() {
		super(5);
	}

	public void wheels() {
		System.out.println("Bike has a Three wheels ");
	}

	public void brandName() {
		System.out.println("Bike brandName is a Hondas ");
	}

}

public class Abstraction_Exs_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle10 obj = new bike10();
		obj.wheels();
		obj.brandName();
		obj.engine();
	}

}
