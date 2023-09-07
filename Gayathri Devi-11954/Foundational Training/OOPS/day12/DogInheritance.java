package com.gayathri.day12;



class Animal{
	void eat() {
		System.out.println("All animals eat");
	}
}
class Dog extends Animal{
	void eat() {
		System.out.println("Dog eat chicken");
	}
}
public class DogInheritance {

	public static void main(String[] args) {
		Dog lol = new Dog();
		lol.eat();
	}

}
