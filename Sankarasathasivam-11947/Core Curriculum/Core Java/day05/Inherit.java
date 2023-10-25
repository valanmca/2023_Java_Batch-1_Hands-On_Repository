package com.shiva.core.day05;

class A {
	A() {//Constructor can't be static,final
		System.out.println("A");
	}

	A(int a) {//we can stop inheritance by using Private constructor
		System.out.println("A 1");
	}
}

class B extends A {
	B() {
		super(5);// if we use super(5) --> A 1 will be the o/p
		System.out.println("B");
	}

	B(int a) {
		this();
		System.out.println("B 1");
	}
}

public class Inherit {

	public static void main(String[] args) {
		B obj = new B(5);// Jvm invokes default superclass constructor automatically

	}

}
