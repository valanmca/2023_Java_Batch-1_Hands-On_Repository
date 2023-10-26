//Write a Java program to create a class called "Library" with a 
//collection of books and methods to add and remove books.

package oopsDay1_Day2;
import java.util.ArrayList;

class library1{
	ArrayList<String> book_list=new ArrayList <String>();


public void addBook(String book) {
	book_list.add(book);
	
}
public void removeBook(String book) {
	book_list.remove(book);
	System.out.println("Book Removed");
}
void display() {
	System.out.println("Books list : "+book_list);
	System.out.println(" ");
	
}

}

public class Library {

	public static void main(String[] args) {
		library1 lib=new library1();
		lib.addBook("Story");
		lib.addBook("Poetry");
		lib.display();
		
		lib.addBook("Biography");
		lib.display();
		
		lib.removeBook("Story");
		lib.display();
		

	}

}
