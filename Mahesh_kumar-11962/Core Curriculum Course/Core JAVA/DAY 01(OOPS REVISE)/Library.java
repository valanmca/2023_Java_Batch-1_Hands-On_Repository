package com.mahesh.core_java;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {

	static int input;
	static char choice;
	
	int b_id;
	int b_year;
	String b_name;

	ArrayList<Integer> Book_id = new ArrayList<Integer>();
	ArrayList<String> Book_name = new ArrayList<String>();
	ArrayList<Integer> Book_year = new ArrayList<Integer>();
	static Scanner sc_obj = new Scanner(System.in);

	// Methods


	void Add_BOOK() {
		System.out.println("ADD BOOK DETAILS");
		System.out.println("Enter book id : ");
		Book_id.add(b_id= sc_obj.nextInt());
		System.out.println("Enter book name : ");
		Book_name.add(b_name= sc_obj.next());
		System.out.println("Enter book year : ");
		Book_year.add(b_year= sc_obj.nextInt());
		
	}

	void Remove_BOOK() {
		int key =0;
		System.out.println("REMOVE BOOK DETAILS");
		System.out.println("Enter the Book id you want to delete :");
		key = sc_obj.nextInt();
		System.out.println("\t---*---");
		for(int index=0;index<Book_id.size();index++)
		{
			if(key == index)
			{
		System.out.println("Enter book id : ");
		Book_id.remove(Book_id.get(index));
		System.out.println("Enter book name : ");
		Book_name.remove(Book_name.get(index));
		System.out.println("Enter book year : ");
		Book_year.remove(Book_year.get(index));
			}
			else
			{
				System.out.println("Plz enter the correct index");
			}
		}

	}

	void Show() {
		System.out.println("BOOK Details ");
	for(int i=0;i<Book_id.size();i++)
	{
		System.out.println("BOOK ID : " + Book_id.get(i));
		System.out.println("BOOK NAME : " + Book_name.get(i));
		System.out.println("BOOK YEAR : " + Book_year.get(i));
		
	}
	}
	
	void show_remove()
	{
		System.out.println("---*---");
		System.out.println("BOOK ID : " + b_id);
		System.out.println("BOOK NAME : " + b_name);
		System.out.println("BOOK YEAR : " + b_year);
		System.out.println("---*---");
	}

	public static void main(String[] args) {
	Library action = new Library();
		

		do {
			System.out.println("\t-*-*-*-ADD/REMOVE BOOK DETAILS-*-*-*-");
			System.out.println("Add Details press 1 / Delete Details press 2 / View Details press 3");

			input = sc_obj.nextInt();

			if (input == 1) {
				action.Add_BOOK();
				System.out.println("\tDetails were Added");
			} else if (input == 2) {
				action.Remove_BOOK();
				System.out.println("\tDetails were Deteled");
			}

			else if (input == 3) {
				action.Show();
				action.show_remove();
				System.out.println("\t-*-");
			}

			else {
				System.out.println("Plz choose 1 to 3");
			}
			System.out.println("Do you want to repeat ?(press S)");
			choice = sc_obj.next().charAt(0);
		} while (choice == 'S'| choice=='s');
	}

}
