package com.jenish.day13;

class Animal1 {
	String s = getValue();
	
	String getValue() {
		return "A";
	}
}

class Dog1 extends Animal {
	Dog1() {
		
	}
	String s = getValue();

	String getValue() {
		return "B";
		
	}
}
public abstract class MethodOverriding_String_GetValue_Ex2 {

	public static void main(String[] args) {
		Animal1 dog = new Animal1();
		System.out.println(dog.s);

	}

}

