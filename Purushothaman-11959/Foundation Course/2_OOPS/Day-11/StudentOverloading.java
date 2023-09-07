package com.purushoth.day11;

class Leafs{
	void info() {
		System.out.println("Use leafs");
	}
}

class Slates {
	void info() {
		System.out.println(" Use slates");
	}
}
class Notebooks {
	void info() {
		System.out.println(" Use Notebooks");
	}
}
class Laptop {
	void info() {
		System.out.println(" Use laptop");
	}
}
class Smartphones {
	void info() {
		System.out.println(" Use smartphones");
	}
}

class Student {
	public void takingNotes(Leafs leaf) {
		leaf.info();
	}
	public void takingNotes(Slates slates) {
		slates.info();
	}
	public void takingNotes(Notebooks notebooks) {
		notebooks.info();
	}
	public void takingNotes(Laptop laptop) {
		laptop.info();
	}
	public void takingNotes(Smartphones smartphones) {
		smartphones.info();
	}
}

public class StudentOverloading {

	public static void main(String[] args) {
		Leafs leaf=new Leafs();
		Student one=new Student();
		one.takingNotes(leaf);
		
		Slates slates=new Slates();
		Student two=new Student();
		two.takingNotes(leaf);
        two.takingNotes(slates);
        
        Notebooks notebooks=new Notebooks();
        Student three=new Student();
		three.takingNotes(leaf);
		three.takingNotes(slates);
		three.takingNotes(notebooks);
		
		Laptop laptop=new Laptop();
		Student four=new Student();
		four.takingNotes(leaf);
		four.takingNotes(slates);
		four.takingNotes(notebooks);
		four.takingNotes(laptop);
		
		Smartphones smartphones=new Smartphones();
		Student five=new Student();
		five.takingNotes(leaf);
		five.takingNotes(slates);
		five.takingNotes(notebooks);
		five.takingNotes(laptop);
		five.takingNotes(smartphones);
	}

}//Student Overloading for student notes taking.
