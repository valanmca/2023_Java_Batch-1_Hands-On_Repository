package com.jeban.OOPsday7;//use implements in subclass to multiple interface 

interface MyinterfaceA {
	void addition(int a, int b);

	void subtraction(int a, int b);

}

interface MyinterfaceB {
	void multiplication(int a, int b);

	void division(int a, int b);
}

interface MyinterfaceC{
	void average(int a,int b);
}

class Calculator2 implements MyinterfaceA, MyinterfaceB ,MyinterfaceC{
	public void addition(int a, int b) {
		System.out.println("Addition:" + (a + b));
	}

	public void subtraction(int a, int b) {
		System.out.println("Subtraction:" + (a - b));
	}

	public void multiplication(int a, int b) {
		System.out.println("multiplication:" + (a * b));
	}

	public void division(int a, int b) {
		System.out.println("Division:" + (a/b));
	}
	public void average(int a,int b) {
		System.out.println("Average:"+((a+b)/2));
	}

}

public class interface3 {
	public static void main(String[] args) {
		Calculator2 obj = new Calculator2();
		obj.addition(12, 30);
		obj.subtraction(90, 45);
		obj.multiplication(12, 2);
		obj.division(10, 5);
		obj.average(10, 20);

	}
}
