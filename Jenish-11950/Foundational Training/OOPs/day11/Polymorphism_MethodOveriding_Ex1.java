package com.jenish.day11;
//Method Overriding

class Animal {
	public void eat() {
		System.out.println("All Animals eat");
	}
	}
	class Dog extends Animal {
		public void eat() {
			System.out.println("Dog eat Chicken");
		}
		public void speak() {
			System.out.println("Dog will bark");
		}
		}
		class Cat extends Animal {
			public void eat() {
				System.out.println("Cat eat Fish");
			}
			public void speak() {
				System.out.println("Meow");
}
public class Polymorphism_MethodOveriding_Ex1 {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.eat();
		Dog speak = new Dog();
		speak.eat();

		
		Cat cat = new Cat();
		cat.eat();
		Cat speak1 = new Cat();
		speak1.eat();
	}
		// TODO Auto-generated method stub

	}
		}


