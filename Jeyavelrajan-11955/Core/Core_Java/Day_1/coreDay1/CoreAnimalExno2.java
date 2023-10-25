package com.jeyavel.coreDay1;

class c_Animal{
	void make_sound() {
		System.out.println("All Animals make Sound");
	}
}
class c_Cat extends c_Animal{
	void make_sound() {
		System.out.println("Cat sounds meaaw");
	}
}

public class CoreAnimalExno2 {

	public static void main(String[] args) {
		c_Animal animal = new c_Animal();
		animal.make_sound();
	    
		c_Cat cat = new c_Cat();
		cat.make_sound();

	}

}
