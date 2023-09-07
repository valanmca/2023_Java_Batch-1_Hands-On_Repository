package com.naveen.day11;

//Method OverLoading using Student note taking Scenario.
class Leafs {
	void info() {
		System.out.println("Leaf : I'm First stage of note taking");
	}
}

class Slates {
	void info() {
		System.out.println("Slates: I'm Second stage of note taking");
	}
}

class NoteBooks {
	void info() {
		System.out.println("NoteBooks: I'm Third stage of note taking");
	}
}

class Laptop {
	void info() {
		System.out.println("Laptop: I'm Fourth stage of note taking");
	}
}

class SmartPhone {
	void info() {
		System.out.println("SmartPhone: I'm Present stage of note taking");
	}
}

class Student {
	public void takingNotes(Leafs leaf) {
		leaf.info();
	}

	public void takingNotes(Slates slate) {
		slate.info();
	}

	public void takingNotes(NoteBooks notebook) {
		notebook.info();
	}

	public void takingNotes(Laptop laptop) {
		laptop.info();
	}

	public void takingNotes(SmartPhone smartphone) {
		smartphone.info();
	}
}

public class PolymorphismEx03 {

	public static void main(String[] args) {
		Leafs leaf = new Leafs();
		Slates slate = new Slates();
		NoteBooks notebook = new NoteBooks();
		Laptop laptop = new Laptop();
		SmartPhone smartphone = new SmartPhone();

		Student first = new Student();
		first.takingNotes(leaf);
		System.out.println();

		Student second = new Student();
		second.takingNotes(leaf);
		second.takingNotes(slate);
		System.out.println();

		Student third = new Student();
		third.takingNotes(leaf);
		third.takingNotes(slate);
		third.takingNotes(notebook);
		System.out.println();

		Student fourth = new Student();
		fourth.takingNotes(leaf);
		fourth.takingNotes(slate);
		fourth.takingNotes(notebook);
		fourth.takingNotes(laptop);
		System.out.println();

		Student present = new Student();
		present.takingNotes(leaf);
		present.takingNotes(slate);
		present.takingNotes(notebook);
		present.takingNotes(laptop);
		present.takingNotes(smartphone);
		System.out.println();

	}

}
