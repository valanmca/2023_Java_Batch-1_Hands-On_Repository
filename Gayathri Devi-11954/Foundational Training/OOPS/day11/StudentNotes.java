package com.gayathri.day11;
class Leaf
{
	void info()
	{
		System.out.println("People taken a notes by using leaves");
	}
}
class Slates
{
	void info()
	{
		System.out.println("People taken a notes by using slates");
	}
}
class NoteBook
{
	void info()
	{
		System.out.println("People take a notes by using notebooks");
	}
}
class Laptop
{
	void info()
	{
		System.out.println("People take a notes by using laptops");
	}
}
class Cell
{
	void info()
	{
		System.out.println("People will take a notes by using their phones");
	}
}
class Notes{
	public void takingNotes(Leaf leaf) {
		leaf.info();
	}
	public void takingNotes(Slates slate) {
		slate.info();
	}
	public void takingNotes(NoteBook book) {
		book.info();
	}
	public void takingNotes(Laptop lap) {
		lap.info();
	}
	public void takingNotes(Cell phone) {
		phone.info();
	}
}

public class StudentNotes {

	public static void main(String[] args) {
		Leaf leaf = new Leaf();
		Slates slate = new Slates();
		NoteBook book = new NoteBook();
		Laptop lap = new Laptop();
		Cell phone = new Cell();
		System.out.println("\nIn ancient time....");
		Notes ancient = new Notes();
		ancient.takingNotes(leaf);
		System.out.println("\nAfter some years....");
		Notes after = new Notes();
		after.takingNotes(leaf);
		after.takingNotes(slate);
		System.out.println("\nThen....");
		Notes then = new Notes();
		then.takingNotes(leaf);
		then.takingNotes(slate);
		then.takingNotes(book);
		System.out.println("\nNow....");
		Notes now = new Notes();
		now.takingNotes(leaf);
		now.takingNotes(slate);
		now.takingNotes(book);
		now.takingNotes(lap);
		System.out.println("\nUpcoming years....");
		Notes upcoming = new Notes();
		upcoming.takingNotes(leaf);
		upcoming.takingNotes(slate);
		upcoming.takingNotes(book);
		upcoming.takingNotes(lap);
		upcoming.takingNotes(phone);

	}

}

