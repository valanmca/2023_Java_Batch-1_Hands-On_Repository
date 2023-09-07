package com.shiva.day13;


abstract class Shape1
{
	abstract void area();
	
	abstract void myMethod();
	
	void myMethod1()
	{
		System.out.println("This is my concrete method");
	}
}

class Rectangle1 extends Shape1
{
	void area()
	{
		System.out.println("Area of Rectangle is l*b");
	}
	
	void myMethod()
	{
		
	}
}

class Circle1 extends Rectangle1
{
	void area()
	{
		System.out.println("Area of circle is 3.14*r^2");
	}
	
	void myMethod()
	{
		
	}
}
public class Abstraction {

	public static void main(String[] args) {
		
//		Shape1 shape=new Shape1();//can't create object in abstract class
		
		Shape1 obj=new Rectangle1();//Dynamic Method Dispatch
		obj.area();
		obj.myMethod1();
	}

}
