package com.jenish.day11;

//Method Overloading
class MyClass2{
	void myMethod(String name) {
		System.out.println("Welcome " +name);
		}
	
	void myMethod(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) 
			fact=fact*i;
		System.out.println("Factorial : " +fact);
	}
	
	void myMethod(int a, int b) {
		int sum=a+b;
		System.out.println("Sum : " +sum);
	}
}
public class Polymorphism_MethodOverloading_Ex1 {

	public static void main(String[] args) {
		MyClass2 obj = new MyClass2();
		obj.myMethod("Jenish");

		obj.myMethod(5);
		obj.myMethod(18,19);
		

	}

}
