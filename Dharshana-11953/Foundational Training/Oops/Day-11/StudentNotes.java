package com.dharshu.day11;

class Leafs{
	void info() {
		System.out.println("\nIn ancient time,People take notes in leafs");
	}
}

class Slates{
	void info() {
		System.out.println("After,People take notes in Slates");
	}
}

class NoteBooks{
	void info() {
		System.out.println("Then,People take notes in Notebooks");
	}
}

class Laptop{
	void info() {
		System.out.println("Afterthat,People take notes in Laptops");
	}
}

class SmartPhone{
	void info() {
		System.out.println("Now,People take notes in SmartPhones");
	}
}
class Student{
	public void takingNotes(Leafs leaf) {
		leaf.info();
	}
	
	public void takingNotes(Slates slate) {
		slate.info();
	}
	public void takingNotes(NoteBooks Notebook) {
		Notebook.info();
	}
	public void takingNotes(Laptop lap) {
		lap.info();
	}
	public void takingNotes(SmartPhone smartphone) {
		smartphone.info();
	}
}

public class StudentNotes {

	public static void main(String[] args) {
		Leafs leaf=new Leafs();
		Slates slate=new Slates();
		NoteBooks Notebook=new NoteBooks();
		Laptop lap=new Laptop();
		SmartPhone smartphone=new SmartPhone();
		
		Student ancient=new Student();
		ancient.takingNotes(leaf);
		
		Student after=new Student();
		after.takingNotes(leaf);
		after.takingNotes(slate);
		
		Student then=new Student();
		then.takingNotes(leaf);
		then.takingNotes(slate);
		then.takingNotes(Notebook);

		Student afterthat=new Student();
		afterthat.takingNotes(leaf);
		afterthat.takingNotes(slate);
		afterthat.takingNotes(Notebook);
		afterthat.takingNotes(lap);

		
		Student now=new Student();
		now.takingNotes(leaf);
		now.takingNotes(slate);
		now.takingNotes(Notebook);
		now.takingNotes(lap);
		now.takingNotes(smartphone);

	}

}
