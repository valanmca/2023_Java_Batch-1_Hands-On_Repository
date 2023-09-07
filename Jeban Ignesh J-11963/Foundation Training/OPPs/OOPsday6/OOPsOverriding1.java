package com.jeban.OOPsday6;//String over riding

class Animal{
	String s=getValue();
	
	Animal(){
		
	}
	
	String getValue() {
		return "A";
	}
			
}

class Dog extends Animal{
	Dog(){
		
	}
	String getValue() {
		return "B";
	}
	
}

public class OOPsOverriding1 {

	public static void main(String[] args) {
		Dog dog=new Dog();
		System.out.println(dog.s);
		

	}

}
