//Example for Constructor Overload
package com.sara.CoreJava.Day_05;

public class ConstructorOverload {

	ConstructorOverload() {
		System.out.println("Dafault constructor");
	}

	ConstructorOverload(int a) {
		System.out.println("Parameterized constructor ");
	}

	public static void main(String[] args) {
		ConstructorOverload def = new ConstructorOverload();
		ConstructorOverload parameter = new ConstructorOverload(3);
	}

}
