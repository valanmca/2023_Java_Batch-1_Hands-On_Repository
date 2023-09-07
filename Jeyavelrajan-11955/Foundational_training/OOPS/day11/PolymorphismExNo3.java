
//Constructor OverRiding  
package com.jeyavel.OOPS.day11;

class leaves {
	void takingNotes() {
		System.out.println();
		System.out.println("Generation 1");
		System.out.println("Ancient People use Leaves");
	}
}

class Slates {
	void takingNotes() {
		System.out.println("Generation 2");
		System.out.println("People using Slates ");
	}
}

class Notebooks {
	void takingNotes() {
		System.out.println("Generation 3");
		System.out.println("People using NoteBooks ");
	}
}

class Laptop {
	void takingNotes() {
		System.out.println("Generation 4");
		System.out.println("People using Laptop ");
	}
}

class SmartPhones {
	void takingNotes() {
		System.out.println("Generation 5");
		System.out.println("People using SmartPhones ");
	}
}


//Creating Reference for the Above classes
class Student {
	           //Method     (creating reference for leaves class-->leaf is reference for leaves)
	public void takingNotes(leaves leaf) {
		leaf.takingNotes();
	}

	public void takingNotes(Slates slate) {
		slate.takingNotes();
	}

	public void takingNotes(Notebooks note) {
		note.takingNotes();
	}

	public void takingNotes(Laptop lap) {
		lap.takingNotes();
	}

	public void takingNotes(SmartPhones mobile) {
		mobile.takingNotes();
	}

}

public class PolymorphismExNo3 {

	public static void main(String[] args) {
		leaves leaf = new leaves();

		Slates slate = new Slates();

		Notebooks note = new Notebooks();
		Laptop lap = new Laptop();

		SmartPhones Mobile = new SmartPhones();

		Student gen1 = new Student();
		gen1.takingNotes(leaf);

		Student gen2 = new Student();

		gen2.takingNotes(slate);

		Student gen3 = new Student();
		gen3.takingNotes(note);

		Student gen4 = new Student();
		gen4.takingNotes(lap);

		Student gen5 = new Student();
		gen5.takingNotes(Mobile);

	}

}
