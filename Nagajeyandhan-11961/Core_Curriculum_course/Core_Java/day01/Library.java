package com.jeyandhan.day01;
import java.util.ArrayList;

public class Library {

	ArrayList <String> books = new ArrayList<String>();
	
	
	public void addBooks(String book) {
		books.add(book);
	}
	
	public void removeBooks(String book1) {
		books.remove(book1);
	}
	
	public void display() {
		System.out.println(books);
	}
	
	public static void main(String[] args) {
		
		Library obj = new Library();
		
		System.out.println("\nBooks\n");
		obj.addBooks("Java");
		obj.addBooks("Python");
		obj.display();
		
		System.out.println("\nBooks after removed\n");
		obj.removeBooks("Java");
		obj.display();
		
	}

}
