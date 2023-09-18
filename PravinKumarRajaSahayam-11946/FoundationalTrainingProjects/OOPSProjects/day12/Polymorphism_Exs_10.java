//For the Super keyword Method for Calling the Method
package com.pravinkumar.day12;
//Using Over Riding Method
class SuperClass {
	int a;

	SuperClass(int a) {
		this.a = a;
	}

	void display() {
		System.out.println("Value of A : " + a);
	}
}

class SubClass extends SuperClass {
	SubClass() {
		super(10);
		super.display();
		System.out.println("Value of a : " + super.a);
	}
}

public class Polymorphism_Exs_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Calling the Object from the Constructors Methods super this
		SubClass obj = new SubClass();
	}

}
