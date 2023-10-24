package com.gayathri.day4;

import java.util.LinkedList;
import java.util.Scanner;

/*
 * 3. Write a Java program to create a class called "Restaurant" with attributes for menu items, 
 * prices, and ratings, and methods to add and remove items, and to calculate average rating.

 */
class Restaurant {
	String menu,rmmenu;
	double price, ratings_point,rmratings;
	double ans, avg;
	
	LinkedList<String> menu_item = new LinkedList<String>();
	LinkedList<Double> ratings = new LinkedList<Double>();
	LinkedList<Double> price_range = new LinkedList<Double>();
	
	Scanner sc = new Scanner(System.in);

	void addDetails() {
		System.out.print("\nEnter menu item : ");
		menu = sc.nextLine();
		menu_item.add(menu);
		
		System.out.print("\nEnter price : ");
		price = sc.nextDouble();
		price_range.add(price);
		
		System.out.print("\nEnter ratings : ");
		ratings_point = sc.nextDouble();
		ratings.add(ratings_point);
	}

	
	void removeDetails() {
		System.out.println("\nRemove menu item : ");
		rmmenu = sc.nextLine();
		menu_item.remove(rmmenu);
		System.out.println("\nRemove Ratings : ");
		rmratings = sc.nextDouble();
		ratings.remove(rmratings);
	}

	void CalculateAverage() {
		for (int i = 0; i < ratings.size(); i++) {
			ans = ans + ratings.get(i);
		}
		avg = ans / ratings.size();
		System.out.println("Average Ratings : " + avg);
	}

	void display() {
		System.out.println("\nMenu : " + menu_item);
		System.out.println("Price : " + price_range);
		System.out.println("Ratings : " + ratings);
		
	}

}

public class RestaruntProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Restaurant reference_obj = new Restaurant();
		
		System.out.println("Enter the below details..........");
		int choice;
		char option;
		do {
			System.out.println(""
					+ "\n1.Add Item"
					+ "\n2.Remove item"
					+ "\n3.Calculate average Ratings"
					+ "\n4.Display");
			System.out.println("\nSelect any one option : ");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				reference_obj.addDetails();
				break;
			case 2:
				reference_obj.removeDetails();
				break;
			case 3:
				reference_obj.CalculateAverage();
				break;
			case 4:
				reference_obj.display();
				break;
			}
			System.out.print("\nDo you want to repeat : ");
			option = sc.next().charAt(0);

		} while (option == 's' || option == 'S');
		


	}

}
