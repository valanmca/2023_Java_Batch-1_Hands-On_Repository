package com.naveen.day5;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeEx07 {

	public static void main(String[] args) {
		// TODO Using the list you want to print no. of digits in Key Value pairs.

		ArrayList<Integer> list01 = new ArrayList<Integer>(); //Input List from User
		ArrayList<Integer> list02 = new ArrayList<Integer>(); //Counted Digit List
		
		//Tree map where we storing the values of both the list.
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();

		Scanner sc = new Scanner(System.in); //For Getting input from user.

		System.out.println("Enter the Size of the Array :"); 
		int range = sc.nextInt();

		System.out.println("Enter The List Values :"); 
		for (int i = 0; i < range; i++) { 
			int num = sc.nextInt();  //Using this for loop we adding the user input elements to the input list.
			list01.add(num);
		}

		System.out.println("The List are: " + list01); //Displaying the input list.

		for (int i = 0; i < range; i++) {
			int count = 0;
			int n = list01.get(i); //Logic for Counting the number of digits.
			while (n > 0) {
				n = n / 10;
				count++;
			}
			list02.add(count);
		}

		System.out.println("The Counted Digits List:" + list02); //Displaying the counted digit list.

		for (int i = 0; i < range; i++) {
			map.put(list01.get(i), list02.get(i));  //Using this for loop we inserting the input to tree map. 
		}
		System.out.println("The TreeMap is :" + map);

		sc.close();
	}

}
