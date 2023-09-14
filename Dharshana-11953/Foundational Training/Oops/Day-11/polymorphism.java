package com.dharshu.day11;

//Method Overloading-----same method name with different types of arguments or no.of arguments

class Poly{
	void myMethod(String name) {
		System.out.println("Welcome " + name);
	}
	
	void myMethod(int n) {
		int fact =1;
		for(int i=1;i<=n;i++) 
			fact=fact*i;
		System.out.println("Factorial: " + fact);
	}
	
	void myMethod(int a,int b) {
		int sum=a+b;
		System.out.println("Sum:" + sum);
	}
}

public class polymorphism {

	public static void main(String[] args) {
		//object will take the space in heap memory
		Poly poly=new Poly();
		//variable will take memory during compile time in stack memory
		poly.myMethod(5);
		poly.myMethod("Dharshu");
		poly.myMethod(2, 2);

	}

}
