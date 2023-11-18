//Example for Method Reference - Reference to the Instance method
package com.sara.CoreJava.Day_15;

interface Sayable2 {
	void say();
}

public class InstanceMethodReference {

	public void saySomething() {
		System.out.println("Hello, this is non-static method.");
	}

	public static void main(String[] args) {
		InstanceMethodReference methodReference = new InstanceMethodReference(); // Creating Object

		// Referring non-static method using reference

		Sayable2 say1 = methodReference::saySomething;

		// Calling interface method
		say1.say();

		// Referring non-static method using anonymous object
		Sayable2 say2 = new InstanceMethodReference()::saySomething;// anonymous object

		// Calling interface method
		say2.say();

	}

}
