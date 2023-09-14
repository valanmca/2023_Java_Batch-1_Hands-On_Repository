package com.swetha.day13;
abstract class Shape1{
	
	abstract void area();
	abstract void myMethod();//Abstract method is a method without any body...it's just a method declaration,there is no implementation,definition.
	
	void myMethod2() {
		System.out.println("This is my method 2");
	}
}
class Rectangle1 extends Shape1{
	void area() {
		System.out.println("Area of rectangle ");
	}
	void myMethod() {
		System.out.println("This is my method");
	}
}
class Circle1 extends Shape1 {
	
	void area() {          //these are instance method,can be accessed by using object,but ...abstract method has not allowed to create object...
		
		System.out.println("Area of circle : ");
	}
	void myMethod() {
		
	}

}
public class InheritOverrideEx2 {

	public static void main(String[] args) {
		
		//Shape1 obj;   //Creating reference for accessing the abstract method,where abstract method doesn't contain any imlementation,contains inly decleration
		
		Shape1 obj=new Rectangle1();  //[Dynamic method dispatch]
		obj.area();                   //Invoked by Rectangle obj because of Overriding
		obj.myMethod2();              //Invoked by reference of Shape1

	}

}
