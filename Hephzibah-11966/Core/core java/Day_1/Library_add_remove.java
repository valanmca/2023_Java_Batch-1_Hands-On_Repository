package oops_1;
import java.util.ArrayList;

class Library{
	ArrayList<String> books=new ArrayList<String>();
	
	void add_book(String book) {
		books.add(book);
	}
	void remove_book(String book) {
		books.remove(book);
	}
	void display() {	
		System.out.println(books);
	}
}
public class Library_add_remove {


	public static void main(String[] args) {
		Library obj=new Library();
		obj.add_book("Harry potter");
		obj.add_book("Rich Dad poor Dad");
		obj.add_book("Psychology of Money");
		obj.add_book("Think and Go Rich");
		obj.display();
		
		obj.remove_book("Think and Go Rich");
		obj.display();
		
		
		

	}

}
