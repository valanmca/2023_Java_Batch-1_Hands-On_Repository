//Interface (Addition, Subtraction)

package com.jeyandhan.day14;

interface  Arithmetic {

	void addition(int a, int b); //by default abstract , public

	void subtraction(int a, int b);


}

class Calculator implements Arithmetic {
	
	public void addition(int a, int b) {
		System.out.println("Addition: " + (a + b));
	}

	public void subtraction(int a, int b) {
		System.out.println("Subtraction: " + (a - b));
	}


}

public class ArithInterface {

	public static void main(String[] args) {
		//object creation
		Arithmetic obj = new Calculator();
		
		//method calling
		obj.addition(13, 15);

		obj.subtraction(14, 4);


	}

}

