//Using Over Loading Method for Decalaraing the this
package com.pravinkumar.day12;
//Using this keyword for the Constructors , Methods , Variables
public class Polymorphism_Exs_6 {
	int n;

	Polymorphism_Exs_6() {
		this(5);
	}

	Polymorphism_Exs_6(int n) {
		this.n = n;
		this.findFactorial();//For Using this we perdict the and calling the object for the main class for printing the output.
	}

	public void findFactorial() {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println("The Factorial is : " + fact);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Calling the Object from the Constructors
		Polymorphism_Exs_6 obj = new Polymorphism_Exs_6();
		/* We cannot use this inside the main class
		 * because it is static not instance
		 * Polymorphism_Exs_6 obj = new Polymorphism_Exs_6();
		 * this.findFactorial();
		 * ******/
	}

}
