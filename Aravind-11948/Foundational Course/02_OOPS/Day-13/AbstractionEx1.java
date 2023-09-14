package com.aravind.day13;
abstract class Shape1
{
	abstract void area();// able to define the method 
	 abstract void myMethod();
	 void myMethod1()// and concrete method -with body 
	 {
		System.out.println("concrete method -without body") ;
	 }
	
	
}
class Rectangle1 extends Shape1
{
	void area()
	{
	System.out.println("we can perform using length and breadth");
		
	}
	void myMethod()
	{
		
	}
	
}
class Circle1 extends Shape1
{
	void area()
	{
		System.out.println("we can perform using pi*r^2");
	}
	void myMethod()
	{
		
	}
}


public class AbstractionEx1 {

	public static void main(String[] args) {
		Rectangle1 obj=new Rectangle1();
		obj.area();
		//Shape1 obj1=new Shape1();we cannot able to create obj for abstract class
        Shape1 obj1=new Rectangle1(); //we able to create reference for abstract class
	    obj1.myMethod1();
	}

}
