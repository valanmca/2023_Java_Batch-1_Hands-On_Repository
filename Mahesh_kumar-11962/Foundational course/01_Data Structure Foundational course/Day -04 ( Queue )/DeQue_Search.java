package com.mahesh.ds_day4;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class DeQue_Search {

	public static void main(String[] args) {
		Deque<String>D_obj = new LinkedList<String>();
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your range");
		int range = sc.nextInt();
		System.out.println("Enter your element one by one : ");
		for (int i = 0; i < range; i++) {
			D_obj.offer(sc.next());
		}
		System.out.println("Deque : "+D_obj);
		System.out.println("Enter the search element: ");
		String search = sc.next();
		while(!D_obj.isEmpty())
		{
			if((D_obj.pollFirst()).equals(search))
			{
			flag =true;
			}
		}
		if(flag==true)
		{
			System.out.print("Search element is found");
		}
		else
		{
			System.out.print("Search element is not found");
		}
		

	}

}
