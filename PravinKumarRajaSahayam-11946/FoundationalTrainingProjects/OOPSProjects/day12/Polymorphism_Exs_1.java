//Polymorphism
package com.pravinkumar.day12;

//Method OverLoading in the Polymorphism
public class Polymorphism_Exs_1 {
//Creating the Multiple Method Names but the functionability differences
	void myMethod(String name) {
		System.out.println("Welcome : " + name);
	}

	void myMethod(int n) {
		int fact = 1;//Functionability
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println("The Factorial is : " + fact);
	}

	void myMethod(int a, int b) {
		int sum = 0;
		sum = a + b;
		System.out.println("The Sum is : " + sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymorphism_Exs_1 obj = new Polymorphism_Exs_1();
		// Calling the object with the help of the Arguments in the class
		obj.myMethod("PravinKumar");
		obj.myMethod(5);
		obj.myMethod(1, 4);
	}

}
