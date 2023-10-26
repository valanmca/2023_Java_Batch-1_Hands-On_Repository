/******** Example Java program for method overriding ********/
package com.sara.CoreJava.Day_01;

class animal {
	// Creating makeSound() method
	void makeSound() {
		System.out.println("Bark");
	}
}

class cat extends animal {
	// makeSound() Method overriding

	void makeSound() {
		System.out.println("Meow");
	}
}

public class Assignment_02 {

	public static void main(String[] args) {
		
		// Creating an object for cat class
		cat obj = new cat();
		obj.makeSound();
	}

}
