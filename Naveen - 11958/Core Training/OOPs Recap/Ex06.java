package com.naveen.day1;

import java.util.ArrayList;
class Book {
	private String title;
	private String author;

	Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}

class Library{
	private ArrayList <Book> books;
	
	public Library() {
	    books = new ArrayList < Book > ();
	  }

	  public void addBook(Book book) {
	    books.add(book);
	  }

	  public void removeBook(Book book) {
	    books.remove(book);
	  }

	  public ArrayList < Book > getBooks() {
	    return books;
	  }
}


public class Ex06 {

	public static void main(String[] args) {
		
		Library obj = new Library();

	    Book b1 = new Book("Adventures of Tom Sawyer", "Mark Twain");
	    Book b2 = new Book("Ben Hur", "Lewis Wallace");
	    
	    obj.addBook(b1);
	    obj.addBook(b2);
	    
	    System.out.println("Books in the library:");
	    System.out.println("---------------------");
	    for (Book book: obj.getBooks()) {
	      System.out.println(book.getTitle() + " by " + book.getAuthor());
	    }
	    
	    obj.removeBook(b2);
	    System.out.println("\nBooks in the library:");
	    System.out.println("---------------------");
	    for (Book book: obj.getBooks()) {
	      System.out.println(book.getTitle() + " by " + book.getAuthor());
	    }
	}
	

}
