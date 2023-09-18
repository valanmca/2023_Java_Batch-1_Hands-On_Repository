//Abstraction Interface
package com.pravinkumar.day15;

//Interfaces
//declares Multiple Interfaces
interface MyInterface1 {
	void addition(int a, int b);

	void substraction(int a, int b);
}

interface MyInterface2 {
	void multiplication(int a, int b);

	void division(int a, int b);
}
//We can use Multiple Interfaces in the class
class Calculator1 implements MyInterface1, MyInterface2 {
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

public class Abstraction_Exs_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator1 obj = new Calculator1();
		obj.addition(10, 30);
		obj.substraction(10, 20);
		obj.multiplication(10, 50);
		obj.division(10, 90);

	}

}
