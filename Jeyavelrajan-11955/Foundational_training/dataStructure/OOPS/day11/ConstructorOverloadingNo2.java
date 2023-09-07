
//Constructor OverLoading
package com.jeyavel.OOPS.day11;

class myClass2 {

	myClass2(String Name) {
		this(5);// calling factorial constructor
		System.out.println("Constructor OverLoading Example");
		System.out.println("Welcome->" + Name);
	}

	myClass2(int n) {
		this(10, 20);// calling addition constructor
		int fact = 1;
		for (int i = 1; i < n; i++)
			fact = fact * i;
		System.out.println("Fact->" + n);
	}

	myClass2(int a, int b) {

		int sum = a + b;
		System.out.println("Sum of the values->" + sum);
	}
}

public class ConstructorOverloadingNo2 {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		myClass2 obj1 = new myClass2("Jeyavel");
//		myClass1 obj2 = new myClass1(7);
//		myClass1 obj3 = new myClass1(23,12); 

	}

}
