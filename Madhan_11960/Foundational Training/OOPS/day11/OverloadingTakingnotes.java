package com.madhan.day11;

class Leaf
{
	 void notes()
	{
		System.out.println("First I am using leaf notes");
	}
}

class Slate
{
	void notes()
	{
		System.out.println("Later I used Slate");
	}
}

class NoteBook
{
	void notes()
	{
		System.out.println("After some period , I used Notebook");
	}
}

class Laptop
{
	void notes()
	{
		System.out.println("Now I am using Laptop");
	}
}

class Mobile1
{
	void notes()
	{
		System.out.println("Also Now I am using Mobile");
	}
}


class Student
{
	public void takingNotes(Leaf l)
	{
		l.notes();
	}
	public void takingNotes(Slate S)
	{
		S.notes();
	}
	public void takingNotes(NoteBook N)
	{
		N.notes();
	}
	public void takingNotes(Laptop LT)
	{
		LT.notes();
	}
	public void takingNotes(Mobile1 M)
	{
		M.notes();
	}
}

public class OverloadingTakingnotes {

	public static void main(String[] args) {
		Leaf lea=new Leaf();
		Slate sla=new Slate();
		NoteBook nb=new NoteBook();
		Laptop lap=new Laptop();
		Mobile1 mob=new Mobile1();

		Student st=new Student();
		st.takingNotes(lea);
		st.takingNotes(sla);
		st.takingNotes(nb);
		st.takingNotes(lap);
		st.takingNotes(mob);
		
	}

}
