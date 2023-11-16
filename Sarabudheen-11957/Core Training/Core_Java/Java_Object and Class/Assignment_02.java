package com.sara.CoreJava.Day_04;

import java.util.ArrayList;
import java.util.Scanner;

class Movies {
	String title, actor, director, review;
	int index;
	ArrayList<String> reviewList = new ArrayList<String>();
	static Scanner sc = new Scanner(System.in);

	void add_details() {
		System.out.println("Enter the Movie title : ");
		title = sc.next();
		System.out.println("Enter the Movie Actor name : ");
		actor = sc.next();
		System.out.println("Enter the Movie director name : ");
		director = sc.next();
	}

	void add_review() {
		System.out.println("ADD REVIEW");
		System.out.println("Type the review here : ");
		reviewList.add(review = sc.next());
	}

	void remove_review() {
		System.out.println("REMOVE REVIEW");
		System.out.println("Enter the review index : ");
		index = sc.nextInt();
		reviewList.remove(reviewList.get(index));

	}

	void display() {
		System.out.println("  Movie Details ");
		System.out.println("Movie Name : " + title);
		System.out.println("Movie Actor : " + actor);
		System.out.println("Movie Director : " + director);
		System.out.println("Movie Reviews : " + reviewList);

	}
}

public class Assignment_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char choice;
		Movies movie = new Movies();
		movie.add_details();
		do {

			System.out.println("ADD/REMOVE REVIEW");
			System.out.println(" 1.ADD REVIEW\n 2.DELETE REVIEW\n 3.VIEW DETAILS");

			int input = sc.nextInt();

			if (input == 1) {
				movie.add_review();
			} else if (input == 2) {
				movie.remove_review();
			}

			else if (input == 3) {
				movie.display();
			}

			else {
				System.out.println("Please Choose 1 to 3");
			}
			System.out.println("Do you want to repeat ?(press s)");
			choice = sc.next().charAt(0);
		} while (choice == 's' || choice == 'S');

	}

}
