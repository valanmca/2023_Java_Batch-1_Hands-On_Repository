package com.jeyavel.OOPS.day12;

//Default it will take a Package level Scope
class Animal {
	public void eat() {
		
		System.out.println("All Animals Can Eat");
	}
	public void sound() {
		System.out.println("All animals can Make Sounds");
	}
}

class Dog extends Animal{
	public void eat() {   //default,protected , public 
		System.out.println("-----------------------------");
		System.out.println("dog eat Chicken");
	}
	public void sound() {
		System.out.println("Dog will bark");
		System.out.println("-----------------------------");
	}

}

class Cat extends Dog {
	public void eat() {
		System.out.println("-----------------------------");
		System.out.println("cat eat fish");
	}
	public void sound() {
		System.out.println("cat will Meow");
		System.out.println("-----------------------------");
	}
}

public class MethodOverRiding {

	public static void main(String[] args) {
		// Overriding is allocating memory in runtime and its completely based on objects
		Animal ani = new Animal();
//		ani.eat();
//		ani.sound();
//		
//		Dog dog = new Dog();
//		dog.eat();
//		dog.sound();
		
		Cat cat =new Cat();
		cat.eat();
		cat.sound();
	}

}

