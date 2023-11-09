package com.jeyavel.coreDay4;
import java.util.ArrayList;
import java.util.Scanner;

public class MovieOops {
	
	public String title,directors,actors,review;
	static char choice;
	int index;
	public ArrayList <String> review_list = new ArrayList <String>();
	static Scanner sc_obj = new Scanner(System.in);
	
	void add_details() {
		System.out.println("Enter the Movie Title");
		title = sc_obj.next();
		System.out.println("Enter the Movie Directors");
		directors = sc_obj.next();
		System.out.println("Enter the Movie Actor Name");
		actors = sc_obj.next();
		System.out.println("Enter the Movie Review");
		review = sc_obj.next();
}
	void add_review() {
		System.out.println("Add review");
		System.out.println("Enter the review ");
		review_list.add(review = sc_obj.next());
	}
	void remove_review() {
		System.out.println("Remove review");
		System.out.println("Enter the review ");
		review_list.remove(sc_obj.next());
	}
	
	void Show() {
		System.out.println("Movie Name -"+title);
		System.out.println("Director Name - "+directors);
		System.out.println("Actor Name -"+actors);
		System.out.println("Review -"+review);
		
	}

	public static void main(String[] args) {
		MovieOops mov = new MovieOops();
		char change;
		mov.add_details();
		
		do {
			System.out.println("---------Press the Number to get Details------------- ");
			System.out.println("press 1 to add review----press 2 to remove review-----press 3 to show details");
			
			int input = sc_obj.nextInt();
			if(input ==1) {
				mov.add_review();
			}else if(input ==2) {
				mov.remove_review();
			}else if(input==3) {
				mov.Show();
			}
			else {
				System.out.println("press no 4");
			}
			System.out.println("Press s to repeat");
			change = sc_obj.next().charAt(0);
			
		}while(change=='s'|| change =='S');

	

	}

}


