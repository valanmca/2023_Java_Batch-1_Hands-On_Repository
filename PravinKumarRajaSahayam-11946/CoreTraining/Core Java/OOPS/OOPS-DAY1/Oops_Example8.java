
//2. Write a Java program to create a class called "Library" with a collection of books and methods to add and remove books.
import java.util.ArrayList;

class Book {
	String Booktitle;
	String Bookauthor;

	Book(String Booktitle, String Bookauthor) {
		this.Booktitle = Booktitle;
		this.Bookauthor = Bookauthor;
	}

	public String getBooktitle() {
		return Booktitle;
	}

	public void setBooktitle(String Booktitle) {
		this.Booktitle = Booktitle;
	}

	public String getBookauthor() {
		return Bookauthor;
	}

	public void setBookauthor(String Boohauthor) {
		this.Bookauthor = Bookauthor;
	}
}

class Library {
	private ArrayList<Book> Books;

	public Library() {
		Books = new ArrayList<Book>();
	}

	public void addBook(Book books) {
		Books.add(books);
	}

	public void removeBook(Book books) {
		Books.remove(books);
	}

	public ArrayList<Book> getBooks() {
		return Books;
	}
}

public class Oops_Example8 {

	public static void main(String[] args) {

		Library library = new Library();
		Book book1 = new Book("Life Divine", "Sri Aurbindo Ghosh");
		Book book2 = new Book("Lost Child ", "Mulk Raj Anand");
		Book book3 = new Book(" My Days ", "S. Nihal Singh");

		library.addBook(book1);
		library.addBook(book2);
		library.addBook(book3);

		System.out.println(" Books in the Library : ");

		for (Book books : library.getBooks()) {
			System.out.println(books.getBooktitle() + " by " + books.getBookauthor());
		}

		library.removeBook(book3);
		System.out.println("\n Books in the Library after remove " + book3.getBooktitle() + " : ");

		for (Book books : library.getBooks()) {
			System.out.println(books.getBooktitle() + " by " + books.getBookauthor());
		}
	}
}
