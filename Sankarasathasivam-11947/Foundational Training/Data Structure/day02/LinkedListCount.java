package com.shiva.day02;

//Getting user i/p and counting the digit

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListCount {

	public static void main(String[] args) 
		{

		LinkedList<Integer> list = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		System.out.println("Enter the Elements ");

		for (int i = 1; i <= n; i++) // getting values manually
		{
			int num = sc.nextInt();
			list.add(num);
		}
		System.out.println("The user input " +list);

		// counting the digit in list
		LinkedList<Integer> digit = new LinkedList<Integer>();

		int count;
		for (int i = 0; i < n; i++) 
		{
			int temp = list.get(i);// storing the inputs in temp
			count = 0;

			while (temp!=0) 
			{
				temp = temp / 10;
				count++;
			}
			digit.add(count);
			System.out.println("Total no of digits in " + list.get(i) + ":" + count);
		
		}
		 System.out.println("the digit count in the list is "+digit);
	}
}
