package com.matthew.test;

class c_Animal{
	void make_sound() {
		System.out.println("All Animals make sound.");
	}
}

class c_Cat extends c_Animal{
	void make_sound() {
		System.out.println("Cat sounds 'Meeaaw'");
	}
}

public class coreAnimal {
	public static void main(String[] args) {
		
		c_Animal animal= new c_Animal();
		animal.make_sound();
		
		c_Cat cat = new c_Cat();
		cat.make_sound();
		
	}

}
