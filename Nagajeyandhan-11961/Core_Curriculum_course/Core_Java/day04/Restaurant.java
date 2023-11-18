package com.jeyandhan.day04;

import java.util.*;

public class Restaurant {

	ArrayList<String> menuItem = new ArrayList<String>();
	ArrayList<Integer> itemPrice = new ArrayList<Integer>();
	ArrayList<Float> itemRate = new ArrayList<Float>();
	static Scanner sc = new Scanner(System.in);
	String foodItem;
	int foodPrice;
	float foodRate;
	static char choice;

	void addMenu() {
		System.out.println("Enter the Menu item name : ");
		menuItem.add(foodItem = sc.next());
		System.out.println("Enter the Menu item price : ");
		itemPrice.add(foodPrice = sc.nextInt());
		System.out.println("Enter the Menu item rating : ");
		itemRate.add(foodRate = sc.nextFloat());
	}

	void removeMenu() {
		System.out.println("Enter the Menu item you want to delete (index) : ");
		int index = sc.nextInt();

		menuItem.remove(menuItem.get(index));

		itemPrice.remove(itemPrice.get(index));

		itemRate.remove(itemRate.get(index));

		System.out.println("Menu Delete Sucessfully");

	}

	void avgRating() {
		float avgRating = 0.0f;
		int count =0;
		for (float obj : itemRate) {
			count++;
			avgRating = (obj + avgRating)/count;
		}
		System.out.println("Menu item's Average rating : " + avgRating);

	}

	void showMenu() {
		System.out.println("Enter the Menu items name : " + menuItem);
		System.out.println("Enter the Menu items price : " + itemPrice);
		System.out.println("Enter the Menu items rating : " + itemRate);

	}

	public static void main(String[] args) {

		Restaurant menu = new Restaurant();
		
		menu.addMenu();
		do {
			System.out.println("\t-*-*-*-ADD/REMOVE REVIEW-*-*-*-");
			System.out.println(
					"ADD FOOD (press 1) / DELETE FOOD (press 2) / VIEW DETAILS (press 3)/ VIEW AVG RATINGS (press 4)");

			int input = sc.nextInt();

			if (input == 1) {

				menu.addMenu();
			} else if (input == 2) {
				menu.removeMenu();
			}

			else if (input == 3) {
				menu.showMenu();

			} else if (input == 4) {
				menu.avgRating();

			}

			else {
				System.out.println("Plz choose 1 to 4");
			}
			System.out.println("Do you want to repeat ?(press s)");
			choice = sc.next().charAt(0);
		}while(choice =='s');

	}

}

