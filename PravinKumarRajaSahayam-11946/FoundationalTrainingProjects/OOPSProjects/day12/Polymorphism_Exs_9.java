//Over Riding the all as same like class name , method , constructors method
package com.pravinkumar.day12;

//Using Over Riding Method
//Over Riding write the code Over Riding
//Over Riding can be run in the run time
class Animal {
	public void eat() {
		System.out.println("All Animals eat ");
	}

	public void speak() {
		System.out.println("All animals wiil make sounds ");
	}
}

class Dog extends Animal {
	public void eat() {
		System.out.println("Dog eat Chicken ");
	}

	public void speak() {
		System.out.println("Dog will park ");
	}
}

class Cat extends Animal {
	public void eat() {
		System.out.println("Cat eat Fish ");
	}

	public void speak() {
		System.out.println("meows");
	}
}

public class Polymorphism_Exs_9 {

	public static void main(String[] args) {
		// Calling the Constructors methods
		// TODO Auto-generated method stub
		Dog Dog = new Dog();
		Dog.eat();
		Dog.speak();

		Cat Cat = new Cat();
		Cat.eat();
		Cat.speak();
	}

}
