package com.swetha.day11;
class Leaf{
	void write() {
		System.out.println("\nWritten using leaf");
	}
	
}
class Slate{
	void write(){
		System.out.println("Written using slate");
	}
}
class NoteBook{
	void write() {
		System.out.println("Written using Notebook");
	}
}
class Laptop{
	void write() {
		System.out.println("Written using Laptop");
	}
}
class SmartPhone{
	void write() {
		System.out.println("Written using Smartphone");
	}
}

class Student{
	public void takingNotes(Leaf leaf) {
		leaf.write();
	}
	public void takingNotes( Slate slate) {
		slate.write();
	}
	public void takingNotes( NoteBook noteBook) {
		noteBook.write();
	}
	public void takingNotes( Laptop laptop) {
		laptop.write();
	}
	public void takingNotes( SmartPhone smartphone) {
		smartphone.write();
	}
}
public class StudentNotes {

	public static void main(String[] args) {
		
		Leaf obj=new Leaf();
		Slate obj1=new Slate();
		NoteBook obj2=new NoteBook();
		Laptop obj3=new Laptop();
		SmartPhone obj4=new SmartPhone();
		
		Student gen1=new Student();
		gen1.takingNotes(obj);
		
		Student gen2=new Student();
		gen2.takingNotes(obj);
		gen2.takingNotes(obj1);
		
		Student gen3=new Student();
		gen3.takingNotes(obj);
		gen3.takingNotes(obj1);
		gen3.takingNotes(obj2);
		
		Student gen4=new Student();
		gen4.takingNotes(obj);
		gen4.takingNotes(obj1);
		gen4.takingNotes(obj2);
		gen4.takingNotes(obj3);
		
		Student gen5=new Student();
		gen5.takingNotes(obj);
		gen5.takingNotes(obj1);
		gen5.takingNotes(obj2);
		gen5.takingNotes(obj3);
		gen5.takingNotes(obj4);
		

	}

}
