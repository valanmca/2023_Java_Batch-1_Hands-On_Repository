package com.purushoth.day11;

class MyClass1{
	public MyClass1(String name) {
		this(5);
		System.out.println("Welcome "+name);
	}
	public MyClass1(int n) {
		//this("Kumar");
		this(23,7);
		int fact=1;
		for(int i=1; i<=n;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial: "+fact);
	}
	public MyClass1(int a, int b) {
		//this(5);
		int sum=a+b;
		System.out.println("Sum of two numbers: "+sum);
	}
}
public class ConstructorOverloading {

	public static void main(String[] args) {
		MyClass1 obj1=new MyClass1("Kumar");
		//MyClass1 obj2=new MyClass1(6); 
		//MyClass1 obj3=new MyClass1(23,7);
		

	}

}//Constructor overloading.
