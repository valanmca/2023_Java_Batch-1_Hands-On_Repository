package com.jenish.day14;
//Interface

interface MyInterface {
	void addition(int a, int b); //abstract,public
	void substration(int a, int b);
}
class Calculator implements MyInterface {
	public void addition(int a, int b) {
		System.out.println("Addition : " + (a+b));
	}
	public void substration(int a, int b) {
		System.out.println("Substraction : " + (a-b));
	}
}
public class Interface_Sample_Program_Ex1 {

	public static void main(String[] args) {
		MyInterface obj = new Calculator();
		obj.addition(10, 20);
		obj.substration(10, 20);

	}
}
