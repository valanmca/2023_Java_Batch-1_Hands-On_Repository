package com.jenish.day11;

//Method OverLoading
class Leafs{
	void info() {
		System.out.println("Taking Notes by using Leafs");
	}
}

class Slates{
	void info() {
		System.out.println("Taking Notes by using Slates");
	}
	
}

class NoteBooks{
	void info() {
		System.out.println("Taking Notes by using NoteBooks");
	}
	
}

class Laptops {
	void info() {
		System.out.println("Taking Notes by using Laptops");
	}
	
}

class SmartPhones{
	void info() {
		System.out.println("Taking Notes by using Smartphones");
	}
	
}

class Student {
	public void takingNotes(Leafs leaf) {
		leaf.info();
	}
	
	public void takingNotes(Slates slates) {
		slates.info();
	}
	
	public void takingNotes(NoteBooks notebooks) {
		notebooks.info();
	}
	
	public void takingNotes(Laptops laptops) {
		laptops.info();
	}
	
	public void takingNotes(SmartPhones smartphones) {
		smartphones.info();
		
	}
	
}
public class Polymorphism_MethodOverloading_Ex3 {

	public static void main(String[] args) {
		Leafs leafs = new Leafs();
		
		Slates slates = new Slates();
		
		NoteBooks notebooks = new NoteBooks();
		
		Laptops laptops = new Laptops();
		
		SmartPhones smartphones = new SmartPhones();
		
		Student version1 = new Student();
		version1.takingNotes(leafs);
		
		Student version2 = new Student();
		version2.takingNotes(slates);
		
		Student version3 = new Student();
		version3.takingNotes(notebooks);
		
		Student version4 = new Student();
		version4.takingNotes(laptops);
		
		Student version5 = new Student();
		version5.takingNotes(smartphones);

	}

}
