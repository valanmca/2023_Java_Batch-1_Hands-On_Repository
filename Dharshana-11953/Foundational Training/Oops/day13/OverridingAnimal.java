package com.dharshu.day13;

class Animal{
	String s="";
	
	String getnum() {
		return "A";
	}
	
	Animal(){
		System.out.println("Animals");
		}
}

class Dog extends Animal{
	//String s="";
	
	String getnum() {
		return "A";
	}
	
	Dog(){
		System.out.println("Animals");
		}
}


public class OverridingAnimal {

	public static void main(String[] args) {
		Animal animal=new Dog();
		System.out.println(animal.s);		
		animal.getnum();

	}

}
