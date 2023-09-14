package com.gayathri.day2;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedlistOddEven {

	public static void main(String[] args) {
		LinkedList <Integer> list = new LinkedList <Integer> ();
		LinkedList <Integer> oddlist = new LinkedList <Integer> ();
		LinkedList <Integer> evenlist = new LinkedList <Integer> ();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nHow many numbers do you want in your list ? : ");
		int list_size =sc.nextInt();//list size

		//inserting elements input from user
		System.out.println("\nEnter " +list_size+ " elements : ");
		for(int i=0; i<list_size;i++)
		{
			int num = sc.nextInt();
			list.add(num);
		}
		
		System.out.println("\n List elements are : " +list);
		
		//find odd or even
				
		for(int i=0; i<list_size;i++)
		{
			if(list.get(i)%2==0)
			{
				evenlist.add(list.get(i));
			}
			else
			{
				oddlist.add(list.get(i));
			}			
}
		System.out.println("\n Odd List ...." +oddlist);
		System.out.println("\n Even List ...." +evenlist);
sc.close();
	}

}
