package com.madhan.day14;

interface MyInterface3
{
	void addition(int a,int b);
	void subtraction(int a,int b);
}

interface MyInterface4 extends MyInterface3
{
	void multiplication(int a,int b);
	void division(int a,int b);
}

class Calculator2 implements MyInterface4
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

public class InterfaceExampleusingextend {

	public static void main(String[] args) {
		MyInterface4 obj=new Calculator2();
		obj.addition(10, 20);
		obj.subtraction(20, 10);
		obj.multiplication(2, 2);
		obj.division(20, 10);
		

	}

}
