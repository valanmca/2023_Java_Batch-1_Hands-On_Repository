//Abstraction class
package com.pravinkumar.day14;
//Calling the abstract class using(references with the help of super class and the sub class)
abstract class Vehicle {
	void engine() {
		System.out.println("All Vehicle have one Engine ");
	}

	// we can not create a object but we can create a reference because of the (this
	// hasn't definitions)
	abstract void wheels();

	abstract void brandName();

}

//the existing class must be over write all the abstract method
class bike extends Vehicle {
	void wheels() {
		System.out.println("Bike has a Two wheels ");
	}

	void brandName() {
		System.out.println("Bike brandName is a Honda ");
	}
}

public class Abstraction_Exs_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle obj = new bike();
		obj.wheels();
		obj.brandName();

		Vehicle obj1;
	}

}
