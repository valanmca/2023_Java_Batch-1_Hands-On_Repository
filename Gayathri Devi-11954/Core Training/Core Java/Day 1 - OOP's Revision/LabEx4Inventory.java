package com.gayathri.day1;

import java.util.Scanner;
import java.util.TreeMap;

/*
 * 4. Write a Java program to create a class called "Inventory" with a collection of products and 
 * methods to add and remove products, and to check for low inventory.

 */
class Inventory {
	Scanner sc = new Scanner(System.in);

	TreeMap<String, Integer> productList = new TreeMap<String, Integer>();

	String pName,rPName;
	int pQuantity,rPQuantity;

	public void addDetails() {
		System.out.println("Enter the product name : ");
		pName = sc.nextLine();
		System.out.println("Enter the product quantity : ");
		pQuantity = sc.nextInt();
		
		productList.put(pName, pQuantity);
	}

	public void display() {
		System.out.println(productList);
	}

	public void removeDetails() {
		System.out.println("\nEnter product name to be remove : ");
		rPName = sc.nextLine();
		for (int i = 0; i < productList.size(); i++) {
			rPName.equals(productList.get(i));
		}
		productList.remove(rPName);
		
	}

	public void check() {
		if(pQuantity<100) 
			System.out.println("Running Low");
		else
			System.out.println("Running Fast");
	}

}

public class LabEx4Inventory {

	public static void main(String[] args) {
		Inventory obj = new Inventory();
		Scanner sc = new Scanner(System.in);
		char s;
		int option;
		
		do {

			System.out.println("\n 1. Add Product details" + "\n 2. Remove Product details" + "\n 3. Display"
					+ "\n 4. Check Low Inventory");
			System.out.print("\nSelect any one option : ");
			option = sc.nextInt();
			switch (option) {
			case 1:
				obj.addDetails();
				break;
			case 2:
				obj.removeDetails();
				break;
			case 3:
				obj.display();
				break;
			case 4:
				obj.check();
				break;
			}

			System.out.print("\n Do you want to continue? (Press s or S) : ");
			s = sc.next().charAt(0);
		} while (s == 's' || s == 'S');
	}
}
