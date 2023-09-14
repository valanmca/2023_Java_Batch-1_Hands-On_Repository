/******* Example for Interfaces... *******/
package com.sara.day14;
//Interfaces

interface MyInterface {
	void addition(int a, int b); // By Default it will be Abstract and Public Class...

	void subtraction(int a, int b);
}

class Calculator implements MyInterface {
	public void addition(int a, int b) {
		System.out.println("Additon of the Given Numbers is : " + (a + b));
		
	}

	public void subtraction(int a, int b) {
		System.out.println("Subtraction of the Given Numbers is : " + (a - b));
	}

	
}

public class Interfaces_Ex01 {

	public static void main(String[] args) {
		MyInterface obj = new Calculator();
		obj.addition(10, 20);
		obj.subtraction(20, 10);

	}

}
