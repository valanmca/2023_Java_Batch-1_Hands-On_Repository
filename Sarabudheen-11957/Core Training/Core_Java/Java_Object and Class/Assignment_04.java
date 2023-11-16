//Java Program to create Restaurant class with addMenu(),removeMenu() and ShowMenu() mehtods.
package com.sara.CoreJava.Day_04;

import java.util.ArrayList;
import java.util.Scanner;

class Restaurant {
	ArrayList<String> menuItem = new ArrayList<String>();
	ArrayList<Integer> itemPrice = new ArrayList<Integer>();
	ArrayList<Float> itemRate = new ArrayList<Float>();
	Scanner sc = new Scanner(System.in);
	String foodItem;
	int foodPrice;
	float foodRate;

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
		int count = 0;
		for (float obj : itemRate) {
			count++;
			avgRating = (obj + avgRating) / count;
		}
		System.out.println("Menu item's Average rating : " + avgRating);

	}

	void showMenu() {
		System.out.println("Enter the Menu items name : " + menuItem);
		System.out.println("Enter the Menu items price : " + itemPrice);
		System.out.println("Enter the Menu items rating : " + itemRate);

	}

}

public class Assignment_04 {

	public static void main(String[] args) {

		char choice;
		Scanner sc = new Scanner(System.in);
		Restaurant res = new Restaurant();
		res.addMenu();

		do {
			System.out.println("ADD/REMOVE FOOD");
			System.out.println(" 1.ADD FOOD\n 2.DELETE FOOD \n 3.VIEW DETAILS \n 4.VIEW AVG RATINGS");

			int input = sc.nextInt();

			if (input == 1) {

				res.addMenu();
			} else if (input == 2) {
				res.removeMenu();
			}

			else if (input == 3) {
				res.showMenu();

			} else if (input == 4) {
				res.avgRating();

			}

			else {
				System.out.println("Please choose 1 to 4");
			}
			System.out.println("Do you want to repeat ?(press s)");
			choice = sc.next().charAt(0);
		} while (choice == 's');
	}

}
