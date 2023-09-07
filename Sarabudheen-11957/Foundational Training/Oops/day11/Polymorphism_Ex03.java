/******** Method Overriding Using Student Class... *********/
package com.sara.day11;

class Leafs {
	void info() {
		System.out.println("Students Taking Notes By Using Leafs...");
	}
}

class Slates {
	void info() {
		System.out.println("Students Taking Notes By Using Slates...");
	}
}

class NoteBooks {
	void info() {
		System.out.println("Students Taking Notes By Using NoteBooks...");
	}
}

class Laptops {
	void info() {
		System.out.println("Students Taking Notes By Using Loptops...");
	}
}

class SmartPhones {
	void info() {
		System.out.println("Students Taking Notes By Using SmartPhones...");
	}
}

class Student {

	public void takingNotes(Leafs leaf) {
		leaf.info();
	}

	public void takingNotes(Slates slate) {
		slate.info();
	}

	public void takingNotes(NoteBooks note) {
		note.info();
	}

	public void takingNotes(Laptops laptop) {
		laptop.info();
	}

	public void takingNotes(SmartPhones phone) {
		phone.info();
	}

}

public class Polymorphism_Ex03 {

	public static void main(String[] args) {

		Leafs leaf = new Leafs();
		Slates slate = new Slates();
		NoteBooks note = new NoteBooks();
		Laptops laptop = new Laptops();
		SmartPhones phone = new SmartPhones();

		Student vers1 = new Student();
		vers1.takingNotes(leaf);

		Student vers2 = new Student();
		vers2.takingNotes(slate);

		Student vers3 = new Student();
		vers3.takingNotes(note);

		Student vers4 = new Student();
		vers4.takingNotes(laptop);

		Student vers5 = new Student();
		vers5.takingNotes(phone);

	}

}
