package com.swetha.day13;
 class Animal{
	final int a=10;
	public void eat() {
		System.out.println("All animals eat");
	}
}
class Dog extends Animal{
	int a=20;
	public void eat() {
		System.out.println("Dog eat chicken");
	}
}
public class OverrideExample {

	public static void main(String[] args) {
		 Dog dog=new Dog();
		 dog.eat();
		 
		 Animal animal=new Dog();     //[animal--object for Dog class]....[animal--reference for Animal class]
		 animal.eat();                //Method can override,but variable cannot override
		 System.out.println(animal.a);   //[animal--reference for Animal class,(animal.a)prints the value of 'a' from Animal class,bacause the variable cannot override]
		 
		 
		 
		 
		 
		 
		 
		

	}

}
