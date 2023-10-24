package com.purushoth.day_04;

class A{
	A(){
		System.out.println("A");
	}
	A(int a){
		System.out.println("A 1");
	}
}

class B extends A{
	
	B(){
		super(5);//If we pass value and super keyword it will return that constructor.
		//If we don't use the super keyword it will return default constructor. 
		System.out.println("B");
	}
	B(int a){
		System.out.println("B 1");
	}
}
public class Inheritance {

	public static void main(String[] args) {
		B obj=new B(5);// If we extends super class it will default call the super class. 

	}

}
