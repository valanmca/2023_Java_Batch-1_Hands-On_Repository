package com.purushoth.day11;

class MyClass{
	void myMethod(String name) {
		System.out.println("Welcome "+name);
	}
	void myMethod(int n) {
		int fact=1;
		for(int i=1; i<=n;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial: "+fact);
	}
	void myMethod(int a, int b) {
		int sum=a+b;
		System.out.println("Sum of two numbers: "+sum);
	}
}

public class PolymorphismMethodOverloading {

	public static void main(String[] args) {
	MyClass obj=new MyClass();
	obj.myMethod(5);
	obj.myMethod("Magesh");
	obj.myMethod(15, 65);
	obj.myMethod(8);

	}

}//myMethod overloading type in Polymorphism.
