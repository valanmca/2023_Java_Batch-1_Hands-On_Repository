package com.gayathri.day14;

interface interface1 {
	void add(int a, int b);

	void sub(int a, int b);
}

interface interface2 extends interface1// interface is a collection of abstract
{ // by defaullt, it comes with adstract keyword, public access modifier
	void multi(int a, int b);

	void divi(int a, int b);
}

class Calculs implements interface2 {
	public void addition(int a, int b) {
		System.out.println("Addition : " + (a + b));
	}

	public void subtraction(int a, int b) {
		System.out.println("Subtraction : " + (a - b));
	}

	public void multi(int a, int b) {
		System.out.println("Multiplication : " + (a * b));
	}

	public void divi(int a, int b) {
		System.out.println("Divition : " + (a / b));
	}
}

public class ExtendsInterface {

	public static void main(String[] args) {
		Calculs obj = new Calculs();
		obj.addition(2, 2);
		obj.subtraction(3, 5);
		obj.multi(5, 5);
		obj.divi(48, 4);
	}

}
