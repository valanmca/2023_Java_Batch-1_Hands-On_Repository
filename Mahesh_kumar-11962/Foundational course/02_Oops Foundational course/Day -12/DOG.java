package com.mahesh.Oops_day12;

class ANIMAL {

	 void eat() { //package level scope, current package will be visible.
		System.out.println("Animal can eat");
	}
}

public class DOG extends ANIMAL{

	public void eat() {
		System.out.println("Dog can eat Chiken");
	}

	public static void main(String[] args) {
		// revise override

		DOG food = new DOG();
		food.eat();

	}

}
