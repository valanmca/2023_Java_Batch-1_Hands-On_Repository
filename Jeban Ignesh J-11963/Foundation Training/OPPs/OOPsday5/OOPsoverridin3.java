package com.jeban.OOPsday5;

class Animal1 {
	int a=10;
	void eat() {
		System.out.println("Animal can eat");
	}
}

class Dog1  extends Animal1 {
	int a=20;
	public void eat() {
		System.out.println("Dog eat chicken");
	}
}


public class OOPsoverridin3 {

	public static void main(String[] args) {
		Dog1 dog=new Dog1();
		dog.eat();
		
		Animal1 animal=new Dog1();//Dynamic Method Dispatch
		animal.eat();
		
		System.out.println(animal.a);
		
//		Dog animal1=new animal();// it's not worked,
	
		

	}

}
