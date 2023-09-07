package com.gayathri.day11;

class MyClass {
	 MyClass(String name) {
		//this(5)
		System.out.println("Hai "+name);
	}

	/*
	 * private MyClass() { //this(5) System.out.println("Hai "); }
	 */
	protected MyClass(int n) {
		//this(5,5)
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact = fact*i;
		}
		System.out.println("The factorial of given number : "+fact);		
	}

	MyClass(int a, int b) {
		int sum = a+b;
		System.out.println("Sum : "+sum);
	}
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		/*
		 * MyClass object1 = new MyClass("G3 dvl");// will take a memory during run time
		 * in heap memory MyClass object2 = new MyClass(5); MyClass object3 = new
		 * MyClass(5,5);
		 */
		
		MyClass obj;
		obj = new MyClass("gayathri");
		obj = new MyClass(7);
		obj = new MyClass(5,5);
		//obj = new MyClass();
		
	}

}
