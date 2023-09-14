package com.shaji.Day11;

//Polymorphism...

class Method {
	void myMethod(String Name) {
		System.out.println("Welcome " + Name);
	}

	void myMethod(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial : " + fact);
	}

	void myMethod(int a, int b) {
		int sum = a + b;
		System.out.println("Sum : " + sum);

	}
}

public class Method_Overloading {

	public static void main(String[] args) {
		Method obj = new Method();
		obj.myMethod(5);
		obj.myMethod("Shaji");
		obj.myMethod(10, 20);

	}

}
