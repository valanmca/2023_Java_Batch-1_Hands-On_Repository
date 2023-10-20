package com.dharshu.day5;

//first super class constructor will execute and then subclass constructor will get execute
// in java the default constructor is not always optional if there is no constructor then the default constructor is optional.
// constructor cannot be static and final.
//we cannot inherit the private and constructor property from the superclass.
class A{
	A(){
		System.out.println("A");
	}
	// by default the JVM invoke the "default constructor"
	A(int a){
		System.out.println("A1");
	}

}

class B extends  A{
	B(){
		super(23); // manually invoking the super class 
		System.out.println("B");
	}
	B(int a){
		//super(23); // manually invoking the super class 
		this(); // call the default constructor in current class
		System.out.println("B1");
	}
}

public class Single_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj =new B(02);

	}

}
