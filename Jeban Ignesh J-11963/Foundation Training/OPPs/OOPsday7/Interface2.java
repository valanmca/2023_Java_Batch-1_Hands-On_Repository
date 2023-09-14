package com.jeban.OOPsday7;

interface Myinterface1 {
	void addition(int a, int b);

	void subtraction(int a, int b);

}

interface Myinterface2{
	void multiplication(int a,int b);
	void division(int a,int b);
}

class Calculator1 implements Myinterface1,Myinterface2 {
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

public class Interface2 {

	public static void main(String[] args) {
		Calculator1 obj = new Calculator1();
		obj.addition(12, 30);
		obj.subtraction(90, 45);
		obj.multiplication(12, 2);
		obj.division(10, 5);

	}

}
