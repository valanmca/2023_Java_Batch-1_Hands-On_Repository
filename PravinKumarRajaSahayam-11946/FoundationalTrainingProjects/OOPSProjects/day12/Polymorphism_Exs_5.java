//Using this for Calling the object Constructors with the single objects
package com.pravinkumar.day12;
//Using this keyword for Calling the object Constructors
public class Polymorphism_Exs_5 {
	public Polymorphism_Exs_5(String Name) {
		this(5);
		System.out.println("Welcome : " + Name);
	}

	public Polymorphism_Exs_5(int n) {
		this(20, 30);
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println("The Factorial is : " + fact);
	}

	public Polymorphism_Exs_5(int a, int b) {
		int sum = 0;
		sum = a + b;
		System.out.println("The Sum is : " + sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Calling the Constructor with the help of the Object
		// Calling the Three Constructors in the Single Object
		Polymorphism_Exs_5 obj = new Polymorphism_Exs_5("PravinKumar");// Its will Calling the super class then it will
																		// continued
	}

}
