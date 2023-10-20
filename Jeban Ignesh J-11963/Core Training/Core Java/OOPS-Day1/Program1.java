package com.jeban.oops;

class Animal {
	void makeSound() {
		System.out.println("all animals make sound");

	}
}

class cat extends Animal {
	void makeSound() {
		System.out.println("meow");
	}

}
class dog extends cat{
	void makeSound() {
		System.out.println("Bark");
	}
	
}

public class Program1 {

	public static void main(String[] args) {
		dog obj = new dog();
		cat obj1=new cat();
		obj.makeSound();
		obj1.makeSound();
		

	}

}
