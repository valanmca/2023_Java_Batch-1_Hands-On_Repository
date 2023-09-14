package com.shaji.Day11;

//Method overloading
class leafs{
	void info(){
		System.out.println("Taking Notes By Leafs....");
	}
}
class slates{
	void info(){
		System.out.println("Taking Notes By Slates....");
}
}
class noteBooks{
	void info(){
		System.out.println("Taking Notes By noteBooks....");
}
}
class Laptop{
	void info(){
		System.out.println("Taking Notes By Laptops....");
}
}
class smartPhones{
	void info(){
		System.out.println("Taking Notes By smartPhones....");
}
}
class Student{
	public void takingNotes(leafs leaf) {
		leaf.info();
	}
public void takingNotes(slates slate) {
		slate.info();
	}
public void takingNotes(noteBooks noteBook) {
		noteBook.info();
	}
public void takingNotes(Laptop Laptop) {
		Laptop.info();
}
public void takingNotes(smartPhones smartPhone) {
		smartPhone.info();
}
}
public class Student_Notes {

	public static void main(String[] args) {
		leafs notes1 = new leafs();
		slates notes2 = new slates();
		noteBooks notes3 = new noteBooks();
		Laptop notes4 = new Laptop();
		smartPhones notes5 = new smartPhones();

		Student std1 = new Student();
		std1.takingNotes(notes1);
		
		Student std2 = new Student();
		std2.takingNotes(notes2);
		
		Student std3 = new Student();
		std3.takingNotes(notes3);
		
		Student std4 = new Student();
		std4.takingNotes(notes4);
		
		Student std5 = new Student();
		std5.takingNotes(notes5);
	}
}



