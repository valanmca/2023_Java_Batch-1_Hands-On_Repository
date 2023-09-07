package com.shiva.day11;

//Method Overloading

class Leaf
{
	void info()
	{
		System.out.println("I will write on Leaf");
	}
}
class Slate 
{
	void info()
	{
		System.out.println("I will write on Slate");
	}
}
class NoteBooks
{
	void info()
	{
		System.out.println("I will write on NoteBooks");
	}
}
class Laptop
{
	void info()
	{
		System.out.println("I will write on Laptop");
	}
}
class SmartPhone
{
	void info()
	{
		System.out.println("I will write on SmartPhone");
	}
}
class Student
{
	public void takingNotes(Leaf leaf)
	{
		leaf.info();
	}
	public void takingNotes(Slate slate)
	{
		slate.info();
	}
	public void takingNotes(NoteBooks notebooks)
	{
		notebooks.info();
	}
	public void takingNotes(Laptop laptop)
	{
		laptop.info();
	}
	public void takingNotes(SmartPhone smartphone)
	{
		smartphone.info();
	}
}
public class MethodOverloading01 {

	public static void main(String[] args) {
		
		Leaf obj1=new Leaf();
		
		Slate obj2=new Slate();
		
		NoteBooks obj3=new NoteBooks();
		
		Laptop obj4=new Laptop();
		
		SmartPhone obj5=new SmartPhone();
		
		Student gen1=new Student();
		gen1.takingNotes(obj1);
		gen1.takingNotes(obj2);
		gen1.takingNotes(obj3);
		gen1.takingNotes(obj4);
		gen1.takingNotes(obj5);
		
		/*Student gen1=new Student();
		gen1.takingNotes(obj1);
		System.out.println("------------------------------");
		
		Student gen2=new Student();
		gen2.takingNotes(obj1);
		gen2.takingNotes(obj2);
		System.out.println("------------------------------");
		
		Student gen3=new Student();
		gen3.takingNotes(obj1);
		gen3.takingNotes(obj2);
		gen3.takingNotes(obj3);
		System.out.println("------------------------------");
		
		Student gen4=new Student();
		gen4.takingNotes(obj1);
		gen4.takingNotes(obj2);
		gen4.takingNotes(obj3);
		gen4.takingNotes(obj4);
		System.out.println("------------------------------");
		
		Student gen5=new Student();
		gen5.takingNotes(obj1);
		gen5.takingNotes(obj2);
		gen5.takingNotes(obj3);
		gen5.takingNotes(obj4);
		gen5.takingNotes(obj5);
		System.out.println("------------------------------");*/
	}

}
