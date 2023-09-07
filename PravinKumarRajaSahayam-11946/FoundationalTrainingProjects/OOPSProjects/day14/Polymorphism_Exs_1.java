//Method over riding 
package com.pravinkumar.day14;

class Animal {
	// Local Variables
	int a = 10;

	public void eat() {
		System.out.println("All Animals eat ");
	}

}

class Dog extends Animal {

	// Local Variables
	int a = 20;

	public void eat() {
		System.out.println("Dog eat Chickens ");
	}
}

public class Polymorphism_Exs_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Dog eat chickens
		Dog dog = new Dog();
		dog.eat();

		// Reverseing the super class to sub sub class
		// Same as Dog and this is a Animal is Reference and Dog is a Object , so it
		// will print the output
		// Dog eat chickens
		Animal animal = new Dog();
		animal.eat();

		// Reverseing the sub class to super class
		// It will getting error because the Reverse is not working in the over ridings
		// Dog dog1 = new Animal();

		Animal animal1 = new Animal();
		System.out.println(animal1.a);
	}

}
