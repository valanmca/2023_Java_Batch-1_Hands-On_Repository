
//Overriding is a runtime polymorphism
//It is rewriting the Existing Functionality
package com.jeyavel.OOPS.day11;

//OverRiding is between 2 or More classes
//Inheritance is Used For OverRiding  
//Super Class
class Animal {
	public void eat() {
		
		System.out.println("All Animals Can Eat");
	}
	public void sound() {
		System.out.println("All animals can Make Sounds");
	}
}


//SubClass
class Dog {
	public void eat() {
		System.out.println("-----------------------------");
		System.out.println("dog eat Chicken");
	}
	public void sound() {
		System.out.println("Dog will bark");
		System.out.println("-----------------------------");
	}

}

class Cat {
	public void eat() {
		System.out.println("-----------------------------");
		System.out.println("cat eat fish");
	}
	public void sound() {
		System.out.println("cat will Meow");
		System.out.println("-----------------------------");
	}
}

public class MethodOverridingExNo1 {

	public static void main(String[] args) {
		// Overriding is allocating memory in runtime and its completely based on objects
		Animal ani = new Animal();
		ani.eat();
		ani.sound();
		
		Dog dog = new Dog();
		dog.eat();
		dog.sound();
		
		Cat cat =new Cat();
		cat.eat();
		cat.sound();
	}

}
