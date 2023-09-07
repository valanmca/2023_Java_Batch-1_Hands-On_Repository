/***** Example for final keyword using Abstract class... *****/
package com.sara.day13;

class Animal2 {
	int a = 10;

	public void eat() {
		System.out.println("All Animals can eat...");
	}
}

class Dogs extends Animal2 {
	int a = 20;
	int b = getBvalue();

	public void eat() {
		System.out.println("Dog can eat chicken...");
	}

	int getBvalue() {
		b = 20;
		return b;
	}
}

public class Abstraction_Ex02 {

	public static void main(String[] args) {
		final int a = 10;

		Dogs dog = new Dogs();
		dog.eat();

		Animal2 animal = new Dogs();
		animal.eat();

		System.out.println(animal.a);
		System.out.println(dog.b);

	}

}
