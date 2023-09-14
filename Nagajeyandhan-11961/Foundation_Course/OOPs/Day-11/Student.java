//Notes Taking (Method Overloading)

package com.jeyandhan.day11;

class Leaf {
	public void info() {
		System.out.println("Leaf was used to write in Ancient times");
	}
}

class Slate {
	public void info() {
		System.out.println("later leaf was replaced by slate");
	}
}

class NoteBook {
	public void info() {
		System.out.println("After some time, Note Book has been used");
	}
}

class Laptop {
	public void info() {
		System.out.println("Afte Note Book Laptop was used");
	}
}

class SmartPhone {
	public void info() {
		System.out.println("Now we use sSmart Phone ");
	}
}

class StudentInfo {
	public void takingNote(Leaf leaf) {
		leaf.info();
	}

	public void takingNote(Slate slate) {
		slate.info();
	}

	public void takingNote(NoteBook note) {
		note.info();
	}

	public void takingNote(Laptop laptop) {
		laptop.info();
	}

	public void takingNote(SmartPhone phone) {
		phone.info();
	}

}

public class Student {

	public static void main(String[] args) {
		System.out.println("\t Stage1");
		Leaf leaf = new Leaf();
		StudentInfo stage1 = new StudentInfo();
		stage1.takingNote(leaf);

		System.out.println("\n\t Stage2");
		Slate slate = new Slate();
		StudentInfo stage2 = new StudentInfo();
		stage2.takingNote(leaf);
		stage2.takingNote(slate);

		System.out.println("\n\t Stage3");
		NoteBook note = new NoteBook();
		StudentInfo stage3 = new StudentInfo();
		stage3.takingNote(leaf);
		stage3.takingNote(slate);
		stage3.takingNote(note);

		System.out.println("\n\t Stage4");
		Laptop laptop = new Laptop();
		StudentInfo stage4 = new StudentInfo();
		stage4.takingNote(leaf);
		stage4.takingNote(slate);
		stage4.takingNote(note);
		stage4.takingNote(laptop);

		System.out.println("\n\t Stage5");
		SmartPhone phone = new SmartPhone();
		StudentInfo stage5 = new StudentInfo();
		stage5.takingNote(leaf);
		stage5.takingNote(slate);
		stage5.takingNote(note);
		stage5.takingNote(laptop);
		stage5.takingNote(phone);

	}

}
