package com.jenish.day13;


class Animal {
	int a = 10;
	void eat() {
		System.out.println("All animals will eat");
		
	}
}
class Dog extends Animal {
	int a = 20;
	void eat() {
		super.eat();
		System.out.println("Dog eat Chicken");
	}
}

public class Method_Overriding_DynamicMethodDispatch_Ex1 {

	public static void main(String[] args) {
		Dog obj = new Dog();
		obj.eat();
		
		Animal animal = new Dog(); //Dynamic Method Dispatch (DMD) 
		animal.eat();
		System.out.println(animal.a);//10
		
		// TODO Auto-generated method stub

	}

}
