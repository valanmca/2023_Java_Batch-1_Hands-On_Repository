//overriding 
package com.matthew.day11;

class Animals{
	public void eat() {
		System.out.println("All Animals eat");
	}
	
	public void speak() {
		System.out.println("All Animals make Sound");
	}
}
class Dog extends Animals{
	public void eat() {
		System.out.println("Dog eat Chicken");
	}

	public void speak() {
		System.out.println("Dog will Bark");
	}
}

class Cat extends Animals{
	public void eat() {
		System.out.println("Cat eat Fish");
	}
	
	public void speak() {
		System.out.println("Meow");
	}
}
public class overriding {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.eat();
		cat.eat();
	}
}