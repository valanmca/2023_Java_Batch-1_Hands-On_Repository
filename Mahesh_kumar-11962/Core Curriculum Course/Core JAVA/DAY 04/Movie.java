package com.mahesh.core_java_day_04;

import java.util.*;

public class Movie {

	String title, actor, actoress, director, review;
	int index;
	static char choice;
	ArrayList<String> review_lst = new ArrayList<String>();
	static Scanner sc_obj = new Scanner(System.in);

	void add_details() {
		System.out.println("Enter the Movie title : ");
		title = sc_obj.next();
		System.out.println("Enter the Movie Actor name : ");
		actor = sc_obj.next();
		System.out.println("Enter the Movie Actoress name : ");
		actoress = sc_obj.next();
		System.out.println("Enter the Movie director name : ");
		director = sc_obj.next();
	}

	void add_review() {
		System.out.println("  ADD REVIEW");
		System.out.println("Type the review here : ");
		review_lst.add(review = sc_obj.next());
	}

	void remove_review() {
		System.out.println("REMOVE REVIEW");
		System.out.println("Enter the review index : ");
		index = sc_obj.nextInt();
		review_lst.remove(review_lst.get(index));

	}

	void Show() {
		System.out.println("  Movie Details ");
		System.out.println("Movie Name : " + title);
		System.out.println("Movie Actor : " + actor);
		System.out.println("Movie Actoress : " + actoress);
		System.out.println("Movie Director : " + director);
		System.out.println("Movie Reviews : " + review_lst);

	}

	public static void main(String[] args) {

		Movie act = new Movie();
		act.add_details();

		do {
			System.out.println("\t-*-*-*-ADD/REMOVE REVIEW-*-*-*-");
			System.out.println("ADD REVIEW press 1 / DELETE REVIEW press 2 / VIEW DETAILS press 3");

			int input = sc_obj.nextInt();

			if (input == 1) {
				act.add_review();
			} else if (input == 2) {
				act.remove_review();
			}

			else if (input == 3) {
				act.Show();
			}

			else {
				System.out.println("Plz choose 1 to 3");
			}
			System.out.println("Do you want to repeat ?(press s)");
			choice = sc_obj.next().charAt(0);
		} while (choice == 's' || choice == 'S');

	}

}
