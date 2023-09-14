package com.jeban.day4;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Deque;
import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.*;

public class polindromeQueue {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("Enter the size:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter the value:");
		for (int i = 0; i < n; i++) {
			int val1=sc.nextInt();
			list.add(val1);

		}
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		
		System.out.println("Enter the list:" +list);
		for(int i=n-1;i>=0;i--)
		{
			int val=list.get(i);
			list1.add(val);
		}
		System.out.println("reversed :" +list1);
		
		
		
		int temp=0;
		if(list.isEmpty()==true)
		{
			System.out.println("palindrome");	
		}
		else
		{
		
		for(int i=0;i<n;i++)
		{
			temp=0;
			int list1val=list.get(i);
			int list2val=list1.get(i);
			if(list1val==list2val)
			{
				temp=1;
			}
			else
			{
				temp=0;
				break;
			}
		}
		if(temp==1)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not an palindrome");
		}
		
		}
		
		
		
		
	
		
		
		
		
		

	}

}
