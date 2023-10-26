//Method overriding
//Write a java program to create a class called Animal with a method called makeSound(). 
//Create a subclass called Cat that overrides the makeSound() method to bark.

package oopsDay1_Day2;
class Animal{
	public void makeSound() {
		System.out.println("Animal gives sound");
	}
}
class Cat extends Animal{
	public void makeSound() {
	System.out.println("Meow");
   }	
}

public class OverrideAnimal {
	

	public static void main(String[] args) {
		Cat obj=new Cat();
		obj.makeSound();

	}
}


