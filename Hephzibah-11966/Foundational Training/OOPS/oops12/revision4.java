package oops12;

class Animal1 {
	 void eat() {
		System.out.println("all animals eat ");

	}

}

class Dog1 extends Animal1 {
	protected void eat() { //here can use default, protected, public
		System.out.println("Dog eat Chicken ");

	}

}

public class revision4 {

	public static void main(String[] args) {
		Dog1 dog = new Dog1();
		dog.eat();

	}

}
