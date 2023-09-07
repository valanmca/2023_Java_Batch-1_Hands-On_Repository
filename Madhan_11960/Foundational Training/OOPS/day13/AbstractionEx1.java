package com.madhan.day13;


abstract class Shapes1
{
	abstract void area();
	abstract void myMethod();
	
	void myMethod1()
	{
		System.out.println("Collection of Abstract and Concrete  method");
	}
}

class Rectangle1 extends Shapes1
{
	void area()
	{
		System.out.println("We can perform using Length*Breadth");
	}
	void myMethod()
	{
		
	}
}

class Circle1 extends Shapes1
{
	void area()
	{
		System.out.println("We can perform 3.14*r*r");
	}
	void myMethod()
	{
		
	}
}


public class AbstractionEx1 {

	public static void main(String[] args) {
		Rectangle1 cir=new Rectangle1();
		cir.area();
//		Shape1 shape=new Shape1(); //We cannot create object for abstract class 
		Shapes1 obj1=new Rectangle1();  //DMD-Dynamic Method Dispatch
		obj1.area();
		obj1.myMethod1();
		

	}

}






