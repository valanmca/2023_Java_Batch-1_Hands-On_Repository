package com.aravind.day14;



interface  MyInterface1
{
	void addition(int a,int b);// by default interface methods are abstract,public
	void subtraction(int a,int b);
}

interface MyInterface2 extends MyInterface1
{
	void multiplication(int a,int b);
	void division(int a,int b);
	
}
class Calculator1 implements MyInterface2{
	 public void addition(int a,int b)
	 {
		 System.out.println("Addition ="+(a+b));
		 }
	 public void subtraction(int a,int b)
	 {
		 System.out.println("Subtraction ="+(a-b));
	 }
	 public void multiplication(int a,int b)
	 {
		 System.out.println("multiplication ="+(a*b));
	 }
	 public void division(int a,int b)
	 {
		 System.out.println("division ="+(a/b));
	 }
}

public class InterfaceUsingextends {

	public static void main(String[] args) {
		Calculator1 obj =new Calculator1();
		obj.addition(10,20);
		obj.subtraction(30, 20);
		obj.multiplication(10,20);
		obj.division(20,10);
		

	}

}
