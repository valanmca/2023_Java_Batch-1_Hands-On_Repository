package com.pravinkumar.day2;
import java.util.LinkedList;
import java.util.Scanner;
public class LinkedList_Exs_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <Integer> list = new LinkedList <Integer>();
		
		//For Input get from the user
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Lists:");
		int listSize = sc.nextInt();
		for(int i=0;i<listSize;i++)
		{
			int temp = sc.nextInt();
			list.add(temp);
		}
		System.out.println("The List is: " + list);
		for(int i=0;i<listSize;i++)
		{
			int num=list.get(i);
			int count=0;
			while(num != 0)
			{
				num /= 10;
				count++;
			}
		System.out.println("Total No of digits in " + list.get(i) + ":" + count);
		}
	}
}
