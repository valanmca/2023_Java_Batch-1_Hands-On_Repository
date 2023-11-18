package com.jeyandhan.day06;

class Base {
	Base(){
		System.out.println("Default Constructor");
	}
	Base(int a){
		System.out.println("Parameterized Constructor");
	}
}

class Derived extends Base{
	Derived(){
		super(5);
		System.out.println("Derived Class");
	}
	
	Derived(int a){
		this();
		System.out.println("Derived class 1");
	}
}

public class SuperKey {

	
	public static void main(String[] args) {
		
		Derived obj = new Derived(5);
	}

}
