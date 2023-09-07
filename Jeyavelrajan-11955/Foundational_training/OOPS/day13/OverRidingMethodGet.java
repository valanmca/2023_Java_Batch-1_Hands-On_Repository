package com.jeyavel.OOPS.day13;
//if we declare class as final we cannot be inherrit it so the inheritance will not occur 
//  ex  final class Animal
class Animal {
	String s = getValue();
//if we declare any variable /Method it cannot be override
	String getValue() {
		return "A";
	}
	
	//constructor -we cannot override constructor because it has diff class names    
	Animal(){
		
	}
}

class Dog1 extends Animal {
	String getValue() {
		return "B";
	}
	//constructor 
	Dog1(){
		
	}
}

public class OverRidingMethodGet {

	public static void main(String[] args) {
		Dog1 dog =new Dog1();
		System.out.println(dog.s);//B
		
		//final - it is fixed and we cannot override it 
		//we cannot use final in Abstract because final cannot override
		//and final also not used in inheritance 
		final int a=10;

	}

}


