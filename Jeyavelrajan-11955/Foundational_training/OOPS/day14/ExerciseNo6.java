package com.jeyavel.OOPS.day14;

interface AnimalPlan {
	void eat();

	void move();

	void food();

	void wayOfMove();

}

abstract class animal implements AnimalPlan {
	public void eat() {//over riding
		System.out.print("I can Eat , ");
	}

//	abstract public void move(); ->optional
	public void move() {//overriding
		System.out.print("Iwill Move One Place To Another Place , ");
	}
//	abstract public void eat();  ->optional

}
//use extends because we shift abstract class to Normal class
class Dog extends animal {
	public void food() {
		System.out.println("Chicken");
	}

	public void wayOfMove() {
		System.out.println("By walk");
	}

}

class Fish extends animal {
	public void food() {
		System.out.println("small fish");
	}

	public void wayOfMove() {
		System.out.println("By swim");
	}

	
}

class Bird extends animal {
	public void food() {
		System.out.println("Nuts");
	}

	public void wayOfMove() {
		System.out.println("By fly");
	}

}


public class ExerciseNo6 {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.eat();
		dog.food();
		dog.move();
		dog.wayOfMove();
		
		Bird b = new Bird();
		b.eat();
		b.food();
		b.move();
		b.wayOfMove();

		
	}

}
