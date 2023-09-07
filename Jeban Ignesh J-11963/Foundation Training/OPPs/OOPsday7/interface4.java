package com.jeban.OOPsday7;//interface with inheritance use extends in interface.

interface Myinterface11 {
	void addition(int a, int b);

	void subtraction(int a, int b);

}

interface Myinterface12 extends Myinterface1 {
	void multiplication(int a, int b);

	void division(int a, int b);
}

class Calculator11 implements  Myinterface12 {
	public void addition(int a, int b) {
		System.out.println("Addition:" + (a + b));
	}

	public void subtraction(int a, int b) {
		System.out.println("Subtraction:" + (a - b));
	}

	public void multiplication(int a, int b) {
		System.out.println("multiplication:" + (a + b));
	}

	public void division(int a, int b) {
		System.out.println("Division:" + (a - b));
	}

}

public class interface4 {

	public static void main(String[] args) {
		Myinterface12 obj=new Calculator11();
		obj.addition(12, 30);
		obj.subtraction(90, 45);
		obj.multiplication(12, 2);
		obj.division(10, 5);

	}

}
