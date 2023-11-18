//Abstract

package com.jeyandhan.day01;

abstract class Animalss{ // abstract class
	
	
	abstract public void sound(); //abstract method
	
}

class Lion extends Animalss{
	
	public void sound() { //method overriding
		
		System.out.println("\nLion Roars");
	}
}

class Tiger extends Animalss{
	
	public void sound() {
		
		System.out.println("\nTiger Growl");
	}
}

public class AbstractClassExample {

	public static void main(String[] args) {
		System.out.println("\t ***Lion***");
		
		Animalss lion = new Lion(); //object creation [DMD]
				
		lion.sound(); // object calling
		
		
		System.out.println("\n\t ***Tiger***");
		
		Animalss tiger = new Tiger(); //object creation
		
		tiger.sound(); // object calling
	}

}
