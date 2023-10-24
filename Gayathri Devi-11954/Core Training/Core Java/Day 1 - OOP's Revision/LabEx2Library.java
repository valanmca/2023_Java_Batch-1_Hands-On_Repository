package com.gayathri.day1;
/*
 * Write a Java program to create a class called "Library" with a collection of books and methods to add and remove books.

 */

import java.util.LinkedList;
import java.util.Scanner;

class Library {
Scanner sc = new Scanner(System.in);
	String addBookName,removeBookName;
	LinkedList <String> Books= new LinkedList<String>();
	
	public void addBooks() {
		System.out.println("Enter Book Name : ");
		addBookName=sc.nextLine();
		Books.add(addBookName);
		
	}

	public void removeBooks() {
		System.out.println("\nEnter bookname to be remove : ");
		removeBookName = sc.nextLine();
		for (int i = 0; i < Books.size(); i++) {
			removeBookName.equals(Books.get(i));
		}
		Books.remove(removeBookName);
	}
	public void display() {
		System.out.println("Books in libreary : "+Books);
	}
}

public class LabEx2Library {

	public static void main(String[] args) {
		Library obj = new Library();
		obj.addBooks();
		obj.display();
		obj.removeBooks();
		obj.display();

	}

}
