package com.jenish.day14;

//Interface
//implementing multiple interfaces
//normal class can implement n-no.of.Interface

interface MyInterface1 {
	void addition(int a, int b); //abstract,public
	void substration(int a, int b);
}
interface MyInterface2 {
	void multiplication(int a, int b); //abstract,public
	void division(int a, int b);
}
class Calculator1 implements MyInterface1, MyInterface2 {
	public void addition(int a, int b) {
		System.out.println("Addition : " + (a+b));
	}
	public void substration(int a, int b) {
		System.out.println("Substraction : " + (a-b));
	}
	public void multiplication(int a, int b) {
		System.out.println("Multiplication : " + (a*b));
	}
	public void division(int a, int b) {
		System.out.println("Division : " + (a/b));
	}
}
public class Interface_2Interface_Sample_Ex2 {

	public static void main(String[] args) {
		Calculator1 obj = new Calculator1();
		obj.addition(50, 30);
		obj.substration(70, 20);
		obj.multiplication(55, 66);
		obj.division(100, 25);


	}

}
