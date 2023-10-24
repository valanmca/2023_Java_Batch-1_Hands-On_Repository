package Core_Topic_Domnic_Day_1;
import java.util.Scanner;
import java.util.ArrayList;

class Library{
	ArrayList<String> books=new ArrayList<String>();
	Scanner sc=new Scanner(System.in);
	void Add_Book() {
		System.out.println("Enter the number of Books to be added : ");
		int n = sc.nextInt();
		System.out.println("Enter "+n+" Books : ");

		for (int i = 0; i <n; i++) {
			books.add(sc.next());
		}
	}

	void Remove_Book() {

		System.out.println("Enter the book to be removed : ");
		books.remove(sc.next());

	}
	
	void display() {
		System.out.println("The Books in library are "+books);
	}
	
}

public class Assg2 {

	public static void main(String[] args) {
    Library obj=new Library();
    obj.Add_Book();
    System.out.println();
    obj.display();
    System.out.println();
    obj.Remove_Book();
    obj.display();

	}

}
