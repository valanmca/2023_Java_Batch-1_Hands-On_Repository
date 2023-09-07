package com.gayathri.day6;

import java.util.LinkedList;
import java.util.Scanner;

public class LinearSearchLinkedList {

	public static void main(String[] args) {
				LinkedList<String> list = new LinkedList<String>();


				Scanner sc = new Scanner(System.in);

				System.out.print("How many strings do you want in your list ? : ");
				int list_size = sc.nextInt();

				// inserting elements input from user
				System.out.println("Enter " + list_size + " elements : ");
				for (int i = 0; i < list_size; i++) {
					String s1 = sc.next();
					list.add(s1);
				}
				System.out.println("\n List strings are : " + list);
				
				System.out.println("\nEnter a string to be search : ");
				String search = sc.next();
				boolean isPresent = false;
				for(int i=0;i<list.size();i++)
				{
					if(search.equals(list.get(i))) {
						System.out.println("\nThe search string is present in index : "+i);
						isPresent = true;
						break;
					}
				}
				if(isPresent==false)
					System.out.println("\nThe search string is not present");
				sc.close();

			}

		}
