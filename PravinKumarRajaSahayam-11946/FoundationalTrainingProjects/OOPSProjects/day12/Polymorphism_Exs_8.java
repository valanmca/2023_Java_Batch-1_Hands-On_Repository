//Over Loading for the Concatination and take the output from the instance variables object
package com.pravinkumar.day12;
//Using Method Over Loading
class Concatination {
	void concat(int a, int b) {
		System.out.println("The Concatination is : " + a + b);
	}

	void concat(float a, float b) {
		System.out.println("The Concatination is : " + a + b);
	}

	void concat(String a, String b) {
		{
			System.out.println("The concatination is : " + "a" + "b");
		}
	}

}

public class Polymorphism_Exs_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Concatination obj = new Concatination();
		obj.concat(2, 3);
		obj.concat(3.0f, 25.0f);
		obj.concat("Pravin", "Kumar");
	}

}
