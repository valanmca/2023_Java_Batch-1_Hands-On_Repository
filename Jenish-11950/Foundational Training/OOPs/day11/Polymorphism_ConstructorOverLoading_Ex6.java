package com.jenish.day11;

class MyClass1{
	MyClass1(String name) {
		this(6);
		System.out.println("Welcome : " +name);
	}
	
	MyClass1(int n) {
		this(10,20);
		int fact=1;
		for(int i=1;i<=n;i++) 
			fact=fact*i;
		System.out.println("Factorial : " +fact);
	}
	
	MyClass1(int a, int b) {
		
		int sum=a+b;
		System.out.println("Sum : " +sum);
		
	}
}

public class Polymorphism_ConstructorOverLoading_Ex6 {

	public static void main(String[] args) {
		MyClass1 obj_1 = new MyClass1("Jenish");

	}

}
