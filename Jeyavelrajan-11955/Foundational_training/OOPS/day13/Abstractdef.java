package com.jeyavel.OOPS.day13;

//inside a normal class we can declare a method
//But we declare a Abstract method should declare in a Abstract Class
//abstract class is a super class it has commpn functionalities of the sub class 
abstract class Shape1 {
	// No Definition only Declaration
	// Abstract is a Method Without Declaration/no body
	//by extending with normal class and its depaedent on inheritance , overriding
	abstract void area();
	//the class which extends the abstract class they must provide the method same as abstract class to override it
	abstract void myMethod();
	// Because there is no formula for Shape
	// All the Abstract Method we will Override
	
	
	//Define a (Method with body is also called as concrete Method)
	//So Abstract Class contains abstract method and concerete Method
	
	void myMethod2() {
	//Concerete Method
		System.out.println("Concerete Method in Abstract Class");
	}


}
//the class which extends the abstract class 
//they must provide the method same as abstract class to override it
//Otherwise Error will occur 
class Rectangle1 extends Shape1 {
	void area() {
		// Defining the Formula
		System.out.println("Rectangle Formula is l*b");
	}
	void myMethod() {
		System.out.println("Over ride the myMethod in Abstract Class");
	}

}

class Circle1 extends Shape1 {
	void area() {
		
		System.out.println("Circle Formula is 3.14*r2");
	}
	void myMethod() {
		System.out.println("Over ride the myMethod in Abstract Class");
	}
}

public class Abstractdef {

	public static void main(String[] args) {
//		Circle1 cir = new Circle1();
//		cir.area();
//		cir.myMethod();
		Shape1 shap =new Rectangle1();//[Dynamic Method Dispatch]
		shap.area();      //Invoked by rectangle  object because of Overriding 
		shap.myMethod2();//Invoked by reference of Shape 1
		
		//Shape1 shap = new Shape1();//In Abstract Class (We Cannot Create the Object/Because it is A Declaration)
		//Always Abstract Class will Be A super Class 
		//Abstract class is A partially completed Class thats why we cannot create the object
        // ex Shape1 shap;(But we can Declare the Reference of the object)
	}

}
