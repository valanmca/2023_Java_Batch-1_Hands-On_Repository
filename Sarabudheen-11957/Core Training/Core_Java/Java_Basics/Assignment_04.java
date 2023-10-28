/******** Example Java program for multiple inheritance ********/
package com.sara.CoreJava.Day_01;

//Creating abstract class
abstract class animal_01 {

	// Creating abstract methods
	abstract public void sound();
}

class lion extends animal_01 {
	// Sound() method overriding
	public void sound() {
		System.out.println("Lion will roar");
	}
}

class Tiger extends animal_01 {
	// Sound() method overriding
	public void sound() {
		System.out.println("Tiger will growl");
	}
}

public class Assignment_04 {

	public static void main(String[] args) {
		animal_01 animal = new lion();
		animal.sound();
	}

}
