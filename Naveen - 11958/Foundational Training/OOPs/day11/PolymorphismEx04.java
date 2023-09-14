package com.naveen.day11;

//Constructor Overloading Polymorphism..
class MyClass1 {
	MyClass1(String name) {
		System.out.println("Welcome " + name);
	}

	MyClass1(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++)
			fact = fact * i;
		System.out.println("Factorial is : " + fact);
	}

	MyClass1(int a, int b) {
		int sum = a + b;
		System.out.println("The Sum is : " + sum);
	}
}

public class PolymorphismEx04 {
	public static void main(String[] args) {

		// Constructor can be called by using creating each objects.
		MyClass1 obj1 = new MyClass1("Naveen");
		MyClass1 obj2 = new MyClass1(5);
		MyClass1 obj3 = new MyClass1(10, 20);
	}

}
