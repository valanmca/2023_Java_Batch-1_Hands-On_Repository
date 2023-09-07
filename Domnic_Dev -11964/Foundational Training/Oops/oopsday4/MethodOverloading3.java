package com.domnic.oopsday4;

//methodoverloading
class Leafs {
	void info() {
		System.out.println("Writing in the leafs ");
	}
}

class Slates {
	void info() {
		System.out.println("Writing in the Slates ");
	}
}

class Notebooks {
	void info() {
		System.out.println("Writing in the Notebooks ");
	}
}

class Laptops {
	void info() {
		System.out.println("Writing in the Laptops ");
	}
}

class SmartPhone {
	void info() {
		System.out.println("Writing in the Smartphones ");
	}
}

class Student {
	public void takingNotes(Leafs leaf) {
		leaf.info();
	}

	public void takingNotes(Slates slate) {
		slate.info();
	}

	public void takingNotes(Notebooks noteBook) {
		noteBook.info();
	}

	public void takingNotes(SmartPhone smartPhone) {
		smartPhone.info();
	}

	public void takingNotes(Laptops laptops) {
		laptops.info();
	}
}

public class MethodOverloading3 {

	public static void main(String[] args) {
		Leafs leaf = new Leafs();

		Slates slate = new Slates();

		Notebooks noteBook = new Notebooks();
		Laptops laptops = new Laptops();
		SmartPhone smartPhone = new SmartPhone();

		Student earlydays1 = new Student();
		earlydays1.takingNotes(leaf);

		Student earlydays2 = new Student();
		// earlydays2.takingNotes(leaf);
		earlydays2.takingNotes(slate);

		Student moderndays1 = new Student();
		// moderndays1.takingNotes(leaf);
		// moderndays1.takingNotes(slate);
		moderndays1.takingNotes(noteBook);

		Student moderndays2 = new Student();
		// moderndays2.takingNotes(leaf);
		// moderndays2.takingNotes(slate);
		// moderndays2.takingNotes(noteBook);
		moderndays2.takingNotes(laptops);
		
		Student moderndays3 = new Student();
		// moderndays2.takingNotes(leaf);
		// moderndays2.takingNotes(slate);
		// moderndays2.takingNotes(noteBook);
		moderndays3.takingNotes(smartPhone);

	}

}
