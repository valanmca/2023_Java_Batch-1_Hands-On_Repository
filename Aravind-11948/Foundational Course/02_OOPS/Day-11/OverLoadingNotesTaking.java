package com.aravind.day11;

class Leafs {
	void info() 
	{
		System.out.println("using leafs");
	}

}
class Slades {
	void info() 
	{
		System.out.println("using Slades");
	}

}
class NoteBooks {
	void info() 
	{
		System.out.println("using Notebooks");
	}

}
class Laptops {
	void info() 
	{
		System.out.println("using Laptops");
	}

}
class SmartPhones {
	void info() 
	{
		System.out.println("using SmartPhones");
	}

}




class Student {
	public void takingNotes(Leafs leaf) {
		leaf.info();
	}
	public void takingNotes(Slades slade)
	{
		slade.info();
		
	}
	public void takingNotes(NoteBooks note)
	{
		note.info();
		
	}
	public void takingNotes(Laptops lap)
	{
		lap.info();
	}
	public void takingNotes(SmartPhones phone )
	{
		phone.info();
	}

}

public class OverLoadingNotesTaking {

	public static void main(String[] args) {
		Leafs leaf=new Leafs();
		Slades slade=new Slades();
		NoteBooks note=new NoteBooks();
		Laptops lap=new Laptops();
		SmartPhones phone =new SmartPhones();
		
		Student noteversion4=new Student();
		noteversion4.takingNotes(leaf);
		noteversion4.takingNotes(slade);
		noteversion4.takingNotes(note);
		noteversion4.takingNotes(lap);
		noteversion4.takingNotes(phone);
		
		

	}

}
