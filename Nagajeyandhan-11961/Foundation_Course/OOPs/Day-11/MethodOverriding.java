//Method Overriding (Ex: Animal)

package com.jeyandhan.day11;

//Heirarchical Inheritance
class Animal{ //super class
	public void eat() {
		System.out.println("All Animals Eat");
	}
	public void speak() {
		System.out.println("All Animals Speak");
	}
}
class Dog extends Animal{ //sub class of animal
	public void eat() {
		System.out.println("Dog eat Bone");
	}
	public void speak() {
		System.out.println("Dog barks ");
	}
}

class Cat extends Animal{ //sub class of animal
	public void eat() {
		System.out.println("Cat eat Fish");
	}
	public void speak() {
		System.out.println("Cat Meows");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		// object creation
		
		Dog dog = new Dog();
		dog.eat(); //method calling
		dog.speak();
		
		Cat cat = new Cat();
		cat.eat();
		cat.speak();
	}

}
