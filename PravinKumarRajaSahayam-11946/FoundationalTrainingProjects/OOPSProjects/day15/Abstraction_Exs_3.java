//Abstraction Interfaces 
package com.pravinkumar.day15;

//Implements the MyInterface9 in normal class
interface MyInterface3 {
	void addition(int a, int b);

	void substraction(int a, int b);
}

//We can use inheritances in the Interfaces
interface MyInterface9 extends MyInterface3 {
	void multiplication(int a, int b);

	void division(int a, int b);
}

//We can use Multiple Interfaces in the class
//We can use MyInterface9 (for now the MyInterface9 has more powers)
class Calculator8 implements MyInterface9 {
	public void addition(int a, int b) {
		System.out.println("The addition is : " + (a + b));
	}

	public void substraction(int a, int b) {
		System.out.println("The substraction is : " + (a - b));
	}

	public void multiplication(int a, int b) {
		System.out.println("The multiplication is : " + (a * b));
	}

	public void division(int a, int b) {
		System.out.println("The division is : " + (a / b));
	}
}

public class Abstraction_Exs_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator8 obj = new Calculator8();
		obj.addition(10, 20);
		obj.substraction(10, 50);
		obj.multiplication(20, 30);
		obj.division(30, 900);
	}

}
