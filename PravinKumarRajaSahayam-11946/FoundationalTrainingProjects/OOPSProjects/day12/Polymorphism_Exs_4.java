//Using Over Loading Method for calling the super class and sub class using the constuctors using multiple Objects
package com.pravinkumar.day12;
//Using Constructors Over Loading

public class Polymorphism_Exs_4 {

	public Polymorphism_Exs_4(String Name) {
		System.out.println("Welcome : " + Name);
	}

	public Polymorphism_Exs_4(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println("The Factorial is : " + fact);
	}

	public Polymorphism_Exs_4(int a, int b) {
		int sum = 0;
		sum = a + b;
		System.out.println("The Sum is : " + sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//calling the Constructors with the help of the Objects
		//Using this for Calling the Constructors with Multiple objects
		Polymorphism_Exs_4 obj1 = new Polymorphism_Exs_4("PravinKumar");
		Polymorphism_Exs_4 obj2 = new Polymorphism_Exs_4(5);
		Polymorphism_Exs_4 obj3 = new Polymorphism_Exs_4(2, 3);

	}

}
