package com.jenish.day5;

// first super class constructor will execute and than subclass constructor will get executed
// java the default constructor is not always optional if there is no constructor then the default constructor is optional

class A {
	 A() {
		System.out.println("A");
	} // default JVM invoke the "default constructor" 
	A(int a){
		System.out.println("A 1");//parameterized constructor
	}
	
}
class B extends A {
	B() {
		super(5);  //manually invoking the super class
		System.out.println("B");
	}
	B (int a){
		this();
			System.out.println("B 1");
		}
	}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj = new B(5);
	}

}
