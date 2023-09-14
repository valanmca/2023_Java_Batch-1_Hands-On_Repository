package com.purushoth.day13;

class Animal{
	
	int a=10;
	public void eat() {
		System.out.println("All animals will eat");
	}
}

class Dog extends Animal{
	int a=20;
	public void eat() {
		System.out.println("Dogs ate chicken");
	}
}

class Animal1{
	String s= getValue();
    String getValue() {
    return "A";
    }
}

class Dog1 {
	String getValue() {
		return "B";
	}
}
public class ClarificationClasses {

	public static void main(String[] args) {
		Animal obj=new Animal();
		obj.eat();
		
		Animal obj1=new Dog();//Dynamic Method Dispatch.[DMD] 
		obj1.eat();
		
		Animal1 obj2=new Animal1();
		System.out.println(obj2.s);
		
			

	}

} //Clarification of classes and also DMD(Dynamic Method Dispatch).
