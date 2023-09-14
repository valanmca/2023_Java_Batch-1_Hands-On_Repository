package com.purushoth.day11;
//Hierarchical inheritance
class Animal{
	public void eat() {//method
		System.out.println("All animals eat");
	}
}

class Dog extends Animal{
	public void eat() {
		System.out.println("Dog eat Chicken");
	}
}

class Cat extends Animal{
	public void eat() {
		System.out.println("Cat are Fish");
	}
}
public class OverRiding {

	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.eat();
		
		Cat cat=new Cat();
		cat.eat();
		

	}

}//OverRiding.
