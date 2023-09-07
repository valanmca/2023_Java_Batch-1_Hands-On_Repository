package com.gayathri.day11;

class MethodOverloading {
	void myMethod(String name) {
		System.out.println("Hai "+name);
	}

	void myMethod(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact = fact*i;
		}
		System.out.println("The factorial of given number : "+fact);		
	}

	void myMethod(int a, int b) {
		int sum = a+b;
		System.out.println("Sum : "+sum);
	}
}

public class Polymorphism {

	public static void main(String[] args) {
		MethodOverloading object = new MethodOverloading();// will take a memory during run time in heap memory 
		object.myMethod(7);//object variables will take a space in stack memory during compile time
		object.myMethod("Gayathri");
		object.myMethod(50, 50);
	}

}
