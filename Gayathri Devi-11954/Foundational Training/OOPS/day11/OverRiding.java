package com.gayathri.day11;


class Animal{
	void eat() {
		System.out.println("All animals eat");
	}
	void speak()
	{
		System.out.println("All animals make sound");
	}
}
class Dog extends Animal{
	void eat() {
		System.out.println("Dog eat chicken");
	}
	void speak()
	{
		System.out.println("Dog make lol lol lol");
	}
}
class Cat extends Animal{
	void eat() {
		System.out.println("Cat eat fish");
	}
	void speak()
	{
		System.out.println("Cat make meow meow meow");
	}
}
public class OverRiding {

	public static void main(String[] args) {
		Dog lol = new Dog();
		lol.eat();
		lol.speak();
		
		Cat meow = new Cat();
		meow.eat();
		meow.speak();

	}

}
