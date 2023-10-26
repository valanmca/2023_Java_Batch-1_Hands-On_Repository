package com.naveen.day4;

//Constructor calling

class A {
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
		System.out.println("B 1");
	}
}
public class Ex01 {

	public static void main(String[] args) {

		B obj = new B(5);
	}

}
