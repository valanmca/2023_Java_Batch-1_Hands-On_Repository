package com.swetha.day11;

//Method Overiding....same method name,same arguments,same return type

class Animal{
	public void eat(){
		System.out.println("All animals eat");
	}
}
class Dog extends Animal{
	public void eat() {
		System.out.println("Dogs eat chicken");
	}
	public void speak() {
		System.out.println("bark");
	}
}
class Cat extends Animal{
	public void eat() {
		System.out.println("Cat eat fish");
	}
	public void speak() {
		System.out.println("meow");
	}
}
public class Overriding {

	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.eat();
		dog.speak();
		
		Cat cat=new Cat();
		cat.eat();
		cat.speak();
	}

}
