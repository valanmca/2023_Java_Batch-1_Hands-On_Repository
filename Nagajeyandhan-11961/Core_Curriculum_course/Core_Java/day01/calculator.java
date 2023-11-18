//Arithmetic Operations

package com.jeyandhan.day01;

public class calculator {
	
	static int num1; //static variables
	static int num2;
	
	calculator(int num1, int num2){ //constructor
		
		this.num1 = num1; //Variable initialization
		this.num2 = num2;
	}
	
	void addition() {
		
		System.out.println("\nAddition of "+num1+ " and "+num2+ " is: "+(num1+num2));
	}
	
	void subtraction() {
		
		System.out.println("\nSubtraction of "+num1+ " and "+num2+ " is: "+(num1-num2));
	}
	
	static void multiplication() {
		
		System.out.println("\nMultiplication of "+num1+ " and "+num2+ " is: "+(num1*num2));
	}
	
	static void division() {
		
		System.out.println("\nDivision of "+num1+ " and "+num2+ " is: "+(num1/num2));
	}
	
	public static void main(String[] args) {
		
		calculator calc = new calculator (10, 2); // object creation
		
		System.out.println("\n\t ***Arithmetic Operations***");
		
		calc.addition(); // method calling
		calc.subtraction();
		
		calculator.multiplication(); // static method calling
		calculator.division();
		
	}

}
