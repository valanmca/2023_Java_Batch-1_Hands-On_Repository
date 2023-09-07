package com.gayathri.day2;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedlistExercise1 {

	public static void main(String[] args) {
		LinkedList <Integer> list = new LinkedList <Integer> ();
		LinkedList <Integer> anslist = new LinkedList <Integer> ();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many numbers do you want in your list ? : ");
		int list_size =sc.nextInt();

		//inserting elements input from user
		System.out.println("Enter " +list_size+ " elements : ");
		for(int i=0; i<list_size;i++)
		{
			int num = sc.nextInt();
			list.add(num);
		}
		System.out.println("\n List elements are : " +list);
//		//Traverse the list
//		System.out.println("List elements are : ");
//		for(int i=0; i<list_size;i++)
//		{
//			System.out.println(list.get(i));
//		}
		//multiple input from user
		System.out.print("\nWhich number do you want to perform multiplication ? : ");
		int multi_number = sc.nextInt();
		int ans;
		for(int i=0; i<list_size;i++)
		{
			ans = list.get(i) * multi_number;
			//exercise2
			System.out.println(+list.get(i)+" * "+ multi_number+ " = " +ans);
			anslist.add(ans);
			
		}
		System.out.println("\n Answerlist....");
		System.out.println(anslist);
sc.close();
	}

}
