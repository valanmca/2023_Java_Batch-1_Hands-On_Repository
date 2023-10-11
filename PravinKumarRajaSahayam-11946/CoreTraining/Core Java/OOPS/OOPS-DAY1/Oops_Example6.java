//Write a Java program to create an abstract class Animal with an abstract method called sound(). Create subClasses Lion and is Tiger that extands the Animal class and implements the sound() method to make a specific sound for each animals.
abstract class Animals {
	void sound() {
		System.out.println(" All Animals are make sounds ");
	}
}

class Lion extends Animals {
	void sound() {
		System.out.println(" Lion make roar ");
	}
}

class Tiger extends Animals {
	void sound() {
		System.out.println(" Tiger make a growl ");
	}
}

public class Oops_Example6 {

	public static void main(String[] args) {

		Animals obj = new Lion();
		obj.sound();

		Animals obj1 = new Tiger();
		obj1.sound();

	}
}
