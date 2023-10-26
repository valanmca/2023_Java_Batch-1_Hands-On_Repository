/***** Java program to create a class called "Library" with a collection of 
 books and methods to add and remove books *******/

package com.sara.CoreJava.Day_01;
import java.util.ArrayList;

class Library{
	ArrayList <String> Books_List = new ArrayList <String> (); 
	
	
	// Methods

	public void addBook(String Book) {
		Books_List.add(Book);
		System.out.println("Book is Added");
	}

	public void removeBook(String Book) {
		Books_List.remove(Book);
		System.out.println("Book is Removed");
	}
	
	public void displayBooks() {
		System.out.println("The Books Lists are : "+Books_List);
		System.out.println(" ");
	}
}

public class Assignment_06 {

	public static void main(String[] args) {
		Library books = new Library();
		
		books.addBook("Julius Caesar");
		books.displayBooks();
		
		books.addBook("harry potter");
		books.displayBooks();
		
		books.addBook("Anilaadum Mundril");
		books.displayBooks();
		
		books.addBook("Romeo Juliet");
		books.displayBooks();
		
		books.removeBook("harry potter");
		books.displayBooks();
		

	}

}
