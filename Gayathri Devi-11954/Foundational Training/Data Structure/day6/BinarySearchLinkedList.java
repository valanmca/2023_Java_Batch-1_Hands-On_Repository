package com.gayathri.day6;

import java.util.LinkedList;
import java.util.Scanner;

public class BinarySearchLinkedList {

	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<Integer>();

		Scanner sc = new Scanner(System.in);

		System.out.print("How many numbers do you want in your list ? : ");
		int list_size = sc.nextInt();

		// inserting elements input from user
		System.out.println("Enter " + list_size + " elements : ");
		for (int i = 0; i < list_size; i++) {
			int num = sc.nextInt();
			list.add(num);
		}
		System.out.println("\n List elements are : " + list);

		System.out.print("\nEnter the element to search : ");
		
		int search = sc.nextInt();
		
		int first=0;
		int last = list.size()-1;
		int middle;
		boolean isPresent =false;
		while(first<=last){
			middle = (first+last)/2;
			if(search<list.get(middle))//go left
				{
					last = middle-1;
				}
			else if(search>list.get(middle))//go right
				{					
					first = middle+1;
				}	
			else if(list.get(middle)==search) {
				System.out.print("\nThe searching element found in the index of : "+middle);
				isPresent = true;
			break;}
			
			//middle = (first+last)/2;
		}
		if(isPresent == false) {
			System.out.print("\nThe searching element not found");
		}

	}

}
