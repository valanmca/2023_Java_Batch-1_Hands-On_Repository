//Usage of access specifiers in overriding

package com.jeyandhan.day12;

class Animal{ //super class
	 void eat() {
		System.out.println("All Animals Eat");
	}
	
}
class Dog extends Animal{ //sub class of animal
	public void eat() { // we can use default,protect, public access specifier
		System.out.println("Dog eat Bone");
	}

}

public class Animals {

	public static void main(String[] args) {
		//object Creation
		Dog dog = new Dog();
		//Method overloading
		dog.eat();
	
		
	}

}
