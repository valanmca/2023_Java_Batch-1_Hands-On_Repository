package com.matthew.day13;
class Animals1{
	String s = getValue();
	
	// we cannot override constructor because of different class name
	
	// we cannot inherit 2 things constructor and private keyWord
	
	// if we make any variable or method or class as final the value cannot change , inheritance is not possible if we create a class as final
	
	// if we use super() in the super class then the default class 'Object' will get executed and if there is only one class with super keyword then its a single inheritance
	String getValue() {
		return "A";
	}
	
//	final String getValue() { 
//		return "A";
//	}
}

class Dog1 extends Animals1{
	String getValue() { // if final is use this method will  show error
		return "B";
	}
}
public class Revision01 {

	public static void main(String[] args) {
		Dog1 dog = new Dog1();
		System.out.println(dog.s);
		final int a = 20;
		//a = 30; - if we make any variable as final the value cannot change
	}

}
