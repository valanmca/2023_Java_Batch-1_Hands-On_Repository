package com.jeban.Practice;
 
import java.util.*;
class Library{
	ArrayList <String> Books=new ArrayList<String>();
 
	void add_book(String book) {
		Books.add(book);
	}
	void remove_book(String book) {
		Books.remove(book);
	}
	void display() {
		System.out.println("Library Books:"+Books);
	}
 
}

public class Practice2 {

	public static void main(String[] args) {
		Library Book=new Library();
		Book.add_book("Romeo Juliete");
		Book.add_book("India after Gandhi");
		Book.add_book("Julies ceaser");
		Book.add_book("The Tempest");
		Book.add_book("Physcology");
		Book.display();
		System.out.println("");
		Book.remove_book("Physcology");
		Book.display();

	}

}
