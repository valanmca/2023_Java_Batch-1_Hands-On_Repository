package com.gayathri.day14;

interface MyInterface // interface is a collection of abstract
{// by defaullt, it comes with adstract keyword, public access modifier
	void addition(int a ,int b);

	void subtraction(int a, int b);
}
class Callc implements MyInterface{
	public void addition(int a, int b) {
		System.out.println("Addition : "+(a + b));
	}

	public void subtraction(int a, int b) {
		System.out.println("Subtraction : "+(a - b));
	}
}
public class InterfaceExample {

	public static void main(String[] args) {
		MyInterface obj = new Callc();
		obj.addition(2,2);
		obj.subtraction(3, 5);
	
	}

}
