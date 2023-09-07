//Using the Access Specifier for the class(less in the super class and more in the sub class)class
package com.pravinkumar.day13;

//Using Inheritance for the Access Specifier
class Animals {
	// It is very less(we can only use the access specifier like public , default ,
	// protected , privates but less in the sub class)
	void eat() {
		System.out.println("I will eat all");
	}
}

class Dog extends Animals {
	// Here Even I will used the default , protected , public , access specifier
	/*
	 * like protected void eat() public void eat() void eat() but not using private
	 * in a sub class
	 */
	public void eat() {
		System.out.println("I will eat only the meat");
	}
}

class Cat extends Animals {
	public void eat() {
		System.out.println("I will eat only the sea food");
	}
}

public class OOPS_Exs_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat Cat = new Cat();
		Cat.eat();
		Dog Dog = new Dog();
		Dog.eat();
	}

}
