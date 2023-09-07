package com.matthew.day12;
//  overriding
//  sub class scope should be greater than or equal to super class scope
//  if super class method is default then the super class method can have (default, protected, public)
class Animals{
	 void eat() {
		System.out.println("All Animals eat");
	}
}

class Dog extends Animals{
	public void eat() { // can be default , protected or public
		System.out.println("Dog will eat chicken");
	}
	
}

class Cat extends Animals{ // can be default , protected or public
	protected void eat() {
		System.out.println("Cat will eat Fish");
	}
}
public class Program3 {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.eat();
		Cat cat = new Cat();
		cat.eat();
	}
}