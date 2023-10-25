
//Write a Java program to create a class called "Restaurant" with attributes for menu items, prices, and ratings, 
//and methods to add and remove items, and to calculate average rating.
package com.shiva.core.day03;

import java.util.ArrayList;
import java.util.Scanner;

class Restaurant {

	ArrayList<String> Menu_items = new ArrayList<String>();
	ArrayList<Integer> Prices = new ArrayList<Integer>();
	Scanner sc = new Scanner(System.in);
	int Ratings;
	int i;

	void display() {
		System.out.println("Enter the No of items to be added & it's Prices");
		int n = sc.nextInt();
		for ( i = 0; i < n; i++) {
			System.out.println("Add " + (i + 1) + " Item");
			Menu_items.add(sc.next());
			System.out.println("Enter " + (Menu_items.get(i)) + " Price");
			Prices.add(sc.nextInt());
		}

		System.out.println("Menu List " + Menu_items + " Price " + Prices);
//		System.out.println("Enter the Prices to be added");
//		System.out.println(Prices);
		System.out.println();
		System.out.println("Enter the Ratings out of 5");
		Ratings = sc.nextInt();
		System.out.println("Ratings = " + Ratings + "/5");
	}
	
	void Remove_item() {
		System.out.println("Enter the index of the menu Item to delete ");
		int mr=sc.nextInt();
		Menu_items.remove(Menu_items.get(i));
		Prices.remove(Prices.get(i));
		
	}

}

public class Assign_Restaurant {

	public static void main(String[] args) {
		Restaurant obj = new Restaurant();
		obj.display();
		obj.Remove_item();
	}

}
