package oops14;

interface AnimalPlan {
	void eat();

	void food();

	void move();

	void wayofmove();
}

abstract class Animal implements AnimalPlan {
	public void eat() {
		System.out.println("All animals can eat");
	}

	abstract public void food();

	public void move() {
		System.out.println("All animals can move");
	}

	abstract public void wayofmove();

}

class Bird extends Animal {
	public void food() {
		System.out.println("Bird eat nuts");
	}

	public void wayofmove() {
		System.out.println("Bird move by fly");
	}
}

class Dog extends Animal {
	public void food() {
		System.out.println("Dog eat Chicken");
	}

	public void wayofmove() {
		System.out.println("Dog move by walk");
	}
}

public class _7AnimalEx {

	public static void main(String[] args) {
		Animal bird=new Bird();
		bird.food();
		bird.wayofmove();
		
		Dog dog=new Dog();
		dog.food();
		dog.wayofmove();

	}

}
