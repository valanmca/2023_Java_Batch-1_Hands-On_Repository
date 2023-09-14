
//Constructor OverLoading Example 
//overLoading is (under One Class Many Methods with Same Name Different Parameters )
package com.jeyavel.OOPS.day11;

class myClass1 {

	myClass1(String Name) {
		System.out.println("Constructor OverLoading Example");
		System.out.println("Welcome->" + Name);
	}

	myClass1(int n) {
		int fact = 1;
		for (int i = 1; i < n; i++)
			fact = fact * i;
		System.out.println("Fact->" + n);
	}

	myClass1(int a, int b) {

		int sum = a + b;
		System.out.println("Sum of the values->" + sum);
	}
}

public class ConstructorOverLoading {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		myClass1 obj1 = new myClass1("Jeyavel");
		@SuppressWarnings("unused")
		myClass1 obj2 = new myClass1(7);
		@SuppressWarnings("unused")
		myClass1 obj3 = new myClass1(23, 12);

	}

}
