package com.shiva.day14;

//Multiple Interfaces

interface MyInterface1
{
	void addition(int a,int b);//abstract,public
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
		System.out.println("Addition : "+(a+b));
	}
	
	public void subtraction(int a,int b)
	{
		System.out.println("Subtraction : "+(a+b));
	}
	
	public void multiplication(int a,int b)
	{
		System.out.println("multiplication : "+(a*b));
	}
	
	public void division(int a,int b)
	{
		System.out.println("division : "+(a/b));
	}
}
public class Interface02 {

	public static void main(String[] args) {
		
		Calculator1 obj=new Calculator1();
		obj.addition(10, 20);
		obj.subtraction(100, 50);
		obj.multiplication(100, 50);
		obj.division(100, 50);
	}

}
