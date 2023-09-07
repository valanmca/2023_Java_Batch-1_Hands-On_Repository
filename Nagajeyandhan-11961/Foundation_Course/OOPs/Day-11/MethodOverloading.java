//Method Overloading

package com.jeyandhan.day11;

class MyClass{
	void myMethod(String name) {
		System.out.println("Welcome " + name);
	}
	void myMethod(int n) {
		int fact = 1;
		for(int i=1;i<=n;i++) {
			fact = fact*i;
			}
		System.out.println("Factorial:  " + fact);
	}
	void myMethod(int a, int b) {
		int sum = a + b;
		System.out.println("Sum of Two numbers: " + sum);
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		
		MyClass obj = new MyClass();
		
		//method calling
		obj.myMethod("Jeyandhan");
		obj.myMethod(5);
		obj.myMethod(5,4);

	}

}
