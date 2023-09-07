package com.naveen.day11;

//Constructor Overloading Polymorphism..
class MyClass2 {
	MyClass2(String name) {
		this(5);
		System.out.println("Welcome " + name);
	}

	MyClass2(int n) {
		this(10, 20);
		int fact = 1;
		for (int i = 1; i <= n; i++)
			fact = fact * i;
		System.out.println("Factorial is : " + fact);
	}

	MyClass2(int a, int b) {
		int sum = a + b;
		System.out.println("The Sum is : " + sum);
	}
}

public class PolymorphismEx05 {
	public static void main(String[] args) {

		// Constructor can be called by using creating single object with the help of
		// this keyword.
		MyClass2 obj1 = new MyClass2("Naveen");

	}

}
