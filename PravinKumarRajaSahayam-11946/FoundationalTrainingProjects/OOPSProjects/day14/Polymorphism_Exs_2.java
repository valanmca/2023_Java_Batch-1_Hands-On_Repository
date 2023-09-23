//Method Over ridings
package com.pravinkumar.day14;
//Using the getValue Method for over ridings and we can not using Constructors(super class and sub class) for over ridings
class Animal1 {
	String s = getValue();
//Because Constructors  name should be same in super class and sub class
	Animal1()
	{
		
	}
	String getValue() {
		return "A";
	}
}

class Dog1 extends Animal1 {
//constructors name is not same as the super class and sub class

	String getValue() {
		return "B";
	}
}

public class Polymorphism_Exs_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog1 dog = new Dog1();
		System.out.println(dog.s);
	}

}
