package com.purushoth.day12;

class Animal{
	void eat() {
		System.out.println("All animals will eat");
	}
}

class Dog extends Animal{
	public void eat() {//default,protected,public.
		System.out.println("Dogs will eat chicken");
	}
}

public class AnimalInheritance {

	public static void main(String[] args) {
       Dog obj=new Dog();
       obj.eat();
       

	}

}//Animal Inheritance.
