package com.domnic.oopsday4;
//constructor overloading using this keyword,
//by using this keyword we can able to give argument to all constructor by one object creation 
public class ConstructorOverloading3 {
	int n;

	ConstructorOverloading3() {
		this(5);
	}

	ConstructorOverloading3(int n) {
		this.n = n;
		this.findfactorial();
	}

	public void findfactorial() {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of "+n+" is "+ fact);
	}

	public static void main(String[] args) {
		ConstructorOverloading3 obj = new ConstructorOverloading3();

	}

}
