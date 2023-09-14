package com.purushoth.day13;

abstract class Shape1{
	 abstract void area();
	 abstract void myMethod();
	 void myMethod2() {    // Normal method or Concrete method.
		 System.out.println("Method 2");
	 }
}

class Rectangle1 extends Shape1{
	void area() {
		System.out.println("The area of rectangle: (l*b)");
	}
	void myMethod() {
		System.out.println("s");
	}

}

public class ShapeAbstract {

	public static void main(String[] args) {
		
		Shape1 obj=new Rectangle1();//Dynamic method dispatch.
		obj.myMethod2(); //Calling method in super class called abstract.
		obj.area();      //It override the method of subclass.
	}

}//Abstract for shape.
