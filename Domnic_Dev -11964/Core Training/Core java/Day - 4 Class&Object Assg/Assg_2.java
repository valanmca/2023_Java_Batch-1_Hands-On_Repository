package Core_Topic_Domnic_Day_4;

import java.util.ArrayList;
import java.util.Scanner;

class Movie {

	String Title;
	String Director;
	String Actor;

	ArrayList<String> reviews = new ArrayList<String>();
	Scanner sc = new Scanner(System.in);

	Movie(String Title, String Director, String Actor) {
		this.Title = Title;
		this.Director = Director;
		this.Actor = Actor;

	}

	void addreview() {
		System.out.println("Please Enter your review for " + Title);
		reviews.add(sc.next());
	}

	void display() {

		System.out.println("Movie name :" + Title);
		System.out.println("Director name :" + Director);
		System.out.println("Actor name :" + Actor);
		System.out.println("Reviews" + reviews);

	}

}

public class Assg_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Movie obj = new Movie("Vikram", "Lokesh", "Kamal");

		char choice;
		do {
			System.out.println("1.Add Review/n 2.View Review");
			int input = sc.nextInt();
			if (input == 1) {
				obj.addreview();
			} else {
				obj.display();
			}
			System.out.println("Do you want to Contiue (Press s)");
			choice = sc.next().charAt(0);
		} while (choice == 's' || choice == 'S');
	}

}
