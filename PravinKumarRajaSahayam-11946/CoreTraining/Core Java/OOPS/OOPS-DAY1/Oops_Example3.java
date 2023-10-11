//Write a Java program to create a class called Animals with a method called makesound(). create a subclass called Cat that overrides the makesounds() method to bark.
class animal {
	void makesound() {
		System.out.println(" All Animal make a sound ");
	}
}

class Cat extends animal {
	void makesound() {
		System.out.println(" Cat is meow ");
	}
}

public class Oops_Example3 {

	public static void main(String[] args) {

		Cat Cat = new Cat();
		Cat.makesound();
	}
}
