//constructor overloading

package com.jeyandhan.day11;

class MyMethod {
	public MyMethod(String name) {
		System.out.println("Welcome "+name);
	}

	public MyMethod(int a) {
		int fact = 1;
		for(int i=1;i<=a;i++)
				fact = fact*i;
		System.out.println("Factorial: "+fact);
	}

	public MyMethod(int a, int b) {
		int sum = a+b;
		System.out.println("Sum of two numbers: "+sum);
	}
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		// object creation
		
		MyMethod obj1 = new MyMethod("Jeyandhan");
		MyMethod obj2 = new MyMethod(5);
		MyMethod obj3 = new MyMethod(5,5);

	}

}
