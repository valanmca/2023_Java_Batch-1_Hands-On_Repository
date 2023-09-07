package com.madhan.day14;

interface MyInterface1
{
	void addition(int a,int b);
	void subtraction(int a,int b);
}

interface MyInterface2
{
	void multiplication(int a,int b);
	void division(int a,int b);
}

class Calculator1 implements MyInterface1,MyInterface2
{
	public void addition(int a,int b)
	{
		System.out.println("Addition:"+(a+b));
	}
	public void subtraction(int a,int b)
     {
		System.out.println("Subtraction:"+(a-b));
	}
	public void multiplication(int a,int b)
	{
		System.out.println("Multiplication:"+(a*b));
	}
	public void division(int a,int b)
     {
		System.out.println("Division:"+(a/b));
	}
}

public class InterfaceExample2 {

	public static void main(String[] args) {
//		MyInterface1 obj=new Calculator1();
//		  obj.addition(10,20);
//		  obj.subtraction(30, 10);
//		  MyInterface2 obj1=new Calculator1();
//		  obj1.multiplication(2,2);
//		  obj1.division(10,2);
		
		Calculator1 cal=new Calculator1();
		 cal.addition(10,20);
		  cal.subtraction(30, 10);
		 cal.multiplication(2,2);
		  cal.division(10,2);

	}

}
