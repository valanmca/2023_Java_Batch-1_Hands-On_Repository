package com.naveen.day11;

//Method Overloading Polymorphism..
class MyClass {
	void myMethod(String name) {
		System.out.println("Welcome " + name);
	}

	void myMethod(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++)
			fact = fact * i;
		System.out.println("Factorial is : " + fact);
	}

	void myMethod(int a, int b) {
		int sum = a + b;
		System.out.println("The Sum is : " + sum);
	}
}

public class PolymorphismEx01 {
	public static void main(String[] args) {
		MyClass obj = new MyClass();
		obj.myMethod(10);
		obj.myMethod("Naveen");
		obj.myMethod(10, 20);
	}

}
