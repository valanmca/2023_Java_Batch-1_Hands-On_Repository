package com.jeyandhan.day04;

import java.util.ArrayList;

import java.util.Scanner;

public class Movies {

	String title, actor, actoress, director, review;
	int index;
	static char choice;
	ArrayList<String> list = new ArrayList<String>();
	static Scanner sc = new Scanner(System.in);

	void addDetails() {
		System.out.println("Enter the Movie title : ");
		title = sc.next();
		System.out.println("Enter the Movie Actor name : ");
		actor = sc.next();
		System.out.println("Enter the Movie Actoress name : ");
		actoress = sc.next();
		System.out.println("Enter the Movie director name : ");
		director = sc.next();
	}

	void addReview() {
		System.out.println("  ADD REVIEW");
		System.out.println("Type the review here : ");
		list.add(review = sc.next());
	}

	void removeReview() {
		System.out.println("REMOVE REVIEW");
		System.out.println("Enter the review index : ");
		index = sc.nextInt();
		list.remove(list.get(index));

	}

	void Show() {
		System.out.println("  Movie Details ");
		System.out.println("Movie Name : " + title);
		System.out.println("Movie Actor : " + actor);
		System.out.println("Movie Actoress : " + actoress);
		System.out.println("Movie Director : " + director);
		System.out.println("Movie Reviews : " + list);

	}

	public static void main(String[] args) {

		Movies act = new Movies();
		act.addDetails();

		do {
			System.out.println("\t-*-*-*-ADD/REMOVE REVIEW-*-*-*-");
			System.out.println("ADD REVIEW press 1 / DELETE REVIEW press 2 / VIEW DETAILS press 3");

			int input = sc.nextInt();

			if (input == 1) {
				act.addReview();
			} else if (input == 2) {
				act.removeReview();
			}

			else if (input == 3) {
				act.Show();
			}

			else {
				System.out.println("Plz choose 1 to 3");
			}
			System.out.println("Do you want to repeat ?(press s)");
			choice = sc.next().charAt(0);
		} while (choice == 's' || choice == 'S');

	}

}

