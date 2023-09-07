//Multiple Inheritance in the interfaces
package com.pravinkumar.day15;

//Multiple Inheritance using Interface
//Interfaces Variables are all by default it is final we can't changes
interface One {
	// public static final
	// Declaraing the variables values inside the interfaces
	int a = 10;
}

interface Two {
	// public static final
	// Declarating the variables values inside the interfaces
	// int b = 20;
	// supposes
	int a = 20;
}

//Its is a Multiple Inheritance
interface Three extends One, Two {
	// public abstract
	void addition();
}

class Calculator5 implements Three {
	public void addition() {
		System.out.println("The addition is : " + (One.a + Two.a));
	}
}

public class Abstraction_Exs_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator5 obj = new Calculator5();
		obj.addition();
	}

}
