//Constructor Overloading (calling with one object)

package com.jeyandhan.day11;

class MyClass1{
	MyClass1(String name) {
		this(5);
		System.out.println("Welcome " + name);
	}
	MyClass1(int n) {
		this(5,5);
		int fact = 1;
		for(int i=1;i<=n;i++) {
			fact = fact*i;
			}
		System.out.println("Factorial:  " + fact);
	}
	MyClass1(int a, int b) {
		int sum = a + b;
		System.out.println("Sum of Two numbers: " + sum);
	}
}


public class ContructOverload {

	public static void main(String[] args) {
		MyClass1 obj1 = new MyClass1("Jeyandhan");
	}

}
