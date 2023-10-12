package com.naveen.day1;
/*Write a Java program to create an abstract class Animal with an abstract method called 
 * sound(). Create subclasses Lion and Tiger that extend the Animal Class and implement
 * the sound() method to make a specific sound for each animal.*/

abstract class Animal1 {
	abstract void sound();
}

class Lion extends Animal1 {
	void sound() {
		System.out.println("Lion will Roar");
	}
}

class Tiger extends Animal1 {
	void sound() {
		System.out.println("Tiger will growl");
	}
}

public class Ex04 {

	public static void main(String[] args) {
		
		//Animal1 obj1 = new Lion();
		Lion obj1 = new Lion();
		obj1.sound();
		
		Tiger obj2 = new Tiger();
		obj2.sound();

	}

}
