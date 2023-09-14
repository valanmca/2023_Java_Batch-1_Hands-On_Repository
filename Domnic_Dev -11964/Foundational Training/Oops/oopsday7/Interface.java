package com.domnic.oopsday7;
//Interface
interface MyInterface { // interface are by default abstract public
	void addition(int a, int b);

	void substraction(int a, int b);
}

class Calculator implements MyInterface {
	public void addition(int a, int b) {
		System.out.println("Addition of "+a+" and "+b+" is " + (a + b));
	}

	public void substraction(int a, int b) {
		System.out.println("Substraction of "+a+" and "+b+" is " + (a - b));
	}
}

public class Interface {

	public static void main(String[] args) {
		MyInterface obj = new Calculator();   //here we can also create object with subclass
		obj.addition(4, 9);
		obj.substraction(7, 4);

	}

}
