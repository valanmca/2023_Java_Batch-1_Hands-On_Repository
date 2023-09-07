/********** Creating Abstract class for Animal... *********/
package com.sara.day13;

abstract class Animal {
	public void eat() {
		System.out.println("All animals eat");
	}
}

class Dog extends Animal {
	public void eat() {
		System.out.println("Dog eat chicken");
	}
}

public class Abstarction_Ex01 {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.eat();

		Animal animal = new Dog();
		animal.eat();

	}

}
