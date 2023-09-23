//Using Over Loading Method for Calling the Super class and Difference sub class
package com.pravinkumar.day12;

// Method Over Loading
class leafs {
	void info() {
		System.out.println("First stage of Notes Taking : ");
	}
}

class Slates {
	void info() {
		System.out.println("Second stage of Notes Taking : ");
	}
}

class NoteBooks {
	void info() {
		System.out.println("Thrid stage of Notes Taking : ");
	}
}

class Laptops {
	void info() {
		System.out.println("Fourth stage of Notes Taking : ");
	}
}

class SmartPhone {
	void info() {
		System.out.println("Fifth stage of Notes Taking : ");
	}
}
//Calling the Methods as well as name as Student and for write is takingNotes
class takingNotes {
	public void write(leafs leafs) {
		leafs.info();
	}

	public void write(Slates Slates) {
		Slates.info();
	}

	public void write(NoteBooks NoteBooks) {
		NoteBooks.info();
	}

	public void write(Laptops Laptops) {
		Laptops.info();
	}

	public void write(SmartPhone SmartPhone) {
		SmartPhone.info();
	}
}

public class Polymorphism_Exs_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		leafs leafs = new leafs();

		Slates Slates = new Slates();

		NoteBooks NoteBook = new NoteBooks();

		Laptops Laptop = new Laptops();

		SmartPhone SmartPhone = new SmartPhone();
//Calling the Methods in the classes
		takingNotes stage1 = new takingNotes();
		stage1.write(leafs);

		takingNotes stage2 = new takingNotes();
		stage2.write(leafs);
		stage2.write(Slates);

		takingNotes stage3 = new takingNotes();
		stage3.write(leafs);
		stage3.write(Slates);
		stage3.write(NoteBook);

		takingNotes stage4 = new takingNotes();
		stage4.write(leafs);
		stage4.write(Slates);
		stage4.write(NoteBook);
		stage4.write(Laptop);

		takingNotes stage5 = new takingNotes();
		stage5.write(leafs);
		stage5.write(Slates);
		stage5.write(NoteBook);
		stage5.write(Laptop);
		;
		stage5.write(SmartPhone);
	}

}
