package com.dharshu.day12;

class Animal{
	public void eat() {
		System.out.println("All Animals are eat");
	}
}

class Dog extends Animal{
	public void eat() { //in java default it will take access specifier --- a package level scope 
		System.out.println("Dog eat Chicken");
	}
}

public class DogInheritance {

	public static void main(String[] args) {
	Dog lol=new Dog();
	lol.eat();

	}

}
