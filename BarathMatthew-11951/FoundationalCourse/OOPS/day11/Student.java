package com.matthew.day11;

class Leafs{
	void info() {
		System.out.println("Leafs to take notes");
	}
}
class Slates{
	void info(){
		System.out.println("Slates to take notes");
	}
}	
class NoteBook{
	void info() {
		System.out.println("NoteBook to take notes");
	}
}

class Laptop{
	void info() {
		System.out.println("Laptop to take notes");
	}
}

class SmartPhones{
	void info(){
		System.out.println("SmartPhones to take notes ");
	}
}

	
class Notes{
	public void takingNotes(Leafs leafs) {
		leafs.info();
	}
	
	public void takingNotes(Slates slates) {
		slates.info();
	}
	
	public void takingNotes(NoteBook noteBook) {
		noteBook.info();
	}
	
	public void takingNotes(Laptop laptop) {
		laptop.info();
	}
}


public class Student {

	public static void main(String[] args) {
		
		//creating object
		
		Leafs leaf = new Leafs();
		Slates slates = new Slates();
		NoteBook noteBook = new NoteBook();
		Laptop laptop = new Laptop();
		
		Notes gen1 = new Notes();
		
		gen1.takingNotes(leaf);
		System.out.println("---------------------------------------");
		Notes gen2 =new Notes();
		gen2.takingNotes(leaf);
		gen2.takingNotes(slates);
		System.out.println("---------------------------------------");
		Notes gen3 =new Notes();
		gen3.takingNotes(leaf);
		gen3.takingNotes(slates);
		gen3.takingNotes(noteBook);
		System.out.println("---------------------------------------");
		Notes gen4 =new Notes();
		gen4.takingNotes(leaf);
		gen4.takingNotes(slates);
		gen4.takingNotes(noteBook);
		gen4.takingNotes(laptop);
		System.out.println("---------------------------------------");
	}

}
