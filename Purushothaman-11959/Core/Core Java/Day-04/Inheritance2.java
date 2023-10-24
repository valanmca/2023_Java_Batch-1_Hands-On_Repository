package com.purushoth.day_04;

class A1{
	A1(){
		System.out.println("A");
	}
	A1(int a){
		System.out.println("A 1");
	}
}

class B1 extends A1{
	
	B1(){
		super(5);//If we pass value and super keyword it will return that constructor.
		//If we don't use the super keyword it will return default constructor. 
		System.out.println("B");
	}
	B1(int a){
		this();//It refers B1();
		System.out.println("B 1");
	}
}
public class Inheritance2 {

	public static void main(String[] args) {
		B1 obj=new B1(5);// If we extends super class it will default call the super class. 

	}

}
