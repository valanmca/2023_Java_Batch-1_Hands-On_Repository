//Abstraction Interface
package com.pravinkumar.day14;
//Using the implements keyword for inheritance the interface
//Interface isn't have body(definitions)
interface VehiclePlan {
	// Interfaces is a collections of Abstract Method
	//we can't use public access specifier because it is a default access specifiers
	void engine();

	void wheels();

	// we can use abstract keyword as a optionals(interfaces also support )
	abstract void brandName();
}
//abstract class we can uses the public class access specifier 
abstract class Vehicle1 implements VehiclePlan {
	public void engine() {
		System.out.println("All Vehicles have one Engine ");
	}

	public abstract void wheels();

	public abstract void brandName();
}

class bike1 extends Vehicle1 {
	public void wheels() {
		System.out.println("Bike has a Three wheels ");
	}

	public void brandName() {
		System.out.println("Bike brandName is a Hondas ");
	}

}

public class Abstraction_Exs_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle1 obj = new bike1();
		obj.wheels();
		obj.brandName();

		VehiclePlan obj1 = new bike1();
		obj.engine();
		obj.wheels();
		obj.brandName();
	}

}
