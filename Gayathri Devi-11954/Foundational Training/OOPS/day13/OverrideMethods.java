package com.gayathri.day13;

class Animal{
	int a= 10;
	void eat() {
		System.out.println("All Animals eat");
	}
}
class Dog extends Animal{
	int a = 20;
	void eat() {
		System.out.println("Dog eat chicken");
	}
}

public class OverrideMethods {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.eat();
		System.out.println(dog.a);
		
		Animal ani = new Animal();
		ani.eat();
		System.out.println(ani.a);
		
		Animal anim = new Dog(); 	//super class reference, sub class object is posssible.
		anim.eat();
		System.out.println(ani.a);
		
		
		
//		Dog doge = new Animal(); 	//reverse order not possible

	}

}
