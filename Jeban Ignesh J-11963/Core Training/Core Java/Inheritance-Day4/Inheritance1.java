package com.jeban.Inheritance;

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
		super(5);
		System.out.println("B");
	}
	B(int a){
		this();
		System.out.println("B 1");
	}

	
}
public class Inheritance1 {

	public static void main(String[] args) {
		B obj =new B();
		System.out.println(" ");
		B obj1 =new B(2);

	}

}
