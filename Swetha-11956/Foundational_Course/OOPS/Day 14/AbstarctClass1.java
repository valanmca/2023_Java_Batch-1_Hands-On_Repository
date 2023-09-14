package com.swetha.day14;

interface MyInterface{
	void addition(int a,int b);  //By default,interface methods are public and Abstract
	void subraction(int a,int b);
}
class Calculator implements MyInterface {
	public void addition(int a,int b) {
		System.out.println("Addition is : "+(a+b));
	}
	public void subraction(int a,int b) {
		System.out.println("Subraction is : "+(a-b));
	}
}
public abstract class AbstarctClass1 {          //Main class can also be abstract class
	
	public static void main(String[] args) {
		MyInterface obj=new  Calculator();
		obj.addition(10, 20);
		obj.subraction(10,20);

   }
}
