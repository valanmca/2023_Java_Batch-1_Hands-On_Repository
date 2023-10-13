package revision.oops;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {
	ArrayList<String> book_List=new ArrayList<String>();
	Scanner sc=new Scanner(System.in);
	String books;
	
	void add_Book() {
		System.out.println("Enter no.of books to add:");
        int n=sc.nextInt();
        System.out.println("Enter Books:");
        for(int i=0;i<n;i++)
        {
            book_List.add(books=sc.next());
        }      
	}
	
	void remove_Book() {
		System.out.println("Enter no.of books to remove:");
        int n=sc.nextInt();
        System.out.println("Enter Books:");
        for(int i=0;i<n;i++)
        {
            book_List.remove(books=sc.next());
        }      
	}
	
	void display() {
		System.out.println("The books are: "+book_List);
	}
	

	public static void main(String[] args) {
		
      Library book1=new Library();
      book1.add_Book();
      book1.display();
      book1.remove_Book();
      book1.display();
	}

}

