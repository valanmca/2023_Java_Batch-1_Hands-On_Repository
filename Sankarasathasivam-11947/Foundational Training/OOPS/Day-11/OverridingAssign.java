package com.shiva.day11;

class Animal01 
{
	void eat() 
	{
		System.out.println("All animal eats");
	}
}

class Dog01 extends Animal01 {
	void eat() {
		System.out.println("Dog eats Chicken");
	}
}

class Cat01 extends Dog01 {
	void eat() {
		System.out.println("Cat drinks milk");
	}
}

public class OverridingAssign {

	public static void main(String[] args) {

		Animal01 obj = new Cat01();
		obj.eat();
	}

}
